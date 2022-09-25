package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ad */
/* compiled from: PG */
public final class C108820ad extends C83907bm {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.error_unsupported_device, (ViewGroup) null);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108819ac(this)));
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(47751));
        return legacyOpaStandardPage;
    }
}
