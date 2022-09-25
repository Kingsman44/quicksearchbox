package com.google.android.apps.gsa.staticplugins.opa.setupwizard.p8447a;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p506e.C9408a;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89945m;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114213a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3549a.C45241d;
import com.google.android.setupdesign.view.IllustrationVideoView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60870cx;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.a.k */
/* compiled from: PG */
public final class C110450k extends C83907bm {

    /* renamed from: b */
    public static final C59071e f307903b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.a.k");

    /* renamed from: c */
    public C86124t f307904c;

    /* renamed from: d */
    public C89994f f307905d;

    /* renamed from: e */
    public SharedPreferences f307906e;

    /* renamed from: f */
    public C9408a f307907f;

    /* renamed from: g */
    public C114213a f307908g;

    /* renamed from: h */
    public ComponentName f307909h;

    /* renamed from: i */
    public C22871g f307910i;

    /* renamed from: j */
    public String f307911j;

    /* renamed from: k */
    public String f307912k;

    /* renamed from: l */
    public ViewFlipper f307913l;

    /* renamed from: m */
    public WebView f307914m;

    /* renamed from: n */
    String f307915n;

    /* renamed from: o */
    String f307916o;

    /* renamed from: p */
    C60870cx f307917p = null;

    /* renamed from: q */
    C60870cx f307918q = null;

    /* renamed from: r */
    private OpaPageLayout f307919r;

    /* renamed from: s */
    private int f307920s;

    /* renamed from: t */
    private int f307921t;

    /* renamed from: u */
    private Bundle f307922u;

    /* renamed from: v */
    private Button f307923v;

    /* renamed from: w */
    private Button f307924w;

