package com.google.android.libraries.p10923ac.p10924a;

/* renamed from: com.google.android.libraries.ac.a.d */
/* compiled from: PG */
public final class C146761d extends C146768k {

    /* renamed from: a */
    public final boolean f396293a;

    /* renamed from: b */
    public final int f396294b;

    public C146761d(boolean z, int i) {
        this.f396293a = z;
        this.f396294b = i;
    }

    /* renamed from: a */
    public final int mo123613a() {
        return this.f396294b;
    }

    /* renamed from: b */
    public final boolean mo123614b() {
        return this.f396293a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146768k) {
            C146768k kVar = (C146768k) obj;
            return this.f396293a == kVar.mo123614b() && this.f396294b == kVar.mo123613a();
        }
    }

    public final int hashCode() {
        return (((true != this.f396293a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f396294b;
    }

    public final String toString() {
        boolean z = this.f396293a;
        int i = this.f396294b;
        return "SyncSubPolicy{enabled=" + z + ", throttleDelaySeconds=" + i + "}";
    }
}
