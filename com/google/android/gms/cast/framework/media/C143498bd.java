package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.bd */
/* compiled from: PG */
final class C143498bd extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C143499be f389120a;

    public C143498bd(C143499be beVar) {
        this.f389120a = beVar;
    }

    public final void run() {
        C143499be beVar = this.f389120a;
        beVar.f389124d.mo118791s(beVar.f389121a);
        C143499be beVar2 = this.f389120a;
        beVar2.f389124d.f389128c.postDelayed(this, beVar2.f389122b);
    }
}
