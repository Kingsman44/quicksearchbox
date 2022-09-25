package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.gsa.nga.shared.p6345h.C81295bz;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.u */
/* compiled from: PG */
public final class C127804u {

    /* renamed from: a */
    public final C36624a f351768a;

    /* renamed from: b */
    public final Executor f351769b;

    public C127804u(C36624a aVar, Executor executor) {
        this.f351768a = aVar;
        this.f351769b = executor;
    }

    /* renamed from: a */
    public static C81297ca m208819a(C81297ca caVar, C81294by byVar) {
        C81295bz bzVar = (C81295bz) C81297ca.f222540b.createBuilder();
        bzVar.mo74985a(m208820c(caVar.f222542a, byVar));
        return (C81297ca) bzVar.build();
    }

    /* renamed from: c */
    public static C58485gu m208820c(List list, Object obj) {
        return (C58485gu) Stream.CC.concat(Collection.EL.stream(list), Stream.CC.m71935of(obj)).skip((long) Math.max(0, list.size() - 99)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C60870cx mo108218b(String str) {
        C60870cx d = this.f351768a.mo40240d();
        C127796m mVar = new C127796m(str);
        return C60922j.m93044g(d, C47810es.m84963c(mVar), this.f351769b);
    }
}
