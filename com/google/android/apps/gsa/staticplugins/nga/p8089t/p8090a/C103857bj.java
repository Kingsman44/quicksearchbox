package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C103857bj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103857bj f289111a = new C103857bj();

    private /* synthetic */ C103857bj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C103886l lVar = (C103886l) obj;
        C103871bx bxVar = (C103871bx) C103872by.f289147e.createBuilder();
        int i = lVar.f289194b;
        bxVar.copyOnWrite();
        C103872by byVar = (C103872by) bxVar.instance;
        byVar.f289149a |= 1;
        byVar.f289150b = i;
        String valueOf = String.valueOf(lVar.f289196d.apply(lVar.f289193a));
        bxVar.copyOnWrite();
        C103872by byVar2 = (C103872by) bxVar.instance;
        valueOf.getClass();
        byVar2.f289149a |= 2;
        byVar2.f289151c = valueOf;
        return lVar.f289198f.mo28209i(lVar.f289199g.mo28201a("[NGA] get GMS value", new C103879e(lVar)), "[NGA] create dump flag", new C103880f(bxVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
