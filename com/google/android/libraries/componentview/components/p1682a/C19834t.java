package com.google.android.libraries.componentview.components.p1682a;

/* renamed from: com.google.android.libraries.componentview.components.a.t */
/* compiled from: PG */
final class C19834t extends C19835u {

    /* renamed from: a */
    private final boolean f55462a;

    /* renamed from: b */
    private final int f55463b;

    public C19834t(boolean z, int i) {
        this.f55462a = z;
        this.f55463b = i;
    }

    /* renamed from: a */
    public final int mo25142a() {
        return this.f55463b;
    }

    /* renamed from: b */
    public final boolean mo25143b() {
        return this.f55462a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19835u) {
            C19835u uVar = (C19835u) obj;
            return this.f55462a == uVar.mo25143b() && this.f55463b == uVar.mo25142a();
        }
    }

    public final int hashCode() {
        return (((true != this.f55462a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f55463b;
    }

    public final String toString() {
        boolean z = this.f55462a;
        int i = this.f55463b;
        return "DisableItemSelectionCarouselEventData{shouldHideIndicator=" + z + ", desiredHeight=" + i + "}";
    }
}
