package com.google.android.libraries.p3339v;

import com.google.android.gms.common.api.C143709ab;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.C143842n;

/* renamed from: com.google.android.libraries.v.b */
/* compiled from: PG */
public final /* synthetic */ class C43202b implements C143712ae {

    /* renamed from: a */
    public final /* synthetic */ C43204d f112927a;

    public /* synthetic */ C43202b(C43204d dVar) {
        this.f112927a = dVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        C43204d dVar = this.f112927a;
        if (adVar.mo117629a().mo119096b()) {
            dVar.cancel(false);
        } else if (adVar.mo117629a().mo119097c()) {
            dVar.mo57356n(adVar);
        } else if (adVar.mo117629a().f389623i != null) {
            dVar.mo57357o(new C143709ab(adVar.mo117629a()));
        } else {
            dVar.mo57357o(new C143842n(adVar.mo117629a()));
        }
    }
}
