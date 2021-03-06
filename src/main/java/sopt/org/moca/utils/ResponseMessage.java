package sopt.org.moca.utils;

public class ResponseMessage {

    // 서버 에러
    public static final String GET_SERVER_TIME_SUCCESS = "서버 시간 조회 성공";
    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";
    public static final String DB_ERROR = "데이터베이스 에러";


    // 유저
    public static final String LOGIN_SUCCESS = "로그인 성공";
    public static final String LOGIN_FAIL = "로그인 실패";
    public static final String READ_USER = "회원 정보 조회 성공";
    public static final String NOT_FOUND_USER = "회원을 찾을 수 없습니다.";
    public static final String CREATED_USER = "회원 가입 성공";
    public static final String FAIL_CREATE_USER = "회원 가입 실패";
    public static final String USER_ALREADY_EXISTS = "회원이 이미 존재합니다.";
    public static final String UPDATE_USER = "회원 정보 수정 성공";
    public static final String DELETE_USER = "회원 탈퇴 성공";

    public static final String AUTHORIZED = "인증 성공";
    public static final String UNAUTHORIZED = "인증 실패";
    public static final String FORBIDDEN = "인가 실패";


    // 팔로우/팔로잉
    public static final String FOLLOW_SUCCESS = "팔로우/언팔로우 성공";
    public static final String READ_FOLLOW = "팔로우/팔로잉 조회 성공";
    public static final String NOT_FOUND_FOLLOW = "팔로우/팔로잉을 찾을 수 없습니다.";


    // 핫플레이스
    public static final String READ_HOT_PLACE = "핫플레이스 리스트 조회 성공";


    // 검증 카페
    public static final String READ_EVALUATED_CAFE_LIST = "검증 카페 리스트 조회 성공";
    public static final String FAIL_EVALUATED_CAFE_LIST = "검증 카페 리스트 조회 실패";
    public static final String READ_EVALUATED_CAFE_INFO = "검증카페 상세 정보 조회 성공";
    public static final String FAIL_EVALUATED_CAFE_INFO = "검증카페 상세 정보 조회 실패";
    public static final String READ_EVALUATED_CAFE_IMG = "감증카페 이미지 조회 성공";
    public static final String FAIL_EVALUATED_CAFE_IMG = "검증카페 이미지 조회 실패";
    public static final String READ_EVALUATION_LIST = "검증 카페 인증 위원 평가 리스트 조회 성공";
    public static final String FAIL_EVALUATION_LIST = "검증 카페 인증 위원 평가 리스트 조회 실패";
    public static final String READ_EVALUATION_DETAIL = "검증카페 인증 위원 평가 조회 성공";
    public static final String FAIL_EVALUATION_DETAIL = "해당 검증카페 인증 위원 조회 실패";


    //카페 상세 보기
    public static final String READ_CAFE_IMG_LIST = "해당 카페 이미지 리스트 조회 성공";
    public static final String FAIL_CAFE_IMG_LIST = "해당 카페 이미지 리스트 조회 실패";
    public static final String READ_CAFE_INFO = "해당 카페 상세 정보 조회 성공";
    public static final String FAIL_CAFE_INFO = "해당 카페 상세 정보 조회 실패";
    public static final String READ_CAFE_SIGNITURE_MENU = "해당 카페 시그니처 메뉴 조회 성공";
    public static final String FAIL_CAFE_SIGNITURE_MENU = "해당 카페 시그니처 메뉴 조회 실패";
    public static final String NOT_FOUND_CAFE = "카페를 찾을 수 없습니다";


    // 인기 카페 조회
    public static final String READ_BEST_CAFE_LIST = "인기 카페 리스트 조회 성공";
    public static final String NOT_FOUND_BEST_CAFE = "인기 카페를 찾을 수 없습니다";


    // 위치
    public static final String NOT_FOUND_NEAR_BY_CAFE = "가까운 카페를 찾을 수 없습니다";
    public static final String READ_NEAR_BY_CAFE = "가까운 카페 리스트 찾기 성공";


    // 리뷰
    public static final String READ_REVIEWS = "리뷰 조회 성공";
    public static final String NOT_FOUND_REVIEWS = "리뷰를 찾을 수 없습니다";
    public static final String CREATED_REVIEW = "리뷰 작성 성공";
    public static final String FAIL_CREATE_REVIEW = "리뷰 작성 실패";
    public static final String LIKE_REVIEW = "리뷰 좋아요/취소 성공";
    public static final String UPDATE_REVIEW = "리뷰 수정 성공";
    public static final String DELETE_REIVEW = "리뷰 삭제 성공";


    // 리뷰에 대한 댓글
    public static final String READ_COMMENTS = "댓글 조회 성공";
    public static final String NOT_FOUND_COMMENTS = "댓글을 찾을 수 없습니다";
    public static final String CREATED_COMMENT = "댓글 작성 성공";
    public static final String FAIL_CREATE_COMMENT = "댓글 작성 실패";
    public static final String UPDATE_COMMENT = "댓글 수정 성공";
    public static final String DELETE_COMMENT = "댓글 삭제 성공";


    // 신고기능
    public static final String CREATED_REPORT = "신고 성공";
    public static final String FAIL_CREATE_REPORT = "신고 실패";



    //지역구 조회
    public static final String READ_DISTRICT = "지역구 리스트 조회 성공";
    public static final String FAIL_DISTRICT = "지역구 리스트 조회 실패";

