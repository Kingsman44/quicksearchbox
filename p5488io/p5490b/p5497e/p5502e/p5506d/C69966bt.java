package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.TimeoutException;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: io.b.e.e.d.bt */
/* compiled from: PG */
final class C69966bt implements Runnable {

    /* renamed from: a */
    final long f186488a;

    /* renamed from: b */
    final C69965bs f186489b;

    public C69966bt(long j, C69965bs bsVar) {
        this.f186488a = j;
        this.f186489b = bsVar;
    }

    public final void run() {
        C69965bs bsVar = this.f186489b;
        if (bsVar.compareAndSet(this.f186488a, Long.MAX_VALUE)) {
            C69828d.m101309f(bsVar.f186487f);
            bsVar.f186482a.mo25987b(new TimeoutException(C70085f.m101985b(bsVar.f186483b, bsVar.f186484c)));
            bsVar.f186485d.dispose();
        }
    }
}
