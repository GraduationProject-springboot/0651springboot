package com.entity.view;

import com.entity.ZhenliaofanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 诊疗方案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 18:41:25
 */
@TableName("zhenliaofangan")
public class ZhenliaofanganView  extends ZhenliaofanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhenliaofanganView(){
	}
 
 	public ZhenliaofanganView(ZhenliaofanganEntity zhenliaofanganEntity){
 	try {
			BeanUtils.copyProperties(this, zhenliaofanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
