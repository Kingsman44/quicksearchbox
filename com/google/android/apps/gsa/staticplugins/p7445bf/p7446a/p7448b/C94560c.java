package com.google.android.apps.gsa.staticplugins.p7445bf.p7446a.p7448b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83937x;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84020o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90092eq;
import com.google.android.apps.gsa.shared.p7066m.C90103fa;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.a.b.c */
/* compiled from: PG */
public final class C94560c extends C83907bm {

    /* renamed from: b */
    public static final C59071e f264500b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.a.b.c");

    /* renamed from: c */
    public C86124t f264501c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.value_prop_page, viewGroup, false);
        WebView webView = (WebView) opaPageLayout.findViewById(R.id.value_prop_anim);
        webView.setWebViewClient(new C84020o(new C94558a(webView)));
        webView.getSettings().setJavaScriptEnabled(true);
        StringBuilder sb = new StringBuilder();
        if ((getResources().getConfiguration().uiMode & 48) != 32) {
            sb.append(this.f264501c.mo79758x(C90092eq.f250552a));
        } else {
            sb.append(this.f264501c.mo79758x(C90092eq.f250553b));
        }
        int a = C83937x.m133683a(getArguments().getInt("value_prop_id", 0));
        int i = a - 1;
        if (a != 0) {
            if (i == 41) {
                sb.append(this.f264501c.mo79758x(C90103fa.f250558a));
            }
            webView.loadUrl(sb.toString());
            webView.setBackgroundColor(0);
            WebSettings settings = webView.getSettings();
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            FooterLayout footerLayout = opaPageLayout.f228726a;
            footerLayout.mo77362c(1);
            Button a2 = footerLayout.mo77360a();
            a2.setText(getString(R.string.value_prop_action_button));
            a2.setOnClickListener(new C94559b(this));
            return opaPageLayout;
        }
        throw null;
    }
}
