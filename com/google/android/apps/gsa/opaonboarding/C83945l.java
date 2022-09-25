package com.google.android.apps.gsa.opaonboarding;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83925l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opaonboarding.l */
/* compiled from: PG */
final class C83945l extends C83884ar {

    /* renamed from: a */
    private final int f228649a;

    /* renamed from: b */
    private final C58833ax f228650b;

    /* renamed from: c */
    private final boolean f228651c;

    /* renamed from: d */
    private final boolean f228652d;

    /* renamed from: e */
    private final boolean f228653e;

    /* renamed from: f */
    private final C83925l f228654f;

    /* renamed from: g */
    private final boolean f228655g;

    /* renamed from: h */
    private final int f228656h;

    /* renamed from: i */
    private final boolean f228657i;

    /* renamed from: j */
    private final C58833ax f228658j;

    /* renamed from: k */
    private final int f228659k;

    /* renamed from: l */
    private final int f228660l;

    /* renamed from: m */
    private final int f228661m;

    /* renamed from: n */
    private final int f228662n;

    public C83945l(int i, int i2, int i3, C58833ax axVar, int i4, boolean z, boolean z2, boolean z3, C83925l lVar, boolean z4, int i5, boolean z5, C58833ax axVar2, int i6) {
        this.f228659k = i;
        this.f228660l = i2;
        this.f228649a = i3;
        this.f228650b = axVar;
        this.f228661m = i4;
        this.f228651c = z;
        this.f228652d = z2;
        this.f228653e = z3;
        this.f228654f = lVar;
        this.f228655g = z4;
        this.f228656h = i5;
        this.f228657i = z5;
        this.f228658j = axVar2;
        this.f228662n = i6;
    }

    /* renamed from: a */
    public final int mo77256a() {
        return this.f228656h;
    }

    /* renamed from: b */
    public final int mo77257b() {
        return this.f228649a;
    }

    /* renamed from: c */
    public final C83925l mo77258c() {
        return this.f228654f;
    }

    /* renamed from: d */
    public final C58833ax mo77259d() {
        return this.f228658j;
    }

    /* renamed from: e */
    public final C58833ax mo77260e() {
        return this.f228650b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83884ar) {
            C83884ar arVar = (C83884ar) obj;
            return this.f228659k == arVar.mo77266k() && this.f228660l == arVar.mo77268m() && this.f228649a == arVar.mo77257b() && this.f228650b.equals(arVar.mo77260e()) && this.f228661m == arVar.mo77269n() && this.f228651c == arVar.mo77265j() && this.f228652d == arVar.mo77264i() && this.f228653e == arVar.mo77263h() && this.f228654f.equals(arVar.mo77258c()) && this.f228655g == arVar.mo77262g() && this.f228656h == arVar.mo77256a() && this.f228657i == arVar.mo77261f() && this.f228658j.equals(arVar.mo77259d()) && this.f228662n == arVar.mo77267l();
        }
    }

    /* renamed from: f */
    public final boolean mo77261f() {
        return this.f228657i;
    }

    /* renamed from: g */
    public final boolean mo77262g() {
        return this.f228655g;
    }

    /* renamed from: h */
    public final boolean mo77263h() {
        return this.f228653e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((this.f228659k ^ 1000003) * 1000003) ^ this.f228660l) * 1000003) ^ this.f228649a) * 1000003) ^ this.f228650b.hashCode()) * 1000003) ^ this.f228661m) * 1000003) ^ (true != this.f228651c ? 1237 : 1231)) * 1000003) ^ (true != this.f228652d ? 1237 : 1231)) * 1000003) ^ (true != this.f228653e ? 1237 : 1231)) * 1000003) ^ this.f228654f.hashCode()) * 1000003) ^ (true != this.f228655g ? 1237 : 1231)) * 1000003) ^ this.f228656h) * 1000003;
        if (true == this.f228657i) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f228658j.hashCode()) * 1000003) ^ this.f228662n;
    }

    /* renamed from: i */
    public final boolean mo77264i() {
        return this.f228652d;
    }

    /* renamed from: j */
    public final boolean mo77265j() {
        return this.f228651c;
    }

    /* renamed from: k */
    public final int mo77266k() {
        return this.f228659k;
    }

    /* renamed from: l */
    public final int mo77267l() {
        return this.f228662n;
    }

    /* renamed from: m */
    public final int mo77268m() {
        return this.f228660l;
    }

    /* renamed from: n */
    public final int mo77269n() {
        return this.f228661m;
    }

    public final String toString() {
        String num = Integer.toString(this.f228659k - 1);
        String num2 = Integer.toString(this.f228660l - 1);
        int i = this.f228649a;
        String valueOf = String.valueOf(this.f228650b);
        String num3 = Integer.toString(this.f228661m - 1);
        boolean z = this.f228651c;
        boolean z2 = this.f228652d;
        boolean z3 = this.f228653e;
        String obj = this.f228654f.toString();
        boolean z4 = this.f228655g;
        int i2 = this.f228656h;
        boolean z5 = this.f228657i;
        String valueOf2 = String.valueOf(this.f228658j);
        String num4 = Integer.toString(this.f228662n - 1);
        return "OmniconsentConfig{omniconsentScope=" + num + ", flowId=" + num2 + ", valuePropId=" + i + ", nativeHeaderTitle=" + valueOf + ", assistantSurface=" + num3 + ", shouldShowValueProp=" + z + ", shouldShowUdc=" + z2 + ", shouldShowDisclosures=" + z3 + ", disclosuresContent=" + obj + ", shouldShowConfirmRejectFragment=" + z4 + ", udcRequired=" + i2 + ", shouldHandlePageLoadErrors=" + z5 + ", confirmRejectDialog=" + valueOf2 + ", omniconsentUserType=" + num4 + "}";
    }
}
