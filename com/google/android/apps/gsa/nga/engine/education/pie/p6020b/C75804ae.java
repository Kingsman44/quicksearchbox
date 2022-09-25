package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C75804ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C75808ai f210373a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f210374b;

    public /* synthetic */ C75804ae(C75808ai aiVar, C60870cx cxVar) {
        this.f210373a = aiVar;
        this.f210374b = cxVar;
    }

    public final void run() {
        C75808ai aiVar = this.f210373a;
        if (C90877ak.m148478l(this.f210374b)) {
            ((C58970a) ((C58970a) C75808ai.f210379a.mo56225c()).mo56372aa(3366)).mo56386p("Sending request failed");
            synchronized (aiVar) {
                if (aiVar.mo71905g()) {
                    ((C75788q) aiVar.f210383e.get()).mo71885q(C80265t.SEARCH_SERVICE_CALL_FAILED);
                }
            }
        }
    }
}
