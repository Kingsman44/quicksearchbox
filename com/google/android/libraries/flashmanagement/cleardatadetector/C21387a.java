package com.google.android.libraries.flashmanagement.cleardatadetector;

import android.util.Log;
import com.google.android.apps.gsa.search.core.p6808k.C86150j;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.flashmanagement.cleardatadetector.a */
/* compiled from: PG */
public final class C21387a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C21388b f59779a;

    public C21387a(C21388b bVar) {
        this.f59779a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.w("ClearDataDetector", "Couldn't detect first run state", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Integer) obj).intValue() == 2) {
            this.f59779a.f59781b.run();
        }
        C86150j.m138558a(Long.valueOf(this.f59779a.f59780a.f59788f));
    }
}
