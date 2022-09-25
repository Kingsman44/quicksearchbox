package com.google.android.libraries.assistant.auto.tng.common.p933q;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collection;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.t */
/* compiled from: PG */
public final class C13336t {
    /* renamed from: a */
    public static C47633f m29578a(C60870cx cxVar, Executor executor) {
        return C47633f.m84733g(cxVar).mo51515h(C13335s.f41068a, executor);
    }

    /* renamed from: b */
    public static C47633f m29579b(C60870cx cxVar, Executor executor) {
        return C47633f.m84733g(cxVar).mo51515h(C13328l.f41057a, executor);
    }

    /* renamed from: c */
    public static C47633f m29580c(Collection collection, Function function, Executor executor) {
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(collection).map(new C13333q(function, executor)).collect(Collectors.toCollection(C13330n.f41059a))));
    }

    /* renamed from: d */
    public static C47633f m29581d(java.util.Collection collection, C60931s sVar, Executor executor) {
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(collection).map(new C13331o(sVar, executor)).collect(Collectors.toCollection(C13330n.f41059a))));
    }
}
