package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.m */
/* compiled from: PG */
public final class C122563m implements C17597g {

    /* renamed from: a */
    public static final C59071e f339704a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.m");

    /* renamed from: b */
    public final C70862aj f339705b;

    /* renamed from: c */
    public final C122859d f339706c;

    /* renamed from: d */
    public final Map f339707d = new HashMap();

    /* renamed from: e */
    public final AtomicLong f339708e = new AtomicLong();

    /* renamed from: f */
    public final Executor f339709f;

    /* renamed from: g */
    public boolean f339710g;

    public C122563m(C70862aj ajVar, C122859d dVar, C60887da daVar) {
        this.f339705b = ajVar;
        this.f339706c = dVar;
        this.f339709f = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f339709f.execute(C47810es.m84977q(new C122558h(this)));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f339709f.execute(C47810es.m84977q(new C122553c(this, th)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C122095d dVar = (C122095d) obj;
        String str = dVar.f338741d;
        C122556f fVar = new C122556f(this, dVar);
        C123047cn.m202382b(C60856cj.m92903l(C47810es.m84977q(fVar), this.f339709f), C122557g.f339688a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo105673d(Optional optional) {
        this.f339710g = true;
        C122872ec ecVar = new C122872ec("InStreamContextFetcher", "Stream ended before request completion");
        Objects.requireNonNull(ecVar);
        optional.ifPresent(new C122552b(ecVar));
        for (C122562l lVar : this.f339707d.values()) {
            lVar.f339703b.mo5439d(ecVar);
        }
        this.f339707d.clear();
    }
}
