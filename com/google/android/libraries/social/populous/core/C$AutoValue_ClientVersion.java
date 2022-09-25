package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ClientVersion  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ClientVersion extends ClientVersion {

    /* renamed from: a */
    public final String f110611a;

    /* renamed from: b */
    public final String f110612b;

    /* renamed from: c */
    public final String f110613c;

    /* renamed from: d */
    public final int f110614d;

    public C$AutoValue_ClientVersion(String str, String str2, String str3, int i) {
        if (str != null) {
            this.f110611a = str;
            if (str2 != null) {
                this.f110612b = str2;
                this.f110613c = str3;
                if (i != 0) {
                    this.f110614d = i;
                    return;
                }
                throw new NullPointerException("Null platform");
            }
            throw new NullPointerException("Null clientVersion");
        }
        throw new NullPointerException("Null clientName");
    }

    /* renamed from: a */
    public final String mo44951a() {
        return this.f110611a;
    }

    /* renamed from: b */
    public final String mo44952b() {
        return this.f110612b;
    }

    /* renamed from: c */
    public final String mo44953c() {
        return this.f110613c;
    }

    /* renamed from: d */
    public final int mo44954d() {
        return this.f110614d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f110613c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.ClientVersion
            r2 = 0
            if (r1 == 0) goto L_0x0042
            com.google.android.libraries.social.populous.core.ClientVersion r5 = (com.google.android.libraries.social.populous.core.ClientVersion) r5
            java.lang.String r1 = r4.f110611a
            java.lang.String r3 = r5.mo44951a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r4.f110612b
            java.lang.String r3 = r5.mo44952b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r4.f110613c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo44953c()
            if (r1 != 0) goto L_0x0042
            goto L_0x0039
        L_0x002e:
            java.lang.String r3 = r5.mo44953c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0039
            goto L_0x0042
        L_0x0039:
            int r1 = r4.f110614d
            int r5 = r5.mo44954d()
            if (r1 != r5) goto L_0x0042
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_ClientVersion.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f110611a.hashCode() ^ 1000003) * 1000003) ^ this.f110612b.hashCode()) * 1000003;
        String str = this.f110613c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f110614d;
    }

    public final String toString() {
        String str = this.f110611a;
        String str2 = this.f110612b;
        String str3 = this.f110613c;
        int i = this.f110614d;
        String str4 = i != 1 ? i != 2 ? i != 3 ? "JRE" : "J2CL" : "GWT" : "ANDROID_LIB";
        return "ClientVersion{clientName=" + str + ", clientVersion=" + str2 + ", packageName=" + str3 + ", platform=" + str4 + "}";
    }
}
