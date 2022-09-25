package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.wearable.internal.db */
/* compiled from: PG */
final class C146498db implements Callable {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f395679a;

    /* renamed from: b */
    final /* synthetic */ byte[] f395680b;

    public C146498db(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f395679a = parcelFileDescriptor;
        this.f395680b = bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|(1:20)|21|22|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = java.lang.String.valueOf(r8.f395679a);
        android.util.Log.w("WearableClient", "processAssets: writing data failed: " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (android.util.Log.isLoggable("WearableClient", 3) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r2 = java.lang.String.valueOf(r8.f395679a);
        android.util.Log.d("WearableClient", "processAssets: closing: " + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c6, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            java.lang.String r0 = "processAssets: closing: "
            java.lang.String r1 = "processAssets: wrote data: "
            java.lang.String r2 = "processAssets: writing data failed: "
            java.lang.String r3 = "WearableClient"
            r4 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r4)
            if (r5 == 0) goto L_0x0022
            android.os.ParcelFileDescriptor r5 = r8.f395679a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "processAssets: writing data to FD : "
            java.lang.String r5 = r6.concat(r5)
            android.util.Log.d(r3, r5)
        L_0x0022:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r5 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream
            android.os.ParcelFileDescriptor r6 = r8.f395679a
            r5.<init>(r6)
            byte[] r6 = r8.f395680b     // Catch:{ IOException -> 0x0072 }
            r5.write(r6)     // Catch:{ IOException -> 0x0072 }
            r5.flush()     // Catch:{ IOException -> 0x0072 }
            boolean r6 = android.util.Log.isLoggable(r3, r4)     // Catch:{ IOException -> 0x0072 }
            if (r6 == 0) goto L_0x004c
            android.os.ParcelFileDescriptor r6 = r8.f395679a     // Catch:{ IOException -> 0x0072 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0072 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0072 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0072 }
            r7.append(r6)     // Catch:{ IOException -> 0x0072 }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x0072 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0072 }
        L_0x004c:
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0072 }
            boolean r2 = android.util.Log.isLoggable(r3, r4)     // Catch:{ IOException -> 0x00aa }
            if (r2 == 0) goto L_0x006c
            android.os.ParcelFileDescriptor r2 = r8.f395679a     // Catch:{ IOException -> 0x00aa }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x00aa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00aa }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00aa }
            r4.append(r2)     // Catch:{ IOException -> 0x00aa }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00aa }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x00aa }
        L_0x006c:
            r5.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00aa
        L_0x0070:
            r1 = move-exception
            goto L_0x00ab
        L_0x0072:
            android.os.ParcelFileDescriptor r1 = r8.f395679a     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r6.<init>(r2)     // Catch:{ all -> 0x0070 }
            r6.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0070 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x0070 }
            boolean r1 = android.util.Log.isLoggable(r3, r4)     // Catch:{ IOException -> 0x00a5 }
            if (r1 == 0) goto L_0x00a2
            android.os.ParcelFileDescriptor r1 = r8.f395679a     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00a5 }
            r2.append(r1)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x00a5 }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x00a5 }
        L_0x00a2:
            r5.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x00aa:
            return r1
        L_0x00ab:
            boolean r2 = android.util.Log.isLoggable(r3, r4)     // Catch:{ IOException -> 0x00c9 }
            if (r2 == 0) goto L_0x00c6
            android.os.ParcelFileDescriptor r2 = r8.f395679a     // Catch:{ IOException -> 0x00c9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x00c9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c9 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00c9 }
            r4.append(r2)     // Catch:{ IOException -> 0x00c9 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00c9 }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x00c9 }
        L_0x00c6:
            r5.close()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C146498db.call():java.lang.Object");
    }
}
