package com.google.apps.tiktok.coroutines;

import com.google.apps.tiktok.tracing.C47824ff;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C71633cf;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.e */
/* compiled from: PG */
public final class C46652e {
    /* renamed from: a */
    public static final C69585o m83128a(ScheduledExecutorService scheduledExecutorService) {
        C69664n.m101061g(scheduledExecutorService, "executor");
        C46658k kVar = new C46658k(scheduledExecutorService);
        return C71633cf.m104609a(kVar).plus(kVar).plus(new C47824ff());
    }
}
