package androidx.media3.exoplayer.p142e;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.media3.exoplayer.e.f */
/* compiled from: PG */
final class C2976f extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2978h f8539a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2976f(C2978h hVar, Looper looper) {
        super(looper);
        this.f8539a = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: androidx.media3.exoplayer.e.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            androidx.media3.exoplayer.e.h r0 = r11.f8539a
            int r1 = r12.what
            if (r1 == 0) goto L_0x0048
            r2 = 1
            if (r1 == r2) goto L_0x0024
            r2 = 2
            r3 = 0
            if (r1 == r2) goto L_0x001e
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8551f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r12 = r12.what
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r1.<init>(r12)
            androidx.media3.exoplayer.p142e.C2975e.m8425a(r0, r1)
            goto L_0x0064
        L_0x001e:
            androidx.media3.common.b.g r12 = r0.f8552g
            r12.mo6192d()
            goto L_0x0064
        L_0x0024:
            java.lang.Object r12 = r12.obj
            r3 = r12
            androidx.media3.exoplayer.e.g r3 = (androidx.media3.exoplayer.p142e.C2977g) r3
            int r5 = r3.f8540a
            int r12 = r3.f8541b
            android.media.MediaCodec$CryptoInfo r7 = r3.f8543d
            long r8 = r3.f8544e
            int r10 = r3.f8545f
            java.lang.Object r12 = androidx.media3.exoplayer.p142e.C2978h.f8547b     // Catch:{ RuntimeException -> 0x0041 }
            monitor-enter(r12)     // Catch:{ RuntimeException -> 0x0041 }
            android.media.MediaCodec r4 = r0.f8548c     // Catch:{ all -> 0x003e }
            r6 = 0
            r4.queueSecureInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x003e }
            monitor-exit(r12)     // Catch:{ all -> 0x003e }
            goto L_0x0064
        L_0x003e:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ RuntimeException -> 0x0041 }
        L_0x0041:
            r12 = move-exception
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8551f
            androidx.media3.exoplayer.p142e.C2975e.m8425a(r0, r12)
            goto L_0x0064
        L_0x0048:
            java.lang.Object r12 = r12.obj
            r3 = r12
            androidx.media3.exoplayer.e.g r3 = (androidx.media3.exoplayer.p142e.C2977g) r3
            int r5 = r3.f8540a
            int r12 = r3.f8541b
            int r7 = r3.f8542c
            long r8 = r3.f8544e
            int r10 = r3.f8545f
            android.media.MediaCodec r4 = r0.f8548c     // Catch:{ RuntimeException -> 0x005e }
            r6 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ RuntimeException -> 0x005e }
            goto L_0x0064
        L_0x005e:
            r12 = move-exception
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8551f
            androidx.media3.exoplayer.p142e.C2975e.m8425a(r0, r12)
        L_0x0064:
            if (r3 == 0) goto L_0x0073
            java.util.ArrayDeque r12 = androidx.media3.exoplayer.p142e.C2978h.f8546a
            monitor-enter(r12)
            java.util.ArrayDeque r0 = androidx.media3.exoplayer.p142e.C2978h.f8546a     // Catch:{ all -> 0x0070 }
            r0.add(r3)     // Catch:{ all -> 0x0070 }
            monitor-exit(r12)     // Catch:{ all -> 0x0070 }
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0070 }
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2976f.handleMessage(android.os.Message):void");
    }
}
