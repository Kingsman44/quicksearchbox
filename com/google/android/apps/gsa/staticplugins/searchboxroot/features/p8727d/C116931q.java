package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.p6990an.C89233x;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118686y;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.q */
/* compiled from: PG */
public final class C116931q extends C88596l {

    /* renamed from: b */
    private final C118686y f324654b;

    public C116931q(C118686y yVar) {
        this.f324654b = yVar;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 179;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        return new C89233x(this.f324654b.mo103868b(C137589b.PERSONAL_RESULTS));
    }
}
