package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bo */
/* compiled from: PG */
public final class C89476bo extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final C59071e f242504a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.a.bo");

    public C89476bo(Context context) {
        super(context, "bisto_devices.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* renamed from: a */
    private static void m145602a(SQLiteDatabase sQLiteDatabase) {
        C58976aa aaVar = C58975e.f156826a;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device_customize_info_table (model_id TEXT, locale TEXT, last_downloaded_time LONG, device_customize_info BLOB  )");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS idx_model_locale ON device_customize_info_table (model_id, locale)");
    }

    /* renamed from: b */
    private static boolean m145603b(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM %s", new Object[]{"model_id", "main_table"}), (String[]) null);
            if (rawQuery == null) {
                z = false;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return z;
        } catch (SQLException unused) {
            return false;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS main_table (device_identifier TEXT UNIQUE, timestamp LONG, device_info BLOB, model_id TEXT  )");
            m145602a(sQLiteDatabase);
        } catch (SQLException | IllegalStateException unused) {
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.google.android.d.bc, java.lang.String, com.google.android.apps.search.assistant.surfaces.bisto.d.u] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r26, int r27, int r28) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r9 = r28
            com.google.common.f.e r2 = f242504a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "BistoDeviceDatabase"
            r2.mo56378ag(r3, r10)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 10421(0x28b5, float:1.4603E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "onUpgrade v%d to v%d"
            r2.mo56393w(r3, r1, r9)
            java.lang.String r11 = "device_info"
            java.lang.String r14 = "cursor is null in DCI migration"
            r15 = 3
            java.lang.String r8 = "main_table"
            java.lang.String r7 = "timestamp"
            java.lang.String r6 = "device_identifier"
            java.lang.String r5 = "model_id"
            r4 = 2
            r3 = 0
            r2 = 1
            if (r1 != r2) goto L_0x01b0
            if (r9 >= r4) goto L_0x003f
            r9 = r3
            r12 = r6
            r13 = r7
            r18 = r10
            r15 = r14
            r1 = 1
            goto L_0x01b6
        L_0x003f:
            boolean r1 = m145603b(r26)
            r16 = 0
            if (r1 == 0) goto L_0x0053
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            r1.put(r5, r3)
            r0.update(r8, r1, r3, r3)
            goto L_0x0066
        L_0x0053:
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r16] = r8
            r1[r2] = r5
            java.lang.String r17 = "TEXT"
            r1[r4] = r17
            java.lang.String r3 = "ALTER TABLE %s ADD COLUMN %s %s;"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.execSQL(r1)
        L_0x0066:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "device_customize_info_table"
            r1[r16] = r3
            java.lang.String r2 = "DROP TABLE IF EXISTS %s;"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.execSQL(r1)
            m145602a(r26)
            java.lang.String r2 = "main_table"
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r1 = r26
            r15 = r3
            r3 = r16
            r4 = r18
            r23 = r5
            r5 = r19
            r12 = r6
            r6 = r20
            r13 = r7
            r7 = r21
            r18 = r10
            r10 = r8
            r8 = r22
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x019a
        L_0x00a2:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0197 }
            if (r2 == 0) goto L_0x0189
            java.lang.String r2 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145621k(r1, r12)     // Catch:{ all -> 0x0197 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0197 }
            if (r3 != 0) goto L_0x0180
            java.lang.Long r3 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145620j(r1, r13)     // Catch:{ all -> 0x0197 }
            if (r3 == 0) goto L_0x0180
            long r4 = r3.longValue()     // Catch:{ all -> 0x0197 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0180
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r4 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145617d(r1)     // Catch:{ all -> 0x0197 }
            if (r4 == 0) goto L_0x0180
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = r4.f344055e     // Catch:{ all -> 0x0197 }
            if (r5 != 0) goto L_0x00ce
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj.f343747l     // Catch:{ all -> 0x0197 }
        L_0x00ce:
            java.lang.String r5 = r5.f343758j     // Catch:{ all -> 0x0197 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0197 }
            if (r6 != 0) goto L_0x0180
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r6 = r4.f344053c     // Catch:{ all -> 0x0197 }
            if (r6 != 0) goto L_0x00dc
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0197 }
        L_0x00dc:
            int r6 = r6.f343870a     // Catch:{ all -> 0x0197 }
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0180
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r6 = r4.f344053c     // Catch:{ all -> 0x0197 }
            if (r6 != 0) goto L_0x00e8
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0197 }
        L_0x00e8:
            com.google.android.apps.search.assistant.surfaces.bisto.d.u r6 = r6.f343878i     // Catch:{ all -> 0x0197 }
            if (r6 != 0) goto L_0x00ee
            com.google.android.apps.search.assistant.surfaces.bisto.d.u r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124723u.f344112c     // Catch:{ all -> 0x0197 }
        L_0x00ee:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0197 }
            r7.<init>()     // Catch:{ all -> 0x0197 }
            r8 = r23
            r7.put(r8, r5)     // Catch:{ all -> 0x0197 }
            java.lang.String r9 = "locale"
            r19 = r14
            java.lang.String r14 = "all"
            r7.put(r9, r14)     // Catch:{ all -> 0x0197 }
            java.lang.String r9 = "last_downloaded_time"
            r20 = r10
            r14 = r11
            long r10 = r6.f344115b     // Catch:{ all -> 0x0197 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0197 }
            r7.put(r9, r10)     // Catch:{ all -> 0x0197 }
            java.lang.String r9 = "device_customize_info"
            com.google.android.d.bc r10 = r6.f344114a     // Catch:{ all -> 0x0197 }
            if (r10 != 0) goto L_0x0117
            com.google.android.d.bc r10 = com.google.android.p10712d.C142324bc.f386113s     // Catch:{ all -> 0x0197 }
        L_0x0117:
            byte[] r10 = r10.toByteArray()     // Catch:{ all -> 0x0197 }
            r7.put(r9, r10)     // Catch:{ all -> 0x0197 }
            r9 = 0
            r0.replace(r15, r9, r7)     // Catch:{ all -> 0x0197 }
            com.google.protobuf.bn r7 = r4.toBuilder()     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.f r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f) r7     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = r4.f344053c     // Catch:{ all -> 0x0197 }
            if (r4 != 0) goto L_0x012e
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0197 }
        L_0x012e:
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bi r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi) r4     // Catch:{ all -> 0x0197 }
            com.google.android.d.bc r6 = r6.f344114a     // Catch:{ all -> 0x0197 }
            if (r6 != 0) goto L_0x013a
            com.google.android.d.bc r6 = com.google.android.p10712d.C142324bc.f386113s     // Catch:{ all -> 0x0197 }
        L_0x013a:
            com.google.android.d.bi r6 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145619g(r6)     // Catch:{ all -> 0x0197 }
            r4.mo106573a(r6)     // Catch:{ all -> 0x0197 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0197 }
            com.google.protobuf.bv r6 = r7.instance     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r6     // Catch:{ all -> 0x0197 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r4     // Catch:{ all -> 0x0197 }
            r4.getClass()     // Catch:{ all -> 0x0197 }
            r6.f344053c = r4     // Catch:{ all -> 0x0197 }
            int r4 = r6.f344051a     // Catch:{ all -> 0x0197 }
            r10 = 2
            r4 = r4 | r10
            r6.f344051a = r4     // Catch:{ all -> 0x0197 }
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x0197 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r4     // Catch:{ all -> 0x0197 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0197 }
            r6.<init>()     // Catch:{ all -> 0x0197 }
            r6.put(r12, r2)     // Catch:{ all -> 0x0197 }
            r6.put(r8, r5)     // Catch:{ all -> 0x0197 }
            r6.put(r13, r3)     // Catch:{ all -> 0x0197 }
            byte[] r2 = r4.toByteArray()     // Catch:{ all -> 0x0197 }
            r11 = r14
            r6.put(r11, r2)     // Catch:{ all -> 0x0197 }
            r14 = r20
            r0.replace(r14, r9, r6)     // Catch:{ all -> 0x0197 }
            r9 = r28
            r23 = r8
            r10 = r14
            goto L_0x0185
        L_0x0180:
            r19 = r14
            r14 = r10
            r9 = r28
        L_0x0185:
            r14 = r19
            goto L_0x00a2
        L_0x0189:
            r19 = r14
            r8 = r23
            r9 = 0
            r14 = r10
            r10 = 2
            r1.close()
            r15 = r19
            r1 = 2
            goto L_0x01b9
        L_0x0197:
            r0 = move-exception
            r2 = r0
            goto L_0x01a4
        L_0x019a:
            r19 = r14
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0197 }
            r15 = r19
            r0.<init>(r15)     // Catch:{ all -> 0x0197 }
            throw r0     // Catch:{ all -> 0x0197 }
        L_0x01a4:
            if (r1 == 0) goto L_0x01af
            r1.close()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x01aa:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.gsa.shared.bisto.p7028a.C89475bn.m145601a(r2, r1)
        L_0x01af:
            throw r2
        L_0x01b0:
            r9 = r3
            r12 = r6
            r13 = r7
            r18 = r10
            r15 = r14
        L_0x01b6:
            r10 = 2
            r14 = r8
            r8 = r5
        L_0x01b9:
            if (r1 != r10) goto L_0x02aa
            r2 = r28
            r7 = 3
            if (r2 >= r7) goto L_0x01c3
            r15 = 2
            goto L_0x02ab
        L_0x01c3:
            java.lang.String r2 = "main_table"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r19 = 0
            r20 = 0
            r1 = r26
            r21 = 3
            r7 = r19
            r24 = r8
            r8 = r20
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0298
        L_0x01dd:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0295 }
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145621k(r1, r12)     // Catch:{ all -> 0x0295 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0295 }
            if (r3 != 0) goto L_0x01dd
            java.lang.Long r3 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145620j(r1, r13)     // Catch:{ all -> 0x0295 }
            if (r3 == 0) goto L_0x01dd
            long r4 = r3.longValue()     // Catch:{ all -> 0x0295 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x01dd
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r4 = com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145617d(r1)     // Catch:{ all -> 0x0295 }
            if (r4 == 0) goto L_0x01dd
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = r4.f344055e     // Catch:{ all -> 0x0295 }
            if (r5 != 0) goto L_0x0209
            com.google.android.apps.search.assistant.surfaces.bisto.d.aj r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj.f343747l     // Catch:{ all -> 0x0295 }
        L_0x0209:
            java.lang.String r5 = r5.f343758j     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r8 = r4.f344053c     // Catch:{ all -> 0x0295 }
            if (r8 != 0) goto L_0x0211
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0295 }
        L_0x0211:
            int r8 = r8.f343870a     // Catch:{ all -> 0x0295 }
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0218
            goto L_0x0225
        L_0x0218:
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r8 = r4.f344053c     // Catch:{ all -> 0x0295 }
            if (r8 != 0) goto L_0x021e
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0295 }
        L_0x021e:
            int r8 = r8.f343870a     // Catch:{ all -> 0x0295 }
            r8 = r8 & 32
            if (r8 != 0) goto L_0x0225
            goto L_0x0272
        L_0x0225:
            com.google.protobuf.bn r8 = r4.toBuilder()     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.f r8 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f) r8     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = r4.f344053c     // Catch:{ all -> 0x0295 }
            if (r4 != 0) goto L_0x0231
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n     // Catch:{ all -> 0x0295 }
        L_0x0231:
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bi r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi) r4     // Catch:{ all -> 0x0295 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0295 }
            com.google.protobuf.bv r15 = r4.instance     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r15 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r15     // Catch:{ all -> 0x0295 }
            r15.f343878i = r9     // Catch:{ all -> 0x0295 }
            int r6 = r15.f343870a     // Catch:{ all -> 0x0295 }
            r6 = r6 & -129(0xffffffffffffff7f, float:NaN)
            r15.f343870a = r6     // Catch:{ all -> 0x0295 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0295 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r6     // Catch:{ all -> 0x0295 }
            r6.f343876g = r9     // Catch:{ all -> 0x0295 }
            int r7 = r6.f343870a     // Catch:{ all -> 0x0295 }
            r7 = r7 & -33
            r6.f343870a = r7     // Catch:{ all -> 0x0295 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0295 }
            com.google.protobuf.bv r6 = r8.instance     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r6     // Catch:{ all -> 0x0295 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r4     // Catch:{ all -> 0x0295 }
            r4.getClass()     // Catch:{ all -> 0x0295 }
            r6.f344053c = r4     // Catch:{ all -> 0x0295 }
            int r4 = r6.f344051a     // Catch:{ all -> 0x0295 }
            r4 = r4 | r10
            r6.f344051a = r4     // Catch:{ all -> 0x0295 }
            com.google.protobuf.bv r4 = r8.build()     // Catch:{ all -> 0x0295 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r4     // Catch:{ all -> 0x0295 }
        L_0x0272:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            r6.put(r12, r2)     // Catch:{ all -> 0x0295 }
            r2 = r24
            r6.put(r2, r5)     // Catch:{ all -> 0x0295 }
            r6.put(r13, r3)     // Catch:{ all -> 0x0295 }
            byte[] r3 = r4.toByteArray()     // Catch:{ all -> 0x0295 }
            r6.put(r11, r3)     // Catch:{ all -> 0x0295 }
            r0.replace(r14, r9, r6)     // Catch:{ all -> 0x0295 }
            r24 = r2
            goto L_0x01dd
        L_0x0290:
            r1.close()
            r15 = 3
            goto L_0x02ab
        L_0x0295:
            r0 = move-exception
            r2 = r0
            goto L_0x029e
        L_0x0298:
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0295 }
            r0.<init>(r15)     // Catch:{ all -> 0x0295 }
            throw r0     // Catch:{ all -> 0x0295 }
        L_0x029e:
            if (r1 == 0) goto L_0x02a9
            r1.close()     // Catch:{ all -> 0x02a4 }
            goto L_0x02a9
        L_0x02a4:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.gsa.shared.bisto.p7028a.C89475bn.m145601a(r2, r1)
        L_0x02a9:
            throw r2
        L_0x02aa:
            r15 = r1
        L_0x02ab:
            com.google.common.f.e r0 = f242504a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = r18
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "done with v%d"
            r2 = 10422(0x28b6, float:1.4604E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56387q(r1, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89476bo.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
