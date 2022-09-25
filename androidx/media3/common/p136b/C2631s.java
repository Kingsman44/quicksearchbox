package androidx.media3.common.p136b;

import androidx.media3.common.C2676t;

/* renamed from: androidx.media3.common.b.s */
/* compiled from: PG */
final class C2631s {

    /* renamed from: a */
    public final Object f7292a;

    /* renamed from: b */
    public C2676t f7293b = new C2676t();

    /* renamed from: c */
    public boolean f7294c;

    /* renamed from: d */
    public boolean f7295d;

    public C2631s(Object obj) {
        this.f7292a = obj;
    }

    /* renamed from: a */
    public final void mo6199a(C2630r rVar) {
        this.f7295d = true;
        if (this.f7294c) {
            rVar.mo6029a(this.f7292a, this.f7293b.mo6348a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7292a.equals(((C2631s) obj).f7292a);
    }

    public final int hashCode() {
        return this.f7292a.hashCode();
    }
}
