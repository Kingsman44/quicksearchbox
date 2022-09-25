package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a;

import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119416a;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119418c;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119421f;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119423h;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127306aj;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127307ak;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127326t;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.m */
/* compiled from: PG */
public final class C128403m implements C127307ak {

    /* renamed from: a */
    final /* synthetic */ Executor f353141a;

    /* renamed from: b */
    final /* synthetic */ C18460aw f353142b;

    /* renamed from: c */
    final /* synthetic */ C119418c f353143c;

    /* renamed from: d */
    final /* synthetic */ C119421f f353144d;

    /* renamed from: e */
    final /* synthetic */ C127306aj f353145e;

    public C128403m(Executor executor, C18460aw awVar, C119418c cVar, C119421f fVar, C127306aj ajVar) {
        this.f353141a = executor;
        this.f353142b = awVar;
        this.f353143c = cVar;
        this.f353144d = fVar;
        this.f353145e = ajVar;
    }

    /* renamed from: a */
    public final C119424i mo108011a(C127326t tVar) {
        C18460aw awVar = this.f353142b;
        C119418c cVar = this.f353143c;
        C119421f fVar = this.f353144d;
        C127306aj ajVar = this.f353145e;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(new C119416a());
        if (!awVar.f52385d) {
            e.mo55395g(cVar);
        }
        e.mo55395g(fVar);
        e.mo55395g(ajVar);
        C58485gu f = e.mo55394f();
        C69664n.m101060f(f, "builder<T>().apply(init).build()");
        return new C119423h(f, this.f353141a);
    }
}
