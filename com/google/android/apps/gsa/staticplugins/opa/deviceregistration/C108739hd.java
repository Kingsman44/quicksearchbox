package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.hd */
/* compiled from: PG */
public final class C108739hd extends C83907bm {

    /* renamed from: b */
    public C108733gy f302384b;

    /* renamed from: c */
    public Context f302385c;

    /* renamed from: d */
    public C22871g f302386d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.wifi, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44605));
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108734gz(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108736ha(this)));
        return legacyOpaStandardPage;
    }
}
