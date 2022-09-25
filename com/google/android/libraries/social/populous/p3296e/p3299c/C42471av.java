package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42551p;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.social.populous.e.c.av */
/* compiled from: PG */
final class C42471av implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f111404a;

    /* renamed from: b */
    final /* synthetic */ C42549n f111405b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f111406c;

    /* renamed from: d */
    final /* synthetic */ C42472aw f111407d;

    public C42471av(C42472aw awVar, C58872ci ciVar, C42549n nVar, C60870cx cxVar) {
        this.f111407d = awVar;
        this.f111404a = ciVar;
        this.f111405b = nVar;
        this.f111406c = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException) && !(((C60873d) this.f111406c).value instanceof C60873d.C60875b)) {
            C42579n a = this.f111407d.f111410c.mo45631a(this.f111405b.f111612i);
            a.mo45673h(27);
            a.mo45674i(42);
            a.mo45670e(th);
            a.mo45666a();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C42551p pVar = (C42551p) obj;
        this.f111407d.f111410c.mo45638h(71, this.f111404a, this.f111405b.f111612i);
    }
}
