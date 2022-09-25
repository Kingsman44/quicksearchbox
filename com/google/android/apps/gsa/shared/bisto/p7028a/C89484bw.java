package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124541a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124546b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124547c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124552h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.p9394a.C124543a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142329bh;
import com.google.android.p10712d.C142330bi;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bw */
/* compiled from: PG */
public final class C89484bw {

    /* renamed from: b */
    public static final /* synthetic */ int f242512b = 0;

    /* renamed from: c */
    private static final C59071e f242513c = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.a.bw");

    /* renamed from: d */
    private static final String f242514d;

    /* renamed from: e */
    private static final String f242515e;

    /* renamed from: a */
    public final C89476bo f242516a;

    static {
        String format = String.format(" FROM %s LEFT JOIN %s ON (%s.%s = %s.%s AND %s = ?) WHERE %s = ?", new Object[]{"main_table", "device_customize_info_table", "main_table", "model_id", "device_customize_info_table", "model_id", "locale", "device_identifier"});
        f242514d = format;
        f242515e = "SELECT *".concat(String.valueOf(format));
    }

    public C89484bw(C89476bo boVar) {
        this.f242516a = boVar;
    }

    /* renamed from: A */
    private static boolean m145615A(SQLiteDatabase sQLiteDatabase, C89481bt btVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_identifier", btVar.f242508a);
        contentValues.put("model_id", btVar.f242509b);
        contentValues.put("timestamp", Long.valueOf(btVar.f242510c));
        contentValues.put("device_info", btVar.f242511d.toByteArray());
        if (sQLiteDatabase.replaceOrThrow("main_table", (String) null, contentValues) == -1) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return true;
    }

