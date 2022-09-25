package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120191ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C17173i implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ Duration f49884a;

    /* renamed from: b */
    public final /* synthetic */ int f49885b;

    /* renamed from: c */
    public final /* synthetic */ Executor f49886c;

    /* renamed from: d */
    public final /* synthetic */ C120191ai f49887d;

    public /* synthetic */ C17173i(C120191ai aiVar, Duration duration, int i, Executor executor) {
        this.f49887d = aiVar;
        this.f49884a = duration;
        this.f49885b = i;
        this.f49886c = executor;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C120191ai aiVar = this.f49887d;
        Duration duration = this.f49884a;
        int i = this.f49885b;
        Executor executor = this.f49886c;
        C17170f fVar = (C17170f) obj;
        fVar.getClass();
        C17178n nVar = new C17178n(executor, fVar.f49879a, new C17174j(fVar.f49880b), new C17176l(aiVar, duration, i));
        Objects.requireNonNull(nVar);
        atVar.mo57268a(C47810es.m84975o(new C17172h(nVar)), executor);
        return nVar;
    }
}
