package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.a */
/* compiled from: PG */
public final /* synthetic */ class C82198a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C82220f f224657a;

    /* renamed from: b */
    public final /* synthetic */ Duration f224658b;

    public /* synthetic */ C82198a(C82220f fVar, Duration duration) {
        this.f224657a = fVar;
        this.f224658b = duration;
    }

    public final void run() {
        C82220f fVar = this.f224657a;
        Duration duration = this.f224658b;
        if (fVar.f224701c.isEmpty()) {
            ((C59052c) ((C59052c) C82220f.f224699a.mo56225c()).mo56372aa(5915)).mo56386p("NgaInteractorConnectionInterface is not present.");
            return;
        }
        fVar.f224700b.mo83703p(C89849ae.NGA_ASSIST_LAYER_INPUT_PLATE_OPENED, duration.toNanos());
        ((bq) fVar.f224701c.get()).b(C89849ae.NGA_ASSIST_LAYER_INPUT_PLATE_OPENED.f245884YW, duration);
    }
}
