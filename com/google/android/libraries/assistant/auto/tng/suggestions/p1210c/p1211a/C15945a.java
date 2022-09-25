package com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16685ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16345as;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15945a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15948d f47316a;

    public /* synthetic */ C15945a(C15948d dVar) {
        this.f47316a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C15948d dVar = this.f47316a;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C16685ar.m33751a(((Boolean) dVar.f47323e.mo17428b()).booleanValue()));
        }
        C16345as asVar = (C16345as) C16347au.f48122b.createBuilder();
        asVar.mo22888a(C58495hd.m89900n(3, 3));
        C60870cx a = dVar.f47320b.mo22915a("voiceplate_immersive_display_id", (C16347au) asVar.build());
        C15947c cVar = new C15947c(dVar);
        return C60922j.m93044g(a, C47810es.m84963c(cVar), dVar.f47321c);
    }
}
