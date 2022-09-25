package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C122625ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122641au f339818a;

    /* renamed from: b */
    public final /* synthetic */ C122640at f339819b;

    /* renamed from: c */
    public final /* synthetic */ C61920cc f339820c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f339821d;

    /* renamed from: e */
    public final /* synthetic */ C122959k f339822e;

    /* renamed from: f */
    public final /* synthetic */ C122964p f339823f;

    public /* synthetic */ C122625ae(C122641au auVar, C122959k kVar, C122640at atVar, C122964p pVar, C61920cc ccVar, Runnable runnable) {
        this.f339818a = auVar;
        this.f339822e = kVar;
        this.f339819b = atVar;
        this.f339823f = pVar;
        this.f339820c = ccVar;
        this.f339821d = runnable;
    }

    public final void run() {
        C122641au auVar = this.f339818a;
        C122959k kVar = this.f339822e;
        C122640at atVar = this.f339819b;
        C122964p pVar = this.f339823f;
        C61920cc ccVar = this.f339820c;
        Runnable runnable = this.f339821d;
        C60870cx d = C122641au.m202044d(kVar);
        C122623ac acVar = new C122623ac(atVar, pVar, ccVar, runnable);
        C123047cn.m202382b(C60922j.m93045h(d, C47810es.m84966f(acVar), auVar.f339869l), new C122632al(kVar), C60826bg.f164896a);
    }
}
