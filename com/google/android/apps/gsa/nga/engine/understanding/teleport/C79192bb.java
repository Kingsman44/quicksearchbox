package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bb */
/* compiled from: PG */
public final /* synthetic */ class C79192bb implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217656a;

    /* renamed from: b */
    public final /* synthetic */ C80047aa f217657b;

    /* renamed from: c */
    public final /* synthetic */ C79298f f217658c;

    public /* synthetic */ C79192bb(C79298f fVar, C80047aa aaVar, C79298f fVar2) {
        this.f217656a = fVar;
        this.f217657b = aaVar;
        this.f217658c = fVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79298f fVar = this.f217656a;
        C80047aa aaVar = this.f217657b;
        C79298f fVar2 = this.f217658c;
        String str = (String) obj;
        int i = C79204bn.f217670a;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = 0;
        int length = str.length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = length;
        return C79298f.m127225a(C79298f.m127225a(fVar, C79298f.m127227c(str, C58485gu.m89846n((C80047aa) xVar.build()))), fVar2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
