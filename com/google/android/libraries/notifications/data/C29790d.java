package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.C55683w;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.notifications.data.d */
/* compiled from: PG */
final class C29790d extends C29824o {

    /* renamed from: a */
    public final String f80747a;

    /* renamed from: b */
    public final int f80748b;

    /* renamed from: c */
    public final String f80749c;

    /* renamed from: d */
    public final String f80750d;

    /* renamed from: e */
    public final C55564bq f80751e;

    /* renamed from: f */
    public final C63070h f80752f;

    /* renamed from: g */
    public final String f80753g;

    /* renamed from: h */
    public final C55683w f80754h;

    /* renamed from: i */
    public final C62910ar f80755i;

    /* renamed from: j */
    public final int f80756j;

    public C29790d(String str, int i, int i2, String str2, String str3, C55564bq bqVar, C63070h hVar, String str4, C55683w wVar, C62910ar arVar) {
        this.f80747a = str;
        this.f80756j = i;
        this.f80748b = i2;
        this.f80749c = str2;
        this.f80750d = str3;
        this.f80751e = bqVar;
        this.f80752f = hVar;
        this.f80753g = str4;
        this.f80754h = wVar;
        this.f80755i = arVar;
    }

    /* renamed from: a */
    public final int mo35020a() {
        return this.f80748b;
    }

    /* renamed from: b */
    public final C55683w mo35021b() {
        return this.f80754h;
    }

    /* renamed from: c */
    public final C55564bq mo35022c() {
        return this.f80751e;
    }

    /* renamed from: d */
    public final C63070h mo35023d() {
        return this.f80752f;
    }

    /* renamed from: e */
    public final C62910ar mo35024e() {
        return this.f80755i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r1 = r4.f80752f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.data.C29824o
            r2 = 0
            if (r1 == 0) goto L_0x0086
            com.google.android.libraries.notifications.data.o r5 = (com.google.android.libraries.notifications.data.C29824o) r5
            java.lang.String r1 = r4.f80747a
            java.lang.String r3 = r5.mo35026f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            int r1 = r4.f80756j
            int r3 = r5.mo35032k()
            if (r1 != r3) goto L_0x0086
            int r1 = r4.f80748b
            int r3 = r5.mo35020a()
            if (r1 != r3) goto L_0x0086
            java.lang.String r1 = r4.f80749c
            java.lang.String r3 = r5.mo35028h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = r4.f80750d
            java.lang.String r3 = r5.mo35030i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            com.google.bf.b.a.a.bq r1 = r4.f80751e
            com.google.bf.b.a.a.bq r3 = r5.mo35022c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            com.google.protobuf.h r1 = r4.f80752f
            if (r1 != 0) goto L_0x0056
            com.google.protobuf.h r1 = r5.mo35023d()
            if (r1 != 0) goto L_0x0086
            goto L_0x0061
        L_0x0056:
            com.google.protobuf.h r3 = r5.mo35023d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0061
            goto L_0x0086
        L_0x0061:
            java.lang.String r1 = r4.f80753g
            java.lang.String r3 = r5.mo35027g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            com.google.bf.b.a.w r1 = r4.f80754h
            com.google.bf.b.a.w r3 = r5.mo35021b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0086
            com.google.protobuf.ar r1 = r4.f80755i
            com.google.protobuf.ar r5 = r5.mo35024e()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0086
            return r0
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.C29790d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo35026f() {
        return this.f80747a;
    }

    /* renamed from: g */
    public final String mo35027g() {
        return this.f80753g;
    }

    /* renamed from: h */
    public final String mo35028h() {
        return this.f80749c;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.f80747a.hashCode() ^ 1000003) * 1000003) ^ this.f80756j) * 1000003) ^ this.f80748b) * 1000003) ^ this.f80749c.hashCode()) * 1000003) ^ this.f80750d.hashCode()) * 1000003) ^ this.f80751e.hashCode()) * 1000003;
        C63070h hVar = this.f80752f;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f80753g.hashCode()) * 1000003) ^ this.f80754h.hashCode()) * 1000003) ^ this.f80755i.hashCode();
    }

    /* renamed from: i */
    public final String mo35030i() {
        return this.f80750d;
    }

    /* renamed from: j */
    public final C29789c mo35031j() {
        return new C29789c(this);
    }

    /* renamed from: k */
    public final int mo35032k() {
        return this.f80756j;
    }

    public final String toString() {
        String str = this.f80747a;
        String num = Integer.toString(this.f80756j - 1);
        int i = this.f80748b;
        String str2 = this.f80749c;
        String str3 = this.f80750d;
        String obj = this.f80751e.toString();
        String valueOf = String.valueOf(this.f80752f);
        String str4 = this.f80753g;
        String obj2 = this.f80754h.toString();
        String obj3 = this.f80755i.toString();
        return "ChimeNotificationAction{actionId=" + str + ", builtInActionType=" + num + ", iconResourceId=" + i + ", text=" + str2 + ", url=" + str3 + ", threadStateUpdate=" + obj + ", payload=" + valueOf + ", replyHintText=" + str4 + ", preferenceKey=" + obj2 + ", snoozeDuration=" + obj3 + "}";
    }
}
