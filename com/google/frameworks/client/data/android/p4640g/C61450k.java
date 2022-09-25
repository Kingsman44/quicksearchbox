package com.google.frameworks.client.data.android.p4640g;

import com.google.frameworks.client.data.android.p4632a.C61333a;

/* renamed from: com.google.frameworks.client.data.android.g.k */
/* compiled from: PG */
final class C61450k extends C61435ai {

    /* renamed from: a */
    private final String f166137a;

    /* renamed from: b */
    private final C61333a f166138b;

    /* renamed from: c */
    private final String f166139c;

    public C61450k(String str, C61333a aVar, String str2) {
        if (str != null) {
            this.f166137a = str;
            this.f166138b = aVar;
            this.f166139c = str2;
            return;
        }
        throw new NullPointerException("Null endpoint");
    }

    /* renamed from: a */
    public final C61333a mo58045a() {
        return this.f166138b;
    }

    /* renamed from: b */
    public final String mo58046b() {
        return this.f166137a;
    }

    /* renamed from: c */
    public final String mo58047c() {
        return this.f166139c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f166138b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.frameworks.client.data.android.p4640g.C61435ai
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.frameworks.client.data.android.g.ai r5 = (com.google.frameworks.client.data.android.p4640g.C61435ai) r5
            java.lang.String r1 = r4.f166137a
            java.lang.String r3 = r5.mo58046b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.frameworks.client.data.android.a.a r1 = r4.f166138b
            if (r1 != 0) goto L_0x0022
            com.google.frameworks.client.data.android.a.a r1 = r5.mo58045a()
            if (r1 != 0) goto L_0x003a
            goto L_0x002d
        L_0x0022:
            com.google.frameworks.client.data.android.a.a r3 = r5.mo58045a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            java.lang.String r1 = r4.f166139c
            java.lang.String r5 = r5.mo58047c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.p4640g.C61450k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f166137a.hashCode() ^ 1000003) * 1000003;
        C61333a aVar = this.f166138b;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f166139c.hashCode();
    }

    public final String toString() {
        String str = this.f166137a;
        String valueOf = String.valueOf(this.f166138b);
        String str2 = this.f166139c;
        return "InterceptorId{endpoint=" + str + ", authContext=" + valueOf + ", methodName=" + str2 + "}";
    }
}
