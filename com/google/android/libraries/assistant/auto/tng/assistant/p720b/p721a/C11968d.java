package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a;

import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C11968d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C11969e f38432a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f38433b;

    public /* synthetic */ C11968d(C11969e eVar, C63088z zVar) {
        this.f38432a = eVar;
        this.f38433b = zVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            com.google.android.libraries.assistant.auto.tng.assistant.b.a.e r0 = r9.f38432a
            com.google.protobuf.z r1 = r9.f38433b
            byte[] r1 = r1.mo59174N()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.google.android.libraries.f.a r4 = r0.f38435b
            long r4 = r4.mo26870b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "audiolog-%s.pcm"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.io.File r4 = new java.io.File
            android.content.Context r0 = r0.f38436c
            java.lang.String r6 = "debug"
            java.io.File r0 = r0.getDir(r6, r5)
            r4.<init>(r0, r3)
            java.lang.String r0 = r4.getAbsolutePath()
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0060 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0060 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0060 }
            int r7 = r1.length     // Catch:{ IOException -> 0x0060 }
            r3.<init>(r6, r7)     // Catch:{ IOException -> 0x0060 }
            r3.write(r1)     // Catch:{ all -> 0x0044 }
            r3.flush()     // Catch:{ all -> 0x0044 }
            r3.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x006f
        L_0x0044:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
            goto L_0x005f
        L_0x0049:
            r3 = move-exception
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r6[r5] = r7     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r8, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005f }
            r2[r5] = r3     // Catch:{ Exception -> 0x005f }
            r6.invoke(r1, r2)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r1     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a.C11969e.f38434a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Error creating file %s"
            r5 = 43938(0xaba2, float:6.157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r5)).mo56389s(r3, r0)
        L_0x006f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a.C11968d.call():java.lang.Object");
    }
}
