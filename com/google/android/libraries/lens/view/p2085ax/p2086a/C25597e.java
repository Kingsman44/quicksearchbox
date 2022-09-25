package com.google.android.libraries.lens.view.p2085ax.p2086a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.common.base.C58833ax;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.ax.a.e */
/* compiled from: PG */
final class C25597e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C58833ax f69636a;

    /* renamed from: b */
    final /* synthetic */ C25598f f69637b;

    public C25597e(C25598f fVar, C58833ax axVar) {
        this.f69637b = fVar;
        this.f69636a = axVar;
    }

    public final void run() {
        ((C119096ae) this.f69636a.mo56107c()).mo104121m();
        ((C119096ae) this.f69636a.mo56107c()).mo104117i(false);
        C25598f fVar = this.f69637b;
        fVar.f69645h = fVar.f69641d.mo29164d(this, 10, TimeUnit.SECONDS);
    }
}
