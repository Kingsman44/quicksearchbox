package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124476bs;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.b.j */
/* compiled from: PG */
public final class C124512j {

    /* renamed from: a */
    public final C119259a f343569a = new C119259a(C119834cb.f333765b);

    /* renamed from: b */
    public final C119259a f343570b = new C119259a(C119904w.f333909c);

    /* renamed from: c */
    public final C119259a f343571c = new C119259a(C119885dz.f333865f);

    /* renamed from: d */
    public final C119259a f343572d = new C119259a(C124476bs.UNKNOWN_STATE);

    /* renamed from: e */
    public final C119259a f343573e = new C119259a(C119844cl.f333788d);

    /* renamed from: f */
    public final C119259a f343574f = new C119259a(C119785ag.f333648b);

    /* renamed from: g */
    public final C119259a f343575g = new C119259a(Optional.empty());

    /* renamed from: h */
    private final Executor f343576h;

    /* renamed from: i */
    private final Executor f343577i;

    public C124512j(Executor executor) {
        this.f343577i = executor;
        this.f343576h = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo106444a() {
        mo106445b(new C124509g(this));
    }

    /* renamed from: b */
    public final void mo106445b(Runnable runnable) {
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(runnable), this.f343576h);
        C124511i iVar = new C124511i();
        C60856cj.m92911t(l, C47810es.m84974n(iVar), this.f343577i);
    }

    /* renamed from: c */
    public final void mo106446c(C124476bs bsVar) {
        mo106445b(new C124505c(this, bsVar));
    }
}
