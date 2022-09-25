package com.google.android.libraries.geller.portable.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4874ap.p4875a.p4876a.C63660aa;
import com.google.protos.p4874ap.p4875a.p4876a.C63667f;
import com.google.protos.p4874ap.p4875a.p4876a.C63674m;
import com.google.protos.p4874ap.p4875a.p4876a.C63684w;
import com.google.protos.p4874ap.p4875a.p4876a.C63687z;
import com.google.protos.p4985f.p5030q.p5032b.C65016aa;
import com.google.protos.p4985f.p5030q.p5032b.C65017ab;
import com.google.protos.p4985f.p5030q.p5032b.C65018ac;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import com.google.protos.p4985f.p5030q.p5032b.C65025aj;
import com.google.protos.p4985f.p5030q.p5032b.C65028am;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5032b.C65040ay;
import com.google.protos.p4985f.p5030q.p5032b.C65041az;
import com.google.protos.p4985f.p5030q.p5032b.C65043ba;
import com.google.protos.p4985f.p5030q.p5032b.C65044bb;
import com.google.protos.p4985f.p5030q.p5032b.C65049bg;
import com.google.protos.p4985f.p5030q.p5032b.C65050bh;
import com.google.protos.p4985f.p5030q.p5032b.C65051bi;
import com.google.protos.p4985f.p5030q.p5032b.C65052bj;
import com.google.protos.p4985f.p5030q.p5032b.C65053bk;
import com.google.protos.p4985f.p5030q.p5032b.C65055bm;
import com.google.protos.p4985f.p5030q.p5032b.C65061h;
import com.google.protos.p4985f.p5030q.p5032b.C65062i;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65064k;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65068o;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p4985f.p5030q.p5032b.C65078y;
import com.google.protos.p4985f.p5030q.p5032b.C65079z;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.database.j */
/* compiled from: PG */
public final class C21962j extends SQLiteOpenHelper implements GellerDatabase {

    /* renamed from: f */
    private static final C59071e f60574f = C59071e.m91332i("com.google.android.libraries.geller.portable.database.j");

    /* renamed from: g */
    private final boolean f60575g;

    /* renamed from: h */
    private final boolean f60576h;

    /* renamed from: i */
    private final Context f60577i;

    /* renamed from: j */
    private final C21959g f60578j;

    /* renamed from: k */
    private final C21964l f60579k;

    /* renamed from: l */
    private final C21965m f60580l;

    /* renamed from: m */
    private final C58833ax f60581m;

    /* renamed from: n */
    private final C58833ax f60582n;

    /* renamed from: o */
    private final C58833ax f60583o;

    /* renamed from: p */
    private final String f60584p;

    /* renamed from: q */
    private int f60585q;

    public C21962j(Context context, String str, boolean z, boolean z2, boolean z3, int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C65021af afVar) {
        super(context, String.format("portable_geller_%s.db", new Object[]{str.replace(File.separator, "_")}), (SQLiteDatabase.CursorFactory) null, i);
        C58833ax axVar4;
        this.f60575g = z;
        this.f60585q = i;
        this.f60577i = context;
        this.f60584p = str;
        if (z) {
            setOpenParams(new SQLiteDatabase.OpenParams.Builder().addOpenFlags(1).build());
        }
        setWriteAheadLoggingEnabled(z2);
        mo27287e();
        this.f60576h = z3;
        this.f60578j = new C21959g(z3, afVar);
        this.f60579k = new C21964l(context, str);
        this.f60580l = new C21965m();
        this.f60582n = axVar;
        if (!axVar2.mo56113h() || !((Map) axVar2.mo56107c()).containsKey(str)) {
            axVar4 = C58836b.f156633a;
        } else {
            axVar4 = C58833ax.m90834k(new C21977y((Map) ((Map) axVar2.mo56107c()).get(str)));
        }
        this.f60581m = axVar4;
        this.f60583o = axVar3;
        ((C59052c) ((C59052c) f60574f.mo56224b()).mo56372aa(48081)).mo56389s("Setting isLegacySQLite mode to %s.", Boolean.valueOf(z3));
    }

