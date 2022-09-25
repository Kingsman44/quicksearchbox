package com.google.android.libraries.geller.portable.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5030q.p5032b.C65016aa;
import com.google.protos.p4985f.p5030q.p5032b.C65018ac;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.portable.database.g */
/* compiled from: PG */
final class C21959g implements C21957e {

    /* renamed from: a */
    private static final C59071e f60571a = C59071e.m91332i("com.google.android.libraries.geller.portable.database.g");

    /* renamed from: b */
    private final boolean f60572b;

    /* renamed from: c */
    private final C65021af f60573c;

    public C21959g(boolean z, C65021af afVar) {
        this.f60572b = z;
        this.f60573c = afVar;
    }

    /* renamed from: g */
    static byte[][] m41145g(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr) {
        if (!z) {
            return m41150l(sQLiteDatabase, false, str, strArr, -1);
        }
        String format = String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", new Object[]{"geller_data_table.data", String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", new Object[]{"data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro"}), "geller_data_table", "distinct_data_ids.data_id", "geller_data_table._id", "timestamp_micro"});
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery(format, strArr);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getBlob(columnIndexOrThrow));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th) {
            C21958f.m41144a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    private static long m41146h(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = (long) sQLiteDatabase.delete("geller_data_table", str, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: i */
    private static long m41147i(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            sQLiteDatabase.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s)", new Object[]{"geller_data_table", "_id", "data_id", "geller_key_table", str}), strArr);
            long longForQuery = DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", (String[]) null);
            sQLiteDatabase.setTransactionSuccessful();
            return longForQuery;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: j */
    private static long m41148j(SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", bArr);
        return sQLiteDatabase.insertOrThrow("geller_data_table", (String) null, contentValues);
    }

    /* renamed from: k */
    private static ContentValues m41149k(C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        ContentValues contentValues = new ContentValues();
        if (axVar.mo56113h()) {
            if (((Boolean) axVar.mo56107c()).booleanValue()) {
                contentValues.put("sync_status", "SYNCED");
            } else {
                contentValues.putNull("sync_status");
            }
        }
        if (axVar2.mo56113h()) {
            if (((Boolean) axVar2.mo56107c()).booleanValue()) {
                contentValues.put("deletion_sync_status", "DELETION_SYNCED");
            } else {
                contentValues.putNull("deletion_sync_status");
            }
        }
        if (axVar3.mo56113h()) {
            if (((C21956d) axVar3.mo56107c()).mo27276a().booleanValue()) {
                contentValues.putNull("delete_status");
            } else {
                int b = ((C21956d) axVar3.mo56107c()).mo27277b();
                String a = C21955c.m41135a(b);
                if (b != 0) {
                    contentValues.put("delete_status", a);
                } else {
                    throw null;
                }
            }
        }
        return contentValues;
    }

    /* renamed from: l */
    private static byte[][] m41150l(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, int i) {
        String[] strArr2;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        String format = String.format("SELECT DISTINCT %s, %s FROM ( SELECT %s, %s, ROW_NUMBER() OVER ( PARTITION BY %s ORDER BY %s DESC ) row_index FROM %s  WHERE (%s))", new Object[]{"data_id", "timestamp_micro", "data_id", "timestamp_micro", "key", "timestamp_micro", "geller_key_table", str});
        if (i >= 0) {
            format = String.valueOf(format).concat(String.valueOf(String.format(" WHERE row_index <= %s", new Object[]{String.valueOf(i)})));
        }
        String concat = String.valueOf(format).concat(String.valueOf(String.format(" ORDER BY %s DESC", new Object[]{"timestamp_micro"})));
        if (z) {
            concat = String.format("SELECT DISTINCT %s, %s as %s FROM %s T1 WHERE (%s) AND %s IN (SELECT %s FROM %s WHERE (%s) AND %s = T1.%s ORDER BY %s DESC LIMIT %s) ORDER BY %s DESC", new Object[]{"data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "data_id", "data_id", "geller_key_table", str, "key", "key", "timestamp_micro", String.valueOf(i), "timestamp_micro"});
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(Arrays.asList(strArr));
            e.mo55396h(Arrays.asList(strArr));
            strArr2 = (String[]) e.mo55394f().toArray(new String[0]);
        } else {
            strArr2 = strArr;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", new Object[]{"geller_data_table.data", concat, "geller_data_table", "distinct_data_ids.data_id", "geller_data_table._id", "timestamp_micro"}), strArr2);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getBlob(columnIndexOrThrow));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th2) {
            C21958f.m41144a(th, th2);
        }
        throw th;
    }

    /* renamed from: m */
    private static void m41151m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        long j2 = m41148j(sQLiteDatabase, bArr);
        for (String put : strArr) {
            Long valueOf = Long.valueOf(j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", put);
            contentValues.put("data_id", Long.valueOf(j2));
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", valueOf);
            contentValues.put("num_times_used", 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            sQLiteDatabase.insertOrThrow("geller_key_table", (String) null, contentValues);
        }
    }

    /* renamed from: a */
    public final long mo27281a(C58833ax axVar, String str, C65071r rVar) {
        if ((rVar.f176210a & 1) != 0) {
            String str2 = rVar.f176213d;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((C58847bk) axVar).f156646a;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                int i = rVar.f176211b;
                long j = 0;
                if (i == 1) {
                    for (String str3 : C21963k.m41186e(((C65066m) rVar.f176212c).f176199a)) {
                        if (!str3.isEmpty()) {
                            j += m41147i(sQLiteDatabase, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                        }
                    }
                } else if (i == 2) {
                    C65070q qVar = (C65070q) rVar.f176212c;
                    String str4 = "data_type = ?";
                    if (!(qVar.f176206a.size() == 0 && qVar.f176207b.size() == 0)) {
                        str4 = "data_type = ? AND " + C21963k.m41184c(qVar);
                    }
                    j = m41147i(sQLiteDatabase, str4, new String[]{str2});
                } else if (i == 4 && ((Boolean) rVar.f176212c).booleanValue()) {
                    j = m41146h((SQLiteDatabase) ((C58847bk) axVar).f156646a, String.format("%s IN (SELECT %s FROM %s WHERE %s = ?)", new Object[]{"_id", "data_id", "geller_key_table", "data_type"}), new String[]{str2});
                }
                sQLiteDatabase.setTransactionSuccessful();
                return j;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } else {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d9 A[SYNTHETIC, Splitter:B:60:0x01d9] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protos.p4985f.p5030q.p5032b.C65063j mo27282b(com.google.common.base.C58833ax r22, java.util.Set r23) {
        /*
            r21 = this;
            r0 = r23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r5 = "data_type"
            r3[r4] = r5
            r6 = 1
            java.lang.String r7 = "data_id"
            r3[r6] = r7
            r8 = 2
            java.lang.String r9 = "geller_key_table"
            r3[r8] = r9
            java.lang.String r10 = "SELECT %s, COUNT(*), COUNT(DISTINCT %s) FROM %s"
            java.lang.String r3 = java.lang.String.format(r10, r3)
            r1.<init>(r3)
            java.lang.String r3 = "geller_data_table.data"
            java.lang.String r10 = "geller_data_table._id"
            boolean r11 = r23.isEmpty()
            java.lang.String r12 = " WHERE "
            java.lang.String r13 = "IN"
            if (r11 != 0) goto L_0x0037
            java.lang.String r11 = com.google.android.libraries.geller.portable.database.C21963k.m41182a(r5, r13, r0)
            r1.append(r12)
            r1.append(r11)
        L_0x0037:
            java.lang.String r11 = " GROUP BY data_type"
            r1.append(r11)
            r11 = r22
            com.google.common.base.bk r11 = (com.google.common.base.C58847bk) r11
            java.lang.Object r11 = r11.f156646a
            android.database.sqlite.SQLiteDatabase r11 = (android.database.sqlite.SQLiteDatabase) r11
            com.google.protos.f.q.b.j r14 = com.google.protos.p4985f.p5030q.p5032b.C65063j.f176192d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.protos.f.q.b.i r14 = (com.google.protos.p4985f.p5030q.p5032b.C65062i) r14
            r11.beginTransactionNonExclusive()
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e3 }
            r15 = 0
            android.database.Cursor r1 = r11.rawQuery(r1, r15)     // Catch:{ all -> 0x01e3 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x01d3 }
            r15.<init>()     // Catch:{ all -> 0x01d3 }
        L_0x005d:
            boolean r16 = r1.moveToNext()     // Catch:{ all -> 0x01d3 }
            r17 = 4
            if (r16 == 0) goto L_0x00c4
            int r2 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x01d3 }
            int r4 = r1.getInt(r6)     // Catch:{ all -> 0x01d3 }
            int r6 = r1.getInt(r8)     // Catch:{ all -> 0x01d3 }
            if (r2 == 0) goto L_0x00c0
            com.google.protos.f.q.b.h r19 = com.google.protos.p4985f.p5030q.p5032b.C65061h.f176185f     // Catch:{ all -> 0x01d3 }
            com.google.protobuf.bn r19 = r19.createBuilder()     // Catch:{ all -> 0x01d3 }
            r8 = r19
            com.google.protos.f.q.b.g r8 = (com.google.protos.p4985f.p5030q.p5032b.C65060g) r8     // Catch:{ all -> 0x01d3 }
            r8.copyOnWrite()     // Catch:{ all -> 0x01d3 }
            r19 = r1
            com.google.protobuf.bv r1 = r8.instance     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.h r1 = (com.google.protos.p4985f.p5030q.p5032b.C65061h) r1     // Catch:{ all -> 0x01d1 }
            r20 = r14
            int r14 = r1.f176187a     // Catch:{ all -> 0x01d1 }
            r18 = 1
            r14 = r14 | 1
            r1.f176187a = r14     // Catch:{ all -> 0x01d1 }
            r1.f176188b = r2     // Catch:{ all -> 0x01d1 }
            r8.copyOnWrite()     // Catch:{ all -> 0x01d1 }
            com.google.protobuf.bv r1 = r8.instance     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.h r1 = (com.google.protos.p4985f.p5030q.p5032b.C65061h) r1     // Catch:{ all -> 0x01d1 }
            int r14 = r1.f176187a     // Catch:{ all -> 0x01d1 }
            r14 = r14 | 4
            r1.f176187a = r14     // Catch:{ all -> 0x01d1 }
            r1.f176190d = r4     // Catch:{ all -> 0x01d1 }
            r8.copyOnWrite()     // Catch:{ all -> 0x01d1 }
            com.google.protobuf.bv r1 = r8.instance     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.h r1 = (com.google.protos.p4985f.p5030q.p5032b.C65061h) r1     // Catch:{ all -> 0x01d1 }
            int r4 = r1.f176187a     // Catch:{ all -> 0x01d1 }
            r4 = r4 | 8
            r1.f176187a = r4     // Catch:{ all -> 0x01d1 }
            r1.f176191e = r6     // Catch:{ all -> 0x01d1 }
            r15.put(r2, r8)     // Catch:{ all -> 0x01d1 }
            r1 = r19
            r14 = r20
            r2 = 3
            r4 = 0
            r6 = 1
            r8 = 2
            goto L_0x005d
        L_0x00c0:
            r2 = 3
            r4 = 0
            r6 = 1
            goto L_0x005d
        L_0x00c4:
            r19 = r1
            r20 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d1 }
            java.lang.String r2 = "SELECT distinct_data_ids.%s, COUNT(*), SUM(LENGTH(%s)) FROM %s LEFT JOIN (SELECT DISTINCT %s, %s FROM %s) distinct_data_ids ON %s = distinct_data_ids.data_id"
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d1 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01d1 }
            r6 = 1
            r4[r6] = r3     // Catch:{ all -> 0x01d1 }
            java.lang.String r3 = "geller_data_table"
            r6 = 2
            r4[r6] = r3     // Catch:{ all -> 0x01d1 }
            r3 = 3
            r4[r3] = r7     // Catch:{ all -> 0x01d1 }
            r4[r17] = r5     // Catch:{ all -> 0x01d1 }
            r3 = 5
            r4[r3] = r9     // Catch:{ all -> 0x01d1 }
            r3 = 6
            r4[r3] = r10     // Catch:{ all -> 0x01d1 }
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ all -> 0x01d1 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d1 }
            boolean r2 = r23.isEmpty()     // Catch:{ all -> 0x01d1 }
            if (r2 != 0) goto L_0x00fc
            java.lang.String r0 = com.google.android.libraries.geller.portable.database.C21963k.m41182a(r5, r13, r0)     // Catch:{ all -> 0x01d1 }
            r1.append(r12)     // Catch:{ all -> 0x01d1 }
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
        L_0x00fc:
            java.lang.String r0 = " GROUP BY distinct_data_ids."
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
            r1.append(r5)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d1 }
            r1 = 0
            android.database.Cursor r1 = r11.rawQuery(r0, r1)     // Catch:{ all -> 0x01d1 }
        L_0x010d:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x018c
            r0 = 0
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x01c3 }
            r3 = 1
            int r4 = r1.getInt(r3)     // Catch:{ all -> 0x01c3 }
            r3 = 2
            long r5 = r1.getLong(r3)     // Catch:{ all -> 0x01c3 }
            boolean r3 = r1.isNull(r0)     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x0169
            com.google.protos.f.q.b.al r2 = com.google.protos.p4985f.p5030q.p5032b.C65027al.f176090d     // Catch:{ all -> 0x01c3 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.ak r2 = (com.google.protos.p4985f.p5030q.p5032b.C65026ak) r2     // Catch:{ all -> 0x01c3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x01c3 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.al r3 = (com.google.protos.p4985f.p5030q.p5032b.C65027al) r3     // Catch:{ all -> 0x01c3 }
            int r7 = r3.f176092a     // Catch:{ all -> 0x01c3 }
            r8 = 2
            r7 = r7 | r8
            r3.f176092a = r7     // Catch:{ all -> 0x01c3 }
            r3.f176094c = r4     // Catch:{ all -> 0x01c3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x01c3 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.al r3 = (com.google.protos.p4985f.p5030q.p5032b.C65027al) r3     // Catch:{ all -> 0x01c3 }
            int r4 = r3.f176092a     // Catch:{ all -> 0x01c3 }
            r7 = 1
            r4 = r4 | r7
            r3.f176092a = r4     // Catch:{ all -> 0x01c3 }
            r3.f176093b = r5     // Catch:{ all -> 0x01c3 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.al r2 = (com.google.protos.p4985f.p5030q.p5032b.C65027al) r2     // Catch:{ all -> 0x01c3 }
            r20.copyOnWrite()     // Catch:{ all -> 0x01c3 }
            r14 = r20
            com.google.protobuf.bv r3 = r14.instance     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.j r3 = (com.google.protos.p4985f.p5030q.p5032b.C65063j) r3     // Catch:{ all -> 0x01c3 }
            r2.getClass()     // Catch:{ all -> 0x01c3 }
            r3.f176196c = r2     // Catch:{ all -> 0x01c3 }
            int r2 = r3.f176194a     // Catch:{ all -> 0x01c3 }
            r4 = 1
            r2 = r2 | r4
            r3.f176194a = r2     // Catch:{ all -> 0x01c3 }
            goto L_0x0189
        L_0x0169:
            r14 = r20
            r4 = 1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01c3 }
            if (r3 != 0) goto L_0x0189
            java.lang.Object r2 = r15.get(r2)     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.g r2 = (com.google.protos.p4985f.p5030q.p5032b.C65060g) r2     // Catch:{ all -> 0x01c3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x01c3 }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.h r2 = (com.google.protos.p4985f.p5030q.p5032b.C65061h) r2     // Catch:{ all -> 0x01c3 }
            com.google.protos.f.q.b.h r3 = com.google.protos.p4985f.p5030q.p5032b.C65061h.f176185f     // Catch:{ all -> 0x01c3 }
            int r3 = r2.f176187a     // Catch:{ all -> 0x01c3 }
            r7 = 2
            r3 = r3 | r7
            r2.f176187a = r3     // Catch:{ all -> 0x01c3 }
            r2.f176189c = r5     // Catch:{ all -> 0x01c3 }
        L_0x0189:
            r20 = r14
            goto L_0x010d
        L_0x018c:
            r14 = r20
            if (r1 == 0) goto L_0x0193
            r1.close()     // Catch:{ all -> 0x01d1 }
        L_0x0193:
            r11.setTransactionSuccessful()     // Catch:{ all -> 0x01d1 }
            java.util.Collection r0 = r15.values()     // Catch:{ all -> 0x01d1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01d1 }
        L_0x019e:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01d1 }
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.g r1 = (com.google.protos.p4985f.p5030q.p5032b.C65060g) r1     // Catch:{ all -> 0x01d1 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.h r1 = (com.google.protos.p4985f.p5030q.p5032b.C65061h) r1     // Catch:{ all -> 0x01d1 }
            r14.mo59335a(r1)     // Catch:{ all -> 0x01d1 }
            goto L_0x019e
        L_0x01b4:
            com.google.protobuf.bv r0 = r14.build()     // Catch:{ all -> 0x01d1 }
            com.google.protos.f.q.b.j r0 = (com.google.protos.p4985f.p5030q.p5032b.C65063j) r0     // Catch:{ all -> 0x01d1 }
            if (r19 == 0) goto L_0x01bf
            r19.close()     // Catch:{ all -> 0x01e3 }
        L_0x01bf:
            r11.endTransaction()
            return r0
        L_0x01c3:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x01d0
            r1.close()     // Catch:{ all -> 0x01cb }
            goto L_0x01d0
        L_0x01cb:
            r0 = move-exception
            r1 = r0
            com.google.android.libraries.geller.portable.database.C21958f.m41144a(r2, r1)     // Catch:{ all -> 0x01d1 }
        L_0x01d0:
            throw r2     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d3:
            r0 = move-exception
            r19 = r1
        L_0x01d6:
            r1 = r0
            if (r19 == 0) goto L_0x01e2
            r19.close()     // Catch:{ all -> 0x01dd }
            goto L_0x01e2
        L_0x01dd:
            r0 = move-exception
            r2 = r0
            com.google.android.libraries.geller.portable.database.C21958f.m41144a(r1, r2)     // Catch:{ all -> 0x01e3 }
        L_0x01e2:
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x01e3:
            r0 = move-exception
            r11.endTransaction()
            goto L_0x01e9
        L_0x01e8:
            throw r0
        L_0x01e9:
            goto L_0x01e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21959g.mo27282b(com.google.common.base.ax, java.util.Set):com.google.protos.f.q.b.j");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[][] mo27283c(com.google.common.base.C58833ax r6, com.google.protos.p4985f.p5030q.p5032b.C65031ap r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "timestamp_micro >= 0"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r7.f176102a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = " AND data_type = ?"
            r0.append(r2)
            java.lang.String r2 = r7.f176107f
            r1.add(r2)
        L_0x001c:
            int r2 = r7.f176103b
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != r4) goto L_0x0035
            java.lang.String r2 = " AND key = ?"
            r0.append(r2)
            int r2 = r7.f176103b
            if (r2 != r4) goto L_0x0031
            java.lang.Object r2 = r7.f176104c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0031:
            r1.add(r3)
            goto L_0x0054
        L_0x0035:
            r4 = 9
            if (r2 != r4) goto L_0x0054
            java.lang.String r2 = " AND key like ?"
            r0.append(r2)
            int r2 = r7.f176103b
            if (r2 != r4) goto L_0x0047
            java.lang.Object r2 = r7.f176104c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0047:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "%"
            java.lang.String r2 = r2.concat(r3)
            r1.add(r2)
        L_0x0054:
            int r2 = r7.f176102a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = " AND timestamp_micro >= ? AND timestamp_micro <= ?"
            r0.append(r2)
            com.google.protos.f.q.b.ao r2 = r7.f176106e
            if (r2 != 0) goto L_0x0065
            com.google.protos.f.q.b.ao r2 = com.google.protos.p4985f.p5030q.p5032b.C65030ao.f176095d
        L_0x0065:
            long r2 = r2.f176098b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
            com.google.protos.f.q.b.ao r2 = r7.f176106e
            if (r2 != 0) goto L_0x0074
            com.google.protos.f.q.b.ao r2 = com.google.protos.p4985f.p5030q.p5032b.C65030ao.f176095d
        L_0x0074:
            long r2 = r2.f176099c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
        L_0x007d:
            int r2 = r7.f176102a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0097
            boolean r2 = r7.f176108g
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = " AND sync_status = ?"
            r0.append(r2)
            java.lang.String r2 = "SYNCED"
            r1.add(r2)
            goto L_0x0097
        L_0x0092:
            java.lang.String r2 = " AND sync_status IS NULL"
            r0.append(r2)
        L_0x0097:
            int r2 = r7.f176102a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r7.f176109h
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = " AND delete_status IS NOT NULL"
            r0.append(r2)
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r2 = " AND delete_status IS NULL"
            r0.append(r2)
        L_0x00ac:
            int r2 = r7.f176102a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00c6
            boolean r2 = r7.f176110i
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = " AND deletion_sync_status = ?"
            r0.append(r2)
            java.lang.String r2 = "DELETION_SYNCED"
            r1.add(r2)
            goto L_0x00c6
        L_0x00c1:
            java.lang.String r2 = " AND deletion_sync_status IS NULL"
            r0.append(r2)
        L_0x00c6:
            int r2 = r7.f176102a
            r2 = r2 & 4
            r3 = 0
            if (r2 == 0) goto L_0x00e8
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6
            java.lang.Object r6 = r6.f156646a
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            boolean r2 = r5.f60572b
            java.lang.String r0 = r0.toString()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r7.f176105d
            byte[][] r6 = m41150l(r6, r2, r0, r1, r7)
            goto L_0x0100
        L_0x00e8:
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6
            java.lang.Object r6 = r6.f156646a
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            boolean r7 = r5.f60572b
            java.lang.String r0 = r0.toString()
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            byte[][] r6 = m41145g(r6, r7, r0, r1)
        L_0x0100:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21959g.mo27283c(com.google.common.base.ax, com.google.protos.f.q.b.ap):byte[][]");
    }

    /* renamed from: d */
    public final String[] mo27284d(C58833ax axVar, String str) {
        String[] strArr = {str};
        C58836b bVar = C58836b.f156633a;
        return (String[]) C21963k.m41183b((SQLiteDatabase) ((C58847bk) axVar).f156646a, "geller_key_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", strArr, bVar, bVar).toArray(new String[0]);
    }

    /* renamed from: f */
    public final boolean mo27286f(C58833ax axVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        Cursor query;
        Throwable th;
        byte[] bArr2 = bArr;
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ((C58847bk) axVar).f156646a;
        char c = 0;
        if (bArr2.length > 2000000) {
            ((C59052c) ((C59052c) f60571a.mo56226d()).mo56372aa(48055)).mo56387q("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
            return false;
        }
        sQLiteDatabase2.beginTransactionNonExclusive();
        try {
            String str2 = "data_type = ? AND " + C21963k.m41182a("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
            String[] strArr2 = {str, String.valueOf(j)};
            String[] strArr3 = {"data_id"};
            ArrayList arrayList = new ArrayList();
            try {
                query = sQLiteDatabase2.query(true, "geller_key_table", strArr3, str2, strArr2, "data_id", (String) null, "timestamp_micro DESC", (String) null);
                while (query.moveToNext()) {
                    arrayList.add(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("data_id"))));
                }
                if (query != null) {
                    query.close();
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f60571a.mo56225c()).mo56382g(e)).mo56372aa(48049)).mo56386p("Column doesn't exist");
            } catch (Throwable th2) {
                C21958f.m41144a(th, th2);
            }
            if (arrayList.size() == 1) {
                String[] strArr4 = {String.valueOf(arrayList.get(0))};
                C58836b bVar = C58836b.f156633a;
                String str3 = "_id";
                List<String> b = C21963k.m41183b(sQLiteDatabase2, "geller_key_table", "key", "data_id = ?", strArr4, bVar, bVar);
                if (new HashSet(b).equals(new HashSet(Arrays.asList(strArr)))) {
                    long j2 = m41148j(sQLiteDatabase2, bArr2);
                    long j3 = 0;
                    for (String str4 : b) {
                        String[] strArr5 = new String[3];
                        strArr5[c] = str;
                        strArr5[1] = str4;
                        strArr5[2] = String.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("data_id", Long.valueOf(j2));
                        j3 += (long) sQLiteDatabase2.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr5);
                        c = 0;
                    }
                    m41146h(sQLiteDatabase2, C21963k.m41182a(str3, "IN", arrayList), (String[]) null);
                    if (j3 <= 0) {
                        ((C59052c) ((C59052c) f60571a.mo56225c()).mo56372aa(48054)).mo56386p("Failed to update data.");
                    } else {
                        for (String str5 : b) {
                            String[] strArr6 = {str, str5, String.valueOf(j)};
                            ContentValues contentValues2 = new ContentValues();
                            if (z) {
                                contentValues2.put("sync_status", "SYNCED");
                            } else {
                                contentValues2.putNull("sync_status");
                            }
                            if (((long) sQLiteDatabase2.update("geller_key_table", contentValues2, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr6)) > 0) {
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.putNull("delete_status");
                                if (((long) sQLiteDatabase2.update("geller_key_table", contentValues3, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr6)) > 0) {
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("num_times_used", 0L);
                                    if (((long) sQLiteDatabase2.update("geller_key_table", contentValues4, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr6)) <= 0) {
                                    }
                                }
                            }
                            ((C59052c) ((C59052c) f60571a.mo56225c()).mo56372aa(48053)).mo56386p("Failed to update key.");
                        }
                        sQLiteDatabase = sQLiteDatabase2;
                        z2 = true;
                    }
                    sQLiteDatabase2.endTransaction();
                    return false;
                }
                m41146h(sQLiteDatabase2, "_id = ?", strArr4);
                z2 = true;
                sQLiteDatabase = sQLiteDatabase2;
                try {
                    m41151m(sQLiteDatabase2, str, strArr, j, z, bArr);
                } catch (IllegalStateException e2) {
                    e = e2;
                    try {
                        ((C59052c) ((C59052c) ((C59052c) f60571a.mo56225c()).mo56382g(e)).mo56372aa(48051)).mo56386p("Failed to write to data table.");
                        sQLiteDatabase.endTransaction();
                        return z2;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
            } else {
                sQLiteDatabase = sQLiteDatabase2;
                String str6 = "_id";
                z2 = true;
                if (arrayList.isEmpty()) {
                    m41151m(sQLiteDatabase, str, strArr, j, z, bArr);
                } else {
                    m41146h(sQLiteDatabase, C21963k.m41182a(str6, "IN", arrayList), (String[]) null);
                    m41151m(sQLiteDatabase, str, strArr, j, z, bArr);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (IllegalStateException e3) {
            e = e3;
            sQLiteDatabase = sQLiteDatabase2;
            z2 = true;
            ((C59052c) ((C59052c) ((C59052c) f60571a.mo56225c()).mo56382g(e)).mo56372aa(48051)).mo56386p("Failed to write to data table.");
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = sQLiteDatabase2;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        return z2;
        throw th;
    }

    /* renamed from: e */
    public final long mo27285e(C58833ax axVar, String str, C65019ad adVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        C65019ad adVar2 = adVar;
        boolean z = this.f60573c.f176079b;
        String str2 = BuildConfig.FLAVOR;
        if (z && axVar4.mo56113h()) {
            if (((C21956d) axVar4.mo56107c()).mo27276a().booleanValue()) {
                str2 = String.format("(%s IS NOT NULL)", new Object[]{"delete_status"});
            } else {
                str2 = String.format("(%s IS NULL)", new Object[]{"delete_status"});
            }
        }
        int i = adVar2.f176074a;
        String str3 = "data_type = ?";
        long j = 0;
        if (i == 1) {
            for (String str4 : C21963k.m41186e(((C65016aa) adVar2.f176075b).f176067a)) {
                if (!str4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    arrayList.add(str4);
                    if (!str2.isEmpty()) {
                        arrayList.add(str2);
                    }
                    j += (long) ((SQLiteDatabase) ((C58847bk) axVar).f156646a).update("geller_key_table", m41149k(axVar2, axVar3, axVar4), new C58827ar(" AND ").mo56097d(arrayList), new String[]{str});
                }
            }
            return j;
        } else if (i == 2) {
            C65018ac acVar = (C65018ac) adVar2.f176075b;
            if (!(acVar.f176070a.size() == 0 && acVar.f176071b.size() == 0)) {
                str3 = "data_type = ? AND ".concat(C21963k.m41187f(acVar.f176070a, acVar.f176071b));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            if (!str2.isEmpty()) {
                arrayList2.add(str2);
            }
            return (long) ((SQLiteDatabase) ((C58847bk) axVar).f156646a).update("geller_key_table", m41149k(axVar2, axVar3, axVar4), new C58827ar(" AND ").mo56097d(arrayList2), new String[]{str});
        } else {
            ((C59052c) ((C59052c) f60571a.mo56225c()).mo56372aa(48048)).mo56386p("Unexpected element_filtering in GellerElementSelectionParams.");
            return 0;
        }
    }
}
