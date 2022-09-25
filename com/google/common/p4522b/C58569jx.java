package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.jx */
/* compiled from: PG */
final class C58569jx implements Iterator, java.util.Iterator {

    /* renamed from: a */
    public final java.util.Iterator f156239a;

    /* renamed from: b */
    public boolean f156240b;

    /* renamed from: c */
    public Object f156241c;

    public C58569jx(java.util.Iterator it) {
        it.getClass();
        this.f156239a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156240b || this.f156239a.hasNext();
    }

    public final Object next() {
        if (!this.f156240b) {
            return this.f156239a.next();
        }
        Object obj = this.f156241c;
        this.f156240b = false;
        this.f156241c = null;
        return obj;
    }

    public final void remove() {
        C58838bb.m90884s(!this.f156240b, "Can't remove after you've peeked at next");
        this.f156239a.remove();
    }
}
