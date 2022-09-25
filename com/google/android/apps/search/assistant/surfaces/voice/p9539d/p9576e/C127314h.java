package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119417b;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119418c;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119421f;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119423h;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.h */
/* compiled from: PG */
public final class C127314h implements C127307ak {

    /* renamed from: a */
    final /* synthetic */ boolean f350633a;

    /* renamed from: b */
    final /* synthetic */ Executor f350634b;

    /* renamed from: c */
    final /* synthetic */ C119418c f350635c;

    /* renamed from: d */
    final /* synthetic */ C119421f f350636d;

    /* renamed from: e */
    final /* synthetic */ C127306aj f350637e;

    public C127314h(boolean z, Executor executor, C119418c cVar, C119421f fVar, C127306aj ajVar) {
        this.f350633a = z;
        this.f350634b = executor;
        this.f350635c = cVar;
        this.f350636d = fVar;
        this.f350637e = ajVar;
    }

    /* renamed from: a */
    public final C119424i mo108011a(C127326t tVar) {
        C119418c cVar = this.f350635c;
        C119421f fVar = this.f350636d;
        C127306aj ajVar = this.f350637e;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(cVar);
        e.mo55395g(fVar);
        e.mo55395g(ajVar);
        C58485gu f = e.mo55394f();
        C69664n.m101060f(f, "builder<T>().apply(init).build()");
        if (!this.f350633a) {
            C58480gp e2 = C58485gu.m89837e();
            e2.mo55395g(new C119417b());
            f = e2.mo55394f();
            C69664n.m101060f(f, "builder<T>().apply(init).build()");
        }
        return new C119423h(f, this.f350634b);
    }
}
