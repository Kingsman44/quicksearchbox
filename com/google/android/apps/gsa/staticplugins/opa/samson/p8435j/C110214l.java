package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.l */
/* compiled from: PG */
public final class C110214l extends C83907bm {

    /* renamed from: b */
    private OpaPageLayout f307116b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.photos_error, (ViewGroup) null);
        this.f307116b = opaPageLayout;
        C28295m.m52919e(opaPageLayout, new C28292j(59887));
        HeaderLayout headerLayout = (HeaderLayout) this.f307116b.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.photo_error_title_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.photo_error_content_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        headerLayout.mo77365b(R.drawable.product_logo_photos_color_48, R.string.photos_settings_google_photos_content_description);
        OpaPageLayout opaPageLayout2 = this.f307116b;
        opaPageLayout2.getClass();
        FooterLayout footerLayout = opaPageLayout2.f228726a;
        footerLayout.mo77362c(1);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.photos_error_action_text, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110213k(this)));
        return this.f307116b;
    }
}
