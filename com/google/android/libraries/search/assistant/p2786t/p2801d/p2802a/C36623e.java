package com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a;

import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.t.d.a.e */
/* compiled from: PG */
public final class C36623e {

    /* renamed from: a */
    public static final Duration f95466a = Duration.ofMinutes(1);

    /* renamed from: b */
    public final C83387d f95467b;

    /* renamed from: c */
    public final C60888db f95468c;

    /* renamed from: d */
    public final Executor f95469d;

    /* renamed from: e */
    public C60870cx f95470e;

    public C36623e(C83387d dVar, C60888db dbVar) {
        this.f95467b = dVar;
        this.f95468c = dbVar;
        this.f95469d = new C60904dr(dbVar);
    }

    /* renamed from: a */
    public final C47633f mo40236a() {
        C36621c cVar = new C36621c(this);
        return C47633f.m84733g(C60856cj.m92903l(C47810es.m84977q(cVar), this.f95469d));
    }
}
