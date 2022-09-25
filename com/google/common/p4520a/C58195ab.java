package com.google.common.p4520a;

/* renamed from: com.google.common.a.ab */
/* compiled from: PG */
enum C58195ab {
    STRONG,
    WEAK;
    

    /* renamed from: i */
    static final C58195ab[] f155629i = null;

    static {
        C58195ab abVar;
        C58267v vVar;
        C58268w wVar;
        C58269x xVar;
        C58195ab abVar2;
        C58270y yVar;
        C58271z zVar;
        C58194aa aaVar;
        f155629i = new C58195ab[]{abVar, vVar, wVar, xVar, abVar2, yVar, zVar, aaVar};
    }

    /* renamed from: b */
    static C58195ab m88937b(C58212as asVar, boolean z, boolean z2) {
        char c = 0;
        boolean z3 = (asVar == C58212as.WEAK ? (char) 4 : 0) | z;
        if (true == z2) {
            c = 2;
        }
        return f155629i[z3 | c];
    }

    /* renamed from: d */
    static final void m88938d(C58241bu buVar, C58241bu buVar2) {
        buVar2.mo54727k(buVar.mo54718b());
        C58234bn.m89129h(buVar.mo54724h(), buVar2);
        C58234bn.m89129h(buVar2, buVar.mo54722f());
        C58234bn.m89131j(buVar);
    }

    /* renamed from: e */
    static final void m88939e(C58241bu buVar, C58241bu buVar2) {
        buVar2.mo54733q(buVar.mo54719c());
        C58234bn.m89130i(buVar.mo54725i(), buVar2);
        C58234bn.m89130i(buVar2, buVar.mo54723g());
        C58234bn.m89132k(buVar);
    }

    /* renamed from: a */
    public C58241bu mo54686a(C58210aq aqVar, C58241bu buVar, C58241bu buVar2) {
        return mo54687c(aqVar, buVar.mo54726j(), buVar.mo54717a(), buVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58241bu mo54687c(C58210aq aqVar, Object obj, int i, C58241bu buVar) {
        switch (ordinal()) {
            case 0:
                return new C58215av(obj, i, buVar);
            case 1:
                return new C58213at(obj, i, buVar);
            case 2:
                return new C58217ax(obj, i, buVar);
            case 3:
                return new C58214au(obj, i, buVar);
            case 4:
                return new C58224bd(aqVar.f155675h, obj, i, buVar);
            case 5:
                return new C58222bb(aqVar.f155675h, obj, i, buVar);
            case 6:
                return new C58226bf(aqVar.f155675h, obj, i, buVar);
            case 7:
                return new C58223bc(aqVar.f155675h, obj, i, buVar);
            default:
                throw null;
        }
    }
}
