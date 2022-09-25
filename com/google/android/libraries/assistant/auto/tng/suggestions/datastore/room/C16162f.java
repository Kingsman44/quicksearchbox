package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16354ba;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.f */
/* compiled from: PG */
final class C16162f extends C16091aq {

    /* renamed from: a */
    private final String f47669a;

    /* renamed from: b */
    private final C16090ap f47670b;

    /* renamed from: c */
    private final int f47671c;

    /* renamed from: d */
    private final float f47672d;

    /* renamed from: e */
    private final float f47673e;

    /* renamed from: f */
    private final int f47674f;

    /* renamed from: g */
    private final int f47675g;

    /* renamed from: h */
    private final long f47676h;

    /* renamed from: i */
    private final C16354ba f47677i;

    public C16162f(String str, C16090ap apVar, int i, float f, float f2, int i2, int i3, long j, C16354ba baVar) {
        this.f47669a = str;
        this.f47670b = apVar;
        this.f47671c = i;
        this.f47672d = f;
        this.f47673e = f2;
        this.f47674f = i2;
        this.f47675g = i3;
        this.f47676h = j;
        this.f47677i = baVar;
    }

    /* renamed from: a */
    public final float mo22727a() {
        return this.f47672d;
    }

    /* renamed from: b */
    public final float mo22728b() {
        return this.f47673e;
    }

    /* renamed from: c */
    public final int mo22729c() {
        return this.f47674f;
    }

    /* renamed from: d */
    public final int mo22730d() {
        return this.f47675g;
    }

    /* renamed from: e */
    public final int mo22731e() {
        return this.f47671c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16091aq) {
            C16091aq aqVar = (C16091aq) obj;
            return this.f47669a.equals(aqVar.mo22735i()) && this.f47670b.equals(aqVar.mo22733g()) && this.f47671c == aqVar.mo22731e() && Float.floatToIntBits(this.f47672d) == Float.floatToIntBits(aqVar.mo22727a()) && Float.floatToIntBits(this.f47673e) == Float.floatToIntBits(aqVar.mo22728b()) && this.f47674f == aqVar.mo22729c() && this.f47675g == aqVar.mo22730d() && this.f47676h == aqVar.mo22732f() && this.f47677i.equals(aqVar.mo22734h());
        }
    }

    /* renamed from: f */
    public final long mo22732f() {
        return this.f47676h;
    }

    /* renamed from: g */
    public final C16090ap mo22733g() {
        return this.f47670b;
    }

    /* renamed from: h */
    public final C16354ba mo22734h() {
        return this.f47677i;
    }

    public final int hashCode() {
        int hashCode = this.f47669a.hashCode();
        int hashCode2 = this.f47670b.hashCode();
        int i = this.f47671c;
        int floatToIntBits = Float.floatToIntBits(this.f47672d);
        int floatToIntBits2 = Float.floatToIntBits(this.f47673e);
        int i2 = this.f47674f;
        int i3 = this.f47675g;
        long j = this.f47676h;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ floatToIntBits) * 1000003) ^ floatToIntBits2) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f47677i.hashCode();
    }

    /* renamed from: i */
    public final String mo22735i() {
        return this.f47669a;
    }

    public final String toString() {
        String str = this.f47669a;
        String obj = this.f47670b.toString();
        int i = this.f47671c;
        float f = this.f47672d;
        float f2 = this.f47673e;
        int i2 = this.f47674f;
        int i3 = this.f47675g;
        long j = this.f47676h;
        String obj2 = this.f47677i.toString();
        return "DisplayInfo{id=" + str + ", displayType=" + obj + ", numSuggestions=" + i + ", length=" + f + ", width=" + f2 + ", fontSize=" + i2 + ", maxDisplayTextLength=" + i3 + ", generationTimestamp=" + j + ", displayMetadata=" + obj2 + "}";
    }
}
