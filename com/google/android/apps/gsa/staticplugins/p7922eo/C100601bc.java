package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90529u;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.bc */
/* compiled from: PG */
final class C100601bc implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C119053i f281290a;

    /* renamed from: b */
    final /* synthetic */ C100603be f281291b;

    public C100601bc(C100603be beVar, C119053i iVar) {
        this.f281291b = beVar;
        this.f281290a = iVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C100603be.f281293a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "StateCallbackHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33720)).mo56386p("Failed to get noSpeechDetectedDone");
        this.f281291b.mo91988b(this.f281290a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        if (((C58833ax) obj).mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            C100603be beVar = this.f281291b;
            beVar.f281295c.mo78945k(beVar.f281297e);
            if (this.f281291b.f281297e.mo84326bK()) {
                C90529u uVar = new C90529u((byte[]) null);
                C100603be beVar2 = this.f281291b;
                C85422c cVar = beVar2.f281295c;
                Query query = beVar2.f281297e;
                beVar2.f281307o.mo86892c(query.f252749G);
                cVar.mo78943i(query, new VoiceSearchError(query, uVar, (String) null));
                this.f281290a.f332140a.mo104093e(uVar);
            }
            this.f281291b.mo91988b(this.f281290a);
        }
    }
}
