package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ImpModelView;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ab */
/* compiled from: PG */
public final /* synthetic */ class C141573ab implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384255a;

    public /* synthetic */ C141573ab(C141584am amVar) {
        this.f384255a = amVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C141589ap apVar = this.f384255a.f384322an;
        ImpModelView impModelView = new ImpModelView(apVar.f384363a);
        C60870cx f = C60856cj.m92897f(impModelView.setupAsync(apVar.f384364b, apVar.f384365c), C60856cj.m92903l(new C141587an(apVar.f384363a), apVar.f384365c));
        C141588ao aoVar = new C141588ao(impModelView, apVar.f384363a);
        return new C46463o(new C60817ay(C60922j.m93045h(f, C47810es.m84966f(aoVar), apVar.f384364b)));
    }
}
