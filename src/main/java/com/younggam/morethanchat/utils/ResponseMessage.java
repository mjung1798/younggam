package com.younggam.morethanchat.utils;

public class ResponseMessage {
    public static final String READ_USER = "회원 정보 조회 성공";
    public static final String NOT_FOUND_USER = "회원을 찾을 수 없습니다.";
    public static final String ALREADY_EXISTED_USER = "이미 존재하는 email 입니다.";
    public static final String EMAIL_CHECK_SUCCESS = "이메일 중복 확인 성공";
    public static final String CREATED_USER = "회원가입 성공";
    public static final String UPDATE_USER = "회원 정보 수정 성공";
    public static final String DELETE_USER = "회원 탈퇴 성공";

    public static final String LOGIN_SUCCESS = "로그인 성공";
    public static final String LOGIN_FAIL = "로그인 실패";

    public static final String CURRENT_USER = "접근한 유저와 토큰의 유저가 같다.";
    public static final String NOT_CURRENT_USER = "접근한 유저와 토큰의 유저가 다르다.";

    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";

    public static final String DB_ERROR = "데이터베이스 에러";


    /** Store 관련*/
    public static final String SAVE_STORE_BASIC_INFO = "store의 기본정보 저장 완료";

    public static final String STORE_BASIC_INFO_IS_ALREADY_EXIST = "챗봇에 대한 기본정보가 이미 존재합니다. 기본정보 수정을 이용하세요";


    /**
     * chatBot 관련
     */

    public static final String CHATBOT_CATEGORY_IS_NOT_VALID = "지정한 카테고리의 숫자가 올바르지 않은 값입니다.";

    public static final String SAVE_CHATBOT_MESSAGE = "챗봇메세지를 등록하였습니다.";


    public static final String messageCode(String message, String additional){
        return additional+" : " + message;
    }

}