package com.xxq.common.exception;

import com.xxq.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Dao 层异常
 */
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {

        @ApiModelProperty(value = "异常状态码")
        private String errorCode;

        public DaoException(String message, String errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public DaoException(ErrorCodeEnum errorCodeEnum) {
            super(errorCodeEnum.getMsg());
            this.errorCode = errorCodeEnum.getErrorCode();
        }
    }

