package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import android.os.Bundle;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.aa */
/* compiled from: PG */
public final class C127678aa implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ Bundle f351513a;

    /* renamed from: b */
    final /* synthetic */ Duration f351514b;

    /* renamed from: c */
    final /* synthetic */ boolean f351515c;

    /* renamed from: d */
    final /* synthetic */ int f351516d;

    /* renamed from: e */
    final /* synthetic */ C127679ab f351517e;

    public C127678aa(C127679ab abVar, Bundle bundle, Duration duration, boolean z, int i) {
        this.f351517e = abVar;
        this.f351513a = bundle;
        this.f351514b = duration;
        this.f351515c = z;
        this.f351516d = i;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C59104x b = C127679ab.f351518a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcWpfOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37590)).mo56386p("#loadData");
        C60870cx d = this.f351517e.f351522e.mo46042d();
        C46459k.m82829b(d, "load failed", new Object[0]);
        return new C46463o(new C60817ay(C47633f.m84733g(d).mo51515h(new C127708x(this), C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C59104x b = C127679ab.f351518a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcWpfOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37592)).mo56386p("#fetchAndStoreData");
        C60870cx q = C60856cj.m92908q(this.f351517e.f351524g.mo108176a(this.f351513a), this.f351514b.toMillis(), TimeUnit.MILLISECONDS, this.f351517e.f351525h);
        C127702r rVar = new C127702r(this, this.f351515c, this.f351514b);
        C60870cx h = C60922j.m93045h(q, C47810es.m84966f(rVar), C60826bg.f164896a);
        C60870cx q2 = C60856cj.m92908q(((C42876ab) this.f351517e.f351523f.mo27525b()).mo46042d(), this.f351517e.f351520c.longValue(), TimeUnit.MILLISECONDS, this.f351517e.f351525h);
        C127703s sVar = new C127703s(this, this.f351516d);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(sVar), C60826bg.f164896a);
        C127679ab abVar = this.f351517e;
        abVar.f351529l = abVar.f351527j.mo57444a();
        Instant instant = this.f351517e.f351529l;
        instant.getClass();
        instant.toEpochMilli();
        this.f351517e.f351528k = C58872ci.m90947d(C58274c.f155808a);
        return C47633f.m84733g(h).mo51516i(new C127704t(this), C60826bg.f164896a).mo51514f(Exception.class, new C127705u(this, q2), C60826bg.f164896a).mo51514f(Exception.class, new C127706v(this, m), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return "con_learning_center_grpc_content";
    }
}
