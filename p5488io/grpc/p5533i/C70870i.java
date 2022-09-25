package p5488io.grpc.p5533i;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.util.concurrent.C60873d;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.i.i */
/* compiled from: PG */
final class C70870i extends C60873d {

    /* renamed from: a */
    public final C70898m f189047a;

    public C70870i(C70898m mVar) {
        this.f189047a = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gL */
    public final void mo57294gL() {
        this.f189047a.mo27480d("GrpcFuture was cancelled", (Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("clientCall", this.f189047a);
        return b.toString();
    }
}
