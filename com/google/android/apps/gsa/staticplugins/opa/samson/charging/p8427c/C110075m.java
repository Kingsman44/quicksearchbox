package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.m */
/* compiled from: PG */
public final class C110075m extends C83907bm {

    /* renamed from: b */
    public Context f306680b;

    /* renamed from: c */
    public C110403c f306681c;

    /* renamed from: d */
    public C83893b f306682d;

    /* renamed from: e */
    public u f306683e;

    /* renamed from: f */
    SwitchCompat f306684f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String a;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.charging_mode_intro, (ViewGroup) null);
        C28295m.m52919e(opaPageLayout, new C28292j(75812));
        opaPageLayout.mo77370b(R.layout.charging_mode_intro);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.charging_mode_intro_ok, footerLayout);
        C84018m.m133907b(footerLayout.mo77361b(), R.string.charging_mode_intro_decline, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110073k(this)));
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C110074l(this)));
        this.f306684f = (SwitchCompat) opaPageLayout.findViewById(R.id.charging_amb_toggle);
        if (this.f306683e.d() && (a = this.f306683e.a(this.f306680b.getResources().getConfiguration().getLocales().get(0).getISO3Language())) != null) {
            C58833ax a2 = this.f306682d.mo77278a();
            if (a2.mo56113h()) {
                this.f306684f.setChecked(this.f306681c.mo98633d(((Account) a2.mo56107c()).name));
            }
            this.f306684f.setText(a);
            this.f306684f.setVisibility(0);
        }
        return opaPageLayout;
    }
}
