package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5127o.C65656ak;
import com.google.protos.p5127o.C65657al;
import dagger.C68214a;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.j */
/* compiled from: PG */
public final /* synthetic */ class C123536j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122985af f341364a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f341365b;

    /* renamed from: c */
    public final /* synthetic */ Set f341366c;

    public /* synthetic */ C123536j(C122985af afVar, C68214a aVar, Set set) {
        this.f341364a = afVar;
        this.f341365b = aVar;
        this.f341366c = set;
    }

    public final C60870cx apply(Object obj) {
        C122985af afVar = this.f341364a;
        C68214a aVar = this.f341365b;
        Set set = this.f341366c;
        GalliumIpc galliumIpc = (GalliumIpc) obj;
        afVar.mo105812a(new C123543q(aVar));
        if (set.isEmpty()) {
            return C60866ct.f164955a;
        }
        long j = galliumIpc.f51691d;
        C65656ak akVar = (C65656ak) C65657al.f178404b.createBuilder();
        akVar.copyOnWrite();
        C65657al alVar = (C65657al) akVar.instance;
        C62971cq cqVar = alVar.f178406a;
        if (!cqVar.mo58948c()) {
            alVar.f178406a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) set, (List) alVar.f178406a);
        return GalliumIpc.m35424k(galliumIpc.nativeAddKeepRunningTransitively(j, ((C65657al) akVar.build()).toByteArray()));
    }
}