    //컨셉 리스트 조회
    public static final String READ_CONCPET ="컨셉 리스트 조회 성공";
    public static final String FAIL_CONCEPT ="컨셉 리스트 조회 실패";

    //주메뉴 리스트 조회
    public static final String READ_MAIN_MENU ="주 메뉴 리스트 조회 성공";
    public static final String FAIL_MAIN_MENU ="주 메뉴 리스트 실패 성공";


    //카테고리화 리스트 조회
    public static final String READ_CATEGORIZED_CAFE = "카테고리화 카페 리스트 조회 성공";
    public static final String FAIL_CATEGORIZED_CAFE = "카테고리화 카페 리스트 조회 실패";

    // 커뮤니티
    public static final String READ_FEEDS = "피드 조회 성공";
    public static final String NOT_FOUND_FEEDS = "피드를 찾을 수 없습니다";



    // 멤버쉽 리스트 조회
    public static final String READ_MEMBERSHIP_LIST ="멤버쉽 리스트 조회 성공";
    public static final String FAIL_MEMBERSHIP_LIST ="멤버쉽 리스트 조회 실패";
    public static final String SAVE_MEMBERSHIP = "멤버쉽 적립 성공";
    public static final String FAIL_SAVE_MEMBERSHIP = "멤버쉽 적립 실패(일치하는 핸드폰 번호가 없습니다.)";


    // 쿠폰 리스트 조회
    public static final String READ_COUPON_LIST = "쿠폰 리스트 조회 성공";
    public static final String FAIL_COUPON_LIST = "쿠폰 리스트 조회 실패";


    //쿠폰 auth 등록
    public static final String SAVE_COUPON_AUTH = "쿠폰 auth에 등록";
    public static final String DELETE_COUPON_AUTH = "쿠폰 auth에 삭제";

    //쿠폰 사용
    public static final String FAIL_USE_COUPON = "쿠폰 사용 실패";
    public static final String USE_COUPON ="쿠폰 사용 완료";


    //쿠폰 적립 내역
    public static final String READ_HISTORY_LIST = "멤버십 히스토리 조회 성공";
    public static final String FAIL_HISTORY_LIST = "멤버십 히스토리 조회 실패";



    // 플러스
    public static final String NOT_FOUND_PLUS_SUBJECT_LIST = "플러스 주제 리스트를 찾을 수 없습니다.";
    public static final String READ_PLUS_SUBJECT_LIST = "플러스 주제 리스트 조회 성공";
    public static final String READ_PLUS_SUBJECT ="플러스 주제 조회 성공";
    public static final String NOT_FOUND_PLUS_SUBJECT = "플러스 조회 실패";
    public static final String READ_PLUS_CONTENT_LIST = "플러스 콘텐츠 리스트 조회 성공";
    public static final String NOT_FOUND_PLUS_CONTENT_LIST = "플러스 콘텐츠 리스트를 찾을 수 없습니다.";
    public static final String NOT_FOUND_PLUS_CONTENT_IMG_LIST = "플러스 콘텐츠 이미지 리스트를 조회 할 수 없습니다.";
    public static final String READ_PLUS_CONTENT_IMG_LIST = "플러스 콘텐츠 이미지 리스트 조회 성공";


    //검색
    public static final String SEARCH_CAFE_LIST = "카페 키워드 조회 성공";
    public static final String FAIL_SEARCH_CAFE_LIST = "카페 키워드 조회 실패";


    public static final String SEARCH_REVIEW_LIST = "커뮤니티 키워드 조회 성공";
    public static final String FAIL_SEARCH_REVIEW_LIST = "커뮤니티 키워드 조회 실패";

    public static final String SEARCH_FOLLOWER_LIST = "팔로워 리스트 조회 성공";
    public static final String FAIL_SEARCH_FOLLOWER_LIST = "팔로워 리스트 조회 실패 ";

    public static final String SEARCH_FOLLOWING_LIST = "팔로잉 리스트 조회 성공";
    public static final String FAIL_SEARCH_FOLLOWING_LIST = "팔로잉 리스트 조회 실패 ";


    // 스크랩
    public static final String SCRAP_SUCCESS = "스크랩 성공";
    public static final String SCRAP_FAIL = "스크랩 실패";
    public static final String READ_SCRAP_LIST = "스크랩 조회 성공";
    public static final String NOT_FOUND_SCRAP_LIST = "스크랩 조회 실패";
    public static final String SCRAP_DELETE_FAIL = "스크랩 취소 실패";
    public static final String SCRAP_DELETE_SUCCESS = "스크랩 취소 성공";

    //메시지
    public static final String FAIL_TO_SAVE_MESSAGE = "메시지 저장 실패";
    public static final String MESSAGE_SAVE_SUCCESS = "메시지 저장 성공";
    public static final String NOT_FOUND_MESSAGELIST = "메시지 리스트가 없습니다.";
    public static final String READ_MESSAGE = "메시지 리스트 조회 성공";

    //핫플레이스로 카페 리스트
    public static final String READ_HOT_PLACE_CAFE_LIST = "핫플레이스로 카페 리스트 조회 성공";
    public static final String FAIL_HOT_PLACE_CAFE_LIST = "핫플레이스로 카페 리스트 조회 실패";

    //카페 리뷰 랭킹 30으로 검색
    public static final String READ_CAFE_LIST_BY_REVIEW = "리뷰 랭킹 순 카페 리스트 조회 성공";
    public static final String FAIL_CAFE_LIST_BY_REVIEW = "리뷰 랭킹 순 카페 리스트 조회 실패";

}
