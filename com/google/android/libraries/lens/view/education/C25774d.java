package com.google.android.libraries.lens.view.education;

/* renamed from: com.google.android.libraries.lens.view.education.d */
/* compiled from: PG */
final class C25774d extends C25779i {

    /* renamed from: a */
    public final int f70047a;

    public C25774d(int i) {
        this.f70047a = i;
    }

    /* renamed from: a */
    public final int mo30923a() {
        return this.f70047a;
    }

    /* renamed from: b */
    public final boolean mo30924b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25779i) {
            C25779i iVar = (C25779i) obj;
            return !iVar.mo30924b() && this.f70047a == iVar.mo30923a();
        }
    }

    public final int hashCode() {
        return this.f70047a ^ 385623362;
    }

    public final String toString() {
        int i = this.f70047a;
        return "LatexRendererConfigs{shouldWrapContent=false, maxHeight=" + i + "}";
    }
}
