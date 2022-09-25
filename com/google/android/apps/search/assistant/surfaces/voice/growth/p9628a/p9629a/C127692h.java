package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4008y.p4009a.C53608q;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C127692h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127700p f351551a;

    /* renamed from: b */
    public final /* synthetic */ boolean f351552b;

    /* renamed from: c */
    public final /* synthetic */ Duration f351553c;

    public /* synthetic */ C127692h(C127700p pVar, boolean z, Duration duration) {
        this.f351551a = pVar;
        this.f351552b = z;
        this.f351553c = duration;
    }

    public final C60870cx apply(Object obj) {
        C127700p pVar = this.f351551a;
        boolean z = this.f351552b;
        Duration duration = this.f351553c;
        C37215b bVar = pVar.f351564d.f351576l;
        bVar.getClass();
        bVar.mo19974a(C37176a.f97307ja);
        return C60856cj.m92908q(C60856cj.m92901j(C47633f.m84733g(C60856cj.m92908q(pVar.f351564d.f351569e.mo108179a((C53608q) ((C58833ax) obj).mo56107c(), z), C127701q.f351566b.longValue(), TimeUnit.MILLISECONDS, pVar.f351564d.f351572h)).mo51516i(new C127697m(pVar), C60826bg.f164896a).mo51514f(TimeoutException.class, new C127698n(pVar), C60826bg.f164896a).mo51514f(Exception.class, new C127699o(pVar), C60826bg.f164896a)), duration.toMillis(), TimeUnit.MILLISECONDS, pVar.f351564d.f351572h);
    }
}
