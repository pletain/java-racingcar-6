package racingcar.controller;

import racingcar.Util.GameGuideMessage;
import racingcar.service.RacingGameService;

public class RacingGameController {

    private final RacingGameService racingGameService;

    public RacingGameController() {
        this.racingGameService = new RacingGameService();
    }


    public void startRacingGame() {
        System.out.println(GameGuideMessage.PARTICIPATING_CAR.getMessage());
        racingGameService.acceptCarList(); // 참가할 자동차 이름을 입력받음
    }
}
