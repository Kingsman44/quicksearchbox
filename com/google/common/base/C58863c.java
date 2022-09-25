package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.base.c */
/* compiled from: PG */
abstract class C58863c implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    public int f156663a = 2;

    /* renamed from: b */
    private Object f156664b;

    protected C58863c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo56148a();

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        C58838bb.m90883r(this.f156663a != 4);
        int i = this.f156663a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f156663a = 4;
                this.f156664b = mo56148a();
                if (this.f156663a != 3) {
                    this.f156663a = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f156663a = 2;
            Object obj = this.f156664b;
            this.f156664b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
