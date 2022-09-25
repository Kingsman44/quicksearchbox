package p5488io.grpc.p5525e;

import com.google.common.base.C58872ci;

/* renamed from: io.grpc.e.cy */
/* compiled from: PG */
final class C70436cy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f187712a;

    /* renamed from: b */
    final /* synthetic */ C70437cz f187713b;

    public C70436cy(C70437cz czVar, boolean z) {
        this.f187713b = czVar;
        this.f187712a = z;
    }

    public final void run() {
        if (this.f187712a) {
            C70441dc dcVar = this.f187713b.f187714a;
            dcVar.f187743p = true;
            if (dcVar.f187740m > 0) {
                C58872ci ciVar = dcVar.f187742o;
                ciVar.mo56160e();
                ciVar.mo56161f();
            }
        }
        this.f187713b.f187714a.f187745r = false;
    }
}
