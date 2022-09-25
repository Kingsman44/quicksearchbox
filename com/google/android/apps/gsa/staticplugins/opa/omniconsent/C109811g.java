package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50359ud;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.g */
/* compiled from: PG */
final class C109811g extends C109799as {

    /* renamed from: a */
    public final C58833ax f306005a;

    /* renamed from: b */
    public final C50359ud f306006b;

    /* renamed from: c */
    public final C58485gu f306007c;

    /* renamed from: d */
    public final boolean f306008d;

    /* renamed from: e */
    public final boolean f306009e;

    /* renamed from: f */
    public final C58833ax f306010f;

    /* renamed from: g */
    public final boolean f306011g;

    /* renamed from: h */
    public final C63088z f306012h;

    /* renamed from: i */
    public final C58833ax f306013i;

    /* renamed from: j */
    public final int f306014j;

    /* renamed from: k */
    public final int f306015k;

    /* renamed from: l */
    public final int f306016l;

    /* renamed from: m */
    public final int f306017m;

    public C109811g(int i, C58833ax axVar, C50359ud udVar, C58485gu guVar, boolean z, boolean z2, int i2, C58833ax axVar2, int i3, boolean z3, C63088z zVar, C58833ax axVar3, int i4) {
        this.f306014j = i;
        this.f306005a = axVar;
        this.f306006b = udVar;
        this.f306007c = guVar;
        this.f306008d = z;
        this.f306009e = z2;
        this.f306015k = i2;
        this.f306010f = axVar2;
        this.f306016l = i3;
        this.f306011g = z3;
        this.f306012h = zVar;
        this.f306013i = axVar3;
        this.f306017m = i4;
    }

    /* renamed from: a */
    public final C50359ud mo98137a() {
        return this.f306006b;
    }

    /* renamed from: b */
    public final C58833ax mo98138b() {
        return this.f306010f;
    }

    /* renamed from: c */
    public final C58833ax mo98139c() {
        return this.f306013i;
    }

    /* renamed from: d */
    public final C58833ax mo98140d() {
        return this.f306005a;
    }

    /* renamed from: e */
    public final C58485gu mo98141e() {
        return this.f306007c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109799as) {
            C109799as asVar = (C109799as) obj;
            return this.f306014j == asVar.mo98148l() && this.f306005a.equals(asVar.mo98140d()) && this.f306006b.equals(asVar.mo98137a()) && C58597ky.m90218i(this.f306007c, asVar.mo98141e()) && this.f306008d == asVar.mo98145i() && this.f306009e == asVar.mo98143g() && this.f306015k == asVar.mo98149m() && this.f306010f.equals(asVar.mo98138b()) && this.f306016l == asVar.mo98146j() && this.f306011g == asVar.mo98144h() && this.f306012h.equals(asVar.mo98142f()) && this.f306013i.equals(asVar.mo98139c()) && this.f306017m == asVar.mo98147k();
        }
    }

    /* renamed from: f */
    public final C63088z mo98142f() {
        return this.f306012h;
    }

    /* renamed from: g */
    public final boolean mo98143g() {
        return this.f306009e;
    }

    /* renamed from: h */
    public final boolean mo98144h() {
        return this.f306011g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((this.f306014j ^ 1000003) * 1000003) ^ this.f306005a.hashCode()) * 1000003) ^ this.f306006b.hashCode()) * 1000003) ^ this.f306007c.hashCode()) * 1000003) ^ (true != this.f306008d ? 1237 : 1231)) * 1000003) ^ (true != this.f306009e ? 1237 : 1231)) * 1000003) ^ this.f306015k) * 1000003) ^ this.f306010f.hashCode()) * 1000003) ^ this.f306016l) * 1000003;
        if (true == this.f306011g) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f306012h.hashCode()) * 1000003) ^ this.f306013i.hashCode()) * 1000003) ^ this.f306017m;
    }

    /* renamed from: i */
    public final boolean mo98145i() {
        return this.f306008d;
    }

    /* renamed from: j */
    public final int mo98146j() {
        return this.f306016l;
    }

    /* renamed from: k */
    public final int mo98147k() {
        return this.f306017m;
    }

    /* renamed from: l */
    public final int mo98148l() {
        return this.f306014j;
    }

    /* renamed from: m */
    public final int mo98149m() {
        return this.f306015k;
    }

    public final String toString() {
        String num = Integer.toString(this.f306014j - 1);
        String valueOf = String.valueOf(this.f306005a);
        String obj = this.f306006b.toString();
        String obj2 = this.f306007c.toString();
        boolean z = this.f306008d;
        boolean z2 = this.f306009e;
        String num2 = Integer.toString(this.f306015k - 1);
        String valueOf2 = String.valueOf(this.f306010f);
        String num3 = Integer.toString(this.f306016l - 1);
        boolean z3 = this.f306011g;
        String obj3 = this.f306012h.toString();
        String valueOf3 = String.valueOf(this.f306013i);
        String num4 = Integer.toString(this.f306017m - 1);
        return "UdcSequenceConfig{flowId=" + num + ", valuePropConfig=" + valueOf + ", consentUi=" + obj + ", multiConsentUi=" + obj2 + ", useNeutralButtons=" + z + ", isEligibleForGoogleNow=" + z2 + ", assistantSurface=" + num2 + ", confirmRejectDialog=" + valueOf2 + ", omniconsentScope=" + num3 + ", shouldShowConfirmRejectFragment=" + z3 + ", sessionId=" + obj3 + ", userProfileUrl=" + valueOf3 + ", omniconsentUserType=" + num4 + "}";
    }
}
