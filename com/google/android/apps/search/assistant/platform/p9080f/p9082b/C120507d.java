package com.google.android.apps.search.assistant.platform.p9080f.p9082b;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.d */
/* compiled from: PG */
public abstract class C120507d {
    /* renamed from: f */
    public static C120515l m199598f() {
        C120515l lVar = new C120515l();
        lVar.mo104791c(C120481c.f335068a);
        lVar.mo104790b(C120420b.MONO);
        lVar.mo104792d(16000);
        lVar.mo104793e(Duration.ofMillis(200));
        return lVar;
    }

    /* renamed from: a */
    public final int mo104780a() {
        return mo104782c() == C120420b.MONO ? 1 : 2;
    }

    /* renamed from: b */
    public abstract int mo104781b();

    /* renamed from: c */
    public abstract C120420b mo104782c();

    /* renamed from: d */
    public abstract C120481c mo104783d();

    /* renamed from: e */
    public abstract Duration mo104784e();
}
