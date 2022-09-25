package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.ba */
/* compiled from: PG */
final class C100599ba implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C119053i f281287a;

    /* renamed from: b */
    final /* synthetic */ C100603be f281288b;

    public C100599ba(C100603be beVar, C119053i iVar) {
        this.f281288b = beVar;
        this.f281287a = iVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C100603be.f281293a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "StateCallbackHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33718)).mo56386p("Failed to get SearchResult");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            if (!this.f281288b.f281297e.mo84435dP()) {
                C100603be beVar = this.f281288b;
                beVar.f281295c.mo78944j(beVar.f281297e, (C86232bo) axVar.mo56107c());
            }
            this.f281288b.f281294b.mo28211k(((C86232bo) axVar.mo56107c()).mo79898v(), "SearchResult is done.", new C100597az(this, axVar));
        }
    }
}
