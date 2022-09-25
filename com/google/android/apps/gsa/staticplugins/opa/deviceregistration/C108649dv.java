package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dv */
/* compiled from: PG */
public final class C108649dv extends C84021p {

    /* renamed from: b */
    public C108556ar f302194b;

    /* renamed from: c */
    private C83973o f302195c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.link_device, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44611));
        C108741i iVar = this.f302194b.f302004l;
        iVar.getClass();
        if (C58837ba.m90859h(iVar.mo97105h())) {
            str = getString(R.string.generic_device_name);
        } else {
            str = iVar.mo97105h();
        }
        String string = getString(R.string.link_device_title, new Object[]{str});
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, string, TextView.BufferType.NORMAL, headerLayout);
        legacyOpaStandardPage.f228725d.mo77362c(0);
        C84031z zVar = legacyOpaStandardPage.f228724c;
        C83973o oVar = new C83973o(zVar.f228892o, zVar.f228888k, new C108648du());
        oVar.mo77402c();
        oVar.mo77403d();
        legacyOpaStandardPage.mo77366a();
        this.f302195c = oVar;
        return legacyOpaStandardPage;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302195c;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302195c = null;
    }
}
