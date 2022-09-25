package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ag */
/* compiled from: PG */
public final /* synthetic */ class C79170ag implements Function {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f217631a;

    /* renamed from: b */
    public final /* synthetic */ Set f217632b;

    public /* synthetic */ C79170ag(C80047aa aaVar, Set set) {
        this.f217631a = aaVar;
        this.f217632b = set;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80047aa aaVar = this.f217631a;
        Set set = this.f217632b;
        C79298f fVar = (C79298f) obj;
        int i = C79204bn.f217670a;
        return Collection.EL.stream((C58485gu) Collection.EL.stream(C79204bn.m127149b(aaVar, set)).map(new C79192bb(fVar.mo73860f(C79309g.m127241c(0, aaVar.f219660d)), aaVar, fVar.mo73860f(C79309g.m127241c(aaVar.f219661e, fVar.mo73864j().length())))).collect(C58370cn.f155946a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
