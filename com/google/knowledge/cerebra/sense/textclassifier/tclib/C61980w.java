package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.w */
/* compiled from: PG */
final class C61980w extends C61960dp {

    /* renamed from: a */
    private final String f167514a;

    /* renamed from: b */
    private final ParcelFileDescriptor f167515b;

    /* renamed from: c */
    private final ParcelFileDescriptor f167516c;

    /* renamed from: d */
    private final ParcelFileDescriptor f167517d;

    /* renamed from: e */
    private final ParcelFileDescriptor f167518e;

    public C61980w(String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, ParcelFileDescriptor parcelFileDescriptor4) {
        this.f167514a = str;
        this.f167515b = parcelFileDescriptor;
        this.f167516c = parcelFileDescriptor2;
        this.f167517d = parcelFileDescriptor3;
        this.f167518e = parcelFileDescriptor4;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo58431a() {
        return this.f167516c;
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo58432b() {
        return this.f167517d;
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo58433c() {
        return this.f167515b;
    }

    /* renamed from: d */
    public final ParcelFileDescriptor mo58435d() {
        return this.f167518e;
    }

    /* renamed from: e */
    public final String mo58436e() {
        return this.f167514a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f167517d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.f167518e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.knowledge.cerebra.sense.textclassifier.tclib.C61960dp
            r2 = 0
            if (r1 == 0) goto L_0x005b
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dp r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61960dp) r5
            java.lang.String r1 = r4.f167514a
            java.lang.String r3 = r5.mo58436e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005b
            android.os.ParcelFileDescriptor r1 = r4.f167515b
            android.os.ParcelFileDescriptor r3 = r5.mo58433c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005b
            android.os.ParcelFileDescriptor r1 = r4.f167516c
            android.os.ParcelFileDescriptor r3 = r5.mo58431a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005b
            android.os.ParcelFileDescriptor r1 = r4.f167517d
            if (r1 != 0) goto L_0x003a
            android.os.ParcelFileDescriptor r1 = r5.mo58432b()
            if (r1 != 0) goto L_0x005b
            goto L_0x0044
        L_0x003a:
            android.os.ParcelFileDescriptor r3 = r5.mo58432b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005b
        L_0x0044:
            android.os.ParcelFileDescriptor r1 = r4.f167518e
            if (r1 != 0) goto L_0x004f
            android.os.ParcelFileDescriptor r5 = r5.mo58435d()
            if (r5 != 0) goto L_0x005b
            goto L_0x005a
        L_0x004f:
            android.os.ParcelFileDescriptor r5 = r5.mo58435d()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61980w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f167514a.hashCode() ^ 1000003) * 1000003) ^ this.f167515b.hashCode()) * 1000003) ^ this.f167516c.hashCode()) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor = this.f167517d;
        int i2 = 0;
        if (parcelFileDescriptor == null) {
            i = 0;
        } else {
            i = parcelFileDescriptor.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor2 = this.f167518e;
        if (parcelFileDescriptor2 != null) {
            i2 = parcelFileDescriptor2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f167514a;
        String obj = this.f167515b.toString();
        String obj2 = this.f167516c.toString();
        String valueOf = String.valueOf(this.f167517d);
        String valueOf2 = String.valueOf(this.f167518e);
        return "Slice{sliceId=" + str + ", namesTable=" + obj + ", metadataTable=" + obj2 + ", namesFilter=" + valueOf + ", prefixesFilter=" + valueOf2 + "}";
    }
}
