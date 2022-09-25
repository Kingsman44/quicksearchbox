package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bo */
/* compiled from: PG */
public final class C119820bo {

    /* renamed from: a */
    private final C119817bl f333737a;

    public C119820bo(C119817bl blVar) {
        this.f333737a = blVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C119818bm mo104531a() {
        C62942bv build = this.f333737a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C119818bm) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo104532b(Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        this.f333737a.mo104528a(iterable);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo104533c(C51785da daVar) {
        C69664n.m101061g(daVar, "value");
        C119817bl blVar = this.f333737a;
        blVar.copyOnWrite();
        C119818bm bmVar = (C119818bm) blVar.instance;
        C119818bm bmVar2 = C119818bm.f333734b;
        daVar.getClass();
        bmVar.mo104530a();
        bmVar.f333736a.add(daVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo104534d() {
        List unmodifiableList = Collections.unmodifiableList(((C119818bm) this.f333737a.instance).f333736a);
        C69664n.m101060f(unmodifiableList, "_builder.getSupportedClientOpsList()");
        new C62883b(unmodifiableList);
    }
}
