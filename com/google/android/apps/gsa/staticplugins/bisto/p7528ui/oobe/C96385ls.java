package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ls */
/* compiled from: PG */
public final class C96385ls extends C96363kx {

    /* renamed from: b */
    String f269658b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "UnsupportedLocale";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("name");
        string.getClass();
        this.f269658b = string;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        opaPageLayout.mo77370b(R.layout.unsupported_locale);
        String str = this.f269658b;
        str.getClass();
        ((TextView) opaPageLayout.findViewById(R.id.unsupported_locale_title)).setText(getString(R.string.bisto_unsupported_locale_title, new Object[]{str}));
        C96153dc dcVar = new C96153dc((LegacyOpaStandardPage) null, (C68214a) null, 0);
        opaPageLayout.findViewById(R.id.bisto_unsupported_locale_webview).setBackgroundColor(0);
        dcVar.mo89991a((WebView) opaPageLayout.findViewById(R.id.bisto_unsupported_locale_webview), "https://www.gstatic.com/bisto/oobe/timon/globe.html", C58836b.f156633a);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.bisto_got_it_and_exit_button, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C96384lr(this)));
        return opaPageLayout;
    }
}
