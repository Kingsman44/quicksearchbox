package com.google.android.apps.search.assistant.verticals.ambient.p9927i;

import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.i.b */
/* compiled from: PG */
public final class C130811b implements C47352j {

    /* renamed from: a */
    public final C58974d f358052a;

    /* renamed from: b */
    private final C123587c f358053b;

    /* renamed from: c */
    private final Executor f358054c;

    /* renamed from: d */
    private final boolean f358055d;

    public C130811b(C123587c cVar, Executor executor, C130603a aVar, boolean z) {
        this.f358053b = cVar;
        this.f358054c = executor;
        this.f358052a = aVar.mo109740b(this);
        this.f358055d = z;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        ((C58970a) ((C58970a) this.f358052a.mo56224b()).mo56372aa(38972)).mo56386p("Running synclet for holiday alarm");
        if (!this.f358055d) {
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(this.f358053b.mo106041a(C53306j.ASSISTANT_NOTIFICATIONS, C123755bv.f341837o, Optional.m71637of(new C58759qy(119)), C123777f.f341922a, false)).mo51516i(new C130810a(this), this.f358054c);
    }
}
