package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.concurrent.ab */
/* compiled from: PG */
public final class C46415ab {
    /* renamed from: a */
    public static C60870cx m82767a(C60870cx cxVar, Callable callable, Executor executor) {
        C60871cy cyVar = new C60871cy(callable);
        cxVar.mo4106b(cyVar, executor);
        m82769c(cxVar, cyVar);
        return cyVar;
    }

    /* renamed from: b */
    public static C60870cx m82768b(C60870cx cxVar, C60930r rVar, Executor executor) {
        C60870cx n = C60856cj.m92905n(new C46414aa(rVar, cxVar), new C46473y(cxVar, executor));
        m82769c(cxVar, n);
        return n;
    }

    /* renamed from: c */
    private static void m82769c(C60870cx cxVar, C60870cx cxVar2) {
        cxVar2.mo4106b(new C46474z(cxVar2, cxVar), C60826bg.f164896a);
    }
}
