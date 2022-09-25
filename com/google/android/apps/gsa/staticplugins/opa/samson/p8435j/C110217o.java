package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.o */
/* compiled from: PG */
public final class C110217o extends C83907bm {

    /* renamed from: b */
    public C68214a f307119b;

    /* renamed from: c */
    public C83893b f307120c;

    /* renamed from: d */
    public C58881cr f307121d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean e = C73845bq.m108431e((C73845bq) this.f307121d.mo6453a());
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.photos_intro, viewGroup, false);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        if (e) {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.photo_frame_intro_title_string_for_charging_ambient, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.photo_frame_intro_content_string_for_charging_ambient, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C28295m.m52919e(opaPageLayout, new C28292j(75818));
        } else {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.photo_frame_intro_title_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.photo_frame_intro_content_string, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C28295m.m52919e(opaPageLayout, new C28292j(58295));
        }
        headerLayout.mo77365b(R.drawable.product_logo_photos_color_48, R.string.photos_settings_google_photos_content_description);
        opaPageLayout.getClass();
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.photo_frame_intro_action_text, footerLayout);
        C84018m.m133907b(footerLayout.mo77361b(), R.string.photo_frame_intro_cancel_text, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110215m(this)));
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C110216n(this)));
        opaPageLayout.findViewById(R.id.album_illustration).setVisibility(0);
        return opaPageLayout;
    }
}
