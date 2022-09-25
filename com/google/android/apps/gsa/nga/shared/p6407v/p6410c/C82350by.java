package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.by */
/* compiled from: PG */
public final class C82350by extends C82580kl {

    /* renamed from: a */
    public String f224960a;

    /* renamed from: b */
    public String f224961b;

    /* renamed from: c */
    public String f224962c;

    /* renamed from: d */
    public String f224963d;

    /* renamed from: e */
    private boolean f224964e;

    /* renamed from: f */
    private int f224965f;

    /* renamed from: g */
    private byte f224966g;

    /* renamed from: a */
    public final C82581km mo75818a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f224966g == 3 && (str = this.f224960a) != null && (str2 = this.f224961b) != null && (str3 = this.f224962c) != null && (str4 = this.f224963d) != null) {
            return new C82351bz(str, this.f224964e, str2, this.f224965f, str3, str4);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224960a == null) {
            sb.append(" token");
        }
        if ((this.f224966g & 1) == 0) {
            sb.append(" foundApp");
        }
        if (this.f224961b == null) {
            sb.append(" sourceApi");
        }
        if ((this.f224966g & 2) == 0) {
            sb.append(" apiLevel");
        }
        if (this.f224962c == null) {
            sb.append(" errorMessage");
        }
        if (this.f224963d == null) {
            sb.append(" component");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75819b(int i) {
        this.f224965f = i;
        this.f224966g = (byte) (this.f224966g | 2);
    }

    /* renamed from: c */
    public final void mo75820c(boolean z) {
        this.f224964e = z;
        this.f224966g = (byte) (this.f224966g | 1);
    }
}
