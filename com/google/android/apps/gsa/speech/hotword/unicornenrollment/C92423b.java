package com.google.android.apps.gsa.speech.hotword.unicornenrollment;

import android.view.View;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;

/* renamed from: com.google.android.apps.gsa.speech.hotword.unicornenrollment.b */
/* compiled from: PG */
final class C92423b extends C92428g {

    /* renamed from: a */
    private final boolean f257768a;

    /* renamed from: b */
    private final String f257769b;

    /* renamed from: c */
    private final String f257770c;

    /* renamed from: d */
    private final String f257771d;

    /* renamed from: e */
    private final String f257772e;

    /* renamed from: f */
    private final EnrollmentHelper f257773f;

    /* renamed from: g */
    private final boolean f257774g;

    /* renamed from: h */
    private final boolean f257775h;

    /* renamed from: i */
    private final boolean f257776i;

    /* renamed from: j */
    private final View.OnClickListener f257777j;

    /* renamed from: k */
    private final C92427f f257778k;

    public C92423b(boolean z, String str, String str2, String str3, String str4, EnrollmentHelper enrollmentHelper, boolean z2, boolean z3, boolean z4, View.OnClickListener onClickListener, C92427f fVar) {
        this.f257768a = z;
        this.f257769b = str;
        this.f257770c = str2;
        this.f257771d = str3;
        this.f257772e = str4;
        this.f257773f = enrollmentHelper;
        this.f257774g = z2;
        this.f257775h = z3;
        this.f257776i = z4;
        this.f257777j = onClickListener;
        this.f257778k = fVar;
    }

    /* renamed from: a */
    public final View.OnClickListener mo87074a() {
        return this.f257777j;
    }

    /* renamed from: b */
    public final EnrollmentHelper mo87075b() {
        return this.f257773f;
    }

    /* renamed from: c */
    public final C92427f mo87076c() {
        return this.f257778k;
    }

    /* renamed from: d */
    public final String mo87077d() {
        return this.f257770c;
    }

    /* renamed from: e */
    public final String mo87078e() {
        return this.f257769b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92428g) {
            C92428g gVar = (C92428g) obj;
            return this.f257768a == gVar.mo87086k() && this.f257769b.equals(gVar.mo87078e()) && this.f257770c.equals(gVar.mo87077d()) && this.f257771d.equals(gVar.mo87080f()) && this.f257772e.equals(gVar.mo87081g()) && this.f257773f.equals(gVar.mo87075b()) && this.f257774g == gVar.mo87085j() && this.f257775h == gVar.mo87084i() && this.f257776i == gVar.mo87082h() && this.f257777j.equals(gVar.mo87074a()) && this.f257778k.equals(gVar.mo87076c());
        }
    }

    /* renamed from: f */
    public final String mo87080f() {
        return this.f257771d;
    }

    /* renamed from: g */
    public final String mo87081g() {
        return this.f257772e;
    }

    /* renamed from: h */
    public final boolean mo87082h() {
        return this.f257776i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.f257768a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f257769b.hashCode()) * 1000003) ^ this.f257770c.hashCode()) * 1000003) ^ this.f257771d.hashCode()) * 1000003) ^ this.f257772e.hashCode()) * 1000003) ^ this.f257773f.hashCode()) * 1000003) ^ (true != this.f257774g ? 1237 : 1231)) * 1000003) ^ (true != this.f257775h ? 1237 : 1231)) * 1000003;
        if (true == this.f257776i) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f257777j.hashCode()) * 1000003) ^ this.f257778k.hashCode();
    }

    /* renamed from: i */
    public final boolean mo87084i() {
        return this.f257775h;
    }

    /* renamed from: j */
    public final boolean mo87085j() {
        return this.f257774g;
    }

    /* renamed from: k */
    public final boolean mo87086k() {
        return this.f257768a;
    }

    public final String toString() {
        boolean z = this.f257768a;
        String str = this.f257769b;
        String str2 = this.f257770c;
        String str3 = this.f257771d;
        String str4 = this.f257772e;
        String obj = this.f257773f.toString();
        boolean z2 = this.f257774g;
        boolean z3 = this.f257775h;
        boolean z4 = this.f257776i;
        String obj2 = this.f257777j.toString();
        String obj3 = this.f257778k.toString();
        return "ParentReauthScreenViewParams{isVoiceMatchEnrollment=" + z + ", parentEmail=" + str + ", parentDisplayName=" + str2 + ", unicornChildDisplayName=" + str3 + ", unicornChildGender=" + str4 + ", enrollmentHelper=" + obj + ", isUnicornPhoneEnrollment=" + z2 + ", isUnicornHomeEnrollment=" + z3 + ", isInUnicornSetUpWizard=" + z4 + ", declineButtonListener=" + obj2 + ", passwordSubmitListener=" + obj3 + "}";
    }
}
