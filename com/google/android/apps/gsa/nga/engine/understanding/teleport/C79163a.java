package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.a */
/* compiled from: PG */
public final /* synthetic */ class C79163a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217623a;

    public /* synthetic */ C79163a(C79298f fVar) {
        this.f217623a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79298f fVar = this.f217623a;
        C80047aa aaVar = (C80047aa) obj;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        int i = aaVar.f219660d;
        int length = fVar.mo73864j().length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = i + length;
        int i2 = aaVar.f219661e;
        int length2 = fVar.mo73864j().length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = i2 + length2;
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
