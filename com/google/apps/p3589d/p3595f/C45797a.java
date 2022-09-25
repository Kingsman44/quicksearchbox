package com.google.apps.p3589d.p3595f;

/* renamed from: com.google.apps.d.f.a */
/* compiled from: PG */
final class C45797a extends C45809l {

    /* renamed from: a */
    private final int f120423a;

    /* renamed from: b */
    private final boolean f120424b;

    public C45797a(int i, boolean z) {
        this.f120423a = i;
        this.f120424b = z;
    }

    /* renamed from: a */
    public final int mo49922a() {
        return this.f120423a;
    }

    /* renamed from: b */
    public final boolean mo49923b() {
        return this.f120424b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45809l) {
            C45809l lVar = (C45809l) obj;
            return this.f120423a == lVar.mo49922a() && this.f120424b == lVar.mo49923b();
        }
    }

    public final int hashCode() {
        return ((this.f120423a ^ 1000003) * 1000003) ^ (true != this.f120424b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f120423a;
        boolean z = this.f120424b;
        return "CodePointAndMeta{codePoint=" + i + ", isVariant=" + z + "}";
    }
}
