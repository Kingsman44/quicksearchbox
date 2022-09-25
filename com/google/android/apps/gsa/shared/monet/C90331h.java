package com.google.android.apps.gsa.shared.monet;

import com.google.android.libraries.gsa.monet.internal.p1887a.C22968ak;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22977at;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22997u;

/* renamed from: com.google.android.apps.gsa.shared.monet.h */
/* compiled from: PG */
public final /* synthetic */ class C90331h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90347r f252271a;

    public /* synthetic */ C90331h(C90347r rVar) {
        this.f252271a = rVar;
    }

    public final void run() {
        C90347r rVar = this.f252271a;
        if (rVar.f252312f) {
            rVar.mo84031a();
        }
        ((C90329g) rVar.f252319m.mo27525b()).f252265e = false;
        rVar.f252310d.mo84017i();
        C22997u uVar = (C22997u) rVar.f252314h.mo27525b();
        uVar.mo28394a(false);
        if (!((C22968ak) uVar.f63259c.mo27525b()).f63176a.f63445d) {
            for (String a : uVar.f63258b.mo28387b()) {
                C22977at a2 = uVar.f63258b.mo28386a(a);
                a2.getClass();
                a2.f63195c = false;
            }
        }
        rVar.f252325s = C90346q.STOPPED;
    }
}
