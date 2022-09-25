package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8741i;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.i.a */
/* compiled from: PG */
public final class C116973a extends C88596l {

    /* renamed from: b */
    private final Context f324733b;

    public C116973a(Context context) {
        this.f324733b = context;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 139;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        return new C89232w(C89429a.m145443a(this.f324733b, "and.gsa.int"));
    }
}
