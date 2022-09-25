package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_InAppNotificationTarget  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_InAppNotificationTarget extends InAppNotificationTarget {

    /* renamed from: a */
    public final C42282bh f110645a;

    /* renamed from: b */
    public final PersonFieldMetadata f110646b;

    /* renamed from: c */
    public final C58833ax f110647c;

    /* renamed from: d */
    public final C58833ax f110648d;

    /* renamed from: e */
    public final C58485gu f110649e;

    /* renamed from: f */
    public final String f110650f;

    /* renamed from: g */
    public final CharSequence f110651g;

    /* renamed from: h */
    public final int f110652h;

    public C$AutoValue_InAppNotificationTarget(C42282bh bhVar, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, int i, C58485gu guVar, String str, CharSequence charSequence) {
        if (bhVar != null) {
            this.f110645a = bhVar;
            if (personFieldMetadata != null) {
                this.f110646b = personFieldMetadata;
                if (axVar != null) {
                    this.f110647c = axVar;
                    if (axVar2 != null) {
                        this.f110648d = axVar2;
                        this.f110652h = i;
                        if (guVar != null) {
                            this.f110649e = guVar;
                            this.f110650f = str;
                            if (charSequence != null) {
                                this.f110651g = charSequence;
                                return;
                            }
                            throw new NullPointerException("Null value");
                        }
                        throw new NullPointerException("Null originatingFields");
                    }
                    throw new NullPointerException("Null photo");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110646b;
    }

    /* renamed from: c */
    public final C42298bx mo45012c() {
        return new C42346g(this);
    }

    /* renamed from: d */
    public final C58833ax mo45013d() {
        return this.f110647c;
    }

    /* renamed from: e */
    public final C58833ax mo45014e() {
        return this.f110648d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r1 = r4.f110652h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r1 = r4.f110650f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.InAppNotificationTarget
            r2 = 0
            if (r1 == 0) goto L_0x007b
            com.google.android.libraries.social.populous.core.InAppNotificationTarget r5 = (com.google.android.libraries.social.populous.core.InAppNotificationTarget) r5
            com.google.android.libraries.social.populous.core.bh r1 = r4.f110645a
            com.google.android.libraries.social.populous.core.bh r3 = r5.mo45020lo()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = r4.f110646b
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r3 = r5.mo44976b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
            com.google.common.base.ax r1 = r4.f110647c
            com.google.common.base.ax r3 = r5.mo45013d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
            com.google.common.base.ax r1 = r4.f110648d
            com.google.common.base.ax r3 = r5.mo45014e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
            int r1 = r4.f110652h
            if (r1 != 0) goto L_0x0046
            int r1 = r5.mo45019i()
            if (r1 != 0) goto L_0x007b
            goto L_0x004c
        L_0x0046:
            int r3 = r5.mo45019i()
            if (r1 != r3) goto L_0x007b
        L_0x004c:
            com.google.common.b.gu r1 = r4.f110649e
            com.google.common.b.gu r3 = r5.mo45016f()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = r4.f110650f
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r5.mo45017h()
            if (r1 != 0) goto L_0x007b
            goto L_0x006e
        L_0x0063:
            java.lang.String r3 = r5.mo45017h()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            java.lang.CharSequence r1 = r4.f110651g
            java.lang.CharSequence r5 = r5.mo44982g()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x007b
            return r0
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_InAppNotificationTarget.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C58485gu mo45016f() {
        return this.f110649e;
    }

    /* renamed from: g */
    public final CharSequence mo44982g() {
        return this.f110651g;
    }

    /* renamed from: h */
    public final String mo45017h() {
        return this.f110650f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f110645a.hashCode() ^ 1000003) * 1000003) ^ this.f110646b.hashCode()) * 1000003) ^ this.f110647c.hashCode()) * 1000003) ^ this.f110648d.hashCode()) * 1000003;
        int i = this.f110652h;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f110649e.hashCode()) * 1000003;
        String str = this.f110650f;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f110651g.hashCode();
    }

    /* renamed from: i */
    public final int mo45019i() {
        return this.f110652h;
    }

    /* renamed from: lo */
    public final C42282bh mo45020lo() {
        return this.f110645a;
    }

    public final String toString() {
        String obj = this.f110645a.toString();
        String obj2 = this.f110646b.toString();
        String obj3 = this.f110647c.toString();
        String obj4 = this.f110648d.toString();
        int i = this.f110652h;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        String obj5 = this.f110649e.toString();
        String str = this.f110650f;
        String obj6 = this.f110651g.toString();
        return "InAppNotificationTarget{type=" + obj + ", metadata=" + obj2 + ", name=" + obj3 + ", photo=" + obj4 + ", targetType=" + num + ", originatingFields=" + obj5 + ", fallbackProfileId=" + str + ", value=" + obj6 + "}";
    }
}
