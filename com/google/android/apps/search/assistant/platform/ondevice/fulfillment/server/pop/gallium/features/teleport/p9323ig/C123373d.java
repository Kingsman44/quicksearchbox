package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.d */
/* compiled from: PG */
public final /* synthetic */ class C123373d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123454g f341137a;

    public /* synthetic */ C123373d(C123454g gVar) {
        this.f341137a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123454g gVar = this.f341137a;
        C80047aa aaVar = (C80047aa) obj;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        int i = aaVar.f219660d;
        C123305am amVar = (C123305am) gVar;
        int i2 = amVar.f341044a;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = i - i2;
        int i3 = aaVar.f219661e;
        int i4 = amVar.f341044a;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = i3 - i4;
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
