package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.cg */
/* compiled from: PG */
public final class C108877cg extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302728b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.cg");

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        OpaPageLayout opaPageLayout = new OpaPageLayout(context);
        opaPageLayout.mo77370b(R.layout.morris_notification_access);
        C28295m.m52919e(opaPageLayout, new C28292j(135763));
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.morris_notification_access_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.morris_notification_access_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(24, 0, 24, 0);
        ((TextView) headerLayout.findViewById(R.id.opa_error_title)).setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(24, 23, 24, 0);
        ((TextView) headerLayout.findViewById(R.id.opa_error_message)).setLayoutParams(layoutParams2);
        C84012g a = opaPageLayout.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getText(R.string.morris_allow_button));
        ((C83958a) e).f228734b = new C89943l(new C108875ce(this, context));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.morris_no_thanks_button));
        ((C83958a) e2).f228734b = new C89943l(new C108876cf(this));
        a.mo77473b(e2.mo77373a());
        return opaPageLayout;
    }
}
