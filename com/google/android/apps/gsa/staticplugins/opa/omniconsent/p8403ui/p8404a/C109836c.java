package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50339tk;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.c */
/* compiled from: PG */
public final class C109836c extends C83907bm {

    /* renamed from: b */
    public C83893b f306057b;

    /* renamed from: c */
    public C86054o f306058c;

    /* renamed from: d */
    private C50339tk f306059d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 458) {
            return;
        }
        if (i2 == -1) {
            this.f306058c.mo79680n();
            Account w = this.f306058c.mo79689w(intent.getStringExtra("authAccount"));
            if (w != null) {
                this.f306057b.mo77279b(w);
            }
            mo77318iT().mo77312a();
        } else if (i2 != 0) {
            mo77318iT().mo77313b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f306059d = (C50339tk) C62942bv.parseFrom((C62942bv) C50339tk.f131012h, getArguments().getByteArray("account_error_ui"));
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Invalid AccountErrorUi in arguments", e);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C84011f fVar;
        LegacyOpaStandardPage legacyOpaStandardPage = new LegacyOpaStandardPage(getActivity());
        String str = this.f306059d.f131016c;
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, str, TextView.BufferType.NORMAL, headerLayout);
        String str2 = this.f306059d.f131017d;
        HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout2.f228719b, str2, TextView.BufferType.NORMAL, headerLayout2);
        legacyOpaStandardPage.f228724c.f228885h.setVisibility(0);
        legacyOpaStandardPage.f228724c.f228885h.setText(LinkUtil.m133792b(this.f306059d.f131018e));
        legacyOpaStandardPage.f228724c.f228885h.setMovementMethod(LinkMovementMethod.getInstance());
        C84012g a = legacyOpaStandardPage.f228722a.mo77369a();
        a.mo77475d(1);
        if (this.f306057b.mo77281d()) {
            C84010e e = C84011f.m133882e();
            e.mo77375c(this.f306059d.f131020g);
            ((C83958a) e).f228734b = new C89943l(new C109835b(this));
            fVar = e.mo77373a();
        } else {
            C84010e e2 = C84011f.m133882e();
            e2.mo77375c(this.f306059d.f131019f);
            ((C83958a) e2).f228734b = new C89943l(new C109827a(this));
            fVar = e2.mo77373a();
        }
        a.mo77472a(fVar);
        C50339tk tkVar = this.f306059d;
        if ((1 & tkVar.f131014a) != 0) {
            C28295m.m52919e(legacyOpaStandardPage, new C28292j(tkVar.f131015b));
        }
        return legacyOpaStandardPage;
    }
}
