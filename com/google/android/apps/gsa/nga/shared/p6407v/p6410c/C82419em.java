package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.em */
/* compiled from: PG */
public final class C82419em extends C82648mz {

    /* renamed from: a */
    public String f225179a;

    /* renamed from: b */
    public String f225180b;

    /* renamed from: c */
    public String f225181c;

    /* renamed from: d */
    private String f225182d;

    /* renamed from: e */
    private String f225183e;

    /* renamed from: f */
    private boolean f225184f;

    /* renamed from: g */
    private boolean f225185g;

    /* renamed from: h */
    private byte f225186h;

    /* renamed from: a */
    public final C82650na mo76128a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.f225186h == 3 && (str = this.f225179a) != null && (str2 = this.f225182d) != null && (str3 = this.f225180b) != null && (str4 = this.f225183e) != null && (str5 = this.f225181c) != null) {
            return new C82420en(str, str2, str3, str4, this.f225184f, this.f225185g, str5);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225179a == null) {
            sb.append(" token");
        }
        if (this.f225182d == null) {
            sb.append(" resourceGroupName");
        }
        if (this.f225180b == null) {
            sb.append(" stage");
        }
        if (this.f225183e == null) {
            sb.append(" clientFileGroup");
        }
        if ((this.f225186h & 1) == 0) {
            sb.append(" success");
        }
        if ((this.f225186h & 2) == 0) {
            sb.append(" finished");
        }
        if (this.f225181c == null) {
            sb.append(" webrefVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76129b(String str) {
        if (str != null) {
            this.f225183e = str;
            return;
        }
        throw new NullPointerException("Null clientFileGroup");
    }

    /* renamed from: c */
    public final void mo76130c(boolean z) {
        this.f225185g = z;
        this.f225186h = (byte) (this.f225186h | 2);
    }

    /* renamed from: d */
    public final void mo76131d(String str) {
        if (str != null) {
            this.f225182d = str;
            return;
        }
        throw new NullPointerException("Null resourceGroupName");
    }

    /* renamed from: e */
    public final void mo76132e(String str) {
        if (str != null) {
            this.f225180b = str;
            return;
        }
        throw new NullPointerException("Null stage");
    }

    /* renamed from: f */
    public final void mo76133f(boolean z) {
        this.f225184f = z;
        this.f225186h = (byte) (this.f225186h | 1);
    }

    /* renamed from: g */
    public final void mo76134g(String str) {
        if (str != null) {
            this.f225181c = str;
            return;
        }
        throw new NullPointerException("Null webrefVersion");
    }
}
