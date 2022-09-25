package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ard */
/* compiled from: PG */
final class ard extends arg {

    /* renamed from: a */
    final /* synthetic */ arh f21424a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ard(arh arh) {
        super(arh);
        this.f21424a = arh;
    }

    /* renamed from: a */
    public final Object mo15225a(int i) {
        return this.f21424a.f21432a[i];
    }

    public final boolean contains(Object obj) {
        return this.f21424a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int c = ary.m19450c(obj);
        int c2 = this.f21424a.mo15249c(obj, c);
        if (c2 == -1) {
            return false;
        }
        this.f21424a.mo15257g(c2, c);
        return true;
    }
}
