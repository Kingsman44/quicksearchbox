package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.pu */
/* compiled from: PG */
final class C58728pu extends C58485gu {

    /* renamed from: a */
    private final transient Object[] f156482a;

    /* renamed from: b */
    private final transient int f156483b;

    /* renamed from: d */
    private final transient int f156484d;

    public C58728pu(Object[] objArr, int i, int i2) {
        this.f156482a = objArr;
        this.f156483b = i;
        this.f156484d = i2;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, this.f156484d, "index");
        return Objects.requireNonNull(this.f156482a[i + i + this.f156483b]);
    }

    public final int size() {
        return this.f156484d;
    }
}
