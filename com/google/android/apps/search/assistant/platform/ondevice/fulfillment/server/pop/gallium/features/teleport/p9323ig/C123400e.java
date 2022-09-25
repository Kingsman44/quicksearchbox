package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.e */
/* compiled from: PG */
public final /* synthetic */ class C123400e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123427f f341163a;

    public /* synthetic */ C123400e(C123427f fVar) {
        this.f341163a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123427f fVar = this.f341163a;
        C80047aa aaVar = (C80047aa) obj;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        int i = aaVar.f219660d;
        int length = fVar.mo105929i().length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = i + length;
        int i2 = aaVar.f219661e;
        int length2 = fVar.mo105929i().length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = i2 + length2;
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
