package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105947ba;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105948bb;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cv */
/* compiled from: PG */
public final /* synthetic */ class C108278cv implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301228a;

    /* renamed from: b */
    public final /* synthetic */ String f301229b;

    /* renamed from: c */
    public final /* synthetic */ C108300dq f301230c;

    public /* synthetic */ C108278cv(C108303dt dtVar, String str, C108300dq dqVar) {
        this.f301228a = dtVar;
        this.f301229b = str;
        this.f301230c = dqVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C108303dt dtVar = this.f301228a;
        String str = this.f301229b;
        C108300dq dqVar = this.f301230c;
        List list = (List) obj;
        if (list == null || list.isEmpty() || (str != null && dtVar.f301279j.contains(str))) {
            dtVar.mo96756s();
            return;
        }
        if (!list.isEmpty()) {
            long j = ((C105930ak) list.get(list.size() - 1)).f295759d;
            C86337q b = dtVar.f301273d.mo80076b();
            b.mo80072g(dtVar.mo96747j(), j);
            if (str != null) {
                b.mo80073h(dtVar.mo96746i(), str);
            } else {
                b.mo80075j(dtVar.mo96746i());
            }
            b.apply();
        }
        C105952bf bfVar = (C105952bf) dtVar.f301271b.mo27525b();
        C108293dj djVar = new C108293dj(dtVar, dqVar);
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        new C90873ag(bfVar.mo95190c(), bfVar.f295808d, "HistoryStore:Write", new C105947ba(bfVar, list, str, djVar)).mo85223a(C105948bb.f295795a);
    }
}
