package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ag */
/* compiled from: PG */
public final class C108823ag extends C83907bm {

    /* renamed from: f */
    public static final /* synthetic */ int f302590f = 0;

    /* renamed from: b */
    public C86054o f302591b;

    /* renamed from: c */
    public C86124t f302592c;

    /* renamed from: d */
    public SharedPreferences f302593d;

    /* renamed from: e */
    public l f302594e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.error_email_opt_in, (ViewGroup) null);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108821ae(this)));
        legacyOpaStandardPage.f228724c.f228880c.setChecked(this.f302592c.mo79746e(C90014bt.f247600kH));
        if (this.f302592c.mo79746e(C90014bt.f247601kI)) {
            C84031z zVar = legacyOpaStandardPage.f228724c;
            zVar.f228895r.setText(R.string.opa_email_optin_screen_unsubscribe);
            zVar.mo77494d(7, true);
        }
        return legacyOpaStandardPage;
    }
}
