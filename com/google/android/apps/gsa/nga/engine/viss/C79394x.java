package com.google.android.apps.gsa.nga.engine.viss;

import android.os.IBinder;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74971a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.x */
/* compiled from: PG */
final class C79394x implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final IBinder f218023a;

    /* renamed from: b */
    final /* synthetic */ C79396z f218024b;

    public C79394x(C79396z zVar, IBinder iBinder) {
        this.f218024b = zVar;
        this.f218023a = iBinder;
    }

    /* renamed from: a */
    public final void mo74011a() {
        C79396z zVar = this.f218024b;
        if (zVar.f218029e == null) {
            ((C58970a) ((C58970a) C79396z.f218025a.mo56226d()).mo56372aa(5595)).mo56386p("#onSearchProcessDied: currentDeathRecipient is not set");
            return;
        }
        zVar.f218029e = null;
        ((C79391u) zVar.f218027c.mo27525b()).mo74009b();
        C74975e eVar = (C74975e) zVar.f218028d.mo27525b();
        eVar.f209196b.mo28212l("[NGA] notify search process status listeners on death", new C74971a(eVar));
    }

    public final void binderDied() {
        this.f218024b.f218026b.mo28212l("[NGA] ClientDeathRecipient.binderDied", new C79393w(this));
    }
}
