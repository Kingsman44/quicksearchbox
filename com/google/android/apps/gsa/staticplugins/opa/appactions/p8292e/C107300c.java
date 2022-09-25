package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.c */
/* compiled from: PG */
public final /* synthetic */ class C107300c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107304g f298623a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f298624b;

    public /* synthetic */ C107300c(C107304g gVar, C60870cx cxVar) {
        this.f298623a = gVar;
        this.f298624b = cxVar;
    }

    public final void run() {
        C107304g gVar = this.f298623a;
        if (this.f298624b.isCancelled()) {
            ((C59052c) ((C59052c) C107304g.f298633a.mo56226d()).mo56372aa(23569)).mo56386p("Pin app widget not supported.");
            gVar.mo95904a();
        }
    }
}
