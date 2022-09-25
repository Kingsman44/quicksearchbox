package com.android.p275j.p276a;

import android.text.TextUtils;
import com.android.p275j.C5188ab;
import com.android.p275j.C5190b;
import com.android.p275j.C5191c;
import com.android.p275j.C5199k;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.android.j.a.g */
/* compiled from: PG */
public final class C5177g implements C5191c {

    /* renamed from: a */
    private final Map f16451a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f16452b = 0;

    /* renamed from: c */
    private final C5185o f16453c;

    public C5177g(C5185o oVar) {
        this.f16453c = oVar;
    }

    /* renamed from: e */
    static int m14119e(InputStream inputStream) {
        return (m14126n(inputStream) << 24) | m14126n(inputStream) | (m14126n(inputStream) << 8) | (m14126n(inputStream) << 16);
    }

    /* renamed from: f */
    static long m14120f(InputStream inputStream) {
        return (((long) m14126n(inputStream)) & 255) | ((((long) m14126n(inputStream)) & 255) << 8) | ((((long) m14126n(inputStream)) & 255) << 16) | ((((long) m14126n(inputStream)) & 255) << 24) | ((((long) m14126n(inputStream)) & 255) << 32) | ((((long) m14126n(inputStream)) & 255) << 40) | ((((long) m14126n(inputStream)) & 255) << 48) | ((255 & ((long) m14126n(inputStream))) << 56);
    }

    /* renamed from: h */
    static String m14121h(C5176f fVar) {
        return new String(m14125m(fVar, m14120f(fVar)), "UTF-8");
    }

    /* renamed from: j */
    static void m14122j(OutputStream outputStream, int i) {
        outputStream.write(i & PrivateKeyType.INVALID);
        outputStream.write((i >> 8) & PrivateKeyType.INVALID);
        outputStream.write((i >> 16) & PrivateKeyType.INVALID);
        outputStream.write((i >> 24) & PrivateKeyType.INVALID);
    }

