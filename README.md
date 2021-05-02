# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다. 
- 각 자동차에 이름을 부여할 수 있다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 
  3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자는 한 명 이상일 수 있다.


## 구현 기능 목록
- 입력
    - 자동차 이름 입력
        - 이름의 길이 5 제한
        - 쉼표(,) 기준으로 구분
    - 이동 횟수
    
- 이동
    - 전진 또는 멈춤
    - Random 값은 0 ~ 9로 구성되며, random 값이 4 이상일 경우 전진
    
- 출력
    - 이름, 위치
    - 우승자


## 클래스 목록
### Name
- 사용자의 이름 정보 클래스
- 유효성 체크
    - 길이 5 제한
    
### Position
- 자동차의 위치 정보 클래스
- 유효성 체크
    - 음수
    
### Car
- 자동차 정보 클래스
- 이름, 위치 정보를 가짐
- 전진 또는 멈춤 기능


### Cars
- 여러 대의 자동차 정보를 가지는 클래스
- 우승자에 대한 정보를 찾는 기능

