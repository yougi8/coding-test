## 이것이 취업을 위한 코딩테스트다  
[ 나동빈 저 ] " 이것이 취업을 위한 코딩테스트다 with 파이썬 "  자바 코드 저장  

***  

### Part2  
#### Chapter 3 - 그리디  

    * 현재 상황에서 지금 당장 좋은 것만 고르는 방법  
    
* 거스름돈 문제 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_1.java)   

      * 그리디 문제로 풀 수 있는 이유  
        - 동전이 배수 형태를 가지기 때문.  
          - 예를 들어, 동전이 500원과 400원이라면 둘은 배수 관계가 아니기 때문에 그리디를 적용할 수 없다.  
          - 500원, 100원, 50원, 10원 은 서로 배수 관계이기 때문에 그리디가 최선의 방법이 될 수 있다.  
          
      * 방법 : '가장 큰 화폐 단위부터' 돈을 거슬러 주는 것   
      
* 동빈이의 큰 수의 법칙 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_2.java)  

      * 방법 : 반복되는 수열에 대해서 파악해야 한다.  
      
* 숫자 카드게임 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_3.java)  
* 1이 될 때까지 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_4.java)  

#### Chapter 4 - 구현  

    * 구현 : 머릿속에 있는 알고리즘을 소스코드로 바꾸는 과정  
    * 구현 문제 : 풀이를 떠올리는 것은 쉽지만 소스코드로 옮기기 어려운 문제  

* 상하좌우 :  

      * 시뮬레이션 유형으로 분류됨  
      * 문자열 한 줄을 가져오기 위해서 버퍼 비우기 필수 !!  
        -> nextLine()은 남은 것을 다 문자열로 가져오기 때문에, 
           앞서 nextInt()로 값을 받고 엔터를 치는 순간 빈 공간을 입력받은 것이 되기 때문이다.  
        -> keyboard.nextLine();  
        
* 시각 :  
* 왕실의 나이트 :  
* 게임 개발 :  

