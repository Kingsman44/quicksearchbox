package com.google.p5261vr.p5266c9.logging;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* renamed from: com.google.vr.c9.logging.ClearcutFrameLogUploadWorker */
/* compiled from: PG */
public class ClearcutFrameLogUploadWorker extends Worker {

    /* renamed from: b */
    private final C67952d f184153b;

    public ClearcutFrameLogUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f184153b = new C67952d(context, C67950b.m98217a(context, this.f14000d.f13989b.mo9567b("upload_account_name")));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:76|77|90|91|92|93|94|103|104) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0314, code lost:
        throw com.google.p5261vr.p5266c9.logging.ClearcutFrameLogUploadWorker$$ExternalSyntheticBackport0.m98216m("File.listFiles() result not found", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0106, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        r17 = r2;
        r22 = r3;
        r23 = r5;
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0245, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x027d */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x030d A[ExcHandler: FileNotFoundException (r0v29 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:14:0x00e3] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.C4377aa mo9300c() {
        /*
            r25 = this;
            r1 = r25
            androidx.work.WorkerParameters r0 = r1.f14000d
            androidx.work.m r0 = r0.f13989b
            java.lang.String r2 = "log_directory"
            java.lang.String r0 = r0.mo9567b(r2)
            com.google.vr.c9.logging.d r2 = r1.f184153b
            java.lang.String r3 = "Begin upload service"
            java.lang.String r4 = "C9"
            android.util.Log.i(r4, r3)
            java.io.File r3 = new java.io.File     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.String r5 = "frame_logs"
            r3.<init>(r0, r5)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.io.File r5 = new java.io.File     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.String r0 = "uploaded"
            r5.<init>(r3, r0)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            r5.mkdirs()     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            com.google.vr.c9.logging.c r0 = com.google.p5261vr.p5266c9.logging.C67951c.f184157a     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.io.File[] r0 = r5.listFiles(r0)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            int r6 = r0.length     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            r7 = 0
            r8 = 0
        L_0x002f:
            if (r8 >= r6) goto L_0x0051
            r9 = r0[r8]     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.String r10 = r9.getName()     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            r11.<init>()     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.String r12 = "Deleting old file "
            r11.append(r12)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            r11.append(r10)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.lang.String r10 = r11.toString()     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            android.util.Log.i(r4, r10)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            r9.delete()     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            int r8 = r8 + 1
            goto L_0x002f
        L_0x0051:
            com.google.vr.c9.logging.c r0 = com.google.p5261vr.p5266c9.logging.C67951c.f184157a     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            java.io.File[] r3 = r3.listFiles(r0)     // Catch:{ NullPointerException -> 0x0329, IllegalArgumentException -> 0x0322 }
            int r6 = r3.length
            r8 = 0
        L_0x0059:
            if (r8 >= r6) goto L_0x0315
            r9 = r3[r8]
            boolean r0 = r2.f184159b
            if (r0 == 0) goto L_0x0063
            goto L_0x031a
        L_0x0063:
            java.util.regex.Pattern r0 = com.google.p5261vr.p5266c9.logging.C67952d.f184158a
            java.lang.String r10 = r9.getName()
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r10 = r0.matches()
            if (r10 != 0) goto L_0x007d
            r1 = r2
            r22 = r3
            r21 = r6
            r16 = r8
            r6 = 0
            goto L_0x0301
        L_0x007d:
            r10 = 1
            java.lang.String r11 = r0.group(r10)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r12 = r9.getAbsolutePath()
            r0[r7] = r12
            r0[r10] = r11
            long r12 = r9.length()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 2
            r0[r13] = r12
            java.lang.String r12 = "Reading logs from %s for session %s. File size: %d"
            java.lang.String r0 = java.lang.String.format(r12, r0)
            android.util.Log.i(r4, r0)
            com.google.vr.c9.a.b r0 = com.google.p5261vr.p5266c9.p5267a.C67940b.f184134c
            com.google.protobuf.bn r0 = r0.createBuilder()
            r12 = r0
            com.google.vr.c9.a.a r12 = (com.google.p5261vr.p5266c9.p5267a.C67935a) r12
            com.google.vr.c9.a.h r0 = com.google.p5261vr.p5266c9.p5267a.C67946h.f184143c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.vr.c9.a.g r0 = (com.google.p5261vr.p5266c9.p5267a.C67945g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.vr.c9.a.h r13 = (com.google.p5261vr.p5266c9.p5267a.C67946h) r13
            r11.getClass()
            int r14 = r13.f184145a
            r14 = r14 | r10
            r13.f184145a = r14
            r13.f184146b = r11
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.vr.c9.a.b r13 = (com.google.p5261vr.p5266c9.p5267a.C67940b) r13
            com.google.protobuf.bv r0 = r0.build()
            com.google.vr.c9.a.h r0 = (com.google.p5261vr.p5266c9.p5267a.C67946h) r0
            r0.getClass()
            r13.f184137b = r0
            int r0 = r13.f184136a
            r0 = r0 | r10
            r13.f184136a = r0
            com.google.vr.c9.a.a.d r0 = com.google.p5261vr.p5266c9.p5267a.p5268a.C67939d.f184130b
            com.google.protobuf.bn r0 = r0.createBuilder()
            r13 = r0
            com.google.vr.c9.a.a.c r13 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67938c) r13
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x030d, IOException -> 0x0280 }
            r14.<init>(r9)     // Catch:{ FileNotFoundException -> 0x030d, IOException -> 0x0280 }
            com.google.protobuf.ae r0 = com.google.protobuf.C62897ae.m95110M(r14)     // Catch:{ all -> 0x0251 }
            r16 = r8
            long r7 = r9.length()     // Catch:{ all -> 0x0247 }
            r17 = 10000000(0x989680, float:1.4012985E-38)
            r18 = 0
        L_0x00f7:
            boolean r19 = r0.mo58661D()     // Catch:{ all -> 0x0247 }
            if (r19 != 0) goto L_0x0237
            boolean r15 = r2.f184159b     // Catch:{ all -> 0x0247 }
            if (r15 == 0) goto L_0x0111
            r14.close()     // Catch:{ FileNotFoundException -> 0x030d, IOException -> 0x0106 }
            goto L_0x031a
        L_0x0106:
            r0 = move-exception
            r17 = r2
            r22 = r3
            r23 = r5
            r21 = r6
            goto L_0x028b
        L_0x0111:
            int r15 = r0.mo58675j()     // Catch:{ all -> 0x0247 }
            int r10 = r0.mo58670e(r15)     // Catch:{ all -> 0x0247 }
            byte[] r1 = r0.mo58665H(r15)     // Catch:{ all -> 0x0247 }
            com.google.vr.c9.a.a.b r21 = com.google.p5261vr.p5266c9.p5267a.p5268a.C67937b.f184126c     // Catch:{ all -> 0x0247 }
            com.google.protobuf.bn r21 = r21.createBuilder()     // Catch:{ all -> 0x0247 }
            r22 = r3
            r3 = r21
            com.google.vr.c9.a.a.a r3 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67936a) r3     // Catch:{ all -> 0x0233 }
            r21 = r6
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x022d }
            com.google.protobuf.b r3 = r3.mergeFrom((byte[]) r1, (com.google.protobuf.C62921ba) r6)     // Catch:{ all -> 0x022d }
            com.google.vr.c9.a.a.a r3 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67936a) r3     // Catch:{ all -> 0x022d }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ all -> 0x022d }
            com.google.vr.c9.a.a.b r6 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67937b) r6     // Catch:{ all -> 0x022d }
            int r6 = r6.f184128a     // Catch:{ all -> 0x022d }
            r20 = 1
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0144
            r23 = r5
            goto L_0x017d
        L_0x0144:
            com.google.protos.bh.a.b r6 = com.google.protos.p4968bh.p4969a.C64625b.f175177b     // Catch:{ all -> 0x022d }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x022d }
            com.google.protos.bh.a.a r6 = (com.google.protos.p4968bh.p4969a.C64624a) r6     // Catch:{ all -> 0x022d }
            r23 = r5
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0229 }
            com.google.protobuf.b r1 = r6.mergeFrom((byte[]) r1, (com.google.protobuf.C62921ba) r5)     // Catch:{ all -> 0x0229 }
            com.google.protos.bh.a.a r1 = (com.google.protos.p4968bh.p4969a.C64624a) r1     // Catch:{ all -> 0x0229 }
            com.google.protobuf.bv r5 = r1.instance     // Catch:{ all -> 0x0229 }
            com.google.protos.bh.a.b r5 = (com.google.protos.p4968bh.p4969a.C64625b) r5     // Catch:{ all -> 0x0229 }
            int r5 = r5.f175179a     // Catch:{ all -> 0x0229 }
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x017d
            r3.clear()     // Catch:{ all -> 0x019c }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x019c }
            com.google.protos.bh.a.b r1 = (com.google.protos.p4968bh.p4969a.C64625b) r1     // Catch:{ all -> 0x019c }
            r3.copyOnWrite()     // Catch:{ all -> 0x019c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x019c }
            com.google.vr.c9.a.a.b r5 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67937b) r5     // Catch:{ all -> 0x019c }
            r1.getClass()     // Catch:{ all -> 0x019c }
            r5.f184129b = r1     // Catch:{ all -> 0x019c }
            int r1 = r5.f184128a     // Catch:{ all -> 0x019c }
            r6 = 1
            r1 = r1 | r6
            r5.f184128a = r1     // Catch:{ all -> 0x019c }
        L_0x017d:
            com.google.protobuf.bv r1 = r3.build()     // Catch:{ all -> 0x0229 }
            com.google.vr.c9.a.a.b r1 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67937b) r1     // Catch:{ all -> 0x0229 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0229 }
            com.google.protobuf.bv r3 = r13.instance     // Catch:{ all -> 0x0229 }
            com.google.vr.c9.a.a.d r3 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67939d) r3     // Catch:{ all -> 0x0229 }
            r1.getClass()     // Catch:{ all -> 0x0229 }
            com.google.protobuf.cq r5 = r3.f184133a     // Catch:{ all -> 0x0229 }
            boolean r6 = r5.mo58948c()     // Catch:{ all -> 0x0229 }
            if (r6 != 0) goto L_0x01a3
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ all -> 0x019c }
            r3.f184133a = r5     // Catch:{ all -> 0x019c }
            goto L_0x01a3
        L_0x019c:
            r0 = move-exception
            r1 = r0
            r17 = r2
            r3 = r9
            goto L_0x025e
        L_0x01a3:
            com.google.protobuf.cq r3 = r3.f184133a     // Catch:{ all -> 0x0229 }
            r3.add(r1)     // Catch:{ all -> 0x0229 }
            r0.mo58659B(r10)     // Catch:{ all -> 0x0229 }
            int r1 = r17 - r15
            if (r18 != 0) goto L_0x0214
            r3 = 5000000(0x4c4b40, float:7.006492E-39)
            if (r1 >= r3) goto L_0x0214
            if (r1 <= 0) goto L_0x0214
            r5 = -5000000(0xffffffffffb3b4c0, double:NaN)
            long r5 = r5 + r7
            r17 = 0
            r3 = r9
            r9 = r17
        L_0x01bf:
            int r15 = r0.mo58669d()     // Catch:{ all -> 0x0210 }
            r24 = r1
            r17 = r2
            long r1 = (long) r15
            int r15 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x01da
            int r1 = r0.mo58675j()     // Catch:{ all -> 0x020d }
            r0.mo58660C(r1)     // Catch:{ all -> 0x020d }
            long r1 = (long) r1     // Catch:{ all -> 0x020d }
            long r9 = r9 + r1
            r2 = r17
            r1 = r24
            goto L_0x01bf
        L_0x01da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            java.lang.String r2 = "Total log size is "
            r1.append(r2)     // Catch:{ all -> 0x020d }
            r1.append(r7)     // Catch:{ all -> 0x020d }
            java.lang.String r2 = "; discarded  "
            r1.append(r2)     // Catch:{ all -> 0x020d }
            r1.append(r9)     // Catch:{ all -> 0x020d }
            java.lang.String r2 = " from the middle"
            r1.append(r2)     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020d }
            android.util.Log.i(r4, r1)     // Catch:{ all -> 0x020d }
            r1 = r25
            r9 = r3
            r2 = r17
            r6 = r21
            r3 = r22
            r5 = r23
            r17 = r24
            r10 = 1
            r18 = 1
            goto L_0x00f7
        L_0x020d:
            r0 = move-exception
            goto L_0x025d
        L_0x0210:
            r0 = move-exception
            r17 = r2
            goto L_0x025d
        L_0x0214:
            r24 = r1
            r17 = r2
            r3 = r9
            r1 = r25
            r9 = r3
            r2 = r17
            r6 = r21
            r3 = r22
            r5 = r23
            r17 = r24
            r10 = 1
            goto L_0x00f7
        L_0x0229:
            r0 = move-exception
            r17 = r2
            goto L_0x025c
        L_0x022d:
            r0 = move-exception
            r17 = r2
            r23 = r5
            goto L_0x025c
        L_0x0233:
            r0 = move-exception
            r17 = r2
            goto L_0x024c
        L_0x0237:
            r17 = r2
            r22 = r3
            r23 = r5
            r21 = r6
            r3 = r9
            r14.close()     // Catch:{ FileNotFoundException -> 0x030d, IOException -> 0x0245 }
            r6 = 0
            goto L_0x02a3
        L_0x0245:
            r0 = move-exception
            goto L_0x028c
        L_0x0247:
            r0 = move-exception
            r17 = r2
            r22 = r3
        L_0x024c:
            r23 = r5
            r21 = r6
            goto L_0x025c
        L_0x0251:
            r0 = move-exception
            r17 = r2
            r22 = r3
            r23 = r5
            r21 = r6
            r16 = r8
        L_0x025c:
            r3 = r9
        L_0x025d:
            r1 = r0
        L_0x025e:
            r14.close()     // Catch:{ all -> 0x0263 }
        L_0x0261:
            r6 = 0
            goto L_0x027d
        L_0x0263:
            r0 = move-exception
            r2 = r0
            r5 = 1
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0261 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r0[r6] = r5     // Catch:{ Exception -> 0x027d }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r7, r0)     // Catch:{ Exception -> 0x027d }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x027d }
            r5[r6] = r2     // Catch:{ Exception -> 0x027d }
            r0.invoke(r1, r5)     // Catch:{ Exception -> 0x027d }
        L_0x027d:
            throw r1     // Catch:{ FileNotFoundException -> 0x030d, IOException -> 0x027e }
        L_0x027e:
            r0 = move-exception
            goto L_0x028d
        L_0x0280:
            r0 = move-exception
            r17 = r2
            r22 = r3
            r23 = r5
            r21 = r6
            r16 = r8
        L_0x028b:
            r3 = r9
        L_0x028c:
            r6 = 0
        L_0x028d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception during frame logs upload for session "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = ": "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r4, r1, r0)
        L_0x02a3:
            com.google.protobuf.bt r0 = com.google.p5261vr.p5266c9.p5267a.p5268a.C67939d.f184131c
            com.google.protobuf.bv r1 = r13.build()
            com.google.vr.c9.a.a.d r1 = (com.google.p5261vr.p5266c9.p5267a.p5268a.C67939d) r1
            r12.mo58885m(r0, r1)
            r1 = r17
            com.google.vr.c9.logging.ClearcutEventLogger r0 = r1.f184160c
            com.google.protobuf.bv r2 = r12.build()
            com.google.vr.c9.a.b r2 = (com.google.p5261vr.p5266c9.p5267a.C67940b) r2
            r5 = 0
            r0.mo60063a(r2, r5)
            com.google.vr.c9.logging.ClearcutEventLogger r0 = r1.f184160c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            boolean r0 = r0.mo60064b(r2)
            java.lang.String r2 = "Frame logs upload for session "
            if (r0 == 0) goto L_0x02eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r2 = " succeeded"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r4, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r3.getName()
            r5 = r23
            r0.<init>(r5, r2)
            r3.renameTo(r0)
            goto L_0x0301
        L_0x02eb:
            r5 = r23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r2 = " failed to flush"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L_0x0301:
            int r8 = r16 + 1
            r2 = r1
            r6 = r21
            r3 = r22
            r7 = 0
            r1 = r25
            goto L_0x0059
        L_0x030d:
            r0 = move-exception
            java.lang.String r1 = "File.listFiles() result not found"
            java.lang.AssertionError r0 = com.google.p5261vr.p5266c9.logging.ClearcutFrameLogUploadWorker$$ExternalSyntheticBackport0.m98216m(r1, r0)
            throw r0
        L_0x0315:
            java.lang.String r0 = "Upload service complete"
            android.util.Log.i(r4, r0)
        L_0x031a:
            androidx.work.z r0 = new androidx.work.z
            androidx.work.m r1 = androidx.work.C4632m.f14549a
            r0.<init>(r1)
            return r0
        L_0x0322:
            r0 = move-exception
            java.lang.String r1 = "Error in accessing the log directory: "
            android.util.Log.e(r4, r1, r0)
            goto L_0x032f
        L_0x0329:
            r0 = move-exception
            java.lang.String r1 = "Log directory is not valid: "
            android.util.Log.e(r4, r1, r0)
        L_0x032f:
            androidx.work.x r0 = new androidx.work.x
            androidx.work.m r1 = androidx.work.C4632m.f14549a
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5261vr.p5266c9.logging.ClearcutFrameLogUploadWorker.mo9300c():androidx.work.aa");
    }

    /* renamed from: d */
    public final void mo9299d() {
        this.f184153b.f184159b = true;
    }
}
