package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.ji */
/* compiled from: PG */
final class C58554ji implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    boolean f156210a = true;

    /* renamed from: b */
    final /* synthetic */ Iterator f156211b;

    public C58554ji(Iterator it) {
        this.f156211b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156211b.hasNext();
    }

    public final Object next() {
        Object next = this.f156211b.next();
        this.f156210a = false;
        return next;
    }

    public final void remove() {
        C58838bb.m90884s(!this.f156210a, "no calls to next() since the last call to remove()");
        this.f156211b.remove();
    }
}
