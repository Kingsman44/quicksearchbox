package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.p10301a.C135893h;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43656d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.d */
/* compiled from: PG */
final class C135898d implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C135896c f370119a;

    public C135898d(C135896c cVar) {
        this.f370119a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135893h hVar = (C135893h) bVar;
        Fragment c = this.f370119a.f370113d.getChildFragmentManager().f634a.mo671c("GOOGLEAPP_BROWSER_URLBAR_WEBX");
        C69664n.m101059e(c, "null cannot be cast to non-null type com.google.android.libraries.web.contrib.urlbar.ui.UrlBarFragment");
        if (!((C43656d) c).mo17754z().f113946c.mo46672c()) {
            C59052c cVar = (C59052c) C135896c.f370110a.mo56225c();
            cVar.mo56379ah(new C59094n(40644));
            cVar.mo56386p("WebLayer's showPageInfo() unavailable - are you using Webview?");
        }
        return C47392e.f123115a;
    }
}
