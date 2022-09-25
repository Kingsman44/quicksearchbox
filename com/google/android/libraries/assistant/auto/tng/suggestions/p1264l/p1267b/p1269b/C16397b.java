package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1269b;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.b */
/* compiled from: PG */
final class C16397b extends C16407l {

    /* renamed from: a */
    public final float f48257a;

    /* renamed from: b */
    public final float f48258b;

    /* renamed from: c */
    public final float f48259c;

    /* renamed from: d */
    public final long f48260d;

    /* renamed from: e */
    public final C58495hd f48261e;

    public C16397b(float f, float f2, float f3, long j, C58495hd hdVar) {
        this.f48257a = f;
        this.f48258b = f2;
        this.f48259c = f3;
        this.f48260d = j;
        this.f48261e = hdVar;
    }

    /* renamed from: a */
    public final float mo22906a() {
        return this.f48257a;
    }

    /* renamed from: b */
    public final float mo22907b() {
        return this.f48259c;
    }

    /* renamed from: c */
    public final float mo22908c() {
        return this.f48258b;
    }

    /* renamed from: d */
    public final long mo22909d() {
        return this.f48260d;
    }

    /* renamed from: e */
    public final C58495hd mo22910e() {
        return this.f48261e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16407l) {
            C16407l lVar = (C16407l) obj;
            return Float.floatToIntBits(this.f48257a) == Float.floatToIntBits(lVar.mo22906a()) && Float.floatToIntBits(this.f48258b) == Float.floatToIntBits(lVar.mo22908c()) && Float.floatToIntBits(this.f48259c) == Float.floatToIntBits(lVar.mo22907b()) && this.f48260d == lVar.mo22909d() && this.f48261e.equals(lVar.mo22910e());
        }
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f48257a);
        int floatToIntBits2 = Float.floatToIntBits(this.f48258b);
        int floatToIntBits3 = Float.floatToIntBits(this.f48259c);
        long j = this.f48260d;
        return ((((((((floatToIntBits ^ 1000003) * 1000003) ^ floatToIntBits2) * 1000003) ^ floatToIntBits3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ C58758qx.m90643a(this.f48261e.entrySet());
    }

    public final String toString() {
        float f = this.f48257a;
        float f2 = this.f48258b;
        float f3 = this.f48259c;
        long j = this.f48260d;
        String obj = this.f48261e.toString();
        return "HeuristicVerticalRankerParams{ctrWeight=" + f + ", lastShownWeight=" + f2 + ", lastShownLimitMs=" + f3 + ", rankingStartTimeInMs=" + j + ", candidateSuggestionMetricsMap=" + obj + "}";
    }
}
