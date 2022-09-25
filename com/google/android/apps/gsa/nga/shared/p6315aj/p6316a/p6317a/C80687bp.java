package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bp */
/* compiled from: PG */
final class C80687bp extends C80787fh {

    /* renamed from: a */
    private final C58485gu f221534a;

    /* renamed from: b */
    private final String f221535b;

    /* renamed from: c */
    private final String f221536c;

    public C80687bp(C58485gu guVar, String str, String str2) {
        this.f221534a = guVar;
        this.f221535b = str;
        this.f221536c = str2;
    }

    /* renamed from: a */
    public final C58485gu mo74593a() {
        return this.f221534a;
    }

    /* renamed from: b */
    public final String mo74594b() {
        return this.f221535b;
    }

    /* renamed from: c */
    public final String mo74595c() {
        return this.f221536c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f221536c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.nga.shared.aj.a.a.fh r5 = (com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh) r5
            com.google.common.b.gu r1 = r4.f221534a
            com.google.common.b.gu r3 = r5.mo74593a()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.f221535b
            java.lang.String r3 = r5.mo74594b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.f221536c
            if (r1 != 0) goto L_0x002e
            java.lang.String r5 = r5.mo74595c()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            java.lang.String r5 = r5.mo74595c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80687bp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f221534a.hashCode() ^ 1000003) * 1000003) ^ this.f221535b.hashCode()) * 1000003;
        String str = this.f221536c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f221534a.toString();
        String str = this.f221535b;
        String str2 = this.f221536c;
        return "SuggestionChips{chips=" + obj + ", headerText=" + str + ", veParentId=" + str2 + "}";
    }
}
