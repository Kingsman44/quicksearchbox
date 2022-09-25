package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.w */
/* compiled from: PG */
public final class C113110w extends C112473ar {

    /* renamed from: a */
    public static final C121537f f313387a = C121537f.m200840b("Tapas/GeminiUserProfileSignalFetcher", C121511c.f337208a);

    /* renamed from: b */
    public static final C65753ak f313388b = C65753ak.TAPAS_USER_PROFILE;

    /* renamed from: c */
    public static final Duration f313389c = Duration.ofDays(14);

    /* renamed from: d */
    public final C22871g f313390d;

    /* renamed from: e */
    public final C21370a f313391e;

    /* renamed from: f */
    public final i f313392f;

    /* renamed from: g */
    public final C86054o f313393g;

    /* renamed from: h */
    private final C113425ff f313394h;

    public C113110w(C22871g gVar, C21370a aVar, i iVar, C86054o oVar, C113425ff ffVar) {
        this.f313390d = gVar;
        this.f313391e = aVar;
        this.f313392f = iVar;
        this.f313393g = oVar;
        this.f313394h = ffVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.MINUTES.toMillis(1);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        return this.f313390d.mo28210j(this.f313394h.mo100136b(), "read Gemini user profile", new C113108u(this));
    }
}
