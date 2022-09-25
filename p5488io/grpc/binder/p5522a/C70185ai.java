package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.binder.a.ai */
/* compiled from: PG */
final class C70185ai extends C70187ak {

    /* renamed from: a */
    private final C70338di f187044a;

    /* renamed from: b */
    private final C70334de f187045b;

    /* renamed from: c */
    private final C70670lp f187046c;

    public C70185ai(C70206k kVar, int i, C70338di diVar, C70334de deVar, C70670lp lpVar) {
        super(kVar, i, lpVar);
        this.f187044a = diVar;
        this.f187045b = deVar;
        this.f187046c = lpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo61784a(Parcel parcel) {
        parcel.writeString(this.f187044a.f187497b);
        C70178ab.m102194b(parcel, this.f187045b);
        this.f187046c.mo62413b();
        return this.f187044a.f187496a.mo62042b() ? 16 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo61785b(Parcel parcel) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61786c(C70153aq aqVar) {
        this.f187045b.mo62031f(C70460dv.f187783b);
        this.f187045b.mo62033h(C70460dv.f187783b, Long.valueOf(Math.max(0, aqVar.mo61720b(TimeUnit.NANOSECONDS))));
    }
}
