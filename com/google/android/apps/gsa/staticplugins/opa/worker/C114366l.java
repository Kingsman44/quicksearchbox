package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.os.IBinder;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.util.ParcelableBinder;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.l */
/* compiled from: PG */
public final /* synthetic */ class C114366l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317101a;

    /* renamed from: b */
    public final /* synthetic */ long f317102b;

    public /* synthetic */ C114366l(C114507v vVar, long j) {
        this.f317101a = vVar;
        this.f317102b = j;
    }

    public final void run() {
        C114507v vVar = this.f317101a;
        long j = this.f317102b;
        C114252a aVar = vVar.f317531q;
        C87684al alVar = new C87684al(C88244um.CANVAS_WORKER_BINDER_RESPONSE);
        alVar.mo81966c(new ParcelableBinder((IBinder) aVar.f316810c.mo27525b()));
        if (!aVar.f316809b.mo80229j(j, alVar.mo81964a())) {
            C59104x d = C114252a.f316808a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanWorBinReqHan");
            ((C59052c) ((C59052c) d).mo56372aa(28816)).mo56386p("Client not present.");
        }
    }
}
