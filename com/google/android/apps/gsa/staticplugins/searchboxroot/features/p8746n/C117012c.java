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

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c */
/* compiled from: PG */
public final class C117012c extends C88596l {

    /* renamed from: b */
    private final Context f324839b;

    /* renamed from: c */
    private final C117025g f324840c;

    /* renamed from: d */
    private final C117022i f324841d;

    public C117012c(Context context, C117025g gVar, C117022i iVar) {
        this.f324839b = context;
        this.f324840c = gVar;
        this.f324841d = iVar;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 89;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        this.f324841d.mo103102a(suggestion, query.f252749G, 2, qrVar != null ? (C60456qs) qrVar.build() : null, query.mo84474eb());
        String K = C89235z.m73091K(suggestion);
        Intent b = C88690b.m143521b("android.intent.action.SEARCH".equals(K) ? suggestion.mo44269v() : null, K, C89235z.m145144p(suggestion), C89235z.m73093M(suggestion), C89235z.m145145q(suggestion), C89235z.m145143o(suggestion));
        String str2 = b.getPackage();
        if (this.f324839b.getPackageName().equals(str2) || "com.google.android.gms".equals(str2)) {
            b.setPackage((String) null);
        }
        C89429a.m145468z(this.f324839b, b, true, this.f324840c.mo103107c());
        return new C89232w(b);
    }
}
