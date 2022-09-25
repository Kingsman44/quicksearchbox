package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.y */
/* compiled from: PG */
public final class C110087y extends C83907bm {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.charging_mode_setup_complete, (ViewGroup) null);
        C28295m.m52919e(opaPageLayout, new C28292j(77263));
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.charging_mode_setup_complete_done, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110086x(this)));
        return opaPageLayout;
    }
}