    /* renamed from: f */
    public static C21961i m41167f() {
        char c;
        C21953a aVar = new C21953a();
        aVar.f60560b = 8;
        aVar.f60562d = (byte) (8 | aVar.f60562d);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(":memory:", (SQLiteDatabase.CursorFactory) null);
        String stringForQuery = DatabaseUtils.stringForQuery(openOrCreateDatabase, "SELECT sqlite_version()", (String[]) null);
        openOrCreateDatabase.close();
        boolean z = false;
        try {
            Iterator it = C58869cf.m90938d(".").mo56153g(stringForQuery).iterator();
            Iterator it2 = C58869cf.m90938d(".").mo56153g("3.25.0").iterator();
            while (true) {
                if (!it.hasNext() && !it2.hasNext()) {
                    break;
                }
                String str = (String) C58570jy.m90156h(it, "0");
                String str2 = (String) C58570jy.m90156h(it2, "0");
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt == parseInt2) {
                    c = 0;
                    continue;
                } else if (parseInt < parseInt2) {
                    c = 65535;
                    continue;
                } else {
                    c = 1;
                    continue;
                }
                if (c != 0) {
                    if (c < 0) {
                        z = true;
                    }
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalArgumentException unused) {
            ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48096)).mo56389s("Unable to parse SQLite version %s. Assuming legacy version.", stringForQuery);
        }
        aVar.f60559a = z;
        aVar.f60562d = (byte) (aVar.f60562d | 4);
        return aVar;
    }

    /* renamed from: i */
    private static int m41168i(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IOException("column for keyEntry: " + str + " is not found");
    }

    /* renamed from: j */
    private final long m41169j(String str, String[] strArr) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            return 0;
        }
        e.beginTransactionNonExclusive();
        try {
            long delete = (long) e.delete("geller_metadata_table", str, strArr);
            e.setTransactionSuccessful();
            return delete;
        } finally {
            e.endTransaction();
        }
    }

    /* renamed from: k */
    private final long m41170k(String str, String[] strArr, long j) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("num_times_used", Long.valueOf(j));
        return (long) e.update("geller_key_table", contentValues, str, strArr);
    }

    /* renamed from: l */
    private final C21957e m41171l(String str) {
        if (((C58759qy) f60554a).f156534a.equals(str)) {
            return this.f60579k;
        }
        if (f60556c.contains(str)) {
            return this.f60582n.mo56113h() ? (C21957e) this.f60582n.mo56107c() : this.f60580l;
        }
        if (((C58759qy) f60557d).f156534a.equals(str) && this.f60582n.mo56113h()) {
            return (C21957e) this.f60582n.mo56107c();
        }
        if (!((C58759qy) f60555b).f156534a.equals(str) || !this.f60581m.mo56113h()) {
            return (!((C58759qy) f60558e).f156534a.equals(str) || !this.f60583o.mo56113h()) ? this.f60578j : (C21957e) this.f60583o.mo56107c();
        }
        return (C21957e) this.f60581m.mo56107c();
    }

    /* renamed from: m */
    private final boolean m41172m(String str) {
        byte[][] bArr;
        C63667f fVar;
        Object obj;
        String name = C65753ak.GELLER_CONFIG.name();
        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        apVar.f176102a |= 4;
        apVar.f176105d = 1;
        try {
            C65031ap apVar2 = (C65031ap) C62942bv.parseFrom((C62942bv) C65031ap.f176100j, ((C65031ap) amVar.build()).toByteArray(), C62921ba.m95368a());
            SQLiteDatabase e = mo27287e();
            if (e == null) {
                bArr = new byte[0][];
            } else {
                C65028am amVar2 = (C65028am) apVar2.toBuilder();
                amVar2.copyOnWrite();
                C65031ap apVar3 = (C65031ap) amVar2.instance;
                name.getClass();
                apVar3.f176102a |= 16;
                apVar3.f176107f = name;
                if ((apVar2.f176102a & 64) == 0) {
                    amVar2.copyOnWrite();
                    C65031ap apVar4 = (C65031ap) amVar2.instance;
                    apVar4.f176102a |= 64;
                    apVar4.f176109h = false;
                }
                try {
                    bArr = m41171l(name).mo27283c(C58833ax.m90834k(e), (C65031ap) amVar2.build());
                } catch (SQLiteException | IllegalStateException e2) {
                    mo27288g(e2);
                    throw new GellerException(C62722b.ABORTED, e2.getMessage(), e2);
                }
            }
        } catch (C62974ct e3) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e3)).mo56372aa(48117)).mo56386p("Failed to parse GellerReadParams bytes");
            SQLiteDatabase e4 = mo27287e();
            if (e4 != null) {
                try {
                    C21957e l = m41171l(name);
                    C58833ax k = C58833ax.m90834k(e4);
                    C65028am amVar3 = (C65028am) C65031ap.f176100j.createBuilder();
                    amVar3.copyOnWrite();
                    C65031ap apVar5 = (C65031ap) amVar3.instance;
                    name.getClass();
                    apVar5.f176102a |= 16;
                    apVar5.f176107f = name;
                    bArr = l.mo27283c(k, (C65031ap) amVar3.build());
                } catch (SQLiteException | IllegalStateException e5) {
                    mo27288g(e5);
                    throw new GellerException(C62722b.ABORTED, e5.getMessage(), e5);
                }
            } else {
                bArr = new byte[0][];
            }
        }
        if (bArr.length == 0) {
            ((C59052c) ((C59052c) f60574f.mo56224b()).mo56372aa(48098)).mo56389s("The GellerConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
            return true;
        }
        C62921ba a = C62921ba.m95368a();
        try {
            C65768az azVar = (C65768az) C62942bv.parseFrom((C62942bv) C65768az.f178793f, bArr[0], a);
            C62940bt r2 = C62942bv.checkIsLite(C63667f.f172152f);
            azVar.mo58887l(r2);
            if (azVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r1 = C62942bv.checkIsLite(C63667f.f172152f);
                azVar.mo58887l(r1);
                Object l2 = azVar.f169962ag.mo58854l(r1.f169971d);
                if (l2 == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l2);
                }
                fVar = (C63667f) obj;
            } else {
                try {
                    C63070h hVar = azVar.f178799e;
                    if (hVar == null) {
                        hVar = C63070h.f170215c;
                    }
                    fVar = (C63667f) C62942bv.parseFrom((C62942bv) C63667f.f172151e, hVar.f170218b, a);
                } catch (C62974ct e6) {
                    throw new IllegalStateException("Failed to unpack GellerClientConfig.", e6);
                }
            }
            C63660aa aaVar = fVar.f172157d;
            if (aaVar == null) {
                aaVar = C63660aa.f172141b;
            }
            for (C63687z zVar : aaVar.f172143a) {
                C65753ak b = C65753ak.m96797b(zVar.f172199a);
                if (b == null) {
                    b = C65753ak.UNKNOWN;
                }
                if (C58890d.m90990e(b.name(), str)) {
                    C63684w wVar = zVar.f172200b;
                    if (wVar == null) {
                        wVar = C63684w.f172193b;
                    }
                    C63674m mVar = wVar.f172195a;
                    if (mVar == null) {
                        mVar = C63674m.f172168e;
                    }
                    return mVar.f172171b;
                }
            }
            ((C59052c) ((C59052c) f60574f.mo56224b()).mo56372aa(48097)).mo56389s("The Geller SyncConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
            return true;
        } catch (C62974ct e7) {
            throw new IllegalStateException("Failed to parse an element.", e7);
        }
    }

    /* renamed from: n */
    private final long m41173n(String str, String[] strArr, int i) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_status", C21955c.m41135a(i));
        return (long) e.update("geller_key_table", contentValues, str, strArr);
    }

    /* renamed from: o */
    private static final String m41174o(String str) {
        ((C58759qy) f60554a).f156534a.equals(str);
        return "key";
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f A[Catch:{ all -> 0x00eb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo27243a(java.lang.String r20, com.google.protos.p4985f.p5030q.p5032b.C65025aj r21) {
        /*
            r19 = this;
            r0 = r21
            com.google.protobuf.cq r1 = r0.f176089c
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto L_0x000d
            return r2
        L_0x000d:
            java.util.ArrayList r1 = new java.util.ArrayList
            com.google.protobuf.cq r4 = r0.f176089c
            r1.<init>(r4)
            int r0 = r0.f176088b
            int r4 = com.google.protos.p4985f.p5030q.p5032b.C65024ai.m96519a(r0)
            r5 = 1
            if (r4 != 0) goto L_0x001e
            r4 = 1
        L_0x001e:
            int r4 = r4 + -1
            java.lang.String r6 = "DELETION_SYNCED"
            java.lang.String r7 = "SYNCED"
            r8 = 2
            if (r4 == r5) goto L_0x0053
            if (r4 == r8) goto L_0x0051
            int r0 = com.google.protos.p4985f.p5030q.p5032b.C65024ai.m96519a(r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            if (r0 == 0) goto L_0x0038
            if (r0 == r5) goto L_0x0038
            if (r0 == r8) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r6 = r7
            goto L_0x003a
        L_0x0038:
            java.lang.String r6 = "UNKNOWN"
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Marking data status to "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r2 = " is not supported."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0051:
            r4 = 2
            goto L_0x0054
        L_0x0053:
            r4 = 1
        L_0x0054:
            android.database.sqlite.SQLiteDatabase r9 = r19.mo27287e()
            if (r9 == 0) goto L_0x0121
            r9.beginTransactionNonExclusive()
            r0 = 100
            java.util.List r0 = com.google.common.p4522b.C58597ky.m90215f(r1, r0)     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r10 = r2
        L_0x0068:
            boolean r1 = r0.hasNext()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r1 = r0.next()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.ad r12 = com.google.protos.p4985f.p5030q.p5032b.C65019ad.f176072c     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.y r12 = (com.google.protos.p4985f.p5030q.p5032b.C65078y) r12     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.aa r13 = com.google.protos.p4985f.p5030q.p5032b.C65016aa.f176065b     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.z r13 = (com.google.protos.p4985f.p5030q.p5032b.C65079z) r13     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r13.mo59336a(r1)     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r12.copyOnWrite()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protobuf.bv r1 = r12.instance     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.ad r1 = (com.google.protos.p4985f.p5030q.p5032b.C65019ad) r1     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protobuf.bv r13 = r13.build()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protos.f.q.b.aa r13 = (com.google.protos.p4985f.p5030q.p5032b.C65016aa) r13     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r13.getClass()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r1.f176075b = r13     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r1.f176074a = r5     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            com.google.protobuf.bv r1 = r12.build()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r15 = r1
            com.google.protos.f.q.b.ad r15 = (com.google.protos.p4985f.p5030q.p5032b.C65019ad) r15     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            if (r4 != r5) goto L_0x00c5
            com.google.android.libraries.geller.portable.database.e r12 = r19.m41171l(r20)     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
            com.google.common.base.ax r16 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
            com.google.common.base.b r18 = com.google.common.base.C58836b.f156633a     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
            r14 = r20
            r17 = r18
            long r12 = r12.mo27285e(r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalStateException -> 0x00c2, SQLiteException -> 0x00c0 }
        L_0x00be:
            long r10 = r10 + r12
            goto L_0x0068
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r0 = move-exception
        L_0x00c3:
            r8 = 1
            goto L_0x00f3
        L_0x00c5:
            com.google.android.libraries.geller.portable.database.e r12 = r19.m41171l(r20)     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            com.google.common.base.b r16 = com.google.common.base.C58836b.f156633a     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            com.google.common.base.ax r17 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            com.google.common.base.b r18 = com.google.common.base.C58836b.f156633a     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            r14 = r20
            long r12 = r12.mo27285e(r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalStateException -> 0x00e2, SQLiteException -> 0x00e0 }
            goto L_0x00be
        L_0x00e0:
            r0 = move-exception
            goto L_0x00f3
        L_0x00e2:
            r0 = move-exception
            goto L_0x00f3
        L_0x00e4:
            r9.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x00f1, SQLiteException -> 0x00ef }
            r9.endTransaction()
            return r10
        L_0x00eb:
            r0 = move-exception
            r1 = r19
            goto L_0x011d
        L_0x00ef:
            r0 = move-exception
            goto L_0x00f2
        L_0x00f1:
            r0 = move-exception
        L_0x00f2:
            r8 = r4
        L_0x00f3:
            com.google.common.f.e r1 = f60574f     // Catch:{ all -> 0x00eb }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x00eb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00eb }
            com.google.common.f.x r1 = r1.mo56382g(r0)     // Catch:{ all -> 0x00eb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00eb }
            r4 = 48067(0xbbc3, float:6.7356E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x00eb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "Marking data to %s failed"
            if (r8 == r5) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r6 = r7
        L_0x0110:
            r1.mo56389s(r4, r6)     // Catch:{ all -> 0x00eb }
            r1 = r19
            r1.mo27288g(r0)     // Catch:{ all -> 0x011c }
            r9.endTransaction()
            goto L_0x0123
        L_0x011c:
            r0 = move-exception
        L_0x011d:
            r9.endTransaction()
            throw r0
        L_0x0121:
            r1 = r19
        L_0x0123:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21962j.mo27243a(java.lang.String, com.google.protos.f.q.b.aj):long");
    }

    /* renamed from: b */
    public final C58495hd mo27244b(String str, String str2) {
        String str3;
        String[] strArr;
        C58495hd hdVar;
        Cursor query;
        Throwable th;
        if (str2 == null) {
            str3 = "data_type = ?";
            try {
                strArr = new String[]{str};
            } catch (SQLiteException | IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48078)).mo56386p("Get data sync status failed");
                mo27288g(e);
                return C58729pv.f156485a;
            } catch (Throwable th2) {
                C21960h.m41158a(th, th2);
            }
        } else {
            str3 = "data_type = ? AND key = ?";
            strArr = new String[]{str, str2};
        }
        String str4 = str3;
        String[] strArr2 = strArr;
        SQLiteDatabase e2 = mo27287e();
        if (e2 == null) {
            hdVar = C58729pv.f156485a;
        } else {
            query = e2.query("geller_key_table", new String[]{"key", "sync_status", "timestamp_micro"}, str4, strArr2, (String) null, (String) null, (String) null, (String) null);
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(m41168i(query, "sync_status"));
                String string2 = query.getString(m41168i(query, "key"));
                long j = query.getLong(m41168i(query, "timestamp_micro"));
                boolean z = string != null && string.equals("SYNCED");
                if (hashMap.containsKey(string2)) {
                    ((C58490gz) hashMap.get(string2)).mo55429h(Long.valueOf(j), Boolean.valueOf(z));
                } else {
                    C58490gz gzVar = new C58490gz(4);
                    gzVar.mo55429h(Long.valueOf(j), Boolean.valueOf(z));
                    hashMap.put(string2, gzVar);
                }
            }
            C58490gz gzVar2 = new C58490gz(4);
            for (Map.Entry entry : hashMap.entrySet()) {
                gzVar2.mo55429h((String) entry.getKey(), ((C58490gz) entry.getValue()).mo55363c());
            }
            hdVar = gzVar2.mo55427f(true);
            if (query != null) {
                query.close();
            }
        }
        return hdVar;
        throw th;
    }

    /* renamed from: c */
    public final void mo27245c() {
        close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0176 A[Catch:{ SQLiteException | IllegalStateException -> 0x0265, all -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a5 A[Catch:{ SQLiteException | IllegalStateException -> 0x0265, all -> 0x0263 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27246d(byte[] r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = " )"
            android.database.sqlite.SQLiteDatabase r2 = r23.mo27287e()
            if (r2 != 0) goto L_0x0019
            com.google.common.f.e r0 = f60574f
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "The Geller SQLiteDatabase is null, skipping setting DELETION_PROCESSED status."
            r3 = 48072(0xbbc8, float:6.7363E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0019:
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x028f }
            com.google.protos.f.q.b.x r4 = com.google.protos.p4985f.p5030q.p5032b.C65077x.f176224b     // Catch:{ ct -> 0x028f }
            r5 = r24
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r5, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x028f }
            com.google.protos.f.q.b.x r3 = (com.google.protos.p4985f.p5030q.p5032b.C65077x) r3     // Catch:{ ct -> 0x028f }
            r2.beginTransactionNonExclusive()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protobuf.cq r3 = r3.f176226a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0030:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r4 == 0) goto L_0x025c
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.f.q.b.w r4 = (com.google.protos.p4985f.p5030q.p5032b.C65076w) r4     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r5 = r4.f176222b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r5 != 0) goto L_0x0046
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0046:
            java.lang.String r5 = r5.name()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.common.b.ij r6 = f60554a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.common.b.qy r6 = (com.google.common.p4522b.C58759qy) r6     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Object r6 = r6.f156534a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r6 = r6.equals(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protobuf.cq r7 = r4.f176223c     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r7 = r7.size()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r8 = "data_type = ?"
            r11 = 1
            if (r7 == 0) goto L_0x0223
            com.google.common.b.ij r7 = f60554a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.common.b.qy r7 = (com.google.common.p4522b.C58759qy) r7     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Object r7 = r7.f156534a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.equals(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            m41174o(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protobuf.cq r7 = r4.f176223c     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0076:
            boolean r12 = r7.hasNext()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r7.next()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.f.q.b.v r12 = (com.google.protos.p4985f.p5030q.p5032b.C65075v) r12     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.android.libraries.geller.portable.a r13 = new com.google.android.libraries.geller.portable.a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r13.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r14 = r12.f176218c     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r13.mo27213b(r14)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r14 = r12.f176216a     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r14 = r14 & r11
            if (r14 == 0) goto L_0x00a2
            long r14 = r12.f176217b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r13.f60401a = r12     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.android.libraries.geller.portable.d r12 = r13.mo27212a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x00a6
        L_0x00a2:
            com.google.android.libraries.geller.portable.d r12 = r13.mo27212a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x00a6:
            r5.add(r12)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x0076
        L_0x00aa:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r12 = 100
            java.util.List r5 = com.google.common.p4522b.C58597ky.m90215f(r5, r12)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x00b9:
            boolean r12 = r5.hasNext()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r12 == 0) goto L_0x01c3
            java.lang.Object r12 = r5.next()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r13 = "timestamp_micro"
            java.lang.String r14 = "key"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r15.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r9 = 0
        L_0x00cf:
            int r10 = r12.size()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r9 >= r10) goto L_0x01b1
            java.lang.String r10 = "( "
            if (r9 != 0) goto L_0x00dd
            r15.append(r10)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x00e2
        L_0x00dd:
            java.lang.String r11 = " OR "
            r15.append(r11)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x00e2:
            java.lang.Object r11 = r12.get(r9)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.android.libraries.geller.portable.d r11 = (com.google.android.libraries.geller.portable.C21952d) r11     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r16 = r11.mo27229b()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r16 = r16.isEmpty()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r16 == 0) goto L_0x0103
            com.google.common.base.ax r16 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r16 = r16.mo56113h()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r16 == 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            r17 = r3
            r20 = r5
            goto L_0x01a8
        L_0x0103:
            com.google.common.base.ax r16 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r16 = r16.mo56113h()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r17 = r3
            java.lang.String r3 = "="
            r18 = 0
            if (r16 == 0) goto L_0x013e
            com.google.common.base.ax r16 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Object r16 = r16.mo56107c()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Long r16 = (java.lang.Long) r16     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            long r20 = r16.longValue()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r16 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r16 < 0) goto L_0x013e
            com.google.common.base.ax r16 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Object r16 = r16.mo56107c()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Long r16 = (java.lang.Long) r16     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r20 = r5
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r16)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r5 = com.google.android.libraries.geller.portable.database.C21963k.m41182a(r13, r3, r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r10 = r10.concat(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x0140
        L_0x013e:
            r20 = r5
        L_0x0140:
            com.google.common.base.ax r5 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r5 = r5.mo56113h()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r5 == 0) goto L_0x016c
            com.google.common.base.ax r5 = r11.mo27228a()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Object r5 = r5.mo56107c()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            long r21 = r5.longValue()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x016c
            java.lang.String r5 = r11.mo27229b()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r5 = r5.isEmpty()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r5 != 0) goto L_0x016c
            java.lang.String r5 = " AND"
            java.lang.String r10 = r10.concat(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x016c:
            java.lang.String r5 = r11.mo27229b()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r5 = r5.isEmpty()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r5 != 0) goto L_0x0196
            java.lang.String r5 = r11.mo27229b()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r3 = com.google.android.libraries.geller.portable.database.C21963k.m41182a(r14, r3, r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5.append(r10)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r10 = " "
            r5.append(r10)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5.append(r3)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r10 = r5.toString()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0196:
            java.lang.String r3 = r10.concat(r0)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r15.append(r3)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r3 = r12.size()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r3 = r3 + -1
            if (r9 != r3) goto L_0x01a8
            r15.append(r0)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x01a8:
            int r9 = r9 + 1
            r3 = r17
            r5 = r20
            r11 = 1
            goto L_0x00cf
        L_0x01b1:
            r17 = r3
            r20 = r5
            java.lang.String r3 = r15.toString()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.add(r3)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r3 = r17
            r5 = r20
            r11 = 1
            goto L_0x00b9
        L_0x01c3:
            r17 = r3
            java.util.Iterator r3 = r7.iterator()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x01c9:
            boolean r5 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r5 == 0) goto L_0x0258
            java.lang.Object r5 = r3.next()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            boolean r7 = r5.isEmpty()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r7 != 0) goto L_0x01c9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.append(r8)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r9 = " AND "
            r7.append(r9)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7.append(r5)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            java.lang.String r5 = r7.toString()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r6 == 0) goto L_0x020a
            r7 = 1
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r7 = r4.f176222b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.p.b.ak r7 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r7)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r7 != 0) goto L_0x01fe
            com.google.protos.p.b.ak r7 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x01fe:
            java.lang.String r7 = r7.name()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r10 = 0
            r9[r10] = r7     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7 = 2
            com.google.android.libraries.geller.portable.database.C21964l.m41190i(r2, r5, r9, r7)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x01c9
        L_0x020a:
            r7 = 1
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r7 = r4.f176222b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.p.b.ak r7 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r7)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r7 != 0) goto L_0x0217
            com.google.protos.p.b.ak r7 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0217:
            java.lang.String r7 = r7.name()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r10 = 0
            r9[r10] = r7     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r7 = 2
            r1.m41173n(r5, r9, r7)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x01c9
        L_0x0223:
            r17 = r3
            if (r6 == 0) goto L_0x0240
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r4 = r4.f176222b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r4)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r4 != 0) goto L_0x0234
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0234:
            java.lang.String r4 = r4.name()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5 = 0
            r3[r5] = r4     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r4 = 2
            com.google.android.libraries.geller.portable.database.C21964l.m41190i(r2, r8, r3, r4)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            goto L_0x0258
        L_0x0240:
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            int r4 = r4.f176222b     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r4)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            if (r4 != 0) goto L_0x024d
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x024d:
            java.lang.String r4 = r4.name()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r5 = 0
            r3[r5] = r4     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r4 = 2
            r1.m41173n(r8, r3, r4)     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
        L_0x0258:
            r3 = r17
            goto L_0x0030
        L_0x025c:
            r2.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x0267, SQLiteException -> 0x0265 }
            r2.endTransaction()
            return
        L_0x0263:
            r0 = move-exception
            goto L_0x028b
        L_0x0265:
            r0 = move-exception
            goto L_0x0268
        L_0x0267:
            r0 = move-exception
        L_0x0268:
            com.google.common.f.e r3 = f60574f     // Catch:{ all -> 0x0263 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0263 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0263 }
            com.google.common.f.x r3 = r3.mo56382g(r0)     // Catch:{ all -> 0x0263 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0263 }
            r4 = 48070(0xbbc6, float:6.736E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0263 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0263 }
            java.lang.String r4 = "Failed to set DELETION_PROCESSED status."
            r3.mo56386p(r4)     // Catch:{ all -> 0x0263 }
            r1.mo27288g(r0)     // Catch:{ all -> 0x0263 }
            r2.endTransaction()
            return
        L_0x028b:
            r2.endTransaction()
            throw r0
        L_0x028f:
            r0 = move-exception
            com.google.common.f.e r2 = f60574f
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Failed to parse GellerDeletedElements bytes"
            r4 = 48071(0xbbc7, float:6.7362E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21962j.mo27246d(byte[]):void");
    }

    public final long delete(String str) {
        C59071e eVar = f60574f;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(48057)).mo56389s("Deleting all data for %s", str);
        SQLiteDatabase e = mo27287e();
        long j = 0;
        if (e != null) {
            try {
                e.beginTransactionNonExclusive();
                m41169j("data_type = ?", new String[]{str});
                C21957e l = m41171l(str);
                C58833ax k = C58833ax.m90834k(e);
                String str2 = this.f60584p;
                C65064k kVar = (C65064k) C65071r.f176208e.createBuilder();
                kVar.copyOnWrite();
                C65071r rVar = (C65071r) kVar.instance;
                str.getClass();
                rVar.f176210a |= 1;
                rVar.f176213d = str;
                kVar.copyOnWrite();
                C65071r rVar2 = (C65071r) kVar.instance;
                rVar2.f176211b = 4;
                rVar2.f176212c = true;
                j = l.mo27281a(k, str2, (C65071r) kVar.build());
                e.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48059)).mo56389s("Delete %s failed", str);
                mo27288g(e2);
            } catch (Throwable th) {
                e.endTransaction();
                throw th;
            }
            e.endTransaction();
            return j;
        }
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(48058)).mo56386p("The Geller SQLiteDatabase is null, skipping deletion.");
        return 0;
    }

    public final long deleteMetadata(String str, String str2) {
        try {
            return m41169j("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48065)).mo56354G("Delete metadata %s : %s failed", str, str2);
            mo27288g(e);
            return 0;
        }
    }

    /* renamed from: e */
    public final synchronized SQLiteDatabase mo27287e() {
        try {
            if (this.f60575g) {
                return getReadableDatabase();
            }
            return getWritableDatabase();
        } catch (SQLiteException e) {
            if (!e.getMessage().contains("Can't upgrade read-only database")) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56226d()).mo56382g(e)).mo56372aa(48077)).mo56386p("Failed to get geller database.");
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo27288g(Exception exc) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(exc)).mo56372aa(48085)).mo56386p("An error occurred. No action was taken because the database was null.");
            return;
        } else if ((exc instanceof IllegalStateException) || (exc instanceof SQLiteDatabaseLockedException) || (exc instanceof SQLiteDiskIOException) || (exc instanceof SQLiteFullException) || (exc instanceof SQLiteOutOfMemoryException) || (exc instanceof SQLiteTableLockedException)) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(exc)).mo56372aa(48084)).mo56386p("An error occurred. No action was taken because the exception was not actionable.");
            return;
        } else if (!this.f60575g) {
            C58480gp e2 = C58485gu.m89837e();
            e2.mo55395g("geller_key_table");
            e2.mo55395g("geller_data_table");
            if (this.f60585q >= 5) {
                e2.mo55395g("geller_file_table");
            }
            if (this.f60585q >= 8) {
                e2.mo55395g("geller_metadata_table");
            }
            C58485gu f = e2.mo55394f();
            Cursor rawQuery = e.rawQuery(String.format("SELECT count(*) FROM %s WHERE %s", new Object[]{"sqlite_master", "type = ? AND ".concat(C21963k.m41182a("name", "IN", f))}), new String[]{"table"});
            try {
                rawQuery.moveToFirst();
                int i = rawQuery.getInt(0);
                int i2 = ((C58724pq) f).f156474d;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                if (i != i2) {
                    ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(exc)).mo56372aa(48091)).mo56386p("An error occurred. Dropping existing data and recreating all tables.");
                    mo27289h(e);
                    return;
                }
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(exc)).mo56372aa(48090)).mo56386p("An error occurred. No action was taken because the error reason is unknown.");
                return;
            } catch (Throwable th) {
                C21960h.m41158a(th, th);
            }
        } else {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(exc)).mo56372aa(48083)).mo56386p("An error occurred. No action was taken because the database is read only.");
            return;
        }
        throw th;
    }

    public final byte[] getCorpusStats() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.f60579k, new HashSet());
        hashMap.put(this.f60578j, new HashSet());
        if (this.f60582n.mo56113h()) {
            hashMap.put((C21957e) this.f60582n.mo56107c(), new HashSet());
        }
        if (this.f60582n.mo56113h()) {
            hashMap.put((C21957e) this.f60582n.mo56107c(), new HashSet());
        }
        if (this.f60581m.mo56113h()) {
            hashMap.put((C21957e) this.f60581m.mo56107c(), new HashSet());
        }
        if (this.f60583o.mo56113h()) {
            hashMap.put((C21957e) this.f60583o.mo56107c(), new HashSet());
        }
        C65062i iVar = (C65062i) C65063j.f176192d.createBuilder();
        C58833ax k = C58833ax.m90834k(mo27287e());
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                for (C65061h a : ((C21957e) entry.getKey()).mo27282b(k, (Set) entry.getValue()).f176195b) {
                    iVar.mo59335a(a);
                }
            }
            return ((C65063j) iVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48106)).mo56386p("GetCorpusStats failed");
            mo27288g(e);
            return new byte[0];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo27289h(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        try {
            if (!this.f60575g) {
                rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                    ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48082)).mo56389s("Dropped table %s", string);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                C21964l.m41188g(new File(this.f60577i.getFilesDir(), "geller"));
                onCreate(sQLiteDatabase);
                return;
            }
            return;
        } catch (SQLiteException e) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48089)).mo56386p("Failed to recreate tables");
            return;
        } catch (Throwable th) {
            C21960h.m41158a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean incrementUsage(java.lang.String r21, java.lang.String r22, long r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            android.database.sqlite.SQLiteDatabase r4 = r20.mo27287e()
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x011d
            r4.beginTransactionNonExclusive()
            r0 = 3
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r15[r8] = r2     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r15[r7] = r3     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r9 = 2
            r15[r9] = r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.String r0 = "num_times_used"
            java.lang.String r13 = "data_type = ? AND key = ? AND timestamp_micro = ?"
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r14.<init>()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            android.database.sqlite.SQLiteDatabase r9 = r20.mo27287e()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            if (r9 == 0) goto L_0x008a
            java.lang.String[] r12 = new java.lang.String[r7]     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r12[r8] = r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r10 = 1
            java.lang.String r11 = "geller_key_table"
            java.lang.String r16 = "data_id"
            r17 = 0
            java.lang.String r18 = "timestamp_micro DESC"
            r19 = 0
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalArgumentException -> 0x0076 }
        L_0x004c:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0062
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0068 }
            long r10 = r9.getLong(r10)     // Catch:{ all -> 0x0068 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0068 }
            r5.add(r10)     // Catch:{ all -> 0x0068 }
            goto L_0x004c
        L_0x0062:
            if (r9 == 0) goto L_0x008c
            r9.close()     // Catch:{ IllegalArgumentException -> 0x0076 }
            goto L_0x008c
        L_0x0068:
            r0 = move-exception
            r10 = r0
            if (r9 == 0) goto L_0x0075
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0075
        L_0x0070:
            r0 = move-exception
            r9 = r0
            com.google.android.libraries.geller.portable.database.C21960h.m41158a(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0076 }
        L_0x0075:
            throw r10     // Catch:{ IllegalArgumentException -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            r5 = r14
            r6 = r15
        L_0x007b:
            com.google.common.f.e r9 = f60574f     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.String r10 = "Column doesn't exist"
            r11 = 48080(0xbbd0, float:6.7374E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r0)).mo56372aa(r11)).mo56386p(r10)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            goto L_0x008c
        L_0x008a:
            r5 = r14
            r6 = r15
        L_0x008c:
            boolean r0 = r5.isEmpty()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            if (r0 == 0) goto L_0x00b0
            com.google.common.f.e r0 = f60574f     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r5 = 48095(0xbbdf, float:6.7395E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.String r5 = "Could not find any elements with %s and key: %s and timestamp: %d"
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r0.mo56359L(r5, r2, r3, r6)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r4.endTransaction()
            return r8
        L_0x00b0:
            int r0 = r5.size()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            if (r0 <= r7) goto L_0x00d4
            com.google.common.f.e r0 = f60574f     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r5 = 48094(0xbbde, float:6.7394E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.String r5 = "Found more than one element with %s and key: %s and timestamp: %d. Unclear which one to increment."
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r0.mo56359L(r5, r2, r3, r6)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r4.endTransaction()
            return r8
        L_0x00d4:
            java.lang.String r0 = "data_type = ? AND key = ? AND timestamp_micro = ?"
            java.lang.Object r2 = r5.get(r8)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            long r2 = r2.longValue()     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r9 = 1
            long r2 = r2 + r9
            long r2 = r1.m41170k(r0, r6, r2)     // Catch:{ IllegalStateException -> 0x00f3, SQLiteException -> 0x00f1 }
            r4.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x00ed, SQLiteException -> 0x00eb }
            goto L_0x0115
        L_0x00eb:
            r0 = move-exception
            goto L_0x00f6
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f6
        L_0x00ef:
            r0 = move-exception
            goto L_0x0119
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f4
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            r2 = 0
        L_0x00f6:
            com.google.common.f.e r5 = f60574f     // Catch:{ all -> 0x00ef }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x00ef }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00ef }
            com.google.common.f.x r5 = r5.mo56382g(r0)     // Catch:{ all -> 0x00ef }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00ef }
            r6 = 48093(0xbbdd, float:6.7393E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x00ef }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = "Increment usage failed"
            r5.mo56386p(r6)     // Catch:{ all -> 0x00ef }
            r1.mo27288g(r0)     // Catch:{ all -> 0x00ef }
        L_0x0115:
            r4.endTransaction()
            goto L_0x011f
        L_0x0119:
            r4.endTransaction()
            throw r0
        L_0x011d:
            r2 = 0
        L_0x011f:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            return r7
        L_0x0126:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21962j.incrementUsage(java.lang.String, java.lang.String, long):boolean");
    }

    public final long markSyncStatus(String str, byte[] bArr) {
        try {
            return mo27243a(str, (C65025aj) C62942bv.parseFrom((C62942bv) C65025aj.f176085d, bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48068)).mo56386p("Failed to parse GellerMarkSyncStatusParams.");
            return 0;
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f60575g) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_data_table (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
            int i = this.f60585q;
            if (i == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
            } else if (i <= 5) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
            }
            sQLiteDatabase.execSQL("CREATE INDEX datatype_key_dataid ON geller_key_table (data_type, key, delete_status, data_id);");
            if (this.f60585q >= 3) {
                sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
            }
            int i2 = this.f60585q;
            if (i2 >= 5 && i2 <= 7) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
            }
            if (this.f60585q >= 7) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
            }
            if (this.f60585q >= 8) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, file_path TEXT NOT NULL);");
            }
            sQLiteDatabase.setVersion(this.f60585q);
            return;
        }
        throw new SQLiteException("Cannot create Geller database with readonly enabled");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f60575g) {
            while (i < i2) {
                if (i == 1) {
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN num_times_used INTEGER;");
                } else if (i == 2) {
                    sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
                } else if (i == 4) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
                } else if (i == 5) {
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN deletion_sync_status TEXT;");
                } else if (i == 6) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
                } else if (i == 7) {
                    sQLiteDatabase.execSQL("ALTER TABLE geller_file_table ADD COLUMN deletion_sync_status TEXT;");
                }
                i++;
            }
            this.f60585q = i2;
            sQLiteDatabase.setVersion(i2);
            return;
        }
        throw new SQLiteException("Cannot upgrade Geller database with readonly enabled");
    }

    public final byte[][] read(String str, boolean z, boolean z2) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            return new byte[0][];
        }
        try {
            C21957e l = m41171l(str);
            C58833ax k = C58833ax.m90834k(e);
            C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
            amVar.copyOnWrite();
            C65031ap apVar = (C65031ap) amVar.instance;
            str.getClass();
            apVar.f176102a |= 16;
            apVar.f176107f = str;
            amVar.copyOnWrite();
            C65031ap apVar2 = (C65031ap) amVar.instance;
            apVar2.f176102a |= 32;
            apVar2.f176108g = z;
            amVar.copyOnWrite();
            C65031ap apVar3 = (C65031ap) amVar.instance;
            apVar3.f176102a |= 64;
            apVar3.f176109h = z2;
            return l.mo27283c(k, (C65031ap) amVar.build());
        } catch (SQLiteException | IllegalStateException e2) {
            mo27288g(e2);
            throw new GellerException(C62722b.ABORTED, e2.getMessage(), e2);
        }
    }

    public final byte[][] readAll(String str) {
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            return new byte[0][];
        }
        try {
            C21957e l = m41171l(str);
            C58833ax k = C58833ax.m90834k(e);
            C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
            amVar.copyOnWrite();
            C65031ap apVar = (C65031ap) amVar.instance;
            str.getClass();
            apVar.f176102a |= 16;
            apVar.f176107f = str;
            return l.mo27283c(k, (C65031ap) amVar.build());
        } catch (SQLiteException | IllegalStateException e2) {
            mo27288g(e2);
            throw new GellerException(C62722b.ABORTED, e2.getMessage(), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ff A[SYNTHETIC, Splitter:B:33:0x00ff] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] readAndClearKeyUsage(java.lang.String r22, java.lang.String[] r23) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "num_times_used"
            java.lang.String r2 = "timestamp_micro"
            java.lang.String r3 = "key"
            java.lang.String r4 = "data_type = ? AND "
            android.database.sqlite.SQLiteDatabase r5 = r21.mo27287e()
            r6 = 0
            if (r5 == 0) goto L_0x0163
            r5.beginTransactionNonExclusive()
            java.lang.String r7 = "IN"
            java.util.List r8 = java.util.Arrays.asList(r23)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            java.lang.String r7 = com.google.android.libraries.geller.portable.database.C21963k.m41182a(r3, r7, r8)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r8.<init>(r4)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r8.append(r7)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            java.lang.String r4 = r8.toString()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r8[r6] = r22     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            com.google.protos.f.q.b.av r9 = com.google.protos.p4985f.p5030q.p5032b.C65037av.f176123b     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r15 = r9
            com.google.protos.f.q.b.as r15 = (com.google.protos.p4985f.p5030q.p5032b.C65034as) r15     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            android.database.sqlite.SQLiteDatabase r9 = r21.mo27287e()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r13 = 0
            if (r9 == 0) goto L_0x0120
            r10 = 3
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r12[r6] = r3     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r12[r7] = r2     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r19 = 2
            r12[r19] = r0     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r10 = 1
            java.lang.String r11 = "geller_key_table"
            java.lang.String r16 = "key"
            r17 = 0
            r18 = 0
            r20 = 0
            r6 = r13
            r13 = r4
            r14 = r8
            r22 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalArgumentException -> 0x010b }
        L_0x0067:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f9 }
            long r10 = r9.getLong(r10)     // Catch:{ all -> 0x00f9 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ed
            com.google.protos.f.q.b.au r12 = com.google.protos.p4985f.p5030q.p5032b.C65036au.f176117e     // Catch:{ all -> 0x00f9 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x00f9 }
            com.google.protos.f.q.b.at r12 = (com.google.protos.p4985f.p5030q.p5032b.C65035at) r12     // Catch:{ all -> 0x00f9 }
            int r13 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r13 = r9.getString(r13)     // Catch:{ all -> 0x00f9 }
            r12.copyOnWrite()     // Catch:{ all -> 0x00f9 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ all -> 0x00f9 }
            com.google.protos.f.q.b.au r14 = (com.google.protos.p4985f.p5030q.p5032b.C65036au) r14     // Catch:{ all -> 0x00f9 }
            r13.getClass()     // Catch:{ all -> 0x00f9 }
            int r15 = r14.f176119a     // Catch:{ all -> 0x00f9 }
            r16 = 1
            r15 = r15 | 1
            r14.f176119a = r15     // Catch:{ all -> 0x00f9 }
            r14.f176120b = r13     // Catch:{ all -> 0x00f9 }
            int r13 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00f9 }
            long r13 = r9.getLong(r13)     // Catch:{ all -> 0x00f9 }
            r12.copyOnWrite()     // Catch:{ all -> 0x00f9 }
            com.google.protobuf.bv r15 = r12.instance     // Catch:{ all -> 0x00f9 }
            com.google.protos.f.q.b.au r15 = (com.google.protos.p4985f.p5030q.p5032b.C65036au) r15     // Catch:{ all -> 0x00f9 }
            int r6 = r15.f176119a     // Catch:{ all -> 0x00f9 }
            r6 = r6 | 2
            r15.f176119a = r6     // Catch:{ all -> 0x00f9 }
            r15.f176121c = r13     // Catch:{ all -> 0x00f9 }
            r12.copyOnWrite()     // Catch:{ all -> 0x00f9 }
            com.google.protobuf.bv r6 = r12.instance     // Catch:{ all -> 0x00f9 }
            com.google.protos.f.q.b.au r6 = (com.google.protos.p4985f.p5030q.p5032b.C65036au) r6     // Catch:{ all -> 0x00f9 }
            int r7 = r6.f176119a     // Catch:{ all -> 0x00f9 }
            r7 = r7 | 4
            r6.f176119a = r7     // Catch:{ all -> 0x00f9 }
            r6.f176122d = r10     // Catch:{ all -> 0x00f9 }
            com.google.protobuf.bv r6 = r12.build()     // Catch:{ all -> 0x00f9 }
            com.google.protos.f.q.b.au r6 = (com.google.protos.p4985f.p5030q.p5032b.C65036au) r6     // Catch:{ all -> 0x00f9 }
            r22.copyOnWrite()     // Catch:{ all -> 0x00f9 }
            r7 = r22
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x00eb }
            com.google.protos.f.q.b.av r10 = (com.google.protos.p4985f.p5030q.p5032b.C65037av) r10     // Catch:{ all -> 0x00eb }
            r6.getClass()     // Catch:{ all -> 0x00eb }
            com.google.protobuf.cq r11 = r10.f176125a     // Catch:{ all -> 0x00eb }
            boolean r12 = r11.mo58948c()     // Catch:{ all -> 0x00eb }
            if (r12 != 0) goto L_0x00e3
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)     // Catch:{ all -> 0x00eb }
            r10.f176125a = r11     // Catch:{ all -> 0x00eb }
        L_0x00e3:
            com.google.protobuf.cq r10 = r10.f176125a     // Catch:{ all -> 0x00eb }
            r10.add(r6)     // Catch:{ all -> 0x00eb }
            r22 = r7
            goto L_0x00ed
        L_0x00eb:
            r0 = move-exception
            goto L_0x00fc
        L_0x00ed:
            r6 = 0
            goto L_0x0067
        L_0x00f1:
            r7 = r22
            if (r9 == 0) goto L_0x0121
            r9.close()     // Catch:{ IllegalArgumentException -> 0x0109 }
            goto L_0x0121
        L_0x00f9:
            r0 = move-exception
            r7 = r22
        L_0x00fc:
            r2 = r0
            if (r9 == 0) goto L_0x0108
            r9.close()     // Catch:{ all -> 0x0103 }
            goto L_0x0108
        L_0x0103:
            r0 = move-exception
            r3 = r0
            com.google.android.libraries.geller.portable.database.C21960h.m41158a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0109 }
        L_0x0108:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            goto L_0x0111
        L_0x010b:
            r0 = move-exception
            r7 = r22
            goto L_0x0111
        L_0x010f:
            r0 = move-exception
            r7 = r15
        L_0x0111:
            com.google.common.f.e r2 = f60574f     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            java.lang.String r3 = "Column doesn't exist"
            r6 = 48079(0xbbcf, float:6.7373E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r6)).mo56386p(r3)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            goto L_0x0121
        L_0x0120:
            r7 = r15
        L_0x0121:
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            com.google.protos.f.q.b.av r0 = (com.google.protos.p4985f.p5030q.p5032b.C65037av) r0     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r2 = 0
            r1.m41170k(r4, r8, r2)     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r5.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IllegalStateException -> 0x013b, SQLiteException -> 0x0139 }
            r5.endTransaction()
            return r0
        L_0x0137:
            r0 = move-exception
            goto L_0x015f
        L_0x0139:
            r0 = move-exception
            goto L_0x013c
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            com.google.common.f.e r2 = f60574f     // Catch:{ all -> 0x0137 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0137 }
            com.google.common.f.x r2 = r2.mo56382g(r0)     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0137 }
            r3 = 48110(0xbbee, float:6.7416E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0137 }
            java.lang.String r3 = "Read and clear data usage failed"
            r2.mo56386p(r3)     // Catch:{ all -> 0x0137 }
            r1.mo27288g(r0)     // Catch:{ all -> 0x0137 }
            r5.endTransaction()
            goto L_0x0163
        L_0x015f:
            r5.endTransaction()
            throw r0
        L_0x0163:
            r2 = 0
            byte[] r0 = new byte[r2]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21962j.readAndClearKeyUsage(java.lang.String, java.lang.String[]):byte[]");
    }

    public final long readDataUsage(String str, String str2, long j) {
        Cursor rawQuery;
        try {
            String[] strArr = {str, str2, String.valueOf(j)};
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase e = mo27287e();
            if (e != null) {
                rawQuery = e.rawQuery(String.format("SELECT SUM(%s) AS num_times_used FROM (SELECT DISTINCT %s FROM %s WHERE %s) distinct_data_ids INNER JOIN %s on %s = %s", new Object[]{"geller_key_table.num_times_used", "data_id", "geller_key_table", "data_type = ? AND key = ? AND timestamp_micro = ?", "geller_key_table", "distinct_data_ids.data_id", "geller_key_table.data_id"}), strArr);
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("num_times_used");
                while (rawQuery.moveToNext()) {
                    arrayList.add(Long.valueOf(rawQuery.getLong(columnIndexOrThrow)));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            }
            if (arrayList.size() == 1) {
                return ((Long) arrayList.get(0)).longValue();
            }
            return -1;
        } catch (SQLiteException | IllegalStateException e2) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48069)).mo56386p("Read data usage failed");
            mo27288g(e2);
            return -1;
        } catch (Throwable th) {
            C21960h.m41158a(th, th);
        }
        throw th;
    }

    public final String[] readKeys(String str) {
        SQLiteDatabase e = mo27287e();
        if (e != null) {
            try {
                return m41171l(str).mo27284d(C58833ax.m90834k(e), str);
            } catch (SQLiteException | IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48113)).mo56386p("Read keys failed");
                mo27288g(e2);
            }
        }
        return new String[0];
    }

    public final String[] readMetadata(String str, String str2) {
        SQLiteDatabase e = mo27287e();
        if (e != null) {
            try {
                String[] strArr = {str, str2};
                C58836b bVar = C58836b.f156633a;
                return (String[]) C21963k.m41183b(e, "geller_metadata_table", "metadata", "data_type = ? AND key = ?", strArr, bVar, bVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48115)).mo56386p("Read metadata failed");
                mo27288g(e2);
            }
        }
        return new String[0];
    }

    public final byte[][] readOutdatedData(String str) {
        boolean equals = ((C58759qy) f60554a).f156534a.equals(str);
        String str2 = "data_type = ? AND timestamp_micro >= 0" + " AND " + "delete_status" + " = ?";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add("DELETION_PROCESSED");
        try {
            if (m41172m(str)) {
                arrayList.add("DELETION_SYNCED");
                str2 = (str2 + " AND (( " + "deletion_sync_status" + " = ? )") + " OR ( " + "deletion_sync_status" + " IS NULL AND " + "sync_status" + " IS NULL ))";
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            SQLiteDatabase e = mo27287e();
            if (e != null) {
                if (!equals) {
                    return C21959g.m41145g(e, this.f60576h, str2, strArr);
                }
                try {
                    return C21964l.m41189h(e, str2, strArr, C58836b.f156633a);
                } catch (SQLiteException | IllegalStateException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48121)).mo56386p("Read outdated data failed.");
                    mo27288g(e2);
                }
            }
            return new byte[0][];
        } catch (IllegalStateException e3) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56226d()).mo56382g(e3)).mo56372aa(48122)).mo56389s("There was an error determining whether corpus %s supports upload.", str);
            return new byte[0][];
        }
    }

    public final long softDelete(String str, C65071r rVar) {
        long j;
        C65068o oVar;
        C65068o oVar2;
        C65070q qVar;
        C65070q qVar2;
        C65070q qVar3;
        C65066m mVar;
        SQLiteDatabase e = mo27287e();
        long j2 = 0;
        if (e == null) {
            ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48075)).mo56386p("The Geller SQLiteDatabase is null, skipping soft-deletion.");
            return 0;
        }
        C59052c cVar = (C59052c) f60574f.mo56224b();
        cVar.mo56374ac(1, TimeUnit.SECONDS);
        ((C59052c) cVar.mo56372aa(48073)).mo56389s("soft deleting data for %s", str);
        boolean equals = ((C58759qy) f60554a).f156534a.equals(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C21957e l = m41171l(str);
        try {
            e.beginTransactionNonExclusive();
            int i = rVar.f176211b;
            if (i == 1) {
                C58833ax k = C58833ax.m90834k(e);
                C65078y yVar = (C65078y) C65019ad.f176072c.createBuilder();
                C65079z zVar = (C65079z) C65016aa.f176065b.createBuilder();
                if (rVar.f176211b == 1) {
                    mVar = (C65066m) rVar.f176212c;
                } else {
                    mVar = C65066m.f176197b;
                }
                zVar.mo59336a(mVar.f176199a);
                C65016aa aaVar = (C65016aa) zVar.build();
                yVar.copyOnWrite();
                C65019ad adVar = (C65019ad) yVar.instance;
                aaVar.getClass();
                adVar.f176075b = aaVar;
                adVar.f176074a = 1;
                C58836b bVar = C58836b.f156633a;
                j = l.mo27285e(k, str, (C65019ad) yVar.build(), bVar, bVar, C58833ax.m90834k(new C21954b(false)));
            } else if (i == 2) {
                if (((C65070q) rVar.f176212c).f176206a.size() == 0) {
                    if (rVar.f176211b == 2) {
                        qVar3 = (C65070q) rVar.f176212c;
                    } else {
                        qVar3 = C65070q.f176204c;
                    }
                    if (qVar3.f176207b.size() == 0) {
                        m41169j("data_type = ?", (String[]) arrayList.toArray(new String[0]));
                    }
                }
                C58833ax k2 = C58833ax.m90834k(e);
                C65078y yVar2 = (C65078y) C65019ad.f176072c.createBuilder();
                C65017ab abVar = (C65017ab) C65018ac.f176068c.createBuilder();
                if (rVar.f176211b == 2) {
                    qVar = (C65070q) rVar.f176212c;
                } else {
                    qVar = C65070q.f176204c;
                }
                abVar.mo59332b(qVar.f176206a);
                if (rVar.f176211b == 2) {
                    qVar2 = (C65070q) rVar.f176212c;
                } else {
                    qVar2 = C65070q.f176204c;
                }
                abVar.mo59331a(qVar2.f176207b);
                C65018ac acVar = (C65018ac) abVar.build();
                yVar2.copyOnWrite();
                C65019ad adVar2 = (C65019ad) yVar2.instance;
                acVar.getClass();
                adVar2.f176075b = acVar;
                adVar2.f176074a = 2;
                C58836b bVar2 = C58836b.f156633a;
                j = l.mo27285e(k2, str, (C65019ad) yVar2.build(), bVar2, bVar2, C58833ax.m90834k(new C21954b(false)));
            } else {
                if (i == 6) {
                    oVar = (C65068o) rVar.f176212c;
                } else {
                    oVar = C65068o.f176200c;
                }
                if ((oVar.f176202a & 1) != 0) {
                    String str2 = "data_type = ?" + " AND " + m41174o(str) + " like ?";
                    if (rVar.f176211b == 6) {
                        oVar2 = (C65068o) rVar.f176212c;
                    } else {
                        oVar2 = C65068o.f176200c;
                    }
                    arrayList.add(oVar2.f176203b + "%");
                    if (equals) {
                        j = C21964l.m41190i(e, str2, (String[]) arrayList.toArray(new String[0]), 1);
                    } else {
                        j = m41173n(str2, (String[]) arrayList.toArray(new String[0]), 1);
                    }
                }
                e.setTransactionSuccessful();
                e.endTransaction();
                return j2;
            }
            j2 = j;
            e.setTransactionSuccessful();
        } catch (SQLiteException | IllegalStateException e2) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48074)).mo56386p("Soft-deletion failed.");
            mo27288g(e2);
        } catch (Throwable th) {
            e.endTransaction();
            throw th;
        }
        e.endTransaction();
        return j2;
    }

    public final boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr) {
        int length = strArr.length;
        if (length == 0) {
            ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48103)).mo56386p("Unable to write data: empty key list");
            return false;
        }
        C59071e eVar = f60574f;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56374ac(1, TimeUnit.SECONDS);
        ((C59052c) cVar.mo56372aa(48099)).mo56360M("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        Arrays.toString(strArr);
        SQLiteDatabase e = mo27287e();
        if (e == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(48102)).mo56386p("Writing to geller db is null");
            return false;
        }
        try {
            return m41171l(str).mo27286f(C58833ax.m90834k(e), str, strArr, j, z, bArr);
        } catch (SQLiteException e2) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48101)).mo56386p("Failed to write data");
            mo27288g(e2);
            return false;
        }
    }

    public final boolean writeMetadata(String str, String str2, String str3) {
        ((C59052c) ((C59052c) f60574f.mo56224b()).mo56372aa(48104)).mo56354G("Writing metadata key: %s, corpus: %s", str2, str);
        SQLiteDatabase e = mo27287e();
        if (e != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_type", str);
                contentValues.put("key", str2);
                contentValues.put("metadata", str3);
                if (e.insertOrThrow("geller_metadata_table", (String) null, contentValues) >= 0) {
                    return true;
                }
                return false;
            } catch (SQLiteException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48105)).mo56386p("Failed to write metadata");
                mo27288g(e2);
            }
        }
        return false;
    }

    public final byte[] getSnapshot(String[] strArr, int i) {
        String[] strArr2 = strArr;
        int i2 = i;
        boolean z = true;
        char c = i2 != 0 ? i2 != 1 ? (char) 0 : 2 : 1;
        if (c == 0 || c != 2) {
            ((C59052c) ((C59052c) f60574f.mo56225c()).mo56372aa(48107)).mo56386p("Invalid geller snapshot reason.");
            return new byte[0];
        }
        Arrays.toString(strArr);
        C65043ba baVar = (C65043ba) C65044bb.f176144b.createBuilder();
        SQLiteDatabase e = mo27287e();
        if (e != null) {
            e.beginTransactionNonExclusive();
            try {
                int length = strArr2.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArr2[i3];
                    if (m41172m(str)) {
                        C65040ay ayVar = (C65040ay) C65041az.f176130f.createBuilder();
                        ayVar.copyOnWrite();
                        C65041az azVar = (C65041az) ayVar.instance;
                        str.getClass();
                        azVar.f176132a = azVar.f176132a | z ? 1 : 0;
                        azVar.f176133b = str;
                        C65053bk bkVar = (C65053bk) C65055bm.f176168d.createBuilder();
                        bkVar.copyOnWrite();
                        C65055bm bmVar = (C65055bm) bkVar.instance;
                        bmVar.f176171b = z ? 1 : 0;
                        bmVar.f176170a = bmVar.f176170a | z ? 1 : 0;
                        C21957e l = m41171l(str);
                        C58833ax k = C58833ax.m90834k(e);
                        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
                        amVar.copyOnWrite();
                        C65031ap apVar = (C65031ap) amVar.instance;
                        str.getClass();
                        apVar.f176102a |= 16;
                        apVar.f176107f = str;
                        amVar.copyOnWrite();
                        C65031ap apVar2 = (C65031ap) amVar.instance;
                        apVar2.f176102a |= 32;
                        apVar2.f176108g = z;
                        amVar.copyOnWrite();
                        C65031ap apVar3 = (C65031ap) amVar.instance;
                        apVar3.f176102a |= 64;
                        apVar3.f176109h = z;
                        amVar.copyOnWrite();
                        C65031ap apVar4 = (C65031ap) amVar.instance;
                        apVar4.f176102a |= 128;
                        apVar4.f176110i = false;
                        for (byte[] A : l.mo27283c(k, (C65031ap) amVar.build())) {
                            bkVar.mo59334a(C63088z.m96139A(A));
                        }
                        C65053bk bkVar2 = (C65053bk) C65055bm.f176168d.createBuilder();
                        bkVar2.copyOnWrite();
                        C65055bm bmVar2 = (C65055bm) bkVar2.instance;
                        bmVar2.f176171b = 4;
                        bmVar2.f176170a = bmVar2.f176170a | z ? 1 : 0;
                        C21957e l2 = m41171l(str);
                        C58833ax k2 = C58833ax.m90834k(e);
                        C65028am amVar2 = (C65028am) C65031ap.f176100j.createBuilder();
                        amVar2.copyOnWrite();
                        C65031ap apVar5 = (C65031ap) amVar2.instance;
                        str.getClass();
                        apVar5.f176102a |= 16;
                        apVar5.f176107f = str;
                        amVar2.copyOnWrite();
                        C65031ap apVar6 = (C65031ap) amVar2.instance;
                        apVar6.f176102a |= 32;
                        apVar6.f176108g = false;
                        amVar2.copyOnWrite();
                        C65031ap apVar7 = (C65031ap) amVar2.instance;
                        apVar7.f176102a |= 64;
                        apVar7.f176109h = false;
                        for (byte[] A2 : l2.mo27283c(k2, (C65031ap) amVar2.build())) {
                            bkVar2.mo59334a(C63088z.m96139A(A2));
                        }
                        if (!Collections.unmodifiableList(((C65055bm) bkVar.instance).f176172c).isEmpty() || !Collections.unmodifiableList(((C65055bm) bkVar2.instance).f176172c).isEmpty()) {
                            ayVar.mo59333a(bkVar);
                            ayVar.mo59333a(bkVar2);
                            String[] readMetadata = readMetadata(str, "_version_info");
                            if (readMetadata.length > 0) {
                                String str2 = readMetadata[0];
                                ayVar.copyOnWrite();
                                C65041az azVar2 = (C65041az) ayVar.instance;
                                str2.getClass();
                                azVar2.f176132a |= 2;
                                azVar2.f176135d = str2;
                            }
                            String[] readMetadata2 = readMetadata(str, "_sync_token");
                            if (readMetadata2.length > 0) {
                                String str3 = readMetadata2[0];
                                ayVar.copyOnWrite();
                                C65041az azVar3 = (C65041az) ayVar.instance;
                                str3.getClass();
                                azVar3.f176132a |= 4;
                                azVar3.f176136e = str3;
                            }
                            baVar.copyOnWrite();
                            C65044bb bbVar = (C65044bb) baVar.instance;
                            C65041az azVar4 = (C65041az) ayVar.build();
                            azVar4.getClass();
                            C62971cq cqVar = bbVar.f176146a;
                            if (!cqVar.mo58948c()) {
                                bbVar.f176146a = C62942bv.mutableCopy(cqVar);
                            }
                            bbVar.f176146a.add(azVar4);
                            i3++;
                            z = true;
                        }
                    }
                    i3++;
                    z = true;
                }
                e.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48109)).mo56386p("Get snapshot failed.");
                mo27288g(e2);
            } catch (Throwable th) {
                e.endTransaction();
                throw th;
            }
            e.endTransaction();
        }
        return ((C65044bb) baVar.build()).toByteArray();
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f60575g) {
            this.f60585q = i2;
            mo27289h(sQLiteDatabase);
            return;
        }
        throw new SQLiteException("Cannot downgrade Geller database with readonly enabled");
    }

    public final byte[] write(byte[] bArr) {
        try {
            C65050bh bhVar = (C65050bh) C62942bv.parseFrom((C62942bv) C65050bh.f176158b, bArr, C62921ba.m95368a());
            HashSet hashSet = new HashSet();
            for (C65049bg bgVar : bhVar.f176160a) {
                C65753ak b = C65753ak.m96797b(bgVar.f176151a);
                if (b == null) {
                    b = C65753ak.UNKNOWN;
                }
                hashSet.add(b);
            }
            ((C59052c) ((C59052c) f60574f.mo56224b()).mo56372aa(48111)).mo56389s("Writing data for these Geller corpora: %s", TextUtils.join(",", hashSet));
            C65051bi biVar = (C65051bi) C65052bj.f176162d.createBuilder();
            int i = 0;
            for (C65049bg bgVar2 : bhVar.f176160a) {
                List list = bgVar2.f176152b;
                if (list.isEmpty()) {
                    list = C58485gu.m89846n(BuildConfig.FLAVOR);
                }
                C65753ak b2 = C65753ak.m96797b(bgVar2.f176151a);
                if (b2 == null) {
                    b2 = C65753ak.UNKNOWN;
                }
                String name = b2.name();
                String[] strArr = (String[]) list.toArray(new String[0]);
                long j = bgVar2.f176153c;
                boolean z = bgVar2.f176154d;
                C65768az azVar = bgVar2.f176155e;
                if (azVar == null) {
                    azVar = C65768az.f178793f;
                }
                byte[] byteArray = azVar.toByteArray();
                int length = strArr.length;
                if (length == 0) {
                    ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48103)).mo56386p("Unable to write data: empty key list");
                } else {
                    C59071e eVar = f60574f;
                    C59052c cVar = (C59052c) eVar.mo56224b();
                    cVar.mo56374ac(1, TimeUnit.SECONDS);
                    boolean z2 = z;
                    long j2 = j;
                    ((C59052c) cVar.mo56372aa(48099)).mo56360M("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(byteArray.length), Integer.valueOf(length), name, Long.valueOf(j));
                    Arrays.toString(strArr);
                    SQLiteDatabase e = mo27287e();
                    if (e == null) {
                        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(48102)).mo56386p("Writing to geller db is null");
                    } else {
                        try {
                            if (m41171l(name).mo27286f(C58833ax.m90834k(e), name, strArr, j2, z2, byteArray)) {
                                i++;
                                biVar.copyOnWrite();
                                C65052bj bjVar = (C65052bj) biVar.instance;
                                C62971cq cqVar = bjVar.f176165b;
                                if (!cqVar.mo58948c()) {
                                    bjVar.f176165b = C62942bv.mutableCopy(cqVar);
                                }
                                C62947c.addAll((Iterable) list, (List) bjVar.f176165b);
                            }
                        } catch (SQLiteException e2) {
                            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48101)).mo56386p("Failed to write data");
                            mo27288g(e2);
                        }
                    }
                }
            }
            biVar.copyOnWrite();
            C65052bj bjVar2 = (C65052bj) biVar.instance;
            bjVar2.f176164a |= 1;
            bjVar2.f176166c = (long) i;
            return ((C65052bj) biVar.build()).toByteArray();
        } catch (C62974ct e3) {
            mo27288g(e3);
            throw new GellerException(C62722b.ABORTED, e3.getMessage(), e3);
        }
    }

    public final byte[][] read(String str, byte[] bArr) {
        try {
            C65031ap apVar = (C65031ap) C62942bv.parseFrom((C62942bv) C65031ap.f176100j, bArr, C62921ba.m95368a());
            SQLiteDatabase e = mo27287e();
            if (e == null) {
                return new byte[0][];
            }
            C65028am amVar = (C65028am) apVar.toBuilder();
            amVar.copyOnWrite();
            C65031ap apVar2 = (C65031ap) amVar.instance;
            str.getClass();
            apVar2.f176102a |= 16;
            apVar2.f176107f = str;
            if ((apVar.f176102a & 64) == 0) {
                amVar.copyOnWrite();
                C65031ap apVar3 = (C65031ap) amVar.instance;
                apVar3.f176102a |= 64;
                apVar3.f176109h = false;
            }
            try {
                return m41171l(str).mo27283c(C58833ax.m90834k(e), (C65031ap) amVar.build());
            } catch (SQLiteException | IllegalStateException e2) {
                mo27288g(e2);
                throw new GellerException(C62722b.ABORTED, e2.getMessage(), e2);
            }
        } catch (C62974ct e3) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e3)).mo56372aa(48117)).mo56386p("Failed to parse GellerReadParams bytes");
            SQLiteDatabase e4 = mo27287e();
            if (e4 == null) {
                return new byte[0][];
            }
            try {
                C21957e l = m41171l(str);
                C58833ax k = C58833ax.m90834k(e4);
                C65028am amVar2 = (C65028am) C65031ap.f176100j.createBuilder();
                amVar2.copyOnWrite();
                C65031ap apVar4 = (C65031ap) amVar2.instance;
                str.getClass();
                apVar4.f176102a |= 16;
                apVar4.f176107f = str;
                return l.mo27283c(k, (C65031ap) amVar2.build());
            } catch (SQLiteException | IllegalStateException e5) {
                mo27288g(e5);
                throw new GellerException(C62722b.ABORTED, e5.getMessage(), e5);
            }
        }
    }

    public final long delete(String str, byte[] bArr) {
        C65070q qVar;
        try {
            C65071r rVar = (C65071r) C62942bv.parseFrom((C62942bv) C65071r.f176208e, bArr, C62921ba.m95368a());
            C59071e eVar = f60574f;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(48060)).mo56389s("Deleting with GellerDeleteParams:\n %s", rVar);
            SQLiteDatabase e = mo27287e();
            if (e == null) {
                ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(48062)).mo56386p("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0;
            }
            String[] strArr = {str};
            try {
                e.beginTransactionNonExclusive();
                if (rVar.f176211b == 2 && ((C65070q) rVar.f176212c).f176206a.size() == 0) {
                    if (rVar.f176211b == 2) {
                        qVar = (C65070q) rVar.f176212c;
                    } else {
                        qVar = C65070q.f176204c;
                    }
                    if (qVar.f176207b.size() == 0) {
                        m41169j("data_type = ?", strArr);
                    }
                }
                C21957e l = m41171l(str);
                C58833ax k = C58833ax.m90834k(e);
                String str2 = this.f60584p;
                C65064k kVar = (C65064k) rVar.toBuilder();
                kVar.copyOnWrite();
                C65071r rVar2 = (C65071r) kVar.instance;
                str.getClass();
                rVar2.f176210a = 1 | rVar2.f176210a;
                rVar2.f176213d = str;
                long a = l.mo27281a(k, str2, (C65071r) kVar.build());
                e.setTransactionSuccessful();
                return a;
            } catch (SQLiteException | IllegalStateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48061)).mo56386p("Delete failed");
                mo27288g(e2);
                return 0;
            } finally {
                e.endTransaction();
            }
        } catch (C62974ct e3) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e3)).mo56372aa(48063)).mo56386p("Failed to parse GellerDeleteParams.");
            return 0;
        }
    }

    public final byte[] getCorpusStats(String[] strArr) {
        HashMap hashMap = new HashMap();
        if (r1 == 0) {
            hashMap.put(this.f60579k, new HashSet());
            hashMap.put(this.f60578j, new HashSet());
            if (this.f60582n.mo56113h()) {
                hashMap.put((C21957e) this.f60582n.mo56107c(), new HashSet());
            }
            if (this.f60582n.mo56113h()) {
                hashMap.put((C21957e) this.f60582n.mo56107c(), new HashSet());
            }
            if (this.f60581m.mo56113h()) {
                hashMap.put((C21957e) this.f60581m.mo56107c(), new HashSet());
            }
            if (this.f60583o.mo56113h()) {
                hashMap.put((C21957e) this.f60583o.mo56107c(), new HashSet());
            }
        } else {
            for (String str : strArr) {
                C21957e l = m41171l(str);
                if (!hashMap.containsKey(l)) {
                    hashMap.put(l, new HashSet());
                }
                ((Set) hashMap.get(l)).add(str);
            }
        }
        C65062i iVar = (C65062i) C65063j.f176192d.createBuilder();
        C58833ax k = C58833ax.m90834k(mo27287e());
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                for (C65061h a : ((C21957e) entry.getKey()).mo27282b(k, (Set) entry.getValue()).f176195b) {
                    iVar.mo59335a(a);
                }
            }
            return ((C65063j) iVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e)).mo56372aa(48106)).mo56386p("GetCorpusStats failed");
            mo27288g(e);
            return new byte[0];
        }
    }

    public final long softDelete(String str, byte[] bArr) {
        long j;
        C65068o oVar;
        C65068o oVar2;
        C65070q qVar;
        C65070q qVar2;
        C65070q qVar3;
        C65066m mVar;
        long j2 = 0;
        try {
            C65071r rVar = (C65071r) C62942bv.parseFrom((C62942bv) C65071r.f176208e, bArr, C62921ba.m95368a());
            SQLiteDatabase e = mo27287e();
            if (e == null) {
                ((C59052c) ((C59052c) f60574f.mo56226d()).mo56372aa(48075)).mo56386p("The Geller SQLiteDatabase is null, skipping soft-deletion.");
            } else {
                C59052c cVar = (C59052c) f60574f.mo56224b();
                cVar.mo56374ac(1, TimeUnit.SECONDS);
                ((C59052c) cVar.mo56372aa(48073)).mo56389s("soft deleting data for %s", str);
                boolean equals = ((C58759qy) f60554a).f156534a.equals(str);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                C21957e l = m41171l(str);
                try {
                    e.beginTransactionNonExclusive();
                    int i = rVar.f176211b;
                    if (i == 1) {
                        C58833ax k = C58833ax.m90834k(e);
                        C65078y yVar = (C65078y) C65019ad.f176072c.createBuilder();
                        C65079z zVar = (C65079z) C65016aa.f176065b.createBuilder();
                        if (rVar.f176211b == 1) {
                            mVar = (C65066m) rVar.f176212c;
                        } else {
                            mVar = C65066m.f176197b;
                        }
                        zVar.mo59336a(mVar.f176199a);
                        C65016aa aaVar = (C65016aa) zVar.build();
                        yVar.copyOnWrite();
                        C65019ad adVar = (C65019ad) yVar.instance;
                        aaVar.getClass();
                        adVar.f176075b = aaVar;
                        adVar.f176074a = 1;
                        C58836b bVar = C58836b.f156633a;
                        j = l.mo27285e(k, str, (C65019ad) yVar.build(), bVar, bVar, C58833ax.m90834k(new C21954b(false)));
                    } else if (i == 2) {
                        if (((C65070q) rVar.f176212c).f176206a.size() == 0) {
                            if (rVar.f176211b == 2) {
                                qVar3 = (C65070q) rVar.f176212c;
                            } else {
                                qVar3 = C65070q.f176204c;
                            }
                            if (qVar3.f176207b.size() == 0) {
                                m41169j("data_type = ?", (String[]) arrayList.toArray(new String[0]));
                            }
                        }
                        C58833ax k2 = C58833ax.m90834k(e);
                        C65078y yVar2 = (C65078y) C65019ad.f176072c.createBuilder();
                        C65017ab abVar = (C65017ab) C65018ac.f176068c.createBuilder();
                        if (rVar.f176211b == 2) {
                            qVar = (C65070q) rVar.f176212c;
                        } else {
                            qVar = C65070q.f176204c;
                        }
                        abVar.mo59332b(qVar.f176206a);
                        if (rVar.f176211b == 2) {
                            qVar2 = (C65070q) rVar.f176212c;
                        } else {
                            qVar2 = C65070q.f176204c;
                        }
                        abVar.mo59331a(qVar2.f176207b);
                        C65018ac acVar = (C65018ac) abVar.build();
                        yVar2.copyOnWrite();
                        C65019ad adVar2 = (C65019ad) yVar2.instance;
                        acVar.getClass();
                        adVar2.f176075b = acVar;
                        adVar2.f176074a = 2;
                        C58836b bVar2 = C58836b.f156633a;
                        j = l.mo27285e(k2, str, (C65019ad) yVar2.build(), bVar2, bVar2, C58833ax.m90834k(new C21954b(false)));
                    } else {
                        if (i == 6) {
                            oVar = (C65068o) rVar.f176212c;
                        } else {
                            oVar = C65068o.f176200c;
                        }
                        if ((oVar.f176202a & 1) != 0) {
                            String str2 = "data_type = ?" + " AND " + m41174o(str) + " like ?";
                            if (rVar.f176211b == 6) {
                                oVar2 = (C65068o) rVar.f176212c;
                            } else {
                                oVar2 = C65068o.f176200c;
                            }
                            arrayList.add(oVar2.f176203b + "%");
                            if (equals) {
                                j = C21964l.m41190i(e, str2, (String[]) arrayList.toArray(new String[0]), 1);
                            } else {
                                j = m41173n(str2, (String[]) arrayList.toArray(new String[0]), 1);
                            }
                        }
                        e.setTransactionSuccessful();
                        e.endTransaction();
                    }
                    j2 = j;
                    e.setTransactionSuccessful();
                } catch (SQLiteException | IllegalStateException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e2)).mo56372aa(48074)).mo56386p("Soft-deletion failed.");
                    mo27288g(e2);
                } catch (Throwable th) {
                    e.endTransaction();
                    throw th;
                }
                e.endTransaction();
            }
            return j2;
        } catch (C62974ct e3) {
            ((C59052c) ((C59052c) ((C59052c) f60574f.mo56225c()).mo56382g(e3)).mo56372aa(48076)).mo56386p("Failed to parse GellerDeleteParams.");
            return 0;
        }
    }
}
