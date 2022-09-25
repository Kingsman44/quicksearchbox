package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.protobuf.C63070h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bl */
/* compiled from: PG */
public final /* synthetic */ class C126047bl implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C126047bl f347402a = new C126047bl();

    private /* synthetic */ C126047bl() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        f fVar = (f) obj;
        C63070h hVar = fVar.d;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return (String) C126336m.m206592c(hVar).filter(C126048bm.f347403a).map(C126049bn.f347404a).orElse(fVar.a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
