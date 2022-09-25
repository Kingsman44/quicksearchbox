package com.bumptech.glide.load;

import com.bumptech.glide.p291h.C5630q;

/* renamed from: com.bumptech.glide.load.r */
/* compiled from: PG */
public final class C5959r {

    /* renamed from: e */
    private static final C5958q f17615e = new C5957p();

    /* renamed from: a */
    public final Object f17616a;

    /* renamed from: b */
    public final C5958q f17617b;

    /* renamed from: c */
    public final String f17618c;

    /* renamed from: d */
    public volatile byte[] f17619d;

    public C5959r(String str, Object obj, C5958q qVar) {
        C5630q.m14605b(str);
        this.f17618c = str;
        this.f17616a = obj;
        C5630q.m14607d(qVar, "Argument must not be null");
        this.f17617b = qVar;
    }

    /* renamed from: a */
    public static C5959r m15374a(String str) {
        return new C5959r(str, (Object) null, f17615e);
    }

    /* renamed from: b */
    public static C5959r m15375b(String str, Object obj) {
        return new C5959r(str, obj, f17615e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5959r) {
            return this.f17618c.equals(((C5959r) obj).f17618c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17618c.hashCode();
    }

    public final String toString() {
        String str = this.f17618c;
        return "Option{key='" + str + "'}";
    }
}
