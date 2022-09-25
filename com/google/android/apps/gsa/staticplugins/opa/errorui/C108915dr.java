package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83981af;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dr */
/* compiled from: PG */
public final /* synthetic */ class C108915dr implements C83981af {

    /* renamed from: a */
    public final /* synthetic */ C108925ea f302839a;

    public /* synthetic */ C108915dr(C108925ea eaVar) {
        this.f302839a = eaVar;
    }

    /* renamed from: a */
    public final void mo77411a() {
        CharSequence charSequence;
        C108925ea eaVar = this.f302839a;
        C84012g a = eaVar.f302864m.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        int i = eaVar.f302866o;
        if (i == 2 || i == 1) {
            charSequence = eaVar.getText(R.string.personal_response_on_lockscreen_allow_button);
        } else {
            charSequence = eaVar.getText(R.string.personal_response_on_lockscreen_agree_button);
        }
        e.mo77375c(charSequence);
        ((C83958a) e).f228734b = new C89943l(new C108921dx(eaVar, true));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(eaVar.getText(R.string.personal_response_on_lockscreen_decline_button));
        ((C83958a) e2).f228734b = new C89943l(new C108921dx(eaVar, false));
        a.mo77473b(e2.mo77373a());
    }
}
