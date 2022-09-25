package com.google.android.ssb.service;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: com.google.android.ssb.service.e */
/* compiled from: PG */
final class C45359e implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ SsbService f118599a;

    public C45359e(SsbService ssbService) {
        this.f118599a = ssbService;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SsbService ssbService = this.f118599a;
        ssbService.f118583r = false;
        ssbService.f118584s = false;
        ssbService.f118582q = null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.android.ssb.service.SsbService r3 = r2.f118599a
            if (r4 != 0) goto L_0x0006
            r4 = 0
            goto L_0x001a
        L_0x0006:
            java.lang.String r0 = "com.google.android.hotword.service.IHotwordService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.hotword.service.C146591i
            if (r1 == 0) goto L_0x0014
            r4 = r0
            com.google.android.hotword.service.i r4 = (com.google.android.hotword.service.C146591i) r4
            goto L_0x001a
        L_0x0014:
            com.google.android.hotword.service.g r0 = new com.google.android.hotword.service.g
            r0.<init>(r4)
            r4 = r0
        L_0x001a:
            r3.f118582q = r4
            com.google.android.ssb.service.SsbService r3 = r2.f118599a
            com.google.android.hotword.service.i r4 = r3.f118582q
            if (r4 != 0) goto L_0x0023
            return
        L_0x0023:
            r4 = 1
            r3.f118583r = r4
            r3.mo49362d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ssb.service.C45359e.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
