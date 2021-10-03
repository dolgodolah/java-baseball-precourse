# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

- BaseballManager
  - 게임의 전체적인 흐름을 담당한다.
    - 플레이어 입력을 요구한다.
    - 입력이 유효한지 확인한다.
    - 컴퓨터가 결과 계산하도록 한다.
    - 입력에 따른 결과를 출력한다.
  - 게임에는 Player 한 명과 Computer 한 대가 참여한다.

- Player
  - 플레이어의 상태에 따라 게임을 진행한다.
  - 입력 기능을 가진다.

- Computer
  - 정답을 매 게임마다 생성한다.
  - 플레이어가 입력한 숫자를 정답과 비교하여 결과를 계산한다.

- UI
  - Input
    - 숫자 입력
    - 재시작 여부 입력
  - Output
    - 결과에 따른 메시지 출력



