package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dg */
/* compiled from: PG */
public final class C108634dg extends C83907bm {

    /* renamed from: b */
    public C90465g f302167b;

    /* renamed from: c */
    public C83893b f302168c;

    /* renamed from: d */
    private C83973o f302169d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        Bundle arguments = getArguments() != null ? getArguments() : Bundle.EMPTY;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(arguments.getInt("layout", R.layout.generic_error), (ViewGroup) null);
        if (arguments.getString("error_message") != null) {
            String string = arguments.getString("error_message");
            HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
            C84018m.m133908c(headerLayout.f228719b, string, TextView.BufferType.NORMAL, headerLayout);
        }
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44734));
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108628da(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108629db(this)));
        legacyOpaStandardPage.f228723b.f228721d.setOnClickListener(new C89943l(new C108630dc(this)));
        legacyOpaStandardPage.f228723b.f228721d.setVisibility(0);
        C84031z zVar = legacyOpaStandardPage.f228724c;
        C83973o oVar = new C83973o(zVar.f228892o, zVar.f228888k, new C108633df());
        oVar.mo77402c();
        oVar.mo77403d();
        legacyOpaStandardPage.mo77366a();
        this.f302169d = oVar;
        return legacyOpaStandardPage;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302169d;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302169d = null;
    }
}
