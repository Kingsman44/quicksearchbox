package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82906ev;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.cj */
/* compiled from: PG */
final class C76992cj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C82906ev f212516a;

    /* renamed from: b */
    final /* synthetic */ C76993ck f212517b;

    public C76992cj(C76993ck ckVar, C82906ev evVar) {
        this.f212517b = ckVar;
        this.f212516a = evVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C76993ck.f212518a.mo56225c()).mo56382g(th.getCause())).mo56372aa(3707)).mo56386p("Getting speed bump info failed.");
        this.f212517b.f212519b.mo71316a((C82907ew) this.f212516a.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C82906ev evVar = this.f212516a;
        int b = this.f212517b.mo72380b(((Boolean) obj).booleanValue());
        evVar.copyOnWrite();
        C82907ew ewVar = (C82907ew) evVar.instance;
        C82907ew ewVar2 = C82907ew.f226160o;
        ewVar.f226171j = b - 1;
        ewVar.f226162a |= 256;
        this.f212517b.f212519b.mo71316a((C82907ew) this.f212516a.build());
    }
}
