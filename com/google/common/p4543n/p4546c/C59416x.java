package com.google.common.p4543n.p4546c;

import com.google.common.util.concurrent.C60908dv;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.common.n.c.x */
/* compiled from: PG */
final class C59416x {

    /* renamed from: a */
    static final ScheduledExecutorService f157629a;

    /* renamed from: b */
    private static final ThreadFactory f157630b;

    static {
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("RetryingFuture-Timer-%d");
        dvVar.f165020a = true;
        ThreadFactory a = C60908dv.m93015a(dvVar);
        f157630b = a;
        f157629a = Executors.newSingleThreadScheduledExecutor(a);
    }
}
