## 이것이 취업을 위한 코딩테스트다  
[ 나동빈 저 ] " 이것이 취업을 위한 코딩테스트다 with 파이썬 "  자바 코드 저장  

***  

### Part2  
#### Chapter 3. 그리디  

    * 현재 상황에서 지금 당장 좋은 것만 선택하는 알고리즘  
    * 기준에 따라 좋은 것을 선택하는 문제  
     -> 문제에서 '가장 큰 순서대로', '가장 작은 순서대로' 라는 기준을 말해줄 때가 많다.  
    
* 거스름돈 문제 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_1.java)   

      * 그리디 문제로 풀 수 있는 이유  
        - 가장 큰 단위가 항상 작은 단위의 배수이기 때문.   
          - 예를 들어, 동전이 500원과 400원이라면 둘은 배수 관계가 아니기 때문에 그리디를 적용할 수 없다.  
          - 500원은, 100원, 50원, 10원의 배수 관계이기 때문에 그리디가 최선의 방법이 될 수 있다.  
          
      * 방법 : '가장 큰 화폐 단위부터' 돈을 거슬러 주는 것   
      
* **동빈이의 큰 수의 법칙** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_2.java)  

      * 방법 : 반복되는 수열에 대해서 파악해야 한다.  
      
* **숫자 카드게임** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_3.java)  
     
      * 방법 : 각 행마다 가장 작은 수를 찾은 뒤에 그 수 중에서 가장 큰 수를 찾기  
      
      
* **1이 될 때까지** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch3/ch3_4.java)  

      * 방법 : 최대한 많이 나누기  
        -> 나누는 것이 1을 빼는 것보다 숫자를 훨씬 많이 줄일 수 있기 때문

#### Chapter 4. 구현  

    * 구현 : 머릿속에 있는 알고리즘을 소스코드로 바꾸는 과정  
    * 구현 문제 : 풀이를 떠올리는 것은 쉽지만 소스코드로 옮기기 어려운 문제  

* 상하좌우 :  [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch4/ch4_1.java)  

      * 시뮬레이션 유형으로 분류됨  
      * 문자열 한 줄을 가져오기 위해서 버퍼 비우기 필수 !!  
        -> nextLine()은 남은 것을 다 문자열로 가져오기 때문에, 
           앞서 nextInt()로 값을 받고 엔터를 치는 순간 빈 공간을 입력받은 것이 되기 때문이다.  
        -> keyboard.nextLine();  
      * 방법 : 상하좌우를 switch-case문을 통해 저장해놓고, 적용해보기   
        
* 시각 :  [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch4/ch4_2.java)  

      * 모든 경우는 86,400가지이다.   
      * 계산이 금방 되기 때문에, 모든 경우를 하나씩 세서 풀 수 있다.  
      * 완전 탐색(Brute Forcing) 문제 유형이라고 한다.  
      * 방법 : 00시 00분 00초 부터 N시 59분 59초까지 모든 경우를 돌면서 3이 있는지 체크  
      
* **왕실의 나이트** :  [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch4/ch4_3.java)  

      * 2차원 배열이 등장하는 전형적인 구현 문제  
      * 방법 : 나이트가 움직일 수 있는 방향들은 2차원 배열에 저장해놓고, 주어진 위치에서 하나씩 움직여보는 것.  
        -> 움직였을 때 판을 벗어나지 않으면 count+1  
      
      
* **게임 개발** :  [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch4/ch4_4.java)  

      * 전형적인 시뮬레이션 문제
      * 삼성전자 공채 코딩 테스트에서 자주 출제되는 대표적인 유형
      * dx,dy와 같이 별도의 방향 리스트를 만드는 것이 효과적이다.

