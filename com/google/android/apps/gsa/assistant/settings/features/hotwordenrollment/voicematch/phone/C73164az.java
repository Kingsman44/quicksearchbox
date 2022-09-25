package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone;

import android.view.View;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74549c;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.az */
/* compiled from: PG */
public final /* synthetic */ class C73164az implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73166ba f193952a;

    public /* synthetic */ C73164az(C73166ba baVar) {
        this.f193952a = baVar;
    }

    public final void onClick(View view) {
        ac acVar;
        C73166ba baVar = this.f193952a;
        C74554t i = C74555u.m120572i();
        i.mo70869c(C9439b.VOICE_MATCH_SETTINGS_UNDECIDED);
        ((C74549c) i).f208696b = baVar.f193955b.c();
        aa c = C74542ab.m120516c();
        if (((C86124t) baVar.f193958e.mo27525b()).mo79746e(C90082eg.f249889aE)) {
            acVar = ac.d;
        } else {
            acVar = ac.a;
        }
        c.c(acVar);
        i.mo70871e(c.a());
        baVar.startActivity(i.mo70882h());
    }
}
