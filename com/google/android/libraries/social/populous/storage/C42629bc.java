package com.google.android.libraries.social.populous.storage;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.storage.bc */
/* compiled from: PG */
final class C42629bc implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f111829a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f111830b;

    /* renamed from: c */
    final /* synthetic */ C42634bh f111831c;

    public C42629bc(C42634bh bhVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f111831c = bhVar;
        this.f111829a = amVar;
        this.f111830b = cancellationSignal;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.libraries.social.populous.storage.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [com.google.android.libraries.social.populous.storage.da] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r18 = this;
            r1 = r18
            com.google.android.libraries.social.populous.storage.bh r0 = r1.f111831c
            androidx.p.ah r0 = r0.f111844a
            androidx.p.am r2 = r1.f111829a
            android.os.CancellationSignal r3 = r1.f111830b
            r4 = 0
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r4, r3)
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x00be }
        L_0x0013:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x00b6
            boolean r3 = r2.isNull(r4)     // Catch:{ all -> 0x00be }
            r5 = 1
            r6 = 3
            r7 = 2
            r8 = 0
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.isNull(r5)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.isNull(r7)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.isNull(r6)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r3 = r8
            goto L_0x0066
        L_0x0038:
            long r10 = r2.getLong(r4)     // Catch:{ all -> 0x00be }
            double r12 = r2.getDouble(r5)     // Catch:{ all -> 0x00be }
            boolean r3 = r2.isNull(r7)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0048
            r3 = r8
            goto L_0x004c
        L_0x0048:
            java.lang.String r3 = r2.getString(r7)     // Catch:{ all -> 0x00be }
        L_0x004c:
            com.google.android.libraries.social.populous.core.ch r14 = com.google.android.libraries.social.populous.core.C42309ch.m74494c(r3)     // Catch:{ all -> 0x00be }
            boolean r3 = r2.isNull(r6)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0058
            r3 = r8
            goto L_0x005c
        L_0x0058:
            byte[] r3 = r2.getBlob(r6)     // Catch:{ all -> 0x00be }
        L_0x005c:
            com.google.protobuf.z r15 = com.google.protobuf.C63088z.m96139A(r3)     // Catch:{ all -> 0x00be }
            com.google.android.libraries.social.populous.storage.f r3 = new com.google.android.libraries.social.populous.storage.f     // Catch:{ all -> 0x00be }
            r9 = r3
            r9.<init>(r10, r12, r14, r15)     // Catch:{ all -> 0x00be }
        L_0x0066:
            r5 = 4
            boolean r6 = r2.isNull(r5)     // Catch:{ all -> 0x00be }
            r7 = 6
            r9 = 7
            r10 = 5
            if (r6 == 0) goto L_0x0082
            boolean r6 = r2.isNull(r10)     // Catch:{ all -> 0x00be }
            if (r6 == 0) goto L_0x0082
            boolean r6 = r2.isNull(r7)     // Catch:{ all -> 0x00be }
            if (r6 == 0) goto L_0x0082
            boolean r6 = r2.isNull(r9)     // Catch:{ all -> 0x00be }
            if (r6 != 0) goto L_0x00ac
        L_0x0082:
            long r12 = r2.getLong(r5)     // Catch:{ all -> 0x00be }
            boolean r5 = r2.isNull(r10)     // Catch:{ all -> 0x00be }
            if (r5 == 0) goto L_0x008e
            r14 = r8
            goto L_0x0093
        L_0x008e:
            java.lang.String r5 = r2.getString(r10)     // Catch:{ all -> 0x00be }
            r14 = r5
        L_0x0093:
            double r15 = r2.getDouble(r7)     // Catch:{ all -> 0x00be }
            boolean r5 = r2.isNull(r9)     // Catch:{ all -> 0x00be }
            if (r5 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            java.lang.String r8 = r2.getString(r9)     // Catch:{ all -> 0x00be }
        L_0x00a2:
            com.google.android.libraries.social.populous.storage.cv r17 = com.google.android.libraries.social.populous.storage.C42681da.m75376a(r8)     // Catch:{ all -> 0x00be }
            com.google.android.libraries.social.populous.storage.da r8 = new com.google.android.libraries.social.populous.storage.da     // Catch:{ all -> 0x00be }
            r11 = r8
            r11.<init>(r12, r14, r15, r17)     // Catch:{ all -> 0x00be }
        L_0x00ac:
            com.google.android.libraries.social.populous.storage.cx r5 = new com.google.android.libraries.social.populous.storage.cx     // Catch:{ all -> 0x00be }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x00be }
            r0.mo55395g(r5)     // Catch:{ all -> 0x00be }
            goto L_0x0013
        L_0x00b6:
            com.google.common.b.gu r0 = r0.mo55394f()     // Catch:{ all -> 0x00be }
            r2.close()
            return r0
        L_0x00be:
            r0 = move-exception
            r2.close()
            goto L_0x00c4
        L_0x00c3:
            throw r0
        L_0x00c4:
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42629bc.call():java.lang.Object");
    }
}
