package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.gsa.c.a.d */
/* compiled from: PG */
final class C22252d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22253e f61474a;

    public C22252d(C22253e eVar) {
        this.f61474a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof C90457d) {
            this.f61474a.f61477c.mo57356n(new C89057m((C90457d) th));
        } else if (th instanceof C89013ak) {
            this.f61474a.f61477c.mo57356n(new C89057m((C89013ak) th));
        } else {
            this.f61474a.f61477c.mo57357o(th);
        }
        this.f61474a.mo27508a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89022at atVar = (C89022at) obj;
        try {
            atVar.mo83001c(this.f61474a.f61475a.f241273v);
            C22253e eVar = this.f61474a;
            eVar.f61477c.mo57356n(new C89021as(atVar, eVar.f61476b));
        } catch (C89013ak e) {
            mo17910gl(e);
        }
    }
}
