package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.q */
/* compiled from: PG */
final class C95268q extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95269r f266559a;

    public C95268q(C95269r rVar) {
        this.f266559a = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0131, code lost:
        r1 = r13.f143286e / 8;
        r2 = r13.f143285d;
        r2 = (r2 * (r13.f143283b.length / (r2 * r1))) * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0144, code lost:
        if (r13.f143287f != java.nio.ByteOrder.BIG_ENDIAN) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0146, code lost:
        if (r1 <= 1) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0149, code lost:
        if (r4 >= r2) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014b, code lost:
        r5 = r4 + r1;
        r6 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014f, code lost:
        r7 = r13.f143283b;
        r8 = r7[r4];
        r7[r4] = r7[r6];
        r7[r6] = r8;
        r4 = r4 + 1;
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015d, code lost:
        if (r4 < r6) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015f, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0161, code lost:
        r1 = r13.f143283b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0164, code lost:
        if (r1.length < r2) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0166, code lost:
        r4 = new byte[r2];
        java.lang.System.arraycopy(r1, 0, r4, 0, r2);
        r13.f143283b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016d, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0170, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r14 = r0.f266565e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0173, code lost:
        if (r14 == null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0175, code lost:
        r14.mo57356n(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0178, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0179, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            r12 = this;
            java.lang.String r0 = "extra_download_id"
            r1 = -1
            long r0 = r14.getLongExtra(r0, r1)
            java.io.File r14 = r13.getExternalCacheDir()
            if (r14 != 0) goto L_0x0023
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95269r.f266560a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "JingleDownloader"
            r13.mo56378ag(r14, r0)
            java.lang.String r14 = "Sound load failed: cannot open external cache directory"
            r0 = 14803(0x39d3, float:2.0743E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56386p(r14)
            return
        L_0x0023:
            com.google.android.apps.gsa.staticplugins.bisto.d.r r14 = r12.f266559a
            long r2 = r14.f266564d
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x01ca
            java.lang.Integer r14 = com.google.android.apps.gsa.staticplugins.bisto.util.C96505y.m159887a(r13, r0)
            if (r14 == 0) goto L_0x01ca
            int r0 = r14.intValue()
            r1 = 16
            r2 = 8
            if (r0 != r2) goto L_0x01b6
            com.google.android.apps.gsa.staticplugins.bisto.d.r r0 = r12.f266559a
            java.io.File r13 = r0.mo89189d()
            if (r13 != 0) goto L_0x0057
            monitor-enter(r0)
            com.google.common.util.concurrent.SettableFuture r13 = r0.f266565e     // Catch:{ all -> 0x0054 }
            if (r13 == 0) goto L_0x0052
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "empty jingle file"
            r14.<init>(r1)     // Catch:{ all -> 0x0054 }
            r13.mo57357o(r14)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0054:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r13
        L_0x0057:
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ IOException -> 0x018d }
            r14.<init>(r13)     // Catch:{ IOException -> 0x018d }
            com.google.audio.a.a r13 = new com.google.audio.a.a     // Catch:{ IOException -> 0x018d }
            r13.<init>()     // Catch:{ IOException -> 0x018d }
            java.lang.String r3 = com.google.audio.p4106a.C54571a.m87486g(r14)     // Catch:{ IOException -> 0x018d }
            java.lang.String r4 = "RIFF"
            boolean r4 = r4.equals(r3)     // Catch:{ IOException -> 0x018d }
            if (r4 == 0) goto L_0x0072
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x018d }
            r13.f143287f = r3     // Catch:{ IOException -> 0x018d }
            goto L_0x007e
        L_0x0072:
            java.lang.String r4 = "RIFX"
            boolean r3 = r4.equals(r3)     // Catch:{ IOException -> 0x018d }
            if (r3 == 0) goto L_0x0185
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x018d }
            r13.f143287f = r3     // Catch:{ IOException -> 0x018d }
        L_0x007e:
            r3 = 4
            r14.skip(r3)     // Catch:{ IOException -> 0x018d }
            java.lang.String r3 = "WAVE"
            java.lang.String r4 = com.google.audio.p4106a.C54571a.m87486g(r14)     // Catch:{ IOException -> 0x018d }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x018d }
            if (r3 == 0) goto L_0x017d
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0092:
            java.lang.String r6 = com.google.audio.p4106a.C54571a.m87486g(r14)     // Catch:{ IOException -> 0x018d }
            int r7 = r13.mo54133a(r14)     // Catch:{ IOException -> 0x018d }
            java.lang.String r8 = "fmt "
            boolean r8 = r8.equals(r6)     // Catch:{ IOException -> 0x018d }
            r9 = 1
            if (r8 == 0) goto L_0x0119
            if (r7 < r1) goto L_0x0111
            int r5 = r13.mo54134b(r14)     // Catch:{ IOException -> 0x018d }
            int r6 = r13.mo54134b(r14)     // Catch:{ IOException -> 0x018d }
            r13.f143285d = r6     // Catch:{ IOException -> 0x018d }
            if (r6 <= 0) goto L_0x0109
            int r6 = r13.mo54133a(r14)     // Catch:{ IOException -> 0x018d }
            r13.f143284c = r6     // Catch:{ IOException -> 0x018d }
            if (r6 <= 0) goto L_0x0101
            r10 = 6
            r14.skip(r10)     // Catch:{ IOException -> 0x018d }
            int r6 = r13.mo54134b(r14)     // Catch:{ IOException -> 0x018d }
            r13.f143286e = r6     // Catch:{ IOException -> 0x018d }
            if (r6 < r2) goto L_0x00f9
            r6 = r6 & 7
            if (r6 != 0) goto L_0x00f9
            r6 = -2
            if (r5 != r6) goto L_0x00e6
            r5 = 26
            if (r7 < r5) goto L_0x00de
            r10 = 8
            r14.skip(r10)     // Catch:{ IOException -> 0x018d }
            int r6 = r13.mo54134b(r14)     // Catch:{ IOException -> 0x018d }
            r5 = r6
            r6 = 26
            goto L_0x00e8
        L_0x00de:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Size of extensible fmt chunk in WAV file is too small."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x00e6:
            r6 = 16
        L_0x00e8:
            if (r5 != r9) goto L_0x00f1
            int r7 = r7 - r6
            long r5 = (long) r7     // Catch:{ IOException -> 0x018d }
            r14.skip(r5)     // Catch:{ IOException -> 0x018d }
            r5 = 1
            goto L_0x012d
        L_0x00f1:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Only uncompressed linear PCM WAV files are supported."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x00f9:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Unsupported bits per sample in WAV file."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x0101:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Invalid sample rate in WAV file."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x0109:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Invalid number of channels in WAV file."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x0111:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Size of fmt chunk in WAV file is too small."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x0119:
            java.lang.String r8 = "data"
            boolean r6 = r8.equals(r6)     // Catch:{ IOException -> 0x018d }
            if (r6 == 0) goto L_0x0129
            byte[] r4 = com.google.audio.p4106a.C54571a.m87485f(r14, r7)     // Catch:{ IOException -> 0x018d }
            r13.f143283b = r4     // Catch:{ IOException -> 0x018d }
            r4 = 1
            goto L_0x012d
        L_0x0129:
            long r6 = (long) r7     // Catch:{ IOException -> 0x018d }
            r14.skip(r6)     // Catch:{ IOException -> 0x018d }
        L_0x012d:
            if (r5 == 0) goto L_0x0092
            if (r4 == 0) goto L_0x0092
            int r1 = r13.f143286e     // Catch:{ IOException -> 0x018d }
            int r1 = r1 / r2
            int r2 = r13.f143285d     // Catch:{ IOException -> 0x018d }
            int r4 = r2 * r1
            byte[] r5 = r13.f143283b     // Catch:{ IOException -> 0x018d }
            int r5 = r5.length     // Catch:{ IOException -> 0x018d }
            int r5 = r5 / r4
            int r2 = r2 * r5
            int r2 = r2 * r1
            java.nio.ByteOrder r4 = r13.f143287f     // Catch:{ IOException -> 0x018d }
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x018d }
            if (r4 != r5) goto L_0x0161
            if (r1 <= r9) goto L_0x0161
            r4 = 0
        L_0x0149:
            if (r4 >= r2) goto L_0x0161
            int r5 = r4 + r1
            int r6 = r5 + -1
        L_0x014f:
            byte[] r7 = r13.f143283b     // Catch:{ IOException -> 0x018d }
            byte r8 = r7[r4]     // Catch:{ IOException -> 0x018d }
            byte r9 = r7[r6]     // Catch:{ IOException -> 0x018d }
            r7[r4] = r9     // Catch:{ IOException -> 0x018d }
            r7[r6] = r8     // Catch:{ IOException -> 0x018d }
            int r4 = r4 + 1
            int r6 = r6 + -1
            if (r4 < r6) goto L_0x014f
            r4 = r5
            goto L_0x0149
        L_0x0161:
            byte[] r1 = r13.f143283b     // Catch:{ IOException -> 0x018d }
            int r4 = r1.length     // Catch:{ IOException -> 0x018d }
            if (r4 < r2) goto L_0x016d
            byte[] r4 = new byte[r2]     // Catch:{ IOException -> 0x018d }
            java.lang.System.arraycopy(r1, r3, r4, r3, r2)     // Catch:{ IOException -> 0x018d }
            r13.f143283b = r4     // Catch:{ IOException -> 0x018d }
        L_0x016d:
            r14.close()     // Catch:{ IOException -> 0x018d }
            monitor-enter(r0)     // Catch:{ IOException -> 0x018d }
            com.google.common.util.concurrent.SettableFuture r14 = r0.f266565e     // Catch:{ all -> 0x017a }
            if (r14 == 0) goto L_0x0178
            r14.mo57356n(r13)     // Catch:{ all -> 0x017a }
        L_0x0178:
            monitor-exit(r0)     // Catch:{ all -> 0x017a }
            return
        L_0x017a:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017a }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x017d:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Expected WAVE ID while reading WAV file."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x0185:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x018d }
            java.lang.String r14 = "Invalid WAV header."
            r13.<init>(r14)     // Catch:{ IOException -> 0x018d }
            throw r13     // Catch:{ IOException -> 0x018d }
        L_0x018d:
            r13 = move-exception
            com.google.common.f.e r14 = com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95269r.f266560a
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "JingleDownloader"
            r14.mo56378ag(r1, r2)
            java.lang.String r1 = "failed to read jingle"
            r2 = 14807(0x39d7, float:2.0749E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
            monitor-enter(r0)
            com.google.common.util.concurrent.SettableFuture r13 = r0.f266565e     // Catch:{ all -> 0x01b3 }
            if (r13 == 0) goto L_0x01b1
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = "error reading wavfile"
            r14.<init>(r1)     // Catch:{ all -> 0x01b3 }
            r13.mo57357o(r14)     // Catch:{ all -> 0x01b3 }
        L_0x01b1:
            monitor-exit(r0)     // Catch:{ all -> 0x01b3 }
            return
        L_0x01b3:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b3 }
            throw r13
        L_0x01b6:
            int r14 = r14.intValue()
            if (r14 != r1) goto L_0x01ca
            com.google.android.apps.gsa.staticplugins.bisto.d.r r14 = r12.f266559a
            android.content.BroadcastReceiver r14 = r14.f266563c
            if (r14 == 0) goto L_0x01c5
            r13.unregisterReceiver(r14)
        L_0x01c5:
            com.google.android.apps.gsa.staticplugins.bisto.d.r r13 = r12.f266559a
            r13.mo89186a()
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95268q.onReceive(android.content.Context, android.content.Intent):void");
    }
}
