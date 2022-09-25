package com.google.apps.tiktok.account.p3604b;

import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.b.c */
/* compiled from: PG */
public final /* synthetic */ class C46062c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46064e f120918a;

    public /* synthetic */ C46062c(C46064e eVar) {
        this.f120918a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            com.google.apps.tiktok.account.b.e r0 = r8.f120918a
            java.io.File r1 = new java.io.File
            android.content.Context r0 = r0.f120922b
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r2 = "install.bin"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0044
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0035 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0035 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0035 }
            long r4 = r0.readLong()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r0 = move-exception
            goto L_0x0037
        L_0x002b:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r0 = move-exception
            com.google.apps.tiktok.account.p3604b.C46060a.m82279a(r4, r0)     // Catch:{ IOException -> 0x0035 }
        L_0x0034:
            throw r4     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r4 = r2
        L_0x0037:
            com.google.common.f.e r6 = com.google.apps.tiktok.account.p3604b.C46064e.f120921a
            com.google.common.f.x r6 = r6.mo56225c()
            r7 = 54714(0xd5ba, float:7.667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r7)).mo56384n()
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            r4 = r2
        L_0x004a:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            long r4 = r0.nextLong()
            goto L_0x004a
        L_0x0058:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x007d }
            r1.<init>(r0)     // Catch:{ all -> 0x007d }
            r1.writeLong(r4)     // Catch:{ all -> 0x0073 }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ all -> 0x0073 }
            r2.sync()     // Catch:{ all -> 0x0073 }
            r1.close()     // Catch:{ all -> 0x007d }
            r0.close()
            goto L_0x0087
        L_0x0073:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            com.google.apps.tiktok.account.p3604b.C46060a.m82279a(r2, r1)     // Catch:{ all -> 0x007d }
        L_0x007c:
            throw r2     // Catch:{ all -> 0x007d }
        L_0x007d:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            com.google.apps.tiktok.account.p3604b.C46060a.m82279a(r1, r0)
        L_0x0086:
            throw r1
        L_0x0087:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.p3604b.C46062c.call():java.lang.Object");
    }
}
