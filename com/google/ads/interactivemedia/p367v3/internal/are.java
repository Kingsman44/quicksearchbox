package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.are */
/* compiled from: PG */
final class are extends arg {

    /* renamed from: a */
    final /* synthetic */ arh f21425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public are(arh arh) {
        super(arh);
        this.f21425a = arh;
    }

    /* renamed from: a */
    public final Object mo15225a(int i) {
        return this.f21425a.f21433b[i];
    }

    public final boolean contains(Object obj) {
        return this.f21425a.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int c = ary.m19450c(obj);
        int e = this.f21425a.mo15254e(obj, c);
        if (e == -1) {
            return false;
        }
        this.f21425a.mo15259h(e, c);
        return true;
    }
}
