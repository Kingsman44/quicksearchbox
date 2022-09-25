package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114214b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.aa */
/* compiled from: PG */
public final /* synthetic */ class C114186aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114188ac f316596a;

    /* renamed from: b */
    public final /* synthetic */ Uri f316597b;

    public /* synthetic */ C114186aa(C114188ac acVar, Uri uri) {
        this.f316596a = acVar;
        this.f316597b = uri;
    }

    public final void run() {
        C114188ac acVar = this.f316596a;
        Uri uri = this.f316597b;
        C114235n nVar = (C114235n) acVar.f316602b.mo27525b();
        if (((C85929cw) acVar.f316604d.f316709b.mo27525b()).mo79575p(uri.toString()).mo56113h()) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String next : uri.getQueryParameterNames()) {
                if (!C114214b.f316708a.contains(next)) {
                    buildUpon.appendQueryParameter(next, uri.getQueryParameter(next));
                }
            }
            uri = buildUpon.build();
        }
        C87504b bVar = acVar.f316607g;
        bVar.getClass();
        Uri uri2 = bVar.f236337b.f236331a;
        Query query = acVar.f316606f;
        query.getClass();
        if (nVar.f316774b.mo79502a(uri)) {
            new C90873ag(nVar.f316775c.mo78988c(uri), nVar.f316777e, "AdShield callback GetUpdatedUriWithAdSignals", new C114233l(nVar, uri2, query)).mo85223a(new C114234m(nVar, uri, uri2, query));
        } else {
            nVar.mo101271a(uri, uri2, query);
        }
    }
}
