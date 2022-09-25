package com.google.android.libraries.onegoogle.owners;

/* renamed from: com.google.android.libraries.onegoogle.owners.a */
/* compiled from: PG */
public final class C30941a extends C30974i {

    /* renamed from: a */
    public String f83366a;

    /* renamed from: b */
    public String f83367b;

    /* renamed from: c */
    public String f83368c;

    /* renamed from: d */
    public String f83369d;

    /* renamed from: e */
    public String f83370e;

    /* renamed from: f */
    public String f83371f;

    /* renamed from: g */
    public int f83372g;

    /* renamed from: h */
    public int f83373h;

    /* renamed from: i */
    private String f83374i;

    /* renamed from: j */
    private boolean f83375j;

    /* renamed from: k */
    private boolean f83376k;

    /* renamed from: l */
    private boolean f83377l;

    /* renamed from: m */
    private byte f83378m;

    /* renamed from: a */
    public final C30976k mo36617a() {
        String str;
        int i;
        int i2;
        if (this.f83378m == 7 && (str = this.f83374i) != null && (i = this.f83373h) != 0 && (i2 = this.f83372g) != 0) {
            return new C30961b(str, this.f83375j, this.f83366a, this.f83367b, this.f83368c, this.f83369d, this.f83376k, this.f83377l, i, this.f83370e, this.f83371f, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f83374i == null) {
            sb.append(" accountName");
        }
        if ((this.f83378m & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if ((this.f83378m & 2) == 0) {
            sb.append(" isG1User");
        }
        if ((this.f83378m & 4) == 0) {
            sb.append(" isDasherUser");
        }
        if (this.f83373h == 0) {
            sb.append(" isUnicornUser");
        }
        if (this.f83372g == 0) {
            sb.append(" ageRange");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo36618b(String str) {
        if (str != null) {
            this.f83374i = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: c */
    public final void mo36619c(String str) {
        this.f83370e = str;
    }

    /* renamed from: d */
    public final void mo36620d(String str) {
        this.f83366a = str;
    }

    /* renamed from: e */
    public final void mo36621e(String str) {
        this.f83368c = str;
    }

    /* renamed from: f */
    public final void mo36622f(String str) {
        this.f83367b = str;
    }

    /* renamed from: g */
    public final void mo36623g(boolean z) {
        this.f83377l = z;
        this.f83378m = (byte) (this.f83378m | 4);
    }

    /* renamed from: h */
    public final void mo36624h(boolean z) {
        this.f83376k = z;
        this.f83378m = (byte) (this.f83378m | 2);
    }

    /* renamed from: i */
    public final void mo36625i(boolean z) {
        this.f83375j = z;
        this.f83378m = (byte) (this.f83378m | 1);
    }

    /* renamed from: j */
    public final void mo36626j(String str) {
        this.f83369d = str;
    }
}
