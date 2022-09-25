package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.h */
/* compiled from: PG */
public final class C15656h extends C15660l {

    /* renamed from: a */
    private final boolean f46785a;

    public C15656h(boolean z) {
        this.f46785a = z;
    }

    /* renamed from: a */
    public final boolean mo22483a() {
        return this.f46785a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C15660l) && this.f46785a == ((C15660l) obj).mo22483a();
    }

    public final int hashCode() {
        return (true != this.f46785a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f46785a;
        return "AccountInfo{signedIn=" + z + "}";
    }
}
