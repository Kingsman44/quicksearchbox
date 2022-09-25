package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;

/* renamed from: io.grpc.e.bz */
/* compiled from: PG */
final class C70410bz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70555hi f187639a;

    public C70410bz(C70555hi hiVar) {
        this.f187639a = hiVar;
    }

    public final void run() {
        C70516fx fxVar = (C70516fx) this.f187639a;
        C58838bb.m90884s(fxVar.f187905a.f187968C.get(), "Channel must have been shut down");
        C70542gw gwVar = fxVar.f187905a;
        gwVar.f187970E = true;
        gwVar.mo62282p(false);
        fxVar.f187905a.mo62278l();
        fxVar.f187905a.mo62279m();
    }
}
