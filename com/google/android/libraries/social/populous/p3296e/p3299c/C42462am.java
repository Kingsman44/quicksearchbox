package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42551p;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.social.populous.e.c.am */
/* compiled from: PG */
final class C42462am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42549n f111379a;

    /* renamed from: b */
    final /* synthetic */ C58872ci f111380b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f111381c;

    /* renamed from: d */
    final /* synthetic */ C42463an f111382d;

    public C42462am(C42463an anVar, C42549n nVar, C58872ci ciVar, C60870cx cxVar) {
        this.f111382d = anVar;
        this.f111379a = nVar;
        this.f111380b = ciVar;
        this.f111381c = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException) && !(((C60873d) this.f111381c).value instanceof C60873d.C60875b)) {
            C42579n a = this.f111382d.f111388f.mo45631a(this.f111379a.f111612i);
            a.mo45673h(26);
            a.mo45674i(4);
            a.mo45670e(th);
            a.mo45666a();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C42551p pVar = (C42551p) obj;
        this.f111382d.f111388f.mo45638h(true != this.f111379a.f111605b.isEmpty() ? 9 : 7, this.f111380b, this.f111379a.f111612i);
    }
}
