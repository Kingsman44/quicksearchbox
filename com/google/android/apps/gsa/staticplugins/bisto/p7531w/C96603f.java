package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142461ge;
import com.google.android.p10712d.C142462gf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.f */
/* compiled from: PG */
final class C96603f extends C96586cr {

    /* renamed from: a */
    final /* synthetic */ C96604g f270255a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96603f(C96604g gVar) {
        super(gVar);
        this.f270255a = gVar;
    }

    /* renamed from: a */
    public final boolean mo90252a(C142462gf gfVar) {
        C142455fz a = C142455fz.m231083a(gfVar.f386598a);
        if (a == null) {
            a = C142455fz.OTA_UNKNOWN;
        }
        if (a == C142455fz.OTA_BEGIN) {
            C142461ge a2 = C142461ge.m231085a(gfVar.f386599b);
            if (a2 == null) {
                a2 = C142461ge.OTA_STATUS_UNKNOWN;
            }
            if (a2 == C142461ge.OTA_SUCCESS) {
                C59071e eVar = C96604g.f270256a;
                C58976aa aaVar = C58975e.f156826a;
                C96604g gVar = this.f270255a;
                gVar.mo90261i(Integer.valueOf(gVar.f270259d));
                return true;
            }
            C59071e eVar2 = C96604g.f270256a;
            C58976aa aaVar2 = C58975e.f156826a;
            int i = gfVar.f386599b;
            this.f270255a.mo90262j(new C96587cs("ERROR_BEGIN_FAILED"));
            return true;
        }
        C59104x c = C96604g.f270256a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BeginOtaTask");
        ((C59052c) ((C59052c) c).mo56372aa(16544)).mo56386p("Not begin type we wanted.");
        return false;
    }
}
