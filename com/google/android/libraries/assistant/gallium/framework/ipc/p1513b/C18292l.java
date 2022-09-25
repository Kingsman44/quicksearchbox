package com.google.android.libraries.assistant.gallium.framework.ipc.p1513b;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65670ay;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.b.l */
/* compiled from: PG */
public final /* synthetic */ class C18292l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18294n f51898a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f51899b;

    public /* synthetic */ C18292l(C18294n nVar, MessageLite messageLite) {
        this.f51898a = nVar;
        this.f51899b = messageLite;
    }

    public final C60870cx apply(Object obj) {
        C18294n nVar = this.f51898a;
        MessageLite messageLite = this.f51899b;
        Void voidR = (Void) obj;
        if (!nVar.f51904d.mo56113h()) {
            return C60856cj.m92899h(C18218av.m35478a(13, "Handle for writing stream is not set."));
        }
        if (!nVar.f51906f.get()) {
            return C60856cj.m92899h(C18218av.m35478a(9, "The stream is not writeable."));
        }
        C18238f fVar = nVar.f51910j;
        C62940bt btVar = C65674bb.f178443d;
        C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
        ayVar.copyOnWrite();
        C65674bb bbVar = (C65674bb) ayVar.instance;
        bbVar.f178446b = 2;
        bbVar.f178445a |= 1;
        fVar.f51797a.mo58885m(btVar, (C65674bb) ayVar.build());
        return C60922j.m93045h(nVar.f51908h.mo23657a(C18231d.f51786a, (C65682h) nVar.f51904d.mo56107c(), nVar.f51909i, messageLite, nVar.f51911k, nVar.f51912l, nVar.f51910j), C47810es.m84966f(C18290j.f51895a), nVar.f51908h.mo23659c());
    }
}
