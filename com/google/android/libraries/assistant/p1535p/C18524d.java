package com.google.android.libraries.assistant.p1535p;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.assistant.p.d */
/* compiled from: PG */
final class C18524d extends C18522b {

    /* renamed from: a */
    private final String f52496a;

    /* renamed from: b */
    private final Bundle f52497b;

    /* renamed from: c */
    private final String f52498c;

    /* renamed from: d */
    private final String f52499d;

    public C18524d(String str, Bundle bundle, String str2, String str3) {
        this.f52496a = str;
        this.f52497b = bundle;
        this.f52498c = str2;
        this.f52499d = str3;
    }

    /* renamed from: b */
    public final Bundle mo24032b() {
        return this.f52497b;
    }

    /* renamed from: d */
    public final String mo24033d() {
        return this.f52498c;
    }

    /* renamed from: e */
    public final String mo24034e() {
        return this.f52496a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f52498c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.p1535p.C18522b
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.assistant.p.b r5 = (com.google.android.libraries.assistant.p1535p.C18522b) r5
            java.lang.String r1 = r4.f52496a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo24034e()
            if (r1 != 0) goto L_0x004f
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo24034e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0020:
            android.os.Bundle r1 = r4.f52497b
            android.os.Bundle r3 = r5.mo24032b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r4.f52498c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo24033d()
            if (r1 != 0) goto L_0x004f
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = r5.mo24033d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            java.lang.String r1 = r4.f52499d
            java.lang.String r5 = r5.mo24035f()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x004f
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1535p.C18524d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo24035f() {
        return this.f52499d;
    }

    public final String toString() {
        String str = this.f52496a;
        String obj = this.f52497b.toString();
        String str2 = this.f52498c;
        String str3 = this.f52499d;
        return "AssistantSettingsIntent{feature=" + str + ", featureArguments=" + obj + ", accountName=" + str2 + ", gsaPackageName=" + str3 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f52496a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f52497b.hashCode()) * 1000003;
        String str2 = this.f52498c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode ^ i2) * 1000003) ^ this.f52499d.hashCode();
    }
}
