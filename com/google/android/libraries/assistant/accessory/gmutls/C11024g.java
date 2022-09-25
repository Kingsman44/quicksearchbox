package com.google.android.libraries.assistant.accessory.gmutls;

import android.os.Handler;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.g */
/* compiled from: PG */
final class C11024g implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C11025h f36220a;

    public C11024g(C11025h hVar) {
        this.f36220a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            com.google.android.libraries.assistant.accessory.gmutls.h r11 = r10.f36220a
            monitor-enter(r11)
            com.google.android.libraries.assistant.accessory.gmutls.h r0 = r10.f36220a     // Catch:{ all -> 0x0056 }
            boolean r1 = r0.f36224d     // Catch:{ all -> 0x0056 }
            r2 = 1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r11)     // Catch:{ all -> 0x0056 }
            return r2
        L_0x000c:
            long r0 = r0.f36223c     // Catch:{ all -> 0x0056 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0056 }
            long r0 = r0 - r3
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x001f
            com.google.android.libraries.assistant.accessory.gmutls.h r0 = r10.f36220a     // Catch:{ all -> 0x0056 }
            r0.mo19470a()     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x001f:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0056 }
            com.google.android.libraries.assistant.accessory.gmutls.h r7 = r10.f36220a     // Catch:{ all -> 0x0056 }
            r7.mo19471b()     // Catch:{ all -> 0x0056 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0056 }
            long r7 = r7 - r5
            com.google.android.libraries.assistant.accessory.gmutls.h r5 = r10.f36220a     // Catch:{ all -> 0x0056 }
            long r5 = r5.f36222b     // Catch:{ all -> 0x0056 }
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x003d
            long r0 = r0 - r7
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x003b
            goto L_0x0049
        L_0x003b:
            r3 = r0
            goto L_0x0049
        L_0x003d:
            long r5 = r5 - r7
        L_0x003e:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            com.google.android.libraries.assistant.accessory.gmutls.h r0 = r10.f36220a     // Catch:{ all -> 0x0056 }
            long r0 = r0.f36222b     // Catch:{ all -> 0x0056 }
            long r5 = r5 + r0
            goto L_0x003e
        L_0x0048:
            r3 = r5
        L_0x0049:
            com.google.android.libraries.assistant.accessory.gmutls.h r0 = r10.f36220a     // Catch:{ all -> 0x0056 }
            android.os.Handler r0 = r0.f36225e     // Catch:{ all -> 0x0056 }
            android.os.Message r1 = r0.obtainMessage(r2)     // Catch:{ all -> 0x0056 }
            r0.sendMessageDelayed(r1, r3)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r11)     // Catch:{ all -> 0x0056 }
            return r2
        L_0x0056:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0059:
            throw r0
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.accessory.gmutls.C11024g.handleMessage(android.os.Message):boolean");
    }
}
