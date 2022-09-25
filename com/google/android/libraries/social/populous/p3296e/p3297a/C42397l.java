package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.social.populous.e.a.l */
/* compiled from: PG */
final class C42397l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f111185a;

    /* renamed from: b */
    final /* synthetic */ C42549n f111186b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f111187c;

    /* renamed from: d */
    final /* synthetic */ C42401p f111188d;

    public C42397l(C42401p pVar, C58872ci ciVar, C42549n nVar, C60870cx cxVar) {
        this.f111188d = pVar;
        this.f111185a = ciVar;
        this.f111186b = nVar;
        this.f111187c = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException) && !(((C60873d) this.f111187c).value instanceof C60873d.C60875b)) {
            C42579n a = this.f111188d.f111199d.mo45631a(this.f111186b.f111612i);
            a.mo45673h(45);
            a.mo45674i(29);
            a.mo45670e(th);
            a.mo45666a();
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f111188d.f111199d.mo45638h(74, this.f111185a, this.f111186b.f111612i);
    }
}
