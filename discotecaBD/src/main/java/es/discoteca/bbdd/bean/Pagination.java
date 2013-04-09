/**
 * 
 */
package es.discoteca.bbdd.bean;

/**
 * @author xe29197
 * 
 */
public class Pagination {
	private int first;
	private int pageSize;
	private String orderBy;
	private String order;

	public Pagination() {
		super();
	}

	public Pagination(final int first, final int pageSize, final String orderBy, final String order) {
		super();
		this.first = first;
		this.pageSize = pageSize;
		this.orderBy = orderBy;
		this.order = order;
	}

	public int getFirst() {
		return first;
	}

	public String getOrder() {
		return order;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setFirst(final int first) {
		this.first = first;
	}

	public void setOrder(final String order) {
		this.order = order;
	}

	public void setOrderBy(final String orderBy) {
		this.orderBy = orderBy;
	}

	public void setPageSize(final int pageSize) {
		this.pageSize = pageSize;
	}
}
