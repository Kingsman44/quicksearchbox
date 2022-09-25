package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92399e;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92400f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.p7271d.C92228e;
import com.google.android.apps.gsa.speech.p7271d.C92229f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ai */
/* compiled from: PG */
public final class C101816ai extends C92229f {

    /* renamed from: c */
    private final Account f283989c;

    /* renamed from: d */
    private final boolean f283990d;

    /* renamed from: e */
    private final boolean f283991e;

    /* renamed from: f */
    private final C101824aq f283992f;

    /* renamed from: g */
    private final C90021c f283993g;

    public C101816ai(Account account, boolean z, boolean z2, C90931ca caVar, C90021c cVar, C101824aq aqVar) {
        super(C92228e.CLOUD_UTTERANCES, caVar, cVar);
        this.f283989c = account;
        this.f283990d = z;
        this.f283991e = z2;
        this.f283993g = cVar;
        this.f283992f = aqVar;
    }

    /* renamed from: a */
    public final void mo86900a() {
        String str;
        if (this.f283993g.mo79746e(C90082eg.f249889aE)) {
            mo86905e(true);
        } else if (this.f283991e) {
            C101824aq aqVar = this.f283992f;
            Account account = this.f283989c;
            boolean z = this.f283990d;
            C101814ag agVar = new C101814ag(this);
            C58976aa aaVar = C58975e.f156826a;
            C92400f fVar = (C92400f) aqVar.f284008d.mo27525b();
            C90584f fVar2 = C90584f.OK_HEY_GOOGLE;
            if (aqVar.f284012h.mo92420a()) {
                str = aqVar.f284006b.mo92638c();
            } else {
                str = ((C92371d) aqVar.f284010f.mo27525b()).mo87021b();
            }
            new C90873ag(fVar.mo87044b(fVar2, z, str, C92399e.ALL_UTTERANCES, account, (C66595bu) ((C92371d) aqVar.f284010f.mo27525b()).mo87020a().mo56111f()), aqVar.f284011g, "checkHomeUtterancesReady", new C101821an(aqVar, agVar)).mo85223a(new C101822ao(aqVar));
        } else {
            C101824aq aqVar2 = this.f283992f;
            boolean z2 = this.f283990d;
            C90584f fVar3 = C90584f.OK_HEY_GOOGLE;
            C101815ah ahVar = new C101815ah(this);
            C58976aa aaVar2 = C58975e.f156826a;
            aqVar2.f284006b.f284135b = null;
            aqVar2.f284007c.mo87041a(fVar3, z2, 3, new C101823ap(aqVar2, ahVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
    }
}
