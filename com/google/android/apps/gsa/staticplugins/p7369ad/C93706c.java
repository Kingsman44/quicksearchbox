package com.google.android.apps.gsa.staticplugins.p7369ad;

import android.content.ContentResolver;
import com.google.android.apps.gsa.contacts.C74482ch;
import com.google.android.apps.gsa.contacts.by;
import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.k.e;
import com.google.android.apps.gsa.k.f;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ad.c */
/* compiled from: PG */
public final class C93706c implements C118549h {

    /* renamed from: a */
    private static final C59071e f261514a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ad.c");

    /* renamed from: b */
    private final ContentResolver f261515b;

    /* renamed from: c */
    private final d f261516c;

    /* renamed from: d */
    private final by f261517d;

    /* renamed from: e */
    private final C74482ch f261518e;

    public C93706c(ContentResolver contentResolver, e eVar, f fVar, by byVar, C74482ch chVar) {
        this.f261515b = contentResolver;
        this.f261516c = new d(C93712i.f261525c, "contacts_change.binarypb", eVar, fVar, true);
        this.f261517d = byVar;
        this.f261518e = chVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo65234a(com.google.android.apps.gsa.tasks.C118476ak r9) {
        /*
            r8 = this;
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9 = 1
            java.lang.String[] r2 = new java.lang.String[r9]
            r6 = 0
            java.lang.String r7 = "contact_last_updated_timestamp"
            r2[r6] = r7
            java.lang.String r5 = "contact_last_updated_timestamp desc"
            android.content.ContentResolver r0 = r8.f261515b     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
            if (r0 == 0) goto L_0x007e
            int r1 = r0.getCount()     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x001f
            goto L_0x007e
        L_0x001f:
            r0.moveToNext()     // Catch:{ all -> 0x0086 }
            int r1 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0086 }
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.k.d r3 = r8.f261516c     // Catch:{ all -> 0x0086 }
            com.google.protobuf.MessageLite r3 = r3.a()     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.staticplugins.ad.i r3 = (com.google.android.apps.gsa.staticplugins.p7369ad.C93712i) r3     // Catch:{ all -> 0x0086 }
            long r3 = r3.f261528b     // Catch:{ all -> 0x0086 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0070
            com.google.android.apps.gsa.contacts.by r3 = r8.f261517d     // Catch:{ all -> 0x0086 }
            boolean r3 = r3.g()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0054
            com.google.android.apps.gsa.contacts.by r3 = r8.f261517d     // Catch:{ all -> 0x0086 }
            j$.util.Optional r3 = r3.b()     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.contacts.ch r4 = r8.f261518e     // Catch:{ all -> 0x0086 }
            p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.staticplugins.ad.a r5 = new com.google.android.apps.gsa.staticplugins.ad.a     // Catch:{ all -> 0x0086 }
            r5.<init>(r4)     // Catch:{ all -> 0x0086 }
            r3.ifPresent(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x0070
        L_0x0054:
            com.google.common.f.e r3 = f261514a     // Catch:{ all -> 0x0086 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0086 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "LogsBasedChangeRefresh"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x0086 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0086 }
            r4 = 19030(0x4a56, float:2.6667E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0086 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "Refreshing not complete, unable to upload top contacts."
            r3.mo56386p(r4)     // Catch:{ all -> 0x0086 }
        L_0x0070:
            com.google.android.apps.gsa.k.d r3 = r8.f261516c     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.staticplugins.ad.b r4 = new com.google.android.apps.gsa.staticplugins.ad.b     // Catch:{ all -> 0x0086 }
            r4.<init>(r1)     // Catch:{ all -> 0x0086 }
            r3.d(r4)     // Catch:{ all -> 0x0086 }
            r0.close()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
            goto L_0x00a4
        L_0x007e:
            com.google.common.util.concurrent.cx r9 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0085
            r0.close()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
        L_0x0085:
            return r9
        L_0x0086:
            r1 = move-exception
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ all -> 0x008d }
            goto L_0x00a3
        L_0x008d:
            r0 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00a3 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r2[r6] = r3     // Catch:{ Exception -> 0x00a3 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00a3 }
            r9[r6] = r0     // Catch:{ Exception -> 0x00a3 }
            r2.invoke(r1, r9)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            throw r1     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00a4 }
        L_0x00a4:
            com.google.common.util.concurrent.cx r9 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7369ad.C93706c.mo65234a(com.google.android.apps.gsa.tasks.ak):com.google.common.util.concurrent.cx");
    }
}
