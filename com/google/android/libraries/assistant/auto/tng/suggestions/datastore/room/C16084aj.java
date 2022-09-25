package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aj */
/* compiled from: PG */
final class C16084aj implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f47543a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f47544b;

    /* renamed from: c */
    final /* synthetic */ C16087am f47545c;

    public C16084aj(C16087am amVar, C3930am amVar2, CancellationSignal cancellationSignal) {
        this.f47545c = amVar;
        this.f47543a = amVar2;
        this.f47544b = cancellationSignal;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r27 = this;
            r1 = r27
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.am r0 = r1.f47545c
            androidx.p.ah r0 = r0.f47551a
            androidx.p.am r2 = r1.f47543a
            r3 = 0
            android.os.CancellationSignal r4 = r1.f47544b
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r3, r4)
            java.lang.String r0 = "candidate_suggestion_id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r2, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "click_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r2, r3)     // Catch:{ all -> 0x007b }
            java.lang.String r4 = "show_count"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r2, r4)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "last_click_timestamp"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r2, r5)     // Catch:{ all -> 0x007b }
            java.lang.String r6 = "last_show_timestamp"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r2, r6)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "last_cleared_timestamp"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r2, r7)     // Catch:{ all -> 0x007b }
            java.lang.String r8 = "dismissal_count"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r2, r8)     // Catch:{ all -> 0x007b }
            java.lang.String r9 = "last_dismissal_timestamp"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r2, r9)     // Catch:{ all -> 0x007b }
            boolean r10 = r2.moveToFirst()     // Catch:{ all -> 0x007b }
            r11 = 0
            if (r10 == 0) goto L_0x0073
            boolean r10 = r2.isNull(r0)     // Catch:{ all -> 0x007b }
            if (r10 == 0) goto L_0x004e
        L_0x004c:
            r12 = r11
            goto L_0x0053
        L_0x004e:
            java.lang.String r11 = r2.getString(r0)     // Catch:{ all -> 0x007b }
            goto L_0x004c
        L_0x0053:
            long r13 = r2.getLong(r3)     // Catch:{ all -> 0x007b }
            long r15 = r2.getLong(r4)     // Catch:{ all -> 0x007b }
            long r17 = r2.getLong(r5)     // Catch:{ all -> 0x007b }
            long r19 = r2.getLong(r6)     // Catch:{ all -> 0x007b }
            long r21 = r2.getLong(r7)     // Catch:{ all -> 0x007b }
            long r23 = r2.getLong(r8)     // Catch:{ all -> 0x007b }
            long r25 = r2.getLong(r9)     // Catch:{ all -> 0x007b }
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ac r11 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac.m32939j(r12, r13, r15, r17, r19, r21, r23, r25)     // Catch:{ all -> 0x007b }
        L_0x0073:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r11)     // Catch:{ all -> 0x007b }
            r2.close()
            return r0
        L_0x007b:
            r0 = move-exception
            r2.close()
            goto L_0x0081
        L_0x0080:
            throw r0
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16084aj.call():java.lang.Object");
    }
}
