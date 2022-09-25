package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bu */
/* compiled from: PG */
final class C16122bu implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47601a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47602b;

    /* renamed from: c */
    final /* synthetic */ C16123bv f47603c;

    public C16122bu(C16123bv bvVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47603c = bvVar;
        this.f47601a = amVar;
        this.f47602b = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r19 = this;
            r1 = r19
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bv r0 = r1.f47603c
            androidx.p.ah r0 = r0.f47604a
            androidx.p.am r2 = r1.f47601a
            android.os.CancellationSignal r3 = r1.f47602b
            r4 = 0
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r4, r3)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r2, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "display_id"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r2, r3)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "is_displayed_now"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r2, r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "status"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r2, r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "display_text"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r2, r7)     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "display_metadata"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r2, r8)     // Catch:{ all -> 0x00a8 }
            java.lang.String r9 = "action_fulfillment_data"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r2, r9)     // Catch:{ all -> 0x00a8 }
            boolean r10 = r2.moveToFirst()     // Catch:{ all -> 0x00a8 }
            r11 = 0
            if (r10 == 0) goto L_0x00a0
            boolean r10 = r2.isNull(r0)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x0048
            r12 = r11
            goto L_0x004d
        L_0x0048:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00a8 }
            r12 = r0
        L_0x004d:
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0055
            r13 = r11
            goto L_0x005a
        L_0x0055:
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x00a8 }
            r13 = r0
        L_0x005a:
            int r0 = r2.getInt(r5)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0063
            r4 = 1
            r14 = 1
            goto L_0x0064
        L_0x0063:
            r14 = 0
        L_0x0064:
            int r0 = r2.getInt(r6)     // Catch:{ all -> 0x00a8 }
            int[] r3 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16114bm.m33034a()     // Catch:{ all -> 0x00a8 }
            r15 = r3[r0]     // Catch:{ all -> 0x00a8 }
            boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0077
            r16 = r11
            goto L_0x007d
        L_0x0077:
            java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00a8 }
            r16 = r0
        L_0x007d:
            boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0085
            r0 = r11
            goto L_0x0089
        L_0x0085:
            byte[] r0 = r2.getBlob(r8)     // Catch:{ all -> 0x00a8 }
        L_0x0089:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r17 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16088an.m32966c(r0)     // Catch:{ all -> 0x00a8 }
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            byte[] r11 = r2.getBlob(r9)     // Catch:{ all -> 0x00a8 }
        L_0x0098:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r18 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16088an.m32964a(r11)     // Catch:{ all -> 0x00a8 }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bn r11 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn.m33035h(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00a8 }
        L_0x00a0:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r11)     // Catch:{ all -> 0x00a8 }
            r2.close()
            return r0
        L_0x00a8:
            r0 = move-exception
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16122bu.call():java.lang.Object");
    }
}
