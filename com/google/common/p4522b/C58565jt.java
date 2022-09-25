package com.google.common.p4522b;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.jt */
/* compiled from: PG */
public final class C58565jt extends C58800sl {

    /* renamed from: a */
    boolean f156229a;

    /* renamed from: b */
    final /* synthetic */ Object f156230b;

    public C58565jt(Object obj) {
        this.f156230b = obj;
    }

    public final boolean hasNext() {
        return !this.f156229a;
    }

    public final Object next() {
        if (!this.f156229a) {
            this.f156229a = true;
            return this.f156230b;
        }
        throw new NoSuchElementException();
    }
}
