package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.common.util.C144010j;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.internal.s */
/* compiled from: PG */
final class C142749s extends C142737g implements Closeable {

    /* renamed from: a */
    public static final String f387369a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: b */
    public static final String f387370b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});

    /* renamed from: c */
    public final C142729az f387371c = new C142729az();

    /* renamed from: d */
    private final C142748r f387372d;

    /* renamed from: f */
    private final C142729az f387373f = new C142729az();

    public C142749s(C142740j jVar) {
        super(jVar);
        C144006f fVar = this.f387328e.f387340h;
        mo117569d();
        this.f387372d = new C142748r(this, jVar.f387334b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo117566b() {
        /*
            r8 = this;
            com.google.android.gms.analytics.C142764q.m231686b()
            r8.mo117537k()
            android.database.sqlite.SQLiteDatabase r0 = r8.mo117567c()
            java.lang.String r4 = "SELECT COUNT(*) FROM hits2"
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r1)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            if (r1 == 0) goto L_0x0021
            r1.close()
        L_0x0021:
            return r2
        L_0x0022:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            java.lang.String r2 = "Database returned empty set"
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            throw r0     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            goto L_0x003a
        L_0x002c:
            r0 = move-exception
            r7 = r1
            java.lang.String r3 = "Database error"
            r2 = 6
            r6 = 0
            r1 = r8
            r5 = r0
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r1 = r7
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142749s.mo117566b():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SQLiteDatabase mo117567c() {
        try {
            return this.f387372d.getWritableDatabase();
        } catch (SQLiteException e) {
            super.mo117536i(5, "Error opening database", e, (Object) null, (Object) null);
            throw e;
        }
    }

    public final void close() {
        try {
            this.f387372d.close();
        } catch (SQLiteException e) {
            super.mo117536i(6, "Sql error closing database", e, (Object) null, (Object) null);
        } catch (IllegalStateException e2) {
            super.mo117536i(6, "Error closing database", e2, (Object) null, (Object) null);
        }
    }

    /* renamed from: d */
    public final String mo117569d() {
        C142708ae aeVar = this.f387328e.f387336d;
        return "google_analytics_v4.db";
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo117570e(long r27) {
        /*
            r26 = this;
            java.lang.String r0 = "hit_id"
            r1 = 0
            r3 = 0
            r4 = 1
            int r5 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C143919bh.m233959b(r1)
            com.google.android.gms.analytics.C142764q.m231686b()
            r26.mo117537k()
            android.database.sqlite.SQLiteDatabase r5 = r26.mo117567c()
            r1 = 5
            r2 = 0
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            r7[r3] = r0     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r1 = "hit_time"
            r7[r4] = r1     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r1 = "hit_string"
            r14 = 2
            r7[r14] = r1     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r1 = "hit_url"
            r15 = 3
            r7[r15] = r1     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r1 = "hit_app_id"
            r13 = 4
            r7[r13] = r1     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            r1[r3] = r0     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "hits2"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = "%s ASC"
            java.lang.String r12 = java.lang.String.format(r0, r1)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r0 = java.lang.Long.toString(r27)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            r1 = 4
            r13 = r0
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            boolean r5 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            if (r5 == 0) goto L_0x009f
        L_0x0058:
            long r22 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            long r19 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r5 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = r2.getString(r15)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            int r24 = r2.getInt(r1)     // Catch:{ SQLiteException -> 0x00ab, all -> 0x00a7 }
            r13 = r26
            java.util.Map r18 = r13.mo117571f(r5)     // Catch:{ SQLiteException -> 0x009d }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x009d }
            if (r5 == 0) goto L_0x007b
        L_0x0078:
            r21 = 1
            goto L_0x0086
        L_0x007b:
            java.lang.String r5 = "http:"
            boolean r5 = r6.startsWith(r5)     // Catch:{ SQLiteException -> 0x009d }
            if (r5 != 0) goto L_0x0084
            goto L_0x0078
        L_0x0084:
            r21 = 0
        L_0x0086:
            com.google.android.gms.analytics.internal.ao r5 = new com.google.android.gms.analytics.internal.ao     // Catch:{ SQLiteException -> 0x009d }
            r25 = 0
            r16 = r5
            r17 = r26
            r16.<init>(r17, r18, r19, r21, r22, r24, r25)     // Catch:{ SQLiteException -> 0x009d }
            r0.add(r5)     // Catch:{ SQLiteException -> 0x009d }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x009d }
            if (r5 != 0) goto L_0x0058
            goto L_0x00a1
        L_0x009b:
            r0 = move-exception
            goto L_0x00ba
        L_0x009d:
            r0 = move-exception
            goto L_0x00ae
        L_0x009f:
            r13 = r26
        L_0x00a1:
            if (r2 == 0) goto L_0x00a6
            r2.close()
        L_0x00a6:
            return r0
        L_0x00a7:
            r0 = move-exception
            r13 = r26
            goto L_0x00ba
        L_0x00ab:
            r0 = move-exception
            r13 = r26
        L_0x00ae:
            java.lang.String r9 = "Error loading hits from the database"
            r8 = 6
            r11 = 0
            r12 = 0
            r7 = r26
            r10 = r0
            super.mo117536i(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            r2.close()
        L_0x00bf:
            goto L_0x00c1
        L_0x00c0:
            throw r0
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142749s.mo117570e(long):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map mo117571f(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            return C144010j.m234188a(new URI(str));
        } catch (URISyntaxException e) {
            super.mo117536i(6, "Error parsing hit parameters", e, (Object) null, (Object) null);
            return new HashMap(0);
        }
    }

    /* renamed from: g */
    public final void mo117572g() {
        mo117537k();
        mo117567c().beginTransaction();
    }

    /* renamed from: n */
    public final void mo117573n(long j) {
        C142764q.m231686b();
        mo117537k();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        super.mo117536i(2, "Deleting hit, id", valueOf, (Object) null, (Object) null);
        mo117574o(arrayList);
    }

    /* renamed from: o */
    public final void mo117574o(List list) {
        C143919bh.m233958a(list);
        C142764q.m231686b();
        mo117537k();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase c = mo117567c();
                super.mo117536i(2, "Deleting dispatched hits. count", Integer.valueOf(list.size()), (Object) null, (Object) null);
                int delete = c.delete("hits2", sb2, (String[]) null);
                if (delete != list.size()) {
                    super.mo117536i(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                super.mo117536i(6, "Error deleting hits", e, (Object) null, (Object) null);
                throw e;
            }
        }
    }

    /* renamed from: p */
    public final void mo117575p() {
        mo117537k();
        mo117567c().endTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0164 A[Catch:{ SQLiteException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0170 A[Catch:{ SQLiteException -> 0x0180 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117576q(com.google.android.gms.analytics.internal.C142718ao r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            java.lang.String r0 = "hit_id"
            com.google.android.gms.analytics.C142764q.m231686b()
            r20.mo117537k()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.util.Map r2 = r8.f387287a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "ht"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x001b
            java.lang.String r5 = "qt"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x001b
            java.lang.String r5 = "AppUID"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x001b
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r1.appendQueryParameter(r4, r3)
            goto L_0x001b
        L_0x004f:
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.getEncodedQuery()
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = ""
        L_0x005b:
            r9 = r1
            int r1 = r9.length()
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 > r2) goto L_0x018d
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d
            com.google.android.gms.analytics.internal.ak r1 = com.google.android.gms.analytics.internal.C142715al.f387256c
            java.lang.Object r1 = r1.mo117506a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r2 = r20.mo117566b()
            int r4 = r1 + -1
            long r4 = (long) r4
            r10 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x011a
            long r4 = (long) r1
            long r2 = r2 - r4
            r4 = 1
            long r2 = r2 + r4
            com.google.android.gms.analytics.C142764q.m231686b()
            r20.mo117537k()
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0097
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00fc
        L_0x0097:
            android.database.sqlite.SQLiteDatabase r11 = r20.mo117567c()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = 1
            java.lang.String[] r13 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            r4 = 0
            r13[r4] = r0     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            r1[r4] = r0     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            java.lang.String r12 = "hits2"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r0 = "%s ASC"
            java.lang.String r18 = java.lang.String.format(r0, r1)     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            java.lang.String r19 = java.lang.Long.toString(r2)     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            android.database.Cursor r1 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e5 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            if (r0 == 0) goto L_0x00d7
        L_0x00c6:
            long r2 = r1.getLong(r4)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            r6.add(r0)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            if (r0 != 0) goto L_0x00c6
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r1.close()
        L_0x00dc:
            r12 = r6
            goto L_0x00fb
        L_0x00de:
            r0 = move-exception
            r10 = r1
            goto L_0x0114
        L_0x00e1:
            r0 = move-exception
            r4 = r0
            r11 = r1
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            goto L_0x0114
        L_0x00e7:
            r0 = move-exception
            r4 = r0
            r11 = r10
        L_0x00ea:
            java.lang.String r3 = "Error selecting hit ids"
            r2 = 5
            r5 = 0
            r0 = 0
            r1 = r20
            r12 = r6
            r6 = r0
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0112 }
            if (r11 == 0) goto L_0x00fb
            r11.close()
        L_0x00fb:
            r0 = r12
        L_0x00fc:
            r2 = 5
            java.lang.String r3 = "Store full, deleting hits to make room, count"
            int r1 = r0.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r6 = 0
            r1 = r20
            super.mo117536i(r2, r3, r4, r5, r6)
            r7.mo117574o(r0)
            goto L_0x011a
        L_0x0112:
            r0 = move-exception
            r10 = r11
        L_0x0114:
            if (r10 == 0) goto L_0x0119
            r10.close()
        L_0x0119:
            throw r0
        L_0x011a:
            android.database.sqlite.SQLiteDatabase r0 = r20.mo117567c()
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "hit_string"
            r1.put(r2, r9)
            long r2 = r8.f387290d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "hit_time"
            r1.put(r3, r2)
            int r2 = r8.f387291e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "hit_app_id"
            r1.put(r3, r2)
            boolean r2 = r8.f387292f
            if (r2 == 0) goto L_0x014b
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r2 = r2.f387336d
            java.lang.String r2 = com.google.android.gms.analytics.internal.C142708ae.m231548f()
            goto L_0x0153
        L_0x014b:
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r2 = r2.f387336d
            java.lang.String r2 = com.google.android.gms.analytics.internal.C142708ae.m231550h()
        L_0x0153:
            java.lang.String r3 = "hit_url"
            r1.put(r3, r2)
            java.lang.String r2 = "hits2"
            long r0 = r0.insert(r2, r10, r1)     // Catch:{ SQLiteException -> 0x0180 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0170
            java.lang.String r3 = "Failed to insert a hit (got -1)"
            r2 = 6
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r20
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x0180 }
            return
        L_0x0170:
            java.lang.String r3 = "Hit saved to database. db-id, hit"
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0180 }
            r2 = 3
            r6 = 0
            r1 = r20
            r5 = r21
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x0180 }
            return
        L_0x0180:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Error storing a hit"
            r5 = 0
            r6 = 0
            r1 = r20
            super.mo117536i(r2, r3, r4, r5, r6)
            return
        L_0x018d:
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.as r0 = r0.mo117548h()
            java.lang.String r1 = "Hit length exceeds the maximum allowed size"
            r0.mo117509b(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142749s.mo117576q(com.google.android.gms.analytics.internal.ao):void");
    }

    /* renamed from: r */
    public final void mo117577r() {
        mo117537k();
        mo117567c().setTransactionSuccessful();
    }

    /* renamed from: s */
    public final void mo117578s(C142742l lVar) {
        mo117537k();
        C142764q.m231686b();
        SQLiteDatabase c = mo117567c();
        Map map = lVar.f387355e;
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = BuildConfig.FLAVOR;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_uid", 0L);
        contentValues.put("cid", lVar.f387351a);
        contentValues.put("tid", lVar.f387352b);
        contentValues.put("adid", Integer.valueOf(lVar.f387353c ? 1 : 0));
        contentValues.put("hits_count", Long.valueOf(lVar.f387354d));
        contentValues.put("params", encodedQuery);
        try {
            if (c.insertWithOnConflict("properties", (String) null, contentValues, 5) == -1) {
                super.mo117536i(6, "Failed to insert/update a property (got -1)", (Object) null, (Object) null, (Object) null);
            }
        } catch (SQLiteException e) {
            super.mo117536i(6, "Error storing a property", e, (Object) null, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo117579t() {
        return mo117566b() == 0;
    }

    /* renamed from: u */
    public final void mo117580u() {
        C142764q.m231686b();
        mo117537k();
        if (this.f387373f.mo117526a(86400000)) {
            this.f387373f.f387316a = SystemClock.elapsedRealtime();
            super.mo117536i(2, "Deleting stale hits (if any)", (Object) null, (Object) null, (Object) null);
            SQLiteDatabase c = mo117567c();
            C144006f fVar = this.f387328e.f387340h;
            super.mo117536i(2, "Deleted stale hits, count", Integer.valueOf(c.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})), (Object) null, (Object) null);
        }
    }

    /* renamed from: v */
    public final long mo117581v(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo117567c().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } else if (rawQuery == null) {
                return 0;
            } else {
                rawQuery.close();
                return 0;
            }
        } catch (SQLiteException e) {
            super.mo117536i(6, "Database error", str, e, (Object) null);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final void mo117582w(String str) {
        C143919bh.m233969l(str);
        mo117537k();
        C142764q.m231686b();
        int delete = mo117567c().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", str});
        if (delete > 0) {
            super.mo117536i(2, "Deleted property records", Integer.valueOf(delete), (Object) null, (Object) null);
        }
    }
}
