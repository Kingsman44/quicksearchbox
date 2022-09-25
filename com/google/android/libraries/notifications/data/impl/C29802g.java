package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.notifications.data.impl.g */
/* compiled from: PG */
public final class C29802g implements C29826q {

    /* renamed from: a */
    private final Context f80814a;

    /* renamed from: b */
    private final C29823n f80815b;

    /* renamed from: c */
    private final HashMap f80816c = new HashMap();

    public C29802g(Context context, C29823n nVar) {
        this.f80814a = context;
        this.f80815b = nVar;
    }

    /* renamed from: e */
    private final synchronized C29801f m55043e(String str) {
        Long l;
        l = -1L;
        if (!TextUtils.isEmpty(str)) {
            l = this.f80815b.mo35088b(str).mo35004d();
        }
        if (!this.f80816c.containsKey(l)) {
            this.f80816c.put(l, new C29801f(this.f80814a, l.longValue()));
        }
        return (C29801f) this.f80816c.get(l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r8 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r8 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[SYNTHETIC, Splitter:B:31:0x0071] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.libraries.notifications.data.C29825p mo35096a(java.lang.String r8, int r9, byte[] r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            r2 = 2
            r1.<init>(r2)     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "job_type"
            r1.put(r3, r2)     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "payload"
            r1.put(r3, r10)     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            com.google.android.libraries.notifications.data.impl.f r8 = r7.m55043e(r8)     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0054, m -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "tasks"
            long r3 = r8.insert(r3, r0, r1)     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0045
            com.google.android.libraries.notifications.data.e r1 = new com.google.android.libraries.notifications.data.e     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            r1.<init>()     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            r1.f80757a = r3     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            r1.f80758b = r2     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            r1.mo35035b(r10)     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            com.google.android.libraries.notifications.data.p r9 = r1.mo35034a()     // Catch:{ RuntimeException -> 0x004d, m -> 0x004b }
            if (r8 == 0) goto L_0x0043
            r8.close()     // Catch:{ all -> 0x0075 }
        L_0x0043:
            monitor-exit(r7)
            return r9
        L_0x0045:
            if (r8 == 0) goto L_0x006b
        L_0x0047:
            r8.close()     // Catch:{ all -> 0x0075 }
            goto L_0x006b
        L_0x004b:
            r10 = move-exception
            goto L_0x0057
        L_0x004d:
            r10 = move-exception
            goto L_0x0057
        L_0x004f:
            r8 = move-exception
            r9 = r8
            goto L_0x006f
        L_0x0052:
            r8 = move-exception
            goto L_0x0055
        L_0x0054:
            r8 = move-exception
        L_0x0055:
            r10 = r8
            r8 = r0
        L_0x0057:
            java.lang.String r1 = "ChimeTaskDataStorageImpl"
            java.lang.String r2 = "Error inserting ChimeTaskData %d for account"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x006d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x006d }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x006d }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r1, r10, r2, r3)     // Catch:{ all -> 0x006d }
            if (r8 == 0) goto L_0x006b
            goto L_0x0047
        L_0x006b:
            monitor-exit(r7)
            return r0
        L_0x006d:
            r9 = move-exception
            r0 = r8
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ all -> 0x0075 }
        L_0x0074:
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0079
        L_0x0078:
            throw r8
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29802g.mo35096a(java.lang.String, int, byte[]):com.google.android.libraries.notifications.data.p");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r14 != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r14 == 0) goto L_0x00ba;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4 A[SYNTHETIC, Splitter:B:27:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be A[SYNTHETIC, Splitter:B:33:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List mo35097b(java.lang.String r14, int r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.android.libraries.an.a.c r0 = new com.google.android.libraries.an.a.c     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c7 }
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch:{ all -> 0x00c7 }
            r3 = 0
            r2[r3] = r15     // Catch:{ all -> 0x00c7 }
            java.lang.String r15 = "job_type=?"
            r0.mo124446b(r15, r2)     // Catch:{ all -> 0x00c7 }
            com.google.android.libraries.an.a.b r15 = r0.mo124445a()     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            r2 = 0
            com.google.android.libraries.notifications.data.impl.f r14 = r13.m55043e(r14)     // Catch:{ RuntimeException -> 0x0094, m -> 0x0092, all -> 0x008e }
            android.database.sqlite.SQLiteDatabase r14 = r14.getReadableDatabase()     // Catch:{ RuntimeException -> 0x0094, m -> 0x0092, all -> 0x008e }
            java.lang.String r5 = "tasks"
            r4 = r15
            com.google.android.libraries.an.a.a r4 = (com.google.android.libraries.p11027an.p11028a.C147765a) r4     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.String r7 = r4.f398710a     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r6 = 0
            java.lang.String[] r8 = r15.mo124444c()     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r9 = 0
            r10 = 0
            java.lang.String r11 = "_id ASC"
            r12 = 0
            r4 = r14
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
        L_0x003d:
            boolean r4 = r2.moveToNext()     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            if (r4 == 0) goto L_0x007d
            com.google.android.libraries.notifications.data.e r4 = new com.google.android.libraries.notifications.data.e     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r4.<init>()     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.String r5 = "_id"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            long r5 = r2.getLong(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r4.f80757a = r5     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.String r5 = "job_type"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            int r5 = r2.getInt(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r4.f80758b = r5     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            java.lang.String r5 = "payload"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            byte[] r5 = r2.getBlob(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r4.mo35035b(r5)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            com.google.android.libraries.notifications.data.p r4 = r4.mo35034a()     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            r0.add(r4)     // Catch:{ RuntimeException -> 0x008c, m -> 0x008a }
            goto L_0x003d
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ all -> 0x00c7 }
        L_0x0082:
            if (r14 == 0) goto L_0x00ba
        L_0x0084:
            r14.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00ba
        L_0x0088:
            r15 = move-exception
            goto L_0x00bc
        L_0x008a:
            r4 = move-exception
            goto L_0x0097
        L_0x008c:
            r4 = move-exception
            goto L_0x0097
        L_0x008e:
            r14 = move-exception
            r15 = r14
            r14 = r2
            goto L_0x00bc
        L_0x0092:
            r14 = move-exception
            goto L_0x0095
        L_0x0094:
            r14 = move-exception
        L_0x0095:
            r4 = r14
            r14 = r2
        L_0x0097:
            java.lang.String r5 = "ChimeTaskDataStorageImpl"
            java.lang.String r6 = "Error getting ChimeTaskData for account. Query: %s %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0088 }
            r8 = r15
            com.google.android.libraries.an.a.a r8 = (com.google.android.libraries.p11027an.p11028a.C147765a) r8     // Catch:{ all -> 0x0088 }
            java.lang.String r8 = r8.f398710a     // Catch:{ all -> 0x0088 }
            r7[r3] = r8     // Catch:{ all -> 0x0088 }
            java.lang.String[] r15 = r15.mo124444c()     // Catch:{ all -> 0x0088 }
            java.lang.String r15 = java.util.Arrays.toString(r15)     // Catch:{ all -> 0x0088 }
            r7[r1] = r15     // Catch:{ all -> 0x0088 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r5, r4, r6, r7)     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x00b7
            r2.close()     // Catch:{ all -> 0x00c7 }
        L_0x00b7:
            if (r14 == 0) goto L_0x00ba
            goto L_0x0084
        L_0x00ba:
            monitor-exit(r13)
            return r0
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            r2.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c1:
            if (r14 == 0) goto L_0x00c6
            r14.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c6:
            throw r15     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x00cb
        L_0x00ca:
            throw r14
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29802g.mo35097b(java.lang.String, int):java.util.List");
    }

    /* renamed from: c */
    public final void mo35098c(String str) {
        try {
            this.f80814a.deleteDatabase(m55043e(str).getDatabaseName());
        } catch (C29822m | RuntimeException e) {
            C30058b.m55792d("ChimeTaskDataStorageImpl", e, "Error deleting database for account", new Object[0]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.libraries.an.a.b] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35099d(java.lang.String r7, java.util.List r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            int r0 = r8.size()     // Catch:{ all -> 0x0092 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0092 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0092 }
            r1 = 0
            r2 = 0
        L_0x0015:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0033
            int r3 = r2 + 1
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0092 }
            com.google.android.libraries.notifications.data.p r4 = (com.google.android.libraries.notifications.data.C29825p) r4     // Catch:{ all -> 0x0092 }
            java.lang.Long r4 = r4.mo35037b()     // Catch:{ all -> 0x0092 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0092 }
            r0[r2] = r4     // Catch:{ all -> 0x0092 }
            r2 = r3
            goto L_0x0015
        L_0x0033:
            java.lang.String r8 = "_id"
            r2 = 0
            com.google.common.b.gu r8 = com.google.android.libraries.notifications.data.impl.C29812q.m55070e(r2, r8, r0)     // Catch:{ all -> 0x0092 }
            com.google.android.libraries.notifications.data.impl.f r7 = r6.m55043e(r7)     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
            r2.beginTransaction()     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0049:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0070 }
            if (r8 == 0) goto L_0x0063
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0070 }
            com.google.android.libraries.an.a.b r8 = (com.google.android.libraries.p11027an.p11028a.C147766b) r8     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "tasks"
            java.lang.String r3 = r8.mo124439a()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r8 = r8.mo124444c()     // Catch:{ all -> 0x0070 }
            r2.delete(r0, r3, r8)     // Catch:{ all -> 0x0070 }
            goto L_0x0049
        L_0x0063:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0070 }
            r2.endTransaction()     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
            if (r2 == 0) goto L_0x008a
            r2.close()     // Catch:{ all -> 0x0092 }
            monitor-exit(r6)
            return
        L_0x0070:
            r7 = move-exception
            r2.endTransaction()     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
            throw r7     // Catch:{ RuntimeException -> 0x0079, m -> 0x0077 }
        L_0x0075:
            r7 = move-exception
            goto L_0x008c
        L_0x0077:
            r7 = move-exception
            goto L_0x007a
        L_0x0079:
            r7 = move-exception
        L_0x007a:
            java.lang.String r8 = "ChimeTaskDataStorageImpl"
            java.lang.String r0 = "Error deleting ChimeTaskData for account"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r8, r7, r0, r1)     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x008a
            r2.close()     // Catch:{ all -> 0x0092 }
            monitor-exit(r6)
            return
        L_0x008a:
            monitor-exit(r6)
            return
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r7     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0096
        L_0x0095:
            throw r7
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29802g.mo35099d(java.lang.String, java.util.List):void");
    }
}
