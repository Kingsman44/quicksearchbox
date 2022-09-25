package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.pq */
/* compiled from: PG */
public final class C58724pq extends C58485gu {

    /* renamed from: a */
    static final C58485gu f156472a = new C58724pq(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f156473b;

    /* renamed from: d */
    public final transient int f156474d;

    public C58724pq(Object[] objArr, int i) {
        this.f156473b = objArr;
        this.f156474d = i;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, this.f156474d, "index");
        return Objects.requireNonNull(this.f156473b[i]);
    }

    public final int size() {
        return this.f156474d;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        System.arraycopy(this.f156473b, 0, objArr, i, this.f156474d);
        return i + this.f156474d;
    }

    /* renamed from: x */
    public final int mo55384x() {
        return this.f156474d;
    }

    /* renamed from: y */
    public final int mo55385y() {
        return 0;
    }

    /* renamed from: z */
    public final Object[] mo55386z() {
        return this.f156473b;
    }
}
