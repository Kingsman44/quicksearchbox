package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.c.x */
/* compiled from: PG */
final class C42497x extends C42457ah {

    /* renamed from: a */
    private final long f111449a;

    /* renamed from: b */
    private final String f111450b;

    /* renamed from: c */
    private final C58485gu f111451c;

    /* renamed from: d */
    private final Photo f111452d;

    /* renamed from: e */
    private final C58485gu f111453e;

    /* renamed from: f */
    private final C42418ao f111454f;

    public C42497x(long j, String str, C58485gu guVar, Photo photo, C58485gu guVar2, C42418ao aoVar) {
        this.f111449a = j;
        this.f111450b = str;
        this.f111451c = guVar;
        this.f111452d = photo;
        this.f111453e = guVar2;
        this.f111454f = aoVar;
    }

    /* renamed from: a */
    public final long mo45500a() {
        return this.f111449a;
    }

    /* renamed from: b */
    public final Photo mo45501b() {
        return this.f111452d;
    }

    /* renamed from: c */
    public final C42418ao mo45502c() {
        return this.f111454f;
    }

    /* renamed from: d */
    public final C58485gu mo45503d() {
        return this.f111451c;
    }

    /* renamed from: e */
    public final C58485gu mo45504e() {
        return this.f111453e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f111452d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.social.populous.p3296e.p3299c.C42457ah
            r2 = 0
            if (r1 == 0) goto L_0x005c
            com.google.android.libraries.social.populous.e.c.ah r8 = (com.google.android.libraries.social.populous.p3296e.p3299c.C42457ah) r8
            long r3 = r7.f111449a
            long r5 = r8.mo45500a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = r7.f111450b
            java.lang.String r3 = r8.mo45505f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005c
            com.google.common.b.gu r1 = r7.f111451c
            com.google.common.b.gu r3 = r8.mo45503d()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x005c
            com.google.android.libraries.social.populous.core.Photo r1 = r7.f111452d
            if (r1 != 0) goto L_0x0038
            com.google.android.libraries.social.populous.core.Photo r1 = r8.mo45501b()
            if (r1 != 0) goto L_0x005c
            goto L_0x0043
        L_0x0038:
            com.google.android.libraries.social.populous.core.Photo r3 = r8.mo45501b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0043
            goto L_0x005c
        L_0x0043:
            com.google.common.b.gu r1 = r7.f111453e
            com.google.common.b.gu r3 = r8.mo45504e()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x005c
            com.google.android.libraries.social.populous.e.b.ao r1 = r7.f111454f
            com.google.android.libraries.social.populous.e.b.ao r8 = r8.mo45502c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x005c
            return r0
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3299c.C42497x.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo45505f() {
        return this.f111450b;
    }

    public final int hashCode() {
        int i;
        long j = this.f111449a;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f111450b.hashCode()) * 1000003) ^ this.f111451c.hashCode()) * 1000003;
        Photo photo = this.f111452d;
        if (photo == null) {
            i = 0;
        } else {
            i = photo.hashCode();
        }
        return this.f111454f.hashCode() ^ ((((hashCode ^ i) * 1000003) ^ this.f111453e.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f111449a;
        String str = this.f111450b;
        String obj = this.f111451c.toString();
        String valueOf = String.valueOf(this.f111452d);
        String obj2 = this.f111453e.toString();
        String obj3 = this.f111454f.toString();
        return "Item{deviceContactId=" + j + ", deviceLookupKey=" + str + ", displayNames=" + obj + ", photo=" + valueOf + ", fields=" + obj2 + ", rankingFeatureSet=" + obj3 + "}";
    }
}
