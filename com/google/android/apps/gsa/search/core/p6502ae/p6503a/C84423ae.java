package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21477y;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21731e;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ae */
/* compiled from: PG */
final class C84423ae implements C58817ah {
    public final /* synthetic */ Object apply(Object obj) {
        C21731e eVar = (C21731e) obj;
        if (!((C21543k) eVar.mo26997c()).f59946b.mo119097c()) {
            C59104x c = C84425ag.f229718a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
            ((C59052c) ((C59052c) c).mo56372aa(9272)).mo56389s("Got error status from queryGlobalSearch: %s", ((C21543k) eVar.mo26997c()).f59946b.f389622h);
            return null;
        }
        C21477y yVar = new C21477y(eVar.f60038a.f394504b);
        if (!yVar.f59907a.mo117665a()) {
            return yVar;
        }
        C59104x c2 = C84425ag.f229718a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
        ((C59052c) ((C59052c) c2).mo56372aa(9270)).mo56389s("Got error for search: %s", yVar.f59907a.f387537a);
        return null;
    }
}
