package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88566q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62964ck;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.d */
/* compiled from: PG */
public final class C116900d implements C88566q {

    /* renamed from: a */
    private final C21370a f324568a;

    /* renamed from: b */
    private final C86338r f324569b;

    public C116900d(C21370a aVar, C86338r rVar) {
        this.f324568a = aVar;
        this.f324569b = rVar;
    }

    /* renamed from: a */
    public final void mo82239a(C54231at atVar) {
        C62964ck ckVar = atVar.f142369i;
        if (!ckVar.isEmpty()) {
            int[] iArr = new int[ckVar.size()];
            for (int i = 0; i < ckVar.size(); i++) {
                iArr[i] = ((Long) ckVar.get(i)).intValue();
            }
            C86337q b = this.f324569b.mo80076b();
            b.mo80071f("server_experiment_ids", iArr);
            b.mo80072g("server_experiment_ids_timestamp", this.f324568a.mo26870b());
            b.apply();
        }
    }
}
