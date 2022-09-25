package com.google.android.libraries.assistant.pcp.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3930am;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.l */
/* compiled from: PG */
final class C18625l implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3930am f52646a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f52647b;

    /* renamed from: c */
    final /* synthetic */ C18627n f52648c;

    public C18625l(C18627n nVar, C3930am amVar, CancellationSignal cancellationSignal) {
        this.f52648c = nVar;
        this.f52646a = amVar;
        this.f52647b = cancellationSignal;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.google.android.libraries.assistant.pcp.m.y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r4 = this;
            com.google.android.libraries.assistant.pcp.datastore.room.n r0 = r4.f52648c
            androidx.p.ah r0 = r0.f52652a
            androidx.p.am r1 = r4.f52646a
            android.os.CancellationSignal r2 = r4.f52647b
            r3 = 0
            android.database.Cursor r0 = androidx.p182p.p185c.C3940b.m11293a(r0, r1, r3, r2)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            boolean r1 = r0.isNull(r3)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            byte[] r2 = r0.getBlob(r3)     // Catch:{ all -> 0x002b }
        L_0x001f:
            com.google.android.libraries.assistant.pcp.m.y r2 = com.google.android.libraries.assistant.pcp.datastore.room.C18619f.m36083a(r2)     // Catch:{ all -> 0x002b }
        L_0x0023:
            j$.util.Optional r1 = p3186j$.util.Optional.ofNullable(r2)     // Catch:{ all -> 0x002b }
            r0.close()
            return r1
        L_0x002b:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.pcp.datastore.room.C18625l.call():java.lang.Object");
    }
}
