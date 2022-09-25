package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.d */
/* compiled from: PG */
final class C16155d extends C16077ac {

    /* renamed from: a */
    public final String f47648a;

    /* renamed from: b */
    public final long f47649b;

    /* renamed from: c */
    public final long f47650c;

    /* renamed from: d */
    public final long f47651d;

    /* renamed from: e */
    public final long f47652e;

    /* renamed from: f */
    public final long f47653f;

    /* renamed from: g */
    public final long f47654g;

    /* renamed from: h */
    public final long f47655h;

    public C16155d(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f47648a = str;
        this.f47649b = j;
        this.f47650c = j2;
        this.f47651d = j3;
        this.f47652e = j4;
        this.f47653f = j5;
        this.f47654g = j6;
        this.f47655h = j7;
    }

    /* renamed from: a */
    public final long mo22697a() {
        return this.f47649b;
    }

    /* renamed from: b */
    public final long mo22698b() {
        return this.f47654g;
    }

    /* renamed from: c */
    public final long mo22699c() {
        return this.f47653f;
    }

    /* renamed from: d */
    public final long mo22700d() {
        return this.f47651d;
    }

    /* renamed from: e */
    public final long mo22701e() {
        return this.f47655h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16077ac) {
            C16077ac acVar = (C16077ac) obj;
            return this.f47648a.equals(acVar.mo22705i()) && this.f47649b == acVar.mo22697a() && this.f47650c == acVar.mo22703g() && this.f47651d == acVar.mo22700d() && this.f47652e == acVar.mo22702f() && this.f47653f == acVar.mo22699c() && this.f47654g == acVar.mo22698b() && this.f47655h == acVar.mo22701e();
        }
    }

    /* renamed from: f */
    public final long mo22702f() {
        return this.f47652e;
    }

    /* renamed from: g */
    public final long mo22703g() {
        return this.f47650c;
    }

    /* renamed from: h */
    public final C16076ab mo22704h() {
        return new C16128c(this);
    }

    public final int hashCode() {
        int hashCode = this.f47648a.hashCode();
        long j = this.f47649b;
        long j2 = this.f47650c;
        long j3 = this.f47651d;
        long j4 = this.f47652e;
        long j5 = this.f47653f;
        long j6 = this.f47654g;
        long j7 = this.f47655h;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7));
    }

    /* renamed from: i */
    public final String mo22705i() {
        return this.f47648a;
    }

    public final String toString() {
        String str = this.f47648a;
        long j = this.f47649b;
        long j2 = this.f47650c;
        long j3 = this.f47651d;
        long j4 = this.f47652e;
        long j5 = this.f47653f;
        long j6 = this.f47654g;
        return "CandidateSuggestionMetrics{candidateSuggestionId=" + str + ", clickCount=" + j + ", showCount=" + j2 + ", lastClickTimestamp=" + j3 + ", lastShowTimestamp=" + j4 + ", lastClearedTimestamp=" + j5 + ", dismissalCount=" + j6 + ", lastDismissalTimestamp=" + this.f47655h + "}";
    }
}
