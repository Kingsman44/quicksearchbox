package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cp */
/* compiled from: PG */
public final class C82368cp extends C82598lc {

    /* renamed from: a */
    public String f225012a;

    /* renamed from: b */
    public String f225013b;

    /* renamed from: c */
    public String f225014c;

    /* renamed from: d */
    public String f225015d;

    /* renamed from: e */
    public String f225016e;

    /* renamed from: f */
    public String f225017f;

    /* renamed from: g */
    public String f225018g;

    /* renamed from: h */
    private int f225019h;

    /* renamed from: i */
    private boolean f225020i;

    /* renamed from: j */
    private byte f225021j;

    /* renamed from: a */
    public final C82599ld mo75887a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (this.f225021j == 3 && (str = this.f225012a) != null && (str2 = this.f225013b) != null && (str3 = this.f225014c) != null && (str4 = this.f225015d) != null && (str5 = this.f225016e) != null && (str6 = this.f225017f) != null && (str7 = this.f225018g) != null) {
            return new C82369cq(str, str2, this.f225019h, str3, str4, str5, this.f225020i, str6, str7);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225012a == null) {
            sb.append(" token");
        }
        if (this.f225013b == null) {
            sb.append(" source");
        }
        if ((this.f225021j & 1) == 0) {
            sb.append(" stage");
        }
        if (this.f225014c == null) {
            sb.append(" speechRecognizer");
        }
        if (this.f225015d == null) {
            sb.append(" voiceMatch");
        }
        if (this.f225016e == null) {
            sb.append(" triggerType");
        }
        if ((this.f225021j & 2) == 0) {
            sb.append(" delegatedToNga");
        }
        if (this.f225017f == null) {
            sb.append(" screenLocked");
        }
        if (this.f225018g == null) {
            sb.append(" pixelFourOrHigher");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75888b(boolean z) {
        this.f225020i = z;
        this.f225021j = (byte) (this.f225021j | 2);
    }

    /* renamed from: c */
    public final void mo75889c(int i) {
        this.f225019h = i;
        this.f225021j = (byte) (this.f225021j | 1);
    }
}
