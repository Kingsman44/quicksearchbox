package com.google.android.apps.search.googleapp.p10357n.p10358a;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.p10533v.p10534a.C139853b;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.n.a.j */
/* compiled from: PG */
public final class C136702j {

    /* renamed from: a */
    public final C44058f f372106a;

    /* renamed from: b */
    private final C61531o f372107b;

    /* renamed from: c */
    private final C139853b f372108c;

    /* renamed from: d */
    private final C133665d f372109d;

    /* renamed from: e */
    private final Executor f372110e;

    /* renamed from: f */
    private final C44074i f372111f;

    public C136702j(C61531o oVar, C139853b bVar, C133665d dVar, Executor executor, C44058f fVar, C44074i iVar) {
        this.f372107b = oVar;
        this.f372108c = bVar;
        this.f372109d = dVar;
        this.f372110e = executor;
        this.f372106a = fVar;
        this.f372111f = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo113333a(C54118q qVar, int i) {
        C60870cx b = this.f372111f.mo47042b(C43271v.WEB_VIEW);
        C136698f fVar = new C136698f(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(fVar), this.f372110e);
        C60870cx a = this.f372108c.mo115317a(true, true);
        C60870cx a2 = this.f372109d.mo111320a();
        C47633f g = C47633f.m84733g(C47638k.m84753d(h, a, a2).mo51520a(new C136699g(a, h, a2, qVar, i), this.f372110e));
        C61531o oVar = this.f372107b;
        Objects.requireNonNull(oVar);
        return g.mo51516i(new C136700h(oVar), this.f372110e).mo51516i(C136701i.f372105a, this.f372110e);
    }
}
