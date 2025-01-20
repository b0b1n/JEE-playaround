package com.skious.onlinestore.web.filters;

import java.io.IOException;
import java.util.stream.Collectors;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class HelloWorldFilter
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = {
				"/*" }, initParams = { @WebInitParam(name = "someParamKey", value = "someParamValue") })
public class HelloWorldFilter extends HttpFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println(" In destory() method, end of the filter");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(" Filtering : [ ");
		System.out.println(" \t requequestId=" + request.getRequestId());
		System.out.println(" \t Dispatcher : " + request.getDispatcherType());
		System.out.println("\t Parameters : " + request.getParameterMap().entrySet().stream()
				.map(e -> e.getKey() + " ; " + String.join(", ", e.getValue())).collect(Collectors.joining("\n")));
		System.out.println(" \t ]");
		chain.doFilter(request, response);
		System.out.println(" --> Fnished doFilter for : requequestId= " + request.getRequestId());
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(" In init() method, beginning of the filter");
		System.out.println(" Init parameters : ");
		fConfig.getInitParameterNames().asIterator().forEachRemaining(e -> System.out.println("  -- " + e));
	}

}
