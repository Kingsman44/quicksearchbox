package com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a;

/* renamed from: com.google.android.libraries.ac.b.c.a.b */
/* compiled from: PG */
final class C146795b extends C146800g {

    /* renamed from: a */
    private final int f396345a;

    /* renamed from: b */
    private final C146803j f396346b;

    /* renamed from: c */
    private final C146803j f396347c;

    /* renamed from: d */
    private final C146803j f396348d;

    /* renamed from: e */
    private final C146803j f396349e;

    /* renamed from: f */
    private final Integer f396350f;

    public C146795b(int i, C146803j jVar, C146803j jVar2, C146803j jVar3, C146803j jVar4, Integer num) {
        this.f396345a = i;
        this.f396346b = jVar;
        this.f396347c = jVar2;
        this.f396348d = jVar3;
        this.f396349e = jVar4;
        this.f396350f = num;
    }

    /* renamed from: a */
    public final int mo123647a() {
        return this.f396345a;
    }

    /* renamed from: b */
    public final C146803j mo123648b() {
        return this.f396348d;
    }

    /* renamed from: c */
    public final C146803j mo123649c() {
        return this.f396349e;
    }

    /* renamed from: d */
    public final C146803j mo123650d() {
        return this.f396346b;
    }

    /* renamed from: e */
    public final C146803j mo123651e() {
        return this.f396347c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = r4.f396350f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g
            r2 = 0
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.b.c.a.g r5 = (com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g) r5
            int r1 = r4.f396345a
            int r3 = r5.mo123647a()
            if (r1 != r3) goto L_0x0066
            com.google.android.libraries.ac.b.c.a.j r1 = r4.f396346b
            com.google.android.libraries.ac.b.c.a.j r3 = r5.mo123650d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.b.c.a.j r1 = r4.f396347c
            com.google.android.libraries.ac.b.c.a.j r3 = r5.mo123651e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.b.c.a.j r1 = r4.f396348d
            com.google.android.libraries.ac.b.c.a.j r3 = r5.mo123648b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.b.c.a.j r1 = r4.f396349e
            com.google.android.libraries.ac.b.c.a.j r3 = r5.mo123649c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            java.lang.Integer r1 = r4.f396350f
            if (r1 != 0) goto L_0x004e
            java.lang.Integer r1 = r5.mo123653f()
            if (r1 != 0) goto L_0x0066
            goto L_0x0059
        L_0x004e:
            java.lang.Integer r3 = r5.mo123653f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0059
            goto L_0x0066
        L_0x0059:
            boolean r1 = r5.mo123654g()
            if (r1 != 0) goto L_0x0066
            boolean r5 = r5.mo123655h()
            if (r5 != 0) goto L_0x0066
            return r0
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146795b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo123653f() {
        return this.f396350f;
    }

    /* renamed from: g */
    public final boolean mo123654g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo123655h() {
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f396345a ^ 1000003) * 1000003) ^ this.f396346b.hashCode()) * 1000003) ^ this.f396347c.hashCode()) * 1000003) ^ this.f396348d.hashCode()) * 1000003) ^ this.f396349e.hashCode()) * 1000003;
        Integer num = this.f396350f;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.f396345a;
        String obj = this.f396346b.toString();
        String obj2 = this.f396347c.toString();
        String obj3 = this.f396348d.toString();
        String obj4 = this.f396349e.toString();
        Integer num = this.f396350f;
        return "CoreSyncPolicy{syncType=" + i + ", upSyncPolicy=" + obj + ", upSyncWithListenerPolicy=" + obj2 + ", downSyncPolicy=" + obj3 + ", downSyncWithListenerPolicy=" + obj4 + ", pushPolicyId=" + num + ", requiresCharging=false, requiresUnmetered=false}";
    }
}
