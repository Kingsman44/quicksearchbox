package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.k */
/* compiled from: PG */
public final /* synthetic */ class C139635k implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C139638n f379567a;

    public /* synthetic */ C139635k(C139638n nVar) {
        this.f379567a = nVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C139638n nVar = this.f379567a;
        Uri parse = Uri.parse(lVar.f113296b);
        if (lVar.f113298d) {
            nVar.mo115125h("redirected away from cache", C89885b.STAMP_VIEWER_INVALID_STAMP);
        }
        if (!nVar.f379594r) {
            nVar.mo115125h("new url loaded while not visible", C89885b.STAMP_VIEWER_INVALID_STAMP);
        } else if (nVar.f379595s) {
            nVar.mo115119b(true);
        } else {
            nVar.mo115120c(parse);
        }
    }
}
