package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.searchbox.shared.C88690b;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.o */
/* compiled from: PG */
public final class C116929o extends C88596l {

    /* renamed from: b */
    private final Context f324648b;

    /* renamed from: c */
    private final C117025g f324649c;

    public C116929o(Context context, C117025g gVar) {
        this.f324648b = context;
        this.f324649c = gVar;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 83;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        Intent b = C88690b.m143521b(suggestion.mo44269v(), "android.intent.action.VIEW", C89235z.m145147s(suggestion), (String) null, (String) null, (String) null);
        b.addCategory("android.intent.category.BROWSABLE");
        String c = this.f324649c.mo103107c();
        C88690b.m143523d(b, c);
        C88690b.m143522c(b);
        C89429a.m145468z(this.f324648b, b, true, c);
        return new C89232w(b);
    }
}
