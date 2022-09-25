package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.br */
/* compiled from: PG */
public final class C108861br extends C83907bm {

    /* renamed from: b */
    public C89994f f302700b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.error_unsupported_opa_locale, (ViewGroup) null);
        Locale al = this.f302700b.mo83892al();
        String string = getResources().getString(R.string.opa_error_unsupported_locale_title, new Object[]{al.getDisplayName()});
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, string, TextView.BufferType.NORMAL, headerLayout);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108860bq(this)));
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(36592));
        return legacyOpaStandardPage;
    }
}
