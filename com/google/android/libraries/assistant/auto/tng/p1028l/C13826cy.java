package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.cy */
/* compiled from: PG */
final class C13826cy implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13850db f42123a;

    public C13826cy(C13850db dbVar) {
        this.f42123a = dbVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f42123a.mo21302d();
        if (th instanceof TimeoutException) {
            C46459k.m82829b(this.f42123a.mo21236a(), "timeout cancel", new Object[0]);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f42123a.mo21302d();
    }
}
