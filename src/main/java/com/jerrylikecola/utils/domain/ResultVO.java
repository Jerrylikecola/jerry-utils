package com.jerrylikecola.utils.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jerrylikecola(xiaxiang)
 * @date 2020-01-18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -2436992620489457739L;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 数据包
     */
    private T data;
}
