package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_AutocompletePrediction  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AutocompletePrediction extends AutocompletePrediction {

    /* renamed from: a */
    public final String f85506a;

    /* renamed from: b */
    public final Integer f85507b;

    /* renamed from: c */
    public final List f85508c;

    /* renamed from: d */
    public final String f85509d;

    /* renamed from: e */
    public final String f85510e;

    /* renamed from: f */
    public final String f85511f;

    /* renamed from: g */
    public final List f85512g;

    /* renamed from: h */
    public final List f85513h;

    /* renamed from: i */
    public final List f85514i;

    public C$AutoValue_AutocompletePrediction(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        if (str != null) {
            this.f85506a = str;
            this.f85507b = num;
            if (list != null) {
                this.f85508c = list;
                if (str2 != null) {
                    this.f85509d = str2;
                    if (str3 != null) {
                        this.f85510e = str3;
                        if (str4 != null) {
                            this.f85511f = str4;
                            this.f85512g = list2;
                            this.f85513h = list3;
                            this.f85514i = list4;
                            return;
                        }
                        throw new NullPointerException("Null secondaryText");
                    }
                    throw new NullPointerException("Null primaryText");
                }
                throw new NullPointerException("Null fullText");
            }
            throw new NullPointerException("Null placeTypes");
        }
        throw new NullPointerException("Null placeId");
    }

    /* renamed from: a */
    public final Integer mo37460a() {
        return this.f85507b;
    }

    /* renamed from: b */
    public final String mo37461b() {
        return this.f85509d;
    }

    /* renamed from: c */
    public final String mo37462c() {
        return this.f85506a;
    }

    /* renamed from: d */
    public final String mo37463d() {
        return this.f85510e;
    }

    /* renamed from: e */
    public final String mo37464e() {
        return this.f85511f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r1 = r4.f85512g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r4.f85513h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r1 = r4.f85514i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f85507b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.model.AutocompletePrediction
            r2 = 0
            if (r1 == 0) goto L_0x009d
            com.google.android.libraries.places.api.model.AutocompletePrediction r5 = (com.google.android.libraries.places.api.model.AutocompletePrediction) r5
            java.lang.String r1 = r4.f85506a
            java.lang.String r3 = r5.mo37462c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r1 = r4.f85507b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r5.mo37460a()
            if (r1 != 0) goto L_0x009d
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r5.mo37460a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x002c:
            java.util.List r1 = r4.f85508c
            java.util.List r3 = r5.mo37467g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.f85509d
            java.lang.String r3 = r5.mo37461b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.f85510e
            java.lang.String r3 = r5.mo37463d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.f85511f
            java.lang.String r3 = r5.mo37464e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.util.List r1 = r4.f85512g
            if (r1 != 0) goto L_0x0067
            java.util.List r1 = r5.mo37466f()
            if (r1 != 0) goto L_0x009d
            goto L_0x0071
        L_0x0067:
            java.util.List r3 = r5.mo37466f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x0071:
            java.util.List r1 = r4.f85513h
            if (r1 != 0) goto L_0x007c
            java.util.List r1 = r5.mo37468h()
            if (r1 != 0) goto L_0x009d
            goto L_0x0086
        L_0x007c:
            java.util.List r3 = r5.mo37468h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x0086:
            java.util.List r1 = r4.f85514i
            if (r1 != 0) goto L_0x0091
            java.util.List r5 = r5.mo37470i()
            if (r5 != 0) goto L_0x009d
            goto L_0x009c
        L_0x0091:
            java.util.List r5 = r5.mo37470i()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            return r0
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.C$AutoValue_AutocompletePrediction.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final List mo37466f() {
        return this.f85512g;
    }

    /* renamed from: g */
    public final List mo37467g() {
        return this.f85508c;
    }

    /* renamed from: h */
    public final List mo37468h() {
        return this.f85513h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.f85506a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f85507b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int hashCode2 = (((((((((hashCode ^ i) * 1000003) ^ this.f85508c.hashCode()) * 1000003) ^ this.f85509d.hashCode()) * 1000003) ^ this.f85510e.hashCode()) * 1000003) ^ this.f85511f.hashCode()) * 1000003;
        List list = this.f85512g;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.hashCode();
        }
        int i5 = (hashCode2 ^ i2) * 1000003;
        List list2 = this.f85513h;
        if (list2 == null) {
            i3 = 0;
        } else {
            i3 = list2.hashCode();
        }
        int i6 = (i5 ^ i3) * 1000003;
        List list3 = this.f85514i;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return i6 ^ i4;
    }

    /* renamed from: i */
    public final List mo37470i() {
        return this.f85514i;
    }

    public final String toString() {
        String str = this.f85506a;
        Integer num = this.f85507b;
        String obj = this.f85508c.toString();
        String str2 = this.f85509d;
        String str3 = this.f85510e;
        String str4 = this.f85511f;
        String valueOf = String.valueOf(this.f85512g);
        String valueOf2 = String.valueOf(this.f85513h);
        String valueOf3 = String.valueOf(this.f85514i);
        return "AutocompletePrediction{placeId=" + str + ", distanceMeters=" + num + ", placeTypes=" + obj + ", fullText=" + str2 + ", primaryText=" + str3 + ", secondaryText=" + str4 + ", fullTextMatchedSubstrings=" + valueOf + ", primaryTextMatchedSubstrings=" + valueOf2 + ", secondaryTextMatchedSubstrings=" + valueOf3 + "}";
    }
}
