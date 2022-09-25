package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqz */
/* compiled from: PG */
final class aqz extends aqg {

    /* renamed from: a */
    final arh f21415a;

    /* renamed from: b */
    final Object f21416b;

    /* renamed from: c */
    int f21417c;

    public aqz(arh arh, int i) {
        this.f21415a = arh;
        this.f21416b = arh.f21433b[i];
        this.f21417c = i;
    }

    /* renamed from: a */
    private final void m19349a() {
        int i = this.f21417c;
        if (i != -1) {
            arh arh = this.f21415a;
            if (i <= arh.f21434c && apz.m19253b(this.f21416b, arh.f21433b[i])) {
                return;
            }
        }
        this.f21417c = this.f21415a.mo15253d(this.f21416b);
    }

    public final Object getKey() {
        return this.f21416b;
    }

    public final Object getValue() {
        m19349a();
        int i = this.f21417c;
        if (i == -1) {
            return null;
        }
        return this.f21415a.f21432a[i];
    }

    public final Object setValue(Object obj) {
        m19349a();
        int i = this.f21417c;
        if (i == -1) {
            return this.f21415a.mo15264q(this.f21416b, obj);
        }
        Object obj2 = this.f21415a.f21432a[i];
        if (apz.m19253b(obj2, obj)) {
            return obj;
        }
        this.f21415a.m19357B(this.f21417c, obj);
        return obj2;
    }
}
