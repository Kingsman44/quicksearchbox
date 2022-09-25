package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.abe;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119418c;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119421f;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119423h;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127355c;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.i */
/* compiled from: PG */
public final class C127315i implements C127307ak {

    /* renamed from: a */
    final /* synthetic */ Executor f350638a;

    /* renamed from: b */
    final /* synthetic */ C18460aw f350639b;

    /* renamed from: c */
    final /* synthetic */ C119418c f350640c;

    /* renamed from: d */
    final /* synthetic */ C119421f f350641d;

    /* renamed from: e */
    final /* synthetic */ C127306aj f350642e;

    /* renamed from: f */
    final /* synthetic */ C127313g f350643f;

    /* renamed from: g */
    final /* synthetic */ abe f350644g;

    public C127315i(Executor executor, C18460aw awVar, C119418c cVar, C119421f fVar, C127306aj ajVar, abe abe, C127313g gVar) {
        this.f350638a = executor;
        this.f350639b = awVar;
        this.f350640c = cVar;
        this.f350641d = fVar;
        this.f350642e = ajVar;
        this.f350644g = abe;
        this.f350643f = gVar;
    }

    /* renamed from: a */
    public final C119424i mo108011a(C127326t tVar) {
        C18460aw awVar = this.f350639b;
        C119418c cVar = this.f350640c;
        C119421f fVar = this.f350641d;
        C127306aj ajVar = this.f350642e;
        abe abe = this.f350644g;
        C127313g gVar = this.f350643f;
        C58480gp e = C58485gu.m89837e();
        if (!awVar.f52385d) {
            e.mo55395g(cVar);
        }
        e.mo55395g(fVar);
        e.mo55395g(ajVar);
        e.mo55395g(new C127296a(abe.f195283a.a.i(), (Context) abe.f195283a.a.g.mo17428b(), tVar, (C127355c) abe.f195283a.b.f198027a.f199354dT.mo17428b()));
        e.mo55395g(gVar);
        C58485gu f = e.mo55394f();
        C69664n.m101060f(f, "builder<T>().apply(init).build()");
        return new C119423h(f, this.f350638a);
    }
}