    /* renamed from: k */
    static void m14123k(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: l */
    static void m14124l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m14123k(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: m */
    static byte[] m14125m(C5176f fVar, long j) {
        long j2 = fVar.f16449a - fVar.f16450b;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(fVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + j2);
    }

    /* renamed from: n */
    private static int m14126n(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: o */
    private final void m14127o(String str, C5175e eVar) {
        if (!this.f16451a.containsKey(str)) {
            this.f16452b += eVar.f16441a;
        } else {
            this.f16452b += eVar.f16441a - ((C5175e) this.f16451a.get(str)).f16441a;
        }
        this.f16451a.put(str, eVar);
    }

    /* renamed from: p */
    private final void m14128p(String str) {
        C5175e eVar = (C5175e) this.f16451a.remove(str);
        if (eVar != null) {
            this.f16452b -= eVar.f16441a;
        }
    }

    /* renamed from: q */
    private static final String m14129q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    /* renamed from: a */
    public final synchronized C5190b mo10260a(String str) {
        C5176f fVar;
        C5175e eVar = (C5175e) this.f16451a.get(str);
        if (eVar == null) {
            return null;
        }
        File g = mo10264g(str);
        try {
            fVar = new C5176f(new BufferedInputStream(new FileInputStream(g)), g.length());
            C5175e a = C5175e.m14118a(fVar);
            if (!TextUtils.equals(str, a.f16442b)) {
                C5188ab.m14147b("%s: key=%s, found=%s", g.getAbsolutePath(), str, a.f16442b);
                m14128p(str);
                fVar.close();
                return null;
            }
            byte[] m = m14125m(fVar, fVar.f16449a - fVar.f16450b);
            C5190b bVar = new C5190b();
            bVar.f16474a = m;
            bVar.f16475b = eVar.f16443c;
            bVar.f16476c = eVar.f16444d;
            bVar.f16477d = eVar.f16445e;
            bVar.f16478e = eVar.f16446f;
            bVar.f16479f = eVar.f16447g;
            List<C5199k> list = eVar.f16448h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C5199k kVar : list) {
                treeMap.put(kVar.f16498a, kVar.f16499b);
            }
            bVar.f16480g = treeMap;
            bVar.f16481h = Collections.unmodifiableList(eVar.f16448h);
            fVar.close();
            return bVar;
        } catch (IOException e) {
            C5188ab.m14147b("%s: %s", g.getAbsolutePath(), e.toString());
            mo10265i(str);
            return null;
        } catch (Throwable th) {
            fVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10261b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.android.j.a.o r0 = r9.f16453c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.mo10273a()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.android.p275j.C5188ab.m14148c(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.android.j.a.f r6 = new com.android.j.a.f     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.android.j.a.e r7 = com.android.p275j.p276a.C5175e.m14118a(r6)     // Catch:{ all -> 0x0055 }
            r7.f16441a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f16442b     // Catch:{ all -> 0x0055 }
            r9.m14127o(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0066
        L_0x0065:
            throw r0
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.p276a.C5177g.mo10261b():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01b3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10262c(java.lang.String r23, com.android.p275j.C5190b r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            monitor-enter(r22)
            long r2 = r1.f16452b     // Catch:{ all -> 0x01ec }
            byte[] r4 = r0.f16474a     // Catch:{ all -> 0x01ec }
            int r4 = r4.length     // Catch:{ all -> 0x01ec }
            long r5 = (long) r4
            long r2 = r2 + r5
            r5 = 1250951168(0x4a900000, float:4718592.0)
            r6 = 5242880(0x500000, double:2.590327E-317)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x001d
            float r2 = (float) r4
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            monitor-exit(r22)
            return
        L_0x001d:
            java.io.File r2 = r22.mo10264g(r23)     // Catch:{ all -> 0x01ec }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x01b3 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01b3 }
            r9.<init>(r2)     // Catch:{ IOException -> 0x01b3 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x01b3 }
            com.android.j.a.e r9 = new com.android.j.a.e     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r12 = r0.f16475b     // Catch:{ IOException -> 0x01b3 }
            long r13 = r0.f16476c     // Catch:{ IOException -> 0x01b3 }
            long r10 = r0.f16477d     // Catch:{ IOException -> 0x01b3 }
            long r5 = r0.f16478e     // Catch:{ IOException -> 0x01b3 }
            long r3 = r0.f16479f     // Catch:{ IOException -> 0x01b3 }
            java.util.List r15 = r0.f16481h     // Catch:{ IOException -> 0x01b3 }
            if (r15 != 0) goto L_0x007c
            java.util.Map r15 = r0.f16480g     // Catch:{ IOException -> 0x01b3 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b3 }
            r16 = r10
            int r10 = r15.size()     // Catch:{ IOException -> 0x01b3 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x01b3 }
            java.util.Set r10 = r15.entrySet()     // Catch:{ IOException -> 0x01b3 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x01b3 }
        L_0x0050:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x01b3 }
            if (r11 == 0) goto L_0x0077
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x01b3 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IOException -> 0x01b3 }
            com.android.j.k r15 = new com.android.j.k     // Catch:{ IOException -> 0x01b3 }
            java.lang.Object r18 = r11.getKey()     // Catch:{ IOException -> 0x01b3 }
            r19 = r10
            r10 = r18
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01b3 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01b3 }
            r15.<init>(r10, r11)     // Catch:{ IOException -> 0x01b3 }
            r7.add(r15)     // Catch:{ IOException -> 0x01b3 }
            r10 = r19
            goto L_0x0050
        L_0x0077:
            r21 = r7
            r15 = r16
            goto L_0x007f
        L_0x007c:
            r21 = r15
            r15 = r10
        L_0x007f:
            r10 = r9
            r11 = r23
            r17 = r5
            r19 = r3
            r10.<init>(r11, r12, r13, r15, r17, r19, r21)     // Catch:{ IOException -> 0x01b3 }
            r3 = 538247942(0x20150306, float:1.2621791E-19)
            m14122j(r8, r3)     // Catch:{ IOException -> 0x018b }
            java.lang.String r3 = r9.f16442b     // Catch:{ IOException -> 0x018b }
            m14124l(r8, r3)     // Catch:{ IOException -> 0x018b }
            java.lang.String r3 = r9.f16443c     // Catch:{ IOException -> 0x018b }
            if (r3 != 0) goto L_0x009a
            java.lang.String r3 = ""
        L_0x009a:
            m14124l(r8, r3)     // Catch:{ IOException -> 0x018b }
            long r3 = r9.f16444d     // Catch:{ IOException -> 0x018b }
            m14123k(r8, r3)     // Catch:{ IOException -> 0x018b }
            long r3 = r9.f16445e     // Catch:{ IOException -> 0x018b }
            m14123k(r8, r3)     // Catch:{ IOException -> 0x018b }
            long r3 = r9.f16446f     // Catch:{ IOException -> 0x018b }
            m14123k(r8, r3)     // Catch:{ IOException -> 0x018b }
            long r3 = r9.f16447g     // Catch:{ IOException -> 0x018b }
            m14123k(r8, r3)     // Catch:{ IOException -> 0x018b }
            java.util.List r3 = r9.f16448h     // Catch:{ IOException -> 0x018b }
            if (r3 == 0) goto L_0x00d7
            int r4 = r3.size()     // Catch:{ IOException -> 0x018b }
            m14122j(r8, r4)     // Catch:{ IOException -> 0x018b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x018b }
        L_0x00c0:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x018b }
            if (r4 == 0) goto L_0x00db
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x018b }
            com.android.j.k r4 = (com.android.p275j.C5199k) r4     // Catch:{ IOException -> 0x018b }
            java.lang.String r5 = r4.f16498a     // Catch:{ IOException -> 0x018b }
            m14124l(r8, r5)     // Catch:{ IOException -> 0x018b }
            java.lang.String r4 = r4.f16499b     // Catch:{ IOException -> 0x018b }
            m14124l(r8, r4)     // Catch:{ IOException -> 0x018b }
            goto L_0x00c0
        L_0x00d7:
            r3 = 0
            m14122j(r8, r3)     // Catch:{ IOException -> 0x018b }
        L_0x00db:
            r8.flush()     // Catch:{ IOException -> 0x018b }
            byte[] r0 = r0.f16474a     // Catch:{ IOException -> 0x01b3 }
            r8.write(r0)     // Catch:{ IOException -> 0x01b3 }
            r8.close()     // Catch:{ IOException -> 0x01b3 }
            long r3 = r2.length()     // Catch:{ IOException -> 0x01b3 }
            r9.f16441a = r3     // Catch:{ IOException -> 0x01b3 }
            r0 = r23
            r1.m14127o(r0, r9)     // Catch:{ IOException -> 0x01b3 }
            long r3 = r1.f16452b     // Catch:{ IOException -> 0x01b3 }
            r5 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fc
            goto L_0x01ea
        L_0x00fc:
            boolean r0 = com.android.p275j.C5188ab.f16468b     // Catch:{ IOException -> 0x01b3 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "Pruning old cache entries."
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01b3 }
            com.android.p275j.C5188ab.m14150e(r0, r4)     // Catch:{ IOException -> 0x01b3 }
        L_0x0108:
            long r3 = r1.f16452b     // Catch:{ IOException -> 0x01b3 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01b3 }
            java.util.Map r0 = r1.f16451a     // Catch:{ IOException -> 0x01b3 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x01b3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01b3 }
            r8 = 0
        L_0x0119:
            boolean r7 = r0.hasNext()     // Catch:{ IOException -> 0x01b3 }
            r9 = 2
            if (r7 == 0) goto L_0x0161
            java.lang.Object r7 = r0.next()     // Catch:{ IOException -> 0x01b3 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x01b3 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x01b3 }
            com.android.j.a.e r7 = (com.android.p275j.p276a.C5175e) r7     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r10 = r7.f16442b     // Catch:{ IOException -> 0x01b3 }
            java.io.File r10 = r1.mo10264g(r10)     // Catch:{ IOException -> 0x01b3 }
            boolean r10 = r10.delete()     // Catch:{ IOException -> 0x01b3 }
            if (r10 == 0) goto L_0x0140
            long r10 = r1.f16452b     // Catch:{ IOException -> 0x01b3 }
            long r12 = r7.f16441a     // Catch:{ IOException -> 0x01b3 }
            long r10 = r10 - r12
            r1.f16452b = r10     // Catch:{ IOException -> 0x01b3 }
            goto L_0x0153
        L_0x0140:
            java.lang.String r10 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r7 = r7.f16442b     // Catch:{ IOException -> 0x01b3 }
            r12 = 0
            r11[r12] = r7     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r7 = m14129q(r7)     // Catch:{ IOException -> 0x01b3 }
            r12 = 1
            r11[r12] = r7     // Catch:{ IOException -> 0x01b3 }
            com.android.p275j.C5188ab.m14147b(r10, r11)     // Catch:{ IOException -> 0x01b3 }
        L_0x0153:
            r0.remove()     // Catch:{ IOException -> 0x01b3 }
            int r8 = r8 + 1
            long r10 = r1.f16452b     // Catch:{ IOException -> 0x01b3 }
            float r10 = (float) r10     // Catch:{ IOException -> 0x01b3 }
            r11 = 1250951168(0x4a900000, float:4718592.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0119
        L_0x0161:
            boolean r0 = com.android.p275j.C5188ab.f16468b     // Catch:{ IOException -> 0x01b3 }
            if (r0 == 0) goto L_0x01ea
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x01b3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x01b3 }
            r10 = 0
            r0[r10] = r8     // Catch:{ IOException -> 0x01b3 }
            long r10 = r1.f16452b     // Catch:{ IOException -> 0x01b3 }
            long r10 = r10 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x01b3 }
            r4 = 1
            r0[r4] = r3     // Catch:{ IOException -> 0x01b3 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01b3 }
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x01b3 }
            r0[r9] = r3     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            com.android.p275j.C5188ab.m14150e(r3, r0)     // Catch:{ IOException -> 0x01b3 }
            monitor-exit(r22)
            return
        L_0x018b:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01b3 }
            r3 = 0
            r4[r3] = r0     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r0 = "%s"
            com.android.p275j.C5188ab.m14147b(r0, r4)     // Catch:{ IOException -> 0x01b3 }
            r8.close()     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r0 = "Failed to write header for %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r3 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x01b3 }
            r5 = 0
            r4[r5] = r3     // Catch:{ IOException -> 0x01b3 }
            com.android.p275j.C5188ab.m14147b(r0, r4)     // Catch:{ IOException -> 0x01b3 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01b3 }
            r0.<init>()     // Catch:{ IOException -> 0x01b3 }
            throw r0     // Catch:{ IOException -> 0x01b3 }
        L_0x01b3:
            boolean r0 = r2.delete()     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x01c8
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r3 = 0
            r0[r3] = r2     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = "Could not clean up file %s"
            com.android.p275j.C5188ab.m14147b(r2, r0)     // Catch:{ all -> 0x01ec }
        L_0x01c8:
            com.android.j.a.o r0 = r1.f16453c     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r0.mo10273a()     // Catch:{ all -> 0x01ec }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x01ea
            java.lang.String r0 = "Re-initializing cache after external clearing."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ec }
            com.android.p275j.C5188ab.m14147b(r0, r2)     // Catch:{ all -> 0x01ec }
            java.util.Map r0 = r1.f16451a     // Catch:{ all -> 0x01ec }
            r0.clear()     // Catch:{ all -> 0x01ec }
            r2 = 0
            r1.f16452b = r2     // Catch:{ all -> 0x01ec }
            r22.mo10261b()     // Catch:{ all -> 0x01ec }
            monitor-exit(r22)
            return
        L_0x01ea:
            monitor-exit(r22)
            return
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r22)
            goto L_0x01f0
        L_0x01ef:
            throw r0
        L_0x01f0:
            goto L_0x01ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.p276a.C5177g.mo10262c(java.lang.String, com.android.j.b):void");
    }

    /* renamed from: d */
    public final synchronized void mo10263d(String str) {
        C5190b a = mo10260a(str);
        if (a != null) {
            a.f16479f = 0;
            a.f16478e = 0;
            mo10262c(str, a);
        }
    }

    /* renamed from: g */
    public final File mo10264g(String str) {
        return new File(this.f16453c.mo10273a(), m14129q(str));
    }

    /* renamed from: i */
    public final synchronized void mo10265i(String str) {
        boolean delete = mo10264g(str).delete();
        m14128p(str);
        if (!delete) {
            C5188ab.m14147b("Could not delete cache entry for key=%s, filename=%s", str, m14129q(str));
        }
    }
}
