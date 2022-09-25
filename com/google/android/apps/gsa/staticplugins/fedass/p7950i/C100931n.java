package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100761a;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.n */
/* compiled from: PG */
public final class C100931n implements C100926i {

    /* renamed from: a */
    public static final C59071e f281969a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.n");

    /* renamed from: b */
    private final C100784o f281970b;

    /* renamed from: c */
    private final Executor f281971c;

    /* renamed from: d */
    private final Context f281972d;

    public C100931n(C100784o oVar, Executor executor, Context context) {
        this.f281970b = oVar;
        this.f281971c = executor;
        this.f281972d = context;
    }

    /* renamed from: a */
    public final C60870cx mo92097a() {
        C100784o oVar = this.f281970b;
        Objects.requireNonNull(oVar);
        C100927j jVar = new C100927j(oVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(jVar), this.f281971c);
        C100761a.m166954a(this.f281972d);
        return C47633f.m84733g(n).mo51515h(new C100928k(), this.f281971c);
    }

    /* renamed from: b */
    public final C60870cx mo92098b() {
        C100784o oVar = this.f281970b;
        Objects.requireNonNull(oVar);
        C100927j jVar = new C100927j(oVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(jVar), this.f281971c);
        C100761a.m166954a(this.f281972d);
        return C47633f.m84733g(n).mo51515h(new C100929l(), this.f281971c);
    }

    /* renamed from: c */
    public final C60870cx mo92099c() {
        C100784o oVar = this.f281970b;
        Objects.requireNonNull(oVar);
        C100927j jVar = new C100927j(oVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(jVar), this.f281971c);
        C100761a.m166954a(this.f281972d);
        return C47633f.m84733g(n).mo51515h(new C100930m(), this.f281971c);
    }
}
