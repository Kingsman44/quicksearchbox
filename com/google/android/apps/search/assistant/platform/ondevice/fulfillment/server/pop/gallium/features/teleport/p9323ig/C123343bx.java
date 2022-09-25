package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bx */
/* compiled from: PG */
public final /* synthetic */ class C123343bx implements Function {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f341103a;

    /* renamed from: b */
    public final /* synthetic */ Set f341104b;

    public /* synthetic */ C123343bx(C80047aa aaVar, Set set) {
        this.f341103a = aaVar;
        this.f341104b = set;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80047aa aaVar = this.f341103a;
        Set set = this.f341104b;
        C123427f fVar = (C123427f) obj;
        int i = C123377dd.f341141a;
        return Collection.EL.stream((C58485gu) Collection.EL.stream(C123377dd.m202732b(aaVar, set)).map(new C123344by(fVar.mo106008g(C123454g.m202802c(0, aaVar.f219660d)), aaVar, fVar.mo106008g(C123454g.m202802c(aaVar.f219661e, fVar.mo105929i().length())))).collect(C58370cn.f155946a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
