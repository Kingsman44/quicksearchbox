package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70374aq;

/* renamed from: io.grpc.binder.a.t */
/* compiled from: PG */
final class C70215t extends C70219x {

    /* renamed from: a */
    public final boolean f187149a;

    /* renamed from: h */
    private Status f187150h;

    /* renamed from: i */
    private C70334de f187151i;

    public C70215t(C70206k kVar, C70256c cVar, int i, boolean z) {
        super(kVar, cVar, i);
        this.f187149a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61861a(Status status) {
        ((C70374aq) this.f187170g).mo62080a(status, C70373ap.PROCESSED, new C70334de());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61862b() {
        this.f187169f.mo62416e();
        this.f187169f.mo62423n();
        mo61874m(C70217v.CLOSED);
        ((C70374aq) this.f187170g).mo62080a(this.f187150h, C70373ap.PROCESSED, this.f187151i);
        this.f187165b.mo61833n(this);
    }

    /* renamed from: c */
    public final void mo61863c(int i, Parcel parcel) {
        C70334de a = C70178ab.m102193a(parcel, this.f187166c);
        this.f187169f.mo62412a();
        ((C70374aq) this.f187170g).mo62082c(a);
    }

    /* renamed from: d */
    public final void mo61864d(int i, Parcel parcel) {
        this.f187150h = C70196at.m102281b(i, parcel);
        this.f187151i = C70178ab.m102193a(parcel, this.f187166c);
    }

    /* renamed from: e */
    public final boolean mo61865e() {
        return this.f187149a;
    }
}
