package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9211a;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.a.e */
/* compiled from: PG */
public final class C121385e implements C121214b {

    /* renamed from: a */
    public static final C58974d f337014a = C58974d.m91136j();

    /* renamed from: b */
    public final C60950i f337015b;

    /* renamed from: c */
    private final C38469m f337016c;

    /* renamed from: d */
    private final Executor f337017d;

    public C121385e(C60950i iVar, C38469m mVar, Executor executor) {
        this.f337015b = iVar;
        this.f337016c = mVar;
        this.f337017d = executor;
    }

    /* renamed from: a */
    public final /* synthetic */ Duration mo105081a() {
        return Duration.ofDays(1);
    }

    /* renamed from: b */
    public final /* synthetic */ Duration mo105082b() {
        return Duration.ofHours(4);
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo105083c() {
        return true;
    }

    /* renamed from: d */
    public final C60870cx mo105084d() {
        C60870cx d = this.f337016c.mo41433d(C65753ak.APP_ACTIONS, (String) null, C63662ac.f172144a, 1, C49301bt.f127423f);
        C121381a aVar = new C121381a(this);
        return C60922j.m93044g(d, C47810es.m84963c(aVar), this.f337017d);
    }
}