    /* renamed from: B */
    private static byte[] m145616B(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex == -1 || cursor.isNull(columnIndex)) ? new byte[0] : cursor.getBlob(columnIndex);
    }

    /* renamed from: d */
    static C124709g m145617d(Cursor cursor) {
        byte[] B = m145616B(cursor, "device_info");
        if (B.length == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        try {
            return (C124709g) C62942bv.parseFrom((C62942bv) C124709g.f344049g, B, C62921ba.m95368a());
        } catch (C62974ct unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
    }

    /* renamed from: f */
    static C142324bc m145618f(Cursor cursor) {
        try {
            return (C142324bc) C62942bv.parseFrom((C62942bv) C142324bc.f386113s, m145616B(cursor, "device_customize_info"), C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x d = f242513c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10434)).mo56386p("Fail parse DCI");
            return C142324bc.f386113s;
        }
    }

    /* renamed from: g */
    static C142330bi m145619g(C142324bc bcVar) {
        C142330bi biVar = bcVar.f386132r;
        if (biVar == null) {
            biVar = C142330bi.f386146h;
        }
        C142329bh bhVar = (C142329bh) biVar.toBuilder();
        boolean z = bcVar.f386125k;
        bhVar.copyOnWrite();
        C142330bi biVar2 = (C142330bi) bhVar.instance;
        biVar2.f386148a |= 1;
        biVar2.f386149b = z;
        boolean z2 = bcVar.f386126l;
        bhVar.copyOnWrite();
        C142330bi biVar3 = (C142330bi) bhVar.instance;
        biVar3.f386148a |= 2;
        biVar3.f386150c = z2;
        boolean z3 = bcVar.f386129o;
        bhVar.copyOnWrite();
        C142330bi biVar4 = (C142330bi) bhVar.instance;
        biVar4.f386148a |= 4;
        biVar4.f386151d = z3;
        boolean z4 = bcVar.f386130p;
        bhVar.copyOnWrite();
        C142330bi biVar5 = (C142330bi) bhVar.instance;
        biVar5.f386148a |= 8;
        biVar5.f386152e = z4;
        boolean z5 = bcVar.f386131q;
        bhVar.copyOnWrite();
        C142330bi biVar6 = (C142330bi) bhVar.instance;
        biVar6.f386148a |= 16;
        biVar6.f386153f = z5;
        return (C142330bi) bhVar.build();
    }

    /* renamed from: j */
    static Long m145620j(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    /* renamed from: k */
    static String m145621k(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex == -1 || cursor.isNull(columnIndex)) ? BuildConfig.FLAVOR : cursor.getString(columnIndex);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r10 = com.google.common.p4526f.p4527a.C58975e.f156826a;
        r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List m145622m(android.database.sqlite.SQLiteDatabase r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = "main_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException | IllegalStateException -> 0x0028 }
        L_0x0013:
            boolean r10 = r1.moveToNext()     // Catch:{ SQLException | IllegalStateException -> 0x0028 }
            if (r10 == 0) goto L_0x0023
            com.google.android.apps.gsa.shared.bisto.a.bt r10 = m145625s(r1)     // Catch:{ SQLException | IllegalStateException -> 0x0028 }
            if (r10 == 0) goto L_0x0013
            r0.add(r10)     // Catch:{ SQLException | IllegalStateException -> 0x0028 }
            goto L_0x0013
        L_0x0023:
            if (r1 == 0) goto L_0x002f
            goto L_0x002c
        L_0x0026:
            r10 = move-exception
            goto L_0x0035
        L_0x0028:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x002f
        L_0x002c:
            r1.close()
        L_0x002f:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.size()
            return r0
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()
        L_0x003a:
            goto L_0x003c
        L_0x003b:
            throw r10
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145622m(android.database.sqlite.SQLiteDatabase):java.util.List");
    }

    /* renamed from: p */
    public static void m145623p(SQLiteDatabase sQLiteDatabase, String str, String str2, long j, C142324bc bcVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("model_id", str);
        contentValues.put("locale", str2);
        contentValues.put("last_downloaded_time", Long.valueOf(j));
        contentValues.put("device_customize_info", bcVar.toByteArray());
        sQLiteDatabase.replaceOrThrow("device_customize_info_table", (String) null, contentValues);
    }

    /* renamed from: r */
    private final SQLiteDatabase m145624r() {
        try {
            return this.f242516a.getWritableDatabase();
        } catch (SQLException | IllegalStateException e) {
            C59104x d = f242513c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10424)).mo56386p("fail getWritableDB");
            return null;
        }
    }

    /* renamed from: s */
    private static C89481bt m145625s(Cursor cursor) {
        String k = m145621k(cursor, "device_identifier");
        if (k.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        String k2 = m145621k(cursor, "model_id");
        Long j = m145620j(cursor, "timestamp");
        if (j == null || j.longValue() < 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
        C124709g d = m145617d(cursor);
        if (d != null) {
            return new C89481bt(k, k2, j.longValue(), d);
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g m145626t(android.database.sqlite.SQLiteDatabase r10, java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "device_info"
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x0032 }
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x0032 }
            r6[r3] = r11     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "main_table"
            java.lang.String r5 = "device_identifier = ?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0032 }
            boolean r11 = r10.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r11 == 0) goto L_0x0029
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r11 = m145617d(r10)     // Catch:{ all -> 0x002f }
            if (r10 == 0) goto L_0x0028
            r10.close()
        L_0x0028:
            return r11
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r10.close()
        L_0x002e:
            return r0
        L_0x002f:
            r11 = move-exception
            r0 = r10
            goto L_0x0034
        L_0x0032:
            r10 = move-exception
            r11 = r10
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145626t(android.database.sqlite.SQLiteDatabase, java.lang.String):com.google.android.apps.search.assistant.surfaces.bisto.d.g");
    }

    /* renamed from: u */
    private final C142324bc m145627u(String str, Cursor cursor, String str2) {
        if (str2.isEmpty()) {
            return C142324bc.f386113s;
        }
        if (!cursor.moveToFirst() || !str2.equals(m145621k(cursor, "locale"))) {
            return (C142324bc) m145629w(str, str2).orElse(C142324bc.f386113s);
        }
        return m145618f(cursor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r10 = r0.mo55394f();
        r0 = com.google.common.p4526f.p4527a.C58975e.f156826a;
        r0 = ((com.google.common.p4522b.C58724pq) r10).f156474d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r1 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0031 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.p4522b.C58485gu m145628v(android.database.sqlite.SQLiteDatabase r10) {
        /*
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            r1 = 0
            java.lang.String r3 = "device_customize_info_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
        L_0x0012:
            boolean r10 = r1.moveToNext()     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            if (r10 == 0) goto L_0x002c
            j$.util.Optional r10 = m145630x(r1)     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            boolean r2 = r10.isPresent()     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            if (r2 == 0) goto L_0x0012
            java.lang.Object r10 = r10.get()     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            com.google.android.apps.gsa.shared.bisto.a.bs r10 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89480bs) r10     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            r0.mo55395g(r10)     // Catch:{ SQLException | IllegalStateException -> 0x0031 }
            goto L_0x0012
        L_0x002c:
            if (r1 == 0) goto L_0x0038
            goto L_0x0035
        L_0x002f:
            r10 = move-exception
            goto L_0x0044
        L_0x0031:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0038
        L_0x0035:
            r1.close()
        L_0x0038:
            com.google.common.b.gu r10 = r0.mo55394f()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = r10
            com.google.common.b.pq r0 = (com.google.common.p4522b.C58724pq) r0
            int r0 = r0.f156474d
            return r10
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()
        L_0x0049:
            goto L_0x004b
        L_0x004a:
            throw r10
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.m145628v(android.database.sqlite.SQLiteDatabase):com.google.common.b.gu");
    }

    /* renamed from: w */
    private final Optional m145629w(String str, String str2) {
        Cursor rawQuery;
        SQLiteDatabase r = m145624r();
        if (r == null) {
            C59104x c = f242513c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) c).mo56372aa(10445)).mo56386p("Can't write device");
            return Optional.empty();
        }
        r.beginTransaction();
        try {
            rawQuery = r.rawQuery(f242515e, new String[]{"all", str});
            if (!rawQuery.moveToNext()) {
                Optional empty = Optional.empty();
                if (rawQuery != null) {
                    rawQuery.close();
                }
                try {
                    r.endTransaction();
                } catch (SQLiteDiskIOException e) {
                    C59104x d = f242513c.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10444)).mo56386p("fail transaction");
                }
                return empty;
            }
            Optional map = m145630x(rawQuery).map(new C89478bq(str2, r));
            if (rawQuery != null) {
                rawQuery.close();
            }
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e2) {
                C59104x d2 = f242513c.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(10440)).mo56386p("fail transaction");
            }
            return map;
        } catch (SQLException | IllegalStateException e3) {
            try {
                C59104x d3 = f242513c.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(10441)).mo56386p("fail add trimed DCI");
                return Optional.empty();
            } finally {
                try {
                    r.endTransaction();
                } catch (SQLiteDiskIOException e4) {
                    C59104x d4 = f242513c.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(10443)).mo56386p("fail transaction");
                }
            }
        } catch (Throwable th) {
            C89477bp.m145604a(th, th);
        }
        throw th;
    }

    /* renamed from: x */
    private static Optional m145630x(Cursor cursor) {
        String k = m145621k(cursor, "model_id");
        if (k.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return Optional.empty();
        }
        String k2 = m145621k(cursor, "locale");
        if (k2.isEmpty()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return Optional.empty();
        }
        Long j = m145620j(cursor, "last_downloaded_time");
        if (j == null || j.longValue() < 0) {
            C58976aa aaVar3 = C58975e.f156826a;
            return Optional.empty();
        }
        return Optional.m71637of(new C89434a(k, k2, j.longValue(), m145618f(cursor)));
    }

    /* renamed from: y */
    private static String m145631y(C124709g gVar) {
        if (gVar == null) {
            return BuildConfig.FLAVOR;
        }
        C124617aj ajVar = gVar.f344055e;
        if (ajVar == null) {
            ajVar = C124617aj.f343747l;
        }
        return ajVar.f343758j;
    }

    /* renamed from: z */
    private static void m145632z(SQLiteDatabase sQLiteDatabase, String str) {
        C59104x d;
        char c;
        C58976aa aaVar = C58975e.f156826a;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("device_customize_info_table", "model_id = ?", new String[]{str});
            sQLiteDatabase.setTransactionSuccessful();
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteDiskIOException e) {
                e = e;
                d = f242513c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                c = 10472;
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
            }
        } catch (SQLException | IllegalStateException e2) {
            C59104x d2 = f242513c.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(10473)).mo56386p("fail delete");
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteDiskIOException e3) {
                e = e3;
                d = f242513c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                c = 10474;
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
            }
        } catch (Throwable th) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteDiskIOException e4) {
                C59104x d3 = f242513c.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e4)).mo56372aa(10475)).mo56386p("fail transaction");
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase mo83427a() {
        try {
            return this.f242516a.getReadableDatabase();
        } catch (SQLException | IllegalStateException e) {
            C59104x d = f242513c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10423)).mo56386p("fail getReadableDB");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C124547c mo83428b(String str) {
        Cursor rawQuery;
        C58976aa aaVar = C58975e.f156826a;
        SQLiteDatabase a = mo83427a();
        if (a != null) {
            Object[] objArr = {"main_table.model_id", "last_downloaded_time"};
            try {
                rawQuery = a.rawQuery(String.format("SELECT %s, %s".concat(String.valueOf(f242514d)), objArr), new String[]{"all", str});
                if (rawQuery.moveToNext()) {
                    String k = m145621k(rawQuery, "model_id");
                    Long j = m145620j(rawQuery, "last_downloaded_time");
                    if (j == null) {
                        C124541a aVar = new C124541a(k, Optional.empty());
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return aVar;
                    }
                    C124541a aVar2 = new C124541a(k, Optional.m71637of(Instant.ofEpochMilli(j.longValue())));
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return aVar2;
                }
                throw new C124551g();
            } catch (SQLException e) {
                throw new C124551g(e);
            } catch (Throwable th) {
                C89477bp.m145604a(th, th);
            }
        } else {
            throw new C124551g();
        }
        throw th;
    }

    /* renamed from: c */
    public final C124709g mo83429c(String str) {
        try {
            SQLiteDatabase a = mo83427a();
            if (a == null) {
                return null;
            }
            return m145626t(a, str);
        } catch (SQLException | IllegalStateException e) {
            C59104x c = f242513c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10430)).mo56386p("fail read BDI");
            return null;
        }
    }

    /* renamed from: e */
    public final C142324bc mo83430e(String str, String str2) {
        Cursor rawQuery;
        C58976aa aaVar = C58975e.f156826a;
        SQLiteDatabase a = mo83427a();
        if (a != null) {
            try {
                rawQuery = a.rawQuery(f242515e, new String[]{str2, str});
                if (rawQuery.moveToNext()) {
                    C142324bc u = m145627u(str, rawQuery, str2);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return u;
                }
                throw new C124551g();
            } catch (SQLException e) {
                throw new C124551g(e);
            } catch (Throwable th) {
                C89477bp.m145604a(th, th);
            }
        } else {
            throw new C124551g();
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C58485gu mo83431h(String str, C142324bc bcVar, long j) {
        String str2 = str;
        SQLiteDatabase r = m145624r();
        if (r == null) {
            C59104x c = f242513c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) c).mo56372aa(10439)).mo56386p("Can't write device");
            return C58485gu.m89845m();
        }
        r.beginTransaction();
        try {
            C142330bi g = m145619g(bcVar);
            C58480gp e = C58485gu.m89837e();
            for (C89481bt btVar : m145622m(r)) {
                if (m145631y(btVar.f242511d).equals(str2)) {
                    C124708f fVar = (C124708f) btVar.f242511d.toBuilder();
                    C124644bj bjVar = ((C124709g) fVar.instance).f344053c;
                    if (bjVar == null) {
                        bjVar = C124644bj.f343868n;
                    }
                    C124643bi biVar = (C124643bi) bjVar.toBuilder();
                    biVar.mo106573a(g);
                    fVar.copyOnWrite();
                    C124709g gVar = (C124709g) fVar.instance;
                    C124644bj bjVar2 = (C124644bj) biVar.build();
                    bjVar2.getClass();
                    gVar.f344053c = bjVar2;
                    gVar.f344051a |= 2;
                    C89481bt btVar2 = new C89481bt(btVar.f242508a, btVar.f242509b, j, (C124709g) fVar.build());
                    m145615A(r, btVar2);
                    e.mo55395g(btVar2.f242508a);
                }
            }
            C58485gu f = e.mo55394f();
            m145632z(r, str2);
            m145623p(r, str, "all", j, bcVar);
            String g2 = C124525f.m203991g(Locale.getDefault());
            m145623p(r, str, g2, j, C124543a.m204022b(bcVar, g2));
            r.setTransactionSuccessful();
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e2) {
                SQLiteDiskIOException sQLiteDiskIOException = e2;
                C59104x d = f242513c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(sQLiteDiskIOException)).mo56372aa(10437)).mo56386p("fail transaction");
            }
            return f;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e3) {
                SQLiteDiskIOException sQLiteDiskIOException2 = e3;
                C59104x d2 = f242513c.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(sQLiteDiskIOException2)).mo56372aa(10438)).mo56386p("fail transaction");
            }
            throw th2;
        }
    }

    /* renamed from: i */
    public final Optional mo83432i(String str, long j) {
        Cursor rawQuery;
        SQLiteDatabase r = m145624r();
        if (r == null) {
            return Optional.empty();
        }
        r.beginTransaction();
        try {
            rawQuery = r.rawQuery(f242515e, new String[]{"all", str});
            if (!rawQuery.moveToNext()) {
                C58976aa aaVar = C58975e.f156826a;
                Optional empty = Optional.empty();
                if (rawQuery != null) {
                    rawQuery.close();
                }
                try {
                    r.endTransaction();
                } catch (SQLiteDiskIOException e) {
                    C59104x d = f242513c.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10458)).mo56386p("fail transaction");
                }
                return empty;
            }
            C89481bt s = m145625s(rawQuery);
            Optional x = m145630x(rawQuery);
            if (s != null) {
                if (!x.isEmpty()) {
                    C124644bj bjVar = s.f242511d.f344053c;
                    if (bjVar == null) {
                        bjVar = C124644bj.f343868n;
                    }
                    if ((bjVar.f343870a & 1024) != 0) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        Optional empty2 = Optional.empty();
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        try {
                            r.endTransaction();
                        } catch (SQLiteDiskIOException e2) {
                            C59104x d2 = f242513c.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(10456)).mo56386p("fail transaction");
                        }
                        return empty2;
                    }
                    C124708f fVar = (C124708f) s.f242511d.toBuilder();
                    C124644bj bjVar2 = s.f242511d.f344053c;
                    if (bjVar2 == null) {
                        bjVar2 = C124644bj.f343868n;
                    }
                    C124643bi biVar = (C124643bi) bjVar2.toBuilder();
                    biVar.mo106573a(m145619g(((C89480bs) x.get()).mo83346b()));
                    fVar.copyOnWrite();
                    C124709g gVar = (C124709g) fVar.instance;
                    C124644bj bjVar3 = (C124644bj) biVar.build();
                    bjVar3.getClass();
                    gVar.f344053c = bjVar3;
                    gVar.f344051a = 2 | gVar.f344051a;
                    C124709g gVar2 = (C124709g) fVar.build();
                    m145615A(r, new C89481bt(s.f242508a, s.f242509b, j, gVar2));
                    r.setTransactionSuccessful();
                    Optional of = Optional.m71637of(gVar2);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    try {
                        r.endTransaction();
                    } catch (SQLiteDiskIOException e3) {
                        C59104x d3 = f242513c.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                        ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(10454)).mo56386p("fail transaction");
                    }
                    return of;
                }
            }
            C58976aa aaVar3 = C58975e.f156826a;
            Optional empty3 = Optional.empty();
            if (rawQuery != null) {
                rawQuery.close();
            }
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e4) {
                C59104x d4 = f242513c.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(10450)).mo56386p("fail transaction");
            }
            return empty3;
        } catch (SQLException | IllegalStateException e5) {
            try {
                C59104x d5 = f242513c.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d5).mo56382g(e5)).mo56372aa(10451)).mo56386p("fail update lightDCI");
                return Optional.empty();
            } finally {
                try {
                    r.endTransaction();
                } catch (SQLiteDiskIOException e6) {
                    C59104x d6 = f242513c.mo56226d();
                    d6.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) ((C59052c) d6).mo56382g(e6)).mo56372aa(10453)).mo56386p("fail transaction");
                }
            }
        } catch (Throwable th) {
            C89477bp.m145604a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    public final List mo83433l() {
        C90476a aVar = C91018d.f254254a;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase a = mo83427a();
        if (a == null) {
            return C58485gu.m89845m();
        }
        arrayList.addAll(m145622m(a));
        arrayList.addAll(m145628v(a));
        return (List) Collection.EL.stream(arrayList).map(C89479br.f242507a).collect(Collectors.toList());
    }

    /* renamed from: n */
    public final void mo83434n(String str) {
        String[] strArr = {str};
        SQLiteDatabase r = m145624r();
        if (r == null) {
            C59104x c = f242513c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) c).mo56372aa(10465)).mo56386p("Can't remove device");
            return;
        }
        r.beginTransaction();
        try {
            String y = m145631y(m145626t(r, str));
            if (!y.isEmpty()) {
                if (DatabaseUtils.queryNumEntries(r, "main_table", "model_id = ?", new String[]{y}) <= 1) {
                    m145632z(r, y);
                }
            }
            r.delete("main_table", "device_identifier = ?", strArr);
            r.setTransactionSuccessful();
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e) {
                C59104x d = f242513c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10461)).mo56386p("fail transaction");
            }
        } catch (SQLException | IllegalStateException e2) {
            C59104x d2 = f242513c.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(10462)).mo56386p("fail delete");
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e3) {
                C59104x d3 = f242513c.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(10463)).mo56386p("fail transaction");
            }
        } catch (Throwable th) {
            try {
                r.endTransaction();
            } catch (SQLiteDiskIOException e4) {
                C59104x d4 = f242513c.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(10464)).mo56386p("fail transaction");
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83435o(java.lang.String r16, com.google.android.apps.gsa.shared.bisto.p7028a.C89483bv r17, long r18) {
        /*
            r15 = this;
            r1 = r17
            java.lang.String r2 = "fail transaction"
            android.database.sqlite.SQLiteDatabase r3 = r15.m145624r()
            java.lang.String r4 = "BistoDeviceDatabase"
            if (r3 != 0) goto L_0x001f
            com.google.common.f.e r0 = f242513c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Can't write device"
            r2 = 10470(0x28e6, float:1.4672E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x001f:
            r3.beginTransaction()
            r5 = 0
            r6 = 0
            r0 = r16
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r13 = m145626t(r3, r0)     // Catch:{ Exception -> 0x0064 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r7 = r1.mo83351a(r13)     // Catch:{ Exception -> 0x005f }
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r6 = r1.mo83357b(r7)     // Catch:{ Exception -> 0x005f }
            com.google.android.apps.gsa.shared.bisto.a.bt r14 = new com.google.android.apps.gsa.shared.bisto.a.bt     // Catch:{ Exception -> 0x005f }
            java.lang.String r9 = m145631y(r6)     // Catch:{ Exception -> 0x005f }
            r7 = r14
            r8 = r16
            r10 = r18
            r12 = r6
            r7.<init>(r8, r9, r10, r12)     // Catch:{ Exception -> 0x005f }
            boolean r0 = m145615A(r3, r14)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x004b
            r3.setTransactionSuccessful()     // Catch:{ Exception -> 0x005f }
            r5 = 1
        L_0x004b:
            r3.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x004f }
            goto L_0x009c
        L_0x004f:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r0 = f242513c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r4)
            r4 = 10466(0x28e2, float:1.4666E-41)
            goto L_0x0099
        L_0x005f:
            r0 = move-exception
            goto L_0x0066
        L_0x0061:
            r0 = move-exception
            r1 = r0
            goto L_0x00a4
        L_0x0064:
            r0 = move-exception
            r13 = r6
        L_0x0066:
            com.google.common.f.e r7 = f242513c     // Catch:{ all -> 0x0061 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0061 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0061 }
            r7.mo56378ag(r8, r4)     // Catch:{ all -> 0x0061 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0061 }
            com.google.common.f.x r0 = r7.mo56382g(r0)     // Catch:{ all -> 0x0061 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0061 }
            r7 = 10467(0x28e3, float:1.4667E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r7)     // Catch:{ all -> 0x0061 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0061 }
            java.lang.String r7 = "fail write"
            r0.mo56386p(r7)     // Catch:{ all -> 0x0061 }
            r3.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x008a }
            goto L_0x009c
        L_0x008a:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r0 = f242513c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r4)
            r4 = 10468(0x28e4, float:1.4669E-41)
        L_0x0099:
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r3)).mo56372aa(r4)).mo56386p(r2)
        L_0x009c:
            if (r5 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            r1.mo83358c(r13, r6)
        L_0x00a3:
            return
        L_0x00a4:
            r3.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x00a8 }
            goto L_0x00ba
        L_0x00a8:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r0 = f242513c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r4)
            r4 = 10469(0x28e5, float:1.467E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r3)).mo56372aa(r4)).mo56386p(r2)
        L_0x00ba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89484bw.mo83435o(java.lang.String, com.google.android.apps.gsa.shared.bisto.a.bv, long):void");
    }

    /* renamed from: q */
    public final C124552h mo83436q(String str) {
        Cursor rawQuery;
        C58976aa aaVar = C58975e.f156826a;
        SQLiteDatabase a = mo83427a();
        if (a != null) {
            try {
                rawQuery = a.rawQuery(f242515e, new String[]{"all", str});
                if (rawQuery.moveToNext()) {
                    C124709g d = m145617d(rawQuery);
                    if (d != null) {
                        C124546b bVar = new C124546b(new C124544b(d), m145627u(str, rawQuery, "all"));
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return bVar;
                    }
                    throw new C124551g();
                }
                throw new C124551g();
            } catch (SQLException e) {
                throw new C124551g(e);
            } catch (Throwable th) {
                C89477bp.m145604a(th, th);
            }
        } else {
            throw new C124551g();
        }
        throw th;
    }
}
