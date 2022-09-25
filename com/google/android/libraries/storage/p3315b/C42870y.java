package com.google.android.libraries.storage.p3315b;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.storage.b.y */
/* compiled from: PG */
public final /* synthetic */ class C42870y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42823ai f112173a;

    public /* synthetic */ C42870y(C42823ai aiVar) {
        this.f112173a = aiVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r10 = com.google.android.libraries.storage.p3315b.C42823ai.m75657a(r0.f112085b, r10, r0.f112091h, r0.f112088e, r0.f112089f, r0.f112090g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.libraries.storage.p3315b.C42823ai.f112084a.mo56225c()).mo56382g(r0)).mo56372aa(54066)).mo56386p("Fatal Exception when trying to upgrade database. Proceeding to delete.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.google.android.libraries.storage.p3315b.C42823ai.m75659f(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        throw new com.google.android.libraries.storage.p3315b.C42818ad("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        throw new com.google.android.libraries.storage.p3315b.C42818ad("Recovery by deletion failed.", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        throw new com.google.android.libraries.storage.p3315b.C42818ad("Probably-recoverable database upgrade failure.", r10);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.libraries.storage.b.ai r0 = r9.f112173a
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = r0.f112092i
            if (r1 != 0) goto L_0x000f
            android.content.Context r1 = r0.f112085b
            java.io.File r10 = r1.getDatabasePath(r10)
            goto L_0x0015
        L_0x000f:
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r10)
            r10 = r2
        L_0x0015:
            boolean r1 = r0.f112098o
            if (r1 != 0) goto L_0x0068
            com.google.android.libraries.storage.b.ah r1 = r0.f112087d
            java.lang.String r2 = r10.getPath()
            java.util.Set r1 = r1.f112083a
            boolean r1 = r1.add(r2)
            if (r1 == 0) goto L_0x004f
            r1 = 1
            r0.f112098o = r1
            android.content.Context r1 = r0.f112085b
            com.google.android.libraries.storage.b.ao r2 = r0.f112091h
            boolean r1 = com.google.android.libraries.storage.p3315b.C42823ai.m75660g(r1, r2)
            r0.f112099p = r1
            if (r1 == 0) goto L_0x0068
            android.content.Context r1 = r0.f112085b     // Catch:{ IOException -> 0x004d }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ IOException -> 0x004d }
            if (r1 == 0) goto L_0x0068
            java.lang.String r2 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x004d }
            boolean r1 = r2.startsWith(r1)     // Catch:{ IOException -> 0x004d }
            r0.f112099p = r1     // Catch:{ IOException -> 0x004d }
            goto L_0x0068
        L_0x004d:
            goto L_0x0068
        L_0x004f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DB "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0068:
            java.util.Set r1 = r0.f112093j
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00b0
            java.util.Iterator r1 = r1.iterator()
        L_0x0074:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            if (r2 == 0) goto L_0x00ac
            boolean r3 = r2.isOpen()
            if (r3 != 0) goto L_0x008f
            goto L_0x0074
        L_0x008f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.getPath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Open database reference to "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " already exists. Follow instructions in source to file a bug against TikTok."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        L_0x00ac:
            r1.remove()
            goto L_0x0074
        L_0x00b0:
            android.content.Context r3 = r0.f112085b     // Catch:{ ad | af | ag -> 0x00c0 }
            com.google.android.libraries.storage.b.ao r5 = r0.f112091h     // Catch:{ ad | af | ag -> 0x00c0 }
            com.google.common.base.ax r6 = r0.f112088e     // Catch:{ ad | af | ag -> 0x00c0 }
            java.util.List r7 = r0.f112089f     // Catch:{ ad | af | ag -> 0x00c0 }
            java.util.List r8 = r0.f112090g     // Catch:{ ad | af | ag -> 0x00c0 }
            r4 = r10
            android.database.sqlite.SQLiteDatabase r10 = com.google.android.libraries.storage.p3315b.C42823ai.m75657a(r3, r4, r5, r6, r7, r8)     // Catch:{ ad | af | ag -> 0x00c0 }
            goto L_0x00cf
        L_0x00c0:
            android.content.Context r3 = r0.f112085b     // Catch:{ ag -> 0x0102, af -> 0x00df }
            com.google.android.libraries.storage.b.ao r5 = r0.f112091h     // Catch:{ ag -> 0x0102, af -> 0x00df }
            com.google.common.base.ax r6 = r0.f112088e     // Catch:{ ag -> 0x0102, af -> 0x00df }
            java.util.List r7 = r0.f112089f     // Catch:{ ag -> 0x0102, af -> 0x00df }
            java.util.List r8 = r0.f112090g     // Catch:{ ag -> 0x0102, af -> 0x00df }
            r4 = r10
            android.database.sqlite.SQLiteDatabase r10 = com.google.android.libraries.storage.p3315b.C42823ai.m75657a(r3, r4, r5, r6, r7, r8)     // Catch:{ ag -> 0x0102, af -> 0x00df }
        L_0x00cf:
            java.util.Set r1 = r0.f112093j
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r10)
            r1.add(r2)
            android.content.Context r1 = r0.f112085b
            r1.registerComponentCallbacks(r0)
            return r10
        L_0x00df:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.storage.p3315b.C42823ai.f112084a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Fatal Exception when trying to upgrade database. Proceeding to delete."
            r3 = 54066(0xd332, float:7.5763E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.storage.p3315b.C42823ai.m75659f(r10)     // Catch:{ all -> 0x00f9 }
            com.google.android.libraries.storage.b.ad r10 = new com.google.android.libraries.storage.b.ad
            java.lang.String r1 = "Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance."
            r10.<init>(r1, r0)
            throw r10
        L_0x00f9:
            r10 = move-exception
            com.google.android.libraries.storage.b.ad r0 = new com.google.android.libraries.storage.b.ad
            java.lang.String r1 = "Recovery by deletion failed."
            r0.<init>(r1, r10)
            throw r0
        L_0x0102:
            r10 = move-exception
            com.google.android.libraries.storage.b.ad r0 = new com.google.android.libraries.storage.b.ad
            java.lang.String r1 = "Probably-recoverable database upgrade failure."
            r0.<init>(r1, r10)
            goto L_0x010c
        L_0x010b:
            throw r0
        L_0x010c:
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3315b.C42870y.apply(java.lang.Object):java.lang.Object");
    }
}
