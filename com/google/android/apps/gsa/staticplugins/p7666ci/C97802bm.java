package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bm */
/* compiled from: PG */
public final /* synthetic */ class C97802bm implements Function {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273081a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f273082b;

    /* renamed from: c */
    public final /* synthetic */ boolean f273083c;

    /* renamed from: d */
    public final /* synthetic */ ConcurrentHashMap f273084d;

    public /* synthetic */ C97802bm(C97811bv bvVar, C53306j jVar, boolean z, ConcurrentHashMap concurrentHashMap) {
        this.f273081a = bvVar;
        this.f273082b = jVar;
        this.f273083c = z;
        this.f273084d = concurrentHashMap;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C97811bv bvVar = this.f273081a;
        C53306j jVar = this.f273082b;
        boolean z = this.f273083c;
        ConcurrentHashMap concurrentHashMap = this.f273084d;
        Integer num = (Integer) obj;
        C118426bs bsVar = bvVar.f273131l;
        if (num.intValue() == 27 || num.intValue() == 28 || ((!bsVar.mo103697i(num) && num.intValue() != 8) || z)) {
            concurrentHashMap.putIfAbsent(num, false);
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C22871g gVar = bvVar.f273126g;
        C60870cx a = bvVar.f273133n.mo103704a(num.intValue());
        C118366g gVar2 = bvVar.f273132m;
        Objects.requireNonNull(gVar2);
        return bvVar.f273126g.mo28209i(gVar.mo28210j(a, "#getProactiveDataPreferenceStoreKey()", new C97785ay(gVar2)), "Check cache freshness", new C97796bg(bvVar, jVar, num, concurrentHashMap));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
