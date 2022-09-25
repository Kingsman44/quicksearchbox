package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69302j;

/* renamed from: com.google.android.libraries.social.populous.e.a.o */
/* compiled from: PG */
final class C42400o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42401p f111195a;

    public C42400o(C42401p pVar) {
        this.f111195a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if ((!(th instanceof CancellationException) && !(th.getCause() instanceof CancellationException)) || !C69302j.f185437a.mo6453a().mo60981g()) {
            C42579n a = this.f111195a.f111199d.mo45631a(C42576k.f111734a);
            a.mo45674i(46);
            a.mo45673h(42);
            a.mo45670e(th);
            a.mo45666a();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
