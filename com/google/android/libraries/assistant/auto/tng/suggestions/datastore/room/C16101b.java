package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.b */
/* compiled from: PG */
final class C16101b extends C16170n {

    /* renamed from: a */
    private final String f47580a;

    /* renamed from: b */
    private final String f47581b;

    /* renamed from: c */
    private final String f47582c;

    /* renamed from: d */
    private final String f47583d;

    /* renamed from: e */
    private final C16169m f47584e;

    /* renamed from: f */
    private final Long f47585f;

    /* renamed from: g */
    private final C16333ag f47586g;

    public C16101b(String str, String str2, String str3, String str4, C16169m mVar, Long l, C16333ag agVar) {
        this.f47580a = str;
        this.f47581b = str2;
        this.f47582c = str3;
        this.f47583d = str4;
        this.f47584e = mVar;
        this.f47585f = l;
        this.f47586g = agVar;
    }

    /* renamed from: a */
    public final C16169m mo22746a() {
        return this.f47584e;
    }

    /* renamed from: b */
    public final C16333ag mo22747b() {
        return this.f47586g;
    }

    /* renamed from: c */
    public final Long mo22748c() {
        return this.f47585f;
    }

    /* renamed from: d */
    public final String mo22749d() {
        return this.f47582c;
    }

    /* renamed from: e */
    public final String mo22750e() {
        return this.f47581b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1 = r4.f47585f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f47582c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n
            r2 = 0
            if (r1 == 0) goto L_0x0073
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r5 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n) r5
            java.lang.String r1 = r4.f47580a
            java.lang.String r3 = r5.mo22752f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r4.f47581b
            java.lang.String r3 = r5.mo22750e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r4.f47582c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo22749d()
            if (r1 != 0) goto L_0x0073
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.mo22749d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
        L_0x0038:
            java.lang.String r1 = r4.f47583d
            java.lang.String r3 = r5.mo22753g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r1 = r4.f47584e
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r3 = r5.mo22746a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            java.lang.Long r1 = r4.f47585f
            if (r1 != 0) goto L_0x005b
            java.lang.Long r1 = r5.mo22748c()
            if (r1 != 0) goto L_0x0073
            goto L_0x0066
        L_0x005b:
            java.lang.Long r3 = r5.mo22748c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r1 = r4.f47586g
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r5 = r5.mo22747b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0073
            return r0
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16101b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo22752f() {
        return this.f47580a;
    }

    /* renamed from: g */
    public final String mo22753g() {
        return this.f47583d;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f47580a.hashCode() ^ 1000003) * 1000003) ^ this.f47581b.hashCode()) * 1000003;
        String str = this.f47582c;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.f47583d.hashCode()) * 1000003) ^ this.f47584e.hashCode()) * 1000003;
        Long l = this.f47585f;
        if (l != null) {
            i2 = l.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f47586g.hashCode();
    }
}
