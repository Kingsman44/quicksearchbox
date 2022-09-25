package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.searchbox.shared.C88690b;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54260x;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.k */
/* compiled from: PG */
public final class C116925k extends C88596l {
    /* renamed from: a */
    public final int mo82254a() {
        return 136;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        String str2 = null;
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        if (suggestion.mo44265s()) {
            C54228aq aqVar = suggestion.f108906A;
            if ((aqVar.f142330a & 1048576) != 0) {
                C54260x xVar = aqVar.f142347s;
                if (xVar == null) {
                    xVar = C54260x.f142466e;
                }
                str2 = xVar.f142469b;
                C54260x xVar2 = aqVar.f142347s;
                if (xVar2 == null) {
                    xVar2 = C54260x.f142466e;
                }
                String str3 = xVar2.f142468a;
            }
        }
        Intent b = C88690b.m143521b(suggestion.mo44269v(), "android.intent.action.VIEW", str2, (String) null, (String) null, (String) null);
        b.addCategory("android.intent.category.BROWSABLE");
        C88690b.m143522c(b);
        return new C89232w(b);
    }
}
