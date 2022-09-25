package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C11564aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11570ap f37477a;

    public /* synthetic */ C11564aj(C11570ap apVar) {
        this.f37477a = apVar;
    }

    public final C60870cx apply(Object obj) {
        C11570ap apVar = this.f37477a;
        C142660f fVar = (C142660f) obj;
        if (fVar == null) {
            return C60856cj.m92899h(new Exception("Failed to get session data due to unset ICarAssistantClientCallbacks."));
        }
        C11565ak akVar = new C11565ak(apVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(akVar), apVar.f37485c);
        C11555aa aaVar = new C11555aa(fVar);
        return C60922j.m93045h(m, C47810es.m84966f(aaVar), apVar.f37484b);
    }
}
