package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.m */
/* compiled from: PG */
public final class C4632m {

    /* renamed from: a */
    public static final C4632m f14549a = C4631l.m13030a(new HashMap());

    /* renamed from: c */
    private static final String f14550c = C4380ad.m12561i("Data");

    /* renamed from: b */
    Map f14551b;

    C4632m() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC, Splitter:B:27:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[SYNTHETIC, Splitter:B:36:0x006c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0061=Splitter:B:31:0x0061, B:14:0x0035=Splitter:B:14:0x0035} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C4632m m13035a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0081
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004c, ClassNotFoundException -> 0x004a, all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x004c, ClassNotFoundException -> 0x004a, all -> 0x0048 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0044 }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0044 }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0044 }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0044 }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f14550c
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0064
        L_0x0039:
            r7 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r7)
            goto L_0x0064
        L_0x0040:
            r7 = move-exception
            r1 = r7
            r7 = r3
            goto L_0x006a
        L_0x0044:
            r7 = move-exception
            goto L_0x0050
        L_0x0046:
            r7 = move-exception
            goto L_0x0050
        L_0x0048:
            r1 = move-exception
            goto L_0x006a
        L_0x004a:
            r3 = move-exception
            goto L_0x004d
        L_0x004c:
            r3 = move-exception
        L_0x004d:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0050:
            java.lang.String r4 = f14550c     // Catch:{ all -> 0x0040 }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x0061
            r3.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x0061
        L_0x005b:
            r7 = move-exception
            java.lang.String r3 = f14550c
            android.util.Log.e(r3, r0, r7)
        L_0x0061:
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0064:
            androidx.work.m r7 = new androidx.work.m
            r7.<init>((java.util.Map) r1)
            return r7
        L_0x006a:
            if (r7 == 0) goto L_0x0076
            r7.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0076
        L_0x0070:
            r7 = move-exception
            java.lang.String r3 = f14550c
            android.util.Log.e(r3, r0, r7)
        L_0x0076:
            r2.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r7 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r7)
        L_0x0080:
            throw r1
        L_0x0081:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L_0x008a
        L_0x0089:
            throw r7
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C4632m.m13035a(byte[]):androidx.work.m");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[SYNTHETIC, Splitter:B:31:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m13036e(androidx.work.C4632m r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006e }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006e }
            java.util.Map r2 = r5.f14551b     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Map r5 = r5.f14551b     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            r2 = r3
            goto L_0x008f
        L_0x0069:
            r5 = move-exception
            r2 = r3
            goto L_0x006f
        L_0x006c:
            r5 = move-exception
            goto L_0x008f
        L_0x006e:
            r5 = move-exception
        L_0x006f:
            java.lang.String r3 = f14550c     // Catch:{ all -> 0x006c }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006c }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0084
        L_0x007e:
            r2 = move-exception
            java.lang.String r3 = f14550c
            android.util.Log.e(r3, r0, r2)
        L_0x0084:
            r1.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r1 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r1)
        L_0x008e:
            return r5
        L_0x008f:
            if (r2 == 0) goto L_0x009b
            r2.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009b
        L_0x0095:
            r2 = move-exception
            java.lang.String r3 = f14550c
            android.util.Log.e(r3, r0, r2)
        L_0x009b:
            r1.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r2 = f14550c
            android.util.Log.e(r2, r0, r1)
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r5
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C4632m.m13036e(androidx.work.m):byte[]");
    }

    /* renamed from: f */
    public static Boolean[] m13037f(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: g */
    public static Byte[] m13038g(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: h */
    public static Double[] m13039h(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: i */
    public static Float[] m13040i(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: j */
    public static Integer[] m13041j(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: k */
    public static Long[] m13042k(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* renamed from: b */
    public final String mo9567b(String str) {
        Object obj = this.f14551b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo9568c(String str, Class cls) {
        Object obj = this.f14551b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    /* renamed from: d */
    public final byte[] mo9569d(String str) {
        Object obj = this.f14551b.get(str);
        if (!(obj instanceof Byte[])) {
            return null;
        }
        Byte[] bArr = (Byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4632m mVar = (C4632m) obj;
        Set<String> keySet = this.f14551b.keySet();
        if (!keySet.equals(mVar.f14551b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f14551b.get(str);
            Object obj3 = mVar.f14551b.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f14551b.hashCode() * 31;
    }

    /* renamed from: l */
    public final long mo9572l(long j) {
        Object obj = this.f14551b.get("com.google.android.libraries.privatetelemetry.tqcobalt.worker.DISABLED_TIME");
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f14551b.isEmpty()) {
            for (String str : this.f14551b.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f14551b.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C4632m(C4632m mVar) {
        this.f14551b = new HashMap(mVar.f14551b);
    }

    public C4632m(Map map) {
        this.f14551b = new HashMap(map);
    }
}
