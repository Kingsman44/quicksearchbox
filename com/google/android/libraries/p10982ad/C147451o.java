package com.google.android.libraries.p10982ad;

/* renamed from: com.google.android.libraries.ad.o */
/* compiled from: PG */
abstract class C147451o implements Comparable {

    /* renamed from: a */
    final long f398014a;

    /* renamed from: b */
    final float f398015b;

    /* renamed from: c */
    public C147453q f398016c;

    public C147451o(long j, float f) {
        this.f398014a = j;
        this.f398015b = f;
    }

    /* renamed from: a */
    public abstract float mo124190a(long j);

    /* renamed from: b */
    public abstract float mo124191b(long j);

    public final /* synthetic */ int compareTo(Object obj) {
        return (this.f398014a > ((C147451o) obj).f398014a ? 1 : (this.f398014a == ((C147451o) obj).f398014a ? 0 : -1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo124194d() {
        C147453q qVar = this.f398016c;
        if (qVar != null) {
            qVar.mo31480a();
            this.f398016c = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C147451o) || this.f398014a != ((C147451o) obj).f398014a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.valueOf(this.f398014a).hashCode();
    }
}
