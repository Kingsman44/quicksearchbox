package p5488io.grpc.p5524d;

import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70702eg;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70519g;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70656lb;
import p5488io.grpc.p5525e.C70669lo;

/* renamed from: io.grpc.d.g */
/* compiled from: PG */
public final class C70310g extends C70519g {

    /* renamed from: a */
    public final C70656lb f187433a;

    /* renamed from: b */
    final SocketAddress f187434b;

    /* renamed from: c */
    public C70567hu f187435c = new C70669lo(C70460dv.f187798q);

    public C70310g(SocketAddress socketAddress) {
        this.f187434b = socketAddress;
        C70656lb lbVar = new C70656lb(new C70309f(this));
        this.f187433a = lbVar;
        lbVar.f188379k = false;
        lbVar.f188380l = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C58838bb.m90866a(timeUnit, "unit");
        lbVar.f188376h = timeUnit.toMillis(Long.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C70702eg mo61999b() {
        return this.f187433a;
    }
}
