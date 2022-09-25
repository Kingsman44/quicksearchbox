package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70280ci;
import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.hz */
/* compiled from: PG */
final class C70572hz extends C70280ci {

    /* renamed from: a */
    public final C70279ch f188135a;

    /* renamed from: b */
    final /* synthetic */ C70574ia f188136b;

    /* renamed from: c */
    private final AtomicBoolean f188137c = new AtomicBoolean(false);

    public C70572hz(C70574ia iaVar, C70279ch chVar) {
        this.f188136b = iaVar;
        C58838bb.m90866a(chVar, "subchannel");
        this.f188135a = chVar;
    }

    /* renamed from: a */
    public final C70276ce mo61957a() {
        if (this.f188137c.compareAndSet(false, true)) {
            C70766ff ffVar = ((C70523gd) this.f188136b.f188145b).f187915b.f188009n;
            ffVar.mo62446c(new C70571hy(this));
            ffVar.mo62445b();
        }
        return C70276ce.f187346a;
    }
}
