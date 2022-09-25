package com.google.android.gms.appdatasearch;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.appdatasearch.an */
/* compiled from: PG */
public final class C142798an implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r25
            int r1 = com.google.android.gms.common.internal.safeparcel.C143946b.m234059h(r25)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r18 = r16
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r11 = 0
            r17 = 0
            r23 = 0
        L_0x0023:
            int r3 = r25.dataPosition()
            if (r3 >= r1) goto L_0x00c3
            int r3 = r25.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a6;
                case 5: goto L_0x009b;
                case 6: goto L_0x0091;
                case 7: goto L_0x008b;
                case 8: goto L_0x0086;
                case 9: goto L_0x0081;
                case 10: goto L_0x007c;
                case 11: goto L_0x0067;
                case 12: goto L_0x0062;
                case 13: goto L_0x005b;
                case 14: goto L_0x0056;
                case 15: goto L_0x0051;
                case 16: goto L_0x0046;
                case 17: goto L_0x0041;
                case 18: goto L_0x003c;
                case 19: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234076y(r0, r3)
            goto L_0x0023
        L_0x0035:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234077z(r0, r3)
            r23 = r3
            goto L_0x0023
        L_0x003c:
            byte[] r22 = com.google.android.gms.common.internal.safeparcel.C143946b.m234044A(r0, r3)
            goto L_0x0023
        L_0x0041:
            int[] r21 = com.google.android.gms.common.internal.safeparcel.C143946b.m234045B(r0, r3)
            goto L_0x0023
        L_0x0046:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object[] r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234047D(r0, r3, r4)
            r20 = r3
            android.os.Bundle[] r20 = (android.os.Bundle[]) r20
            goto L_0x0023
        L_0x0051:
            long[] r19 = com.google.android.gms.common.internal.safeparcel.C143946b.m234046C(r0, r3)
            goto L_0x0023
        L_0x0056:
            long[] r18 = com.google.android.gms.common.internal.safeparcel.C143946b.m234046C(r0, r3)
            goto L_0x0023
        L_0x005b:
            int r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234057f(r0, r3)
            r17 = r3
            goto L_0x0023
        L_0x0062:
            android.os.Bundle r16 = com.google.android.gms.common.internal.safeparcel.C143946b.m234061j(r0, r3)
            goto L_0x0023
        L_0x0067:
            int r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234058g(r0, r3)
            int r4 = r25.dataPosition()
            if (r3 != 0) goto L_0x0073
            r15 = r2
            goto L_0x0023
        L_0x0073:
            double[] r15 = r25.createDoubleArray()
            int r4 = r4 + r3
            r0.setDataPosition(r4)
            goto L_0x0023
        L_0x007c:
            byte[] r14 = com.google.android.gms.common.internal.safeparcel.C143946b.m234044A(r0, r3)
            goto L_0x0023
        L_0x0081:
            java.lang.String[] r13 = com.google.android.gms.common.internal.safeparcel.C143946b.m234048E(r0, r3)
            goto L_0x0023
        L_0x0086:
            int[] r12 = com.google.android.gms.common.internal.safeparcel.C143946b.m234045B(r0, r3)
            goto L_0x0023
        L_0x008b:
            int r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234057f(r0, r3)
            r11 = r3
            goto L_0x0023
        L_0x0091:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object[] r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234047D(r0, r3, r4)
            r10 = r3
            android.os.Bundle[] r10 = (android.os.Bundle[]) r10
            goto L_0x0023
        L_0x009b:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object[] r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234047D(r0, r3, r4)
            r9 = r3
            android.os.Bundle[] r9 = (android.os.Bundle[]) r9
            goto L_0x0023
        L_0x00a6:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object[] r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234047D(r0, r3, r4)
            r8 = r3
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0023
        L_0x00b1:
            byte[] r7 = com.google.android.gms.common.internal.safeparcel.C143946b.m234044A(r0, r3)
            goto L_0x0023
        L_0x00b7:
            int[] r6 = com.google.android.gms.common.internal.safeparcel.C143946b.m234045B(r0, r3)
            goto L_0x0023
        L_0x00bd:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.C143946b.m234069r(r0, r3)
            goto L_0x0023
        L_0x00c3:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234074w(r0, r1)
            com.google.android.gms.appdatasearch.SearchResults r0 = new com.google.android.gms.appdatasearch.SearchResults
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.C142798an.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }
}
