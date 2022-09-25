package com.google.android.apps.gsa.opaonboarding;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.opaonboarding.n */
/* compiled from: PG */
final class C83947n extends C83899be {

    /* renamed from: a */
    private final boolean f228673a;

    /* renamed from: b */
    private final boolean f228674b;

    /* renamed from: c */
    private final C58495hd f228675c;

    /* renamed from: d */
    private final C58485gu f228676d;

    /* renamed from: e */
    private final boolean f228677e;

    /* renamed from: f */
    private final boolean f228678f;

    /* renamed from: g */
    private final boolean f228679g;

    /* renamed from: h */
    private final boolean f228680h;

    /* renamed from: i */
    private final int f228681i;

    public C83947n(boolean z, boolean z2, C58495hd hdVar, C58485gu guVar, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.f228673a = z;
        this.f228674b = z2;
        this.f228675c = hdVar;
        this.f228676d = guVar;
        this.f228677e = z3;
        this.f228678f = z4;
        this.f228679g = z5;
        this.f228680h = z6;
        this.f228681i = i;
    }

    /* renamed from: a */
    public final int mo77294a() {
        return this.f228681i;
    }

    /* renamed from: b */
    public final C58485gu mo77295b() {
        return this.f228676d;
    }

    /* renamed from: c */
    public final C58495hd mo77296c() {
        return this.f228675c;
    }

    /* renamed from: d */
    public final boolean mo77297d() {
        return this.f228679g;
    }

    /* renamed from: e */
    public final boolean mo77298e() {
        return this.f228678f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83899be) {
            C83899be beVar = (C83899be) obj;
            return this.f228673a == beVar.mo77301h() && this.f228674b == beVar.mo77302i() && C58662ni.m90356o(this.f228675c, beVar.mo77296c()) && C58597ky.m90218i(this.f228676d, beVar.mo77295b()) && this.f228677e == beVar.mo77300g() && this.f228678f == beVar.mo77298e() && this.f228679g == beVar.mo77297d() && this.f228680h == beVar.mo77299f() && this.f228681i == beVar.mo77294a();
        }
    }

    /* renamed from: f */
    public final boolean mo77299f() {
        return this.f228680h;
    }

    /* renamed from: g */
    public final boolean mo77300g() {
        return this.f228677e;
    }

    /* renamed from: h */
    public final boolean mo77301h() {
        return this.f228673a;
    }

    public final int hashCode() {
        int i = 1237;
        int a = ((((((((((((((true != this.f228673a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f228674b ? 1237 : 1231)) * 1000003) ^ C58758qx.m90643a(this.f228675c.entrySet())) * 1000003) ^ this.f228676d.hashCode()) * 1000003) ^ (true != this.f228677e ? 1237 : 1231)) * 1000003) ^ (true != this.f228678f ? 1237 : 1231)) * 1000003) ^ (true != this.f228679g ? 1237 : 1231)) * 1000003;
        if (true == this.f228680h) {
            i = 1231;
        }
        return ((a ^ i) * 1000003) ^ this.f228681i;
    }

    /* renamed from: i */
    public final boolean mo77302i() {
        return this.f228674b;
    }

    public final String toString() {
        boolean z = this.f228673a;
        boolean z2 = this.f228674b;
        String i = C58662ni.m90350i(this.f228675c);
        String obj = this.f228676d.toString();
        boolean z3 = this.f228677e;
        boolean z4 = this.f228678f;
        boolean z5 = this.f228679g;
        boolean z6 = this.f228680h;
        int i2 = this.f228681i;
        return "PersonalResultsConfig{showPopupWindow=" + z + ", showPopupWindowVoicematchNotSupported=" + z2 + ", deviceIdToType=" + i + ", deviceIds=" + obj + ", isVoiceMatchSucceeded=" + z3 + ", isAvocadoSucceeded=" + z4 + ", isAvocadoCapable=" + z5 + ", isUnicornFlow=" + z6 + ", flowType=" + i2 + "}";
    }
}
