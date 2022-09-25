package com.google.android.libraries.search.p3055n.p3074d;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.d.b */
/* compiled from: PG */
public final class C39675b {

    /* renamed from: a */
    public static final C59071e f104433a = C59071e.m91332i("com.google.android.libraries.search.n.d.b");

    /* renamed from: b */
    public Duration f104434b;

    /* renamed from: c */
    public final C58872ci f104435c;

    /* renamed from: d */
    private final C47632e f104436d = new C47632e();

    /* renamed from: e */
    private final Executor f104437e;

    public C39675b(Executor executor, long j, C58889cz czVar) {
        this.f104435c = new C58872ci(czVar);
        this.f104437e = executor;
        Duration.ofMillis(j);
        this.f104434b = Duration.ZERO;
    }

    /* renamed from: a */
    public final void mo41985a() {
        C59104x b = f104433a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NearMissLogger");
        ((C59052c) ((C59052c) b).mo56372aa(53795)).mo56386p("onHotwordRejected called");
        C46459k.m82829b(this.f104436d.mo51511a(new C39674a(this), this.f104437e), "Failed to execute code in onHotwordRejected!", new Object[0]);
    }
}
