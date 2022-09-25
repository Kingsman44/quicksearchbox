package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96462at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142344bw;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ce */
/* compiled from: PG */
public final /* synthetic */ class C96573ce implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96577ci f270175a;

    public /* synthetic */ C96573ce(C96577ci ciVar) {
        this.f270175a = ciVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        String str;
        C96577ci ciVar = this.f270175a;
        Map map = (Map) obj;
        String str2 = null;
        ciVar.f270182d = null;
        C142324bc bcVar = ciVar.f270180b;
        C142344bw bwVar = bcVar.f386121g;
        if (bwVar == null) {
            bwVar = C142344bw.f386209i;
        }
        if ((bwVar.f386211a & 64) != 0) {
            C142344bw bwVar2 = bcVar.f386121g;
            if (bwVar2 == null) {
                bwVar2 = C142344bw.f386209i;
            }
            str = C58837ba.m90856e(bwVar2.f386218h);
        } else {
            str = bcVar.f386123i.size() > 0 ? C58837ba.m90856e(((C142344bw) bcVar.f386123i.get(0)).f386218h) : null;
        }
        for (C142468gl glVar : map.values()) {
            C142467gk a = C142467gk.m231089a(glVar.f386623b);
            if (a == null) {
                a = C142467gk.OTA_UNKNOWN;
            }
            if (!a.equals(C142467gk.OTA_RECEIVED)) {
                C59104x c = C96577ci.f270179a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaStateWFAU");
                C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(16677);
                C142467gk a2 = C142467gk.m231089a(glVar.f386623b);
                if (a2 == null) {
                    a2 = C142467gk.OTA_UNKNOWN;
                }
                cVar.mo56389s("Incorrect state on device: %s; aborting OTA", a2);
                ciVar.mo90226c();
                return;
            } else if (str2 == null) {
                str2 = glVar.f386627f;
            } else if (C96462at.m159831a(str2, glVar.f386627f, ciVar.f270134l.mo106514l())) {
                str2 = glVar.f386627f;
            }
        }
        if (ciVar.f270181c) {
            ciVar.f270181c = false;
            ciVar.mo90251m();
        } else if (str2 == null || str == null || !C96462at.m159831a(str, str2, ciVar.f270134l.mo106514l())) {
            ciVar.mo90240o(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER);
        } else {
            C59104x b = C96577ci.f270179a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateWFAU");
            ((C59052c) ((C59052c) b).mo56372aa(16676)).mo56386p("critical ota! applying");
            ciVar.mo90251m();
        }
    }
}
