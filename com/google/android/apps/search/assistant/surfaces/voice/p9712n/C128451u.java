package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.u */
/* compiled from: PG */
public final /* synthetic */ class C128451u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128455y f353293a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f353294b;

    public /* synthetic */ C128451u(C128455y yVar, Throwable th) {
        this.f353293a = yVar;
        this.f353294b = th;
    }

    public final void run() {
        C128455y yVar = this.f353293a;
        Throwable th = this.f353294b;
        C60870cx cxVar = yVar.f353304f;
        if (cxVar == null) {
            yVar.f353303e.mo108414c(th);
            yVar.f353302d.mo108426d(C62722b.ABORTED);
            return;
        }
        C128453w wVar = new C128453w(yVar, th);
        C60856cj.m92911t(cxVar, C47810es.m84974n(wVar), yVar.f353301c);
    }
}
