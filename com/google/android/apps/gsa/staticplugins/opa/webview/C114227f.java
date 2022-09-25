package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.webview.C87256b;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.f */
/* compiled from: PG */
final class C114227f extends C87256b {

    /* renamed from: a */
    public final OpaWebView f316740a;

    /* renamed from: b */
    private final C91097g f316741b;

    /* renamed from: c */
    private final C22871g f316742c;

    /* renamed from: d */
    private final C86124t f316743d;

    public C114227f(C91097g gVar, OpaWebView opaWebView, C22871g gVar2, C86124t tVar) {
        this.f316741b = gVar;
        this.f316740a = opaWebView;
        this.f316742c = gVar2;
        this.f316743d = tVar;
    }

    /* renamed from: a */
    public final void mo79402a() {
        this.f316742c.mo28212l("goBack", new C114226e(this));
    }

    /* renamed from: b */
    public final void mo79403b(Uri uri, boolean z, boolean z2) {
        if (this.f316743d.mo79746e(C90029ch.f248263ax)) {
            C28295m.m52919e(this.f316740a, new C28292j(158329));
            C89949q.m146521e(C28285c.m52874a(this.f316740a, 472), false);
        }
        Intent intent = new Intent();
        if (this.f316743d.mo79746e(C90029ch.f248272bf)) {
            intent.setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.googlequicksearchbox.GOOGLE_SEARCH").putExtra("query", uri.getQueryParameter("q")).addFlags(268435456);
        } else {
            intent = C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", uri));
            intent.putExtra("full_screen", z);
        }
        this.f316741b.mo65089a(intent);
    }
}
