package com.google.android.libraries.social.populous.p3296e.p3300d;

import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42551p;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.social.populous.e.d.i */
/* compiled from: PG */
final class C42509i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f111470a;

    /* renamed from: b */
    final /* synthetic */ C42549n f111471b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f111472c;

    /* renamed from: d */
    final /* synthetic */ C42510j f111473d;

    public C42509i(C42510j jVar, C58872ci ciVar, C42549n nVar, C60870cx cxVar) {
        this.f111473d = jVar;
        this.f111470a = ciVar;
        this.f111471b = nVar;
        this.f111472c = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException) && !(((C60873d) this.f111472c).value instanceof C60873d.C60875b)) {
            C42579n a = this.f111473d.f111477d.mo45631a(this.f111471b.f111612i);
            a.mo45673h(29);
            a.mo45674i(30);
            a.mo45670e(th);
            a.mo45666a();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C42551p pVar = (C42551p) obj;
        this.f111473d.f111477d.mo45638h(46, this.f111470a, this.f111471b.f111612i);
    }
}
