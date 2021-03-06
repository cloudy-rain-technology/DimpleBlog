package com.dimple.framework.aspectj.lang.enums;

/**
 * @className: BusinessType
 * @description: 业务操作类型
 * @author: Dimple
 * @date: 10/22/19
 */
public enum BusinessType {
    /**
     * 其它
     */
    OTHER,

    /**
     * 新增
     */
    INSERT,

    /**
     * 修改
     */
    UPDATE,

    /**
     * 删除
     */
    DELETE,

    /**
     * 授权
     */
    GRANT,

    /**
     * 导出
     */
    EXPORT,

    /**
     * 导入
     */
    IMPORT,

    /**
     * 强退
     */
    FORCE,

    /**
     * 生成代码
     */
    GENCODE,

    /**
     * 清空数据
     */
    CLEAN,
    /**
     * 上传
     */
    UPLOAD,
    /**
     * 下载
     */
    DOWNLOAD;
}
