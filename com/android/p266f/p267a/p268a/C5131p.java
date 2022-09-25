package com.android.p266f.p267a.p268a;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.android.f.a.a.p */
/* compiled from: PG */
public final class C5131p {

    /* renamed from: a */
    public SparseArray f16334a;

    public C5131p() {
        this.f16334a = null;
        this.f16334a = new SparseArray();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10168a(int i) {
        Integer num = (Integer) this.f16334a.get(i);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo10169b(int i) {
        Long l = (Long) this.f16334a.get(i);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C5120e mo10170c(int i) {
        return (C5120e) this.f16334a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10171d(C5120e eVar, int i) {
        eVar.getClass();
        if (i == 137 || i == 147 || i == 150 || i == 154 || i == 160 || i == 164 || i == 166 || i == 181 || i == 182) {
            this.f16334a.put(i, eVar);
            return;
        }
        throw new RuntimeException("Invalid header field!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo10174g(byte[] bArr, int i) {
        bArr.getClass();
        if (!(i == 131 || i == 132 || i == 138 || i == 139 || i == 152 || i == 158 || i == 189 || i == 190)) {
            switch (i) {
                case 183:
                case 184:
                case 185:
                    break;
                default:
                    throw new RuntimeException("Invalid header field!");
            }
        }
        this.f16334a.put(i, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final byte[] mo10175h(int i) {
        return (byte[]) this.f16334a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C5120e[] mo10176i(int i) {
        ArrayList arrayList = (ArrayList) this.f16334a.get(i);
        if (arrayList == null) {
            return null;
        }
        return (C5120e[]) arrayList.toArray(new C5120e[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo10172e(long j, int i) {
        if (i == 133 || i == 142 || i == 157 || i == 159 || i == 161 || i == 173 || i == 175 || i == 179 || i == 135 || i == 136) {
            this.f16334a.put(i, Long.valueOf(j));
            return;
        }
        throw new RuntimeException("Invalid header field!");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0107, code lost:
        if (r8 < 192) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x011c, code lost:
        if (r8 < 192) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0081, code lost:
        if (r8 < 192) goto L_0x0077;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10173f(int r8, int r9) {
        /*
            r7 = this;
            r0 = 134(0x86, float:1.88E-43)
            r1 = 129(0x81, float:1.81E-43)
            r2 = 0
            r3 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 153(0x99, float:2.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r9 == r0) goto L_0x010a
            r0 = 165(0xa5, float:2.31E-43)
            if (r9 == r0) goto L_0x00f5
            r0 = 167(0xa7, float:2.34E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 169(0xa9, float:2.37E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 171(0xab, float:2.4E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 177(0xb1, float:2.48E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 180(0xb4, float:2.52E-43)
            if (r9 == r0) goto L_0x00ec
            r0 = 191(0xbf, float:2.68E-43)
            if (r9 == r0) goto L_0x00e1
            r0 = 140(0x8c, float:1.96E-43)
            if (r9 == r0) goto L_0x00d4
            r0 = 141(0x8d, float:1.98E-43)
            if (r9 == r0) goto L_0x00c7
            r0 = 148(0x94, float:2.07E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 149(0x95, float:2.09E-43)
            r6 = 135(0x87, float:1.89E-43)
            if (r9 == r0) goto L_0x00bb
            r0 = 155(0x9b, float:2.17E-43)
            if (r9 == r0) goto L_0x00af
            r0 = 156(0x9c, float:2.19E-43)
            if (r9 == r0) goto L_0x00a1
            r0 = 162(0xa2, float:2.27E-43)
            if (r9 == r0) goto L_0x0120
            r0 = 163(0xa3, float:2.28E-43)
            if (r9 == r0) goto L_0x0093
            switch(r9) {
                case 143: goto L_0x0085;
                case 144: goto L_0x0120;
                case 145: goto L_0x0120;
                case 146: goto L_0x0069;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r9) {
                case 186: goto L_0x005d;
                case 187: goto L_0x0120;
                case 188: goto L_0x0120;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid header field!"
            r8.<init>(r9)
            throw r8
        L_0x005d:
            if (r8 < r3) goto L_0x0063
            if (r8 > r6) goto L_0x0063
            goto L_0x012b
        L_0x0063:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x0069:
            r0 = 196(0xc4, float:2.75E-43)
            if (r8 <= r0) goto L_0x0073
            if (r8 >= r5) goto L_0x0073
        L_0x006f:
            r8 = 192(0xc0, float:2.69E-43)
            goto L_0x012b
        L_0x0073:
            r0 = 235(0xeb, float:3.3E-43)
            if (r8 <= r0) goto L_0x007b
        L_0x0077:
            r8 = 224(0xe0, float:3.14E-43)
            goto L_0x012b
        L_0x007b:
            if (r8 < r3) goto L_0x0077
            r0 = 136(0x88, float:1.9E-43)
            if (r8 <= r0) goto L_0x012b
            if (r8 >= r4) goto L_0x012b
            goto L_0x0116
        L_0x0085:
            if (r8 < r3) goto L_0x008d
            r0 = 130(0x82, float:1.82E-43)
            if (r8 > r0) goto L_0x008d
            goto L_0x012b
        L_0x008d:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x0093:
            if (r8 < r3) goto L_0x009b
            r0 = 132(0x84, float:1.85E-43)
            if (r8 > r0) goto L_0x009b
            goto L_0x012b
        L_0x009b:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00a1:
            if (r8 < r3) goto L_0x00a9
            r0 = 131(0x83, float:1.84E-43)
            if (r8 > r0) goto L_0x00a9
            goto L_0x012b
        L_0x00a9:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00af:
            if (r8 == r3) goto L_0x012b
            if (r8 != r1) goto L_0x00b5
            goto L_0x012b
        L_0x00b5:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00bb:
            if (r8 < r3) goto L_0x00c1
            if (r8 > r6) goto L_0x00c1
            goto L_0x012b
        L_0x00c1:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00c7:
            r0 = 16
            r1 = 18
            if (r8 < r0) goto L_0x00d1
            r0 = 19
            if (r8 <= r0) goto L_0x012b
        L_0x00d1:
            r8 = 18
            goto L_0x012b
        L_0x00d4:
            if (r8 < r3) goto L_0x00db
            r0 = 151(0x97, float:2.12E-43)
            if (r8 > r0) goto L_0x00db
            goto L_0x012b
        L_0x00db:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00e1:
            if (r8 == r3) goto L_0x012b
            if (r8 != r1) goto L_0x00e6
            goto L_0x012b
        L_0x00e6:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00ec:
            if (r8 != r3) goto L_0x00ef
            goto L_0x012b
        L_0x00ef:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x00f5:
            r0 = 193(0xc1, float:2.7E-43)
            if (r8 <= r0) goto L_0x00fd
            if (r8 >= r5) goto L_0x00fd
            goto L_0x006f
        L_0x00fd:
            r0 = 228(0xe4, float:3.2E-43)
            if (r8 <= r0) goto L_0x0103
            goto L_0x0077
        L_0x0103:
            if (r8 < r3) goto L_0x0077
            if (r8 <= r3) goto L_0x012b
            if (r8 >= r4) goto L_0x012b
            goto L_0x0116
        L_0x010a:
            r0 = 194(0xc2, float:2.72E-43)
            if (r8 <= r0) goto L_0x0112
            if (r8 >= r5) goto L_0x0112
            goto L_0x006f
        L_0x0112:
            r0 = 227(0xe3, float:3.18E-43)
            if (r8 <= r0) goto L_0x0118
        L_0x0116:
            goto L_0x0077
        L_0x0118:
            if (r8 < r3) goto L_0x0077
            if (r8 <= r3) goto L_0x012b
            if (r8 >= r4) goto L_0x012b
            goto L_0x0077
        L_0x0120:
            if (r8 == r3) goto L_0x012b
            if (r8 != r1) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            com.android.f.a.b r8 = new com.android.f.a.b
            r8.<init>(r2)
            throw r8
        L_0x012b:
            android.util.SparseArray r0 = r7.f16334a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5131p.mo10173f(int, int):void");
    }
}
