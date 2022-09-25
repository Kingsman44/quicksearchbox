package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.i */
/* compiled from: PG */
public final class C121131i implements C43019v {

    /* renamed from: a */
    private final C38469m f336576a;

    /* renamed from: b */
    private final C60887da f336577b;

    public C121131i(C38469m mVar, C60887da daVar) {
        this.f336576a = mVar;
        this.f336577b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C121124b bVar = (C121124b) messageLite;
        if ((bVar.f336565a & 1) != 0) {
            return C60856cj.m92900i(bVar);
        }
        C60870cx b = this.f336576a.mo41431b(C65753ak.PRIVACY_SETTINGS, C65806cj.PERSONAL_RESULTS.name(), C63662ac.f172144a, C65798cb.f178854e);
        C121127e eVar = C121127e.f336572a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(eVar), this.f336577b);
        C121128f fVar = new C121128f(bVar);
        return C60846c.m92878g(g, GellerException.class, C47810es.m84963c(fVar), this.f336577b);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
