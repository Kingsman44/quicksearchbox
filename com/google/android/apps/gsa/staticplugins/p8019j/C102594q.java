package com.google.android.apps.gsa.staticplugins.p8019j;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.q */
/* compiled from: PG */
public final /* synthetic */ class C102594q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286350a;

    /* renamed from: b */
    public final /* synthetic */ Query f286351b;

    public /* synthetic */ C102594q(C102550al alVar, Query query) {
        this.f286350a = alVar;
        this.f286351b = query;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C102550al alVar = this.f286350a;
        Query query = this.f286351b;
        C51714bl blVar = (C51714bl) obj;
        Account a = ((C86054o) alVar.f286207g.mo27525b()).mo79668a();
        if (a == null) {
            cxVar = C60856cj.m92900i(false);
            C58976aa aaVar = C58975e.f156826a;
        } else {
            cxVar = alVar.f286208h.mo17952a(a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C102539aa(alVar, blVar, query), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
