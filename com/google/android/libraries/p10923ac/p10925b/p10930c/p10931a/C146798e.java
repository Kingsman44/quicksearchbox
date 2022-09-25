package com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a;

/* renamed from: com.google.android.libraries.ac.b.c.a.e */
/* compiled from: PG */
final class C146798e extends C146803j {

    /* renamed from: a */
    private final boolean f396357a;

    /* renamed from: b */
    private final int f396358b;

    public C146798e(boolean z, int i) {
        this.f396357a = z;
        this.f396358b = i;
    }

    /* renamed from: a */
    public final int mo123667a() {
        return this.f396358b;
    }

    /* renamed from: b */
    public final boolean mo123668b() {
        return this.f396357a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146803j) {
            C146803j jVar = (C146803j) obj;
            return this.f396357a == jVar.mo123668b() && this.f396358b == jVar.mo123667a();
        }
    }

    public final int hashCode() {
        return (((true != this.f396357a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f396358b;
    }

    public final String toString() {
        boolean z = this.f396357a;
        int i = this.f396358b;
        return "CoreSyncSubPolicy{enabled=" + z + ", throttleDelaySeconds=" + i + "}";
    }
}
