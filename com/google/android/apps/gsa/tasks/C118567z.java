package com.google.android.apps.gsa.tasks;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.z */
/* compiled from: PG */
public final class C118567z {

    /* renamed from: a */
    public static final long f329183a = TimeUnit.MINUTES.toMillis(120);

    /* renamed from: a */
    static void m196858a(C118472ag agVar) {
        long j = agVar.f328822b;
        boolean z = true;
        C58838bb.m90872g(j >= 0, "DelayMs cannot be negative, was %s", j);
        long j2 = agVar.f328823c;
        if (j2 < 0) {
            z = false;
        }
        C58838bb.m90872g(z, "WindowMs cannot be negative, was %s", j2);
    }
}
