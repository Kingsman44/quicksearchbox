package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.common.p4522b.C58495hd;
import com.google.protos.youtube.elements.p5165a.C66026n;
import com.google.protos.youtube.elements.p5165a.C66028p;

/* renamed from: com.google.android.libraries.elements.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C20741v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21311r f58060a;

    /* renamed from: b */
    public final /* synthetic */ C66026n f58061b;

    public /* synthetic */ C20741v(C21311r rVar, C66026n nVar) {
        this.f58060a = rVar;
        this.f58061b = nVar;
    }

    public final void run() {
        C21311r rVar = this.f58060a;
        C66026n nVar = this.f58061b;
        C58495hd hdVar = C20743x.f58062a;
        View b = rVar.mo26732b();
        C58495hd hdVar2 = C20743x.f58062a;
        C66028p a = C66028p.m96832a(nVar.f179563b);
        if (a == null) {
            a = C66028p.HAPTIC_TYPE_UNKNOWN;
        }
        b.performHapticFeedback(((C20742w) hdVar2.get(a)).mo25809a());
    }
}
