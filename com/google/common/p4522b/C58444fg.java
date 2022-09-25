package com.google.common.p4522b;

import java.util.Collection;
import java.util.Queue;

/* renamed from: com.google.common.b.fg */
/* compiled from: PG */
public abstract class C58444fg extends C58432ev implements Queue {
    protected C58444fg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo55040b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Queue mo55234c();

    public final Object element() {
        return mo55234c().element();
    }

    public boolean offer(Object obj) {
        return mo55234c().offer(obj);
    }

    public final Object peek() {
        return mo55234c().peek();
    }

    public final Object poll() {
        return mo55234c().poll();
    }

    public final Object remove() {
        return mo55234c().remove();
    }
}
