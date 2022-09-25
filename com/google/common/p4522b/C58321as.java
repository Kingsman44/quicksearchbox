package com.google.common.p4522b;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.as */
/* compiled from: PG */
public abstract class C58321as extends C58800sl {

    /* renamed from: a */
    private Object f155894a;

    protected C58321as(Object obj) {
        this.f155894a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo54771a(Object obj);

    public final boolean hasNext() {
        return this.f155894a != null;
    }

    public final Object next() {
        Object obj = this.f155894a;
        if (obj != null) {
            this.f155894a = mo54771a(obj);
            return obj;
        }
        throw new NoSuchElementException();
    }
}
