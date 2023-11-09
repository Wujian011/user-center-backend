package com.wujian.usercenter.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 * @author wujian
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}