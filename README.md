# museum
# 박물관 소장품 조회 API

## 기술스택
Eclipse IDE<br>
Spring Web MVC 5.3.14<br>
jackson-databind 2.12.3<br>
hibernate-entitymanage 5.4.18<br>


## 조원



## 기능구현
CREATE : 소장품 현황을 추가하는 기능<br>
DELETE : 소장품의 정보를 ID를 통해 삭제하는 기능<br>
UPDATE : 소장품의 column인 이름,상태,시대정보,보관장소를 업데이트하는 기능<br>




## Trouble Shooting
<h2>issue#1</h2>

![image (8)](https://user-images.githubusercontent.com/92356170/171056286-06b12748-33d1-4060-9b3b-44397e46f89a.png)
Required request parameter 'Name' for method parameter type String is not present<br>
으로 포스트맨이 Name을 인식하지 못하는 에러가 발생했다<br>
Name값을 명확하게 명시해주니 해결됨<br>

<h2>issue#2</h2>

![화면 캡처 2022-05-31 051934](https://user-images.githubusercontent.com/92356170/171056083-4c9817b5-4dbd-437b-9067-db44cbe74a5c.png)<br>
Server Tomcat v9.0 Server at localhost failed to start<br>
이클립스 재실행하고 서버를 제거하고 코드를 재실행했다<br>

<h2>issue#3</h2>
<h4>org.springframework.web.servlet.PageNotFound - No mapping for GET</h4><br>

이름을 바꾼뒤 dispatcher-servlet.xml에서 context:component 태그에 패키지명을 수정해주지않아서 발생한 에러 바뀐 패키지명을 입력해줘서 해결함<br>



## 느낀점 

<strong> 이세운 : 이론적인부분을 다 이해해서 코드작성도 충분히 쉽게 할수있다고 생각했다 하지만 생각보다 어려웠고 오류난걸 해결하는데 시간이 많이 걸렸다 </strong><br>
<strong> 이수민 : 처음부터 프로젝트를 어떻게 해야할지 감이 오지 않는 건 이번이 처음인 거 같다. 자바는 정말 어려운 거 같다. CRUD도 어느정도 알고 어떻게 작성해야할지도 느낌이 왔는데 JPA로 하니깐 하나도 모르겠고 어려웠다. 그래도 하면서 오류해결하고 직접 작성하면서 어느정도 이해가 되었다. 수업 들을 땐 어노테이션 그냥 따라 쓰면서 조금씩 이해했는데 막상 직접 코드 짜보니 어떤 상황에서 쓰고 작성하는지 알게 되었다. 하지만 아직까지는 너무 어렵다 </strong><br>
<strong> 원종혁 :  </strong><br>
