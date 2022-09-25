package com.google.android.libraries.notifications.entrypoints.gcm;

/* renamed from: com.google.android.libraries.notifications.entrypoints.gcm.a */
/* compiled from: PG */
final class C29966a extends C29969d {

    /* renamed from: a */
    public final String f81125a;

    /* renamed from: b */
    public final int f81126b;

    /* renamed from: c */
    private final String f81127c;

    /* renamed from: d */
    private final int f81128d;

    /* renamed from: e */
    private final int f81129e;

    public C29966a(String str, int i, int i2, int i3, String str2) {
        this.f81127c = str;
        this.f81126b = i;
        this.f81128d = i2;
        this.f81129e = i3;
        this.f81125a = str2;
    }

    /* renamed from: a */
    public final String mo35265a() {
        return this.f81125a;
    }

    /* renamed from: b */
    public final String mo35266b() {
        return this.f81127c;
    }

    /* renamed from: c */
    public final int mo35267c() {
        return this.f81126b;
    }

    /* renamed from: d */
    public final int mo35268d() {
        return this.f81129e;
    }

    /* renamed from: e */
    public final int mo35269e() {
        return this.f81128d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = r4.f81125a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.entrypoints.gcm.C29969d
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.notifications.entrypoints.gcm.d r5 = (com.google.android.libraries.notifications.entrypoints.gcm.C29969d) r5
            java.lang.String r1 = r4.f81127c
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo35266b()
            if (r1 != 0) goto L_0x004f
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo35266b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0020:
            int r1 = r4.f81126b
            int r3 = r5.mo35267c()
            if (r1 != r3) goto L_0x004f
            int r1 = r4.f81128d
            int r3 = r5.mo35269e()
            if (r1 != r3) goto L_0x004f
            int r1 = r4.f81129e
            int r3 = r5.mo35268d()
            if (r1 != r3) goto L_0x004f
            java.lang.String r1 = r4.f81125a
            if (r1 != 0) goto L_0x0043
            java.lang.String r5 = r5.mo35265a()
            if (r5 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0043:
            java.lang.String r5 = r5.mo35265a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.gcm.C29966a.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String str = this.f81127c;
        int i = this.f81126b;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        int i2 = this.f81128d;
        int i3 = this.f81129e;
        String str3 = this.f81125a;
        return "GcmMessage{messageId=" + str + ", messageType=" + str2 + ", priorityOriginal=" + C29968c.m55558a(i2) + ", priorityDelivered=" + C29968c.m55558a(i3) + ", chimePayload=" + str3 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f81127c;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (((((((i ^ 1000003) * 1000003) ^ this.f81126b) * 1000003) ^ this.f81128d) * 1000003) ^ this.f81129e) * 1000003;
        String str2 = this.f81125a;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }
}
