package com.google.android.libraries.home.p1940a.p1943c.p1944a;

/* renamed from: com.google.android.libraries.home.a.c.a.ak */
/* compiled from: PG */
public final class C23364ak {

    /* renamed from: a */
    public static final C23364ak f63893a = new C23364ak(16, 9);

    /* renamed from: b */
    private final int f63894b;

    /* renamed from: c */
    private final int f63895c;

    public C23364ak(int i, int i2) {
        this.f63894b = i;
        this.f63895c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23364ak)) {
            return false;
        }
        C23364ak akVar = (C23364ak) obj;
        return this.f63894b == akVar.f63894b && this.f63895c == akVar.f63895c;
    }

    public final int hashCode() {
        return (this.f63894b * 31) + this.f63895c;
    }

    public final String toString() {
        int i = this.f63894b;
        int i2 = this.f63895c;
        return "AspectRatio(width=" + i + ", height=" + i2 + ")";
    }
}
