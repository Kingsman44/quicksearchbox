package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.net.Uri;
import android.webkit.WebView;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dc */
/* compiled from: PG */
final class C96153dc {

    /* renamed from: a */
    public final int f269171a;

    /* renamed from: b */
    public final C68214a f269172b;

    /* renamed from: c */
    public final LegacyOpaStandardPage f269173c;

    /* renamed from: d */
    public boolean f269174d;

    public C96153dc() {
        this((LegacyOpaStandardPage) null, (C68214a) null, 0);
    }

    public C96153dc(LegacyOpaStandardPage legacyOpaStandardPage, C68214a aVar, int i) {
        this.f269173c = legacyOpaStandardPage;
        this.f269172b = aVar;
        this.f269171a = i;
    }

    /* renamed from: b */
    public static boolean m159464b(Uri uri, Uri uri2) {
        return C58890d.m90990e(String.valueOf(uri.getHost()).concat(String.valueOf(uri.getPath())), String.valueOf(uri2.getHost()).concat(String.valueOf(uri2.getPath())));
    }

    /* renamed from: a */
    public final C60870cx mo89991a(WebView webView, String str, C58833ax axVar) {
        if (axVar.mo56113h()) {
            webView.setContentDescription((CharSequence) axVar.mo56107c());
        }
        C60870cx a = C2169h.m6027a(new C96149cz(webView));
        webView.getSettings().setJavaScriptEnabled(true);
        C90476a aVar = C91018d.f254254a;
        webView.loadUrl(str);
        LegacyOpaStandardPage legacyOpaStandardPage = this.f269173c;
        if (legacyOpaStandardPage != null) {
            legacyOpaStandardPage.f228724c.mo77494d(5, true);
        }
        return C60846c.m92878g(a, CancellationException.class, new C96151da(this), C60826bg.f164896a);
    }
}
