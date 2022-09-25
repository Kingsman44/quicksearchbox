package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130808j;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130702a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130732b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.f */
/* compiled from: PG */
public final class C130710f implements C130702a, C130732b {

    /* renamed from: a */
    public final C38469m f357884a;

    /* renamed from: b */
    public final C130895ag f357885b;

    /* renamed from: c */
    public final ExecutorService f357886c;

    /* renamed from: d */
    public final C130712h f357887d = new C130712h();

    /* renamed from: e */
    private final C130808j f357888e;

    public C130710f(C130603a aVar, C38469m mVar, C130895ag agVar, C130808j jVar, ExecutorService executorService) {
        aVar.mo109740b(this);
        this.f357884a = mVar;
        this.f357888e = jVar;
        this.f357885b = agVar;
        this.f357886c = executorService;
    }

    /* renamed from: a */
    public final C60870cx mo109798a() {
        C60870cx a = this.f357888e.mo109812a();
        C130707c cVar = new C130707c(this);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), this.f357886c);
    }

    /* renamed from: b */
    public final void mo109800b(C21850cf cfVar) {
        if (cfVar.mo27153c().contains("HP_AWAKE_PROFILE")) {
            this.f357887d.mo109803b(new C130703a(this));
        }
    }
}
