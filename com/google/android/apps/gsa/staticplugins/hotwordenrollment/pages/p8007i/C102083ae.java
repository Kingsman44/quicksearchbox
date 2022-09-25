package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.C92427f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.C50375ut;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.ae */
/* compiled from: PG */
public final /* synthetic */ class C102083ae implements C92427f {

    /* renamed from: a */
    public final /* synthetic */ C102088aj f284778a;

    public /* synthetic */ C102083ae(C102088aj ajVar) {
        this.f284778a = ajVar;
    }

    /* renamed from: a */
    public final void mo87090a(String str) {
        C102088aj ajVar = this.f284778a;
        C50375ut utVar = ajVar.f284787c.f284827c;
        if (utVar == null) {
            utVar = C50375ut.f131127e;
        }
        String str2 = utVar.f131129a;
        Account a = ajVar.f284789e.mo79668a();
        if (a == null) {
            C59104x c = C102088aj.f284785a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
            ((C59052c) ((C59052c) c).mo56372aa(20548)).mo56386p("User is not signed in.");
            C101765e eVar = new C101765e();
            eVar.mo92562b(2);
            eVar.f283865a = C92408n.m151739a(C92381e.NO_ACCOUNT_LOGGED_IN);
            C47393f.m84236g(eVar.mo92561a(), ajVar.f284788d);
            return;
        }
        ajVar.f284790f.mo85147l(ajVar.f284789e.mo79671e("oauth2:https://www.googleapis.com/auth/accounts.reauth", a, new C91032p()), new C102087ai(ajVar, str2, str));
    }
}
