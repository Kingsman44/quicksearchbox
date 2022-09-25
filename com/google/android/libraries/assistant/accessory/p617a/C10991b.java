package com.google.android.libraries.assistant.accessory.p617a;

/* renamed from: com.google.android.libraries.assistant.accessory.a.b */
/* compiled from: PG */
final class C10991b extends C10995f {

    /* renamed from: a */
    private final C10993d f36137a;

    /* renamed from: b */
    private final int f36138b;

    public C10991b(C10993d dVar, int i) {
        this.f36137a = dVar;
        this.f36138b = i;
    }

    /* renamed from: a */
    public final int mo19356a() {
        return this.f36138b;
    }

    /* renamed from: b */
    public final C10993d mo19357b() {
        return this.f36137a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10995f) {
            C10995f fVar = (C10995f) obj;
            return this.f36137a.equals(fVar.mo19357b()) && this.f36138b == fVar.mo19356a();
        }
    }

    public final int hashCode() {
        return ((this.f36137a.mo19362a() ^ 1000003) * 1000003) ^ this.f36138b;
    }

    public final String toString() {
        String obj = this.f36137a.toString();
        int i = this.f36138b;
        return "GmuFramingResult{header=" + obj + ", headerResult=" + i + "}";
    }
}
