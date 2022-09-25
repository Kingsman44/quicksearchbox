package com.google.android.apps.search.assistant.surfaces.roti.p9499a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.a.a */
/* compiled from: PG */
public final /* synthetic */ class C126757a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126760d f349074a;

    public /* synthetic */ C126757a(C126760d dVar) {
        this.f349074a = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.apps.search.assistant.surfaces.roti.a.d r0 = r8.f349074a
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f349079c
            java.lang.Object r1 = r1.poll()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.content.Context r2 = r0.f349078b     // Catch:{ IOException -> 0x00b1 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ IOException -> 0x00b1 }
            android.content.res.AssetFileDescriptor r2 = r2.openRawResourceFd(r1)     // Catch:{ IOException -> 0x00b1 }
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch:{ IOException -> 0x00b1 }
            r3 = 0
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96144F(r2)     // Catch:{ all -> 0x0092 }
            byte[] r4 = r4.mo59174N()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x002a
            r2.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x002a:
            android.media.AudioFormat$Builder r2 = new android.media.AudioFormat$Builder     // Catch:{ IOException -> 0x00b1 }
            r2.<init>()     // Catch:{ IOException -> 0x00b1 }
            r5 = 4
            android.media.AudioFormat$Builder r2 = r2.setChannelMask(r5)     // Catch:{ IOException -> 0x00b1 }
            r5 = 2
            android.media.AudioFormat$Builder r2 = r2.setEncoding(r5)     // Catch:{ IOException -> 0x00b1 }
            r6 = 16000(0x3e80, float:2.2421E-41)
            android.media.AudioFormat$Builder r2 = r2.setSampleRate(r6)     // Catch:{ IOException -> 0x00b1 }
            android.media.AudioFormat r2 = r2.build()     // Catch:{ IOException -> 0x00b1 }
            android.media.AudioAttributes$Builder r6 = new android.media.AudioAttributes$Builder     // Catch:{ IOException -> 0x00b1 }
            r6.<init>()     // Catch:{ IOException -> 0x00b1 }
            android.media.AudioAttributes$Builder r5 = r6.setContentType(r5)     // Catch:{ IOException -> 0x00b1 }
            r6 = 10
            android.media.AudioAttributes$Builder r5 = r5.setUsage(r6)     // Catch:{ IOException -> 0x00b1 }
            android.media.AudioAttributes r5 = r5.build()     // Catch:{ IOException -> 0x00b1 }
            com.google.android.apps.search.assistant.surfaces.roti.a.c r6 = new com.google.android.apps.search.assistant.surfaces.roti.a.c     // Catch:{ IOException -> 0x00b1 }
            int r7 = r4.length     // Catch:{ IOException -> 0x00b1 }
            r6.<init>(r5, r2, r7)     // Catch:{ IOException -> 0x00b1 }
            r6.write(r4, r3, r7)     // Catch:{ IOException -> 0x00b1 }
            int r2 = r6.getBufferSizeInFrames()     // Catch:{ IOException -> 0x00b1 }
            r6.setNotificationMarkerPosition(r2)     // Catch:{ IOException -> 0x00b1 }
            com.google.android.apps.search.assistant.surfaces.roti.a.b r2 = new com.google.android.apps.search.assistant.surfaces.roti.a.b     // Catch:{ IOException -> 0x00b1 }
            r2.<init>(r0, r6)     // Catch:{ IOException -> 0x00b1 }
            r6.setPlaybackPositionUpdateListener(r2)     // Catch:{ IOException -> 0x00b1 }
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126760d.f349077a     // Catch:{ IOException -> 0x00b1 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ IOException -> 0x00b1 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ IOException -> 0x00b1 }
            r3 = 37139(0x9113, float:5.2043E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ IOException -> 0x00b1 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r3 = "Playing beep %s (size %d bytes)"
            android.content.Context r0 = r0.f349078b     // Catch:{ IOException -> 0x00b1 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ IOException -> 0x00b1 }
            r2.mo56352E(r3, r0, r7)     // Catch:{ IOException -> 0x00b1 }
            r6.play()     // Catch:{ IOException -> 0x00b1 }
            return
        L_0x0092:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b0
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x00b0
        L_0x0099:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b0 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r3] = r5     // Catch:{ Exception -> 0x00b0 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00b0 }
            r2[r3] = r1     // Catch:{ Exception -> 0x00b0 }
            r4.invoke(r0, r2)     // Catch:{ Exception -> 0x00b0 }
        L_0x00b0:
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126760d.f349077a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Could not play beep"
            r3 = 37140(0x9114, float:5.2044E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126757a.run():void");
    }
}
