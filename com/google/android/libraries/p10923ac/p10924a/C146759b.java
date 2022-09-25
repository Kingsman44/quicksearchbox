package com.google.android.libraries.p10923ac.p10924a;

/* renamed from: com.google.android.libraries.ac.a.b */
/* compiled from: PG */
public final class C146759b extends C146765h {

    /* renamed from: a */
    public final int f396284a;

    /* renamed from: b */
    public final C146768k f396285b;

    /* renamed from: c */
    public final C146768k f396286c;

    /* renamed from: d */
    public final C146768k f396287d;

    /* renamed from: e */
    public final C146768k f396288e;

    /* renamed from: f */
    public final Integer f396289f;

    public C146759b(int i, C146768k kVar, C146768k kVar2, C146768k kVar3, C146768k kVar4, Integer num) {
        this.f396284a = i;
        this.f396285b = kVar;
        this.f396286c = kVar2;
        if (kVar3 != null) {
            this.f396287d = kVar3;
            if (kVar4 != null) {
                this.f396288e = kVar4;
                this.f396289f = num;
                return;
            }
            throw new NullPointerException("Null downSyncWithListenerPolicy");
        }
        throw new NullPointerException("Null downSyncPolicy");
    }

    /* renamed from: a */
    public final int mo123596a() {
        return this.f396284a;
    }

    /* renamed from: b */
    public final C146768k mo123597b() {
        return this.f396287d;
    }

    /* renamed from: c */
    public final C146768k mo123598c() {
        return this.f396288e;
    }

    /* renamed from: d */
    public final C146768k mo123599d() {
        return this.f396285b;
    }

    /* renamed from: e */
    public final C146768k mo123600e() {
        return this.f396286c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = r4.f396289f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10924a.C146765h
            r2 = 0
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.a.h r5 = (com.google.android.libraries.p10923ac.p10924a.C146765h) r5
            int r1 = r4.f396284a
            int r3 = r5.mo123596a()
            if (r1 != r3) goto L_0x0066
            com.google.android.libraries.ac.a.k r1 = r4.f396285b
            com.google.android.libraries.ac.a.k r3 = r5.mo123599d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.a.k r1 = r4.f396286c
            com.google.android.libraries.ac.a.k r3 = r5.mo123600e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.a.k r1 = r4.f396287d
            com.google.android.libraries.ac.a.k r3 = r5.mo123597b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            com.google.android.libraries.ac.a.k r1 = r4.f396288e
            com.google.android.libraries.ac.a.k r3 = r5.mo123598c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            java.lang.Integer r1 = r4.f396289f
            if (r1 != 0) goto L_0x004e
            java.lang.Integer r1 = r5.mo123602f()
            if (r1 != 0) goto L_0x0066
            goto L_0x0059
        L_0x004e:
            java.lang.Integer r3 = r5.mo123602f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0059
            goto L_0x0066
        L_0x0059:
            boolean r1 = r5.mo123603g()
            if (r1 != 0) goto L_0x0066
            boolean r5 = r5.mo123604h()
            if (r5 != 0) goto L_0x0066
            return r0
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10924a.C146759b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo123602f() {
        return this.f396289f;
    }

    /* renamed from: g */
    public final boolean mo123603g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo123604h() {
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f396284a ^ 1000003) * 1000003) ^ this.f396285b.hashCode()) * 1000003) ^ this.f396286c.hashCode()) * 1000003) ^ this.f396287d.hashCode()) * 1000003) ^ this.f396288e.hashCode()) * 1000003;
        Integer num = this.f396289f;
        return ((((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.f396284a;
        String obj = this.f396285b.toString();
        String obj2 = this.f396286c.toString();
        String obj3 = this.f396287d.toString();
        String obj4 = this.f396288e.toString();
        Integer num = this.f396289f;
        return "SyncPolicy{syncType=" + i + ", upSyncPolicy=" + obj + ", upSyncWithListenerPolicy=" + obj2 + ", downSyncPolicy=" + obj3 + ", downSyncWithListenerPolicy=" + obj4 + ", pushPolicyId=" + num + ", requiresPlugged=false, requiresUnmetered=false}";
    }
}
