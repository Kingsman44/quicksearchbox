package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.h */
/* compiled from: PG */
abstract class C58491h extends C58801sm {

    /* renamed from: a */
    private final int f156124a;

    /* renamed from: b */
    private int f156125b;

    protected C58491h(int i, int i2) {
        C58838bb.m90864E(i2, i);
        this.f156124a = i;
        this.f156125b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo55242a(int i);

    public final boolean hasNext() {
        return this.f156125b < this.f156124a;
    }

    public final boolean hasPrevious() {
        return this.f156125b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f156125b;
            this.f156125b = i + 1;
            return mo55242a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f156125b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f156125b - 1;
            this.f156125b = i;
            return mo55242a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f156125b - 1;
    }
}
