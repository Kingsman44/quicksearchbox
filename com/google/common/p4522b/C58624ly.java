package com.google.common.p4522b;

/* renamed from: com.google.common.b.ly */
/* compiled from: PG */
final class C58624ly implements C58609lj {

    /* renamed from: a */
    public static final C58624ly f156339a = new C58624ly();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C58608li mo55648a(C58613ln lnVar, C58608li liVar, C58608li liVar2) {
        C58627ma maVar = (C58627ma) lnVar;
        C58625lz lzVar = (C58625lz) liVar;
        C58625lz lzVar2 = (C58625lz) liVar2;
        if (lzVar.get() == null) {
            return null;
        }
        C58625lz lzVar3 = new C58625lz(maVar.f156342h, lzVar.get(), lzVar.f156311a, lzVar2);
        lzVar3.f156340c = lzVar.f156340c;
        return lzVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58608li mo55649b(C58613ln lnVar, Object obj, int i, C58608li liVar) {
        return new C58625lz(((C58627ma) lnVar).f156342h, obj, i, (C58625lz) liVar);
    }

    /* renamed from: c */
    public final C58615lp mo55650c() {
        return C58615lp.WEAK;
    }

    /* renamed from: d */
    public final C58615lp mo55651d() {
        return C58615lp.STRONG;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo55652e(C58613ln lnVar, C58608li liVar, Object obj) {
        C58627ma maVar = (C58627ma) lnVar;
        ((C58625lz) liVar).f156340c = obj;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58613ln mo55653f(C58635mi miVar, int i) {
        return new C58627ma(miVar, i);
    }
}
