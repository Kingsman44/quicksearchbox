package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.do */
/* compiled from: PG */
public final class C94263do extends C83907bm {

    /* renamed from: b */
    public int f263415b = 0;

    /* renamed from: c */
    public C92371d f263416c;

    /* renamed from: d */
    public ai f263417d;

    /* renamed from: e */
    public boolean f263418e;

    /* renamed from: f */
    private OpaPageLayout f263419f;

    /* renamed from: g */
    private C83973o f263420g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.avocado_handoff, (ViewGroup) null);
        this.f263419f = opaPageLayout;
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        headerLayout.setVisibility(0);
        C84018m.m133908c(headerLayout.f228718a, getString(R.string.unicorn_hand_off_screen_title, new Object[]{this.f263416c.mo87022c()}), TextView.BufferType.NORMAL, headerLayout);
        String string = getString(R.string.unicorn_hand_off_screen_message);
        Object[] objArr = new Object[4];
        objArr[0] = "GENDER";
        if (this.f263417d.e()) {
            str = this.f263417d.c();
        } else {
            str = this.f263416c.mo87023d();
        }
        objArr[1] = str;
        objArr[2] = "PERSON";
        if (this.f263417d.e()) {
            str2 = this.f263417d.b();
        } else {
            str2 = this.f263416c.mo87022c();
        }
        objArr[3] = str2;
        C84018m.m133908c(headerLayout.f228719b, AvocadoUtils.m155378b(C5114a.m13988b(Locale.getDefault(), string, objArr), getResources().getColor(R.color.link_text_color)), TextView.BufferType.NORMAL, headerLayout);
        OpaPageLayout opaPageLayout2 = this.f263419f;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) opaPageLayout2.findViewById(R.id.avocado_handoff_animation_view);
        lottieAnimationView.setVisibility(0);
        View findViewById = opaPageLayout2.findViewById(R.id.avocado_handoff_animation_container);
        C83973o oVar = new C83973o(findViewById, lottieAnimationView, new C94177au(this.f263419f.getContext(), this.f263418e));
        if (this.f263418e) {
            findViewById.setForceDarkAllowed(false);
        }
        oVar.mo77402c();
        oVar.mo77403d();
        this.f263420g = oVar;
        lottieAnimationView.requestLayout();
        FooterLayout footerLayout = this.f263419f.f228726a;
        footerLayout.mo77362c(2);
        C28295m.m52919e(this.f263419f, new C28292j(62526));
        Button a = footerLayout.mo77360a();
        a.setText(getString(R.string.consent_screen_continue_button_text));
        a.setOnClickListener(new C94261dm(this));
        Button b = footerLayout.mo77361b();
        b.setText(getString(R.string.consent_screen_cancel_button_text));
        b.setOnClickListener(new C94262dn(this));
        return this.f263419f;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f263420g;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f263420g = null;
    }
}
