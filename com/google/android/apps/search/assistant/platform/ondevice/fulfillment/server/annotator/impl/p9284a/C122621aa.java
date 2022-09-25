package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C122621aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122641au f339806a;

    /* renamed from: b */
    public final /* synthetic */ WebrefAndPkgModelProvider f339807b;

    /* renamed from: c */
    public final /* synthetic */ C122640at f339808c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f339809d;

    /* renamed from: e */
    public final /* synthetic */ C122959k f339810e;

    /* renamed from: f */
    public final /* synthetic */ C122964p f339811f;

    public /* synthetic */ C122621aa(C122641au auVar, C122959k kVar, WebrefAndPkgModelProvider webrefAndPkgModelProvider, C122640at atVar, C122964p pVar, Runnable runnable) {
        this.f339806a = auVar;
        this.f339810e = kVar;
        this.f339807b = webrefAndPkgModelProvider;
        this.f339808c = atVar;
        this.f339811f = pVar;
        this.f339809d = runnable;
    }

    public final void run() {
        C122641au auVar = this.f339806a;
        C122959k kVar = this.f339810e;
        WebrefAndPkgModelProvider webrefAndPkgModelProvider = this.f339807b;
        C122640at atVar = this.f339808c;
        C122964p pVar = this.f339811f;
        Runnable runnable = this.f339809d;
        C60870cx d = C122641au.m202044d(kVar);
        C122628ah ahVar = new C122628ah(webrefAndPkgModelProvider, atVar, pVar, runnable);
        C123047cn.m202382b(C60922j.m93045h(d, C47810es.m84966f(ahVar), auVar.f339869l), new C122629ai(kVar), C60826bg.f164896a);
    }
}
