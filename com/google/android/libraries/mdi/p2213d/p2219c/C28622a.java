package com.google.android.libraries.mdi.p2213d.p2219c;

/* renamed from: com.google.android.libraries.mdi.d.c.a */
/* compiled from: PG */
public final class C28622a extends C28680i {

    /* renamed from: a */
    public final boolean f77850a;

    public C28622a(boolean z) {
        this.f77850a = z;
    }

    /* renamed from: a */
    public final boolean mo34295a() {
        return this.f77850a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C28680i) && this.f77850a == ((C28680i) obj).mo34295a();
    }

    public final int hashCode() {
        return (true != this.f77850a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f77850a;
        return "PhotoOptions{allowDefaultImage=" + z + "}";
    }
}
