package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.r */
/* compiled from: PG */
final class C133235r extends C133234q {

    /* renamed from: a */
    private final boolean f363146a;

    /* renamed from: b */
    private final boolean f363147b;

    /* renamed from: c */
    private final String f363148c;

    /* renamed from: d */
    private final boolean f363149d;

    /* renamed from: e */
    private final boolean f363150e;

    /* renamed from: f */
    private final boolean f363151f;

    /* renamed from: g */
    private final boolean f363152g;

    /* renamed from: h */
    private final boolean f363153h;

    /* renamed from: i */
    private final boolean f363154i;

    public C133235r(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f363146a = z;
        this.f363147b = z2;
        if (str != null) {
            this.f363148c = str;
            this.f363149d = z3;
            this.f363150e = z4;
            this.f363151f = z5;
            this.f363152g = z6;
            this.f363153h = z7;
            this.f363154i = z8;
            return;
        }
        throw new NullPointerException("Null customTabsPackageName");
    }

    /* renamed from: a */
    public final String mo111029a() {
        return this.f363148c;
    }

    /* renamed from: b */
    public final boolean mo111030b() {
        return this.f363147b;
    }

    /* renamed from: c */
    public final boolean mo111031c() {
        return this.f363146a;
    }

    /* renamed from: d */
    public final boolean mo111032d() {
        return this.f363150e;
    }

    /* renamed from: e */
    public final boolean mo111033e() {
        return this.f363149d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C133234q) {
            C133234q qVar = (C133234q) obj;
            return this.f363146a == qVar.mo111031c() && this.f363147b == qVar.mo111030b() && this.f363148c.equals(qVar.mo111029a()) && this.f363149d == qVar.mo111033e() && this.f363150e == qVar.mo111032d() && this.f363151f == qVar.mo111034f() && this.f363152g == qVar.mo111037i() && this.f363153h == qVar.mo111035g() && this.f363154i == qVar.mo111036h();
        }
    }

    /* renamed from: f */
    public final boolean mo111034f() {
        return this.f363151f;
    }

    /* renamed from: g */
    public final boolean mo111035g() {
        return this.f363153h;
    }

    /* renamed from: h */
    public final boolean mo111036h() {
        return this.f363154i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.f363146a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f363147b ? 1237 : 1231)) * 1000003) ^ this.f363148c.hashCode()) * 1000003) ^ (true != this.f363149d ? 1237 : 1231)) * 1000003) ^ (true != this.f363150e ? 1237 : 1231)) * 1000003) ^ (true != this.f363151f ? 1237 : 1231)) * 1000003) ^ (true != this.f363152g ? 1237 : 1231)) * 1000003) ^ (true != this.f363153h ? 1237 : 1231)) * 1000003;
        if (true == this.f363154i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo111037i() {
        return this.f363152g;
    }

    public final String toString() {
        boolean z = this.f363146a;
        boolean z2 = this.f363147b;
        String str = this.f363148c;
        boolean z3 = this.f363149d;
        boolean z4 = this.f363150e;
        boolean z5 = this.f363151f;
        boolean z6 = this.f363152g;
        boolean z7 = this.f363153h;
        boolean z8 = this.f363154i;
        return "AccountMenuStateWrapper{isIncognitoAvailable=" + z + ", isChromeIncognitoIntentSupported=" + z2 + ", customTabsPackageName=" + str + ", shouldDisplayIncognitoEducationModal=" + z3 + ", isWebAndAppActivityEnabled=" + z4 + ", shouldDisplayYourContributions=" + z5 + ", shouldShowSearchConsoleInsights=" + z6 + ", shouldShowCumaConsent=" + z7 + ", shouldShowPersonalInfoRemovalButton=" + z8 + "}";
    }
}
