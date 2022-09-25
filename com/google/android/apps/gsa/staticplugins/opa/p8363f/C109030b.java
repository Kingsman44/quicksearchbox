package com.google.android.apps.gsa.staticplugins.opa.p8363f;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.f.b */
/* compiled from: PG */
public final class C109030b {

    /* renamed from: a */
    private final C86124t f303190a;

    /* renamed from: b */
    private final C68214a f303191b;

    /* renamed from: c */
    private final C68214a f303192c;

    /* renamed from: d */
    private final C89994f f303193d;

    public C109030b(C86124t tVar, C68214a aVar, C68214a aVar2, C89994f fVar) {
        this.f303190a = tVar;
        this.f303191b = aVar;
        this.f303192c = aVar2;
        this.f303193d = fVar;
    }

    /* renamed from: a */
    public final boolean mo97406a() {
        Account a = ((C86054o) this.f303192c.mo27525b()).mo79668a();
        if (!((C58833ax) this.f303191b.mo27525b()).mo56113h()) {
            return false;
        }
        C109029a aVar = (C109029a) ((C58833ax) this.f303191b.mo27525b()).mo56107c();
        if (aVar.mo97402g(a) != 5) {
            if (((Boolean) aVar.f303183b.mo27525b()).booleanValue() || !aVar.f303182a.u() || !aVar.f303182a.w() || !aVar.f303185d.mo17534a() || !((C84413ad) aVar.f303184c.mo27525b()).mo77971h()) {
                return false;
            }
            if (!aVar.f303186e.mo100627g(a)) {
                aVar.f303186e.mo100632l();
            }
        }
        if (!this.f303193d.mo83890aj().isEmpty()) {
            return false;
        }
        String x = this.f303190a.mo79758x(C90014bt.f247731mg);
        return x.contains("ui.SHOW_SEARCH_RESULTS_PAGE,") && x.contains("tts.OUTPUT,");
    }
}
