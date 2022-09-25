package com.google.android.libraries.search.assistant.fluidactions.p2538b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.b.b */
/* compiled from: PG */
final class C32949b extends C32951d {

    /* renamed from: a */
    public final C58485gu f88275a;

    /* renamed from: b */
    public final C58485gu f88276b;

    /* renamed from: c */
    public final C58485gu f88277c;

    /* renamed from: d */
    public final C58485gu f88278d;

    /* renamed from: e */
    public final C58485gu f88279e;

    /* renamed from: f */
    public final boolean f88280f;

    /* renamed from: g */
    public final boolean f88281g;

    /* renamed from: h */
    public final boolean f88282h;

    public C32949b(C58485gu guVar, C58485gu guVar2, C58485gu guVar3, C58485gu guVar4, C58485gu guVar5, boolean z, boolean z2, boolean z3) {
        this.f88275a = guVar;
        this.f88276b = guVar2;
        this.f88277c = guVar3;
        this.f88278d = guVar4;
        this.f88279e = guVar5;
        this.f88280f = z;
        this.f88281g = z2;
        this.f88282h = z3;
    }

    /* renamed from: a */
    public final int mo38369a() {
        return 0;
    }

    /* renamed from: b */
    public final C32950c mo38370b() {
        return new C32946a(this);
    }

    /* renamed from: c */
    public final C58485gu mo38371c() {
        return this.f88275a;
    }

    /* renamed from: d */
    public final C58485gu mo38372d() {
        return this.f88276b;
    }

    /* renamed from: e */
    public final C58485gu mo38373e() {
        return this.f88278d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32951d) {
            C32951d dVar = (C32951d) obj;
            return C58597ky.m90218i(this.f88275a, dVar.mo38371c()) && C58597ky.m90218i(this.f88276b, dVar.mo38372d()) && C58597ky.m90218i(this.f88277c, dVar.mo38375f()) && C58597ky.m90218i(this.f88278d, dVar.mo38373e()) && C58597ky.m90218i(this.f88279e, dVar.mo38376g()) && !dVar.mo38384n() && this.f88280f == dVar.mo38394w() && !dVar.mo38392u() && !dVar.mo38382l() && !dVar.mo38381k() && this.f88281g == dVar.mo38379i() && this.f88282h == dVar.mo38387q() && !dVar.mo38385o() && !dVar.mo38389s() && !dVar.mo38386p() && !dVar.mo38380j() && dVar.mo38369a() == 0 && !dVar.mo38393v() && !dVar.mo38388r() && !dVar.mo38377h() && !dVar.mo38390t() && !dVar.mo38383m();
        }
    }

    /* renamed from: f */
    public final C58485gu mo38375f() {
        return this.f88277c;
    }

    /* renamed from: g */
    public final C58485gu mo38376g() {
        return this.f88279e;
    }

    /* renamed from: h */
    public final boolean mo38377h() {
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((((((this.f88275a.hashCode() ^ 1000003) * 1000003) ^ this.f88276b.hashCode()) * 1000003) ^ this.f88277c.hashCode()) * 1000003) ^ this.f88278d.hashCode()) * 1000003) ^ this.f88279e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (true != this.f88280f ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.f88281g ? 1237 : 1231)) * 1000003;
        if (true != this.f88282h) {
            i = 1237;
        }
        return ((((((((((((((((((hashCode ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * -721379959) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final boolean mo38379i() {
        return this.f88281g;
    }

    /* renamed from: j */
    public final boolean mo38380j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo38381k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo38382l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo38383m() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo38384n() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo38385o() {
        return false;
    }

    /* renamed from: p */
    public final boolean mo38386p() {
        return false;
    }

    /* renamed from: q */
    public final boolean mo38387q() {
        return this.f88282h;
    }

    /* renamed from: r */
    public final boolean mo38388r() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo38389s() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo38390t() {
        return false;
    }

    public final String toString() {
        String obj = this.f88275a.toString();
        String obj2 = this.f88276b.toString();
        String obj3 = this.f88277c.toString();
        String obj4 = this.f88278d.toString();
        String obj5 = this.f88279e.toString();
        boolean z = this.f88280f;
        boolean z2 = this.f88281g;
        boolean z3 = this.f88282h;
        return "FluidActionsConfig{composeAndCompleteMessageInAppPackageAllowlist=" + obj + ", contactRetrievalProviderInfo=" + obj2 + ", contactRetrievalProviderInfoCall=" + obj3 + ", contactRetrievalProviderInfoAudio=" + obj4 + ", contactRetrievalProviderInfoSharing=" + obj5 + ", enableCallFeatureOnDis=false, ngaUiEnabled=" + z + ", enableSameContactNameFromMultipleAccountsDisambiguation=false, enableAumInContactSelection=false, enableAumInContactLookup=false, enable3pContactLookup=" + z2 + ", enableContactLookupFromDialogIntentState=" + z3 + ", enableCommsAppActionsSupport=false, enableMessageFeatureOnDis=false, enableComposeAndCompleteMessageInApp=false, enableAppControlStartDictationWithCoreDismissAssistant=false, maxTopContactsNumber=0, enableSendAudioMessageWithTranscription=false, enableLoggingMessageDiff=false, disableDictationWithoutFluidActionsData=false, enableRainbowTestThemeInFluidActions=false, enableBeaconTheme=false}";
    }

    /* renamed from: u */
    public final boolean mo38392u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo38393v() {
        return false;
    }

    /* renamed from: w */
    public final boolean mo38394w() {
        return this.f88280f;
    }
}
