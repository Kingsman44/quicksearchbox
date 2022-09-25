package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.ad */
/* compiled from: PG */
public final class C115916ad extends Fragment {

    /* renamed from: a */
    private FooterLayout f321416a;

    /* renamed from: b */
    private WebView f321417b;

    /* renamed from: c */
    private String f321418c;

    /* renamed from: a */
    public final void mo102324a() {
        getTargetFragment().onActivityResult(getTargetRequestCode(), -1, (Intent) null);
        getActivity().getFragmentManager().popBackStack();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f321418c = bundle.getString("tosContentHtml");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.opa_payments_terms_of_service, (ViewGroup) null);
        this.f321416a = (FooterLayout) inflate.findViewById(R.id.tos_footer_container);
        WebView webView = (WebView) inflate.findViewById(R.id.tos_webview);
        this.f321417b = webView;
        webView.loadDataWithBaseURL(BuildConfig.FLAVOR, this.f321418c, "text/html", (String) null, BuildConfig.FLAVOR);
        this.f321416a.mo77362c(1);
        FooterLayout footerLayout = this.f321416a;
        C84018m.m133907b(footerLayout.mo77360a(), R.string.action_text_close, footerLayout);
        this.f321416a.mo77360a().setOnClickListener(new C89943l(new C115915ac(this)));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("tosContentHtml", this.f321418c);
    }
}
