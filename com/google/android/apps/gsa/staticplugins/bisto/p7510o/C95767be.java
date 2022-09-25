package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95101bk;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95102bl;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95103bm;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95790a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.be */
/* compiled from: PG */
public final /* synthetic */ class C95767be implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95771bi f268145a;

    public /* synthetic */ C95767be(C95771bi biVar) {
        this.f268145a = biVar;
    }

    public final void run() {
        C95771bi biVar = this.f268145a;
        C95790a aVar = biVar.f268165i;
        aVar.f268222e.f266450d.mo89148a(false);
        String i = aVar.f268221d.mo89216i(aVar.f268219b, 23);
        aVar.f268221d.mo89219l(23);
        if (i == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C95103bm bmVar = new C95103bm(new C95102bl(aVar.f268219b, (CharSequence) i, (C95101bk) biVar, (C95307m) aVar.f268223f.mo27525b(), aVar.f268220c), aVar);
        aVar.f268224g = bmVar;
        if (!aVar.f268222e.mo89170r(bmVar)) {
            C59104x c = C95790a.f268218a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EduPromptHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15453)).mo56386p("playQueryResultAnnouncement - fail");
        }
    }
}
