package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bd */
/* compiled from: PG */
public final /* synthetic */ class C108572bd implements C90919bp {

    /* renamed from: a */
    public static final /* synthetic */ C108572bd f302023a = new C108572bd();

    private /* synthetic */ C108572bd() {
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x d = C108578bj.f302033a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) d).mo56372aa(24146)).mo56386p("Provider is missing (could skip discovery)");
            C89949q.m146525j(C108607cg.m180627a(16), (C60321oe) null, (C63196b) null, (String) null);
            return;
        }
        int a = C50179nm.m85783a(((C50181no) axVar.mo56107c()).f130449d);
        if (a != 0 && a == 3) {
            C59104x b = C108578bj.f302033a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) b).mo56372aa(24145)).mo56386p("Provider not linked (could skip discovery)");
            C89949q.m146525j(C108607cg.m180627a(11), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
