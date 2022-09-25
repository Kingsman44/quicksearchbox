package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import android.os.Bundle;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
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
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.p */
/* compiled from: PG */
public final class C127700p implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ Bundle f351561a;

    /* renamed from: b */
    final /* synthetic */ Duration f351562b;

    /* renamed from: c */
    final /* synthetic */ boolean f351563c;

    /* renamed from: d */
    final /* synthetic */ C127701q f351564d;

    public C127700p(C127701q qVar, Bundle bundle, Duration duration, boolean z) {
        this.f351564d = qVar;
        this.f351561a = bundle;
        this.f351562b = duration;
        this.f351563c = z;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C59104x b = C127701q.f351565a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37581)).mo56386p("#loadData");
        C60870cx d = this.f351564d.f351570f.mo46042d();
        C46459k.m82829b(d, "load failed.", new Object[0]);
        return new C46463o(new C60817ay(C47633f.m84733g(d).mo51515h(new C127696l(this), C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C59104x b = C127701q.f351565a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcOlcDataService");
        ((C59052c) ((C59052c) b).mo56372aa(37583)).mo56386p("#fetchAndStoreData");
        C127701q qVar = this.f351564d;
        qVar.f351575k = qVar.f351573i.mo57444a();
        Instant instant = this.f351564d.f351575k;
        instant.getClass();
        instant.toEpochMilli();
        this.f351564d.f351574j = C58872ci.m90947d(C58274c.f155808a);
        return C47633f.m84733g(C60856cj.m92908q(this.f351564d.f351571g.mo108176a(this.f351561a), this.f351562b.toMillis(), TimeUnit.MILLISECONDS, this.f351564d.f351572h)).mo51516i(new C127692h(this, this.f351563c, this.f351562b), C60826bg.f164896a).mo51516i(new C127693i(this), C60826bg.f164896a).mo51514f(Exception.class, C127694j.f351555a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return "learning_center_grpc_content";
    }
}
