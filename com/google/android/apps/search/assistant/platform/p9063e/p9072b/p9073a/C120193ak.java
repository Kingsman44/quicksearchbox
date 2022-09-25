package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai;
import com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9067b.C120169a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.assistant.p1363c.p1380c.C17181c;
import com.google.android.libraries.assistant.p1363c.p1380c.C17190l;
import com.google.android.libraries.assistant.p1363c.p1380c.C17193o;
import com.google.android.libraries.assistant.p1363c.p1380c.C17194p;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17179o;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ak */
/* compiled from: PG */
final class C120193ak {

    /* renamed from: a */
    public static final /* synthetic */ int f334495a = 0;

    /* renamed from: b */
    private static final Duration f334496b = Duration.ZERO;

    /* renamed from: a */
    static C120284dl m199121a(C120285dm dmVar, C17194p pVar) {
        pVar.getClass();
        C120227bq bqVar = (C120227bq) dmVar.f334677a.mo17428b();
        bqVar.getClass();
        return new C120284dl(pVar, bqVar);
    }

    /* renamed from: b */
    static C17190l m199122b(C119787ai aiVar, C17193o oVar, C120325es esVar) {
        Duration ofMillis = Duration.ofMillis((long) aiVar.f333655c);
        Duration ofMillis2 = Duration.ofMillis((long) aiVar.f333654b);
        Executor executor = (Executor) oVar.f49937a.mo17428b();
        executor.getClass();
        esVar.getClass();
        ofMillis.getClass();
        ofMillis2.getClass();
        return new C17190l(executor, esVar, ofMillis, ofMillis2);
    }

    /* renamed from: c */
    static C17194p m199123c(C17190l lVar) {
        return lVar.f49928f;
    }

    /* renamed from: d */
    static C17194p m199124d(C17190l lVar) {
        return lVar.f49927e;
    }

    /* renamed from: e */
    static C60870cx m199125e(C120511h hVar, C120192aj ajVar, Executor executor) {
        C60870cx c = hVar.mo104770c(new C120183aa(ajVar));
        Objects.requireNonNull(ajVar);
        c.mo4106b(C47810es.m84977q(new C120184ab(ajVar)), executor);
        return c;
    }

    /* renamed from: f */
    static C17181c m199126f(C17190l lVar) {
        return lVar.f49929g;
    }

    /* renamed from: g */
    static C120191ai m199127g(C17194p pVar, C17181c cVar) {
        return new C120191ai(pVar, cVar);
    }

    /* renamed from: i */
    static C17268f m199129i(C120284dl dlVar) {
        Objects.requireNonNull(dlVar);
        return new C120169a(new C120188af(dlVar));
    }

    /* renamed from: h */
    static C60870cx m199128h(boolean z, C120511h hVar, C120259cq cqVar, C17179o oVar, C120191ai aiVar, Executor executor) {
        Duration duration;
        if (z) {
            duration = f334496b;
        } else {
            duration = Duration.ofSeconds(1);
        }
        return C2169h.m6027a(new C120190ah(cqVar, hVar, oVar, aiVar, duration, executor));
    }
}
