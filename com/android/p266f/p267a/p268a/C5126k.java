package com.android.p266f.p267a.p268a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.android.f.a.a.k */
/* compiled from: PG */
final class C5126k {

    /* renamed from: a */
    int f16315a = 0;

    /* renamed from: b */
    final /* synthetic */ C5129n f16316b;

    /* renamed from: c */
    private C5127l f16317c = null;

    /* renamed from: d */
    private C5127l f16318d = null;

    public C5126k(C5129n nVar) {
        this.f16316b = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5128m mo10153a() {
        C5129n nVar = this.f16316b;
        C5128m mVar = new C5128m(nVar);
        mVar.f16322a = nVar.f16327b;
        mVar.f16323b = this.f16315a;
        return mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10154b() {
        this.f16316b.mo10167j(this.f16318d.f16319a.toByteArray(), this.f16318d.f16320b);
        this.f16318d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10155c() {
        if (this.f16318d == null) {
            C5127l lVar = new C5127l();
            C5129n nVar = this.f16316b;
            lVar.f16319a = nVar.f16326a;
            lVar.f16320b = nVar.f16327b;
            lVar.f16321c = this.f16317c;
            this.f16317c = lVar;
            this.f16315a++;
            nVar.f16326a = new ByteArrayOutputStream();
            this.f16316b.f16327b = 0;
            return;
        }
        throw new RuntimeException("BUG: Invalid newbuf() before copy()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10156d() {
        C5129n nVar = this.f16316b;
        ByteArrayOutputStream byteArrayOutputStream = nVar.f16326a;
        int i = nVar.f16327b;
        C5127l lVar = this.f16317c;
        nVar.f16326a = lVar.f16319a;
        nVar.f16327b = lVar.f16320b;
        this.f16318d = lVar;
        this.f16317c = lVar.f16321c;
        this.f16315a--;
        C5127l lVar2 = this.f16318d;
        lVar2.f16319a = byteArrayOutputStream;
        lVar2.f16320b = i;
    }
}
