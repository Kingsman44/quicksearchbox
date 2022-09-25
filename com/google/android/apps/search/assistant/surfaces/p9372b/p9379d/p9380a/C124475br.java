package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.nga.engine.p6038j.C76193h;
import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124383c;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124384d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.io.Closeable;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.br */
/* compiled from: PG */
public final class C124475br implements Closeable, C124383c, C124384d {

    /* renamed from: a */
    public static final C59071e f343502a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.d.a.br");

    /* renamed from: b */
    public final Executor f343503b;

    /* renamed from: c */
    public final C119259a f343504c;

    /* renamed from: d */
    public final C119259a f343505d;

    /* renamed from: e */
    public final Map f343506e = new EnumMap(C124477bt.class);

    /* renamed from: f */
    public final Executor f343507f;

    /* renamed from: g */
    public final C70862aj f343508g;

    /* renamed from: h */
    public final AccountId f343509h;

    /* renamed from: i */
    volatile Consumer f343510i;

    /* renamed from: j */
    volatile Consumer f343511j;

    public C124475br(Executor executor, C124478c cVar, AccountId accountId) {
        this.f343503b = new C60904dr(executor);
        this.f343509h = accountId;
        this.f343504c = new C119259a(C124455az.f343464c);
        this.f343505d = new C119259a(Optional.empty());
        this.f343507f = executor;
        this.f343508g = C70876o.m103761b(cVar.f189039a.mo39510a(C124480e.m203953b(), cVar.f189040b), new C124474bq(this), true);
    }

    /* renamed from: f */
    private final C60870cx m203941f(C124477bt btVar) {
        C124470bm bmVar = new C124470bm(btVar);
        return C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(bmVar), this.f343503b)).mo51516i(new C124471bn(this, btVar), this.f343503b);
    }

    /* renamed from: g */
    private final C60870cx m203942g() {
        C124472bo boVar = new C124472bo(this);
        return C60856cj.m92903l(C47810es.m84977q(boVar), this.f343503b);
    }

    /* renamed from: a */
    public final C60870cx mo106408a() {
        return m203941f(C124477bt.START_REQUEST);
    }

    /* renamed from: b */
    public final C60870cx mo106409b() {
        return m203941f(C124477bt.STOP_REQUEST);
    }

    /* renamed from: c */
    public final void mo106410c() {
        C46459k.m82829b(m203942g(), "[unregister] Failed to unsubscribe", new Object[0]);
    }

    public final void close() {
        mo106431e();
    }

    /* renamed from: d */
    public final void mo106411d(C76193h hVar) {
        C46459k.m82829b(C47633f.m84733g(m203942g()).mo51515h(new C124466bi(this, hVar), this.f343503b), "[registerCallback] Failed to register", new Object[0]);
    }

    /* renamed from: e */
    public final void mo106431e() {
        for (C2164c c : this.f343506e.values()) {
            c.mo5438c();
        }
        this.f343508g.mo20121a();
    }
}
