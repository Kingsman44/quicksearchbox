package com.google.android.apps.gsa.speech.audio;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.speech.audio.aa */
/* compiled from: PG */
public final class C92155aa extends C92211v {

    /* renamed from: a */
    private static final C59071e f256924a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.aa");

    /* renamed from: b */
    private final byte[] f256925b;

    /* renamed from: c */
    private final C92204o f256926c;

    /* renamed from: d */
    private int f256927d = -1;

    /* renamed from: e */
    private boolean f256928e = true;

    /* renamed from: f */
    private int f256929f = -1;

    public C92155aa(byte[] bArr, int i, int i2) {
        this.f256926c = new C92204o(bArr, i);
        this.f256925b = bArr;
        this.f256927d = i2;
    }

    /* renamed from: a */
    public final int mo86824a() {
        return this.f256926c.f257063a;
    }

    public final synchronized void close() {
        this.f256926c.close();
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        throw new java.lang.IllegalStateException("Failed to release metaRetriever!", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        throw new java.lang.IllegalStateException("Failed to release metaRetriever!", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        throw new java.lang.IllegalStateException("Failed to release metaRetriever!", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0024, B:15:0x0035, B:17:0x0057, B:43:0x00b2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f256928e     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            r7.f256928e = r0     // Catch:{ all -> 0x00c7 }
            byte[] r1 = r7.f256925b     // Catch:{ all -> 0x00c7 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c7 }
            int r2 = r1.length     // Catch:{ all -> 0x00c7 }
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x00c7 }
            r2.<init>()     // Catch:{ all -> 0x00c7 }
            com.google.android.apps.gsa.speech.audio.z r3 = new com.google.android.apps.gsa.speech.audio.z     // Catch:{ Exception -> 0x0034 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0034 }
            r2.setDataSource(r3)     // Catch:{ Exception -> 0x0034 }
            r1 = 9
            java.lang.String r1 = r2.extractMetadata(r1)     // Catch:{ Exception -> 0x0034 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0034 }
            r2.release()     // Catch:{ Exception -> 0x0028 }
            goto L_0x005b
        L_0x0028:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = "Failed to release metaRetriever!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x00c7 }
            throw r9     // Catch:{ all -> 0x00c7 }
        L_0x0031:
            r8 = move-exception
            goto L_0x00b2
        L_0x0034:
            r1 = move-exception
            com.google.common.f.e r3 = f256924a     // Catch:{ all -> 0x0031 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0031 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0031 }
            java.lang.String r5 = "SkippingDecodingStream"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x0031 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0031 }
            com.google.common.f.x r1 = r3.mo56382g(r1)     // Catch:{ all -> 0x0031 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0031 }
            r3 = 12086(0x2f36, float:1.6936E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x0031 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Exception occurred"
            r1.mo56386p(r3)     // Catch:{ all -> 0x0031 }
            r2.release()     // Catch:{ Exception -> 0x00a9 }
            r1 = 0
        L_0x005b:
            int r2 = r7.f256927d     // Catch:{ all -> 0x00c7 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < 0) goto L_0x0062
            goto L_0x006f
        L_0x0062:
            int r2 = r1 + -1200
            r1 = 150(0x96, float:2.1E-43)
            if (r2 >= r1) goto L_0x006b
            r2 = 150(0x96, float:2.1E-43)
            goto L_0x006f
        L_0x006b:
            if (r2 <= r3) goto L_0x006f
            r2 = 1000(0x3e8, float:1.401E-42)
        L_0x006f:
            com.google.android.apps.gsa.speech.audio.o r1 = r7.f256926c     // Catch:{ all -> 0x00c7 }
            int r1 = r1.f257063a     // Catch:{ all -> 0x00c7 }
            int r1 = r1 + r1
            int r1 = r1 * r2
            int r1 = r1 / r3
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x00c7 }
            r7.f256929f = r0     // Catch:{ IOException -> 0x0093 }
            r4 = 0
        L_0x007c:
            int r5 = r7.f256929f     // Catch:{ IOException -> 0x0093 }
            if (r5 >= r1) goto L_0x00bf
            r6 = -1
            if (r4 == r6) goto L_0x00bf
            int r5 = r5 + r4
            r7.f256929f = r5     // Catch:{ IOException -> 0x0093 }
            int r4 = r1 - r5
            int r4 = java.lang.Math.min(r3, r4)     // Catch:{ IOException -> 0x0093 }
            com.google.android.apps.gsa.speech.audio.o r5 = r7.f256926c     // Catch:{ IOException -> 0x0093 }
            int r4 = r5.read(r2, r0, r4)     // Catch:{ IOException -> 0x0093 }
            goto L_0x007c
        L_0x0093:
            r0 = move-exception
            com.google.common.f.e r1 = f256924a     // Catch:{ all -> 0x00c7 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x00c7 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "SkippingDecodingStream"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "Couldn't skip"
            r3 = 12088(0x2f38, float:1.6939E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x00bf
        L_0x00a9:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = "Failed to release metaRetriever!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x00c7 }
            throw r9     // Catch:{ all -> 0x00c7 }
        L_0x00b2:
            r2.release()     // Catch:{ Exception -> 0x00b6 }
            throw r8     // Catch:{ all -> 0x00c7 }
        L_0x00b6:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = "Failed to release metaRetriever!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x00c7 }
            throw r9     // Catch:{ all -> 0x00c7 }
        L_0x00bf:
            com.google.android.apps.gsa.speech.audio.o r0 = r7.f256926c     // Catch:{ all -> 0x00c7 }
            int r8 = r0.read(r8, r9, r10)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r7)
            return r8
        L_0x00c7:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00cb
        L_0x00ca:
            throw r8
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92155aa.read(byte[], int, int):int");
    }
}
