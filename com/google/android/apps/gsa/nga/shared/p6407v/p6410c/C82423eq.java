package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eq */
/* compiled from: PG */
final class C82423eq extends C82653nd {

    /* renamed from: a */
    public String f225197a;

    /* renamed from: b */
    private String f225198b;

    /* renamed from: c */
    private boolean f225199c;

    /* renamed from: d */
    private boolean f225200d;

    /* renamed from: e */
    private byte f225201e;

    /* renamed from: a */
    public final C82654ne mo76151a() {
        String str;
        String str2;
        if (this.f225201e == 3 && (str = this.f225197a) != null && (str2 = this.f225198b) != null) {
            return new C82424er(str, str2, this.f225199c, this.f225200d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225197a == null) {
            sb.append(" token");
        }
        if (this.f225198b == null) {
            sb.append(" mobileAssistantExperience");
        }
        if ((this.f225201e & 1) == 0) {
            sb.append(" searchProcessRunning");
        }
        if ((this.f225201e & 2) == 0) {
            sb.append(" success");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76152b(String str) {
        if (str != null) {
            this.f225198b = str;
            return;
        }
        throw new NullPointerException("Null mobileAssistantExperience");
    }

    /* renamed from: c */
    public final void mo76153c(boolean z) {
        this.f225199c = z;
        this.f225201e = (byte) (this.f225201e | 1);
    }

    /* renamed from: d */
    public final void mo76154d(boolean z) {
        this.f225200d = z;
        this.f225201e = (byte) (this.f225201e | 2);
    }
}