#### Chapter 5. DFS / BFS `그래프 탐색 알고리즘`  
  ```  
  # 스택 자료구조  
   -> 선입후출 ( 입구와 출구가 동일한 형태 ex.프링글스 과자 통 )  
   -> 자바에서  
       - Stack<Integer> s = new Stack<>();  
       - 삽입 : push  
       - 삭제 : pop  
  ```       
  ```       
  # 큐 자료구조  
   -> 선입선출 ( 입구와 출구가 모두 뚫려있는 형태 ex.터널, 대기표 )  
   -> 자바에서 
       - Queue<Integer> s = new LinkedList<>();  
       - 삽입 : offer  
       - 추출(삭제)&출력 : poll  
  ```       
  ```      
  # 재귀 함수(Recursive Function)  
   -> 자기 자신을 호출하는 함수  
   -> 재귀 함수의 종료 조건을 반드시 명시해야 한다.  
   -> 예 : 팩토리얼 문제, 유클리드 호제법(최대공약수 계산) 문제  
  ```   
  ```   
  # DFS ( 깊이 우선 탐색 )  
   -> 깊은 부분을 우선적으로 탐색하는 알고리즘  
   -> 스택 자료구조(or 재귀함수)를 이용 
     1. 탐색 시작 노드를 스택에 삽입하고 방문 처리를 한다.  
     2. 스택의 최상단 노드(제일 최근에 들어온 노드)에 방문하지 않은 인접 노드가 하나라도 있으면, 
        그 노드를 스택에 넣고 방문 처리를 한다.  
        방문하지 않은 인접노드가 없으면 스택에서 최상단 노드를 꺼낸다(스택에서 삭제).  
     3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다.   
  ```  
  ``` 
  # BFS ( 너비 우선 탐색 )  
   -> 가까운 노드부터 탐색하는 알고리즘  
   -> 큐 자료구조 이용  
     1. 탐색 시작 노드를 큐에 삽입하고 방문 처리를 한다.  
     2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 
        모두 큐에 삽입하고 방문 처리를 한다.  
     3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다.  
  ```  

 * DFS 기본 구현 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch5/ch5_1.java)  
 
 * BFS 기본 구현 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch5/ch5_2.java)  
 
 * **음료수 얼려 먹기** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch5/ch5_3.java)  
       
        * 칸막이가 있는 칸 1은 카운트하지 않는다.  
        * 방문 가능한 0은 방문하고, 연결된 노드를 계속 탐색하며 더이상 0으로 연결될 수 없을 때까지 탐색하며 1로 바꾼다.  
        * 더 이상 연결할 수 없다면, count를 1 증가시킨다.  
          -> 1로 둘러싸인 0을 이어줄 수 있고, 칸막이와 이미 센 얼음칸은 제외할 수 있다.  
 
 * **미로탈출** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch5/ch5_4.java)  
 
        * 노드의 위치를 저장해 줄 (x,y)형태인 Node 만들기  
        * Queue LinkedList를 사용해서 큐 형태 구현  
        * graph[][] 이차원 배열을 만들어서 미로 형태 받아오기  
        * 왼쪽 상단 노드부터 출발해서 상,하,좌,우를 확인하고  
          1이면 queue에 추가한 뒤 현재 값에서 +1시켜주기 ( 상,하,좌,우를 확인하는 기준 값, 가운데 값! )  
        * bfs 함수 실행이 끝나면, graph[][]에 저장된 마지막 노드 값 return  
        
 
 #### chapter 6. 정렬  
  정렬 : 데이터를 특정한 기준에 따라 순서대로 나열하는 것  
  
   #### 선택 정렬  
   
         -> 처리되지 않은 데이터 중에서 '가장 작은 데이터'를 선택해 맨 앞과 바꾸는 것을 반복    
         -> ex. 7 5 9 0 3  
                0 | 5 9 7 3  
                0 3 | 9 7 5  
                0 3 5 | 7 9  
                정렬 끝  
          -> 이중 반복문을 활용하여 처리 
          -> 시간 복잡도 : O(N^2)  
             -> 가장 작은 수를 찾아서 N번만큼 맨 앞으로 보내야 함  
             -> N + (N - 1) + (N - 2 ) + ... + 2  
          
   #### 삽입 정렬  
      
          -> 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입  
          -> ex. 7 5 9 0 3  (7은 정렬이 되었다고 가정. 5부터 위치 판단 시작)  
                 5 7 9 0 3  (5가 7의 왼쪽으로)  
                 5 7 9 0 3  (9가 7의 오른쪽으로)  
                 0 5 7 9 3  (0이 5의 왼쪽으로)  
                 0 3 5 7 9  (3이 0의 오른쪽으로)  
          -> 이중 반복문 활용하여 처리  
          -> 시간 복잡도 : O(N^2)  
          -> 현재 리스트의 데이터가 거의 정렬되어 있는 상태라면 매우 빠르게 동작 (최선 : O(N))
          
   #### 퀵 정렬  
    
          -> 기준 데이터를 설정하고, 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법  
          -> 기본 : 첫 번째 데이터를 기준 데이터(Pivot)로 설정  
             -> 왼쪽에서부터 pivot보다 큰 값, 오른쪽부터 pivot보다 작은 값을 고른다.  
             -> 이때 큰 값과 작은 값이 교차되는 순간, 작은 값과 pivot을 바꾼다.  
             -> 바꾼 후 pivot 위치는 고정이 된다.  
          -> ex. 7 5 9 0 3 (pivot : 7)  
                 7 5 3 0 9 (pivot : 7)  
                 0 5 3 | 7 | 9 (교차 -> 7 고정, 새로운 pivot : 0)  
                 0 | 3 5 | 7 | 9 (교차 -> 0 고정, 새로운 pivot : 3)    
                 0 | 3 | 5 | 7 | 9 (교차 -> 3 고정 )  
          -> 시간 복잡도   
            -> 평균 : O(NlogN)  
            -> 최악 : O(N^2)  
            
   #### 계수 정렬  
   
         -> 데이터의 크기 범위가 정수 형태로 표현 될 수 있을 때만 사용 가능  
         -> 매우 빠르게 동작함  
           -> 개수를 count하는 리스트를 따로 만든다.
           -> 정렬 할 리스트에서 왼쪽부터 해당하는 값의 count list의 값을 1씩 증가시킨다.  
           -> 그 후 count list의 인덱스 0에 해당하는 값부터 해당 값만큼 인덱스 번호를 출력한다.  
         -> 동일한 값을 가지는 데이터가 여러 개 등장할 때 효과적 ( 성적을 나열할 때 )  
         -> 시간 복잡도 : O(N + K)  
         
   #### 정렬 알고리즘 비교하기  
   
   | 정렬 알고리즘 | 시간 복잡도 | 공간 복잡도 | 특징 |  
   |:---------------:|:------------:|:-------------:|:------|     
   | 선택 정렬| O(N^2) | O(N) | 아이디어가 매우 간단합니다. |    
   | 삽입 정렬| O(N^2) | O(N) | 데이터가 거의정렬되어 있을 때는 가장 빠릅니다. |   
   | 퀵 정렬| O(NlogN) | O(N) | 대부분의 경우에 가장 적합하며, 충분히 빠릅니다.|    
   | 계수 정렬| O(N + K) | O(N + K) | 데이터의 크기가 한정되어 있는 경우에만 사용이 가능하지만 매우 빠르게 동작합니다. |   
   
   * **위에서 아래로** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch6/ch6_5.java)  
   
            * LinkedHashMap 사용하면 됨  
   
   * **성적이 낮은 순서대로 학생 출력하기** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch6/ch6_6.java)  
   
   
   
   * **두 배열의 원소 교체** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch6/ch6_7.java)  
        
         * 배열 a의 가장 작은 수와 배열 b의 가장 큰 수를 교체하면 된다.  
         * 단, a의 최소값이 b의 최대값보다 작을 때만 진행되며, 그렇지 않은 경우에는 교체를 중단한다.  
     
          
  #### chapter 7. 이진탐색  
   
      # 순차 탐색 : 리스트 안에 있는 특정한 데이터를 찾기 위해 '앞에서부터' 데이터를 하나씩 확인하는 방법  
      
      # 이진 탐색 : 정렬되어 있는 리스트에서 탐색 범위를 '절반씩 좁혀가며' 데이터를 탐색하는 방법  
        -> 시작점, 끝점, 중간점을 이용하여 탐색 범위 설정  
        -> ex. 0 2 4 6 8 10 12 14 16 18 에서 4 search  (원래 index사용하지만 이해 편하게 값으로 필기)
               [1] 시작점 0 / 중간점 8 / 끝점 18 
                   -> 4가 0보다 크고 8보다 작으니까 8 이후는 탐색 x  
               [2] 시작점 0 / 중간점 2 / 끝점 6  
                   -> 4가 2보다 크니까 2이하는 탐색 x  
               [3] 시작점 4 / 끝점 6  
                   -> search 성공  
        -> 연산 횟수 : 'log2에N'에 비례  
        -> 시간 복잡도 : O(logN)  
        -> 앵간하면 외우고 있는 것이 유리하다.   
        
      # 파라메트릭 서치 ( Parametric Search )  
        -> 최적화 문제를 결정 문제로 바꾸어 해결하는 기법  
           ex. 특정한 조건을 만족하는 가장 알맞은 값을 빠르게 찾는 최적화 문제  
        -> 일반적으로 코딩테스트에서 파라메트릭 서치 문제는 '이진탐색'을 이용하여 해결할 수 있다.  
        
      # 트리 자료구조  
        -> 트리는 부모 노드와 자식 노드의 관계로 표현된다.  
        -> 트리의 최상단 노드 : 루트노드  
        -> 트리의 최하단 노드 : 단말노드  
        -> 트리에서 일부를 떼어내도 트리구조이며, 서브 트리라 한다.  
        -> 트리는 파일 시스템과 같이 계층적이고 정렬된 데이터를 다루기에 적합하다.  
        
      # 이진 탐색 트리 : 트리 중 가장 간단한 형태  
        -> 왼쪽 자식 노드 < 부모 노드  
        -> 오른쪽 자식 노드 > 부모 노드  
        
        
   * 순차 탐색 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_1_sequential.java)  
   
   * 재귀로 구현한 이진탐색 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_2_binary.java)  
   
   * 반복문으로 구현한 이진탐색 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_3_binary2.java)  
   
   * **부품 찾기** 
       * 이진 탐색 이용 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_4_findParts.java)  
       * 계수 정렬 이용 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_4_findParts2.java)  
   
   * **떡볶이 떡 만들기** 
       * 이진탐색X ver. : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_5_make.java)  
       * 이진탐색 ver. : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch7/ch7_5_make2.java)  
        
             * 전형적인 이진탐색 문제이자, 파라메트릭 서치 유형의 문제.  
             
             * 나는 이진탐색으로 하지 않고, 주어진 떡 길이 중 최대값을 사용해서 최대값부터 0까지 계산해보도록 했다.  
             -> 주어진 예시의 경우, 숫자 범위가 작아서 시간초과가 나지 않지만, 수가 커진다면 시간 초과가 날 수 있다.  
          
             * 이진탐색을 통해서 숫자 범위를 절반씩 줄여나가는 것이 더욱 효과적일 것이다. (예시 답안 코드)  
             
 #### chapter 8. 다이나믹 프로그래밍  
 
     # 메모리를 적절히 사용하여 수행 시간을 효율성을 비약적으로 향상시키는 방법  
     # 이미 계산된 결과(작은 문제)는 별도의 메모리에 저장 -> 다시 계산 안하게  
     # 일반적으로 탑다운, 보텀업 으로 구성  
     # 이때 '다이나믹'은 자료구조의 '다이나믹'과 의미가 다름 (자료구조 : 실행 도중 공간 할당 / 알고리즘 : 별 의미 없음)  
     # 조건  
       1. 최적 부분 구조 (Optimal Substructure)  
         : 큰 문제를 작은 문제로 나눌 수 있으며 작은 문제의 답을 모아서 큰 문제 해결 가능  
       2. 중복되는 부분 문제(Overlapping Subproblem)  
         : 동일한 작은 문제를 반복적으로 해결할 때  
     # 대표적인 다이나믹 프로그래밍 문제 : 피보나치 수열  
       -> 일반적인 재귀함수로 구현할 때, 한 번 계산했던 값을 계속 계산해야 하는 경우가 생길 수도 있어서 시간이 오래걸린다.  
       -> 메모제이션 기법을 사용해서 해결할 수 있다.  
          : 메모제이션 구현 - 한 번 구한 정보를 리스트에 저장.  
     # Bottom-up 방식 (주로 사용)  
       -> 결과 저장용 리스트 : DP 테이블  
     # Top-down 방식  
       -> 이전에 계산된 결과를 일시적으로 기록해 놓는 개념인 '메모제이션' 사용  
     # 다이나믹 프로그래밍 문제에 접근하는 방법  
       -> 먼저 그리디. 구현, 완전 탐색 등의 아이디어로 문제를 해결할 수 있는 지 검토  
     
   * 비효율적인 피보나치 수열 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch8/ch8_1_Fibo.java) - 시간 복잡도 : O(2^N)   
   
   * Top-down 피보나치 수열 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch8/ch8_2_Fibo2.java) - 시간 복잡도 : O(N)  
   
   * Bottom-up 피보나치 수열 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch8/ch8_2_Fibo3.java) - 시간 복잡도 : O(N)   
   
   * **1로 만들기** : [Java 코드]()  
   
   * **개미 전사** : [Java 코드]()  
   
   * **바닥 공사** : [Java 코드]()  
   
   * **효율적인 화폐 구성** : [Java 코드]()  
   
 #### chapter 9 최단 경로  
 
      # 최단 경로 알고리즘 : 가장 짧은 경로를 찾는 알고리즘  
      # 각 지점은 노드로, 연결된 도로는 간선으로 표현  
      # 다익스트라 최단 경로 알고리즘  
        -> 음의 간선이 없을 때 동작 ( 현실세계에는 음의 도로가 없음 )  
        -> 그리디 알고리즘으로 분류됨  ( 매 상황에서 가장 비용이 적은 노드를 선택해 임의의 과정을 반복함 )  
        -> 특정 노드에서 출발하여 다른 노드로 가는 각각의 최단 경로를 구해주는 알고리즘  
        -> 동작 과정  
           1. 출발 노드 설정  
           2. 최단 거리 테이블을 초기화 ( 초기에는 무한으로, 자기 자신은 0으로 )  
           3. 방문하지 않은 노드 중, 최단 거리가 가장 짧은 노드를 선택  
           4. 해당 노드를 거쳐 다른 노드로 가는 비용을 계산하여 최단 거리 테이블 갱신  
           5. 3,4번 반복  
   
       # 플로이드 워셜 알고리즘  
         -> 단계별로 거쳐가는 노드를 기준으로 알고리즘 수행  
         -> 2차원 테이블에 최단 거리 정보 저장  
         -> 다이나믹 프로그래밍 유형에 속함  
         -> k노드를 거쳐서 가는 경우를 고려하여 더 작은 값으로 갱신  
         
  * 간단한 다익스트라 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch9/ch9_1_dijkstra.java)  
  
  * 개선된 다익스트라 (우선순위 큐) : [Java 코드](https://github.com/ndb796/python-for-coding-test/blob/master/9/2.java)  -> 나는 구현 못함 ㅠㅠ  
  
  * 플로이드 워셜 : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch9/ch9_2_floydWarshall.java)  
  
  * **미래 도시** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch9/ch9_3_city.java)  
  
        * floyd-warshall 사용해서 도시들 간의 거리를 구한 후 2차원 배열에 저장  
          -> 1부터 k까지, k부터 x까지의 최단거리를 구한 값이 결과값  
  
  * **전보** : [Java 코드](https://github.com/yougi8/coding-test/blob/master/ch9/ch9_4_message.java)  
  
        * 일단 나는 앞의 문제와 동일하게 floyd-warshall 방식을 사용했다.  
        * 답지를 보니 우선순위 큐를 사용하는 다익스트라 알고리즘을 사용했더라..  
        
 #### chapter 10. 기타 그래프 이론  
 
        # 앞에서 배운 그래프 구현 방법 복습  
          1. 인접 행렬 
             -> 2차원 배열을 사용하는 방식  
             -> O(V^2)만큼의 메모리공간 필요 ( V는 노드의 개수 )  
             -> O(1)의 시간으로 간선비용 즉시 파악 가능  
             -> floyd-warshall (노드의 개수가 적을 때 주로 사용)  
          2. 인접 리스트  
             -> 리스트를 사용하는 방식  
             -> O(E)만큼의 메모리공간 필요 (E는 간선의 개수)  
             -> O(V)만큼의 시간으로 간선비용 파악  
             -> dijkstra ( 노드와 간선의 개수가 모두 많으면 우선순위 큐를 사용하는 다익스트라가 유리 ) 
             
        # 서로소 집합 자료구조 ( union-find 자료구조 )  
          -> 동작 과정  
             1. union(합집합) 연산을 확인하여, 서로 연결된 두 노드 A,B를 확인한다.  
               1) A와 B의 루트 노드 A', B'를 각각 찾는다.  
               2) A'를 B'의 부모 노드로 설정한다. (일반적으로 A'가 더 작다고 가정)  
             2. 모든 union 연산을 처리할 때까지 1번 과정을 반복한다. 
          -> 루트 노드에 즉시 접근 불가능  
             : 루트 노드를 찾기 위해 부모 테이블을 계속해서 확인하며 거슬러 올라가야하기 때문이다.  
          -> 간단하게 구현했을 경우, 자신의 부모 테이블에 있는 부모로 루트 노드를 찾아야하기 때문에 좀 비효율적이다.
          -> 무방향 그래프 내에서 사이클을 판별할 때 사용할 수 있음  
             : 매 간선에 대하여 루트노드가 다르다면 union해주고, 루트노드가 같다면 사이클 발생  
             
  * 서로소 집합  
      * 간단한 서로소 집합 알고리즘 : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch10/ch10_1_unionFind.java)  
      * 개선된 서로소 집합 알고리즘 (경로 압축) : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch10/ch10_1_unionFind2.java)  
      * 서로소 집합 활용 사이클 판별 : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch10/ch10_1_unionFind3.java)  
      
  * 크루스칼 알고리즘 : [Java 코드]()  
  
  * 위상 정렬 : [Java 코드]()  
  
  * **팀 결성** : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch10/ch10_3_team.java)  
  
  * **도시 분할 계획** : [Java 코드]()  
  
  * **커리큘럼** : [Java 코드]()  
  
  ***  
  
  ### Part 3 - 실전 문제  
  #### chapter 11. 그리디 문제  
  
  * Q 01. 모험가 길드 : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch11-%EA%B7%B8%EB%A6%AC%EB%94%94%20%EC%8B%A4%EC%A0%84/q1_adventurer.java) / [모범 답안](https://github.com/ndb796/python-for-coding-test/blob/master/11/1.java)  
  * Q 02. 곱하기 혹은 더하기 : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch11-%EA%B7%B8%EB%A6%AC%EB%94%94%20%EC%8B%A4%EC%A0%84/q2_calculate.java) / [모범 답안](https://github.com/ndb796/python-for-coding-test/blob/master/11/2.java)  
  * Q 03. 문자열 뒤집기 : [Java 코드](https://github.com/yougi8/coding-test-java/blob/master/ch11-%EA%B7%B8%EB%A6%AC%EB%94%94%20%EC%8B%A4%EC%A0%84/q3_flip.java) / [모범 답안](https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java)   
  
      
           
          
