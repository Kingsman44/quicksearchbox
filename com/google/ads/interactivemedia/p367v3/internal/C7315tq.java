package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tq */
/* compiled from: PG */
final class C7315tq extends C7310tl {

    /* renamed from: c */
    public static final Object f23839c = new Object();

    /* renamed from: d */
    private final Object f23840d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f23841e;

    private C7315tq(C6912es esVar, Object obj, Object obj2) {
        super(esVar);
        this.f23840d = obj;
        this.f23841e = obj2;
    }

    /* renamed from: a */
    public static C7315tq m21882a(C6873dg dgVar) {
        return new C7315tq(new C7316tr(dgVar), C6911er.f22042a, f23839c);
    }

    /* renamed from: b */
    public static C7315tq m21883b(C6912es esVar, Object obj, Object obj2) {
        return new C7315tq(esVar, obj, obj2);
    }

    /* renamed from: f */
    public final C6911er mo15478f(int i, C6911er erVar, long j) {
        this.f23825b.mo15478f(i, erVar, j);
        if (aeu.m18533c(erVar.f22044b, this.f23840d)) {
            erVar.f22044b = C6911er.f22042a;
        }
        return erVar;
    }

    /* renamed from: h */
    public final C6910eq mo15480h(int i, C6910eq eqVar, boolean z) {
        this.f23825b.mo15480h(i, eqVar, z);
        if (aeu.m18533c(eqVar.f22037b, this.f23841e) && z) {
            eqVar.f22037b = f23839c;
        }
        return eqVar;
    }

    /* renamed from: i */
    public final int mo15481i(Object obj) {
        Object obj2;
        C6912es esVar = this.f23825b;
        if (f23839c.equals(obj) && (obj2 = this.f23841e) != null) {
            obj = obj2;
        }
        return esVar.mo15481i(obj);
    }

    /* renamed from: j */
    public final Object mo15482j(int i) {
        Object j = this.f23825b.mo15482j(i);
        return aeu.m18533c(j, this.f23841e) ? f23839c : j;
    }

    /* renamed from: k */
    public final C7315tq mo16538k(C6912es esVar) {
        return new C7315tq(esVar, this.f23840d, this.f23841e);
    }
}
