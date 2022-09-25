package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50121li;
import com.google.common.base.C58831av;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fw */
/* compiled from: PG */
public final class C108704fw extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302320b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fw");

    /* renamed from: c */
    public C108556ar f302321c;

    /* renamed from: d */
    public C108606cf f302322d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.setup_complete, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44615));
        C108741i iVar = this.f302321c.f302004l;
        iVar.getClass();
        if (!iVar.mo97113q()) {
            String string = ((Bundle) C58831av.m90830c(getArguments(), new Bundle())).getString("HA-provider-name");
            if (!C58837ba.m90859h(string)) {
                String string2 = getString(R.string.setup_complete_title, new Object[]{string});
                HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
                C84018m.m133908c(headerLayout.f228718a, string2, TextView.BufferType.NORMAL, headerLayout);
            }
        }
        if (C58837ba.m90859h(iVar.mo97105h())) {
            str = getString(R.string.generic_device_name);
        } else {
            str = iVar.mo97105h();
        }
        String string3 = getString(true != iVar.mo97113q() ? R.string.setup_complete_explanation : R.string.setup_complete_explanation_for_assistant_sdk, new Object[]{str});
        HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout2.f228719b, string3, TextView.BufferType.NORMAL, headerLayout2);
        C50121li liVar = this.f302321c.f302006n;
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        legacyOpaStandardPage.mo77367b();
        recyclerView.mHasFixedSize = true;
        recyclerView.setAdapter(new C108702fu(getActivity(), liVar));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Button a = legacyOpaStandardPage.f228725d.mo77360a();
        if (this.f302322d.f302123b > 1) {
            a.setText(getString(R.string.continue_setup_devices));
            a.setOnClickListener(new C89943l(new C108697fp(this)));
        } else {
            a.setOnClickListener(new C89943l(new C108698fq(this)));
        }
        return legacyOpaStandardPage;
    }
}
