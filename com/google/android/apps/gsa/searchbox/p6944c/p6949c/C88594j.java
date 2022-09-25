package com.google.android.apps.gsa.searchbox.p6944c.p6949c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.shared.C88690b;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.searchbox.c.c.j */
/* compiled from: PG */
public final class C88594j extends C88596l implements C89200e {

    /* renamed from: b */
    private final Context f239437b;

    public C88594j(Context context) {
        this.f239437b = context;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 156;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        Intent intent;
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        if (suggestion.f108925z.contains(286)) {
            intent = this.f239437b.getPackageManager().getLaunchIntentForPackage(C41670aj.m73076i(suggestion));
        } else {
            Context context = this.f239437b;
            String K = C89235z.m73091K(suggestion);
            intent = C88690b.m143521b("android.intent.action.SEARCH".equals(K) ? suggestion.mo44269v() : null, K, C89235z.m145144p(suggestion), C89235z.m73093M(suggestion), C89235z.m145145q(suggestion), C89235z.m145143o(suggestion));
            String str2 = intent.getPackage();
            if (context.getPackageName().equals(str2) || "com.google.android.gms".equals(str2)) {
                intent.setPackage((String) null);
            }
            C89429a.m145468z(context, intent, true, (String) null);
        }
        return intent == null ? new C89231v() : new C89232w(intent);
    }
}
