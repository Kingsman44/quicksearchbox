package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.google.r */
/* compiled from: PG */
public final class C86076r implements C85983e {

    /* renamed from: a */
    private final C91142g f232667a;

    /* renamed from: b */
    private final C69464a f232668b;

    public C86076r(C91142g gVar, C69464a aVar) {
        this.f232667a = gVar;
        this.f232668b = aVar;
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        if (this.f232667a.mo85405j(C90110fh.f250632ad)) {
            String str = "1";
            if ((query == null || !query.mo84457dk()) && true != ((Boolean) this.f232668b.mo17428b()).booleanValue()) {
                str = "0";
            }
            cVar.mo79638d("cs", str);
        }
    }
}
