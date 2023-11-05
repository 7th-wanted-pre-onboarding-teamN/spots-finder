package wanted.n.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    //GlobalException
    UNDEFINED_EXCEPTION(HttpStatus.BAD_REQUEST, "알 수 없는 오류입니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 유저 정보를 찾을 수 없습니다."),
    RESTAURANT_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 맛집 정보를 찾을 수 없습니다."),
    INVALID_PAGINATION_OFFSET(HttpStatus.BAD_REQUEST, "page offset에 음수가 들어갈 수 없습니다."),
    INVALID_PAGINATION_SIZE(HttpStatus.BAD_REQUEST, "page size에 음수가 들어갈 수 없습니다.");

    private final HttpStatus status;
    private final String message;
}