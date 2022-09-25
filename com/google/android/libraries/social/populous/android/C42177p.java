package com.google.android.libraries.social.populous.android;

import android.util.Log;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.social.populous.android.p */
/* compiled from: PG */
final class C42177p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f110459a;

    /* renamed from: b */
    final /* synthetic */ C42181t f110460b;

    public C42177p(C42181t tVar, C58872ci ciVar) {
        this.f110460b = tVar;
        this.f110459a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f110460b.f110478l.mo45638h(14, this.f110459a, C42576k.f111734a);
        Log.d(C42181t.f110467a, "Error during Phenotype commit", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f110460b.f110478l.mo45638h(13, this.f110459a, C42576k.f111734a);
    }
}
