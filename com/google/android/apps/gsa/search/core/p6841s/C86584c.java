package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.s.c */
/* compiled from: PG */
abstract class C86584c {

    /* renamed from: a */
    final /* synthetic */ C86590i f233909a;

    public C86584c(C86590i iVar) {
        this.f233909a = iVar;
    }

    /* renamed from: a */
    public final Object mo80199a(Account account) {
        HashMap hashMap;
        int i = 0;
        while (i < 2) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                C86590i iVar = this.f233909a;
                String E = iVar.f233925c.mo79658E(account, iVar.f233927e.mo79758x(C90120fr.f250788aA), 10000);
                if (E == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put("Authorization", "Bearer ".concat(E));
                    hashMap.put("X-Developer-Key", "1016085902054.apps.googleusercontent.com");
                }
                if (hashMap == null) {
                    return null;
                }
                return mo80200b(account, hashMap);
            } catch (C89013ak e) {
                if (e.f241213a == 403) {
                    C59104x d = C86590i.f233923a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8213)).mo56386p("Authorization exception");
                    C86590i iVar2 = this.f233909a;
                    String D = iVar2.f233925c.mo79657D(iVar2.f233927e.mo79758x(C90120fr.f250788aA), 10000);
                    if (D != null) {
                        this.f233909a.f233925c.mo79665L(D);
                    }
                    i++;
                } else {
                    throw e;
                }
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return null;
    }

    /* renamed from: b */
    public abstract Object mo80200b(Account account, Map map);
}
