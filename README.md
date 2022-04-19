# codeReview

- Do you think it’s better if A.
- Please explain why B.
- This seems to be C and not B.
- I would suggest E.
- Do you remember F.
- I think you forgot G
- This method is confusing me a little bit. Is there a better name that we can find for this variable?

I find that distributing reviews around to different members of the team yields healthier team dynamics and better code. One of the most powerful phrases a junior engineer has in a code review is, “I find this confusing.” These are opportunities to make the code clearer and simpler.

# Examples

## Inconsistent naming 命名不一致

```
class MyClass{
  private int countTotalPageVisits; //R: name variables consistently
  private int uniqueUserCount
}
```

## Inconsistent method signatures 方法返回类型不一致
```
interface MyInterface {
  /** Returns {@link Optional#empty} if s cannot be extracted. */
  public Optional<String> extractString(String s);
  /** Returns null if {@code s} cannot be rewritten. */
  //R: should harmonize return values: use Optional<> here, too
  public String rewriteString(String s);
}
```
## Library use 库使用
```
//R: remove and replace by Guava's MapJoiner
String joinAndConcatenate(Map<String, String> map, String keyValueSeparator, String keySeparator);
```
## Personal taste 个人品味 (nit:)
```
int dayCount; //R: nit: I usually prefer numFoo over fooCount; up to you, but we should keep it consistent in this project
```
## Bugs
```
//R: This performs numIterations+1 iterations, is that intentional?
//   If it is, consider changing the numIterations semantics?
for (int i = 0; i <= numIterations; ++i) {
  ...
}
```
## Architectural concerns 架构问题
```
otherService.call(); //R: I think we should avoid the dependency on OtherService. Can we discuss this in person?
```


