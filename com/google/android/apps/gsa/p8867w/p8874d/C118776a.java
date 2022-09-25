package com.google.android.apps.gsa.p8867w.p8874d;

import com.google.android.apps.gsa.staticplugins.p7815dk.C99639m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.w.d.a */
/* compiled from: PG */
public final /* synthetic */ class C118776a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f331307a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f331308b;

    /* renamed from: c */
    public final /* synthetic */ C99639m f331309c;

    public /* synthetic */ C118776a(C60870cx cxVar, C60870cx cxVar2, C99639m mVar) {
        this.f331307a = cxVar;
        this.f331308b = cxVar2;
        this.f331309c = mVar;
    }

    public final void run() {
        C60870cx cxVar = this.f331307a;
        C60870cx cxVar2 = this.f331308b;
        C99639m mVar = this.f331309c;
        if (!cxVar.isDone() || !cxVar2.isDone()) {
            C59104x b = C118782g.f331318a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AgsaClassicOnboardingImpl");
            ((C59052c) ((C59052c) b).mo56372aa(11490)).mo56386p("getSettingsUi timed out");
            mVar.mo91529a();
            cxVar.cancel(true);
            cxVar2.cancel(true);
        }
    }
}
