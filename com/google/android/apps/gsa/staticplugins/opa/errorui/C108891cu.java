package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opaonboarding.C83886at;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.cu */
/* compiled from: PG */
public final class C108891cu {

    /* renamed from: a */
    private final bg f302756a;

    /* renamed from: b */
    private final C86338r f302757b;

    /* renamed from: c */
    private final C83887au f302758c;

    /* renamed from: d */
    private final C113787bc f302759d;

    /* renamed from: e */
    private final bm f302760e;

    /* renamed from: f */
    private final C86124t f302761f;

    public C108891cu(bg bgVar, C86338r rVar, C58833ax axVar, C113787bc bcVar, bm bmVar, C86124t tVar) {
        this.f302756a = bgVar;
        this.f302757b = rVar;
        this.f302758c = (C83887au) axVar.mo56107c();
        this.f302759d = bcVar;
        this.f302760e = bmVar;
        this.f302761f = tVar;
    }

    /* renamed from: a */
    public final boolean mo97261a(Account account) {
        boolean z;
        boolean z2;
        C58976aa aaVar = C58975e.f156826a;
        this.f302756a.c(account.name);
        C83886at.m133605e(this.f302757b, "oc:udc_prompted", account.name, 3);
        this.f302759d.mo100631k();
        this.f302760e.l();
        if (!this.f302756a.c(account.name) && !this.f302758c.mo77273c(account, 3) && ((this.f302761f.mo79746e(C90053de.f248950Q) || !this.f302759d.mo100632l()) && (!this.f302759d.mo100631k() || !this.f302760e.l()))) {
            z = true;
        } else {
            z = false;
        }
        this.f302758c.mo77271a(account, 3);
        this.f302758c.mo77274d(account, 3);
        this.f302760e.l();
        if (!this.f302758c.mo77271a(account, 3) && ((this.f302761f.mo79746e(C90053de.f248950Q) || !this.f302759d.mo100632l()) && (this.f302758c.mo77274d(account, 3) || this.f302761f.mo79746e(C90053de.f248950Q) || !this.f302760e.l()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z || z2;
    }
}
