package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8911a.C118952a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.az */
/* compiled from: PG */
final class C100597az implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C58833ax f281278a;

    /* renamed from: b */
    final /* synthetic */ C100599ba f281279b;

    public C100597az(C100599ba baVar, C58833ax axVar) {
        this.f281279b = baVar;
        this.f281278a = axVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C86232bo boVar = (C86232bo) this.f281278a.mo56107c();
        if (boVar.mo79882R()) {
            C58976aa aaVar = C58975e.f156826a;
            C90456c o = boVar.mo79891o();
            o.getClass();
            Exception c = o.mo79845c();
            if (c instanceof C90528t) {
                C90528t tVar = (C90528t) c;
                C100603be beVar = this.f281279b.f281288b;
                C85422c cVar = beVar.f281295c;
                Query query = beVar.f281297e;
                beVar.f281307o.mo86892c(query.f252749G);
                C100603be beVar2 = this.f281279b.f281288b;
                beVar2.f281303k.mo79746e(C90086ek.f250387cF);
                C90528t tVar2 = tVar;
                cVar.mo78941g(query, new VoiceSearchError(query, tVar, C118952a.m197463a(beVar2.f281298f, tVar2, (C89037bh) beVar2.f281299g.mo27525b(), beVar2.f281300h, (C89994f) beVar2.f281301i.mo27525b(), beVar2.f281302j, beVar2.f281297e, beVar2.f281303k, (String) null, beVar2.f281305m.mo79343a(), beVar2.f281304l)));
            }
        }
        C100599ba baVar = this.f281279b;
        baVar.f281288b.mo91988b(baVar.f281287a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
        C100599ba baVar = this.f281279b;
        baVar.f281288b.mo91988b(baVar.f281287a);
    }
}
