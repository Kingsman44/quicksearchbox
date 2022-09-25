package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.e */
/* compiled from: PG */
public final class C110481e implements C89193a {

    /* renamed from: a */
    private final C68214a f308013a;

    /* renamed from: b */
    private final C68214a f308014b;

    /* renamed from: c */
    private final C68214a f308015c;

    /* renamed from: d */
    private final C68214a f308016d;

    /* renamed from: e */
    private final C68214a f308017e;

    public C110481e(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f308013a = aVar;
        this.f308014b = aVar2;
        this.f308015c = aVar3;
        this.f308016d = aVar4;
        this.f308017e = aVar5;
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        if (!"com.google.android.setupwizard".equals(str2) && !"com.google.android.car.setupwizard".equals(str2)) {
            return null;
        }
        if (!((C86124t) this.f308013a.mo27525b()).mo79760z()) {
            i = 0;
        } else if (!((bm) this.f308015c.mo27525b()).u()) {
            i = 1;
        } else {
            Account a = ((C86054o) this.f308014b.mo27525b()).mo79668a();
            i = (a == null || (!((C83887au) this.f308017e.mo27525b()).mo77274d(a, 4) ? !((bg) this.f308016d.mo27525b()).c(a.name) : !((C83887au) this.f308017e.mo27525b()).mo77273c(a, 4))) ? 3 : 2;
        }
        return Integer.toString(i);
    }
}
