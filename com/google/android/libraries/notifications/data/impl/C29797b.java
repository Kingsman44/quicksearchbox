package com.google.android.libraries.notifications.data.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29787a;
import com.google.android.libraries.notifications.data.C29788b;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.notifications.data.impl.b */
/* compiled from: PG */
public final class C29797b implements C29823n {

    /* renamed from: a */
    private final C29796a f80810a;

    public C29797b(Context context) {
        this.f80810a = new C29796a(context);
    }

    /* renamed from: f */
    private static final C29820k m55032f(Cursor cursor) {
        C29787a m = C29820k.m55110m();
        m.f80713a = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        m.mo34996b(cursor.getString(cursor.getColumnIndexOrThrow("account_name")));
        m.f80714b = cursor.getString(cursor.getColumnIndexOrThrow("obfuscated_gaia_id"));
        m.f80715c = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("sync_version")));
        m.f80716d = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("page_version")));
        m.mo34999e(C29986f.m55599a(cursor.getInt(cursor.getColumnIndexOrThrow("registration_status"))));
        m.f80717e = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("last_registration_time_ms")));
        m.mo34998d(cursor.getInt(cursor.getColumnIndexOrThrow("last_registration_request_hash")));
        m.f80718f = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("first_registration_version")));
        m.mo34997c(cursor.getString(cursor.getColumnIndexOrThrow("internal_target_id")));
        m.mo35000f(cursor.getString(cursor.getColumnIndexOrThrow("representative_target_id")));
        return m.mo34995a();
    }

    /* renamed from: g */
    private static final ContentValues m55033g(C29820k kVar) {
        ContentValues contentValues = new ContentValues(8);
        C29788b bVar = (C29788b) kVar;
        contentValues.put("account_name", bVar.f80726b);
        contentValues.put("obfuscated_gaia_id", bVar.f80727c);
        contentValues.put("sync_version", bVar.f80728d);
        contentValues.put("page_version", bVar.f80729e);
        contentValues.put("registration_status", Integer.valueOf(bVar.f80730f.f81193h));
        contentValues.put("last_registration_time_ms", bVar.f80731g);
        contentValues.put("last_registration_request_hash", Integer.valueOf(bVar.f80732h));
        contentValues.put("first_registration_version", bVar.f80733i);
        contentValues.put("internal_target_id", bVar.f80734j);
        contentValues.put("representative_target_id", bVar.f80735k);
        return contentValues;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[SYNTHETIC, Splitter:B:30:0x005f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo35087a(com.google.android.libraries.notifications.data.C29820k r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Conflict inserting ChimeAccount: "
            java.lang.String r1 = "Error inserting ChimeAccount: "
            monitor-enter(r8)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x0063 }
            r2 = 0
            android.content.ContentValues r3 = m55033g(r9)     // Catch:{ RuntimeException -> 0x0046 }
            com.google.android.libraries.notifications.data.impl.a r4 = r8.f80810a     // Catch:{ RuntimeException -> 0x0046 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0046 }
            java.lang.String r5 = "accounts"
            r6 = 2
            long r2 = r4.insertWithOnConflict(r5, r2, r3, r6)     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0027
            if (r4 == 0) goto L_0x0025
            r4.close()     // Catch:{ all -> 0x0063 }
        L_0x0025:
            monitor-exit(r8)
            return r2
        L_0x0027:
            com.google.android.libraries.notifications.data.l r2 = new com.google.android.libraries.notifications.data.l     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            r3 = r9
            com.google.android.libraries.notifications.data.b r3 = (com.google.android.libraries.notifications.data.C29788b) r3     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            java.lang.String r3 = r3.f80726b     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            r5.<init>(r0)     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            java.lang.String r0 = r5.toString()     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            r2.<init>(r0)     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
            throw r2     // Catch:{ RuntimeException -> 0x0041, all -> 0x003e }
        L_0x003e:
            r9 = move-exception
            r2 = r4
            goto L_0x005d
        L_0x0041:
            r0 = move-exception
            r2 = r4
            goto L_0x0047
        L_0x0044:
            r9 = move-exception
            goto L_0x005d
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            com.google.android.libraries.notifications.data.l r3 = new com.google.android.libraries.notifications.data.l     // Catch:{ all -> 0x0044 }
            com.google.android.libraries.notifications.data.b r9 = (com.google.android.libraries.notifications.data.C29788b) r9     // Catch:{ all -> 0x0044 }
            java.lang.String r9 = r9.f80726b     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r4.<init>(r1)     // Catch:{ all -> 0x0044 }
            r4.append(r9)     // Catch:{ all -> 0x0044 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x0044 }
            r3.<init>(r9, r0)     // Catch:{ all -> 0x0044 }
            throw r3     // Catch:{ all -> 0x0044 }
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ all -> 0x0063 }
        L_0x0062:
            throw r9     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29797b.mo35087a(com.google.android.libraries.notifications.data.k):long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e A[SYNTHETIC, Splitter:B:34:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.libraries.notifications.data.C29820k mo35088b(java.lang.String r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x0077 }
            r0 = 0
            r1 = 1
            r2 = 0
            com.google.android.libraries.notifications.data.impl.a r3 = r13.f80810a     // Catch:{ RuntimeException -> 0x0059, all -> 0x0056 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ RuntimeException -> 0x0059, all -> 0x0056 }
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x0054 }
            r8[r0] = r14     // Catch:{ RuntimeException -> 0x0054 }
            java.lang.String r5 = "accounts"
            r6 = 0
            java.lang.String r7 = "account_name=?"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r3
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ RuntimeException -> 0x0054 }
            int r4 = r2.getCount()     // Catch:{ RuntimeException -> 0x0054 }
            if (r4 <= 0) goto L_0x0038
            r2.moveToFirst()     // Catch:{ RuntimeException -> 0x0054 }
            com.google.android.libraries.notifications.data.k r14 = m55032f(r2)     // Catch:{ RuntimeException -> 0x0054 }
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ all -> 0x0077 }
        L_0x0031:
            if (r3 == 0) goto L_0x0036
            r3.close()     // Catch:{ all -> 0x0077 }
        L_0x0036:
            monitor-exit(r13)
            return r14
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ all -> 0x0077 }
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ all -> 0x0077 }
        L_0x0042:
            com.google.android.libraries.notifications.data.m r2 = new com.google.android.libraries.notifications.data.m     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0077 }
            r1[r0] = r14     // Catch:{ all -> 0x0077 }
            java.lang.String r14 = "ChimeAccount not found [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch:{ all -> 0x0077 }
            r2.<init>(r14)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0052:
            r14 = move-exception
            goto L_0x006c
        L_0x0054:
            r4 = move-exception
            goto L_0x005c
        L_0x0056:
            r14 = move-exception
            r3 = r2
            goto L_0x006c
        L_0x0059:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L_0x005c:
            com.google.android.libraries.notifications.data.m r5 = new com.google.android.libraries.notifications.data.m     // Catch:{ all -> 0x0052 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0052 }
            r1[r0] = r14     // Catch:{ all -> 0x0052 }
            java.lang.String r14 = "Error getting ChimeAccount [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch:{ all -> 0x0052 }
            r5.<init>(r14, r4)     // Catch:{ all -> 0x0052 }
            throw r5     // Catch:{ all -> 0x0052 }
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r3 == 0) goto L_0x0076
            r3.close()     // Catch:{ all -> 0x0077 }
        L_0x0076:
            throw r14     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29797b.mo35088b(java.lang.String):com.google.android.libraries.notifications.data.k");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2 != 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r2 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052 A[SYNTHETIC, Splitter:B:27:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[SYNTHETIC, Splitter:B:33:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List mo35089c() {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x0065 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0065 }
            r0.<init>()     // Catch:{ all -> 0x0065 }
            r1 = 0
            com.google.android.libraries.notifications.data.impl.a r2 = r12.f80810a     // Catch:{ RuntimeException -> 0x0043, all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ RuntimeException -> 0x0043, all -> 0x0040 }
            java.lang.String r4 = "accounts"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x003e }
            boolean r3 = r1.moveToFirst()     // Catch:{ RuntimeException -> 0x003e }
            if (r3 == 0) goto L_0x0031
        L_0x0024:
            com.google.android.libraries.notifications.data.k r3 = m55032f(r1)     // Catch:{ RuntimeException -> 0x003e }
            r0.add(r3)     // Catch:{ RuntimeException -> 0x003e }
            boolean r3 = r1.moveToNext()     // Catch:{ RuntimeException -> 0x003e }
            if (r3 != 0) goto L_0x0024
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x0065 }
        L_0x0036:
            if (r2 == 0) goto L_0x0058
        L_0x0038:
            r2.close()     // Catch:{ all -> 0x0065 }
            goto L_0x0058
        L_0x003c:
            r0 = move-exception
            goto L_0x005a
        L_0x003e:
            r3 = move-exception
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            r2 = r1
            goto L_0x005a
        L_0x0043:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0046:
            java.lang.String r4 = "ChimeAccountStorageImpl"
            java.lang.String r5 = "Error getting list of available ChimeAccounts."
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x003c }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r4, r3, r5, r6)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ all -> 0x0065 }
        L_0x0055:
            if (r2 == 0) goto L_0x0058
            goto L_0x0038
        L_0x0058:
            monitor-exit(r12)
            return r0
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch:{ all -> 0x0065 }
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ all -> 0x0065 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            monitor-exit(r12)
            goto L_0x0069
        L_0x0068:
            throw r0
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29797b.mo35089c():java.util.List");
    }

    /* renamed from: d */
    public final synchronized void mo35090d(String str) {
        C19559g.m37303b();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.f80810a.getWritableDatabase();
            sQLiteDatabase.delete("accounts", "account_name=?", new String[]{str});
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        } catch (RuntimeException e) {
            try {
                C30058b.m55792d("ChimeAccountStorageImpl", e, "Error deleting Chime account", new Object[0]);
            } finally {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo35091e(C29820k kVar) {
        C19559g.m37303b();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            ContentValues g = m55033g(kVar);
            sQLiteDatabase = this.f80810a.getWritableDatabase();
            sQLiteDatabase.update("accounts", g, "account_name=?", new String[]{((C29788b) kVar).f80726b});
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        } catch (RuntimeException e) {
            try {
                C30058b.m55792d("ChimeAccountStorageImpl", e, "Error updating Chime account", new Object[0]);
            } finally {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
    }
}
