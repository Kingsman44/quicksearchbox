package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C49914dr;
import com.google.assistant.p3861at.C49915ds;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.t */
/* compiled from: PG */
public final class C108752t extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302430b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.t");

    /* renamed from: c */
    public C108556ar f302431c;

    /* renamed from: d */
    public C83893b f302432d;

    /* renamed from: e */
    public l f302433e;

    /* renamed from: f */
    private OpaPageLayout f302434f;

    /* renamed from: g */
    private C83973o f302435g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97128e(boolean z) {
        C49875cf b = this.f302431c.mo96983b();
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        String str = (String) this.f302431c.mo96984c().mo56107c();
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        C49914dr drVar = (C49914dr) C49915ds.f129741c.createBuilder();
        drVar.copyOnWrite();
        C49915ds dsVar = (C49915ds) drVar.instance;
        dsVar.f129743a |= 1;
        dsVar.f129744b = z;
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        C49915ds dsVar2 = (C49915ds) drVar.build();
        dsVar2.getClass();
        cvVar.f129652C = dsVar2;
        cvVar.f129664b |= 512;
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        str.getClass();
        dgVar.f129714a |= 1;
        dgVar.f129715b = str;
        C49875cf b2 = this.f302431c.mo96983b();
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129716c = b2.f129621v;
        dgVar2.f129714a |= 2;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        C49891cv cvVar2 = (C49891cv) cnVar.build();
        cvVar2.getClass();
        dgVar3.f129719f = cvVar2;
        dgVar3.f129714a |= 32;
        daVar.mo53371b(dfVar);
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        this.f302433e.l((Account) this.f302432d.mo77278a().mo56111f(), b, (acx) acw.build(), new C108749q(this), getClass().getSimpleName());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C108741i iVar = this.f302431c.f302004l;
        iVar.getClass();
        this.f302434f = new OpaPageLayout(layoutInflater.getContext());
        Context context = layoutInflater.getContext();
        C84012g a = this.f302434f.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(context.getString(R.string.setup_uma_action_button_positive));
        ((C83958a) e).f228734b = new C89943l(new C108747o(this));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(context.getString(R.string.setup_uma_cancel_button));
        ((C83958a) e2).f228734b = new C89943l(new C108748p(this));
        a.mo77473b(e2.mo77373a());
        this.f302434f.mo77370b(R.layout.crash_logs_opt_in);
        HeaderLayout headerLayout = (HeaderLayout) this.f302434f.findViewById(R.id.opa_header);
        if (!C58837ba.m90859h(iVar.mo97106i())) {
            str = iVar.mo97106i();
        } else {
            str = iVar.mo97105h();
        }
        C84018m.m133908c(headerLayout.f228718a, context.getString(R.string.setup_uma_title, new Object[]{C58837ba.m90858g(str), BuildConfig.FLAVOR}), TextView.BufferType.NORMAL, headerLayout);
        ((TextView) this.f302434f.findViewById(R.id.opa_crash_logs_opt_in_body)).setText(R.string.setup_uma_body);
        C83973o oVar = new C83973o(this.f302434f.findViewById(R.id.crash_logs_opt_in_animation_container), (LottieAnimationView) this.f302434f.findViewById(R.id.crash_logs_opt_in_animation), new C108751s());
        oVar.mo77402c();
        oVar.mo77403d();
        this.f302435g = oVar;
        C28295m.m52919e(this.f302434f, new C28292j(83310));
        return this.f302434f;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302435g;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302435g = null;
    }
}
