package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ax */
/* compiled from: PG */
public final class C82322ax extends C82552jk {

    /* renamed from: a */
    public String f224882a;

    /* renamed from: b */
    public String f224883b;

    /* renamed from: c */
    private int f224884c;

    /* renamed from: d */
    private int f224885d;

    /* renamed from: e */
    private byte f224886e;

    /* renamed from: a */
    public final C82553jl mo75700a() {
        String str;
        String str2;
        if (this.f224886e == 3 && (str = this.f224882a) != null && (str2 = this.f224883b) != null) {
            return new C82323ay(str, this.f224884c, str2, this.f224885d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224882a == null) {
            sb.append(" token");
        }
        if ((this.f224886e & 1) == 0) {
            sb.append(" groupId");
        }
        if (this.f224883b == null) {
            sb.append(" status");
        }
        if ((this.f224886e & 2) == 0) {
            sb.append(" grpcError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75701b(int i) {
        this.f224884c = i;
        this.f224886e = (byte) (this.f224886e | 1);
    }

    /* renamed from: c */
    public final void mo75702c(int i) {
        this.f224885d = i;
        this.f224886e = (byte) (this.f224886e | 2);
    }
}
