package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bq */
/* compiled from: PG */
public final class C130932bq implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C130934bs f358264a;

    /* renamed from: b */
    final /* synthetic */ C130931bp f358265b;

    public C130932bq(C130934bs bsVar, C130931bp bpVar) {
        this.f358264a = bsVar;
        this.f358265b = bpVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        ((C58970a) ((C58970a) this.f358264a.f358271e.mo56225c()).mo56382g(th)).mo56386p("Error executing sync.");
        this.f358264a.f358267a.mo41709x("FAILURE", this.f358265b.f358263c, BuildConfig.FLAVOR, -1);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C130930bo boVar = (C130930bo) obj;
        C69664n.m101061g(boVar, "status");
        String c = boVar instanceof C130921bf ? ((C130921bf) boVar).mo109969c() : BuildConfig.FLAVOR;
        Instant a = boVar.mo109967a();
        int minutes = a != null ? (int) Duration.between(a, this.f358264a.f358268b.mo57444a()).toMinutes() : -1;
        ((C58970a) this.f358264a.f358271e.mo56224b()).mo56360M("%s Type: %s, App: %s, Minutes since last update: %d", boVar.mo109970d(), this.f358265b.f358263c, c, Integer.valueOf(minutes));
        this.f358264a.f358267a.mo41709x(boVar.mo109970d(), this.f358265b.f358263c, c, minutes);
    }
}
