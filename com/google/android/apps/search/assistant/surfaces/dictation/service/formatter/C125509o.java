package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.o */
/* compiled from: PG */
final class C125509o extends C125494bc {

    /* renamed from: b */
    private final int f346101b;

    /* renamed from: c */
    private final int f346102c;

    public C125509o(int i, int i2) {
        this.f346101b = i;
        this.f346102c = i2;
    }

    /* renamed from: a */
    public final int mo106986a() {
        return this.f346102c;
    }

    /* renamed from: b */
    public final int mo106987b() {
        return this.f346101b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125494bc) {
            C125494bc bcVar = (C125494bc) obj;
            return this.f346101b == bcVar.mo106987b() && this.f346102c == bcVar.mo106986a();
        }
    }

    public final int hashCode() {
        return ((this.f346101b ^ 1000003) * 1000003) ^ this.f346102c;
    }

    public final String toString() {
        int i = this.f346101b;
        int i2 = this.f346102c;
        return "AlternateSpanMapKey{start=" + i + ", length=" + i2 + "}";
    }
}
