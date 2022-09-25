package com.google.android.libraries.lens.view.p2070an;

import android.util.DisplayMetrics;

/* renamed from: com.google.android.libraries.lens.view.an.a */
/* compiled from: PG */
final class C25351a extends C25437i {

    /* renamed from: a */
    private final boolean f69023a;

    /* renamed from: b */
    private final DisplayMetrics f69024b;

    /* renamed from: c */
    private final int f69025c;

    /* renamed from: d */
    private final boolean f69026d;

    /* renamed from: e */
    private final boolean f69027e;

    /* renamed from: f */
    private final boolean f69028f;

    /* renamed from: g */
    private final boolean f69029g;

    /* renamed from: h */
    private final boolean f69030h;

    /* renamed from: i */
    private final boolean f69031i;

    public C25351a(boolean z, DisplayMetrics displayMetrics, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f69023a = z;
        if (displayMetrics != null) {
            this.f69024b = displayMetrics;
            this.f69025c = i;
            this.f69026d = z2;
            this.f69027e = z3;
            this.f69028f = z4;
            this.f69029g = z5;
            this.f69030h = z6;
            this.f69031i = z7;
            return;
        }
        throw new NullPointerException("Null displayMetrics");
    }

    /* renamed from: a */
    public final int mo30377a() {
        return this.f69025c;
    }

    /* renamed from: b */
    public final DisplayMetrics mo30378b() {
        return this.f69024b;
    }

    /* renamed from: c */
    public final boolean mo30379c() {
        return this.f69029g;
    }

    /* renamed from: d */
    public final boolean mo30380d() {
        return this.f69023a;
    }

    /* renamed from: e */
    public final boolean mo30381e() {
        return this.f69030h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25437i) {
            C25437i iVar = (C25437i) obj;
            return this.f69023a == iVar.mo30380d() && this.f69024b.equals(iVar.mo30378b()) && this.f69025c == iVar.mo30377a() && this.f69026d == iVar.mo30385h() && this.f69027e == iVar.mo30383f() && this.f69028f == iVar.mo30384g() && this.f69029g == iVar.mo30379c() && this.f69030h == iVar.mo30381e() && this.f69031i == iVar.mo30387i();
        }
    }

    /* renamed from: f */
    public final boolean mo30383f() {
        return this.f69027e;
    }

    /* renamed from: g */
    public final boolean mo30384g() {
        return this.f69028f;
    }

    /* renamed from: h */
    public final boolean mo30385h() {
        return this.f69026d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.f69023a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f69024b.hashCode()) * 1000003) ^ this.f69025c) * 1000003) ^ (true != this.f69026d ? 1237 : 1231)) * 1000003) ^ (true != this.f69027e ? 1237 : 1231)) * 1000003) ^ (true != this.f69028f ? 1237 : 1231)) * 1000003) ^ (true != this.f69029g ? 1237 : 1231)) * 1000003) ^ (true != this.f69030h ? 1237 : 1231)) * 1000003;
        if (true == this.f69031i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo30387i() {
        return this.f69031i;
    }

    public final String toString() {
        boolean z = this.f69023a;
        String obj = this.f69024b.toString();
        int i = this.f69025c;
        boolean z2 = this.f69026d;
        boolean z3 = this.f69027e;
        boolean z4 = this.f69028f;
        boolean z5 = this.f69029g;
        boolean z6 = this.f69030h;
        boolean z7 = this.f69031i;
        return "LensQueryConfig{isDarkThemeEnabled=" + z + ", displayMetrics=" + obj + ", numberGridColumns=" + i + ", isServerDebugLoggingDisabled=" + z2 + ", isRisQuimbyEnabled=" + z3 + ", isRisQuimbySafeSearchEnabled=" + z4 + ", isArExperienceEnabled=" + z5 + ", isLivingScenesEnabled=" + z6 + ", isStyleAiV1Enabled=" + z7 + "}";
    }
}
