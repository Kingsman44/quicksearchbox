package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.is */
/* compiled from: PG */
public final class C96304is extends C96363kx {

    /* renamed from: d */
    public static final /* synthetic */ int f269493d = 0;

    /* renamed from: b */
    public C96325jm f269494b;

    /* renamed from: c */
    public C91090a f269495c;

    /* renamed from: e */
    private OpaPageLayout f269496e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "LanguageSettingFragment";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269496e = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.language_setting);
        FooterLayout footerLayout = this.f269496e.f228726a;
        footerLayout.mo77362c(2);
        footerLayout.mo77360a().setText(R.string.settings);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C96300io(this)));
        footerLayout.mo77361b().setText(R.string.bisto_skip);
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C96301ip(this)));
        String str = true != C96498r.m159875b(this.f269494b.f269538a.f269046a) ? "https://www.gstatic.com/bisto/oobe/voice_match/voice_match.html" : "https://www.gstatic.com/bisto/oobe/voice_match/voice_match_dark.html";
        C58836b bVar = C58836b.f156633a;
        C96153dc dcVar = new C96153dc((LegacyOpaStandardPage) null, C96302iq.f269491a, 0);
        WebView webView = (WebView) this.f269496e.f228728c.findViewById(R.id.language_setting_webview);
        webView.setBackgroundColor(0);
        dcVar.mo89991a(webView, str, bVar);
        return this.f269496e;
    }
}
