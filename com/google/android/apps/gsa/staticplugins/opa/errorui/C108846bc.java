package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.ViewFlipper;
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
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114213a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3549a.C45241d;
import com.google.android.setupdesign.view.IllustrationVideoView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bc */
/* compiled from: PG */
public final class C108846bc extends C83907bm {

    /* renamed from: e */
    public static final /* synthetic */ int f302648e = 0;

    /* renamed from: b */
    public C86124t f302649b;

    /* renamed from: c */
    public C114213a f302650c;

    /* renamed from: d */
    public ViewFlipper f302651d;

    /* renamed from: f */
    private Bundle f302652f;

    /* renamed from: g */
    private OpaPageLayout f302653g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97224e() {
        C58976aa aaVar = C58975e.f156826a;
        C84012g a = this.f302653g.mo77369a();
        a.mo77475d(1);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getString(R.string.opa_value_proposition_next));
        ((C83958a) e).f228734b = new C89943l(new C108844ba(this));
        a.mo77472a(e.mo77373a());
    }

    /* renamed from: g */
    public final void mo97225g() {
        C58976aa aaVar = C58975e.f156826a;
        HeaderLayout headerLayout = (HeaderLayout) this.f302653g.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, getText(R.string.opa_hardware_button_training_title), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, getText(R.string.opa_hardware_button_training_desc_fallback), TextView.BufferType.NORMAL, headerLayout);
        this.f302651d.setDisplayedChild(0);
        mo97224e();
    }

    public final void onCreate(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        Bundle bundle2 = getArguments().getBundle("opa-suw-intent-extras-param");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.f302652f = bundle2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        Context context = layoutInflater.getContext();
        OpaPageLayout opaPageLayout = new OpaPageLayout(context);
        this.f302653g = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.error_web_hardware_button_training);
        ViewFlipper viewFlipper = (ViewFlipper) this.f302653g.findViewById(R.id.view_flipper);
        this.f302651d = viewFlipper;
        viewFlipper.setDisplayedChild(2);
        String x = this.f302649b.mo79758x(C90062dn.f249220s);
        if (C114213a.m189477c(x)) {
            WebView webView = (WebView) this.f302653g.findViewById(R.id.opa_webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setUserAgentString(this.f302650c.f316702a.mo6453a());
            webView.loadUrl(this.f302650c.mo101262a(x, "hwb", 0, this.f302652f), this.f302650c.mo101263b());
            webView.setWebViewClient(new C108845bb(this));
        } else {
            mo97225g();
        }
        C45241d f = C45240c.m80574e(context).mo49102f(context, C45238a.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT);
        if (f != null) {
            this.f302653g.findViewById(R.id.nexus_settings_progress_bar).setVisibility(8);
            IllustrationVideoView illustrationVideoView = (IllustrationVideoView) this.f302653g.findViewById(R.id.illustration_video_view);
            illustrationVideoView.setVisibility(0);
            illustrationVideoView.mo49265c(f.f118174c, f.f118172a);
        }
        C28295m.m52919e(this.f302653g, new C28292j(48040));
        return this.f302653g;
    }
}
