package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94889m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.k.a */
/* compiled from: PG */
public final /* synthetic */ class C95019a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95021c f265846a;

    public /* synthetic */ C95019a(C95021c cVar) {
        this.f265846a = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95021c cVar = this.f265846a;
        C58833ax axVar = (C58833ax) obj;
        C59104x b = C95021c.f265848a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccUtil");
        ((C59052c) ((C59052c) b).mo56372aa(17904)).mo56389s("received account=%b", Boolean.valueOf(axVar.mo56113h()));
        if (axVar.mo56113h()) {
            axVar.mo56107c();
            if (!((Account) axVar.mo56107c()).equals(cVar.f265849b)) {
                cVar.f265849b = (Account) axVar.mo56107c();
                C94889m mVar = cVar.f265850c;
                if (mVar != null) {
                    mVar.f265413a.mo88765b(axVar);
                }
            }
        } else if (cVar.f265849b != null) {
            cVar.f265849b = null;
            C94889m mVar2 = cVar.f265850c;
            if (mVar2 != null) {
                mVar2.f265413a.mo88765b(C58836b.f156633a);
            }
        }
    }
}
