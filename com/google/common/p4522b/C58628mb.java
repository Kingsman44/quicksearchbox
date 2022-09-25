package com.google.common.p4522b;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.google.common.b.mb */
/* compiled from: PG */
final class C58628mb implements C58609lj {

    /* renamed from: a */
    public static final C58628mb f156343a = new C58628mb();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C58608li mo55648a(C58613ln lnVar, C58608li liVar, C58608li liVar2) {
        C58630md mdVar = (C58630md) lnVar;
        C58629mc mcVar = (C58629mc) liVar;
        C58629mc mcVar2 = (C58629mc) liVar2;
        if (mcVar.get() == null || C58613ln.m90256m(mcVar)) {
            return null;
        }
        ReferenceQueue referenceQueue = mdVar.f156345h;
        ReferenceQueue referenceQueue2 = mdVar.f156346i;
        C58629mc mcVar3 = new C58629mc(referenceQueue, mcVar.get(), mcVar.f156311a, mcVar2);
        mcVar3.f156344c = mcVar.f156344c.mo55630b(referenceQueue2, mcVar3);
        return mcVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58608li mo55649b(C58613ln lnVar, Object obj, int i, C58608li liVar) {
        return new C58629mc(((C58630md) lnVar).f156345h, obj, i, (C58629mc) liVar);
    }

    /* renamed from: c */
    public final C58615lp mo55650c() {
        return C58615lp.WEAK;
    }

    /* renamed from: d */
    public final C58615lp mo55651d() {
        return C58615lp.WEAK;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo55652e(C58613ln lnVar, C58608li liVar, Object obj) {
        C58629mc mcVar = (C58629mc) liVar;
        ReferenceQueue referenceQueue = ((C58630md) lnVar).f156346i;
        C58632mf mfVar = mcVar.f156344c;
        mcVar.f156344c = new C58633mg(referenceQueue, obj, mcVar);
        mfVar.clear();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58613ln mo55653f(C58635mi miVar, int i) {
        return new C58630md(miVar, i);
    }
}
