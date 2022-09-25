package com.google.android.libraries.parenttools.youtube;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.airbnb.lottie.C4972s;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.auth.C142915o;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60908dv;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.parenttools.youtube.aa */
/* compiled from: PG */
public final class C31093aa extends C31101g {

    /* renamed from: a */
    public String f83758a;

    /* renamed from: b */
    public String f83759b;

    /* renamed from: c */
    public WebView f83760c;

    /* renamed from: d */
    public View f83761d;

    /* renamed from: e */
    public View f83762e;

    /* renamed from: f */
    public View f83763f;

    /* renamed from: g */
    public C142915o f83764g;

    /* renamed from: h */
    private String f83765h;

    /* renamed from: i */
    private String f83766i;

    /* renamed from: j */
    private String f83767j;

    /* renamed from: k */
    private String f83768k;

    /* renamed from: l */
    private String f83769l;

    /* renamed from: m */
    private boolean f83770m;

    /* renamed from: n */
    private ExecutorService f83771n;

    /* renamed from: o */
    private Future f83772o;

    /* renamed from: d */
    public final void mo36841d() {
        C31117w wVar = (C31117w) getActivity();
        if (wVar != null) {
            wVar.mo36835y(3, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: e */
    public final void mo36842e(String str) {
        this.f83761d.setVisibility(0);
        this.f83762e.setVisibility(8);
        this.f83763f.setVisibility(0);
        this.f83760c.setVisibility(8);
        C31117w wVar = (C31117w) getActivity();
        if (wVar != null) {
            if (!TextUtils.isEmpty(str)) {
                wVar.mo36835y(4, str);
            } else {
                wVar.mo36835y(5, BuildConfig.FLAVOR);
            }
        }
    }

    /* renamed from: f */
    public final void mo36843f() {
        Uri parse = Uri.parse(this.f83765h);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!queryParameterNames.contains("host_name")) {
            buildUpon.appendQueryParameter("host_name", this.f83766i);
        }
        if (!queryParameterNames.contains("host_version")) {
            buildUpon.appendQueryParameter("host_version", this.f83767j);
        }
        if (!queryParameterNames.contains("profile_id") && !TextUtils.isEmpty(this.f83768k)) {
            buildUpon.appendQueryParameter("profile_id", this.f83768k);
        }
        if (!queryParameterNames.contains("feature")) {
            buildUpon.appendQueryParameter("feature", "parent_tools");
        }
        buildUpon.appendQueryParameter("return_url", this.f83759b);
        buildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        buildUpon.appendQueryParameter("override_hl", BuildConfig.FLAVOR);
        this.f83772o = this.f83771n.submit(new C31116v(this, buildUpon.build().toString()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36844g(ParentToolsResult parentToolsResult, int i) {
        C31117w wVar = (C31117w) getActivity();
        if (wVar != null) {
            wVar.mo36834x(parentToolsResult, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36845h() {
        C31095ac d = ParentToolsResult.m58007d();
        d.mo36840c(2);
        mo36844g(d.mo36838a(), 3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (!(getActivity() instanceof C31117w)) {
            Log.wtf("ParentToolsFragment", "host activity must implement ParentToolsFragmentListener");
        } else if (arguments == null) {
            Log.e("ParentToolsFragment", "getArguments() returned null! Arguments are required.");
            ((C31117w) getActivity()).mo36835y(1, BuildConfig.FLAVOR);
            mo36845h();
        } else {
            C60908dv dvVar = new C60908dv();
            dvVar.mo57410b("ParentToolsFragment #%d");
            this.f83771n = Executors.newSingleThreadExecutor(C60908dv.m93015a(dvVar));
            this.f83765h = arguments.getString("parent_tools_url", "https://families.youtube.com");
            this.f83758a = arguments.getString("parent_account_name", BuildConfig.FLAVOR);
            this.f83766i = arguments.getString("client_name", BuildConfig.FLAVOR);
            this.f83767j = arguments.getString("client_version", BuildConfig.FLAVOR);
            this.f83768k = arguments.getString("child_obfuscated_gaia_id", BuildConfig.FLAVOR);
            this.f83759b = arguments.getString("end_url", "https://www.youtube.com/closeParentTools");
            this.f83769l = arguments.getString("tool_bar_title", BuildConfig.FLAVOR);
            this.f83770m = arguments.getBoolean("should_block_system_back_button", false);
            if (TextUtils.isEmpty(this.f83766i) || TextUtils.isEmpty(this.f83767j)) {
                Log.e("ParentToolsFragment", "Close parent tools because either client name or client version is not set");
                ((C31117w) getActivity()).mo36835y(1, BuildConfig.FLAVOR);
                mo36845h();
            }
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.parent_tools_fragment, viewGroup, false);
        this.f83761d = inflate.findViewById(R.id.control_container);
        this.f83762e = inflate.findViewById(R.id.loading_spinner_container);
        this.f83763f = inflate.findViewById(R.id.error_page_container);
        WebView webView = (WebView) inflate.findViewById(R.id.web_view);
        this.f83760c = webView;
        webView.setWebViewClient(new C31120z(this));
        this.f83760c.setWebChromeClient(new C31119y(this));
        WebSettings settings = this.f83760c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        C4972s.m13750h(getContext().getResources().openRawResource(R.raw.loading_spinner_grey), "2132017437").mo9793e(new C31115u((ImageView) inflate.findViewById(R.id.loading_spinner_lottie_holder)));
        inflate.findViewById(R.id.error_button).setOnClickListener(new C31110p(this));
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.requestFocus();
        if (TextUtils.isEmpty(this.f83769l)) {
            toolbar.setVisibility(8);
        } else {
            toolbar.mo2423x(this.f83769l);
            toolbar.setContentDescription(this.f83769l);
            if (this.f83770m) {
                toolbar.mo2418s((Drawable) null);
            } else {
                toolbar.mo2417r(R.drawable.quantum_gm_ic_arrow_back_gm_grey_24);
                toolbar.mo2416q(getString(R.string.accessibility_parent_tools_toolbar_back));
                toolbar.mo2419t(new C31111q(this));
            }
        }
        mo36843f();
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Future future = this.f83772o;
        if (future != null) {
            future.cancel(false);
            this.f83772o = null;
        }
    }
}
