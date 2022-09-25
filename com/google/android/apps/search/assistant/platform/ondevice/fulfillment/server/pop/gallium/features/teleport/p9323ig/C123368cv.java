package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import java.util.List;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cv */
/* compiled from: PG */
public final /* synthetic */ class C123368cv implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ List f341132a;

    public /* synthetic */ C123368cv(List list) {
        this.f341132a = list;
    }

    public final Object apply(int i) {
        List list = this.f341132a;
        int i2 = C123377dd.f341141a;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder((C80047aa) list.get(i));
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219664h = (long) i;
        return (C80047aa) xVar.build();
    }
}
