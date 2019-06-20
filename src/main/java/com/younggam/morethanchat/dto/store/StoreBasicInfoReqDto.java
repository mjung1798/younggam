package com.younggam.morethanchat.dto.store;

import com.younggam.morethanchat.domain.ProviderUser;
import com.younggam.morethanchat.domain.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

import static com.younggam.morethanchat.utils.DateConverter.getNowDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreBasicInfoReqDto {

    private String name;
    private String description;
    private String phoneNum;

    private String businessDay;

    private String reservationStart;
    private String reservationEnd;

    private int earlyReservation;

    private String botIntro;
    private String botImage;

    public Store toEntity(ProviderUser providerUser) {
        return Store.builder()
                .providerUser(providerUser)
                .name(this.name)
                .description(this.description)
                .phoneNum(this.phoneNum)
                .businessDay(this.businessDay)
                .reservationStart(this.reservationStart)
                .reservationEnd(this.reservationEnd)
                .earlyReservation(this.earlyReservation)
                .botId(this.name + new Random().nextInt(100)) //초기 생성시 botID는 랜덤값으로 부여! 이후 bot 생성하기에서 fix하기
                .botIntro(this.botIntro)
                .botImage(this.botImage)
                .regDate(getNowDate())
                .build();

    }
}