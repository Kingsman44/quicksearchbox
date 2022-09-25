package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.content.Context;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ar */
/* compiled from: PG */
public final class C101137ar {

    /* renamed from: a */
    public static final C59071e f282348a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.l.ar");

    /* renamed from: b */
    public final Context f282349b;

    /* renamed from: c */
    public final C100784o f282350c;

    /* renamed from: d */
    public final C19427e f282351d;

    /* renamed from: e */
    public final Executor f282352e;

    public C101137ar(Context context, C100784o oVar, C19427e eVar, Executor executor) {
        this.f282349b = context;
        this.f282350c = oVar;
        this.f282351d = eVar;
        this.f282352e = executor;
    }

    /* renamed from: a */
    public final void mo92139a(Optional optional, c cVar) {
        this.f282351d.mo24615a();
        C100784o oVar = this.f282350c;
        Objects.requireNonNull(oVar);
        C101130ak akVar = new C101130ak(oVar);
        C47633f h = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(akVar), this.f282352e)).mo51515h(new C101131al(this, optional, cVar), this.f282352e);
        C101136aq aqVar = new C101136aq();
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(aqVar), this.f282352e);
    }
}
