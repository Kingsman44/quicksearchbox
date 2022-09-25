package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bq */
/* compiled from: PG */
public final class C82342bq extends C82572kd {

    /* renamed from: a */
    public String f224936a;

    /* renamed from: b */
    public String f224937b;

    /* renamed from: a */
    public final C82573ke mo75784a() {
        String str;
        String str2 = this.f224936a;
        if (str2 != null && (str = this.f224937b) != null) {
            return new C82343br(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224936a == null) {
            sb.append(" token");
        }
        if (this.f224937b == null) {
            sb.append(" executionPath");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
