package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.n.j */
/* compiled from: PG */
public final /* synthetic */ class C19022j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C19023k f53407a;

    /* renamed from: b */
    public final /* synthetic */ C18718c f53408b;

    public /* synthetic */ C19022j(C19023k kVar, C18718c cVar) {
        this.f53407a = kVar;
        this.f53408b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C19023k kVar = this.f53407a;
        C18718c cVar = this.f53408b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new IllegalArgumentException("No CLIENT_TYPE context supplier found."));
        }
        C60870cx c = kVar.f53409a.mo24247c((C53306j) optional.get(), cVar);
        C19021i iVar = new C19021i(kVar, optional);
        return C60922j.m93044g(c, C47810es.m84963c(iVar), kVar.f53410b);
    }
}
