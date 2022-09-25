package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50361uf;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.e */
/* compiled from: PG */
public final class C109838e extends C83907bm {

    /* renamed from: b */
    private C50361uf f306061b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f306061b = (C50361uf) C62942bv.parseFrom((C62942bv) C50361uf.f131089f, getArguments().getByteArray("error_ui"));
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Invalid ErrorUi in arguments", e);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = new LegacyOpaStandardPage(getActivity());
        String str = this.f306061b.f131093c;
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, str, TextView.BufferType.NORMAL, headerLayout);
        String str2 = this.f306061b.f131094d;
        HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout2.f228719b, str2, TextView.BufferType.NORMAL, headerLayout2);
        C84012g a = legacyOpaStandardPage.f228722a.mo77369a();
        a.mo77475d(1);
        C84010e e = C84011f.m133882e();
        e.mo77375c(this.f306061b.f131095e);
        ((C83958a) e).f228734b = new C89943l(new C109837d(this));
        a.mo77472a(e.mo77373a());
        C50361uf ufVar = this.f306061b;
        if ((1 & ufVar.f131091a) != 0) {
            C28295m.m52919e(legacyOpaStandardPage, new C28292j(ufVar.f131092b));
        }
        return legacyOpaStandardPage;
    }
}
