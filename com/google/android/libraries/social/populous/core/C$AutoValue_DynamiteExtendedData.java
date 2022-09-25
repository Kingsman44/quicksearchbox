package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.DynamiteExtendedData;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_DynamiteExtendedData  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_DynamiteExtendedData extends DynamiteExtendedData {

    /* renamed from: a */
    public final Long f110618a;

    /* renamed from: b */
    public final String f110619b;

    /* renamed from: c */
    public final String f110620c;

    /* renamed from: d */
    public final String f110621d;

    /* renamed from: e */
    public final DynamiteExtendedData.OrganizationInfo f110622e;

    /* renamed from: f */
    public final int f110623f;

    /* renamed from: g */
    public final int f110624g;

    /* renamed from: h */
    public final int f110625h;

    public C$AutoValue_DynamiteExtendedData(int i, int i2, int i3, Long l, String str, String str2, String str3, DynamiteExtendedData.OrganizationInfo organizationInfo) {
        if (i != 0) {
            this.f110623f = i;
            if (i2 != 0) {
                this.f110624g = i2;
                if (i3 != 0) {
                    this.f110625h = i3;
                    this.f110618a = l;
                    this.f110619b = str;
                    this.f110620c = str2;
                    this.f110621d = str3;
                    this.f110622e = organizationInfo;
                    return;
                }
                throw new NullPointerException("Null presence");
            }
            throw new NullPointerException("Null entityType");
        }
        throw new NullPointerException("Null dndState");
    }

    /* renamed from: a */
    public final DynamiteExtendedData.OrganizationInfo mo44964a() {
        return this.f110622e;
    }

    /* renamed from: b */
    public final Long mo44965b() {
        return this.f110618a;
    }

    /* renamed from: c */
    public final String mo44966c() {
        return this.f110619b;
    }

    /* renamed from: d */
    public final String mo44967d() {
        return this.f110621d;
    }

    /* renamed from: e */
    public final String mo44968e() {
        return this.f110620c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r1 = r4.f110618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = r4.f110619b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r1 = r4.f110620c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r1 = r4.f110621d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r1 = r4.f110622e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.DynamiteExtendedData
            r2 = 0
            if (r1 == 0) goto L_0x008e
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r5 = (com.google.android.libraries.social.populous.core.DynamiteExtendedData) r5
            int r1 = r4.f110623f
            int r3 = r5.mo44970f()
            if (r1 != r3) goto L_0x008e
            int r1 = r4.f110624g
            int r3 = r5.mo44971g()
            if (r1 != r3) goto L_0x008e
            int r1 = r4.f110625h
            int r3 = r5.mo44972h()
            if (r1 != r3) goto L_0x008e
            java.lang.Long r1 = r4.f110618a
            if (r1 != 0) goto L_0x002e
            java.lang.Long r1 = r5.mo44965b()
            if (r1 != 0) goto L_0x008e
            goto L_0x0038
        L_0x002e:
            java.lang.Long r3 = r5.mo44965b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0038:
            java.lang.String r1 = r4.f110619b
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = r5.mo44966c()
            if (r1 != 0) goto L_0x008e
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = r5.mo44966c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x004d:
            java.lang.String r1 = r4.f110620c
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.mo44968e()
            if (r1 != 0) goto L_0x008e
            goto L_0x0062
        L_0x0058:
            java.lang.String r3 = r5.mo44968e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0062:
            java.lang.String r1 = r4.f110621d
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r5.mo44967d()
            if (r1 != 0) goto L_0x008e
            goto L_0x0077
        L_0x006d:
            java.lang.String r3 = r5.mo44967d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0077:
            com.google.android.libraries.social.populous.core.DynamiteExtendedData$OrganizationInfo r1 = r4.f110622e
            if (r1 != 0) goto L_0x0082
            com.google.android.libraries.social.populous.core.DynamiteExtendedData$OrganizationInfo r5 = r5.mo44964a()
            if (r5 != 0) goto L_0x008e
            goto L_0x008d
        L_0x0082:
            com.google.android.libraries.social.populous.core.DynamiteExtendedData$OrganizationInfo r5 = r5.mo44964a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            return r0
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_DynamiteExtendedData.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo44970f() {
        return this.f110623f;
    }

    /* renamed from: g */
    public final int mo44971g() {
        return this.f110624g;
    }

    /* renamed from: h */
    public final int mo44972h() {
        return this.f110625h;
    }

    public final String toString() {
        String num = Integer.toString(this.f110623f - 1);
        String num2 = Integer.toString(this.f110624g - 1);
        String num3 = Integer.toString(this.f110625h - 1);
        Long l = this.f110618a;
        String str = this.f110619b;
        String str2 = this.f110620c;
        String str3 = this.f110621d;
        String valueOf = String.valueOf(this.f110622e);
        return "DynamiteExtendedData{dndState=" + num + ", entityType=" + num2 + ", presence=" + num3 + ", memberCount=" + l + ", avatarUrl=" + str + ", developerName=" + str2 + ", description=" + str3 + ", organizationInfo=" + valueOf + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = (((((this.f110623f ^ 1000003) * 1000003) ^ this.f110624g) * 1000003) ^ this.f110625h) * 1000003;
        Long l = this.f110618a;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        String str = this.f110619b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str2 = this.f110620c;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str3 = this.f110621d;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        DynamiteExtendedData.OrganizationInfo organizationInfo = this.f110622e;
        if (organizationInfo != null) {
            i6 = organizationInfo.hashCode();
        }
        return i10 ^ i6;
    }
}
