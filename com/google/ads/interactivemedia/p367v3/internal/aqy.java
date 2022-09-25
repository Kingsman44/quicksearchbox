package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqy */
/* compiled from: PG */
final class aqy extends aqg {

    /* renamed from: a */
    final Object f21412a;

    /* renamed from: b */
    int f21413b;

    /* renamed from: c */
    final /* synthetic */ arh f21414c;

    public aqy(arh arh, int i) {
        this.f21414c = arh;
        this.f21412a = arh.f21432a[i];
        this.f21413b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15224a() {
        int i = this.f21413b;
        if (i != -1) {
            arh arh = this.f21414c;
            if (i <= arh.f21434c && apz.m19253b(arh.f21432a[i], this.f21412a)) {
                return;
            }
        }
        this.f21413b = this.f21414c.mo15248b(this.f21412a);
    }

    public final Object getKey() {
        return this.f21412a;
    }

    public final Object getValue() {
        mo15224a();
        int i = this.f21413b;
        if (i == -1) {
            return null;
        }
        return this.f21414c.f21433b[i];
    }

    public final Object setValue(Object obj) {
        mo15224a();
        int i = this.f21413b;
        if (i == -1) {
            return this.f21414c.put(this.f21412a, obj);
        }
        Object obj2 = this.f21414c.f21433b[i];
        if (apz.m19253b(obj2, obj)) {
            return obj;
        }
        this.f21414c.m19358C(this.f21413b, obj);
        return obj2;
    }
}
