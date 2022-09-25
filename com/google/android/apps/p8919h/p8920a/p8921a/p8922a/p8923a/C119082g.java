package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

/* renamed from: com.google.android.apps.h.a.a.a.a.g */
/* compiled from: PG */
final class C119082g extends C119091p {

    /* renamed from: a */
    public final int f332198a;

    /* renamed from: b */
    public final int f332199b;

    /* renamed from: c */
    public final long f332200c;

    /* renamed from: d */
    public final long f332201d;

    /* renamed from: e */
    public final int f332202e;

    /* renamed from: f */
    public final int f332203f;

    public C119082g(int i, int i2, long j, long j2, int i3, int i4) {
        this.f332198a = i;
        this.f332199b = i2;
        this.f332200c = j;
        this.f332201d = j2;
        this.f332202e = i3;
        this.f332203f = i4;
    }

    /* renamed from: a */
    public final int mo104161a() {
        return this.f332199b;
    }

    /* renamed from: b */
    public final int mo104162b() {
        return this.f332203f;
    }

    /* renamed from: c */
    public final int mo104163c() {
        return this.f332198a;
    }

    /* renamed from: d */
    public final int mo104164d() {
        return this.f332202e;
    }

    /* renamed from: e */
    public final long mo104165e() {
        return this.f332201d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119091p) {
            C119091p pVar = (C119091p) obj;
            return this.f332198a == pVar.mo104163c() && this.f332199b == pVar.mo104161a() && this.f332200c == pVar.mo104167f() && this.f332201d == pVar.mo104165e() && this.f332202e == pVar.mo104164d() && this.f332203f == pVar.mo104162b();
        }
    }

    /* renamed from: f */
    public final long mo104167f() {
        return this.f332200c;
    }

    /* renamed from: g */
    public final C119090o mo104168g() {
        return new C119081f(this);
    }

    public final int hashCode() {
        int i = this.f332198a;
        int i2 = this.f332199b;
        long j = this.f332200c;
        long j2 = this.f332201d;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f332202e) * 1000003) ^ this.f332203f;
    }

    public final String toString() {
        int i = this.f332198a;
        int i2 = this.f332199b;
        long j = this.f332200c;
        long j2 = this.f332201d;
        int i3 = this.f332202e;
        int i4 = this.f332203f;
        return "WordTiming{wordStartIndex=" + i + ", wordEndIndex=" + i2 + ", wordStartTimeMillis=" + j + ", wordEndTimeMillis=" + j2 + ", wordStartOffsetInParagraph=" + i3 + ", wordEndOffsetInParagraph=" + i4 + "}";
    }
}
