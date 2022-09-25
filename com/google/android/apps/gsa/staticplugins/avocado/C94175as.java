package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.as */
/* compiled from: PG */
public final class C94175as extends C83907bm {

    /* renamed from: b */
    public int f263123b = 0;

    /* renamed from: c */
    public boolean f263124c;

    /* renamed from: d */
    private OpaPageLayout f263125d;

    /* renamed from: e */
    private C83973o f263126e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.avocado_handback_to_parent, viewGroup, false);
        this.f263125d = opaPageLayout;
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        headerLayout.setVisibility(0);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.avocado_hand_back_to_parent_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.avocado_hand_back_to_parent_subtitle, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        OpaPageLayout opaPageLayout2 = this.f263125d;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) opaPageLayout2.findViewById(R.id.avocado_handback_animation_view);
        lottieAnimationView.setVisibility(0);
        View findViewById = opaPageLayout2.findViewById(R.id.avocado_handback_animation_container);
        C83973o oVar = new C83973o(findViewById, lottieAnimationView, new C94172ap(this.f263125d.getContext(), this.f263124c));
        if (this.f263124c) {
            findViewById.setForceDarkAllowed(false);
        }
        oVar.mo77402c();
        oVar.mo77403d();
        this.f263126e = oVar;
        lottieAnimationView.requestLayout();
        FooterLayout footerLayout = this.f263125d.f228726a;
        footerLayout.mo77362c(2);
        C28295m.m52919e(this.f263125d, new C28292j(62526));
        Button a = footerLayout.mo77360a();
        a.setText(R.string.avocado_hand_back_to_parent_continue_button_text);
        a.setOnClickListener(new C94173aq(this));
        Button b = footerLayout.mo77361b();
        b.setText(R.string.cancel_button_text);
        b.setOnClickListener(new C94174ar(this));
        return this.f263125d;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f263126e;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f263126e = null;
    }
}
