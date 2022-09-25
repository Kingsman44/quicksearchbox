package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.aspectratio.FixedAspectRatioFrameLayout;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.w */
/* compiled from: PG */
final class C102028w implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C102029x f284657a;

    /* renamed from: b */
    private final View f284658b;

    /* renamed from: c */
    private final LayoutInflater f284659c;

    public C102028w(C102029x xVar, View view, LayoutInflater layoutInflater) {
        this.f284657a = xVar;
        this.f284658b = view;
        this.f284659c = layoutInflater;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C102029x.f284660a.mo56225c()).mo56382g(th)).mo56372aa(20518)).mo56386p("Hotword Screen data loading failed.");
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), this.f284657a.f284661b);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C102029x xVar = this.f284657a;
        xVar.f284672m = (C102018m) obj;
        C102230s sVar = xVar.f284662c;
        C102231t e = C102232u.m169449e();
        e.mo92352d(this.f284657a.f284672m.mo92793h());
        e.mo92351c(this.f284657a.f284672m.mo92788d());
        sVar.mo93026h(e.mo92349a());
        C102029x xVar2 = this.f284657a;
        ScrollView c = xVar2.f284662c.mo93021c();
        C102230s sVar2 = xVar2.f284662c;
        C102228q f = C102229r.m169429f();
        f.mo92319b(2);
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(xVar2.f284661b.getString(R.string.hotword_screen_button_more));
        ((C83958a) e2).f228734b = new C102025t(xVar2);
        f.mo92320c(e2.mo77373a());
        f.mo92321d(C84011f.m133882e().mo77373a());
        sVar2.mo93025g(f.mo92318a());
        c.getViewTreeObserver().addOnScrollChangedListener(new C102026u(xVar2));
        c.getViewTreeObserver().addOnGlobalLayoutListener(new C102027v(xVar2, c));
        if (this.f284657a.f284672m.mo92785a() != null) {
            FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) this.f284658b.findViewById(R.id.hotword_screen_animation_fixed_aspect_ratio_layout);
            fixedAspectRatioFrameLayout.f77355a = 1.3333334f;
            fixedAspectRatioFrameLayout.invalidate();
            if (this.f284657a.f284672m.mo92785a().mo92775b() != null) {
                this.f284657a.f284671l = C83974p.m133833a(fixedAspectRatioFrameLayout, (LottieAnimationView) this.f284658b.findViewById(R.id.hotword_screen_animation_fixed_aspect_ratio), this.f284657a.f284672m.mo92785a().mo92775b());
                if (this.f284657a.f284669j) {
                    fixedAspectRatioFrameLayout.setForceDarkAllowed(false);
                }
                this.f284657a.f284671l.mo77402c();
                this.f284657a.f284671l.mo77403d();
            } else if (this.f284657a.f284672m.mo92785a().mo92774a() != null) {
                ((LottieAnimationView) this.f284658b.findViewById(R.id.hotword_screen_animation_fixed_aspect_ratio)).setImageDrawable(this.f284657a.f284672m.mo92785a().mo92774a());
            }
        } else {
            this.f284658b.findViewById(R.id.hotword_screen_animation_fixed_aspect_ratio_layout).setVisibility(8);
        }
        if (!this.f284657a.f284672m.mo92786b().isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) this.f284658b.findViewById(R.id.example_queries_container);
            linearLayout.setVisibility(0);
            C58485gu b = this.f284657a.f284672m.mo92786b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C102013h hVar = (C102013h) b.get(i);
                View inflate = this.f284659c.inflate(R.layout.hotword_screen_example_query, linearLayout, false);
                ((TextView) inflate.findViewById(R.id.query_title)).setText(hVar.mo92766b());
                ((TextView) inflate.findViewById(R.id.query_summary)).setText(hVar.mo92765a());
                linearLayout.addView(inflate);
            }
        }
        ((TextView) this.f284658b.findViewById(R.id.hotword_screen_footer_disclousure)).setText(this.f284657a.f284672m.mo92789e());
        if (this.f284657a.f284670k.mo85090c()) {
            C90743b.m148214a(this.f284657a.f284662c.mo93022d(), 500);
        }
    }
}
