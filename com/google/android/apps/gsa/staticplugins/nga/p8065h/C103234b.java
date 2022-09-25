package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.QuerySpecification;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.b */
/* compiled from: PG */
final class C103234b extends C103210ac {

    /* renamed from: a */
    public String f288004a;

    /* renamed from: b */
    public String f288005b;

    /* renamed from: c */
    public QuerySpecification f288006c;

    /* renamed from: d */
    public String f288007d;

    /* renamed from: a */
    public final C103211ad mo93710a() {
        if (this.f288004a != null && this.f288005b != null && this.f288006c != null && this.f288007d != null) {
            return new C103261c(this.f288004a, this.f288005b, this.f288006c, this.f288007d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f288004a == null) {
            sb.append(" packageName");
        }
        if (this.f288005b == null) {
            sb.append(" corpus");
        }
        if (this.f288006c == null) {
            sb.append(" querySpec");
        }
        if (this.f288007d == null) {
            sb.append(" query");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
