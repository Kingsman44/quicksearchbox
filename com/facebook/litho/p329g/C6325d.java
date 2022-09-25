package com.facebook.litho.p329g;

/* renamed from: com.facebook.litho.g.d */
/* compiled from: PG */
final class C6325d {

    /* renamed from: a */
    private final int f18710a;

    /* renamed from: b */
    private final int f18711b;

    /* renamed from: c */
    private final int f18712c;

    /* renamed from: d */
    private final int f18713d;

    /* renamed from: e */
    private final int f18714e;

    /* renamed from: f */
    private final int f18715f;

    /* renamed from: g */
    private final int f18716g;

    /* renamed from: h */
    private final int f18717h;

    public C6325d() {
        this.f18710a = 0;
        this.f18711b = 0;
        this.f18712c = 0;
        this.f18713d = 0;
        this.f18714e = 0;
        this.f18715f = 0;
        this.f18716g = 0;
        this.f18717h = 0;
    }

    public C6325d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f18710a = i;
        this.f18711b = i2;
        this.f18712c = i3;
        this.f18713d = i4;
        this.f18714e = i5;
        this.f18715f = i6;
        this.f18716g = i7;
        this.f18717h = i8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6325d mo13332a(C6325d dVar) {
        return new C6325d(this.f18710a + dVar.f18710a, this.f18711b + dVar.f18711b, this.f18712c + dVar.f18712c, this.f18713d + dVar.f18713d, this.f18714e + dVar.f18714e, this.f18715f + dVar.f18715f, this.f18716g + dVar.f18716g, dVar.f18717h + this.f18717h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6325d dVar = (C6325d) obj;
            if (this.f18710a == dVar.f18710a && this.f18711b == dVar.f18711b && this.f18712c == dVar.f18712c && this.f18713d == dVar.f18713d && this.f18714e == dVar.f18714e && this.f18715f == dVar.f18715f && this.f18716g == dVar.f18716g && this.f18717h == dVar.f18717h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.f18710a * 31) + this.f18711b) * 31) + this.f18712c) * 31) + this.f18713d) * 31) + this.f18714e) * 31) + this.f18715f) * 31) + this.f18716g) * 31) + this.f18717h;
    }

    public final String toString() {
        int i = this.f18710a;
        int i2 = this.f18711b;
        int i3 = this.f18712c;
        int i4 = this.f18713d;
        int i5 = this.f18714e;
        int i6 = this.f18715f;
        int i7 = this.f18716g;
        int i8 = this.f18717h;
        return "ChangeSetStats{mEffectiveChangesCount=" + i + ", mInsertSingleCount=" + i2 + ", mInsertRangeCount=" + i3 + ", mDeleteSingleCount=" + i4 + ", mDeleteRangeCount=" + i5 + ", mUpdateSingleCount=" + i6 + ", mUpdateRangeCount=" + i7 + ", mMoveCount=" + i8 + "}";
    }
}
