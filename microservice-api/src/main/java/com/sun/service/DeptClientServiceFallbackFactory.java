package com.sun.service;

import java.util.List;

import com.sun.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 不要忘记添加，不要忘记添加
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {
			@Override
			public Dept get(long id)
			{
				return new Dept().setDeptNo(id).setDName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDbSource("no this database in MySQL");
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
