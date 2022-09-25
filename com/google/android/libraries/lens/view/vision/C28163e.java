package com.google.android.libraries.lens.view.vision;

/* renamed from: com.google.android.libraries.lens.view.vision.e */
/* compiled from: PG */
final class C28163e extends C28175q {

    /* renamed from: a */
    private final int f76629a;

    /* renamed from: b */
    private final int f76630b;

    /* renamed from: c */
    private final int f76631c;

    public C28163e(int i, int i2, int i3) {
        this.f76629a = i;
        this.f76630b = i2;
        this.f76631c = i3;
    }

    /* renamed from: a */
    public final int mo33632a() {
        return this.f76631c;
    }

    /* renamed from: b */
    public final int mo33633b() {
        return this.f76630b;
    }

    /* renamed from: c */
    public final int mo33634c() {
        return this.f76629a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28175q) {
            C28175q qVar = (C28175q) obj;
            return this.f76629a == qVar.mo33634c() && this.f76630b == qVar.mo33633b() && this.f76631c == qVar.mo33632a();
        }
    }

    public final int hashCode() {
        return ((((this.f76629a ^ 1000003) * 1000003) ^ this.f76630b) * 1000003) ^ this.f76631c;
    }
}
