package com.android.p266f.p267a.p268a;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import androidx.p060c.C0984n;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.android.f.a.a.n */
/* compiled from: PG */
public final class C5129n {

    /* renamed from: d */
    private static C0984n f16325d = new C0984n(0);

    /* renamed from: a */
    protected ByteArrayOutputStream f16326a = null;

    /* renamed from: b */
    protected int f16327b = 0;

    /* renamed from: c */
    public C5126k f16328c = null;

    /* renamed from: e */
    private final C5121f f16329e;

    /* renamed from: f */
    private final ContentResolver f16330f;

    /* renamed from: g */
    private C5131p f16331g = null;

    static {
        int i = 0;
        while (true) {
            int i2 = C5130o.f16333b;
            if (i < 83) {
                f16325d.put(C5130o.f16332a[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    public C5129n(Context context, C5121f fVar) {
        this.f16329e = fVar;
        this.f16330f = context.getContentResolver();
        this.f16331g = fVar.f16312a;
        this.f16328c = new C5126k(this);
        this.f16326a = new ByteArrayOutputStream();
        this.f16327b = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e6, code lost:
        if (r14 != null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ec, code lost:
        if (r14 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f3, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fb, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01da A[ExcHandler: all (r0v17 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:57:0x018c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[ExcHandler: RuntimeException (unused java.lang.RuntimeException), SYNTHETIC, Splitter:B:57:0x018c] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f7 A[SYNTHETIC, Splitter:B:92:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC, Splitter:B:99:0x01ff] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14009l() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = ">"
            java.lang.String r3 = "<"
            com.android.f.a.a.k r0 = r1.f16328c
            r0.mo10155c()
            com.android.f.a.a.k r0 = r1.f16328c
            com.android.f.a.a.m r4 = r0.mo10153a()
            java.lang.String r0 = new java.lang.String
            com.android.f.a.a.p r5 = r1.f16331g
            r6 = 132(0x84, float:1.85E-43)
            byte[] r5 = r5.mo10175h(r6)
            r0.<init>(r5)
            androidx.c.n r5 = f16325d
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5 = 1
            if (r0 != 0) goto L_0x002a
            return r5
        L_0x002a:
            int r0 = r0.intValue()
            r1.mo10162e(r0)
            com.android.f.a.a.f r0 = r1.f16329e
            com.android.f.a.a.g r0 = (com.android.p266f.p267a.p268a.C5122g) r0
            com.android.f.a.a.j r6 = r0.f16313b
            r7 = 0
            if (r6 == 0) goto L_0x0204
            java.util.Vector r0 = r6.f16314a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0044
            goto L_0x0204
        L_0x0044:
            r8 = 62
            r9 = 60
            r10 = -1
            com.android.f.a.a.r r0 = r6.mo10150a(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            byte[] r11 = r0.mo10183f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            if (r11 == 0) goto L_0x0081
            r12 = 138(0x8a, float:1.93E-43)
            r1.mo10158a(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            byte r12 = r11[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            if (r12 != r9) goto L_0x0066
            int r12 = r11.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            int r12 = r12 + r10
            byte r12 = r11[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            if (r12 != r8) goto L_0x0066
            r1.mo10163f(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            goto L_0x0081
        L_0x0066:
            java.lang.String r12 = new java.lang.String     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r12.<init>(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r11.<init>(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r11.append(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r11.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            java.lang.String r11 = r11.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            byte[] r11 = r11.getBytes()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r1.mo10163f(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
        L_0x0081:
            r11 = 137(0x89, float:1.92E-43)
            r1.mo10158a(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            byte[] r0 = r0.mo10185h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r1.mo10163f(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0092:
            int r0 = r4.mo10157a()
            com.android.f.a.a.k r4 = r1.f16328c
            r4.mo10156d()
            long r11 = (long) r0
            r1.mo10165h(r11)
            com.android.f.a.a.k r0 = r1.f16328c
            r0.mo10154b()
            java.util.Vector r0 = r6.f16314a
            int r0 = r0.size()
            long r11 = (long) r0
            r1.mo10164g(r11)
            r4 = 0
        L_0x00af:
            if (r4 >= r0) goto L_0x0203
            com.android.f.a.a.r r11 = r6.mo10150a(r4)
            com.android.f.a.a.k r12 = r1.f16328c
            r12.mo10155c()
            com.android.f.a.a.k r12 = r1.f16328c
            com.android.f.a.a.m r12 = r12.mo10153a()
            com.android.f.a.a.k r13 = r1.f16328c
            r13.mo10155c()
            com.android.f.a.a.k r13 = r1.f16328c
            com.android.f.a.a.m r13 = r13.mo10153a()
            byte[] r14 = r11.mo10185h()
            if (r14 != 0) goto L_0x00d2
            return r5
        L_0x00d2:
            androidx.c.n r15 = f16325d
            java.lang.String r5 = new java.lang.String
            r5.<init>(r14)
            java.lang.Object r5 = r15.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x00e5
            r1.mo10163f(r14)
            goto L_0x00ec
        L_0x00e5:
            int r5 = r5.intValue()
            r1.mo10162e(r5)
        L_0x00ec:
            byte[] r5 = r11.mo10188k()
            if (r5 != 0) goto L_0x0104
            byte[] r5 = r11.mo10187j()
            if (r5 != 0) goto L_0x0104
            byte[] r5 = r11.mo10184g()
            if (r5 != 0) goto L_0x0104
            java.lang.String r5 = "smil.xml"
            byte[] r5 = r5.getBytes()
        L_0x0104:
            r14 = 133(0x85, float:1.86E-43)
            r1.mo10158a(r14)
            r1.mo10163f(r5)
            android.util.SparseArray r5 = r11.f16340a
            r14 = 129(0x81, float:1.81E-43)
            java.lang.Object r5 = r5.get(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x011a
            r5 = 0
            goto L_0x011e
        L_0x011a:
            int r5 = r5.intValue()
        L_0x011e:
            if (r5 == 0) goto L_0x0126
            r1.mo10158a(r14)
            r1.mo10162e(r5)
        L_0x0126:
            int r5 = r13.mo10157a()
            com.android.f.a.a.k r13 = r1.f16328c
            r13.mo10156d()
            long r13 = (long) r5
            r1.mo10165h(r13)
            com.android.f.a.a.k r5 = r1.f16328c
            r5.mo10154b()
            byte[] r5 = r11.mo10183f()
            if (r5 == 0) goto L_0x016c
            r13 = 192(0xc0, float:2.69E-43)
            r1.mo10158a(r13)
            byte r13 = r5[r7]
            if (r13 != r9) goto L_0x0151
            int r13 = r5.length
            int r13 = r13 + r10
            byte r13 = r5[r13]
            if (r13 != r8) goto L_0x0151
            r1.mo10161d(r5)
            goto L_0x016c
        L_0x0151:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r13)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            byte[] r5 = r5.getBytes()
            r1.mo10161d(r5)
        L_0x016c:
            byte[] r5 = r11.mo10184g()
            if (r5 == 0) goto L_0x017a
            r13 = 142(0x8e, float:1.99E-43)
            r1.mo10158a(r13)
            r1.mo10163f(r5)
        L_0x017a:
            int r5 = r12.mo10157a()
            byte[] r13 = r11.mo10186i()
            if (r13 == 0) goto L_0x0189
            int r11 = r13.length
            r1.mo10167j(r13, r11)
            goto L_0x01b2
        L_0x0189:
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            byte[] r13 = new byte[r13]     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01f3, RuntimeException -> 0x01dc, all -> 0x01da }
            android.content.ContentResolver r15 = r1.f16330f     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            android.net.Uri r11 = r11.f16341b     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            java.io.InputStream r14 = r15.openInputStream(r11)     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            r11 = 0
        L_0x0197:
            int r15 = r14.read(r13)     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            if (r15 == r10) goto L_0x01ab
            java.io.ByteArrayOutputStream r8 = r1.f16326a     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            r8.write(r13, r7, r15)     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            int r8 = r1.f16327b     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            int r8 = r8 + r15
            r1.f16327b = r8     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01e2, RuntimeException -> 0x01dc, all -> 0x01da }
            int r11 = r11 + r15
            r8 = 62
            goto L_0x0197
        L_0x01ab:
            if (r14 == 0) goto L_0x01b2
            r14.close()     // Catch:{ IOException -> 0x01b1 }
            goto L_0x01b2
        L_0x01b1:
        L_0x01b2:
            int r8 = r12.mo10157a()
            int r8 = r8 - r5
            if (r11 != r8) goto L_0x01d2
            com.android.f.a.a.k r8 = r1.f16328c
            r8.mo10156d()
            long r12 = (long) r5
            r1.mo10164g(r12)
            long r11 = (long) r11
            r1.mo10164g(r11)
            com.android.f.a.a.k r5 = r1.f16328c
            r5.mo10154b()
            int r4 = r4 + 1
            r5 = 1
            r8 = 62
            goto L_0x00af
        L_0x01d2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "BUG: Length sanity check failed"
            r0.<init>(r2)
            throw r0
        L_0x01da:
            r0 = move-exception
            goto L_0x01e6
        L_0x01dc:
            goto L_0x01ec
        L_0x01de:
            r2 = 1
            goto L_0x01f5
        L_0x01e0:
            r2 = 1
            goto L_0x01fd
        L_0x01e2:
            goto L_0x01de
        L_0x01e4:
            goto L_0x01e0
        L_0x01e6:
            if (r14 == 0) goto L_0x01eb
            r14.close()     // Catch:{ IOException -> 0x01eb }
        L_0x01eb:
            throw r0
        L_0x01ec:
            if (r14 == 0) goto L_0x01f1
            r14.close()     // Catch:{ IOException -> 0x01f1 }
        L_0x01f1:
            r2 = 1
            return r2
        L_0x01f3:
            r2 = 1
        L_0x01f5:
            if (r14 == 0) goto L_0x01fa
            r14.close()     // Catch:{ IOException -> 0x01fa }
        L_0x01fa:
            return r2
        L_0x01fb:
            r2 = 1
        L_0x01fd:
            if (r14 == 0) goto L_0x0202
            r14.close()     // Catch:{ IOException -> 0x0202 }
        L_0x0202:
            return r2
        L_0x0203:
            return r7
        L_0x0204:
            r2 = 0
            r1.mo10164g(r2)
            com.android.f.a.a.k r0 = r1.f16328c
            r0.mo10156d()
            com.android.f.a.a.k r0 = r1.f16328c
            r0.mo10154b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5129n.m14009l():int");
    }

    /* renamed from: m */
    private static final C5120e m14010m(C5120e eVar) {
        char c;
        C5120e eVar2;
        try {
            String a = eVar.mo10143a();
            if (a.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}")) {
                c = 3;
            } else if (a.matches("\\+?[0-9|\\.|\\-]+")) {
                c = 1;
            } else if (a.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}")) {
                c = 2;
            } else {
                c = a.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}") ? (char) 4 : 5;
            }
            if (eVar == null) {
                eVar2 = null;
            } else {
                eVar2 = new C5120e(eVar.f16310a, eVar.f16311b);
            }
            if (c == 1) {
                eVar2.mo10144b("/TYPE=PLMN".getBytes());
            } else if (c == 3) {
                eVar2.mo10144b("/TYPE=IPV4".getBytes());
            } else if (c == 4) {
                eVar2.mo10144b("/TYPE=IPV6".getBytes());
            }
            return eVar2;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10158a(int i) {
        this.f16326a.write(i);
        this.f16327b++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10159b(C5120e eVar) {
        int i = eVar.f16310a;
        byte[] d = eVar.mo10147d();
        this.f16328c.mo10155c();
        C5128m a = this.f16328c.mo10153a();
        mo10162e(i);
        mo10163f(d);
        int a2 = a.mo10157a();
        this.f16328c.mo10156d();
        mo10165h((long) a2);
        this.f16328c.mo10154b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10160c(long j) {
        long j2 = j;
        int i = 0;
        while (j2 != 0 && i < 8) {
            j2 >>>= 8;
            i++;
        }
        mo10158a(i);
        int i2 = (i - 1) * 8;
        for (int i3 = 0; i3 < i; i3++) {
            mo10158a((int) ((j >>> i2) & 255));
            i2 -= 8;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10161d(byte[] bArr) {
        mo10158a(34);
        mo10167j(bArr, bArr.length);
        mo10158a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo10162e(int i) {
        mo10158a((i | 128) & PrivateKeyType.INVALID);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo10163f(byte[] bArr) {
        if ((bArr[0] & 255) > Byte.MAX_VALUE) {
            mo10158a(127);
        }
        mo10167j(bArr, bArr.length);
        mo10158a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo10164g(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            mo10158a((int) (((j >>> (i * 7)) & 127) | 128));
            i--;
        }
        mo10158a((int) (j & 127));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo10165h(long j) {
        if (j < 31) {
            mo10158a((int) j);
            return;
        }
        mo10158a(31);
        mo10164g(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (m14008k(155) != 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012b, code lost:
        if (m14009l() == 0) goto L_0x012d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo10166i() {
        /*
            r10 = this;
            com.android.f.a.a.f r0 = r10.f16329e
            com.android.f.a.a.p r0 = r0.f16312a
            r1 = 140(0x8c, float:1.96E-43)
            int r0 = r0.mo10168a(r1)
            r2 = 151(0x97, float:2.12E-43)
            r3 = 137(0x89, float:1.92E-43)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 141(0x8d, float:1.98E-43)
            r6 = 152(0x98, float:2.13E-43)
            r7 = 133(0x85, float:1.86E-43)
            r8 = 0
            r9 = 0
            if (r0 == r4) goto L_0x00b0
            r4 = 131(0x83, float:1.84E-43)
            if (r0 == r4) goto L_0x0087
            if (r0 == r7) goto L_0x005f
            r4 = 135(0x87, float:1.89E-43)
            if (r0 == r4) goto L_0x0025
            return r8
        L_0x0025:
            java.io.ByteArrayOutputStream r0 = r10.f16326a
            if (r0 != 0) goto L_0x0032
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r10.f16326a = r0
            r10.f16327b = r9
        L_0x0032:
            r10.mo10158a(r1)
            r10.mo10158a(r4)
            int r0 = r10.m14008k(r5)
            if (r0 == 0) goto L_0x003f
            goto L_0x005e
        L_0x003f:
            r0 = 139(0x8b, float:1.95E-43)
            int r0 = r10.m14008k(r0)
            if (r0 != 0) goto L_0x005e
            int r0 = r10.m14008k(r2)
            if (r0 != 0) goto L_0x005e
            int r0 = r10.m14008k(r3)
            if (r0 != 0) goto L_0x005e
            r10.m14008k(r7)
            r0 = 155(0x9b, float:2.17E-43)
            int r0 = r10.m14008k(r0)
            if (r0 == 0) goto L_0x012d
        L_0x005e:
            return r8
        L_0x005f:
            java.io.ByteArrayOutputStream r0 = r10.f16326a
            if (r0 != 0) goto L_0x006c
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r10.f16326a = r0
            r10.f16327b = r9
        L_0x006c:
            r10.mo10158a(r1)
            r10.mo10158a(r7)
            int r0 = r10.m14008k(r6)
            if (r0 == 0) goto L_0x0079
            goto L_0x0086
        L_0x0079:
            int r0 = r10.m14008k(r5)
            if (r0 != 0) goto L_0x0086
            r0 = 145(0x91, float:2.03E-43)
            r10.m14008k(r0)
            goto L_0x012d
        L_0x0086:
            return r8
        L_0x0087:
            java.io.ByteArrayOutputStream r0 = r10.f16326a
            if (r0 != 0) goto L_0x0094
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r10.f16326a = r0
            r10.f16327b = r9
        L_0x0094:
            r10.mo10158a(r1)
            r10.mo10158a(r4)
            int r0 = r10.m14008k(r6)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00af
        L_0x00a1:
            int r0 = r10.m14008k(r5)
            if (r0 != 0) goto L_0x00af
            r0 = 149(0x95, float:2.09E-43)
            int r0 = r10.m14008k(r0)
            if (r0 == 0) goto L_0x012d
        L_0x00af:
            return r8
        L_0x00b0:
            java.io.ByteArrayOutputStream r0 = r10.f16326a
            if (r0 != 0) goto L_0x00bd
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r10.f16326a = r0
            r10.f16327b = r9
        L_0x00bd:
            r10.mo10158a(r1)
            r10.mo10158a(r4)
            r10.mo10158a(r6)
            com.android.f.a.a.p r0 = r10.f16331g
            byte[] r0 = r0.mo10175h(r6)
            if (r0 == 0) goto L_0x0135
            r10.mo10163f(r0)
            int r0 = r10.m14008k(r5)
            if (r0 == 0) goto L_0x00d8
            goto L_0x0134
        L_0x00d8:
            r10.m14008k(r7)
            int r0 = r10.m14008k(r3)
            if (r0 != 0) goto L_0x0134
            int r0 = r10.m14008k(r2)
            r1 = 1
            if (r0 != r1) goto L_0x00ea
            r0 = 0
            goto L_0x00eb
        L_0x00ea:
            r0 = 1
        L_0x00eb:
            r2 = 130(0x82, float:1.82E-43)
            int r2 = r10.m14008k(r2)
            if (r2 == r1) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r9 = 1
        L_0x00f5:
            r2 = r9 ^ 1
            r0 = r0 | r2
            r2 = 129(0x81, float:1.81E-43)
            int r2 = r10.m14008k(r2)
            if (r2 == r1) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            if (r0 != 0) goto L_0x0104
            goto L_0x0134
        L_0x0104:
            r0 = 150(0x96, float:2.1E-43)
            r10.m14008k(r0)
            r0 = 138(0x8a, float:1.93E-43)
            r10.m14008k(r0)
            r0 = 136(0x88, float:1.9E-43)
            r10.m14008k(r0)
            r0 = 143(0x8f, float:2.0E-43)
            r10.m14008k(r0)
            r0 = 134(0x86, float:1.88E-43)
            r10.m14008k(r0)
            r0 = 144(0x90, float:2.02E-43)
            r10.m14008k(r0)
            r0 = 132(0x84, float:1.85E-43)
            r10.mo10158a(r0)
            int r0 = r10.m14009l()
            if (r0 != 0) goto L_0x0134
        L_0x012d:
            java.io.ByteArrayOutputStream r0 = r10.f16326a
            byte[] r0 = r0.toByteArray()
            return r0
        L_0x0134:
            return r8
        L_0x0135:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Transaction-ID is null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5129n.mo10166i():byte[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo10167j(byte[] bArr, int i) {
        this.f16326a.write(bArr, 0, i);
        this.f16327b += i;
    }

    /* renamed from: k */
    private final int m14008k(int i) {
        switch (i) {
            case 129:
            case 130:
            case 151:
                C5120e[] i2 = this.f16331g.mo10176i(i);
                if (i2 != null) {
                    for (C5120e m : i2) {
                        C5120e m2 = m14010m(m);
                        if (m2 == null) {
                            return 1;
                        }
                        mo10158a(i);
                        mo10159b(m2);
                    }
                    break;
                } else {
                    return 2;
                }
            case 133:
                long b = this.f16331g.mo10169b(i);
                if (b != -1) {
                    mo10158a(i);
                    mo10160c(b);
                    break;
                } else {
                    return 2;
                }
            case 134:
            case 143:
            case 144:
            case 145:
            case 149:
            case 155:
                int a = this.f16331g.mo10168a(i);
                if (a != 0) {
                    mo10158a(i);
                    mo10158a(a);
                    break;
                } else {
                    return 2;
                }
            case 136:
                long b2 = this.f16331g.mo10169b(i);
                if (b2 != -1) {
                    mo10158a(i);
                    this.f16328c.mo10155c();
                    C5128m a2 = this.f16328c.mo10153a();
                    mo10158a(129);
                    mo10160c(b2);
                    int a3 = a2.mo10157a();
                    this.f16328c.mo10156d();
                    mo10165h((long) a3);
                    this.f16328c.mo10154b();
                    break;
                } else {
                    return 2;
                }
            case 137:
                mo10158a(i);
                C5120e c = this.f16331g.mo10170c(i);
                if (c != null && !TextUtils.isEmpty(c.mo10143a()) && !new String(c.mo10147d()).equals("insert-address-token")) {
                    this.f16328c.mo10155c();
                    C5128m a4 = this.f16328c.mo10153a();
                    mo10158a(128);
                    C5120e m3 = m14010m(c);
                    if (m3 != null) {
                        mo10159b(m3);
                        int a5 = a4.mo10157a();
                        this.f16328c.mo10156d();
                        mo10165h((long) a5);
                        this.f16328c.mo10154b();
                        break;
                    } else {
                        return 1;
                    }
                } else {
                    mo10158a(1);
                    mo10158a(129);
                    break;
                }
                break;
            case 138:
                byte[] h = this.f16331g.mo10175h(i);
                if (h != null) {
                    mo10158a(i);
                    if (!Arrays.equals(h, "advertisement".getBytes())) {
                        if (!Arrays.equals(h, "auto".getBytes())) {
                            if (!Arrays.equals(h, "personal".getBytes())) {
                                if (!Arrays.equals(h, "informational".getBytes())) {
                                    mo10163f(h);
                                    break;
                                } else {
                                    mo10158a(130);
                                    break;
                                }
                            } else {
                                mo10158a(128);
                                break;
                            }
                        } else {
                            mo10158a(131);
                            break;
                        }
                    } else {
                        mo10158a(129);
                        break;
                    }
                } else {
                    return 2;
                }
            case 139:
            case 152:
                byte[] h2 = this.f16331g.mo10175h(i);
                if (h2 != null) {
                    mo10158a(i);
                    mo10163f(h2);
                    break;
                } else {
                    return 2;
                }
            case 141:
                mo10158a(i);
                int a6 = this.f16331g.mo10168a(i);
                if (a6 != 0) {
                    mo10162e(a6);
                    break;
                } else {
                    mo10162e(18);
                    break;
                }
            case 150:
                C5120e c2 = this.f16331g.mo10170c(i);
                if (c2 != null) {
                    mo10158a(i);
                    mo10159b(c2);
                    break;
                } else {
                    return 2;
                }
            default:
                return 3;
        }
        return 0;
    }
}