    /* renamed from: i */
    private final boolean m183994i() {
        return (this.f307904c.mo79746e(C90062dn.f249225x) && "edu1".equals(this.f307911j)) || (this.f307904c.mo79746e(C90062dn.f249226y) && ("edu2".equals(this.f307911j) || "ngas".equals(this.f307911j)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    @JavascriptInterface
    public void completeStep() {
        this.f307910i.mo28212l("suw.completeStep", new C110447h(this));
    }

    /* renamed from: e */
    public final void mo98688e() {
        mo77318iT().mo77312a();
    }

    /* renamed from: g */
    public final void mo98689g() {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = true;
        boolean z2 = this.f307904c.mo79746e(C90062dn.f249214m) && "edu1".equals(this.f307911j);
        if (!this.f307904c.mo79746e(C90062dn.f249213l) || (!"edu2".equals(this.f307911j) && !"ngas".equals(this.f307911j))) {
            z = false;
        }
        if (z2 || z) {
            this.f307918q = this.f307910i.mo28208h("timer for loading settings", 5000, new C110446g(this));
            this.f307919r.mo77369a().mo77475d(3);
            this.f307914m.evaluateJavascript("if (document.readyState === 'complete') {  window.agsa_opasuw_host.loadSettingsAndComplete();} else {  window.onload=function() {    window.agsa_opasuw_host.loadSettingsAndComplete();  };}", (ValueCallback) null);
            return;
        }
        mo98688e();
    }

    @JavascriptInterface
    public String getSupportedSettings() {
        return TextUtils.join(",", this.f307904c.mo79745c(C90062dn.f249197A));
    }

    /* renamed from: h */
    public final void mo98691h() {
        C60321oe oeVar;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        if (getActivity() != null) {
            C84012g a = this.f307919r.mo77369a();
            C28292j a2 = C28295m.m52915a(this.f307923v);
            C60321oe oeVar2 = null;
            if (a2 == null) {
                oeVar = null;
            } else {
                oeVar = C28285c.m52883j(a2, 5, (Integer) null);
            }
            if (oeVar == null) {
                onClickListener = new C89943l(new C110441b(this));
            } else {
                onClickListener = new C89945m(oeVar, new C110442c(this));
            }
            boolean z = true;
            if (m183994i()) {
                a.mo77475d(2);
                C84010e e = C84011f.m133882e();
                e.mo77375c(this.f307915n);
                ((C83958a) e).f228734b = onClickListener;
                a.mo77472a(e.mo77373a());
                C28292j a3 = C28295m.m52915a(this.f307924w);
                if (a3 != null) {
                    oeVar2 = C28285c.m52883j(a3, 5, (Integer) null);
                }
                if (oeVar2 == null) {
                    onClickListener2 = new C89943l(new C110443d(this));
                } else {
                    onClickListener2 = new C89945m(oeVar2, new C110444e(this));
                }
                C84010e e2 = C84011f.m133882e();
                e2.mo77375c(this.f307916o);
                ((C83958a) e2).f228734b = onClickListener2;
                boolean z2 = this.f307904c.mo79746e(C90062dn.f249199C) && "edu1".equals(this.f307911j);
                boolean z3 = this.f307904c.mo79746e(C90062dn.f249200D) && ("edu2".equals(this.f307911j) || "ngas".equals(this.f307911j));
                if (!z2 && !z3) {
                    z = false;
                }
                e2.mo77374b(z);
                a.mo77473b(e2.mo77373a());
                return;
            }
            a.mo77475d(1);
            C84010e e3 = C84011f.m133882e();
            e3.mo77375c(this.f307915n);
            ((C83958a) e3).f228734b = onClickListener;
            a.mo77472a(e3.mo77373a());
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f307920s = getArguments().getInt("url-config-param");
        this.f307911j = getArguments().getString("url-screen-param", "edu2");
        this.f307912k = getArguments().getString("web-view-url", this.f307904c.mo79758x(C90014bt.f247053R));
        this.f307921t = getArguments().getInt("fragment-ve-id", 61485);
        Bundle bundle2 = getArguments().getBundle("opa-suw-intent-extras-param");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.f307922u = bundle2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        OpaPageLayout opaPageLayout = new OpaPageLayout(context);
        this.f307919r = opaPageLayout;
        C28295m.m52919e(opaPageLayout, new C28292j(this.f307921t));
        this.f307919r.mo77370b(R.layout.suw_education_webview);
        this.f307919r.mo77369a().mo77475d(0);
        this.f307919r.f228726a.mo77362c(2);
        Button a = this.f307919r.f228726a.mo77360a();
        this.f307923v = a;
        a.setVisibility(8);
        Button b = this.f307919r.f228726a.mo77361b();
        this.f307924w = b;
        b.setVisibility(8);
        if (m183994i()) {
            this.f307915n = getString(R.string.opa_suw_hotword_allow);
            this.f307916o = getString(R.string.opa_suw_hotword_later);
        } else {
            this.f307915n = getString(R.string.opa_value_proposition_next);
            this.f307916o = BuildConfig.FLAVOR;
        }
        C45241d f = C45240c.m80574e(context).mo49102f(context, C45238a.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT);
        HeaderLayout headerLayout = (HeaderLayout) this.f307919r.findViewById(R.id.opa_header);
        if (f != null) {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.onboarding_loading_content, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            headerLayout.setVisibility(4);
            this.f307919r.findViewById(R.id.nexus_settings_progress_bar).setVisibility(8);
            IllustrationVideoView illustrationVideoView = (IllustrationVideoView) this.f307919r.findViewById(R.id.illustration_video_view);
            illustrationVideoView.setVisibility(0);
            illustrationVideoView.mo49265c(f.f118174c, f.f118172a);
        } else {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.onboarding_loading_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.onboarding_loading_content, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            headerLayout.setVisibility(4);
        }
        ViewFlipper viewFlipper = (ViewFlipper) this.f307919r.findViewById(R.id.view_flipper);
        this.f307913l = viewFlipper;
        viewFlipper.setDisplayedChild(0);
        WebView webView = (WebView) this.f307919r.findViewById(R.id.suw_education_view);
        this.f307914m = webView;
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(this.f307908g.f316702a.mo6453a());
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        this.f307914m.addJavascriptInterface(this, "suw");
        this.f307914m.setWebViewClient(new C110449j(this));
        this.f307914m.loadUrl(this.f307908g.mo101262a(this.f307912k, this.f307911j, this.f307920s, this.f307922u), this.f307908g.mo101263b());
        return this.f307919r;
    }

    @JavascriptInterface
    public void onUpdateButtonTexts(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f307917p;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f307917p = null;
        }
        if (getActivity() == null) {
            C59104x d = f307903b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
            ((C59052c) ((C59052c) d).mo56372aa(26437)).mo56386p("onUpdateButtonTexts: ignored due to not being attached to activity.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f307915n = jSONObject.getString("action_button_text");
            this.f307916o = jSONObject.getString("cancel_button_text");
        } catch (JSONException e) {
            C59104x c = f307903b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26436)).mo56386p("Unable to load button texts from WebView.");
        } finally {
            this.f307910i.mo28212l("suw.onUpdateButtonTexts", new C110445f(this));
        }
    }

    @JavascriptInterface
    public void onUpdateSettingsAndComplete(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f307918q;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f307918q = null;
        }
        if (getActivity() == null) {
            C59104x d = f307903b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
            ((C59052c) ((C59052c) d).mo56372aa(26441)).mo56386p("onUpdateSettingsAndComplete: ignored due to not being attached to activity.");
        } else if (TextUtils.isEmpty(str)) {
            completeStep();
        } else {
            try {
                this.f307910i.mo28212l("suw.onUpdateSettingsAndComplete", new C110440a(this, new JSONObject(str)));
            } catch (JSONException e) {
                C59104x c = f307903b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26440)).mo56386p("Unable to load settings from WebView.");
                completeStep();
            }
        }
    }
}
