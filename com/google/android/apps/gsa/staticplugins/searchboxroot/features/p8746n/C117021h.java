package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.h */
/* compiled from: PG */
public final class C117021h extends C88596l {

    /* renamed from: b */
    private final Context f324871b;

    /* renamed from: c */
    private final C117025g f324872c;

    /* renamed from: d */
    private final C117022i f324873d;

    public C117021h(Context context, C117025g gVar, C117022i iVar) {
        this.f324871b = context;
        this.f324872c = gVar;
        this.f324873d = iVar;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 86;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        this.f324873d.mo103102a(suggestion, query.f252749G, 4, qrVar != null ? (C60456qs) qrVar.build() : null, query.mo84474eb());
        Intent b = C88690b.m143521b(suggestion.mo44269v(), C89235z.m73091K(suggestion), C89235z.m145144p(suggestion), C89235z.m73093M(suggestion), C89235z.m145145q(suggestion), C89235z.m145143o(suggestion));
        b.addCategory("android.intent.category.BROWSABLE");
        C88690b.m143523d(b, this.f324872c.mo103107c());
        C88690b.m143522c(b);
        C89429a.m145468z(this.f324871b, b, true, this.f324872c.mo103107c());
        return new C89232w(b);
    }
}
