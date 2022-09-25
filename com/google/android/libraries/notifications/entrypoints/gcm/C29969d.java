package com.google.android.libraries.notifications.entrypoints.gcm;

/* renamed from: com.google.android.libraries.notifications.entrypoints.gcm.d */
/* compiled from: PG */
public abstract class C29969d {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.notifications.entrypoints.gcm.C29969d m55559f(android.content.Intent r8) {
        /*
            java.lang.String r0 = "casp"
            java.lang.String r6 = r8.getStringExtra(r0)
            java.lang.String r0 = "google.original_priority"
            java.lang.String r0 = r8.getStringExtra(r0)
            int r4 = m55560h(r0)
            java.lang.String r0 = "google.delivered_priority"
            java.lang.String r0 = r8.getStringExtra(r0)
            int r5 = m55560h(r0)
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r8.getStringExtra(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0023:
            r3 = 1
            goto L_0x0068
        L_0x0025:
            int r2 = r0.hashCode()
            r3 = 3
            r7 = 2
            switch(r2) {
                case -2062414158: goto L_0x004d;
                case 102161: goto L_0x0043;
                case 814694033: goto L_0x0039;
                case 814800675: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0057
        L_0x002f:
            java.lang.String r2 = "send_event"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r0 = 2
            goto L_0x0058
        L_0x0039:
            java.lang.String r2 = "send_error"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r0 = 3
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "gcm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r0 = 0
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "deleted_messages"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = -1
        L_0x0058:
            if (r0 == 0) goto L_0x0067
            if (r0 == r1) goto L_0x0068
            if (r0 == r7) goto L_0x0064
            if (r0 == r3) goto L_0x0061
            goto L_0x0023
        L_0x0061:
            r0 = 5
            r3 = 5
            goto L_0x0068
        L_0x0064:
            r0 = 4
            r3 = 4
            goto L_0x0068
        L_0x0067:
            r3 = 2
        L_0x0068:
            java.lang.String r0 = "google.message_id"
            java.lang.String r8 = r8.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r1 != r0) goto L_0x0075
            r8 = 0
        L_0x0075:
            r2 = r8
            com.google.android.libraries.notifications.entrypoints.gcm.a r8 = new com.google.android.libraries.notifications.entrypoints.gcm.a
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.gcm.C29969d.m55559f(android.content.Intent):com.google.android.libraries.notifications.entrypoints.gcm.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m55560h(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r2) goto L_0x001d
            r2 = 3202466(0x30dda2, float:4.48761E-39)
            if (r1 == r2) goto L_0x0013
            goto L_0x0027
        L_0x0013:
            java.lang.String r1 = "high"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x001d:
            java.lang.String r1 = "normal"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = -1
        L_0x0028:
            if (r3 == 0) goto L_0x002f
            if (r3 == r0) goto L_0x002d
            return r0
        L_0x002d:
            r3 = 3
            return r3
        L_0x002f:
            r3 = 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.gcm.C29969d.m55560h(java.lang.String):int");
    }

    /* renamed from: i */
    private static int m55561i(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    public abstract String mo35265a();

    /* renamed from: b */
    public abstract String mo35266b();

    /* renamed from: c */
    public abstract int mo35267c();

    /* renamed from: d */
    public abstract int mo35268d();

    /* renamed from: e */
    public abstract int mo35269e();

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4160bf.p4161a.p4163b.C55441ae mo35273g() {
        /*
            r6 = this;
            com.google.bf.a.b.ae r0 = com.google.p4160bf.p4161a.p4163b.C55441ae.f146268f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bf.a.b.ab r0 = (com.google.p4160bf.p4161a.p4163b.C55438ab) r0
            int r1 = r6.mo35269e()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bf.a.b.ae r2 = (com.google.p4160bf.p4161a.p4163b.C55441ae) r2
            int r1 = m55561i(r1)
            int r1 = r1 + -1
            r2.f146273d = r1
            int r1 = r2.f146270a
            r3 = 4
            r1 = r1 | r3
            r2.f146270a = r1
            int r1 = r6.mo35268d()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bf.a.b.ae r2 = (com.google.p4160bf.p4161a.p4163b.C55441ae) r2
            int r1 = m55561i(r1)
            int r1 = r1 + -1
            r2.f146274e = r1
            int r1 = r2.f146270a
            r1 = r1 | 8
            r2.f146270a = r1
            int r1 = r6.mo35267c()
            r2 = 2
            r4 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r3 = 1
            goto L_0x0055
        L_0x0044:
            int r1 = r1 + -1
            if (r1 == r4) goto L_0x0054
            r5 = 3
            if (r1 == r2) goto L_0x0052
            if (r1 == r5) goto L_0x0055
            if (r1 == r3) goto L_0x0050
            goto L_0x0042
        L_0x0050:
            r3 = 5
            goto L_0x0055
        L_0x0052:
            r3 = 3
            goto L_0x0055
        L_0x0054:
            r3 = 2
        L_0x0055:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bf.a.b.ae r1 = (com.google.p4160bf.p4161a.p4163b.C55441ae) r1
            int r3 = r3 + -1
            r1.f146272c = r3
            int r3 = r1.f146270a
            r2 = r2 | r3
            r1.f146270a = r2
            java.lang.String r1 = r6.mo35266b()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0084
            java.lang.String r1 = r6.mo35266b()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bf.a.b.ae r2 = (com.google.p4160bf.p4161a.p4163b.C55441ae) r2
            r1.getClass()
            int r3 = r2.f146270a
            r3 = r3 | r4
            r2.f146270a = r3
            r2.f146271b = r1
        L_0x0084:
            com.google.protobuf.bv r0 = r0.build()
            com.google.bf.a.b.ae r0 = (com.google.p4160bf.p4161a.p4163b.C55441ae) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.gcm.C29969d.mo35273g():com.google.bf.a.b.ae");
    }
}
