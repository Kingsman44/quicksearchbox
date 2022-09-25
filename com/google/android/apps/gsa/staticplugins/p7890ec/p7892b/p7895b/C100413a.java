package com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7895b;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88275vq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88276vr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88277vs;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66667eg;

/* renamed from: com.google.android.apps.gsa.staticplugins.ec.b.b.a */
/* compiled from: PG */
public final class C100413a {

    /* renamed from: a */
    public C87682aj f280728a;

    /* renamed from: a */
    public final void mo91910a(C66667eg egVar) {
        if (this.f280728a != null) {
            C87684al alVar = new C87684al(C88244um.SET_TISID_VALIDATION_RESULT);
            C62940bt btVar = C88275vq.f238759a;
            C88276vr vrVar = (C88276vr) C88277vs.f238760c.createBuilder();
            vrVar.copyOnWrite();
            C88277vs vsVar = (C88277vs) vrVar.instance;
            vsVar.f238763b = egVar.f181355d;
            vsVar.f238762a |= 1;
            alVar.mo81965b(btVar, (C88277vs) vrVar.build());
            ((C86771n) this.f280728a).mo80379b(alVar.mo81964a());
        }
    }
}
