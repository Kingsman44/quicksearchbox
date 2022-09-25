package com.google.android.libraries.social.populous.logging;

import java.util.EnumSet;
import p5602o.p5607c.C71942m;

/* renamed from: com.google.android.libraries.social.populous.logging.$AutoValue_LogEntity  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_LogEntity extends LogEntity {

    /* renamed from: a */
    public final EnumSet f111640a;

    /* renamed from: b */
    public final EnumSet f111641b;

    /* renamed from: c */
    public final String f111642c;

    /* renamed from: d */
    public final String f111643d;

    /* renamed from: e */
    public final int f111644e;

    /* renamed from: f */
    public final int f111645f;

    /* renamed from: g */
    public final int f111646g;

    /* renamed from: h */
    public final String f111647h;

    /* renamed from: i */
    public final String f111648i;

    /* renamed from: j */
    public final String f111649j;

    /* renamed from: k */
    public final String f111650k;

    /* renamed from: l */
    public final Long f111651l;

    /* renamed from: m */
    public final boolean f111652m;

    /* renamed from: n */
    public final boolean f111653n;

    /* renamed from: o */
    public final boolean f111654o;

    /* renamed from: p */
    public final boolean f111655p;

    /* renamed from: q */
    public final boolean f111656q;

    /* renamed from: r */
    public final Integer f111657r;

    /* renamed from: s */
    public final boolean f111658s;

    /* renamed from: t */
    public final String f111659t;

    /* renamed from: u */
    public final C71942m f111660u;

    /* renamed from: v */
    public final int f111661v;

    /* renamed from: w */
    public final int f111662w;

    public C$AutoValue_LogEntity(EnumSet enumSet, EnumSet enumSet2, String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, Long l, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, String str7, C71942m mVar) {
        EnumSet enumSet3 = enumSet;
        EnumSet enumSet4 = enumSet2;
        String str8 = str2;
        int i6 = i4;
        int i7 = i5;
        if (enumSet3 != null) {
            this.f111640a = enumSet3;
            if (enumSet4 != null) {
                this.f111641b = enumSet4;
                this.f111642c = str;
                if (str8 != null) {
                    this.f111643d = str8;
                    this.f111644e = i;
                    this.f111645f = i2;
                    this.f111646g = i3;
                    this.f111647h = str3;
                    this.f111648i = str4;
                    this.f111649j = str5;
                    this.f111650k = str6;
                    this.f111651l = l;
                    if (i6 != 0) {
                        this.f111661v = i6;
                        if (i7 != 0) {
                            this.f111662w = i7;
                            this.f111652m = z;
                            this.f111653n = z2;
                            this.f111654o = z3;
                            this.f111655p = z4;
                            this.f111656q = z5;
                            this.f111657r = num;
                            this.f111658s = z6;
                            this.f111659t = str7;
                            this.f111660u = mVar;
                            return;
                        }
                        throw new NullPointerException("Null personEntityType");
                    }
                    throw new NullPointerException("Null entityType");
                }
                throw new NullPointerException("Null fieldLoggingId");
            }
            throw new NullPointerException("Null provenance");
        }
        throw new NullPointerException("Null personProvenance");
    }

    /* renamed from: a */
    public final int mo45567a() {
        return this.f111644e;
    }

    /* renamed from: b */
    public final int mo45568b() {
        return this.f111646g;
    }

    /* renamed from: c */
    public final int mo45569c() {
        return this.f111645f;
    }

    /* renamed from: d */
    public final C42584s mo45570d() {
        return new C42562a(this);
    }

    /* renamed from: e */
    public final Integer mo45571e() {
        return this.f111657r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r4.f111647h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r1 = r4.f111648i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r1 = r4.f111649j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r1 = r4.f111650k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        r1 = r4.f111651l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fd, code lost:
        r1 = r4.f111657r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011a, code lost:
        r1 = r4.f111659t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012f, code lost:
        r1 = r4.f111660u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f111642c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.logging.LogEntity
            r2 = 0
            if (r1 == 0) goto L_0x0146
            com.google.android.libraries.social.populous.logging.LogEntity r5 = (com.google.android.libraries.social.populous.logging.LogEntity) r5
            java.util.EnumSet r1 = r4.f111640a
            java.util.EnumSet r3 = r5.mo45582n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
            java.util.EnumSet r1 = r4.f111641b
            java.util.EnumSet r3 = r5.mo45583o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
            java.lang.String r1 = r4.f111642c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo45579k()
            if (r1 != 0) goto L_0x0146
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.mo45579k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x0038:
            java.lang.String r1 = r4.f111643d
            java.lang.String r3 = r5.mo45578j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
            int r1 = r4.f111644e
            int r3 = r5.mo45567a()
            if (r1 != r3) goto L_0x0146
            int r1 = r4.f111645f
            int r3 = r5.mo45569c()
            if (r1 != r3) goto L_0x0146
            int r1 = r4.f111646g
            int r3 = r5.mo45568b()
            if (r1 != r3) goto L_0x0146
            java.lang.String r1 = r4.f111647h
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = r5.mo45574g()
            if (r1 != 0) goto L_0x0146
            goto L_0x0071
        L_0x0067:
            java.lang.String r3 = r5.mo45574g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x0071:
            java.lang.String r1 = r4.f111648i
            if (r1 != 0) goto L_0x007c
            java.lang.String r1 = r5.mo45575h()
            if (r1 != 0) goto L_0x0146
            goto L_0x0086
        L_0x007c:
            java.lang.String r3 = r5.mo45575h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x0086:
            java.lang.String r1 = r4.f111649j
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = r5.mo45580l()
            if (r1 != 0) goto L_0x0146
            goto L_0x009b
        L_0x0091:
            java.lang.String r3 = r5.mo45580l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x009b:
            java.lang.String r1 = r4.f111650k
            if (r1 != 0) goto L_0x00a6
            java.lang.String r1 = r5.mo45577i()
            if (r1 != 0) goto L_0x0146
            goto L_0x00b0
        L_0x00a6:
            java.lang.String r3 = r5.mo45577i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x00b0:
            java.lang.Long r1 = r4.f111651l
            if (r1 != 0) goto L_0x00bb
            java.lang.Long r1 = r5.mo45573f()
            if (r1 != 0) goto L_0x0146
            goto L_0x00c5
        L_0x00bb:
            java.lang.Long r3 = r5.mo45573f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x00c5:
            int r1 = r4.f111661v
            int r3 = r5.mo45592w()
            if (r1 != r3) goto L_0x0146
            int r1 = r4.f111662w
            int r3 = r5.mo45593x()
            if (r1 != r3) goto L_0x0146
            boolean r1 = r4.f111652m
            boolean r3 = r5.mo45586r()
            if (r1 != r3) goto L_0x0146
            boolean r1 = r4.f111653n
            boolean r3 = r5.mo45587s()
            if (r1 != r3) goto L_0x0146
            boolean r1 = r4.f111654o
            boolean r3 = r5.mo45585q()
            if (r1 != r3) goto L_0x0146
            boolean r1 = r4.f111655p
            boolean r3 = r5.mo45591v()
            if (r1 != r3) goto L_0x0146
            boolean r1 = r4.f111656q
            boolean r3 = r5.mo45588t()
            if (r1 != r3) goto L_0x0146
            java.lang.Integer r1 = r4.f111657r
            if (r1 != 0) goto L_0x0108
            java.lang.Integer r1 = r5.mo45571e()
            if (r1 != 0) goto L_0x0146
            goto L_0x0112
        L_0x0108:
            java.lang.Integer r3 = r5.mo45571e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x0112:
            boolean r1 = r4.f111658s
            boolean r3 = r5.mo45590u()
            if (r1 != r3) goto L_0x0146
            java.lang.String r1 = r4.f111659t
            if (r1 != 0) goto L_0x0125
            java.lang.String r1 = r5.mo45581m()
            if (r1 != 0) goto L_0x0146
            goto L_0x012f
        L_0x0125:
            java.lang.String r3 = r5.mo45581m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0146
        L_0x012f:
            o.c.m r1 = r4.f111660u
            if (r1 != 0) goto L_0x013a
            o.c.m r5 = r5.mo45584p()
            if (r5 != 0) goto L_0x0146
            goto L_0x0145
        L_0x013a:
            o.c.m r5 = r5.mo45584p()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            return r0
        L_0x0146:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.logging.C$AutoValue_LogEntity.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Long mo45573f() {
        return this.f111651l;
    }

    /* renamed from: g */
    public final String mo45574g() {
        return this.f111647h;
    }

    /* renamed from: h */
    public final String mo45575h() {
        return this.f111648i;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int hashCode = (((this.f111640a.hashCode() ^ 1000003) * 1000003) ^ this.f111641b.hashCode()) * 1000003;
        String str = this.f111642c;
        int i9 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((((((((hashCode ^ i) * 1000003) ^ this.f111643d.hashCode()) * 1000003) ^ this.f111644e) * 1000003) ^ this.f111645f) * 1000003) ^ this.f111646g) * 1000003;
        String str2 = this.f111647h;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (hashCode2 ^ i2) * 1000003;
        String str3 = this.f111648i;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 ^ i3) * 1000003;
        String str4 = this.f111649j;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (i11 ^ i4) * 1000003;
        String str5 = this.f111650k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (i12 ^ i5) * 1000003;
        Long l = this.f111651l;
        if (l == null) {
            i6 = 0;
        } else {
            i6 = l.hashCode();
        }
        int i14 = 1237;
        int i15 = (((((((((((((((i13 ^ i6) * 1000003) ^ this.f111661v) * 1000003) ^ this.f111662w) * 1000003) ^ (true != this.f111652m ? 1237 : 1231)) * 1000003) ^ (true != this.f111653n ? 1237 : 1231)) * 1000003) ^ (true != this.f111654o ? 1237 : 1231)) * 1000003) ^ (true != this.f111655p ? 1237 : 1231)) * 1000003) ^ (true != this.f111656q ? 1237 : 1231)) * 1000003;
        Integer num = this.f111657r;
        if (num == null) {
            i7 = 0;
        } else {
            i7 = num.hashCode();
        }
        int i16 = (i15 ^ i7) * 1000003;
        if (true == this.f111658s) {
            i14 = 1231;
        }
        int i17 = (i16 ^ i14) * 1000003;
        String str6 = this.f111659t;
        if (str6 == null) {
            i8 = 0;
        } else {
            i8 = str6.hashCode();
        }
        int i18 = (i17 ^ i8) * 1000003;
        C71942m mVar = this.f111660u;
        if (mVar != null) {
            i9 = mVar.hashCode();
        }
        return i18 ^ i9;
    }

    /* renamed from: i */
    public final String mo45577i() {
        return this.f111650k;
    }

    /* renamed from: j */
    public final String mo45578j() {
        return this.f111643d;
    }

    /* renamed from: k */
    public final String mo45579k() {
        return this.f111642c;
    }

    /* renamed from: l */
    public final String mo45580l() {
        return this.f111649j;
    }

    /* renamed from: m */
    public final String mo45581m() {
        return this.f111659t;
    }

    /* renamed from: n */
    public final EnumSet mo45582n() {
        return this.f111640a;
    }

    /* renamed from: o */
    public final EnumSet mo45583o() {
        return this.f111641b;
    }

    /* renamed from: p */
    public final C71942m mo45584p() {
        return this.f111660u;
    }

    /* renamed from: q */
    public final boolean mo45585q() {
        return this.f111654o;
    }

    /* renamed from: r */
    public final boolean mo45586r() {
        return this.f111652m;
    }

    /* renamed from: s */
    public final boolean mo45587s() {
        return this.f111653n;
    }

    /* renamed from: t */
    public final boolean mo45588t() {
        return this.f111656q;
    }

    public final String toString() {
        String obj = this.f111640a.toString();
        String obj2 = this.f111641b.toString();
        String str = this.f111642c;
        String str2 = this.f111643d;
        int i = this.f111644e;
        int i2 = this.f111645f;
        int i3 = this.f111646g;
        String str3 = this.f111647h;
        String str4 = this.f111648i;
        String str5 = this.f111649j;
        String str6 = this.f111650k;
        Long l = this.f111651l;
        int i4 = this.f111661v;
        int i5 = this.f111662w;
        boolean z = this.f111652m;
        boolean z2 = this.f111653n;
        boolean z3 = this.f111654o;
        boolean z4 = this.f111655p;
        boolean z5 = this.f111656q;
        Integer num = this.f111657r;
        boolean z6 = this.f111658s;
        String str7 = this.f111659t;
        return "LogEntity{personProvenance=" + obj + ", provenance=" + obj2 + ", personLoggingId=" + str + ", fieldLoggingId=" + str2 + ", affinityVersion=" + i + ", personLevelPosition=" + i2 + ", fieldLevelPosition=" + i3 + ", displayName=" + str3 + ", email=" + str4 + ", phone=" + str5 + ", encodedProfileId=" + str6 + ", focusContactId=" + l + ", entityType=" + C42585t.m75172a(i4) + ", personEntityType=" + C42585t.m75172a(i5) + ", hasDisplayNameMatches=" + z + ", hasFieldMatches=" + z2 + ", hasAvatar=" + z3 + ", boosted=" + z4 + ", isExternalEventSource=" + z5 + ", callbackLatency=" + num + ", isPlaceholder=" + z6 + ", query=" + str7 + ", smartAddressEntityMetadata=" + String.valueOf(this.f111660u) + "}";
    }

    /* renamed from: u */
    public final boolean mo45590u() {
        return this.f111658s;
    }

    /* renamed from: v */
    public final boolean mo45591v() {
        return this.f111655p;
    }

    /* renamed from: w */
    public final int mo45592w() {
        return this.f111661v;
    }

    /* renamed from: x */
    public final int mo45593x() {
        return this.f111662w;
    }
}
