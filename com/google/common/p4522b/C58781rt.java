package com.google.common.p4522b;

import java.util.Collection;
import java.util.Queue;

/* renamed from: com.google.common.b.rt */
/* compiled from: PG */
public final class C58781rt extends C58779rr implements Queue {
    private static final long serialVersionUID = 0;

    public C58781rt(Queue queue) {
        super(queue, (Object) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Collection mo55949a() {
        return (Queue) ((Collection) this.f156561a);
    }

    public final Object element() {
        Object element;
        synchronized (this.f156562b) {
            element = ((Queue) ((Collection) this.f156561a)).element();
        }
        return element;
    }

    public final boolean offer(Object obj) {
        boolean offer;
        synchronized (this.f156562b) {
            offer = ((Queue) ((Collection) this.f156561a)).offer(obj);
        }
        return offer;
    }

    public final Object peek() {
        Object peek;
        synchronized (this.f156562b) {
            peek = ((Queue) ((Collection) this.f156561a)).peek();
        }
        return peek;
    }

    public final Object poll() {
        Object poll;
        synchronized (this.f156562b) {
            poll = ((Queue) ((Collection) this.f156561a)).poll();
        }
        return poll;
    }

    public final Object remove() {
        Object remove;
        synchronized (this.f156562b) {
            remove = ((Queue) ((Collection) this.f156561a)).remove();
        }
        return remove;
    }
}
