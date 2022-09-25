package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.j */
/* compiled from: PG */
public final /* synthetic */ class C77591j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213755a;

    /* renamed from: b */
    public final /* synthetic */ C75077bo f213756b;

    public /* synthetic */ C77591j(C77595n nVar, C75077bo boVar) {
        this.f213755a = nVar;
        this.f213756b = boVar;
    }

    public final void run() {
        C77595n nVar = this.f213755a;
        C75077bo boVar = this.f213756b;
        nVar.f213782l = boVar.mo71461e();
        nVar.f213783m = boVar.mo71460d();
        nVar.f213778h.set(true);
        Duration ofMillis = Duration.ofMillis(nVar.f213776f.mo85399d(C90126fx.f251547kq));
        if (!nVar.f213784n.isDone()) {
            nVar.f213784n.cancel(false);
        }
        nVar.f213784n = nVar.f213774d.mo28208h("[NGA] NgaHandler.onRecognitionResult", ofMillis.toMillis(), new C77589h(nVar, ofMillis));
    }
}
