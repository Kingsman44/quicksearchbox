package com.google.android.libraries.search.assistant.fluidactions.p2538b;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.b.a */
/* compiled from: PG */
public final class C32946a extends C32950c {

    /* renamed from: a */
    public C58485gu f88263a;

    /* renamed from: b */
    public C58485gu f88264b;

    /* renamed from: c */
    public C58485gu f88265c;

    /* renamed from: d */
    public C58485gu f88266d;

    /* renamed from: e */
    public C58485gu f88267e;

    /* renamed from: f */
    public boolean f88268f;

    /* renamed from: g */
    public boolean f88269g;

    /* renamed from: h */
    public int f88270h;

    /* renamed from: i */
    private boolean f88271i;

    public C32946a() {
    }

    public C32946a(C32951d dVar) {
        C32949b bVar = (C32949b) dVar;
        this.f88263a = bVar.f88275a;
        this.f88264b = bVar.f88276b;
        this.f88265c = bVar.f88277c;
        this.f88266d = bVar.f88278d;
        this.f88267e = bVar.f88279e;
        this.f88271i = bVar.f88280f;
        this.f88268f = bVar.f88281g;
        this.f88269g = bVar.f88282h;
        this.f88270h = 131071;
    }

    /* renamed from: a */
    public final C32951d mo38367a() {
        C58485gu guVar;
        C58485gu guVar2;
        C58485gu guVar3;
        C58485gu guVar4;
        C58485gu guVar5;
        if (this.f88270h == 131071 && (guVar = this.f88263a) != null && (guVar2 = this.f88264b) != null && (guVar3 = this.f88265c) != null && (guVar4 = this.f88266d) != null && (guVar5 = this.f88267e) != null) {
            return new C32949b(guVar, guVar2, guVar3, guVar4, guVar5, this.f88271i, this.f88268f, this.f88269g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f88263a == null) {
            sb.append(" composeAndCompleteMessageInAppPackageAllowlist");
        }
        if (this.f88264b == null) {
            sb.append(" contactRetrievalProviderInfo");
        }
        if (this.f88265c == null) {
            sb.append(" contactRetrievalProviderInfoCall");
        }
        if (this.f88266d == null) {
            sb.append(" contactRetrievalProviderInfoAudio");
        }
        if (this.f88267e == null) {
            sb.append(" contactRetrievalProviderInfoSharing");
        }
        if ((this.f88270h & 1) == 0) {
            sb.append(" enableCallFeatureOnDis");
        }
        if ((this.f88270h & 2) == 0) {
            sb.append(" ngaUiEnabled");
        }
        if ((this.f88270h & 4) == 0) {
            sb.append(" enableSameContactNameFromMultipleAccountsDisambiguation");
        }
        if ((this.f88270h & 8) == 0) {
            sb.append(" enableAumInContactSelection");
        }
        if ((this.f88270h & 16) == 0) {
            sb.append(" enableAumInContactLookup");
        }
        if ((this.f88270h & 32) == 0) {
            sb.append(" enable3pContactLookup");
        }
        if ((this.f88270h & 64) == 0) {
            sb.append(" enableContactLookupFromDialogIntentState");
        }
        if ((this.f88270h & 128) == 0) {
            sb.append(" enableCommsAppActionsSupport");
        }
        if ((this.f88270h & 256) == 0) {
            sb.append(" enableMessageFeatureOnDis");
        }
        if ((this.f88270h & 512) == 0) {
            sb.append(" enableComposeAndCompleteMessageInApp");
        }
        if ((this.f88270h & 1024) == 0) {
            sb.append(" enableAppControlStartDictationWithCoreDismissAssistant");
        }
        if ((this.f88270h & 2048) == 0) {
            sb.append(" maxTopContactsNumber");
        }
        if ((this.f88270h & 4096) == 0) {
            sb.append(" enableSendAudioMessageWithTranscription");
        }
        if ((this.f88270h & 8192) == 0) {
            sb.append(" enableLoggingMessageDiff");
        }
        if ((this.f88270h & 16384) == 0) {
            sb.append(" disableDictationWithoutFluidActionsData");
        }
        if ((this.f88270h & 32768) == 0) {
            sb.append(" enableRainbowTestThemeInFluidActions");
        }
        if ((this.f88270h & 65536) == 0) {
            sb.append(" enableBeaconTheme");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo38368b(boolean z) {
        this.f88271i = z;
        this.f88270h |= 2;
    }
}
