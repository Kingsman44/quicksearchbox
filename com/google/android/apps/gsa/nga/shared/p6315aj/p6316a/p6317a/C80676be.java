package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.be */
/* compiled from: PG */
public final class C80676be extends C80737dl {

    /* renamed from: a */
    public C80740do f221504a;

    /* renamed from: b */
    public C80738dm f221505b;

    /* renamed from: c */
    public C80742dq f221506c;

    /* renamed from: a */
    public final C80744ds mo74546a() {
        if (this.f221504a != null && this.f221505b != null && this.f221506c != null) {
            return new C80677bf(this.f221504a, this.f221505b, this.f221506c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221504a == null) {
            sb.append(" singleContent");
        }
        if (this.f221505b == null) {
            sb.append(" doubleContent");
        }
        if (this.f221506c == null) {
            sb.append(" topContent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
