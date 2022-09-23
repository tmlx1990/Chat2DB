package com.alibaba.dataops.server.web.api.controller.data.source.converter;

import java.util.List;

import com.alibaba.dataops.server.domain.core.api.model.DataSourceDTO;
import com.alibaba.dataops.server.domain.core.api.test.DataSourceCreateParam;
import com.alibaba.dataops.server.domain.core.api.test.DataSourcePageQueryParam;
import com.alibaba.dataops.server.domain.core.api.test.DataSourceUpdateParam;
import com.alibaba.dataops.server.web.api.controller.data.source.request.DataSourceCreateRequest;
import com.alibaba.dataops.server.web.api.controller.data.source.request.DataSourceQueryRequest;
import com.alibaba.dataops.server.web.api.controller.data.source.request.DataSourceUpdateRequest;
import com.alibaba.dataops.server.web.api.controller.data.source.vo.DataSourceVO;

import org.mapstruct.Mapper;

/**
 * @author moji
 * @version DataSourceWebConverter.java, v 0.1 2022年09月23日 16:45 moji Exp $
 * @date 2022/09/23
 */
@Mapper(componentModel = "spring")
public abstract class DataSourceWebConverter {

    /**
     * 参数转换
     *
     * @param request
     * @return
     */
    public abstract DataSourceCreateParam createReq2param(DataSourceCreateRequest request);

    /**
     * 参数转换
     *
     * @param request
     * @return
     */
    public abstract DataSourceUpdateParam updateReq2param(DataSourceUpdateRequest request);

    /**
     * 参数转换
     *
     * @param request
     * @return
     */
    public abstract DataSourcePageQueryParam queryReq2param(DataSourceQueryRequest request);

    /**
     * 模型转换
     *
     * @param dataSourceDTO
     * @return
     */
    public abstract DataSourceVO dto2vo(DataSourceDTO dataSourceDTO);

    /**
     * 模型转换
     *
     * @param dataSourceDTOS
     * @return
     */
    public abstract List<DataSourceVO> dto2vo(List<DataSourceDTO> dataSourceDTOS);

}
