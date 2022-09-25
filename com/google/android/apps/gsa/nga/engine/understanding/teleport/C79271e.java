package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.e */
/* compiled from: PG */
public final /* synthetic */ class C79271e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79309g f217739a;

    public /* synthetic */ C79271e(C79309g gVar) {
        this.f217739a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79309g gVar = this.f217739a;
        C80047aa aaVar = (C80047aa) obj;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        int i = aaVar.f219660d;
        C79317o oVar = (C79317o) gVar;
        int i2 = oVar.f217816a;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = i - i2;
        int i3 = aaVar.f219661e;
        int i4 = oVar.f217816a;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = i3 - i4;
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
