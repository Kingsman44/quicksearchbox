package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83981af;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ax */
/* compiled from: PG */
public final /* synthetic */ class C94180ax implements C83981af {

    /* renamed from: a */
    public final /* synthetic */ C94181ay f263132a;

    public /* synthetic */ C94180ax(C94181ay ayVar) {
        this.f263132a = ayVar;
    }

    /* renamed from: a */
    public final void mo77411a() {
        C94181ay ayVar = this.f263132a;
        C84012g a = ayVar.f263139h.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(ayVar.f263139h.getResources().getString(R.string.consent_screen_action_button_text));
        ((C83958a) e).f228734b = new C94178av(ayVar);
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(ayVar.f263139h.getResources().getString(R.string.consent_screen_cancel_button_text));
        ((C83958a) e2).f228734b = new C94179aw(ayVar);
        e2.mo77374b(true);
        a.mo77473b(e2.mo77373a());
    }
}
