package org.ryan.rxkotlin.stream

/**
 * @author ryan
 * @Hangzhou Youzan Technology Co.Ltd
 * @date 2018/4/28
 */
interface Processor<in T, out R> : Subscriber<T>, Publisher<R>