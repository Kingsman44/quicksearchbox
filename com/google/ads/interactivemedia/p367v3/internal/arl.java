package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arl */
/* compiled from: PG */
final class arl implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f21452a;

    public arl(Object[] objArr) {
        this.f21452a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return arn.m19406m(this.f21452a);
    }
}
