package com.google.android.libraries.social.populous.storage;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.storage.bs */
/* compiled from: PG */
final class C42645bs implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f111851a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f111852b;

    /* renamed from: c */
    final /* synthetic */ C42647bu f111853c;

    public C42645bs(C42647bu buVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f111853c = buVar;
        this.f111851a = amVar;
        this.f111852b = cancellationSignal;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.libraries.social.populous.storage.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            com.google.android.libraries.social.populous.storage.bu r0 = r9.f111853c
            androidx.p.ah r0 = r0.f111857a
            androidx.p.am r1 = r9.f111851a
            android.os.CancellationSignal r2 = r9.f111852b
            r3 = 0
            android.database.Cursor r0 = androidx.p182p.p185c.C3940b.m11293a(r0, r1, r3, r2)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x009e }
            int r2 = r0.getCount()     // Catch:{ all -> 0x009e }
            r1.<init>(r2)     // Catch:{ all -> 0x009e }
        L_0x0016:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x009a
            boolean r2 = r0.isNull(r3)     // Catch:{ all -> 0x009e }
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x002d
            boolean r2 = r0.isNull(r4)     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = r5
            goto L_0x004e
        L_0x002d:
            boolean r2 = r0.isNull(r3)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0035
            r2 = r5
            goto L_0x0039
        L_0x0035:
            java.lang.String r2 = r0.getString(r3)     // Catch:{ all -> 0x009e }
        L_0x0039:
            boolean r6 = r0.isNull(r4)     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0041
            r4 = r5
            goto L_0x0045
        L_0x0041:
            byte[] r4 = r0.getBlob(r4)     // Catch:{ all -> 0x009e }
        L_0x0045:
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96139A(r4)     // Catch:{ all -> 0x009e }
            com.google.android.libraries.social.populous.storage.j r6 = new com.google.android.libraries.social.populous.storage.j     // Catch:{ all -> 0x009e }
            r6.<init>(r2, r4)     // Catch:{ all -> 0x009e }
        L_0x004e:
            r2 = 2
            boolean r4 = r0.isNull(r2)     // Catch:{ all -> 0x009e }
            r7 = 4
            r8 = 3
            if (r4 == 0) goto L_0x0063
            boolean r4 = r0.isNull(r8)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0063
            boolean r4 = r0.isNull(r7)     // Catch:{ all -> 0x009e }
            if (r4 != 0) goto L_0x0090
        L_0x0063:
            boolean r4 = r0.isNull(r2)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x006b
            r2 = r5
            goto L_0x006f
        L_0x006b:
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x009e }
        L_0x006f:
            boolean r4 = r0.isNull(r8)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0077
            r4 = r5
            goto L_0x007b
        L_0x0077:
            java.lang.String r4 = r0.getString(r8)     // Catch:{ all -> 0x009e }
        L_0x007b:
            boolean r8 = r0.isNull(r7)     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            java.lang.String r5 = r0.getString(r7)     // Catch:{ all -> 0x009e }
        L_0x0086:
            com.google.android.libraries.social.populous.storage.cv r5 = com.google.android.libraries.social.populous.storage.C42693n.m75405a(r5)     // Catch:{ all -> 0x009e }
            com.google.android.libraries.social.populous.storage.n r7 = new com.google.android.libraries.social.populous.storage.n     // Catch:{ all -> 0x009e }
            r7.<init>(r2, r4, r5)     // Catch:{ all -> 0x009e }
            r5 = r7
        L_0x0090:
            com.google.android.libraries.social.populous.storage.cy r2 = new com.google.android.libraries.social.populous.storage.cy     // Catch:{ all -> 0x009e }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x009e }
            r1.add(r2)     // Catch:{ all -> 0x009e }
            goto L_0x0016
        L_0x009a:
            r0.close()
            return r1
        L_0x009e:
            r1 = move-exception
            r0.close()
            goto L_0x00a4
        L_0x00a3:
            throw r1
        L_0x00a4:
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42645bs.call():java.lang.Object");
    }
}
