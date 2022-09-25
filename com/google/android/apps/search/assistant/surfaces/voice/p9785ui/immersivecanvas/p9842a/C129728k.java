package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129710g;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.alb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.k */
/* compiled from: PG */
public final class C129728k implements C17266e {

    /* renamed from: a */
    public static final C59071e f355985a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.k");

    /* renamed from: b */
    public final C129710g f355986b;

    /* renamed from: c */
    public final C129703a f355987c;

    /* renamed from: d */
    public final alb f355988d;

    /* renamed from: e */
    private final Executor f355989e;

    /* renamed from: f */
    private final C60870cx f355990f;

    public C129728k(Executor executor, C129710g gVar, C129703a aVar, C60870cx cxVar, alb alb) {
        this.f355989e = executor;
        this.f355986b = gVar;
        this.f355987c = aVar;
        this.f355990f = cxVar;
        this.f355988d = alb;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        return C60856cj.m92900i(new C129727j(this));
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        C60870cx cxVar = this.f355990f;
        C129726i iVar = new C129726i(this, consumer);
        return C60922j.m93045h(cxVar, C47810es.m84966f(iVar), this.f355989e);
    }
}
