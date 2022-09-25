package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131116a;
import com.google.assistant.p4016z.C53694as;
import com.google.assistant.p4016z.C53698aw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4479cg.C58079k;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.s */
/* compiled from: PG */
public final /* synthetic */ class C131807s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C53698aw f360001a;

    public /* synthetic */ C131807s(C53698aw awVar) {
        this.f360001a = awVar;
    }

    public final C60870cx apply(Object obj) {
        C53698aw awVar = this.f360001a;
        C131116a aVar = (C131116a) obj;
        C53694as asVar = awVar.f140962c;
        if (asVar == null) {
            asVar = C53694as.f140951e;
        }
        long j = asVar.f140956d;
        C53694as asVar2 = awVar.f140962c;
        if (asVar2 == null) {
            asVar2 = C53694as.f140951e;
        }
        C58079k kVar = asVar2.f140955c;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        return aVar.mo110081b(j, kVar);
    }
}
