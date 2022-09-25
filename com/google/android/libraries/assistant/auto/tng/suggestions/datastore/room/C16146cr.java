package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cr */
/* compiled from: PG */
final class C16146cr implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47636a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47637b;

    /* renamed from: c */
    final /* synthetic */ C16156da f47638c;

    public C16146cr(C16156da daVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47638c = daVar;
        this.f47636a = amVar;
        this.f47637b = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.co] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r23 = this;
            r1 = r23
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.da r0 = r1.f47638c
            androidx.p.ah r0 = r0.f47656a
            androidx.p.am r2 = r1.f47636a
            android.os.CancellationSignal r3 = r1.f47637b
            r4 = 0
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r4, r3)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r2, r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "candidate_suggestion_id"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r2, r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = "display_id"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r2, r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = "is_displayed_now"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r2, r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = "display_text"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r2, r7)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "description"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r2, r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = "display_metadata"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r2, r9)     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = "source"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r2, r10)     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = "action_fulfillment_data"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r2, r11)     // Catch:{ all -> 0x00d2 }
            boolean r12 = r2.moveToFirst()     // Catch:{ all -> 0x00d2 }
            r13 = 0
            if (r12 == 0) goto L_0x00ca
            boolean r12 = r2.isNull(r0)     // Catch:{ all -> 0x00d2 }
            if (r12 == 0) goto L_0x0054
            r14 = r13
            goto L_0x0059
        L_0x0054:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d2 }
            r14 = r0
        L_0x0059:
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0061
            r15 = r13
            goto L_0x0066
        L_0x0061:
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x00d2 }
            r15 = r0
        L_0x0066:
            boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x006f
            r16 = r13
            goto L_0x0075
        L_0x006f:
            java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d2 }
            r16 = r0
        L_0x0075:
            int r0 = r2.getInt(r6)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x007f
            r4 = 1
            r17 = 1
            goto L_0x0081
        L_0x007f:
            r17 = 0
        L_0x0081:
            boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x008a
            r18 = r13
            goto L_0x0090
        L_0x008a:
            java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d2 }
            r18 = r0
        L_0x0090:
            boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0099
            r19 = r13
            goto L_0x009f
        L_0x0099:
            java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x00d2 }
            r19 = r0
        L_0x009f:
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00a7
            r0 = r13
            goto L_0x00ab
        L_0x00a7:
            byte[] r0 = r2.getBlob(r9)     // Catch:{ all -> 0x00d2 }
        L_0x00ab:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r20 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16088an.m32966c(r0)     // Catch:{ all -> 0x00d2 }
            int r0 = r2.getInt(r10)     // Catch:{ all -> 0x00d2 }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r21 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m.m33196a(r0)     // Catch:{ all -> 0x00d2 }
            boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            byte[] r13 = r2.getBlob(r11)     // Catch:{ all -> 0x00d2 }
        L_0x00c2:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r22 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16088an.m32964a(r13)     // Catch:{ all -> 0x00d2 }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.co r13 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co.m33093j(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00d2 }
        L_0x00ca:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r13)     // Catch:{ all -> 0x00d2 }
            r2.close()
            return r0
        L_0x00d2:
            r0 = move-exception
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16146cr.call():java.lang.Object");
    }
}
