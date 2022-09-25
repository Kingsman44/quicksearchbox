package com.google.android.apps.search.assistant.verticals.ambient.p9933l.p9934a;

import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.l.a.b */
/* compiled from: PG */
public final class C130885b {

    /* renamed from: a */
    public final C21370a f358175a;

    /* renamed from: b */
    private final C38683aa f358176b;

    /* renamed from: c */
    private final C130895ag f358177c;

    /* renamed from: d */
    private final ExecutorService f358178d;

    public C130885b(C38683aa aaVar, C130895ag agVar, C21370a aVar, ExecutorService executorService) {
        this.f358176b = aaVar;
        this.f358177c = agVar;
        this.f358175a = aVar;
        this.f358178d = executorService;
    }

    /* renamed from: a */
    public final C60870cx mo109858a() {
        this.f358177c.mo109945r(true, true);
        C38683aa aaVar = this.f358176b;
        C38725y d = C38726z.m68011d(C39226b.TAG_ASSISTANT_AMBIENT);
        ((C38570a) d).f101954b = 3;
        return C47633f.m84733g(aaVar.mo41548b(d.mo41492a())).mo51515h(new C130884a(this), this.f358178d);
    }
}
