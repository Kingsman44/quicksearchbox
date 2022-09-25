package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33562c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.bd */
/* compiled from: PG */
public final class C121934bd implements C33562c {

    /* renamed from: a */
    public final long f338345a;

    /* renamed from: b */
    public final C121906ac f338346b;

    /* renamed from: c */
    public C33504b f338347c;

    /* renamed from: d */
    public C121925av f338348d;

    /* renamed from: e */
    private final Executor f338349e;

    public C121934bd(long j, C121906ac acVar, C33504b bVar, Executor executor) {
        C69664n.m101061g(acVar, "assistLayerTracker");
        C69664n.m101061g(executor, "uiExecutor");
        this.f338345a = j;
        this.f338346b = acVar;
        this.f338347c = bVar;
        this.f338349e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo38981a() {
        C121933bc bcVar = new C121933bc(this);
        return C60856cj.m92904m(C47810es.m84978r(bcVar), this.f338349e);
    }
}
