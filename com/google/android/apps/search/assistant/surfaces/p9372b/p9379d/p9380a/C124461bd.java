package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.gsa.nga.engine.p6038j.C76189d;
import com.google.android.apps.gsa.nga.engine.p6038j.C76191f;
import com.google.android.apps.gsa.nga.engine.p6038j.C76193h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C124461bd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124475br f343480a;

    /* renamed from: b */
    public final /* synthetic */ C76193h f343481b;

    public /* synthetic */ C124461bd(C124475br brVar, C76193h hVar) {
        this.f343480a = brVar;
        this.f343481b = hVar;
    }

    public final void accept(Object obj) {
        C124475br brVar = this.f343480a;
        C76193h hVar = this.f343481b;
        C76189d dVar = new C76189d(hVar, brVar.f343509h, (C124455az) obj);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(dVar), hVar.f211197d.f211199b);
        C76191f fVar = new C76191f(hVar);
        C60856cj.m92911t(l, C47810es.m84974n(fVar), hVar.f211197d.f211199b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
