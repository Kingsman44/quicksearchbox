package androidx.p104d.p105a;

import java.util.concurrent.Executor;

/* renamed from: androidx.d.a.c */
/* compiled from: PG */
public final class C2164c {

    /* renamed from: a */
    Object f6138a;

    /* renamed from: b */
    C2168g f6139b;

    /* renamed from: c */
    public C2170i f6140c = new C2170i();

    /* renamed from: d */
    private boolean f6141d;

    /* renamed from: e */
    private final void m6019e() {
        this.f6138a = null;
        this.f6139b = null;
        this.f6140c = null;
    }

    /* renamed from: a */
    public final void mo5436a(Runnable runnable, Executor executor) {
        C2170i iVar = this.f6140c;
        if (iVar != null) {
            iVar.mo4106b(runnable, executor);
        }
    }

    /* renamed from: b */
    public final boolean mo5437b(Object obj) {
        boolean z = true;
        this.f6141d = true;
        C2168g gVar = this.f6139b;
        if (gVar == null || !gVar.f6144b.mo5422f(obj)) {
            z = false;
        }
        if (z) {
            m6019e();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo5438c() {
        boolean z = true;
        this.f6141d = true;
        C2168g gVar = this.f6139b;
        if (gVar == null || !gVar.f6144b.cancel(true)) {
            z = false;
        }
        if (z) {
            m6019e();
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo5439d(Throwable th) {
        boolean z = true;
        this.f6141d = true;
        C2168g gVar = this.f6139b;
        if (gVar == null || !gVar.f6144b.mo5423g(th)) {
            z = false;
        }
        if (z) {
            m6019e();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        C2170i iVar;
        C2168g gVar = this.f6139b;
        if (gVar != null && !gVar.f6144b.isDone()) {
            StringBuilder sb = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            Object obj = this.f6138a;
            sb.append(obj);
            gVar.f6144b.mo5423g(new C2165d("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (!this.f6141d && (iVar = this.f6140c) != null) {
            iVar.mo5422f((Object) null);
        }
    }
}
