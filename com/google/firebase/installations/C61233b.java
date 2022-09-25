package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.google.firebase.installations.b */
/* compiled from: PG */
final class C61233b {

    /* renamed from: a */
    private final FileChannel f165631a;

    /* renamed from: b */
    private final FileLock f165632b;

    private C61233b(FileChannel fileChannel, FileLock fileLock) {
        this.f165631a = fileChannel;
        this.f165632b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC, Splitter:B:15:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC, Splitter:B:19:0x0047] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.installations.C61233b m93636b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002b, Error -> 0x0029, OverlappingFileLockException -> 0x0027 }
            com.google.firebase.installations.b r2 = new com.google.firebase.installations.b     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            return r2
        L_0x0021:
            r2 = move-exception
            goto L_0x0037
        L_0x0023:
            r2 = move-exception
            goto L_0x0037
        L_0x0025:
            r2 = move-exception
            goto L_0x0037
        L_0x0027:
            r0 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r2 = r0
            r0 = r1
            goto L_0x0037
        L_0x002f:
            r5 = move-exception
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0037:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0045
            r0.release()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C61233b.m93636b(android.content.Context):com.google.firebase.installations.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57811a() {
        try {
            this.f165632b.release();
            this.f165631a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
