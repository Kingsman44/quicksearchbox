package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110308s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.c */
/* compiled from: PG */
public final class C110205c implements C89193a {

    /* renamed from: a */
    private final C68214a f307083a;

    /* renamed from: b */
    private final C68214a f307084b;

    /* renamed from: c */
    private final C83887au f307085c;

    /* renamed from: d */
    private final C110212j f307086d;

    /* renamed from: e */
    private final C110192ac f307087e;

    /* renamed from: f */
    private final C73798aa f307088f;

    public C110205c(C68214a aVar, C83887au auVar, C110212j jVar, C110192ac acVar, C58833ax axVar, C68214a aVar2) {
        this.f307084b = aVar;
        this.f307085c = auVar;
        this.f307086d = jVar;
        this.f307087e = acVar;
        this.f307088f = (C73798aa) axVar.mo56107c();
        this.f307083a = aVar2;
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        String d = this.f307088f.mo65280d();
        C58976aa aaVar = C58975e.f156826a;
        Account a = ((C86054o) this.f307084b.mo27525b()).mo79668a();
        int i = 1;
        boolean z = a != null && (d == null || ((C110308s) this.f307083a.mo27525b()).mo98560h(a, d));
        Account a2 = ((C86054o) this.f307084b.mo27525b()).mo79668a();
        boolean z2 = a2 != null && this.f307085c.mo77275e(a2);
        boolean z3 = !this.f307086d.mo98473a(false);
        boolean z4 = !this.f307087e.mo98466a();
        if (!z || !z2 || !z3 || !z4) {
            i = 0;
        }
        return Integer.toString(i);
    }
}
