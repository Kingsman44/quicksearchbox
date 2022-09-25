package androidx.media3.exoplayer;

import androidx.media3.common.C2640bb;

/* renamed from: androidx.media3.exoplayer.m */
/* compiled from: PG */
final class C3265m implements C2876ce {

    /* renamed from: a */
    public final C2908da f9803a = new C2908da();

    /* renamed from: b */
    public final C3261l f9804b;

    /* renamed from: c */
    public C2893cv f9805c;

    /* renamed from: d */
    public C2876ce f9806d;

    /* renamed from: e */
    public boolean f9807e = true;

    /* renamed from: f */
    public boolean f9808f;

    public C3265m(C3261l lVar) {
        this.f9804b = lVar;
    }

    /* renamed from: a */
    public final long mo6521a() {
        if (this.f9807e) {
            return this.f9803a.mo6521a();
        }
        C2876ce ceVar = this.f9806d;
        ceVar.getClass();
        return ceVar.mo6521a();
    }

    /* renamed from: b */
    public final C2640bb mo6523b() {
        C2876ce ceVar = this.f9806d;
        return ceVar != null ? ceVar.mo6523b() : this.f9803a.f8263a;
    }

    /* renamed from: c */
    public final void mo6524c(C2640bb bbVar) {
        C2876ce ceVar = this.f9806d;
        if (ceVar != null) {
            ceVar.mo6524c(bbVar);
            bbVar = this.f9806d.mo6523b();
        }
        this.f9803a.mo6524c(bbVar);
    }

    /* renamed from: d */
    public final void mo7256d() {
        this.f9808f = false;
        this.f9803a.mo6744f();
    }
}
