package com.hu.zhcc.common.entity;

import java.util.List;

/**
 * 分页查询结果类
 * 
 * Created by hulichao
 * @param <T>
 */
public final class Page<T> implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private long total;

	private List<T> rows;

	public Page(long total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return this.total;
	}

	public List<T> getRows() {
		return this.rows;
	}

}
