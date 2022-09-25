package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.cc */
/* compiled from: PG */
final class C13804cc implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13811cj f42005a;

    public C13804cc(C13811cj cjVar) {
        this.f42005a = cjVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        C13811cj cjVar = this.f42005a;
        cjVar.f42061e.f42089e = true;
        cjVar.mo21265f();
        if (th instanceof TimeoutException) {
            C2164c cVar = this.f42005a.f42078v;
            cVar.getClass();
            cVar.mo5439d(th);
            C46459k.m82829b(this.f42005a.mo21236a(), "timeout cancel", new Object[0]);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        C13811cj cjVar = this.f42005a;
        cjVar.f42061e.f42089e = true;
        cjVar.mo21265f();
    }
}
