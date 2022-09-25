package com.google.common.p4543n.p4546c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.base.C58881cr;
import com.google.common.base.C58889cz;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.common.n.c.w */
/* compiled from: PG */
public final class C59415w {
    /* renamed from: a */
    public static final C59417y m92318a(C58881cr crVar, C59407o oVar, C58839bc bcVar, C58833ax axVar, C58833ax axVar2, C58889cz czVar, C59411s sVar) {
        ScheduledExecutorService scheduledExecutorService;
        boolean z = true;
        if (!axVar.mo56113h() && !axVar2.mo56113h()) {
            z = false;
        }
        C58838bb.m90884s(z, "Either executor or scheduledExecutorService needs to be set.");
        Executor executor = (Executor) axVar.mo56105a(axVar2).mo56107c();
        if (axVar2.mo56113h()) {
            scheduledExecutorService = (ScheduledExecutorService) axVar2.mo56107c();
        } else {
            scheduledExecutorService = C59416x.f157629a;
        }
        return new C59417y(crVar, oVar, bcVar, executor, scheduledExecutorService, czVar);
    }
}
