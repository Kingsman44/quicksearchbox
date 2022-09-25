package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130808j;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130732b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130734d;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.aa */
/* compiled from: PG */
public final class C130704aa implements C130734d, C130732b {

    /* renamed from: a */
    public final C58974d f357873a;

    /* renamed from: b */
    public final C38469m f357874b;

    /* renamed from: c */
    public final C130895ag f357875c;

    /* renamed from: d */
    public final C60950i f357876d;

    /* renamed from: e */
    public final ExecutorService f357877e;

    /* renamed from: f */
    public final C130712h f357878f = new C130712h();

    /* renamed from: g */
    private final C130808j f357879g;

    public C130704aa(C130603a aVar, C38469m mVar, C130895ag agVar, C60950i iVar, C130808j jVar, ExecutorService executorService) {
        this.f357873a = aVar.mo109740b(this);
        this.f357874b = mVar;
        this.f357875c = agVar;
        this.f357879g = jVar;
        this.f357877e = executorService;
        this.f357876d = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo109799a() {
        C60870cx c = mo109801c();
        C130731z zVar = C130731z.f357920a;
        return C60922j.m93044g(c, C47810es.m84963c(zVar), this.f357877e);
    }

    /* renamed from: b */
    public final void mo109800b(C21850cf cfVar) {
        if (cfVar.mo27153c().contains("HP_MEDIA_PROFILE")) {
            this.f357878f.mo109803b(new C130730y(this));
        }
    }

    /* renamed from: c */
    public final C60870cx mo109801c() {
        C60870cx a = this.f357879g.mo109812a();
        C130728w wVar = new C130728w(this);
        return C60922j.m93045h(a, C47810es.m84966f(wVar), this.f357877e);
    }
}
