package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83959a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.opaonboarding.personalresults.PersonalResultsPage;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142335bn;
import com.google.android.p10712d.C142336bo;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kt */
/* compiled from: PG */
public final class C96359kt extends C96363kx {

    /* renamed from: b */
    public static final C59071e f269580b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kt");

    /* renamed from: c */
    public C68214a f269581c;

    /* renamed from: d */
    public C68214a f269582d;

    /* renamed from: e */
    public C96094ay f269583e;

    /* renamed from: f */
    public C96325jm f269584f;

    /* renamed from: g */
    public C22871g f269585g;

    /* renamed from: h */
    public C68214a f269586h;

    /* renamed from: i */
    public C89635f f269587i;

    /* renamed from: j */
    public boolean f269588j;

    /* renamed from: k */
    private C83975q f269589k;

    /* renamed from: l */
    private View f269590l;

    /* renamed from: m */
    private LinearLayout f269591m;

    /* renamed from: h */
    private final boolean m159701h(String str) {
        C124548d b;
        if (str == null || (b = ((C89492cd) this.f269581c.mo27525b()).mo83401b(str)) == null || !b.mo106513k().equals(C124719q.GACS_DEVICE)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        C124719q qVar;
        Activity activity = getActivity();
        C96353kn knVar = new C96353kn(this);
        String str = this.f269583e.f269039a;
        if (str == null) {
            qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
        } else {
            C124548d b = ((C89492cd) this.f269581c.mo27525b()).mo83401b(str);
            if (b != null) {
                qVar = b.mo106513k();
            } else {
                qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
            }
        }
        C96331js.m159641e(activity, knVar, qVar, true, this.f269584f.f269538a.f269047b);
        return true;
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "PersonalResults";
    }

    /* renamed from: g */
    public final void mo90085g(String str, boolean z) {
        if (str == null || !m159701h(str)) {
            if (z) {
                EventForDump.m147676e(5, "BistoPersonalResultsFragment");
                ((C89994f) this.f269582d.mo27525b()).mo83836B(true);
            }
            mo77318iT().mo77312a();
            return;
        }
        FooterLayout footerLayout = (FooterLayout) this.f269590l.findViewById(R.id.opa_footer_container);
        footerLayout.getClass();
        footerLayout.mo77362c(3);
        new C90873ag(this.f269587i.mo83520d(((C83893b) this.f269586h.mo27525b()).mo77278a(), str, z), this.f269585g, "result", new C96351kl(this)).mo85223a(new C96352km(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C83959a aVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C59104x b = f269580b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) b).mo56372aa(17089)).mo56386p("PR #onCreateView");
        PersonalResultsPage personalResultsPage = (PersonalResultsPage) layoutInflater.inflate(R.layout.bisto_personal_results, (ViewGroup) null);
        this.f269590l = personalResultsPage;
        personalResultsPage.f228691c.mo77360a().setText(R.string.bisto_turn_on_button);
        personalResultsPage.f228691c.mo77360a().setOnClickListener(new C89943l(new C96349kj(this)));
        personalResultsPage.f228691c.mo77363d(this.f269588j);
        personalResultsPage.f228691c.mo77361b().setText(R.string.bisto_no_thanks_button);
        personalResultsPage.f228691c.mo77361b().setVisibility(0);
        personalResultsPage.f228691c.mo77361b().setOnClickListener(new C89943l(new C96350kk(this)));
        C96097ba baVar = this.f269584f.f269538a;
        C142340bs bsVar = baVar.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142355cg cgVar = bsVar.f386196s;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        String e = C124525f.m203989e(cgVar);
        if (C58837ba.m90859h(e)) {
            e = baVar.f269046a.getResources().getString(R.string.bisto_personal_results_title);
        }
        HeaderLayout headerLayout = personalResultsPage.f228689a;
        C84018m.m133908c(headerLayout.f228718a, e, TextView.BufferType.NORMAL, headerLayout);
        C96097ba baVar2 = this.f269584f.f269538a;
        C142340bs bsVar2 = baVar2.f269047b.f386119e;
        if (bsVar2 == null) {
            bsVar2 = C142340bs.f386174C;
        }
        C142355cg cgVar2 = bsVar2.f386197t;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        String e2 = C124525f.m203989e(cgVar2);
        if (C58837ba.m90859h(e2)) {
            e2 = baVar2.f269046a.getResources().getString(R.string.bisto_personal_results_message);
        }
        personalResultsPage.f228690b.setText(e2);
        personalResultsPage.f228690b.setTextAlignment(4);
        personalResultsPage.mo77354c(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        personalResultsPage.f228692d.setLayoutParams(layoutParams);
        personalResultsPage.f228692d.setTextAlignment(4);
        C142340bs bsVar3 = this.f269584f.f269538a.f269047b.f386119e;
        if (bsVar3 == null) {
            bsVar3 = C142340bs.f386174C;
        }
        C62971cq<C142336bo> cqVar = bsVar3.f386201x;
        if (cqVar.isEmpty()) {
            View a = personalResultsPage.mo77352a();
            LottieAnimationView b2 = personalResultsPage.mo77353b();
            if (m159701h(this.f269583e.f269039a)) {
                aVar = new C96356kq();
            } else {
                aVar = new C96358ks();
            }
            C83973o a2 = C83974p.m133833a(a, b2, aVar);
            a2.mo77402c();
            a2.mo77403d();
            this.f269589k = a2;
        } else {
            View a3 = personalResultsPage.mo77352a();
            ViewParent parent = a3.getParent();
            if (parent instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) parent;
                linearLayout.removeView(a3);
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                this.f269591m = linearLayout2;
                linearLayout2.setOrientation(1);
                linearLayout.addView(this.f269591m, new ViewGroup.LayoutParams(-1, -2));
                LayoutInflater from = LayoutInflater.from(getContext());
                for (C142336bo boVar : cqVar) {
                    LinearLayout linearLayout3 = this.f269591m;
                    View inflate = from.inflate(R.layout.personal_results_page_list_item, linearLayout3, false);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
                    int a4 = C142335bn.m231062a(boVar.f386162b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    C142355cg cgVar3 = boVar.f386163c;
                    if (cgVar3 == null) {
                        cgVar3 = C142355cg.f386263b;
                    }
                    imageView.setContentDescription(C124525f.m203989e(cgVar3));
                    int i = a4 - 1;
                    if (i == 1) {
                        imageView.setImageResource(R.drawable.product_logo_calendar_2020q4_color_36);
                    } else if (i == 2) {
                        imageView.setImageResource(R.drawable.product_logo_contacts_color_36);
                    } else if (i == 3) {
                        imageView.setImageResource(R.drawable.product_logo_messages_color_36);
                    } else if (i != 4) {
                        C59104x d = f269580b.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "BistoOobe");
                        ((C59052c) ((C59052c) d).mo56372aa(17094)).mo56386p("Unknown icon identifier encountered");
                        imageView.setVisibility(8);
                    } else {
                        imageView.setImageResource(R.drawable.product_logo_gfit_color_36);
                    }
                    TextView textView = (TextView) inflate.findViewById(R.id.title);
                    C142355cg cgVar4 = boVar.f386164d;
                    if (cgVar4 == null) {
                        cgVar4 = C142355cg.f386263b;
                    }
                    textView.setText(C124525f.m203989e(cgVar4));
                    TextView textView2 = (TextView) inflate.findViewById(R.id.content);
                    C142355cg cgVar5 = boVar.f386165e;
                    if (cgVar5 == null) {
                        cgVar5 = C142355cg.f386263b;
                    }
                    textView2.setText(C124525f.m203989e(cgVar5));
                    linearLayout3.addView(inflate);
                }
            }
        }
        return personalResultsPage;
    }

    public final void onDestroyView() {
        C83975q qVar = this.f269589k;
        if (qVar != null) {
            qVar.mo77406g();
            this.f269589k = null;
        }
        super.onDestroyView();
    }
}
