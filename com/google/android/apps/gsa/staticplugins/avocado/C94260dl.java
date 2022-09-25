package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dl */
/* compiled from: PG */
public final class C94260dl extends C84021p {

    /* renamed from: b */
    private C83973o f263412b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo77485e() {
        C83973o oVar = this.f263412b;
        if (oVar != null) {
            oVar.mo77406g();
        }
        super.mo77485e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.avocado_summary, (ViewGroup) null);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, getString(R.string.summary_screen_title), TextView.BufferType.NORMAL, headerLayout);
        opaPageLayout.f228726a.mo77362c(0);
        C28295m.m52919e(opaPageLayout, new C28292j(62532));
        C83973o oVar = new C83973o(opaPageLayout.findViewById(R.id.ending_animation_container), (LottieAnimationView) opaPageLayout.findViewById(R.id.ending_animation), new C94259dk());
        oVar.mo77402c();
        oVar.mo77403d();
        this.f263412b = oVar;
        return opaPageLayout;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f263412b;
        if (oVar != null) {
            oVar.mo77406g();
        }
    }
}
