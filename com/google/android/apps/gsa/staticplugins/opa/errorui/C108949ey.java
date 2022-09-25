package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ey */
/* compiled from: PG */
public final class C108949ey extends C83907bm {

    /* renamed from: b */
    public SharedPreferences f302976b;

    /* renamed from: c */
    public Optional f302977c;

    /* renamed from: d */
    public boolean f302978d;

    /* renamed from: e */
    private C83973o f302979e;

    /* renamed from: e */
    private final boolean m181226e() {
        return this.f302977c.isEmpty() || !((C74714bo) this.f302977c.get()).mo71081c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LottieAnimationView lottieAnimationView;
        View view;
        C83973o oVar;
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        C28295m.m52919e(opaPageLayout, new C28292j(78720));
        opaPageLayout.mo77370b(R.layout.swipe_demo);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        if (m181226e()) {
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_swipe_demo_screen_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        } else {
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_swipe_demo_screen_message_nga, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        }
        if (m181226e()) {
            lottieAnimationView = (LottieAnimationView) opaPageLayout.findViewById(R.id.swipe_demo_animation_opa);
        } else {
            lottieAnimationView = (LottieAnimationView) opaPageLayout.findViewById(R.id.swipe_demo_animation_nga);
        }
        if (m181226e()) {
            view = opaPageLayout.findViewById(R.id.swipe_demo_animation_container_opa);
        } else {
            view = opaPageLayout.findViewById(R.id.swipe_demo_animation_container_nga);
        }
        if (m181226e()) {
            oVar = new C83973o(view, lottieAnimationView, new C108948ex());
        } else {
            oVar = new C83973o(view, lottieAnimationView, new C108946ev(this));
        }
        if (this.f302978d) {
            view.setForceDarkAllowed(false);
        }
        oVar.mo77402c();
        oVar.mo77403d();
        this.f302979e = oVar;
        lottieAnimationView.setVisibility(0);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C108944et(this)));
        this.f302976b.edit().putInt("opa_nga_swipe_demo_seen_count", this.f302976b.getInt("opa_nga_swipe_demo_seen_count", 0) + 1).apply();
        return opaPageLayout;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302979e;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302979e = null;
    }
}
