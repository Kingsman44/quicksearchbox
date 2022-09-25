package com.google.android.libraries.assistant.auto.tng.common.p931p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.p.d */
/* compiled from: PG */
final class C13304d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13307g f41017a;

    public C13304d(C13307g gVar) {
        this.f41017a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C13307g gVar = this.f41017a;
        if (!gVar.f41023c) {
            gVar.f41023c = true;
            if (th instanceof CancellationException) {
                gVar.f41021a.mo20339gQ(true);
            } else {
                gVar.f41021a.mo20340gR(th);
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C13307g gVar = this.f41017a;
        if (!gVar.f41023c) {
            gVar.f41023c = true;
            gVar.f41021a.mo20339gQ(false);
        }
    }
}
