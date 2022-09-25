package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.p4851a.p4852a.C63317a;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.a */
/* compiled from: PG */
public final /* synthetic */ class C123193a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C123202j f340890a;

    public /* synthetic */ C123193a(C123202j jVar) {
        this.f340890a = jVar;
    }

    public final void accept(Object obj) {
        C123202j jVar = this.f340890a;
        int i = C123196d.f340894b;
        C63317a aVar = (C63317a) ((C63318b) obj).toBuilder();
        aVar.copyOnWrite();
        C63318b bVar = (C63318b) aVar.instance;
        bVar.f171127a |= 32;
        bVar.f171133g = "External";
        jVar.copyOnWrite();
        C123203k kVar = (C123203k) jVar.instance;
        C63318b bVar2 = (C63318b) aVar.build();
        C123203k kVar2 = C123203k.f340906b;
        bVar2.getClass();
        C62971cq cqVar = kVar.f340908a;
        if (!cqVar.mo58948c()) {
            kVar.f340908a = C62942bv.mutableCopy(cqVar);
        }
        kVar.f340908a.add(bVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
