package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.df */
/* compiled from: PG */
public final /* synthetic */ class C123379df implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f341145a;

    public /* synthetic */ C123379df(int i) {
        this.f341145a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f341145a;
        C80047aa aaVar = (C80047aa) obj;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar);
        int i2 = aaVar.f219660d;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = i2 - i;
        int i3 = aaVar.f219661e;
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = i3 - i;
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
