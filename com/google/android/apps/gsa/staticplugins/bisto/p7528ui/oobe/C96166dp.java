package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dp */
/* compiled from: PG */
public final class C96166dp extends C96363kx {

    /* renamed from: b */
    public C96325jm f269204b;

    /* renamed from: c */
    private OpaPageLayout f269205c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        this.f269205c.f228726a.mo77360a().performClick();
        return true;
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "Finished";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C142355cg cgVar;
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269205c = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.finished);
        C58976aa aaVar = C58975e.f156826a;
        this.f269205c.mo77369a().mo77475d(1);
        C84012g a = this.f269205c.mo77369a();
        C84010e e = C84011f.m133882e();
        e.mo77375c(getString(R.string.finish_screen_action_text));
        ((C83958a) e).f228734b = new C89943l(new C96164dn(this));
        a.mo77472a(e.mo77373a());
        HeaderLayout headerLayout = (HeaderLayout) this.f269205c.findViewById(R.id.opa_header);
        C142340bs bsVar = this.f269204b.f269538a.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        if (bsVar.f386179b == 24) {
            cgVar = (C142355cg) bsVar.f386180c;
        } else {
            cgVar = C142355cg.f386263b;
        }
        C58833ax b = C96097ba.m159386b(C124525f.m203990f(cgVar.f386265a));
        if (!b.mo56113h()) {
            b = this.f269204b.f269538a.mo89954e();
        }
        C84018m.m133908c(headerLayout.f228719b, Html.fromHtml((String) b.mo56109e(BuildConfig.FLAVOR)), TextView.BufferType.NORMAL, headerLayout);
        C142340bs bsVar2 = this.f269204b.f269538a.f269047b.f386119e;
        if (bsVar2 == null) {
            bsVar2 = C142340bs.f386174C;
        }
        C142355cg cgVar2 = bsVar2.f386200w;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        C58833ax b2 = C96097ba.m159386b(C124525f.m203990f(cgVar2.f386265a));
        if (b2.mo56113h()) {
            ((TextView) this.f269205c.f228728c.findViewById(R.id.bisto_finished_bottom_message)).setText(Html.fromHtml((String) b2.mo56107c()));
        }
        C58833ax f = this.f269204b.f269538a.mo89955f();
        if (f.mo56113h()) {
            C58833ax g = this.f269204b.f269538a.mo89956g();
            C96153dc dcVar = new C96153dc((LegacyOpaStandardPage) null, new C96165do(this), 0);
            WebView webView = (WebView) this.f269205c.f228728c.findViewById(R.id.bisto_finished_webview);
            C96498r.m159874a(webView);
            webView.setBackgroundColor(0);
            dcVar.mo89991a(webView, (String) f.mo56107c(), g);
        }
        ((C95299e) this.f269603D.mo27525b()).mo89232b(true);
        return this.f269205c;
    }
}
