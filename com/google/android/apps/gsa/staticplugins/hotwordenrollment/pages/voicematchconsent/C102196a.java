package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.a */
/* compiled from: PG */
final class C102196a extends C102212l {

    /* renamed from: A */
    public boolean f285105A;

    /* renamed from: B */
    public boolean f285106B;

    /* renamed from: C */
    public boolean f285107C;

    /* renamed from: D */
    public boolean f285108D;

    /* renamed from: E */
    public boolean f285109E;

    /* renamed from: F */
    public int f285110F;

    /* renamed from: G */
    private CharSequence f285111G;

    /* renamed from: H */
    private CharSequence f285112H;

    /* renamed from: a */
    public int f285113a;

    /* renamed from: b */
    public int f285114b;

    /* renamed from: c */
    public CharSequence f285115c;

    /* renamed from: d */
    public CharSequence f285116d;

    /* renamed from: e */
    public CharSequence f285117e;

    /* renamed from: f */
    public CharSequence f285118f;

    /* renamed from: g */
    public CharSequence f285119g;

    /* renamed from: h */
    public CharSequence f285120h;

    /* renamed from: i */
    public CharSequence f285121i;

    /* renamed from: j */
    public CharSequence f285122j;

    /* renamed from: k */
    public boolean f285123k;

    /* renamed from: l */
    public boolean f285124l;

    /* renamed from: m */
    public boolean f285125m;

    /* renamed from: n */
    public boolean f285126n;

    /* renamed from: o */
    public boolean f285127o;

    /* renamed from: p */
    public boolean f285128p;

    /* renamed from: q */
    public boolean f285129q;

    /* renamed from: r */
    public boolean f285130r;

    /* renamed from: s */
    public boolean f285131s;

    /* renamed from: t */
    public boolean f285132t;

    /* renamed from: u */
    public boolean f285133u;

    /* renamed from: v */
    public boolean f285134v;

    /* renamed from: w */
    public boolean f285135w;

    /* renamed from: x */
    public boolean f285136x;

    /* renamed from: y */
    public boolean f285137y;

    /* renamed from: z */
    public boolean f285138z;

    /* renamed from: a */
    public final C102213m mo92948a() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        if (this.f285110F == 8388607 && (charSequence = this.f285111G) != null && (charSequence2 = this.f285112H) != null && (charSequence3 = this.f285115c) != null && (charSequence4 = this.f285116d) != null && (charSequence5 = this.f285117e) != null && (charSequence6 = this.f285118f) != null && (charSequence7 = this.f285119g) != null && (charSequence8 = this.f285120h) != null) {
            return new C102202b(charSequence, charSequence2, this.f285113a, this.f285114b, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, charSequence8, this.f285121i, this.f285122j, this.f285123k, this.f285124l, this.f285125m, this.f285126n, this.f285127o, this.f285128p, this.f285129q, this.f285130r, this.f285131s, this.f285132t, this.f285133u, this.f285134v, this.f285135w, this.f285136x, this.f285137y, this.f285138z, this.f285105A, this.f285106B, this.f285107C, this.f285108D, this.f285109E);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f285111G == null) {
            sb.append(" title");
        }
        if (this.f285112H == null) {
            sb.append(" summary");
        }
        if ((this.f285110F & 1) == 0) {
            sb.append(" acceptLabelId");
        }
        if ((this.f285110F & 2) == 0) {
            sb.append(" declineLabelId");
        }
        if (this.f285115c == null) {
            sb.append(" legalText");
        }
        if (this.f285116d == null) {
            sb.append(" legalPart1TextForUnicorn");
        }
        if (this.f285117e == null) {
            sb.append(" legalPart2TextForUnicorn");
        }
        if (this.f285118f == null) {
            sb.append(" legalPart3TextForUnicorn");
        }
        if (this.f285119g == null) {
            sb.append(" bottomSheetTitle");
        }
        if (this.f285120h == null) {
            sb.append(" bottomSheetMessage");
        }
        if ((this.f285110F & 4) == 0) {
            sb.append(" isUnicornHomeEnrollmentFlow");
        }
        if ((this.f285110F & 8) == 0) {
            sb.append(" shouldShowScrollSpace");
        }
        if ((this.f285110F & 16) == 0) {
            sb.append(" isGoogleHomeEnrollment");
        }
        if ((this.f285110F & 32) == 0) {
            sb.append(" isGoogleHomeOobe");
        }
        if ((this.f285110F & 64) == 0) {
            sb.append(" shouldUseBottomSheet");
        }
        if ((this.f285110F & 128) == 0) {
            sb.append(" isCloudEnrollment");
        }
        if ((this.f285110F & 256) == 0) {
            sb.append(" shouldShowLinkedDevices");
        }
        if ((this.f285110F & 512) == 0) {
            sb.append(" shouldSetMessageMovement");
        }
        if ((this.f285110F & 1024) == 0) {
            sb.append(" shouldLogTiSidConsentStart");
        }
        if ((this.f285110F & 2048) == 0) {
            sb.append(" shouldLogTiSidNgaConsentStart");
        }
        if ((this.f285110F & 4096) == 0) {
            sb.append(" shouldShowAnimation");
        }
        if ((this.f285110F & 8192) == 0) {
            sb.append(" shouldSetUpLegalTextViewWithoutBottomSheet");
        }
        if ((this.f285110F & 16384) == 0) {
            sb.append(" shouldShowLinkedDevicesWithoutBottomSheet");
        }
        if ((this.f285110F & 32768) == 0) {
            sb.append(" shouldIncreaseOpaHotwordTrainingSeenCount");
        }
        if ((this.f285110F & 65536) == 0) {
            sb.append(" shouldUpdateOpaHotwordSettingsWhenDecline");
        }
        if ((this.f285110F & C89885b.S3REQUEST_VALUE) == 0) {
            sb.append(" shouldSetSkipEnrollmentResult");
        }
        if ((this.f285110F & C89885b.HTTP_VALUE) == 0) {
            sb.append(" shouldHandleAcceptForGoogleHomeEnrollment");
        }
        if ((this.f285110F & 524288) == 0) {
            sb.append(" shouldUseSuwUnicornFlow");
        }
        if ((this.f285110F & 1048576) == 0) {
            sb.append(" shouldUseServerStyledConsentView");
        }
        if ((this.f285110F & C89885b.NOW_VALUE) == 0) {
            sb.append(" shouldUseLocalStyledConsentView");
        }
        if ((this.f285110F & 4194304) == 0) {
            sb.append(" shouldShowLocalStyledConsentHeader");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92949b(CharSequence charSequence) {
        if (charSequence != null) {
            this.f285112H = charSequence;
            return;
        }
        throw new NullPointerException("Null summary");
    }

    /* renamed from: c */
    public final void mo92950c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f285111G = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
