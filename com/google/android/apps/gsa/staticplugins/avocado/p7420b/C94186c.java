package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.C92427f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.c */
/* compiled from: PG */
public final /* synthetic */ class C94186c implements C92427f {

    /* renamed from: a */
    public final /* synthetic */ C94189f f263150a;

    public /* synthetic */ C94186c(C94189f fVar) {
        this.f263150a = fVar;
    }

    /* renamed from: a */
    public final void mo87090a(String str) {
        C94189f fVar = this.f263150a;
        String string = fVar.getArguments().getString("parent_user_id");
        Account a = fVar.f263159f.mo79668a();
        if (a == null) {
            C59104x c = C94189f.f263155b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
            ((C59052c) ((C59052c) c).mo56372aa(14443)).mo56386p("User is not signed in.");
            fVar.mo88386g(1);
            return;
        }
        fVar.f263160g.mo85147l(fVar.f263159f.mo79671e("oauth2:https://www.googleapis.com/auth/accounts.reauth", a, new C91032p()), new C94188e(fVar, string, str));
    }
}
