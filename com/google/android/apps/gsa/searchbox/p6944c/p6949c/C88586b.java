package com.google.android.apps.gsa.searchbox.p6944c.p6949c;

import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88547ac;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.shared.p6990an.C89230u;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54248l;

/* renamed from: com.google.android.apps.gsa.searchbox.c.c.b */
/* compiled from: PG */
public final class C88586b extends C88596l implements C89200e {

    /* renamed from: b */
    private C88547ac f239430b;

    /* renamed from: a */
    public final int mo82254a() {
        return 46;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        String str2;
        C88547ac acVar = this.f239430b;
        if (!TextUtils.isEmpty(suggestion.f108919t)) {
            str2 = suggestion.f108919t;
        } else {
            if (suggestion.mo44265s()) {
                C54228aq aqVar = suggestion.f108906A;
                C54248l lVar = aqVar.f142338j;
                if (lVar == null) {
                    lVar = C54248l.f142431m;
                }
                if ((lVar.f142433a & 4) != 0) {
                    C54248l lVar2 = aqVar.f142338j;
                    if (lVar2 == null) {
                        lVar2 = C54248l.f142431m;
                    }
                    str2 = lVar2.f142436d;
                }
            }
            str2 = null;
        }
        if (str2 == null) {
            str2 = suggestion.mo44269v();
        }
        return new C89230u(acVar.mo82212a(query, str2, suggestion, BuildConfig.FLAVOR, str, 148, qrVar != null ? (C60456qs) qrVar.build() : null));
    }

    /* renamed from: c */
    public final void mo82256c(C88614r rVar) {
        this.f239430b = rVar.f239534e;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239430b = ((C88614r) obj).f239534e;
    }
}
