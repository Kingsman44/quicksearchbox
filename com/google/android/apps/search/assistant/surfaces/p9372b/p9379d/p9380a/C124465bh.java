package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.gsa.nga.engine.p6038j.C76190e;
import com.google.android.apps.gsa.nga.engine.p6038j.C76192g;
import com.google.android.apps.gsa.nga.engine.p6038j.C76193h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bh */
/* compiled from: PG */
public final /* synthetic */ class C124465bh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124475br f343488a;

    /* renamed from: b */
    public final /* synthetic */ C76193h f343489b;

    public /* synthetic */ C124465bh(C124475br brVar, C76193h hVar) {
        this.f343488a = brVar;
        this.f343489b = hVar;
    }

    public final void accept(Object obj) {
        C124475br brVar = this.f343488a;
        C76193h hVar = this.f343489b;
        C76190e eVar = new C76190e(hVar, brVar.f343509h, (Throwable) obj);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(eVar), hVar.f211197d.f211199b);
        C76192g gVar = new C76192g(hVar);
        C60856cj.m92911t(l, C47810es.m84974n(gVar), hVar.f211197d.f211199b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
