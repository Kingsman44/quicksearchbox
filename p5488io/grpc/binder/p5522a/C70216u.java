package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70658ld;
import p5488io.grpc.p5525e.C70659le;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.binder.a.u */
/* compiled from: PG */
final class C70216u extends C70219x {

    /* renamed from: a */
    private final C70205j f187152a;

    public C70216u(C70205j jVar, C70256c cVar, int i) {
        super(jVar, cVar, i);
        this.f187152a = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61861a(Status status) {
        ((C70659le) this.f187170g).mo62381a(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61862b() {
        ((C70659le) this.f187170g).mo62382b();
    }

    /* renamed from: c */
    public final void mo61863c(int i, Parcel parcel) {
        C70658ld ldVar;
        String readString = parcel.readString();
        C70334de a = C70178ab.m102193a(parcel, this.f187166c);
        C70186aj ajVar = new C70186aj(this.f187152a, this.f187167d, C70670lp.m103314m(this.f187152a.f187114a));
        if ((i & 16) != 0) {
            ldVar = new C70195as(this, ajVar, this.f187166c);
        } else {
            ldVar = new C70180ad(this, ajVar, this.f187166c);
        }
        Status a2 = this.f187152a.mo61834a(ldVar, readString, a);
        if (a2.mo61679g()) {
            ((C70659le) this.f187170g).getClass();
            if (this.f187165b.mo61847u()) {
                ((C70659le) this.f187170g).mo62084e();
                return;
            }
            return;
        }
        super.mo61869h(a2, a2, false);
    }

    /* renamed from: d */
    public final void mo61864d(int i, Parcel parcel) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61866f() {
        if (!mo61876o()) {
            mo61874m(C70217v.CLOSED);
            this.f187169f.mo62423n();
            ((C70659le) this.f187170g).mo62381a(Status.f186902OK);
        }
    }
}
