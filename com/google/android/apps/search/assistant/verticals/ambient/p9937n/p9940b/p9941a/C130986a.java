package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130986a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131051f f358373a;

    /* renamed from: b */
    public final /* synthetic */ Instant f358374b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f358375c;

    public /* synthetic */ C130986a(C131051f fVar, Instant instant, C58485gu guVar) {
        this.f358373a = fVar;
        this.f358374b = instant;
        this.f358375c = guVar;
    }

    public final Object call() {
        C131051f fVar = this.f358373a;
        return (C58485gu) fVar.f358481e.mo110020a().map(new C131049d(fVar, this.f358374b, this.f358375c)).orElse(C58485gu.m89845m());
    }
}
