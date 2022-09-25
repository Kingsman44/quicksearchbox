package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import com.google.protobuf.C63070h;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.data.h */
/* compiled from: PG */
final class C29794h extends C29827r {

    /* renamed from: a */
    public final String f80782a;

    /* renamed from: b */
    public final Long f80783b;

    /* renamed from: c */
    public final Long f80784c;

    /* renamed from: d */
    public final C55586v f80785d;

    /* renamed from: e */
    public final List f80786e;

    /* renamed from: f */
    public final Long f80787f;

    /* renamed from: g */
    public final String f80788g;

    /* renamed from: h */
    public final C63070h f80789h;

    /* renamed from: i */
    public final String f80790i;

    /* renamed from: j */
    public final String f80791j;

    /* renamed from: k */
    public final Long f80792k;

    /* renamed from: l */
    public final Long f80793l;

    /* renamed from: m */
    public final C55688b f80794m;

    /* renamed from: n */
    public final List f80795n;

    /* renamed from: o */
    public final int f80796o;

    /* renamed from: p */
    public final int f80797p;

    /* renamed from: q */
    public final int f80798q;

    /* renamed from: r */
    public final int f80799r;

    /* renamed from: s */
    public final int f80800s;

    public C29794h(String str, int i, int i2, int i3, int i4, Long l, Long l2, C55586v vVar, List list, Long l3, String str2, C63070h hVar, String str3, String str4, Long l4, Long l5, int i5, C55688b bVar, List list2) {
        this.f80782a = str;
        this.f80796o = i;
        this.f80797p = i2;
        this.f80798q = i3;
        this.f80799r = i4;
        this.f80783b = l;
        this.f80784c = l2;
        this.f80785d = vVar;
        this.f80786e = list;
        this.f80787f = l3;
        this.f80788g = str2;
        this.f80789h = hVar;
        this.f80790i = str3;
        this.f80791j = str4;
        this.f80792k = l4;
        this.f80793l = l5;
        this.f80800s = i5;
        this.f80794m = bVar;
        this.f80795n = list2;
    }

    /* renamed from: a */
    public final C55586v mo35052a() {
        return this.f80785d;
    }

    /* renamed from: b */
    public final C55688b mo35053b() {
        return this.f80794m;
    }

    /* renamed from: c */
    public final C63070h mo35054c() {
        return this.f80789h;
    }

    /* renamed from: d */
    public final Long mo35055d() {
        return this.f80787f;
    }

