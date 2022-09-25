package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70280ci;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.fm */
/* compiled from: PG */
final class C70505fm extends C70280ci {

    /* renamed from: a */
    final /* synthetic */ Throwable f187884a;

    /* renamed from: b */
    private final C70276ce f187885b;

    public C70505fm(Throwable th) {
        this.f187884a = th;
        this.f187885b = C70276ce.m102449a(Status.f186915m.withDescription("Panic! This is a bug!").mo61678e(th));
    }

    /* renamed from: a */
    public final C70276ce mo61957a() {
        return this.f187885b;
    }

    public final String toString() {
        C58830au a = C58831av.m90828a(C70505fm.class);
        a.mo56102b("panicPickResult", this.f187885b);
        return a.toString();
    }
}
