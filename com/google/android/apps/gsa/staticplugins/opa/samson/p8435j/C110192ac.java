package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.ac */
/* compiled from: PG */
public final class C110192ac {

    /* renamed from: a */
    private final C86124t f307051a;

    /* renamed from: b */
    private final C68214a f307052b;

    /* renamed from: c */
    private final C113787bc f307053c;

    /* renamed from: d */
    private final C9388a f307054d;

    /* renamed from: e */
    private final bm f307055e;

    public C110192ac(C86124t tVar, C68214a aVar, C113787bc bcVar, C9388a aVar2, bm bmVar) {
        this.f307051a = tVar;
        this.f307052b = aVar;
        this.f307053c = bcVar;
        this.f307054d = aVar2;
        this.f307055e = bmVar;
    }

    /* renamed from: a */
    public final boolean mo98466a() {
        boolean z;
        if (!this.f307053c.mo100629i(false)) {
            if (!this.f307054d.mo17583e() && !this.f307054d.mo17585g()) {
                return true;
            }
            if (this.f307055e.r()) {
                z = this.f307051a.mo79746e(C90014bt.f247238dQ);
            } else {
                z = this.f307051a.mo79746e(C90014bt.f247324ex);
            }
            if (!z || this.f307055e.l() || ((long) ((SharedPreferences) this.f307052b.mo27525b()).getInt("opa_email_optin_seen_count", 0)) >= this.f307051a.mo79743a(C90014bt.f247216cv) || ((SharedPreferences) this.f307052b.mo27525b()).getInt("opa_email_opt_in_status", 0) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
