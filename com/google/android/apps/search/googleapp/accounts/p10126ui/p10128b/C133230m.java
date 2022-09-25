package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.m */
/* compiled from: PG */
public final class C133230m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C133231n f363119a;

    public C133230m(C133231n nVar) {
        this.f363119a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133231n.f363120a.mo56226d()).mo56382g(th)).mo56372aa(40020)).mo56386p("Can't update WAA status for Mavatar!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        boolean z = null;
        if (list != null && list.size() == 1) {
            C41387c a = C41387c.m72380a(((C41389e) list.get(0)).f108146b);
            if (a == null) {
                a = C41387c.DEFAULT;
            }
            if (a == C41387c.WEB_HISTORY) {
                int a2 = C41408g.m72395a(((C41389e) list.get(0)).f108147c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i == 1) {
                    z = true;
                } else if (i == 2) {
                    z = false;
                }
            }
        }
        C133231n nVar = this.f363119a;
        this.f363119a.f363133n.mo50787a(nVar.f363126g.mo46039a(new C133229l(z), nVar.f363127h), C133231n.f363122c);
    }
}
