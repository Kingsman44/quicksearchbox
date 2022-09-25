package com.google.android.apps.gsa.staticplugins.p7537bk;

import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bk.e */
/* compiled from: PG */
public final /* synthetic */ class C96646e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96647f f270380a;

    /* renamed from: b */
    public final /* synthetic */ C89020ar f270381b;

    /* renamed from: c */
    public final /* synthetic */ ParcelFileDescriptor f270382c;

    /* renamed from: d */
    public final /* synthetic */ C89356b f270383d;

    /* renamed from: e */
    public final /* synthetic */ int f270384e;

    public /* synthetic */ C96646e(C96647f fVar, C89020ar arVar, ParcelFileDescriptor parcelFileDescriptor, C89356b bVar, int i) {
        this.f270380a = fVar;
        this.f270381b = arVar;
        this.f270382c = parcelFileDescriptor;
        this.f270383d = bVar;
        this.f270384e = i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0148 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "PFD pipe transfer failed"
            java.lang.String r1 = "ImageInMemoryGraph"
            com.google.android.apps.gsa.staticplugins.bk.f r2 = r13.f270380a
            com.google.android.apps.gsa.shared.aa.ar r3 = r13.f270381b
            android.os.ParcelFileDescriptor r4 = r13.f270382c
            com.google.android.apps.gsa.shared.bb.b r7 = r13.f270383d
            int r5 = r13.f270384e
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r6 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ IOException -> 0x0149 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0149 }
            java.nio.channels.FileChannel r4 = r6.getChannel()     // Catch:{ IOException -> 0x0149 }
            r11 = 0
            r12 = 1
            g.a.a r6 = com.google.android.apps.gsa.staticplugins.p7537bk.C96643b.f270375a     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.v r6 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r6.getClass()
            com.google.android.apps.gsa.shared.aa.aj r8 = r2.f270386b     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r8.getClass()
            com.google.android.apps.gsa.shared.aa.ap r9 = new com.google.android.apps.gsa.shared.aa.ap     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.x r2 = com.google.android.apps.gsa.shared.p6968aa.C89009ag.f241207b     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r9.<init>(r3, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Class<com.google.android.apps.gsa.shared.aa.v> r2 = com.google.android.apps.gsa.shared.p6968aa.C89066v.class
            dagger.p5294a.C68225k.m98529a(r6, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Class<com.google.android.apps.gsa.shared.bb.b> r2 = com.google.android.apps.gsa.shared.p7012bb.C89356b.class
            dagger.p5294a.C68225k.m98529a(r7, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Class<com.google.android.apps.gsa.shared.aa.aj> r2 = com.google.android.apps.gsa.shared.p6968aa.C89012aj.class
            dagger.p5294a.C68225k.m98529a(r8, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Class<com.google.android.apps.gsa.shared.aa.ap> r2 = com.google.android.apps.gsa.shared.p6968aa.C89018ap.class
            dagger.p5294a.C68225k.m98529a(r9, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            dagger.p5294a.C68225k.m98529a(r10, r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.bk.a r2 = new com.google.android.apps.gsa.staticplugins.bk.a     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            dagger.b.d r2 = r2.f270347a     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.common.util.concurrent.cx r2 = r2.mo60297gq()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r2)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.as r2 = (com.google.android.apps.gsa.shared.p6968aa.C89021as) r2     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.at r3 = r2.mo82999g()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.String r5 = "Content-Length"
            r6 = 0
            java.lang.String r3 = r3.mo83000a(r5, r6)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.at r5 = r2.mo82999g()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r5 = r5.mo83000a(r7, r6)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r6 = -1
            if (r3 == 0) goto L_0x0080
            if (r5 != 0) goto L_0x0080
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r3 = -1
        L_0x007c:
            if (r3 >= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r6 = r3
        L_0x0080:
            r3 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.nio.ByteBuffer r3 = r3.putInt(r6)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.nio.Buffer r3 = r3.position(r11)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            r4.write(r3)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.x r2 = r2.mo82997b()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
        L_0x0096:
            com.google.common.util.concurrent.cx r3 = r2.mo27472b()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r3)     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            com.google.android.apps.gsa.shared.aa.g r3 = (com.google.android.apps.gsa.shared.p6968aa.C89051g) r3     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            int r5 = r3.f241330b     // Catch:{ all -> 0x00d7 }
            if (r5 == r12) goto L_0x00cb
            r2 = 2
            if (r5 == r2) goto L_0x00c6
            r2 = 3
            if (r5 != r2) goto L_0x00af
            r3.mo83024e()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            goto L_0x0126
        L_0x00af:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r6.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r7 = "Unexpected chunk type: "
            r6.append(r7)     // Catch:{ all -> 0x00d7 }
            r6.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00d7 }
            r2.<init>(r5)     // Catch:{ all -> 0x00d7 }
            throw r2     // Catch:{ all -> 0x00d7 }
        L_0x00c6:
            com.google.android.apps.gsa.shared.q.d r2 = r3.mo83023d()     // Catch:{ all -> 0x00d7 }
            throw r2     // Catch:{ all -> 0x00d7 }
        L_0x00cb:
            r3.mo83025f(r4)     // Catch:{ IOException -> 0x00d2 }
            r3.mo83024e()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            goto L_0x0096
        L_0x00d2:
            r5 = move-exception
            r2.mo27475d()     // Catch:{ all -> 0x00d7 }
            throw r5     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r2 = move-exception
            r3.mo83024e()     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
            throw r2     // Catch:{ InterruptedException -> 0x0100, ExecutionException -> 0x00e0, IOException -> 0x00de }
        L_0x00dc:
            r0 = move-exception
            goto L_0x012c
        L_0x00de:
            r2 = move-exception
            goto L_0x00e1
        L_0x00e0:
            r2 = move-exception
        L_0x00e1:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7537bk.C96647f.f270385a     // Catch:{ all -> 0x00dc }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00dc }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00dc }
            r3.mo56378ag(r5, r1)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00dc }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00dc }
            r3 = 20748(0x510c, float:2.9074E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00dc }
            r2.mo56386p(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x0126
        L_0x0100:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7537bk.C96647f.f270385a     // Catch:{ all -> 0x00dc }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00dc }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00dc }
            r3.mo56378ag(r5, r1)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00dc }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00dc }
            r3 = 20747(0x510b, float:2.9073E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00dc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00dc }
            r2.mo56386p(r0)     // Catch:{ all -> 0x00dc }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00dc }
            r0.interrupt()     // Catch:{ all -> 0x00dc }
        L_0x0126:
            if (r4 == 0) goto L_0x012b
            r4.close()     // Catch:{ IOException -> 0x0149 }
        L_0x012b:
            return
        L_0x012c:
            if (r4 == 0) goto L_0x0148
            r4.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0148
        L_0x0132:
            r2 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r11] = r4     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0148 }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0148 }
            r4[r11] = r2     // Catch:{ Exception -> 0x0148 }
            r3.invoke(r0, r4)     // Catch:{ Exception -> 0x0148 }
        L_0x0148:
            throw r0     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7537bk.C96647f.f270385a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r1)
            java.lang.String r1 = "PFD pipe transfer close failed"
            r3 = 20746(0x510a, float:2.9071E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r3)).mo56386p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7537bk.C96646e.run():void");
    }
}
