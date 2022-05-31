# <strong> <박물관 소장품 CRUD API> </strong>

  
## 조원

🤷‍♂️이세운<br>
🤦‍♀️이수민<br>
🙋‍♀️명지안<br>
🙅‍♂️원종혁<br>
  
  
## 기술스택 🔨
- Eclipse IDE<br>
- Spring Web MVC 5.3.14<br>
- jackson-databind 2.12.3<br>
- hibernate-entitymanage 5.4.18<br>
  

## 프로젝트 목표 📌
 1. JPA - DB 테이블 구성, 데이터 저장, 반환 (hibernate)
 2. RestAPI 데이터에 대한 요청, 응답 처리 (postman)
 3. Spring DI/IoC, 결합도와 응집도의 개념과 명령어들의 사용방법과 의미 

## 프로젝트 구상 🛠
 1. 생성할 데이터 구상하기, 모델 생성 <br>
   박물관 관련 (고유 id, 명칭, 전시된 층수, 시대, 개수 등) <br>
 2. hibernate를 통해 데이터 생성, 저장 및 반환 (key값 설정, null값 설정, 관계 설정) <br>
  
 3. spring 컨트롤러 생성을 통해 CRUD 기능 구현 <br>
  
 4. postman에 url로 연동 후 요청 및 응답 처리 <br>

 5. 문서로 추출하기! <br>
  
  
## 기능구현 🔧
- CREATE : 소장품 현황을 추가하는 기능<br>
- DELETE : 소장품의 정보를 ID를 통해 삭제하는 기능<br>
![delete캡처](https://user-images.githubusercontent.com/92356170/171060162-c726ccad-5fba-41c6-a31f-fedd400c1f9b.PNG)
- UPDATE : 소장품의 column인 이름,상태,시대정보,보관장소를 업데이트하는 기능<br>
![update전캡처](https://user-images.githubusercontent.com/92356170/171059851-30af0cae-704b-45e5-950e-b024e8eb77c4.PNG)
![update후캡처](https://user-images.githubusercontent.com/92356170/171059854-aabe77b2-79d8-4ae3-8d9a-300b170b3c9b.PNG)
  
 추가할 기능
  - 소장품 전체를 조회하는 기능
  - 같은 조건을 가진 특정 소장품을 조회하는 기능 (같은 시대, 같은 층수에 전시, 상태 등)
  


## Trouble Shooting ✏
<h2>issue#1</h2>
  
![123](https://user-images.githubusercontent.com/103519499/171065481-db47e82e-40ec-4226-9180-8d9e62cae23f.PNG)
![image (8)](https://user-images.githubusercontent.com/92356170/171056286-06b12748-33d1-4060-9b3b-44397e46f89a.png)
Required request parameter 'Name' for method parameter type String is not present<br>
으로 포스트맨이 Name을 인식하지 못하는 에러가 발생했다<br>
Name값을 명확하게 명시해주니 해결됨<br>

<h2>issue#2</h2>
  
![화면 캡처 2022-05-31 051934](https://user-images.githubusercontent.com/92356170/171056083-4c9817b5-4dbd-437b-9067-db44cbe74a5c.png)<br>
Server Tomcat v9.0 / v8.5 Server at localhost failed to start<br>
1. 이클립스 재실행<br>
2. 서버를 제거하고 코드를 재실행<br> 
3. m2파일을 날리고 다시 설치<br>

<h2>issue#3</h2>
<h4>org.springframework.web.servlet.PageNotFound - No mapping for GET</h4><br>
이름을 바꾼뒤 dispatcher-servlet.xml에서 context:component 태그에 패키지명을 수정해주지않아서 발생한 에러 바뀐 패키지명을 입력해줘서 해결함<br>

<h2>issue#4</h2>
@PatchMapping, @PutMapping (Path값 지정) 등 spring문의 사용 방법<br>
@Repository의 코드 작성 및 파라메타 값 지정<br>
  
  
## 느낀점 ✍


- 이세운 : 이론적인부분을 다 이해해서 코드작성도 충분히 쉽게 할수있다고 생각했다 하지만 생각보다 어려웠고 오류난걸 해결하는데 시간이 많이 걸렸다 <br>
- 이수민 : 처음부터 프로젝트를 어떻게 해야할지 감이 오지 않는 건 이번이 처음인 거 같다. 자바는 정말 어려운 거 같다. CRUD도 어느정도 알고 어떻게 작성해야할지도 느낌이 왔는데 JPA로 하니깐 하나도 모르겠고 어려웠다. 그래도 하면서 오류해결하고 직접 작성하면서 어느정도 이해가 되었다. 수업 들을 땐 어노테이션 그냥 따라 쓰면서 조금씩 이해했는데 막상 직접 코드 짜보니 어떤 상황에서 쓰고 작성하는지 알게 되었다. 하지만 아직까지는 너무 어렵다 <br>
- 명지안 : 편리를 위한 git도 너무 어려웠고 생각지 못한 에러들을 해결하는데 진도가 안나가서 멘붕이었네요.. 팀원들이 으쌰으쌰해주셔서 너무 감사했습니다! <br>
- 원종혁 : 이번 미니프로젝트는 아주 조금은 간단할 거 라고 생각했지만 크나큰 나의 착각이었다. 막상 시작하니 전혀 진행하지 못하는 자신을 발견할 수 있었다. 데이터를 입력하는 것 부터 시작해 spring을 활용해 CRUD를 구현하고, 원하는 id 값을 가지고 값을 수정, 삭제하기 위해서 어떤 방법을 사용하고 알맞은 파라미터 등 사용법을 익숙히 하는데 많은 시간이 걸릴 거 같다. <br>
