package com.google.android.apps.search.transcription.p10666b;

/* renamed from: com.google.android.apps.search.transcription.b.d */
/* compiled from: PG */
final class C141745d extends C141743b {

    /* renamed from: a */
    private final int f384727a;

    /* renamed from: b */
    private final int f384728b;

    public C141745d(int i, int i2) {
        this.f384728b = i;
        this.f384727a = i2;
    }

    /* renamed from: a */
    public final int mo116703a() {
        return this.f384727a;
    }

    /* renamed from: d */
    public final int mo116705d() {
        return this.f384728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C141743b) {
            C141743b bVar = (C141743b) obj;
            return this.f384728b == bVar.mo116705d() && this.f384727a == bVar.mo116703a();
        }
    }

    public final int hashCode() {
        return ((this.f384728b ^ 1000003) * 1000003) ^ this.f384727a;
    }

    public final String toString() {
        String num = Integer.toString(this.f384728b - 1);
        int i = this.f384727a;
        return "AppflowStatus{errorType=" + num + ", errorCode=" + i + "}";
    }
}
