package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ca */
/* compiled from: PG */
public final class C82353ca extends C82582kn {

    /* renamed from: a */
    public String f224973a;

    /* renamed from: b */
    public String f224974b;

    /* renamed from: c */
    public String f224975c;

    /* renamed from: d */
    private boolean f224976d;

    /* renamed from: e */
    private byte f224977e;

    /* renamed from: a */
    public final C82583ko mo75832a() {
        String str;
        String str2;
        String str3;
        if (this.f224977e == 1 && (str = this.f224973a) != null && (str2 = this.f224974b) != null && (str3 = this.f224975c) != null) {
            return new C82354cb(str, this.f224976d, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224973a == null) {
            sb.append(" token");
        }
        if (this.f224977e == 0) {
            sb.append(" weburiFound");
        }
        if (this.f224974b == null) {
            sb.append(" errorMessage");
        }
        if (this.f224975c == null) {
            sb.append(" component");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75833b(boolean z) {
        this.f224976d = z;
        this.f224977e = 1;
    }
}
