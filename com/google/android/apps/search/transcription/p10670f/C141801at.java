package com.google.android.apps.search.transcription.p10670f;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.f.at */
/* compiled from: PG */
public final /* synthetic */ class C141801at implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C141802au f384820a;

    /* renamed from: b */
    public final /* synthetic */ int f384821b;

    public /* synthetic */ C141801at(C141802au auVar, int i) {
        this.f384820a = auVar;
        this.f384821b = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C141802au auVar = this.f384820a;
        int i = this.f384821b;
        C60872cz czVar = (C60872cz) obj;
        if (czVar != null) {
            czVar.cancel(true);
        }
        return auVar.f384823b.f384833e.mo29164d(C47810es.m84977q(new C141800as(auVar)), (long) i, TimeUnit.MILLISECONDS);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
