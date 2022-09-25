package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.by */
/* compiled from: PG */
public final /* synthetic */ class C123344by implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123427f f341105a;

    /* renamed from: b */
    public final /* synthetic */ C80047aa f341106b;

    /* renamed from: c */
    public final /* synthetic */ C123427f f341107c;

    public /* synthetic */ C123344by(C123427f fVar, C80047aa aaVar, C123427f fVar2) {
        this.f341105a = fVar;
        this.f341106b = aaVar;
        this.f341107c = fVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123427f fVar = this.f341105a;
        C80047aa aaVar = this.f341106b;
        C123427f fVar2 = this.f341107c;
        String str = (String) obj;
        int i = C123377dd.f341141a;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = 0;
        int length = str.length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = length;
        return C123427f.m202783b(C123427f.m202783b(fVar, C123427f.m202785d(str, C58485gu.m89846n((C80047aa) xVar.build()))), fVar2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