    /* renamed from: e */
    public final Long mo35056e() {
        return this.f80792k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        r1 = r4.f80788g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r1 = r4.f80789h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r1 = r4.f80790i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r1 = r4.f80794m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.data.C29827r
            r2 = 0
            if (r1 == 0) goto L_0x0101
            com.google.android.libraries.notifications.data.r r5 = (com.google.android.libraries.notifications.data.C29827r) r5
            java.lang.String r1 = r4.f80782a
            java.lang.String r3 = r5.mo35063j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            int r1 = r4.f80796o
            int r3 = r5.mo35070q()
            if (r1 != r3) goto L_0x0101
            int r1 = r4.f80797p
            int r3 = r5.mo35069p()
            if (r1 != r3) goto L_0x0101
            int r1 = r4.f80798q
            int r3 = r5.mo35068o()
            if (r1 != r3) goto L_0x0101
            int r1 = r4.f80799r
            int r3 = r5.mo35072s()
            if (r1 != r3) goto L_0x0101
            java.lang.Long r1 = r4.f80783b
            java.lang.Long r3 = r5.mo35060h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.lang.Long r1 = r4.f80784c
            java.lang.Long r3 = r5.mo35059g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            com.google.bf.b.a.a.v r1 = r4.f80785d
            com.google.bf.b.a.a.v r3 = r5.mo35052a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.util.List r1 = r4.f80786e
            java.util.List r3 = r5.mo35067n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.lang.Long r1 = r4.f80787f
            java.lang.Long r3 = r5.mo35055d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.lang.String r1 = r4.f80788g
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = r5.mo35064k()
            if (r1 != 0) goto L_0x0101
            goto L_0x0088
        L_0x007e:
            java.lang.String r3 = r5.mo35064k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
        L_0x0088:
            com.google.protobuf.h r1 = r4.f80789h
            if (r1 != 0) goto L_0x0093
            com.google.protobuf.h r1 = r5.mo35054c()
            if (r1 != 0) goto L_0x0101
            goto L_0x009d
        L_0x0093:
            com.google.protobuf.h r3 = r5.mo35054c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
        L_0x009d:
            java.lang.String r1 = r4.f80790i
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = r5.mo35065l()
            if (r1 != 0) goto L_0x0101
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = r5.mo35065l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
        L_0x00b2:
            java.lang.String r1 = r4.f80791j
            java.lang.String r3 = r5.mo35062i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.lang.Long r1 = r4.f80792k
            java.lang.Long r3 = r5.mo35056e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            java.lang.Long r1 = r4.f80793l
            java.lang.Long r3 = r5.mo35058f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            int r1 = r4.f80800s
            int r3 = r5.mo35071r()
            if (r1 != r3) goto L_0x0101
            com.google.bf.c.a.a.a.a.b r1 = r4.f80794m
            if (r1 != 0) goto L_0x00e9
            com.google.bf.c.a.a.a.a.b r1 = r5.mo35053b()
            if (r1 != 0) goto L_0x0101
            goto L_0x00f4
        L_0x00e9:
            com.google.bf.c.a.a.a.a.b r3 = r5.mo35053b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f4
            goto L_0x0101
        L_0x00f4:
            java.util.List r1 = r4.f80795n
            java.util.List r5 = r5.mo35066m()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0101
            return r0
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.C29794h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Long mo35058f() {
        return this.f80793l;
    }

    /* renamed from: g */
    public final Long mo35059g() {
        return this.f80784c;
    }

    /* renamed from: h */
    public final Long mo35060h() {
        return this.f80783b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((((((((((this.f80782a.hashCode() ^ 1000003) * 1000003) ^ this.f80796o) * 1000003) ^ this.f80797p) * 1000003) ^ this.f80798q) * 1000003) ^ this.f80799r) * 1000003) ^ this.f80783b.hashCode()) * 1000003) ^ this.f80784c.hashCode()) * 1000003) ^ this.f80785d.hashCode()) * 1000003) ^ this.f80786e.hashCode()) * 1000003) ^ this.f80787f.hashCode()) * 1000003;
        String str = this.f80788g;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (hashCode ^ i) * 1000003;
        C63070h hVar = this.f80789h;
        if (hVar == null) {
            i2 = 0;
        } else {
            i2 = hVar.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str2 = this.f80790i;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int hashCode2 = (((((((((i6 ^ i3) * 1000003) ^ this.f80791j.hashCode()) * 1000003) ^ this.f80792k.hashCode()) * 1000003) ^ this.f80793l.hashCode()) * 1000003) ^ this.f80800s) * 1000003;
        C55688b bVar = this.f80794m;
        if (bVar != null) {
            i4 = bVar.hashCode();
        }
        return ((hashCode2 ^ i4) * 1000003) ^ this.f80795n.hashCode();
    }

    /* renamed from: i */
    public final String mo35062i() {
        return this.f80791j;
    }

    /* renamed from: j */
    public final String mo35063j() {
        return this.f80782a;
    }

    /* renamed from: k */
    public final String mo35064k() {
        return this.f80788g;
    }

    /* renamed from: l */
    public final String mo35065l() {
        return this.f80790i;
    }

    /* renamed from: m */
    public final List mo35066m() {
        return this.f80795n;
    }

    /* renamed from: n */
    public final List mo35067n() {
        return this.f80786e;
    }

    /* renamed from: o */
    public final int mo35068o() {
        return this.f80798q;
    }

    /* renamed from: p */
    public final int mo35069p() {
        return this.f80797p;
    }

    /* renamed from: q */
    public final int mo35070q() {
        return this.f80796o;
    }

    /* renamed from: r */
    public final int mo35071r() {
        return this.f80800s;
    }

    /* renamed from: s */
    public final int mo35072s() {
        return this.f80799r;
    }

    /* renamed from: t */
    public final C29793g mo35073t() {
        return new C29793g(this);
    }

    public final String toString() {
        String str = this.f80782a;
        String num = Integer.toString(this.f80796o - 1);
        String num2 = Integer.toString(this.f80797p - 1);
        String num3 = Integer.toString(this.f80798q - 1);
        String num4 = Integer.toString(this.f80799r - 1);
        Long l = this.f80783b;
        Long l2 = this.f80784c;
        String obj = this.f80785d.toString();
        String obj2 = this.f80786e.toString();
        Long l3 = this.f80787f;
        String str2 = this.f80788g;
        String valueOf = String.valueOf(this.f80789h);
        String str3 = this.f80790i;
        String str4 = this.f80791j;
        Long l4 = this.f80792k;
        Long l5 = this.f80793l;
        String num5 = Integer.toString(this.f80800s - 1);
        String valueOf2 = String.valueOf(this.f80794m);
        return "ChimeThread{id=" + str + ", readState=" + num + ", deletionStatus=" + num2 + ", countBehavior=" + num3 + ", systemTrayBehavior=" + num4 + ", lastUpdatedVersion=" + l + ", lastNotificationVersion=" + l2 + ", androidSdkMessage=" + obj + ", notificationMetadataList=" + obj2 + ", creationId=" + l3 + ", payloadType=" + str2 + ", payload=" + valueOf + ", updateThreadStateToken=" + str3 + ", groupId=" + str4 + ", expirationTimestampUsec=" + l4 + ", insertionTimeMs=" + l5 + ", storageMode=" + num5 + ", schedule=" + valueOf2 + ", actionList=" + this.f80795n.toString() + "}";
    }
}
