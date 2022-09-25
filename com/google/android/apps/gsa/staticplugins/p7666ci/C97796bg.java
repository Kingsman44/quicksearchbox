package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bg */
/* compiled from: PG */
public final /* synthetic */ class C97796bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273053a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f273054b;

    /* renamed from: c */
    public final /* synthetic */ Integer f273055c;

    /* renamed from: d */
    public final /* synthetic */ ConcurrentHashMap f273056d;

    public /* synthetic */ C97796bg(C97811bv bvVar, C53306j jVar, Integer num, ConcurrentHashMap concurrentHashMap) {
        this.f273053a = bvVar;
        this.f273054b = jVar;
        this.f273055c = num;
        this.f273056d = concurrentHashMap;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97811bv bvVar = this.f273053a;
        C53306j jVar = this.f273054b;
        Integer num = this.f273055c;
        ConcurrentHashMap concurrentHashMap = this.f273056d;
        Long l = (Long) obj;
        boolean z = true;
        if (!bvVar.f273131l.mo103696h(jVar, num) ? l.longValue() + bvVar.f273131l.mo103694f(num).longValue() < bvVar.f273128i.mo26870b() : l.longValue() == 0) {
            z = false;
        }
        concurrentHashMap.putIfAbsent(num, Boolean.valueOf(z));
        return C118826c.f331422a;
    }
}
