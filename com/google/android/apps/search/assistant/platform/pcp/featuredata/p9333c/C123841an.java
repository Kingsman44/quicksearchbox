package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.an */
/* compiled from: PG */
public final class C123841an {

    /* renamed from: a */
    public final C123827a f342104a;

    /* renamed from: b */
    public final Executor f342105b;

    /* renamed from: c */
    public final Duration f342106c;

    /* renamed from: d */
    public final C124100bz f342107d;

    /* renamed from: e */
    public final C123615ah f342108e;

    /* renamed from: f */
    public final C58974d f342109f;

    /* renamed from: g */
    private final C60950i f342110g;

    /* renamed from: h */
    private final boolean f342111h;

    public C123841an(C123827a aVar, C60950i iVar, C124100bz bzVar, C123615ah ahVar, Executor executor, C62910ar arVar, boolean z, C130603a aVar2) {
        this.f342104a = aVar;
        this.f342110g = iVar;
        this.f342107d = bzVar;
        this.f342108e = ahVar;
        this.f342105b = executor;
        this.f342106c = Duration.ofSeconds(arVar.f169860a);
        this.f342109f = aVar2.mo109739a("PCP.LocalCalendarRecon");
        this.f342111h = z;
    }

    /* renamed from: a */
    public final C60870cx mo106141a() {
        if (!this.f342111h) {
            return C60866ct.f164955a;
        }
        Instant a = this.f342110g.mo57444a();
        return C47638k.m84753d(C47633f.m84733g(this.f342108e.mo106071a()).mo51516i(new C123834ag(this, a), this.f342105b)).mo51521b(new C123835ah(this, a), this.f342105b);
    }
}
