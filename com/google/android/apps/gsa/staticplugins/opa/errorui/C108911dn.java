package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dn */
/* compiled from: PG */
public final class C108911dn extends C83907bm {

    /* renamed from: b */
    public bm f302837b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.opa_user_enabled, viewGroup, false);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108909dl(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108910dm(this)));
        return legacyOpaStandardPage;
    }
}
