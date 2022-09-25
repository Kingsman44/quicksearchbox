package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142458gb;
import com.google.android.p10712d.C142461ge;
import com.google.android.p10712d.C142462gf;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.cn */
/* compiled from: PG */
final class C96582cn implements C95352bc {

    /* renamed from: a */
    final /* synthetic */ C96588ct f270188a;

    public C96582cn(C96588ct ctVar) {
        this.f270188a = ctVar;
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        synchronized (this.f270188a) {
            int i3 = C96588ct.f270196u;
            if (i3 == 0) {
                throw null;
            } else if (i3 != i) {
                return false;
            } else {
                C58976aa aaVar = C58975e.f156826a;
                C96586cr crVar = this.f270188a.f270206r;
                if (crVar == null) {
                    return true;
                }
                try {
                    if (i2 == C142455fz.OTA_RESPONSE.f386567k) {
                        C142462gf gfVar = (C142462gf) C62942bv.parseFrom((C62942bv) C142462gf.f386596c, bArr);
                        C59104x b = C96588ct.f270193f.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "OtaTask");
                        C59052c cVar = (C59052c) b;
                        cVar.mo56378ag(C58975e.f156826a, this.f270188a.mo90248a());
                        C59052c cVar2 = (C59052c) cVar.mo56372aa(16692);
                        C142461ge a = C142461ge.m231085a(gfVar.f386599b);
                        if (a == null) {
                            a = C142461ge.OTA_STATUS_UNKNOWN;
                        }
                        C142455fz a2 = C142455fz.m231083a(gfVar.f386598a);
                        if (a2 == null) {
                            a2 = C142455fz.OTA_UNKNOWN;
                        }
                        cVar2.mo56354G("Received OtaResponse : %s %s", a, a2);
                        if (!str.equals(this.f270188a.mo90258f())) {
                            this.f270188a.mo90258f();
                        } else if (crVar.mo90252a(gfVar)) {
                            crVar.mo90254c();
                        }
                    } else if (i2 == C142455fz.OTA_STATE.f386567k) {
                        C142468gl glVar = (C142468gl) C62942bv.parseFrom((C62942bv) C142468gl.f386620l, bArr);
                        C59104x b2 = C96588ct.f270193f.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "OtaTask");
                        C59052c cVar3 = (C59052c) b2;
                        cVar3.mo56378ag(C58975e.f156826a, this.f270188a.mo90248a());
                        C59052c cVar4 = (C59052c) cVar3.mo56372aa(16689);
                        C142467gk a3 = C142467gk.m231089a(glVar.f386623b);
                        if (a3 == null) {
                            a3 = C142467gk.OTA_UNKNOWN;
                        }
                        cVar4.mo56352E("Received OtaState : %s; TS: %d", glVar, a3.f386619k);
                        if (!str.equals(this.f270188a.mo90258f())) {
                            this.f270188a.mo90258f();
                        } else if (crVar.mo90253b(glVar)) {
                            crVar.mo90254c();
                        }
                    } else if (i2 == C142455fz.OTA_NACK.f386567k) {
                        C142458gb gbVar = (C142458gb) C62942bv.parseFrom((C62942bv) C142458gb.f386568c, bArr);
                        int i4 = gbVar.f386571b;
                        if (str.equals(this.f270188a.mo90258f())) {
                            crVar.mo90255d(gbVar);
                        } else {
                            this.f270188a.mo90258f();
                        }
                    } else {
                        C59104x c = C96588ct.f270193f.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "OtaTask");
                        C59052c cVar5 = (C59052c) c;
                        cVar5.mo56378ag(C58975e.f156826a, this.f270188a.mo90248a());
                        ((C59052c) cVar5.mo56372aa(16684)).mo56387q("Unhandled ota message %d", i2);
                    }
                } catch (IOException e) {
                    C59104x c2 = C96588ct.f270193f.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "OtaTask");
                    C59052c cVar6 = (C59052c) c2;
                    cVar6.mo56378ag(C58975e.f156826a, this.f270188a.mo90248a());
                    ((C59052c) ((C59052c) cVar6.mo56382g(e)).mo56372aa(16685)).mo56386p("Error parsing received proto");
                }
            }
        }
        return true;
    }
}
