package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bj */
/* compiled from: PG */
final class C16111bj implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47589a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47590b;

    /* renamed from: c */
    final /* synthetic */ C16112bk f47591c;

    public C16111bj(C16112bk bkVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f47591c = bkVar;
        this.f47589a = amVar;
        this.f47590b = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bk r0 = r8.f47591c
            androidx.p.ah r0 = r0.f47592a
            androidx.p.am r1 = r8.f47589a
            android.os.CancellationSignal r2 = r8.f47590b
            r3 = 0
            android.database.Cursor r0 = androidx.p182p.p185c.C3940b.m11293a(r0, r1, r3, r2)
            java.lang.String r1 = "signal_value"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r0, r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "signal_type"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r0, r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "generation_timestamp"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r0, r4)     // Catch:{ all -> 0x0066 }
            boolean r5 = r0.moveToFirst()     // Catch:{ all -> 0x0066 }
            r6 = 0
            if (r5 == 0) goto L_0x005e
            boolean r5 = r0.isNull(r1)     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            java.lang.String r6 = r0.getString(r1)     // Catch:{ all -> 0x0066 }
        L_0x0031:
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0066 }
            r2 = 2
            int[] r5 = new int[r2]     // Catch:{ all -> 0x0066 }
            r7 = 1
            r5[r3] = r7     // Catch:{ all -> 0x0066 }
            r5[r7] = r2     // Catch:{ all -> 0x0066 }
            r1 = r5[r1]     // Catch:{ all -> 0x0066 }
            long r2 = r0.getLong(r4)     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.g r4 = new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.g     // Catch:{ all -> 0x0066 }
            r4.<init>(r6, r1, r2)     // Catch:{ all -> 0x0066 }
            r6 = r4
            goto L_0x005e
        L_0x004e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Null signalType"
            r1.<init>(r2)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0056:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Null signalValue"
            r1.<init>(r2)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x005e:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r6)     // Catch:{ all -> 0x0066 }
            r0.close()
            return r1
        L_0x0066:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16111bj.call():java.lang.Object");
    }
}
