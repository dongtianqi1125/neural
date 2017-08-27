package cn.ms.neural.filter;

import cn.ms.neural.extension.Extension;

@Extension(category = NeuralChain.ERROR, order = 1)
public class ErrorTest3Filter extends Filter<Message> {
	
	@Override
	public void doFilter(FilterChain<Message> chain, Message m) throws Exception {
		System.out.println(this.getClass().getName());
		chain.doFilter(chain, m);
	}

}
