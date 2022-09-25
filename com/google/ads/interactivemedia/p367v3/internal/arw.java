package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arw */
/* compiled from: PG */
final class arw implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f21468a;

    public arw(Object[] objArr) {
        this.f21468a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return arx.m19442k(this.f21468a);
    }
}
