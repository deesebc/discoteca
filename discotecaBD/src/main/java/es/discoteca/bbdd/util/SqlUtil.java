/**
 * 
 */
package es.discoteca.bbdd.util;

import org.apache.commons.lang.StringUtils;

/**
 * @author xe29197
 * 
 */
public final class SqlUtil {

	public static void addSearchParam(final StringBuilder sql, final String param,
			final String value) {
		if (StringUtils.isNotBlank(value)) {
			sql.append("AND ");
			sql.append(param);
			sql.append(" LIKE '%");
			sql.append(value);
			sql.append("%'");
		}
	}

	private SqlUtil() {
		super();
	}
}
