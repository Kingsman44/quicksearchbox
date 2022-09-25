package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7699gr;
import com.google.p375ai.p378b.C7700gs;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7887nq;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.bl */
/* compiled from: PG */
public final class C85661bl {

    /* renamed from: a */
    public final Account f231534a;

    /* renamed from: b */
    public final Map f231535b;

    /* renamed from: c */
    public final int f231536c;

    /* renamed from: d */
    private final C7700gs f231537d;

    public C85661bl(Account account, C7700gs gsVar, Map map, int i) {
        this.f231534a = account;
        this.f231537d = gsVar;
        this.f231535b = map;
        this.f231536c = i;
    }

    /* renamed from: a */
    public final C85663bn mo79175a(C85662bm bmVar) {
        C85663bn bnVar = (C85663bn) this.f231535b.get(bmVar);
        C58838bb.m90867b(bnVar, "Result does not include %s", bmVar);
        return bnVar;
    }

    /* renamed from: b */
    public final String mo79176b(C85662bm bmVar) {
        C7699gr grVar;
        if (this.f231537d != null && !mo79175a(bmVar).mo79184b()) {
            if (((C85663bn) this.f231535b.get(bmVar)) != null) {
                C7700gs gsVar = this.f231537d;
                if (gsVar != null) {
                    Iterator it = gsVar.f26877b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        grVar = (C7699gr) it.next();
                        C7887nq nqVar = grVar.f26871b;
                        if (nqVar == null) {
                            nqVar = C7887nq.f27680c;
                        }
                        C7886np a = C7886np.m22886a(nqVar.f27683b);
                        if (a == null) {
                            C59052c cVar = (C59052c) ((C59052c) C85664bo.f231554a.mo56225c()).mo56372aa(7430);
                            C7887nq nqVar2 = grVar.f26871b;
                            if (nqVar2 == null) {
                                nqVar2 = C7887nq.f27680c;
                            }
                            cVar.mo56387q("Error getting OptInSettingId for number %s", nqVar2.f27683b);
                        } else if (bmVar == C85662bm.m137512a(a)) {
                            break;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Unknown setting: ".concat(String.valueOf(String.valueOf(bmVar))));
            }
        }
        grVar = null;
        if (grVar == null || (grVar.f26870a & 4) == 0) {
            return null;
        }
        return grVar.f26873d;
    }

    /* renamed from: c */
    public final Set mo79177c() {
        return this.f231535b.keySet();
    }

    /* renamed from: d */
    public final boolean mo79178d() {
        for (C85662bm a : this.f231535b.keySet()) {
            if (!mo79175a(a).mo79184b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo79179e() {
        return this.f231534a != null;
    }

    /* renamed from: f */
    public final boolean mo79180f() {
        if (!mo79179e()) {
            return false;
        }
        for (C85662bm g : this.f231535b.keySet()) {
            if (!mo79181g(g)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo79181g(C85662bm bmVar) {
        return mo79179e() && mo79175a(bmVar).f231553b;
    }
}
