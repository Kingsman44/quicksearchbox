package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142458gb;
import com.google.android.p10712d.C142461ge;
import com.google.android.p10712d.C142462gf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.dd */
/* compiled from: PG */
final class C96599dd extends C96586cr {

    /* renamed from: a */
    final /* synthetic */ C96600de f270227a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96599dd(C96600de deVar) {
        super(deVar);
        this.f270227a = deVar;
    }

    /* renamed from: a */
    public final boolean mo90252a(C142462gf gfVar) {
        synchronized (this.f270227a) {
            C142455fz a = C142455fz.m231083a(gfVar.f386598a);
            if (a == null) {
                a = C142455fz.OTA_UNKNOWN;
            }
            if (a != C142455fz.OTA_DATA) {
                C59104x d = C96600de.f270228a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "UploadOtaTask");
                ((C59052c) ((C59052c) d).mo56372aa(16717)).mo56386p("Not data type we wanted.");
                return false;
            } else if (this.f270227a.f270245y) {
                C142461ge a2 = C142461ge.m231085a(gfVar.f386599b);
                if (a2 == null) {
                    a2 = C142461ge.OTA_STATUS_UNKNOWN;
                }
                if (a2 == C142461ge.OTA_SUCCESS) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f270227a.f270229A.mo57356n(C118826c.f331422a);
                    return true;
                }
                C96600de deVar = this.f270227a;
                SettableFuture settableFuture = deVar.f270229A;
                int i = deVar.f270240d;
                C142461ge a3 = C142461ge.m231085a(gfVar.f386599b);
                if (a3 == null) {
                    a3 = C142461ge.OTA_STATUS_UNKNOWN;
                }
                String name = a3.name();
                settableFuture.mo57357o(new C96587cs("ERROR_DURING_UPLOADING: OtaData failure, canceling upload #" + i + ". Code = " + name));
                return true;
            } else {
                C142461ge a4 = C142461ge.m231085a(gfVar.f386599b);
                if (a4 == null) {
                    a4 = C142461ge.OTA_STATUS_UNKNOWN;
                }
                if (a4 == C142461ge.OTA_SUCCESS) {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
                SettableFuture settableFuture2 = this.f270227a.f270229A;
                C142461ge a5 = C142461ge.m231085a(gfVar.f386599b);
                if (a5 == null) {
                    a5 = C142461ge.OTA_STATUS_UNKNOWN;
                }
                String name2 = a5.name();
                settableFuture2.mo57357o(new C96587cs("ERROR_DURING_UPLOADING: Ota upload error. Status: " + name2));
                return true;
            }
        }
    }

    /* renamed from: d */
    public final void mo90255d(C142458gb gbVar) {
        if ((gbVar.f386570a & 1) != 0) {
            synchronized (this.f270227a) {
                this.f270227a.f270246z = Integer.valueOf(gbVar.f386571b);
            }
            return;
        }
        C59104x c = C96600de.f270228a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "UploadOtaTask");
        ((C59052c) ((C59052c) c).mo56372aa(16714)).mo56386p("Received NACK with no resume offset.");
    }
}
