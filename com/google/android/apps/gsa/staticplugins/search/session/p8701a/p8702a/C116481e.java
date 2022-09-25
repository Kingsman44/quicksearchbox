package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8702a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86359e;
import com.google.android.apps.gsa.search.core.state.p6872d.C86925as;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116836z;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p4500cm.p4518d.p4519a.C58181d;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.a.e */
/* compiled from: PG */
public final class C116481e extends C86354a implements C86359e {

    /* renamed from: a */
    private final C116836z f322958a;

    public C116481e(C116836z zVar) {
        this.f322958a = zVar;
    }

    /* renamed from: a */
    public final void mo80120a(ActionData actionData, C86231bn bnVar) {
        C116836z zVar = this.f322958a;
        int e = ((C86925as) zVar.f324245e.mo27525b()).mo80574e(actionData);
        C58179b bVar = actionData.f235995e;
        if (e != 0 && bVar != null && bnVar != null) {
            C84809b bVar2 = zVar.f324260t;
            C58181d dVar = bVar.f155537b;
            if (dVar == null) {
                dVar = C58181d.f155547j;
            }
            bVar2.mo78502v(e, dVar, bnVar.f233052a);
        }
    }
}
