package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11627c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.n */
/* compiled from: PG */
public final class C11613n {

    /* renamed from: a */
    public static final C59071e f37551a = C59071e.m91331h();

    /* renamed from: b */
    public final C11627c f37552b;

    /* renamed from: c */
    private final Executor f37553c;

    /* renamed from: d */
    private final ScheduledExecutorService f37554d;

    public C11613n(Executor executor, ScheduledExecutorService scheduledExecutorService, C11627c cVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(scheduledExecutorService, "backgroundExecutor");
        C69664n.m101061g(cVar, "carConnectionStateObserver");
        this.f37553c = executor;
        this.f37554d = scheduledExecutorService;
        this.f37552b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20081a() {
        return C47633f.m84733g(C2169h.m6027a(new C11611l(this))).mo51517j(5000, TimeUnit.MILLISECONDS, this.f37554d).mo51513e(Throwable.class, C11612m.f37550a, this.f37553c);
    }
}
