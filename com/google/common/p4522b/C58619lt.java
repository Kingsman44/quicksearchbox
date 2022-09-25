package com.google.common.p4522b;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.google.common.b.lt */
/* compiled from: PG */
final class C58619lt implements C58609lj {

    /* renamed from: a */
    public static final C58619lt f156335a = new C58619lt();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C58608li mo55648a(C58613ln lnVar, C58608li liVar, C58608li liVar2) {
        C58621lv lvVar = (C58621lv) lnVar;
        C58620lu luVar = (C58620lu) liVar;
        C58620lu luVar2 = (C58620lu) liVar2;
        if (C58613ln.m90256m(luVar)) {
            return null;
        }
        ReferenceQueue referenceQueue = lvVar.f156337h;
        C58620lu luVar3 = new C58620lu(luVar.f156308a, luVar.f156309b, luVar2);
        luVar3.f156336d = luVar.f156336d.mo55630b(referenceQueue, luVar3);
        return luVar3;
    }

    /* renamed from: b */
    public final /* synthetic */ C58608li mo55649b(C58613ln lnVar, Object obj, int i, C58608li liVar) {
        C58621lv lvVar = (C58621lv) lnVar;
        return new C58620lu(obj, i, (C58620lu) liVar);
    }

    /* renamed from: c */
    public final C58615lp mo55650c() {
        return C58615lp.STRONG;
    }

    /* renamed from: d */
    public final C58615lp mo55651d() {
        return C58615lp.WEAK;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo55652e(C58613ln lnVar, C58608li liVar, Object obj) {
        C58620lu luVar = (C58620lu) liVar;
        ReferenceQueue referenceQueue = ((C58621lv) lnVar).f156337h;
        C58632mf mfVar = luVar.f156336d;
        luVar.f156336d = new C58633mg(referenceQueue, obj, luVar);
        mfVar.clear();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58613ln mo55653f(C58635mi miVar, int i) {
        return new C58621lv(miVar, i);
    }
}
