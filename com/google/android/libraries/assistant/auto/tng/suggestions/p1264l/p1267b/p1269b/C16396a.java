package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1269b;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.a */
/* compiled from: PG */
final class C16396a extends C16398c {

    /* renamed from: a */
    public final C58495hd f48251a;

    /* renamed from: b */
    public final float f48252b;

    /* renamed from: c */
    public final float f48253c;

    /* renamed from: d */
    public final float f48254d;

    /* renamed from: e */
    public final C58528ij f48255e;

    /* renamed from: f */
    public final float f48256f;

    public C16396a(C58495hd hdVar, float f, float f2, float f3, C58528ij ijVar, float f4) {
        this.f48251a = hdVar;
        this.f48252b = f;
        this.f48253c = f2;
        this.f48254d = f3;
        this.f48255e = ijVar;
        this.f48256f = f4;
    }

    /* renamed from: a */
    public final float mo22897a() {
        return this.f48256f;
    }

    /* renamed from: b */
    public final float mo22898b() {
        return this.f48252b;
    }

    /* renamed from: c */
    public final float mo22899c() {
        return this.f48254d;
    }

    /* renamed from: d */
    public final float mo22900d() {
        return this.f48253c;
    }

    /* renamed from: e */
    public final C58495hd mo22901e() {
        return this.f48251a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16398c) {
            C16398c cVar = (C16398c) obj;
            return C58662ni.m90356o(this.f48251a, cVar.mo22901e()) && Float.floatToIntBits(this.f48252b) == Float.floatToIntBits(cVar.mo22898b()) && Float.floatToIntBits(this.f48253c) == Float.floatToIntBits(cVar.mo22900d()) && Float.floatToIntBits(this.f48254d) == Float.floatToIntBits(cVar.mo22899c()) && this.f48255e.equals(cVar.mo22903f()) && Float.floatToIntBits(this.f48256f) == Float.floatToIntBits(cVar.mo22897a());
        }
    }

    /* renamed from: f */
    public final C58528ij mo22903f() {
        return this.f48255e;
    }

    public final int hashCode() {
        return ((((((((((C58758qx.m90643a(this.f48251a.entrySet()) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f48252b)) * 1000003) ^ Float.floatToIntBits(this.f48253c)) * 1000003) ^ Float.floatToIntBits(this.f48254d)) * 1000003) ^ this.f48255e.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f48256f);
    }

    public final String toString() {
        String i = C58662ni.m90350i(this.f48251a);
        float f = this.f48252b;
        float f2 = this.f48253c;
        float f3 = this.f48254d;
        String obj = this.f48255e.toString();
        float f4 = this.f48256f;
        return "HeuristicRankerConfig{preloadedSuggestionsWeight=" + i + ", ctrWeight=" + f + ", lastShownWeight=" + f2 + ", lastShownLimitMs=" + f3 + ", verticalSet=" + obj + ", bundleWeight=" + f4 + "}";
    }
}
