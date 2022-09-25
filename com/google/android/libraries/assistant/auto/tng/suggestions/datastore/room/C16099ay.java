package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ay */
/* compiled from: PG */
final class C16099ay implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47574a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47575b;

    /* renamed from: c */
    final /* synthetic */ C16100az f47576c;

    public C16099ay(C16100az azVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47576c = azVar;
        this.f47574a = amVar;
        this.f47575b = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r23 = this;
            r1 = r23
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.az r0 = r1.f47576c
            androidx.p.ah r0 = r0.f47577a
            androidx.p.am r2 = r1.f47574a
            r3 = 0
            android.os.CancellationSignal r4 = r1.f47575b
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r3, r4)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r2, r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "display_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r2, r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "num_suggestions"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r2, r4)     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "length"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r2, r5)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = "width"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r2, r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "font_size"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r2, r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = "max_display_text_length"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r2, r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r9 = "generation_timestamp"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r2, r9)     // Catch:{ all -> 0x0096 }
            java.lang.String r10 = "display_metadata"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r2, r10)     // Catch:{ all -> 0x0096 }
            boolean r11 = r2.moveToFirst()     // Catch:{ all -> 0x0096 }
            r12 = 0
            if (r11 == 0) goto L_0x008e
            boolean r11 = r2.isNull(r0)     // Catch:{ all -> 0x0096 }
            if (r11 == 0) goto L_0x0054
            r13 = r12
            goto L_0x0059
        L_0x0054:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0096 }
            r13 = r0
        L_0x0059:
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x0096 }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap[] r3 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.values()     // Catch:{ all -> 0x0096 }
            r14 = r3[r0]     // Catch:{ all -> 0x0096 }
            int r15 = r2.getInt(r4)     // Catch:{ all -> 0x0096 }
            float r16 = r2.getFloat(r5)     // Catch:{ all -> 0x0096 }
            float r17 = r2.getFloat(r6)     // Catch:{ all -> 0x0096 }
            int r18 = r2.getInt(r7)     // Catch:{ all -> 0x0096 }
            int r19 = r2.getInt(r8)     // Catch:{ all -> 0x0096 }
            long r20 = r2.getLong(r9)     // Catch:{ all -> 0x0096 }
            boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            byte[] r12 = r2.getBlob(r10)     // Catch:{ all -> 0x0096 }
        L_0x0086:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ba r22 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16088an.m32967d(r12)     // Catch:{ all -> 0x0096 }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r12 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq.m32981j(r13, r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0096 }
        L_0x008e:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r12)     // Catch:{ all -> 0x0096 }
            r2.close()
            return r0
        L_0x0096:
            r0 = move-exception
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16099ay.call():java.lang.Object");
    }
}
