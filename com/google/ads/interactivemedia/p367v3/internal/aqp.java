package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqp */
/* compiled from: PG */
final class aqp extends aqg {

    /* renamed from: a */
    final /* synthetic */ aqr f21392a;

    /* renamed from: b */
    private final Object f21393b;

    /* renamed from: c */
    private int f21394c;

    public aqp(aqr aqr, int i) {
        this.f21392a = aqr;
        this.f21393b = aqr.f21398b[i];
        this.f21394c = i;
    }

    /* renamed from: a */
    private final void m19305a() {
        int i = this.f21394c;
        if (i == -1 || i >= this.f21392a.size() || !apz.m19253b(this.f21393b, this.f21392a.f21398b[this.f21394c])) {
            this.f21394c = this.f21392a.m19317t(this.f21393b);
        }
    }

    public final Object getKey() {
        return this.f21393b;
    }

    public final Object getValue() {
        Map d = this.f21392a.mo15199d();
        if (d != null) {
            return d.get(this.f21393b);
        }
        m19305a();
        int i = this.f21394c;
        if (i == -1) {
            return null;
        }
        return this.f21392a.f21399c[i];
    }

    public final Object setValue(Object obj) {
        Map d = this.f21392a.mo15199d();
        if (d != null) {
            return d.put(this.f21393b, obj);
        }
        m19305a();
        int i = this.f21394c;
        if (i == -1) {
            this.f21392a.put(this.f21393b, obj);
            return null;
        }
        Object[] objArr = this.f21392a.f21399c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
