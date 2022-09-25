package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cp */
/* compiled from: PG */
final class C6855cp implements Comparable {

    /* renamed from: a */
    public final C6894ea f21701a;

    /* renamed from: b */
    public int f21702b;

    /* renamed from: c */
    public long f21703c;

    /* renamed from: d */
    public Object f21704d;

    public C6855cp(C6894ea eaVar) {
        this.f21701a = eaVar;
    }

    /* renamed from: a */
    public final void mo15581a(int i, long j, Object obj) {
        this.f21702b = i;
        this.f21703c = j;
        this.f21704d = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C6855cp cpVar = (C6855cp) obj;
        Object obj2 = this.f21704d;
        if ((obj2 == null) != (cpVar.f21704d == null)) {
            return obj2 == null ? 1 : -1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.f21702b - cpVar.f21702b;
        return i != 0 ? i : aeu.m18493K(this.f21703c, cpVar.f21703c);
    }
}
