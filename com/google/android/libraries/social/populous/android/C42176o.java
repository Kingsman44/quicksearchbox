package com.google.android.libraries.social.populous.android;

import android.util.Log;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.social.populous.android.o */
/* compiled from: PG */
final class C42176o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f110457a;

    /* renamed from: b */
    final /* synthetic */ C42181t f110458b;

    public C42176o(C42181t tVar, C58872ci ciVar) {
        this.f110458b = tVar;
        this.f110457a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f110458b.f110478l.mo45638h(12, this.f110457a, C42576k.f111734a);
        Log.d(C42181t.f110467a, "Error registering Phenotype", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f110458b.f110478l.mo45638h(11, this.f110457a, C42576k.f111734a);
    }
}
