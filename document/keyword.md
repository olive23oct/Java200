# 예약어

|관련 용도|예약어(키워드)|
|----|---|
|기본타입|boolean, true, false, byte, short, int, long, float, double, char|
|제어문 관련|break, continue, case, default, do, else, switch, while, for, if|
|Modifier(제한자)|접근 제한자 private, protected, public|	
||클래스, 메서드, 멤버 final, abstract, static |
||클래스 관련 interface|
||기타 synchronized, transient, volatile, native, strictfp|
|클래스 관련|class, new, super, this, instanceof|
|예외 관련|try, catch, finally, throw, throws|
|메서드 관련|return, void|
|디버그 관련|assert|
|상속/구현 관련|extends, implements|
|패키지 관련|package, import|
|기타|const, goto, enum|		
	
- Modifier 규칙
	1. 클래스 관련 제한자 예약어인 interface는 abstract class를 대신한 것이므로 class와 같이 사용할 수 없다. abstract는 클래스와 메서드에만 사용할 수 있으며, final(abstract와 반대의미)이나 static과 함께 사용할 수 없다.
	2. static은 클래스에 붙일 수 없으나 final은 클래스, 메서드, 변수에 모두 사용할 수 있다.
	3. 제한자의 사용 규칙을 지킬 경우 제한자와 접근 제한자의 순서는 제한이 없다.
	
	|규칙|제한자|
	|---|---|
	|함께 사용할 수 없는 것|final/abstract, abstract/static|
	|클래스에 사용할 수 없는 것|static(단, 중첩 클래스에는 사용 가능|
	|클래스, 메서드, 변수에 모두 사용 가능한 것|final|
	|클래스, 메서드에만 가능한 것|abstract|
	