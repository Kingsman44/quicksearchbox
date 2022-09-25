package com.google.android.libraries.onegoogle.accountmenu.p2358f;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.f.b */
/* compiled from: PG */
public final class C30489b extends C30491d {

    /* renamed from: a */
    public String f82342a;

    /* renamed from: b */
    public String f82343b;

    /* renamed from: c */
    public String f82344c;

    /* renamed from: d */
    public String f82345d;

    /* renamed from: e */
    public String f82346e;

    /* renamed from: f */
    public String f82347f;

    /* renamed from: g */
    public int f82348g;

    /* renamed from: h */
    private boolean f82349h;

    /* renamed from: i */
    private boolean f82350i;

    /* renamed from: j */
    private boolean f82351j;

    /* renamed from: k */
    private byte f82352k;

    /* renamed from: a */
    public final C30492e mo36109a() {
        String str;
        int i;
        if (this.f82352k == 7 && (str = this.f82343b) != null && (i = this.f82348g) != 0) {
            return new C30490c(this.f82349h, this.f82342a, str, this.f82344c, this.f82345d, this.f82350i, this.f82351j, this.f82346e, this.f82347f, i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f82352k & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if (this.f82343b == null) {
            sb.append(" accountName");
        }
        if ((this.f82352k & 2) == 0) {
            sb.append(" isG1User");
        }
        if ((this.f82352k & 4) == 0) {
            sb.append(" isDasherUser");
        }
        if (this.f82348g == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo36110b(String str) {
        if (str != null) {
            this.f82343b = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: c */
    public final void mo36111c(boolean z) {
        this.f82351j = z;
        this.f82352k = (byte) (this.f82352k | 4);
    }

    /* renamed from: d */
    public final void mo36112d(boolean z) {
        this.f82350i = z;
        this.f82352k = (byte) (this.f82352k | 2);
    }

    /* renamed from: e */
    public final void mo36113e(boolean z) {
        this.f82349h = z;
        this.f82352k = (byte) (this.f82352k | 1);
    }
}
