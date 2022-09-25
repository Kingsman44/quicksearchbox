package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84020o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114213a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.az */
/* compiled from: PG */
public final class C108842az extends C83907bm {

    /* renamed from: b */
    public C86124t f302639b;

    /* renamed from: c */
    public C114213a f302640c;

    /* renamed from: d */
    private HeaderLayout f302641d;

    /* renamed from: e */
    private OpaPageLayout f302642e;

    /* renamed from: f */
    private ImageView f302643f;

    /* renamed from: g */
    private WebView f302644g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f302642e = new OpaPageLayout(layoutInflater.getContext());
        C58976aa aaVar = C58975e.f156826a;
        C84012g a = this.f302642e.mo77369a();
        a.mo77475d(1);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getString(R.string.opa_value_proposition_next));
        ((C83958a) e).f228734b = new C89943l(new C108840ax(this));
        a.mo77472a(e.mo77373a());
        this.f302642e.mo77370b(R.layout.error_hardware_button_training);
        HeaderLayout headerLayout = (HeaderLayout) this.f302642e.findViewById(R.id.opa_header);
        this.f302641d = headerLayout;
        C84018m.m133908c(headerLayout.f228718a, getText(R.string.opa_hardware_button_training_title), TextView.BufferType.NORMAL, headerLayout);
        this.f302643f = (ImageView) this.f302642e.findViewById(R.id.opa_illustration);
        this.f302644g = (WebView) this.f302642e.findViewById(R.id.opa_webview);
        String x = this.f302639b.mo79758x(C90014bt.f247572jg);
        if (TextUtils.isEmpty(x) || !C114213a.m189477c(x) || !TextUtils.equals(Locale.getDefault().toLanguageTag(), this.f302639b.mo79758x(C90014bt.f247573jh))) {
            mo97218e(false);
        } else {
            this.f302644g.loadUrl(this.f302640c.mo101262a(x, "hwb", 0, (Bundle) null), this.f302640c.mo101263b());
            this.f302644g.setWebViewClient(new C84020o(new C108841ay(this)));
            WebSettings settings = this.f302644g.getSettings();
            settings.setUserAgentString(this.f302640c.f316702a.mo6453a());
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
        }
        C28295m.m52919e(this.f302642e, new C28292j(48040));
        return this.f302642e;
    }

    /* renamed from: e */
    public final void mo97218e(boolean z) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f302644g.setVisibility(0);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f302644g.setVisibility(8);
        this.f302643f.setVisibility(0);
        HeaderLayout headerLayout = this.f302641d;
        C84018m.m133908c(headerLayout.f228719b, getText(R.string.opa_hardware_button_training_desc_fallback), TextView.BufferType.NORMAL, headerLayout);
        this.f302643f.setImageDrawable(getResources().getDrawable(R.drawable.opa_button_training));
    }
}
