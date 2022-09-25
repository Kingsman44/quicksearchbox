package com.google.android.apps.gsa.searchbox.p6944c.p6949c;

import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88547ac;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.p6950d.C88599a;
import com.google.android.apps.gsa.shared.p6990an.C89230u;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.searchbox.c.c.i */
/* compiled from: PG */
public final class C88593i extends C88596l implements C89200e {

    /* renamed from: b */
    private C88547ac f239436b;

    /* renamed from: a */
    public final int mo82254a() {
        return 0;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        String str2;
        if (TextUtils.isEmpty(suggestion.f108919t)) {
            str2 = suggestion.mo44269v();
        } else {
            str2 = suggestion.f108919t;
        }
        return new C89230u(C88599a.m143212a(this.f239436b.mo82212a(query, str2, suggestion, BuildConfig.FLAVOR, str, 148, qrVar != null ? (C60456qs) qrVar.build() : null)));
    }

    /* renamed from: c */
    public final void mo82256c(C88614r rVar) {
        this.f239436b = rVar.f239534e;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239436b = ((C88614r) obj).f239534e;
    }
}
