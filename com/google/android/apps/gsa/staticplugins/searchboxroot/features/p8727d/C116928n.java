package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.n */
/* compiled from: PG */
public final class C116928n extends C88596l {

    /* renamed from: b */
    private static final C59071e f324645b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.n");

    /* renamed from: c */
    private final Context f324646c;

    /* renamed from: d */
    private final C117025g f324647d;

    public C116928n(Context context, C117025g gVar) {
        this.f324646c = context;
        this.f324647d = gVar;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 110;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        Intent intent = null;
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        Context context = this.f324646c;
        if (!TextUtils.isEmpty(C89235z.m145135g(suggestion))) {
            intent = context.getPackageManager().getLaunchIntentForPackage(C89235z.m145135g(suggestion));
            intent.setFlags(270532608);
        }
        if (intent != null) {
            C89429a.m145468z(this.f324646c, intent, true, this.f324647d.mo103107c());
            return new C89232w(intent);
        }
        C59104x c = f324645b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.r.PersAppSugClkHdlr");
        ((C59052c) ((C59052c) c).mo56372aa(32505)).mo56389s("Unable to build an intent for the suggestion click: %s", suggestion);
        return new C89231v();
    }
}
