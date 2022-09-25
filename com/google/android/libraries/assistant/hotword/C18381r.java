package com.google.android.libraries.assistant.hotword;

/* renamed from: com.google.android.libraries.assistant.hotword.r */
/* compiled from: PG */
public final class C18381r {

    /* renamed from: a */
    public int f52173a;

    /* renamed from: b */
    public int f52174b;

    public C18381r(int i, int i2) {
        this.f52173a = i;
        this.f52174b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18381r)) {
            return false;
        }
        C18381r rVar = (C18381r) obj;
        if (this.f52173a == rVar.f52173a && this.f52174b == rVar.f52174b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f52173a * 31) + this.f52174b;
    }
}
