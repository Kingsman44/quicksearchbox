package com.google.android.apps.search.podcasts.p10601r;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.k */
/* compiled from: PG */
public final class C140989k {
    /* renamed from: a */
    public static final C46463o m228943a(C60870cx cxVar) {
        C69664n.m101061g(cxVar, "<this>");
        return new C46463o(new C60817ay(cxVar));
    }

    /* renamed from: b */
    public static final C60870cx m228944b(C60870cx cxVar, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C60826bg bgVar = C60826bg.f164896a;
        C69664n.m101060f(bgVar, "directExecutor()");
        return m228946d(cxVar, bgVar, lVar);
    }

    /* renamed from: c */
    public static final C60870cx m228945c(C60870cx cxVar, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C60826bg bgVar = C60826bg.f164896a;
        C69664n.m101060f(bgVar, "directExecutor()");
        return m228947e(cxVar, bgVar, lVar);
    }

    /* renamed from: d */
    public static final C60870cx m228946d(C60870cx cxVar, Executor executor, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C69664n.m101061g(executor, "executor");
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C140987i(lVar)), executor);
    }

    /* renamed from: e */
    public static final C60870cx m228947e(C60870cx cxVar, Executor executor, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C69664n.m101061g(executor, "executor");
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C140988j(lVar)), executor);
    }

    /* renamed from: f */
    public static final C60870cx m228948f(C60870cx cxVar, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C140987i iVar = new C140987i(lVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(iVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public static final void m228949g(C60870cx cxVar, Executor executor, C60845bz bzVar) {
        C69664n.m101061g(executor, "executor");
        C60856cj.m92911t(cxVar, C47810es.m84974n(bzVar), executor);
    }

    /* renamed from: h */
    public static final void m228950h(C60870cx cxVar, C60845bz bzVar) {
        C69664n.m101061g(cxVar, "<this>");
        C60856cj.m92911t(cxVar, C47810es.m84974n(bzVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public static final void m228951i(C60870cx cxVar, Executor executor, C69626l lVar) {
        C69664n.m101061g(cxVar, "<this>");
        C69664n.m101061g(executor, "executor");
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C140986h(lVar)), executor);
    }
}
