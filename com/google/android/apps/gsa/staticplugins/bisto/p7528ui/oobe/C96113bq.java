package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142338bq;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bq */
/* compiled from: PG */
public final class C96113bq extends C96363kx {

    /* renamed from: c */
    public static final /* synthetic */ int f269093c = 0;

    /* renamed from: b */
    public C96325jm f269094b;

    /* renamed from: d */
    private OpaPageLayout f269095d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "ButtonPressEducationFragment";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58833ax axVar;
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269095d = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.button_press_education);
        HeaderLayout headerLayout = (HeaderLayout) this.f269095d.findViewById(R.id.opa_header);
        C142340bs bsVar = this.f269094b.f269538a.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142338bq bqVar = bsVar.f386203z;
        if (bqVar == null) {
            bqVar = C142338bq.f386166g;
        }
        C142355cg cgVar = bqVar.f386169b;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        C58833ax b = C96097ba.m159386b(C124525f.m203990f(cgVar.f386265a));
        if (b.mo56113h()) {
            C84018m.m133908c(headerLayout.f228718a, (CharSequence) b.mo56107c(), TextView.BufferType.NORMAL, headerLayout);
        }
        FooterLayout footerLayout = this.f269095d.f228726a;
        footerLayout.mo77362c(1);
        footerLayout.mo77360a().setText(R.string.bisto_got_it_and_exit_button);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C96111bo(this)));
        C142340bs bsVar2 = this.f269094b.f269538a.f269047b.f386119e;
        if (bsVar2 == null) {
            bsVar2 = C142340bs.f386174C;
        }
        C142338bq bqVar2 = bsVar2.f386203z;
        if (bqVar2 == null) {
            bqVar2 = C142338bq.f386166g;
        }
        C142355cg cgVar2 = bqVar2.f386171d;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        C58833ax b2 = C96097ba.m159386b(C124525f.m203990f(cgVar2.f386265a));
        if (b2.mo56113h()) {
            ((TextView) this.f269095d.f228728c.findViewById(R.id.button_press_view_message)).setText(Html.fromHtml((String) b2.mo56107c()));
        }
        C96097ba baVar = this.f269094b.f269538a;
        C142340bs bsVar3 = baVar.f269047b.f386119e;
        if (bsVar3 == null) {
            bsVar3 = C142340bs.f386174C;
        }
        C142338bq bqVar3 = bsVar3.f386203z;
        if (bqVar3 == null) {
            bqVar3 = C142338bq.f386166g;
        }
        C142328bg bgVar = bqVar3.f386170c;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        if (C96498r.m159875b(baVar.f269046a)) {
            axVar = C90730an.m148189b(C96097ba.m159387d(bgVar.f386144d), C96097ba.m159387d(bgVar.f386142b));
        } else {
            axVar = C96097ba.m159387d(bgVar.f386142b);
        }
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            C142340bs bsVar4 = this.f269094b.f269538a.f269047b.f386119e;
            if (bsVar4 == null) {
                bsVar4 = C142340bs.f386174C;
            }
            C142338bq bqVar4 = bsVar4.f386203z;
            if (bqVar4 == null) {
                bqVar4 = C142338bq.f386166g;
            }
            C142328bg bgVar2 = bqVar4.f386170c;
            if (bgVar2 == null) {
                bgVar2 = C142328bg.f386139f;
            }
            C142355cg cgVar3 = bgVar2.f386143c;
            if (cgVar3 == null) {
                cgVar3 = C142355cg.f386263b;
            }
            C58833ax b3 = C96097ba.m159386b(C124525f.m203990f(cgVar3.f386265a));
            C96153dc dcVar = new C96153dc((LegacyOpaStandardPage) null, C96112bp.f269092a, 0);
            WebView webView = (WebView) this.f269095d.f228728c.findViewById(R.id.button_press_image);
            C96498r.m159874a(webView);
            webView.setBackgroundColor(0);
            dcVar.mo89991a(webView, str, b3);
        }
        return this.f269095d;
    }
}
