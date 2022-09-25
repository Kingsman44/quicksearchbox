package androidx.p114h.p115a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.h.a.c */
/* compiled from: PG */
public final class C2271c {

    /* renamed from: a */
    public final int f6368a;

    /* renamed from: b */
    public final int f6369b;

    /* renamed from: c */
    public final long f6370c;

    /* renamed from: d */
    public final byte[] f6371d;

    public C2271c(int i, int i2, long j, byte[] bArr) {
        this.f6368a = i;
        this.f6369b = i2;
        this.f6370c = j;
        this.f6371d = bArr;
    }

    /* renamed from: c */
    public static C2271c m6180c(String str) {
        byte[] bytes = (str + 0).getBytes(C2275g.f6400h);
        return new C2271c(2, bytes.length, -1, bytes);
    }

    /* renamed from: d */
    public static C2271c m6181d(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2275g.f6397e[4]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            wrap.putInt((int) jArr[i]);
        }
        return new C2271c(4, 1, -1, wrap.array());
    }

    /* renamed from: e */
    public static C2271c m6182e(C2273e eVar, ByteOrder byteOrder) {
        C2273e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2275g.f6397e[5]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            C2273e eVar2 = eVarArr[i];
            wrap.putInt((int) eVar2.f6376a);
            wrap.putInt((int) eVar2.f6377b);
        }
        return new C2271c(5, 1, -1, wrap.array());
    }

    /* renamed from: f */
    public static C2271c m6183f(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2275g.f6397e[3]]);
        wrap.order(byteOrder);
        for (int i2 = 0; i2 <= 0; i2++) {
            wrap.putShort((short) iArr[i2]);
        }
        return new C2271c(3, 1, -1, wrap.array());
    }

    /* renamed from: a */
    public final double mo5661a(ByteOrder byteOrder) {
        Object g = mo5663g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (g instanceof String) {
            return Double.parseDouble((String) g);
        } else {
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof C2273e[]) {
                C2273e[] eVarArr = (C2273e[]) g;
                if (eVarArr.length == 1) {
                    C2273e eVar = eVarArr[0];
                    double d = (double) eVar.f6376a;
                    double d2 = (double) eVar.f6377b;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    return d / d2;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    /* renamed from: b */
    public final int mo5662b(ByteOrder byteOrder) {
        Object g = mo5663g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (g instanceof String) {
            return Integer.parseInt((String) g);
        } else {
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01a1 A[SYNTHETIC, Splitter:B:163:0x01a1] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5663g(java.nio.ByteOrder r11) {
        /*
            r10 = this;
            java.lang.String r0 = "IOException occurred while closing InputStream"
            java.lang.String r1 = "ExifInterface"
            r2 = 0
            androidx.h.a.b r3 = new androidx.h.a.b     // Catch:{ IOException -> 0x018b, all -> 0x0189 }
            byte[] r4 = r10.f6371d     // Catch:{ IOException -> 0x018b, all -> 0x0189 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x018b, all -> 0x0189 }
            r3.f6366c = r11     // Catch:{ IOException -> 0x0187 }
            int r11 = r10.f6368a     // Catch:{ IOException -> 0x0187 }
            r4 = 0
            switch(r11) {
                case 1: goto L_0x0151;
                case 2: goto L_0x0106;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00af;
                case 6: goto L_0x0151;
                case 7: goto L_0x0106;
                case 8: goto L_0x0095;
                case 9: goto L_0x007b;
                case 10: goto L_0x0056;
                case 11: goto L_0x0037;
                case 12: goto L_0x0019;
                default: goto L_0x0014;
            }
        L_0x0014:
            r3.close()     // Catch:{ IOException -> 0x0182 }
            goto L_0x0186
        L_0x0019:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x001d:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x002e
            long r5 = r3.readLong()     // Catch:{ IOException -> 0x0187 }
            double r5 = java.lang.Double.longBitsToDouble(r5)     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x001d
        L_0x002e:
            r3.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0036:
            return r11
        L_0x0037:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x003b:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x004d
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0187 }
            float r5 = java.lang.Float.intBitsToFloat(r5)     // Catch:{ IOException -> 0x0187 }
            double r5 = (double) r5     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x003b
        L_0x004d:
            r3.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0055:
            return r11
        L_0x0056:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            androidx.h.a.e[] r11 = new androidx.p114h.p115a.C2273e[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x005a:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x0072
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0187 }
            long r5 = (long) r5     // Catch:{ IOException -> 0x0187 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x0187 }
            long r7 = (long) r7     // Catch:{ IOException -> 0x0187 }
            androidx.h.a.e r9 = new androidx.h.a.e     // Catch:{ IOException -> 0x0187 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0072:
            r3.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x007a:
            return r11
        L_0x007b:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x007f:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x008c
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x007f
        L_0x008c:
            r3.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0094:
            return r11
        L_0x0095:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x0099:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x00a6
            short r5 = r3.readShort()     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x0099
        L_0x00a6:
            r3.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00ae:
            return r11
        L_0x00af:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            androidx.h.a.e[] r11 = new androidx.p114h.p115a.C2273e[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x00b3:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x00c9
            long r5 = r3.mo5638a()     // Catch:{ IOException -> 0x0187 }
            long r7 = r3.mo5638a()     // Catch:{ IOException -> 0x0187 }
            androidx.h.a.e r9 = new androidx.h.a.e     // Catch:{ IOException -> 0x0187 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x00c9:
            r3.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00d1
        L_0x00cd:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00d1:
            return r11
        L_0x00d2:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x00d6:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x00e3
            long r5 = r3.mo5638a()     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x00d6
        L_0x00e3:
            r3.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00eb:
            return r11
        L_0x00ec:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0187 }
        L_0x00f0:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x00fd
            int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0187 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0187 }
            int r4 = r4 + 1
            goto L_0x00f0
        L_0x00fd:
            r3.close()     // Catch:{ IOException -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0105:
            return r11
        L_0x0106:
            int r11 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            byte[] r5 = androidx.p114h.p115a.C2275g.f6398f     // Catch:{ IOException -> 0x0187 }
            int r5 = r5.length     // Catch:{ IOException -> 0x0187 }
            r5 = 8
            if (r11 < r5) goto L_0x0123
            r11 = 0
        L_0x0110:
            byte[] r6 = androidx.p114h.p115a.C2275g.f6398f     // Catch:{ IOException -> 0x0187 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0187 }
            if (r11 >= r5) goto L_0x0121
            byte[] r7 = r10.f6371d     // Catch:{ IOException -> 0x0187 }
            byte r7 = r7[r11]     // Catch:{ IOException -> 0x0187 }
            byte r6 = r6[r11]     // Catch:{ IOException -> 0x0187 }
            if (r7 == r6) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            int r11 = r11 + 1
            goto L_0x0110
        L_0x0121:
            r4 = 8
        L_0x0123:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0187 }
            r11.<init>()     // Catch:{ IOException -> 0x0187 }
        L_0x0128:
            int r5 = r10.f6369b     // Catch:{ IOException -> 0x0187 }
            if (r4 >= r5) goto L_0x0144
            byte[] r5 = r10.f6371d     // Catch:{ IOException -> 0x0187 }
            byte r5 = r5[r4]     // Catch:{ IOException -> 0x0187 }
            if (r5 != 0) goto L_0x0133
            goto L_0x0144
        L_0x0133:
            r6 = 32
            if (r5 < r6) goto L_0x013c
            char r5 = (char) r5     // Catch:{ IOException -> 0x0187 }
            r11.append(r5)     // Catch:{ IOException -> 0x0187 }
            goto L_0x0141
        L_0x013c:
            r5 = 63
            r11.append(r5)     // Catch:{ IOException -> 0x0187 }
        L_0x0141:
            int r4 = r4 + 1
            goto L_0x0128
        L_0x0144:
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0187 }
            r3.close()     // Catch:{ IOException -> 0x014c }
            goto L_0x0150
        L_0x014c:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0150:
            return r11
        L_0x0151:
            byte[] r11 = r10.f6371d     // Catch:{ IOException -> 0x0187 }
            int r5 = r11.length     // Catch:{ IOException -> 0x0187 }
            r6 = 1
            if (r5 != r6) goto L_0x0172
            byte r5 = r11[r4]     // Catch:{ IOException -> 0x0187 }
            if (r5 < 0) goto L_0x0172
            if (r5 > r6) goto L_0x0172
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0187 }
            char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0187 }
            int r5 = r5 + 48
            char r5 = (char) r5     // Catch:{ IOException -> 0x0187 }
            r6[r4] = r5     // Catch:{ IOException -> 0x0187 }
            r11.<init>(r6)     // Catch:{ IOException -> 0x0187 }
            r3.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0171:
            return r11
        L_0x0172:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0187 }
            java.nio.charset.Charset r5 = androidx.p114h.p115a.C2275g.f6400h     // Catch:{ IOException -> 0x0187 }
            r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0187 }
            r3.close()     // Catch:{ IOException -> 0x017d }
            goto L_0x0181
        L_0x017d:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x0181:
            return r4
        L_0x0182:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x0186:
            return r2
        L_0x0187:
            r11 = move-exception
            goto L_0x018d
        L_0x0189:
            r11 = move-exception
            goto L_0x019f
        L_0x018b:
            r11 = move-exception
            r3 = r2
        L_0x018d:
            java.lang.String r4 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019d }
            if (r3 == 0) goto L_0x019c
            r3.close()     // Catch:{ IOException -> 0x0198 }
            goto L_0x019c
        L_0x0198:
            r11 = move-exception
            android.util.Log.e(r1, r0, r11)
        L_0x019c:
            return r2
        L_0x019d:
            r11 = move-exception
            r2 = r3
        L_0x019f:
            if (r2 == 0) goto L_0x01a9
            r2.close()     // Catch:{ IOException -> 0x01a5 }
            goto L_0x01a9
        L_0x01a5:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x01a9:
            goto L_0x01ab
        L_0x01aa:
            throw r11
        L_0x01ab:
            goto L_0x01aa
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p114h.p115a.C2271c.mo5663g(java.nio.ByteOrder):java.lang.Object");
    }

    /* renamed from: h */
    public final String mo5664h(ByteOrder byteOrder) {
        Object g = mo5663g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    return sb.toString();
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    return sb.toString();
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else if (!(g instanceof C2273e[])) {
            return null;
        } else {
            C2273e[] eVarArr = (C2273e[]) g;
            while (true) {
                int length4 = eVarArr.length;
                if (i >= length4) {
                    return sb.toString();
                }
                sb.append(eVarArr[i].f6376a);
                sb.append('/');
                sb.append(eVarArr[i].f6377b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
    }

    public final String toString() {
        return "(" + C2275g.f6396d[this.f6368a] + ", data length:" + this.f6371d.length + ")";
    }
}
