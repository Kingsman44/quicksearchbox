package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9308c;

import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32490c;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32491d;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32492e;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32493f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.c.c */
/* compiled from: PG */
public final /* synthetic */ class C123209c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32491d f340917a;

    public /* synthetic */ C123209c(C32491d dVar) {
        this.f340917a = dVar;
    }

    public final Object apply(Object obj) {
        C32491d dVar = this.f340917a;
        C32493f fVar = (C32493f) obj;
        C32492e eVar = (C32492e) fVar.toBuilder();
        C32490c cVar = dVar.f87066b;
        if (cVar == null) {
            cVar = C32490c.f87059b;
        }
        C62971cq cqVar = cVar.f87061a;
        if (cqVar.isEmpty()) {
            return (C32493f) eVar.build();
        }
        eVar.copyOnWrite();
        ((C32493f) eVar.instance).f87071b = C32493f.emptyProtobufList();
        eVar.mo38111a((C58485gu) Collection.EL.stream(fVar.f87071b).filter(new C123207a(cqVar)).collect(C58370cn.f155946a));
        return (C32493f) eVar.build();
    }
}
