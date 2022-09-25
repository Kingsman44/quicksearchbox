package androidx.p186q.p187a.p188a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.g */
/* compiled from: PG */
final class C4038g extends RuntimeException {

    /* renamed from: a */
    public final C4039h f12906a;

    /* renamed from: b */
    public final Throwable f12907b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4038g(C4039h hVar, Throwable th) {
        super(th);
        C69664n.m101061g(hVar, "callbackName");
        this.f12906a = hVar;
        this.f12907b = th;
    }

    public final Throwable getCause() {
        return this.f12907b;
    }
}
