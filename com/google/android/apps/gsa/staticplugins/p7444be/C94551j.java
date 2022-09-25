package com.google.android.apps.gsa.staticplugins.p7444be;

import android.app.PendingIntent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.be.j */
/* compiled from: PG */
public final class C94551j {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f264450a;

    public C94551j(PendingIntent pendingIntent) {
        this.f264450a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo88495a() {
        try {
            this.f264450a.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x c = C94552k.f264451a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20141)).mo56386p("PendingIntent canceled");
        }
    }
}
