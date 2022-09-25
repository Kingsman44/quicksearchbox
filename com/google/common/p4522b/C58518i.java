package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.i */
/* compiled from: PG */
public abstract class C58518i extends C58800sl {

    /* renamed from: a */
    public int f156164a = 2;

    /* renamed from: b */
    private Object f156165b;

    protected C58518i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo55143a();

    public final boolean hasNext() {
        C58838bb.m90883r(this.f156164a != 4);
        int i = this.f156164a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f156164a = 4;
                this.f156165b = mo55143a();
                if (this.f156164a != 3) {
                    this.f156164a = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f156164a = 2;
            Object obj = this.f156165b;
            this.f156165b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
