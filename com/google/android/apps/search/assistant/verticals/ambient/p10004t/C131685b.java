package com.google.android.apps.search.assistant.verticals.ambient.p10004t;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.t.b */
/* compiled from: PG */
public final class C131685b implements C47352j {

    /* renamed from: a */
    public final C58974d f359789a;

    /* renamed from: b */
    public final C130895ag f359790b;

    /* renamed from: c */
    private final ExecutorService f359791c;

    /* renamed from: d */
    private final C131690b f359792d;

    /* renamed from: e */
    private final boolean f359793e;

    public C131685b(C130603a aVar, C130895ag agVar, ExecutorService executorService, C131690b bVar, boolean z) {
        this.f359790b = agVar;
        this.f359791c = executorService;
        this.f359792d = bVar;
        this.f359793e = z;
        this.f359789a = aVar.mo109740b(this);
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f359793e) {
            return C60866ct.f164955a;
        }
        C60870cx b = this.f359792d.mo110265b(false);
        C131684a aVar = new C131684a(this);
        C60856cj.m92911t(b, C47810es.m84974n(aVar), this.f359791c);
        return b;
    }
}
