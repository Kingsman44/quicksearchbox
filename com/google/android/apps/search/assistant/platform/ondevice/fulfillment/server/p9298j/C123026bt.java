package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.bt */
/* compiled from: PG */
public final class C123026bt {

    /* renamed from: a */
    public static final C59071e f340580a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.bt");

    /* renamed from: b */
    public final C123011be f340581b;

    /* renamed from: c */
    private final C60950i f340582c;

    /* renamed from: d */
    private final Optional f340583d;

    /* renamed from: e */
    private final C47770dh f340584e;

    /* renamed from: f */
    private final Executor f340585f;

    /* renamed from: g */
    private final C60888db f340586g;

    /* renamed from: h */
    private C123025bs f340587h = new C123010bd();

    public C123026bt(C123011be beVar, Optional optional, Executor executor, C60950i iVar, C47770dh dhVar, C60888db dbVar) {
        this.f340581b = beVar;
        this.f340582c = iVar;
        this.f340583d = optional;
        this.f340584e = dhVar;
        this.f340585f = executor;
        this.f340586g = dbVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105833a() {
        return this.f340587h.mo105823a();
    }

    /* renamed from: b */
    public final synchronized C60870cx mo105834b() {
        C60870cx b = this.f340587h.mo105824b();
        if (b == null) {
            this.f340587h.mo105826d();
            return this.f340587h.mo105825c();
        }
        C123005az azVar = C123005az.f340552a;
        Class<Throwable> cls = Throwable.class;
        C60870cx g = C60846c.m92878g(b, cls, C47810es.m84963c(azVar), C60826bg.f164896a);
        C122990ak akVar = new C122990ak();
        C123024br brVar = new C123024br(C47633f.m84733g(g).mo51516i(new C123007ba(this, akVar), this.f340585f).mo51514f(Throwable.class, new C123008bb(akVar), C60826bg.f164896a), akVar, this.f340583d, this.f340582c, this.f340584e, this.f340586g);
        this.f340587h = brVar;
        return brVar.mo105825c();
    }

    /* renamed from: c */
    public final synchronized C60870cx mo105835c() {
        if (this.f340587h.mo105824b() == null) {
            C60870cx c = this.f340587h.mo105825c();
            C123009bc bcVar = C123009bc.f340558a;
            return C60922j.m93044g(c, C47810es.m84963c(bcVar), C60826bg.f164896a);
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: d */
    public final synchronized void mo105836d() {
        this.f340587h.mo105826d();
    }
}
