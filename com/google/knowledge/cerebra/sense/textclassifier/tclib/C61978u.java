package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.u */
/* compiled from: PG */
final class C61978u extends C61961dq {

    /* renamed from: a */
    public final C58485gu f167504a;

    /* renamed from: b */
    public final ParcelFileDescriptor f167505b;

    /* renamed from: c */
    public final ParcelFileDescriptor f167506c;

    /* renamed from: d */
    public final ParcelFileDescriptor f167507d;

    /* renamed from: e */
    public final ParcelFileDescriptor f167508e;

    public C61978u(C58485gu guVar, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, ParcelFileDescriptor parcelFileDescriptor4) {
        this.f167504a = guVar;
        this.f167505b = parcelFileDescriptor;
        this.f167506c = parcelFileDescriptor2;
        this.f167507d = parcelFileDescriptor3;
        this.f167508e = parcelFileDescriptor4;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo58437a() {
        return this.f167505b;
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo58438b() {
        return this.f167507d;
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo58439c() {
        return this.f167508e;
    }

    /* renamed from: d */
    public final ParcelFileDescriptor mo58441d() {
        return this.f167506c;
    }

    /* renamed from: e */
    public final C58485gu mo58442e() {
        return this.f167504a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f167506c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f167507d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f167508e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f167505b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq
            r2 = 0
            if (r1 == 0) goto L_0x006d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dq r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq) r5
            com.google.common.b.gu r1 = r4.f167504a
            com.google.common.b.gu r3 = r5.mo58442e()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x006d
            android.os.ParcelFileDescriptor r1 = r4.f167505b
            if (r1 != 0) goto L_0x0022
            android.os.ParcelFileDescriptor r1 = r5.mo58437a()
            if (r1 != 0) goto L_0x006d
            goto L_0x002c
        L_0x0022:
            android.os.ParcelFileDescriptor r3 = r5.mo58437a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x002c:
            android.os.ParcelFileDescriptor r1 = r4.f167506c
            if (r1 != 0) goto L_0x0037
            android.os.ParcelFileDescriptor r1 = r5.mo58441d()
            if (r1 != 0) goto L_0x006d
            goto L_0x0041
        L_0x0037:
            android.os.ParcelFileDescriptor r3 = r5.mo58441d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0041:
            android.os.ParcelFileDescriptor r1 = r4.f167507d
            if (r1 != 0) goto L_0x004c
            android.os.ParcelFileDescriptor r1 = r5.mo58438b()
            if (r1 != 0) goto L_0x006d
            goto L_0x0056
        L_0x004c:
            android.os.ParcelFileDescriptor r3 = r5.mo58438b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0056:
            android.os.ParcelFileDescriptor r1 = r4.f167508e
            if (r1 != 0) goto L_0x0061
            android.os.ParcelFileDescriptor r5 = r5.mo58439c()
            if (r5 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0061:
            android.os.ParcelFileDescriptor r5 = r5.mo58439c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            return r0
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61978u.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C61958dn mo58443f() {
        return new C61977t(this);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.f167504a.hashCode() ^ 1000003) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor = this.f167505b;
        int i4 = 0;
        if (parcelFileDescriptor == null) {
            i = 0;
        } else {
            i = parcelFileDescriptor.hashCode();
        }
        int i5 = (hashCode ^ i) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor2 = this.f167506c;
        if (parcelFileDescriptor2 == null) {
            i2 = 0;
        } else {
            i2 = parcelFileDescriptor2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor3 = this.f167507d;
        if (parcelFileDescriptor3 == null) {
            i3 = 0;
        } else {
            i3 = parcelFileDescriptor3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor4 = this.f167508e;
        if (parcelFileDescriptor4 != null) {
            i4 = parcelFileDescriptor4.hashCode();
        }
        return i7 ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f167504a);
        String valueOf2 = String.valueOf(this.f167505b);
        String valueOf3 = String.valueOf(this.f167506c);
        String valueOf4 = String.valueOf(this.f167507d);
        String valueOf5 = String.valueOf(this.f167508e);
        return "WebrefModel{slices=" + valueOf + ", modelMetadataProto=" + valueOf2 + ", wordEmbeddings=" + valueOf3 + ", refNet=" + valueOf4 + ", topicalityModel=" + valueOf5 + "}";
    }
}
