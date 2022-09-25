package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.social.populous.$AutoValue_PersonMetadata  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_PersonMetadata extends PersonMetadata {

    /* renamed from: a */
    public final String f110332a;

    /* renamed from: b */
    public final IdentityInfo f110333b;

    /* renamed from: c */
    public final C58528ij f110334c;

    /* renamed from: d */
    public final int f110335d;

    public C$AutoValue_PersonMetadata(String str, IdentityInfo identityInfo, int i, C58528ij ijVar) {
        this.f110332a = str;
        this.f110333b = identityInfo;
        if (i != 0) {
            this.f110335d = i;
            this.f110334c = ijVar;
            return;
        }
        throw new NullPointerException("Null autocompletionType");
    }

    /* renamed from: a */
    public final IdentityInfo mo44797a() {
        return this.f110333b;
    }

    /* renamed from: b */
    public final C58528ij mo44798b() {
        return this.f110334c;
    }

    /* renamed from: c */
    public final String mo44799c() {
        return this.f110332a;
    }

    /* renamed from: d */
    public final int mo44800d() {
        return this.f110335d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r4.f110334c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.PersonMetadata
            r2 = 0
            if (r1 == 0) goto L_0x0054
            com.google.android.libraries.social.populous.PersonMetadata r5 = (com.google.android.libraries.social.populous.PersonMetadata) r5
            java.lang.String r1 = r4.f110332a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo44799c()
            if (r1 != 0) goto L_0x0054
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo44799c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0054
        L_0x0020:
            com.google.android.libraries.social.populous.IdentityInfo r1 = r4.f110333b
            if (r1 != 0) goto L_0x002b
            com.google.android.libraries.social.populous.IdentityInfo r1 = r5.mo44797a()
            if (r1 != 0) goto L_0x0054
            goto L_0x0035
        L_0x002b:
            com.google.android.libraries.social.populous.IdentityInfo r3 = r5.mo44797a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0054
        L_0x0035:
            int r1 = r4.f110335d
            int r3 = r5.mo44800d()
            if (r1 != r3) goto L_0x0054
            com.google.common.b.ij r1 = r4.f110334c
            if (r1 != 0) goto L_0x0048
            com.google.common.b.ij r5 = r5.mo44798b()
            if (r5 != 0) goto L_0x0054
            goto L_0x0053
        L_0x0048:
            com.google.common.b.ij r5 = r5.mo44798b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            return r0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.C$AutoValue_PersonMetadata.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String str = this.f110332a;
        String valueOf = String.valueOf(this.f110333b);
        int i = this.f110335d;
        String str2 = i != 1 ? i != 2 ? "GOOGLE_GROUP" : "PERSON" : "UNSPECIFIED";
        String valueOf2 = String.valueOf(this.f110334c);
        return "PersonMetadata{ownerId=" + str + ", identityInfo=" + valueOf + ", autocompletionType=" + str2 + ", provenances=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f110332a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        IdentityInfo identityInfo = this.f110333b;
        if (identityInfo == null) {
            i2 = 0;
        } else {
            i2 = identityInfo.hashCode();
        }
        int i5 = (((i4 ^ i2) * 1000003) ^ this.f110335d) * 1000003;
        C58528ij ijVar = this.f110334c;
        if (ijVar != null) {
            i3 = ijVar.hashCode();
        }
        return i5 ^ i3;
    }
}
