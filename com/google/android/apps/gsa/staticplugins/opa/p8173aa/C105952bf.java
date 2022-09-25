package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import android.accounts.Account;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108290dg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108291dh;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.bf */
/* compiled from: PG */
public final class C105952bf implements C90991b {

    /* renamed from: a */
    public static final C59071e f295801a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.aa.bf");

    /* renamed from: p */
    private static final String f295802p = String.format("SELECT %1$s, %2$s, %3$s, %4$s, %5$s, entries.id AS id FROM entries JOIN turns ON entries.turn_id = turns.id WHERE %4$s = ? AND %5$s <= ? ORDER BY id DESC", new Object[]{"entry", "turn_id", "event_id", "account_id", "timestamp"});

    /* renamed from: q */
    private static final String f295803q = String.format("SELECT %1$s, %2$s FROM suggests JOIN turns ON suggests.turn_id = turns.id WHERE suggests.account_id = ? LIMIT 1", new Object[]{"entry", "event_id"});

    /* renamed from: r */
    private static final String f295804r = String.format("SELECT %1$s FROM %2$s where id = ?", new Object[]{"entry", "entries"});

    /* renamed from: s */
    private static final String f295805s = String.format("SELECT %1$s FROM %2$s WHERE %3$s = ?", new Object[]{"entry", "webanswerattribs", "account_id"});

    /* renamed from: b */
    public final C22871g f295806b;

    /* renamed from: c */
    public final C22871g f295807c;

    /* renamed from: d */
    public final C22871g f295808d;

    /* renamed from: e */
    public final C21370a f295809e;

    /* renamed from: f */
    public final C107698i f295810f;

    /* renamed from: g */
    SQLiteDatabase f295811g;

    /* renamed from: h */
    Cursor f295812h;

    /* renamed from: i */
    public long f295813i;

    /* renamed from: j */
    Account f295814j;

    /* renamed from: k */
    String f295815k;

    /* renamed from: l */
    public volatile int f295816l = 0;

    /* renamed from: m */
    public C105930ak f295817m;

    /* renamed from: n */
    public volatile C105930ak f295818n;

    /* renamed from: o */
    public C108291dh f295819o;

    /* renamed from: t */
    private final SQLiteOpenHelper f295820t;

    /* renamed from: u */
    private final C86124t f295821u;

    /* renamed from: v */
    private final C89911f f295822v;

    /* renamed from: w */
    private long f295823w;

    /* renamed from: x */
    private C60870cx f295824x;

    public C105952bf(C107698i iVar, C105949bc bcVar, C22871g gVar, C22871g gVar2, C90821bm bmVar, C86054o oVar, C21370a aVar, C86124t tVar, C89911f fVar) {
        this.f295810f = iVar;
        this.f295820t = bcVar;
        this.f295806b = gVar;
        this.f295807c = gVar2;
        this.f295808d = bmVar.mo85163a(C105951be.class);
        this.f295809e = aVar;
        this.f295821u = tVar;
        this.f295822v = fVar;
        if (oVar.mo79668a() != null) {
            Account a = oVar.mo79668a();
            a.getClass();
            this.f295814j = a;
        } else {
            C59104x d = f295801a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d).mo56372aa(24546)).mo56386p("No signed-in account.");
        }
        this.f295815k = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0058 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String m176509o(android.accounts.Account r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x008c }
            android.database.sqlite.SQLiteDatabase r0 = r12.f295811g     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r13 != 0) goto L_0x000d
            goto L_0x008a
        L_0x000d:
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x008c }
            android.database.sqlite.SQLiteDatabase r0 = r12.f295811g     // Catch:{ all -> 0x008c }
            r0.getClass()
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "id"
            r11 = 0
            r4[r11] = r3     // Catch:{ all -> 0x008c }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x008c }
            r6[r11] = r13     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "accounts"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "1"
            r2 = r0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x008c }
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0085 }
            r4 = -1
            if (r3 == 0) goto L_0x003b
            long r6 = r2.getLong(r11)     // Catch:{ all -> 0x0085 }
            goto L_0x003c
        L_0x003b:
            r6 = r4
        L_0x003c:
            r2.close()     // Catch:{ all -> 0x008c }
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0077
        L_0x0043:
            r2 = 3
            if (r11 >= r2) goto L_0x005e
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x008c }
            r2.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "name"
            r2.put(r3, r13)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "accounts"
            long r2 = r0.insertOrThrow(r3, r1, r2)     // Catch:{ SQLiteFullException -> 0x0058 }
            r6 = r2
            goto L_0x005f
        L_0x0058:
            r12.m176515u()     // Catch:{ all -> 0x008c }
            int r11 = r11 + 1
            goto L_0x0043
        L_0x005e:
            r6 = r4
        L_0x005f:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0077
            com.google.common.f.e r13 = f295801a     // Catch:{ all -> 0x008c }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x008c }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "HistoryStore"
            r13.mo56378ag(r0, r2)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "#findOrCreateAccountId: unable to create accountId after %d tries"
            r2 = 24539(0x5fdb, float:3.4386E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56387q(r0, r11)     // Catch:{ all -> 0x008c }
        L_0x0077:
            r2 = 0
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x0083
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008c }
            monitor-exit(r12)
            return r13
        L_0x0083:
            monitor-exit(r12)
            return r1
        L_0x0085:
            r13 = move-exception
            r2.close()     // Catch:{ all -> 0x008c }
            throw r13     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r12)
            return r1
        L_0x008c:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x0090
        L_0x008f:
            throw r13
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.m176509o(android.accounts.Account):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: p */
    private final synchronized void m176510p() {
        int a = (int) this.f295821u.mo79743a(C90014bt.f247348fU);
        if (a > 0) {
            long b = this.f295809e.mo26870b() - TimeUnit.DAYS.toMillis((long) a);
            SQLiteDatabase sQLiteDatabase = this.f295811g;
            sQLiteDatabase.getClass();
            Cursor query = sQLiteDatabase.query("turns", new String[]{"id"}, "timestamp <= ?", new String[]{String.valueOf(b)}, (String) null, (String) null, "id DESC", "1");
            if (query.moveToFirst()) {
                try {
                    String[] strArr = {String.valueOf(query.getLong(0))};
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.delete("entries", "turn_id <= ?", strArr);
                    sQLiteDatabase.delete("suggests", "turn_id <= ?", strArr);
                    sQLiteDatabase.delete("turns", "id <= ?", strArr);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    C58976aa aaVar = C58975e.f156826a;
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            query.close();
        }
    }

    /* renamed from: q */
    private final synchronized void m176511q() {
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase == null) {
            C59104x d = f295801a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d).mo56372aa(24558)).mo56386p("#loadLastWebAnswerAttribution: failed due to uninitialized database!");
            return;
        }
        String str = this.f295815k;
        if (str == null) {
            C59104x d2 = f295801a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d2).mo56372aa(24557)).mo56386p("#loadLastWebAnswerAttribution: no account!");
            return;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(f295805s, new String[]{str});
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    C105930ak akVar = (C105930ak) C62942bv.parseFrom((C62942bv) C105930ak.f295754i, rawQuery.getBlob(0), C62921ba.m95368a());
                    if (akVar.f295757b == 14) {
                        this.f295818n = akVar;
                    }
                }
            } catch (C62974ct e) {
                try {
                    C59104x d3 = f295801a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "HistoryStore");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(24556)).mo56386p("#loadLastWebAnswerAttribution: unable to load suggestions.");
                    return;
                } finally {
                    rawQuery.close();
                }
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
    }

    /* renamed from: r */
    private final synchronized void m176512r() {
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase == null) {
            C59104x d = f295801a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d).mo56372aa(24561)).mo56386p("#loadSuggestions: failed due to uninitialized database!");
            return;
        }
        String str = this.f295815k;
        if (str == null) {
            C59104x d2 = f295801a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d2).mo56372aa(24560)).mo56386p("#loadSuggestions: no account!");
            return;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(f295803q, new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                C105930ak akVar = (C105930ak) C62942bv.parseFrom((C62942bv) C105930ak.f295754i, rawQuery.getBlob(0), C62921ba.m95368a());
                this.f295817m = akVar;
                if (akVar.f295757b == 7) {
                    String string = rawQuery.getString(1);
                    if (string != null) {
                        C105930ak akVar2 = this.f295817m;
                        akVar2.getClass();
                        C105958h hVar = (C105958h) akVar2.toBuilder();
                        hVar.copyOnWrite();
                        C105930ak akVar3 = (C105930ak) hVar.instance;
                        akVar3.f295756a |= C89885b.S3REQUEST_VALUE;
                        akVar3.f295760e = string;
                        this.f295817m = (C105930ak) hVar.build();
                    }
                } else {
                    this.f295817m = null;
                }
            }
            rawQuery.close();
        } catch (C62974ct e) {
            try {
                C59104x d3 = f295801a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "HistoryStore");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(24559)).mo56386p("#loadSuggestions: unable to load suggestions.");
            } finally {
                rawQuery.close();
            }
        }
    }

    /* renamed from: s */
    private final synchronized void m176513s() {
        C108291dh dhVar;
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase == null) {
            C59104x d = f295801a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d).mo56372aa(24568)).mo56386p("#updateCursor: failed due to uninitialized database!");
            return;
        }
        if (this.f295815k == null) {
            String o = m176509o(this.f295814j);
            this.f295815k = o;
            if (o == null) {
                C59104x d2 = f295801a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "HistoryStore");
                ((C59052c) ((C59052c) d2).mo56372aa(24567)).mo56389s("#updateCursor: unable to find or create account id for %s", this.f295814j);
                return;
            }
        }
        Cursor cursor = this.f295812h;
        if (cursor != null) {
            cursor.close();
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(f295802p, new String[]{this.f295815k, String.valueOf(this.f295813i)});
        this.f295812h = rawQuery;
        int count = rawQuery.getCount();
        if (!(this.f295816l == count || (dhVar = this.f295819o) == null)) {
            dhVar.f301249a.f301272c.mo28212l("HistoryManager:DataChanged", new C108290dg(dhVar, count));
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f295816l = count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r15 == false) goto L_0x0080;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m176514t(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x00cb }
            android.database.sqlite.SQLiteDatabase r9 = r13.f295811g     // Catch:{ all -> 0x00cb }
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x00a7
            java.lang.String r0 = r13.f295815k     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x0010
            goto L_0x00a7
        L_0x0010:
            r12 = 1
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = "id"
            r2[r11] = r1     // Catch:{ all -> 0x00cb }
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x00cb }
            r4[r11] = r14     // Catch:{ all -> 0x00cb }
            r4[r12] = r0     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = "turns"
            java.lang.String r3 = "event_id = ? AND account_id = ?"
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "1"
            r0 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00cb }
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x00a2 }
            r2 = -1
            if (r1 == 0) goto L_0x0039
            long r4 = r0.getLong(r11)     // Catch:{ all -> 0x00a2 }
            goto L_0x003a
        L_0x0039:
            r4 = r2
        L_0x003a:
            r0.close()     // Catch:{ all -> 0x00cb }
            r9.beginTransaction()     // Catch:{ all -> 0x0098 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0098 }
            r0[r11] = r1     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "entries"
            java.lang.String r6 = "turn_id = ?"
            r9.delete(r1, r6, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "suggests"
            java.lang.String r6 = "turn_id = ?"
            r9.delete(r1, r6, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "turns"
            java.lang.String r6 = "id = ?"
            r9.delete(r1, r6, r0)     // Catch:{ all -> 0x0098 }
        L_0x0061:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0080
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x0098 }
            r15.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "account_id"
            java.lang.String r1 = r13.f295815k     // Catch:{ all -> 0x0098 }
            r15.put(r0, r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "event_id"
            r15.put(r0, r14)     // Catch:{ all -> 0x0098 }
            java.lang.String r14 = "deletions"
            r9.insertOrThrow(r14, r10, r15)     // Catch:{ all -> 0x0098 }
            goto L_0x008b
        L_0x007e:
            if (r15 != 0) goto L_0x008b
        L_0x0080:
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ all -> 0x0098 }
            r15[r11] = r14     // Catch:{ all -> 0x0098 }
            java.lang.String r14 = "deletions"
            java.lang.String r0 = "event_id = ?"
            r9.delete(r14, r0, r15)     // Catch:{ all -> 0x0098 }
        L_0x008b:
            r9.setTransactionSuccessful()     // Catch:{ all -> 0x0098 }
            r9.endTransaction()     // Catch:{ all -> 0x00cb }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00cb }
            r13.m176513s()     // Catch:{ all -> 0x00cb }
            monitor-exit(r13)
            return r12
        L_0x0098:
            r14 = move-exception
            r9.endTransaction()     // Catch:{ all -> 0x00cb }
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00cb }
            r13.m176513s()     // Catch:{ all -> 0x00cb }
            throw r14     // Catch:{ all -> 0x00cb }
        L_0x00a2:
            r14 = move-exception
            r0.close()     // Catch:{ all -> 0x00cb }
            throw r14     // Catch:{ all -> 0x00cb }
        L_0x00a7:
            com.google.common.f.e r14 = f295801a     // Catch:{ all -> 0x00cb }
            com.google.common.f.x r14 = r14.mo56226d()     // Catch:{ all -> 0x00cb }
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "HistoryStore"
            r14.mo56378ag(r15, r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r15 = "#deleteLocalHistoryImpl: HistoryStore not initialized!"
            r0 = 24579(0x6003, float:3.4443E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)     // Catch:{ all -> 0x00cb }
            com.google.android.apps.gsa.shared.logger.f r14 = r13.f295822v     // Catch:{ all -> 0x00cb }
            r15 = 38490176(0x24b5040, float:1.4937115E-37)
            r0 = 29
            com.google.android.apps.gsa.shared.logger.e r14 = r14.mo83755a(r10, r15, r0)     // Catch:{ all -> 0x00cb }
            r14.mo83721a()     // Catch:{ all -> 0x00cb }
            monitor-exit(r13)
            return r11
        L_0x00cb:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.m176514t(java.lang.String, boolean):boolean");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    private final synchronized void m176515u() {
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase != null) {
            try {
                new File(sQLiteDatabase.getPath()).length();
            } catch (Exception unused) {
            }
            Cursor query = sQLiteDatabase.query("turns", new String[]{"id"}, (String) null, (String[]) null, (String) null, (String) null, "id ASC", (String) null);
            String[] strArr = query.moveToPosition((int) (((float) query.getCount()) * 0.1f)) ? new String[]{String.valueOf(query.getInt(0))} : null;
            if (strArr != null) {
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.delete("entries", "turn_id <= ?", strArr);
                    sQLiteDatabase.delete("turns", "id <= ?", strArr);
                    sQLiteDatabase.setTransactionSuccessful();
                    C58976aa aaVar = C58975e.f156826a;
                    sQLiteDatabase.endTransaction();
                    query.close();
                    m176513s();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    query.close();
                    throw th;
                }
            } else {
                C59104x d = f295801a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "HistoryStore");
                ((C59052c) ((C59052c) d).mo56372aa(24582)).mo56386p("#freeDiskSpace: nothing to delete!");
            }
        } else {
            C59104x d2 = f295801a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d2).mo56372aa(24584)).mo56386p("#freeDiskSpace: failed due to uninitialized database!");
        }
    }

    /* renamed from: a */
    public final synchronized int mo95188a() {
        C90748e.m148224b();
        if (this.f295811g == null) {
            C59104x d = f295801a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryStore");
            ((C59052c) ((C59052c) d).mo56372aa(24538)).mo56386p("#initialize: failed due to uninitialized database!");
            return 0;
        }
        try {
            m176510p();
            m176513s();
            m176512r();
            m176511q();
        } catch (Exception e) {
            this.f295822v.mo83755a(e, 63636848, 29).mo83721a();
        }
        return this.f295816l;
    }

    /* renamed from: b */
    public final C60870cx mo95189b() {
        return this.f295807c.mo28209i(mo95190c(), "HistoryStore:syncClientAndServerDeletions", new C105936aq(this));
    }

    /* renamed from: c */
    public final C60870cx mo95190c() {
        if (this.f295824x == null) {
            this.f295824x = this.f295807c.mo28201a("HistoryStore:OpenDb", new C105931al(this));
        }
        return this.f295824x;
    }

    /* renamed from: e */
    public final synchronized String mo95191e() {
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        String str = null;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                SQLiteDatabase sQLiteDatabase2 = this.f295811g;
                sQLiteDatabase2.getClass();
                String str2 = this.f295815k;
                if (str2 == null) {
                    C59104x c = f295801a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "HistoryStore");
                    ((C59052c) ((C59052c) c).mo56372aa(24542)).mo56386p("syncServerDeletions: no account!");
                    return null;
                }
                Cursor query = sQLiteDatabase2.query("turns", new String[]{"event_id"}, "account_id = ? and event_id IS NOT NULL", new String[]{str2}, (String) null, (String) null, "id ASC", "1");
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(0);
                    }
                } catch (Exception e) {
                    try {
                        C59104x d = f295801a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "HistoryStore");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24541)).mo56386p("getOldestEventIdImpl encountered exception.");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                return str;
            }
        }
        C59104x c2 = f295801a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "HistoryStore");
        ((C59052c) ((C59052c) c2).mo56372aa(24540)).mo56386p("syncServerDeletions: HistoryStore not initialized!");
        return null;
    }

    /* renamed from: f */
    public final synchronized List mo95192f() {
        C90748e.m148224b();
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            String str = this.f295815k;
            if (str != null) {
                SQLiteDatabase sQLiteDatabase2 = this.f295811g;
                sQLiteDatabase2.getClass();
                Cursor query = sQLiteDatabase2.query("deletions", new String[]{"event_id"}, "account_id = ?", new String[]{str}, (String) null, (String) null, (String) null, (String) null);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < query.getCount() && query.moveToPosition(i)) {
                    try {
                        arrayList.add(query.getString(0));
                        i++;
                    } catch (Exception e) {
                        try {
                            C59104x d = f295801a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "HistoryStore");
                            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24544)).mo56386p("getLocalDeletionsImpl encountered exception.");
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                }
                query.close();
                return arrayList;
            }
        }
        C59104x d2 = f295801a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "HistoryStore");
        ((C59052c) ((C59052c) d2).mo56372aa(24543)).mo56386p("#getLocalDeletionsImpl: HistoryStore not initialized!");
        return new ArrayList();
    }

    /* renamed from: g */
    public final synchronized Map mo95193g(int i, int i2) {
        HashMap hashMap;
        C90748e.m148224b();
        hashMap = new HashMap();
        Cursor cursor = this.f295812h;
        if (cursor != null) {
            while (i < i2) {
                try {
                    if (cursor.moveToPosition(i)) {
                        C105958h hVar = (C105958h) ((C105958h) C105930ak.f295754i.createBuilder()).mergeFrom(cursor.getBlob(0), C62921ba.m95368a());
                        if (!cursor.isNull(2)) {
                            String string = cursor.getString(2);
                            hVar.copyOnWrite();
                            C105930ak akVar = (C105930ak) hVar.instance;
                            string.getClass();
                            akVar.f295756a |= C89885b.S3REQUEST_VALUE;
                            akVar.f295760e = string;
                        }
                        if (!cursor.isNull(5)) {
                            long j = cursor.getLong(5);
                            hVar.copyOnWrite();
                            C105930ak akVar2 = (C105930ak) hVar.instance;
                            akVar2.f295756a |= C89885b.HTTP_VALUE;
                            akVar2.f295761f = j;
                        }
                        hashMap.put(Integer.valueOf(i), (C105930ak) hVar.build());
                    }
                } catch (Exception e) {
                    C59104x d = f295801a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "HistoryStore");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24545)).mo56387q("#getEntriesImpl: unable to parse from data [index=%d]", i);
                }
                i++;
            }
        }
        return hashMap;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HistoryStore");
        fVar.mo85279c("entryCount").mo85276a(C90752i.m148230d(Integer.valueOf(this.f295816l)));
        fVar.mo85279c("storageBytes").mo85276a(C90752i.m148230d(Long.valueOf(this.f295823w)));
        C91005e c = fVar.mo85279c("storagePercent");
        double d = (double) this.f295823w;
        Double.isNaN(d);
        double a = (double) ((int) this.f295821u.mo79743a(C90014bt.f247349fV));
        Double.isNaN(a);
        c.mo85276a(C90752i.m148230d(Double.valueOf((d / 1048576.0d) / a)));
    }

    /* renamed from: h */
    public final synchronized void mo95194h() {
        Cursor cursor = this.f295812h;
        if (cursor != null) {
            cursor.close();
            this.f295812h = null;
        }
        SQLiteDatabase sQLiteDatabase = this.f295811g;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f295811g = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:1|2|3|4|5|6|7|8|9|10|11|12|(3:14|15|16)(2:17|18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95195i() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x0044 }
            android.database.sqlite.SQLiteOpenHelper r0 = r3.f295820t     // Catch:{ all -> 0x0044 }
            r0.getClass()
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x0044 }
            r3.f295811g = r0     // Catch:{ all -> 0x0044 }
            r0.getClass()
            com.google.android.apps.gsa.search.core.i.t r1 = r3.f295821u     // Catch:{ all -> 0x0044 }
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247349fV     // Catch:{ all -> 0x0044 }
            long r1 = r1.mo79743a(r2)     // Catch:{ all -> 0x0044 }
            int r2 = (int) r1     // Catch:{ all -> 0x0044 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r2 = r2 * r1
            long r1 = (long) r2     // Catch:{ all -> 0x0044 }
            r0.setMaximumSize(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0034 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0034 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0034 }
            long r0 = r1.length()     // Catch:{ Exception -> 0x0034 }
            r3.f295823w = r0     // Catch:{ Exception -> 0x0034 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            java.lang.String r0 = r3.f295815k     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0042
            android.accounts.Account r0 = r3.f295814j     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r3.m176509o(r0)     // Catch:{ all -> 0x0044 }
            r3.f295815k = r0     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.mo95195i():void");
    }

    /* renamed from: j */
    public final void mo95196j(C105930ak akVar) {
        this.f295807c.mo28212l("HistoryStore:replaceWebAnswerHistory", new C105943ax(this, akVar));
        new C90873ag(mo95190c(), this.f295807c, "HistoryStore:replaceWebAnswerHistory", new C105944ay(this, akVar)).mo85223a(C105945az.f295788a);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.String, java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95197k(com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f295811g     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r6.f295815k     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x000b
            goto L_0x0088
        L_0x000b:
            r1 = 0
            if (r7 != 0) goto L_0x002e
            java.lang.String r7 = "SELECT COUNT(*) FROM webanswerattribs"
            android.database.Cursor r1 = r0.rawQuery(r7, r1)     // Catch:{ Exception -> 0x002c }
            boolean r7 = r1.moveToFirst()     // Catch:{ Exception -> 0x002c }
            if (r7 == 0) goto L_0x0050
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x002c }
            java.lang.String r2 = r6.f295815k     // Catch:{ Exception -> 0x002c }
            r3 = 0
            r7[r3] = r2     // Catch:{ Exception -> 0x002c }
            java.lang.String r2 = "webanswerattribs"
            java.lang.String r3 = "account_id=?"
            r0.delete(r2, r3, r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x0050
        L_0x002a:
            r7 = move-exception
            goto L_0x0082
        L_0x002c:
            r7 = move-exception
            goto L_0x0057
        L_0x002e:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x002c }
            r2.<init>()     // Catch:{ Exception -> 0x002c }
            java.lang.String r3 = "account_id"
            java.lang.String r4 = r6.f295815k     // Catch:{ Exception -> 0x002c }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x002c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x002c }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x002c }
            java.lang.String r3 = "entry"
            byte[] r7 = r7.toByteArray()     // Catch:{ Exception -> 0x002c }
            r2.put(r3, r7)     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = "webanswerattribs"
            r0.replace(r7, r1, r2)     // Catch:{ Exception -> 0x002c }
        L_0x0050:
            if (r1 == 0) goto L_0x0080
            r1.close()     // Catch:{ all -> 0x009e }
            monitor-exit(r6)
            return
        L_0x0057:
            com.google.common.f.e r0 = f295801a     // Catch:{ all -> 0x002a }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x002a }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "HistoryStore"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x002a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x002a }
            com.google.common.f.x r7 = r0.mo56382g(r7)     // Catch:{ all -> 0x002a }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x002a }
            r0 = 24564(0x5ff4, float:3.4421E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x002a }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "replaceWebAnswerHistory encountered an exception"
            r7.mo56386p(r0)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0080
            r1.close()     // Catch:{ all -> 0x009e }
            monitor-exit(r6)
            return
        L_0x0080:
            monitor-exit(r6)
            return
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()     // Catch:{ all -> 0x009e }
        L_0x0087:
            throw r7     // Catch:{ all -> 0x009e }
        L_0x0088:
            com.google.common.f.e r7 = f295801a     // Catch:{ all -> 0x009e }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x009e }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "HistoryStore"
            r7.mo56378ag(r0, r1)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "#replaceWebAnswerHistoryImpl: failed due to uninitialized database!"
            r1 = 24563(0x5ff3, float:3.442E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x009e }
            monitor-exit(r6)
            return
        L_0x009e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.mo95197k(com.google.android.apps.gsa.staticplugins.opa.aa.ak):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r0.update("entries", r4, "id = ?", new java.lang.String[]{java.lang.String.valueOf(r12)}) == 1) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        r4 = f295801a.mo56226d();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "HistoryStore");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(24574)).mo56386p("#updateEntry: failed due to wrong entry id.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f8, code lost:
        r0.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r12 = f295801a.mo56226d();
        r12.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "HistoryStore");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(24569)).mo56389s("#updateEntry: endTransaction failed %s", r11.getLocalizedMessage());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x015e */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95198l(com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h r11, int r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x01a5 }
            android.database.sqlite.SQLiteDatabase r0 = r10.f295811g     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x001e
            com.google.common.f.e r11 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r11 = r11.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "HistoryStore"
            r11.mo56378ag(r12, r0)     // Catch:{ all -> 0x01a5 }
            java.lang.String r12 = "#updateEntry: failed due to uninitialized database!"
            r0 = 24578(0x6002, float:3.4441E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r10)
            return
        L_0x001e:
            java.lang.String r1 = r10.f295815k     // Catch:{ all -> 0x01a5 }
            if (r1 != 0) goto L_0x0038
            com.google.common.f.e r11 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r11 = r11.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "HistoryStore"
            r11.mo56378ag(r12, r0)     // Catch:{ all -> 0x01a5 }
            java.lang.String r12 = "#updateEntry: failed due to no account id."
            r0 = 24577(0x6001, float:3.444E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r10)
            return
        L_0x0038:
            java.lang.String r1 = f295804r     // Catch:{ all -> 0x01a5 }
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x01a5 }
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01a5 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x01a5 }
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch:{ all -> 0x01a5 }
            r3 = 0
        L_0x0049:
            r4 = 3
            if (r3 >= r4) goto L_0x01a0
            r0.beginTransaction()     // Catch:{ all -> 0x01a5 }
            int r4 = r1.getCount()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            if (r4 == r2) goto L_0x0091
            com.google.common.f.e r4 = f295801a     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r7 = "HistoryStore"
            r4.mo56378ag(r6, r7)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r6 = 24575(0x5fff, float:3.4437E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r6 = "#updateEntry: failed due to missing entry id."
            r4.mo56386p(r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r0.endTransaction()     // Catch:{ Exception -> 0x0076 }
            monitor-exit(r10)
            return
        L_0x0076:
            r11 = move-exception
            com.google.common.f.e r12 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = "HistoryStore"
            r12.mo56378ag(r0, r1)     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "#updateEntry: endTransaction failed %s"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x01a5 }
            r1 = 24576(0x6000, float:3.4438E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56389s(r0, r11)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r10)
            return
        L_0x0091:
            r1.moveToFirst()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            byte[] r4 = r1.getBlob(r5)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r7 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r4, (com.google.protobuf.C62921ba) r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r4 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            long r6 = r4.f295759d     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r11.copyOnWrite()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.protobuf.bv r4 = r11.instance     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r4 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            int r8 = r4.f295756a     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r9
            r4.f295756a = r8     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r4.f295759d = r6     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r4.<init>()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r6 = "entry"
            com.google.protobuf.bv r7 = r11.build()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r7     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            byte[] r7 = r7.toByteArray()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r4.put(r6, r7)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r6[r5] = r7     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r7 = "entries"
            java.lang.String r8 = "id = ?"
            int r4 = r0.update(r7, r4, r8, r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            if (r4 == r2) goto L_0x00f8
            com.google.common.f.e r4 = f295801a     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r7 = "HistoryStore"
            r4.mo56378ag(r6, r7)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r6 = 24574(0x5ffe, float:3.4436E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            java.lang.String r6 = "#updateEntry: failed due to wrong entry id."
            r4.mo56386p(r6)     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
        L_0x00f8:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x015e, ct -> 0x011d }
            r0.endTransaction()     // Catch:{ Exception -> 0x0100 }
            goto L_0x01a0
        L_0x0100:
            r11 = move-exception
            com.google.common.f.e r12 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r2 = "HistoryStore"
            r12.mo56378ag(r0, r2)     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "#updateEntry: endTransaction failed %s"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x01a5 }
            r2 = 24569(0x5ff9, float:3.4429E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r2)).mo56389s(r0, r11)     // Catch:{ all -> 0x01a5 }
            goto L_0x01a0
        L_0x011b:
            r11 = move-exception
            goto L_0x0182
        L_0x011d:
            r4 = move-exception
            com.google.common.f.e r6 = f295801a     // Catch:{ all -> 0x011b }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x011b }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x011b }
            java.lang.String r8 = "HistoryStore"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x011b }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x011b }
            com.google.common.f.x r4 = r6.mo56382g(r4)     // Catch:{ all -> 0x011b }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x011b }
            r6 = 24572(0x5ffc, float:3.4433E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ all -> 0x011b }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x011b }
            java.lang.String r6 = "#updateEntry: failed due to invalid history entry stored."
            r4.mo56386p(r6)     // Catch:{ all -> 0x011b }
            r0.endTransaction()     // Catch:{ Exception -> 0x0144 }
            goto L_0x017e
        L_0x0144:
            r4 = move-exception
            com.google.common.f.e r6 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r8 = "HistoryStore"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "#updateEntry: endTransaction failed %s"
            java.lang.String r4 = r4.getLocalizedMessage()     // Catch:{ all -> 0x01a5 }
            r8 = 24573(0x5ffd, float:3.4434E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56389s(r7, r4)     // Catch:{ all -> 0x01a5 }
            goto L_0x017e
        L_0x015e:
            r10.m176515u()     // Catch:{ all -> 0x011b }
            r0.endTransaction()     // Catch:{ Exception -> 0x0165 }
            goto L_0x017e
        L_0x0165:
            r4 = move-exception
            com.google.common.f.e r6 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r8 = "HistoryStore"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "#updateEntry: endTransaction failed %s"
            java.lang.String r4 = r4.getLocalizedMessage()     // Catch:{ all -> 0x01a5 }
            r8 = 24570(0x5ffa, float:3.443E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56389s(r7, r4)     // Catch:{ all -> 0x01a5 }
        L_0x017e:
            int r3 = r3 + 1
            goto L_0x0049
        L_0x0182:
            r0.endTransaction()     // Catch:{ Exception -> 0x0186 }
            goto L_0x019f
        L_0x0186:
            r12 = move-exception
            com.google.common.f.e r0 = f295801a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a5 }
            java.lang.String r2 = "HistoryStore"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = "#updateEntry: endTransaction failed %s"
            java.lang.String r12 = r12.getLocalizedMessage()     // Catch:{ all -> 0x01a5 }
            r2 = 24571(0x5ffb, float:3.4431E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r12)     // Catch:{ all -> 0x01a5 }
        L_0x019f:
            throw r11     // Catch:{ all -> 0x01a5 }
        L_0x01a0:
            r1.close()     // Catch:{ all -> 0x01a5 }
            monitor-exit(r10)
            return
        L_0x01a5:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x01a9
        L_0x01a8:
            throw r11
        L_0x01a9:
            goto L_0x01a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.mo95198l(com.google.android.apps.gsa.staticplugins.opa.aa.h, int):void");
    }

    /* renamed from: m */
    public final synchronized boolean mo95199m(List list, boolean z) {
        boolean z2;
        Iterator it = list.iterator();
        z2 = true;
        while (it.hasNext()) {
            z2 &= m176514t((String) it.next(), z);
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r11.f295806b.mo28212l("HistoryStore:Callback", new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e2, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r11.f295806b.mo28212l("HistoryStore:Callback", new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        m176515u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3 = r11.f295806b;
        r4 = new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14);
        r5 = "HistoryStore:Callback";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0102, code lost:
        r3.mo28212l(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        r11.f295806b.mo28212l("HistoryStore:Callback", new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        r3 = r11.f295806b;
        r4 = new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14);
        r5 = "HistoryStore:Callback";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r13 = r11.f295806b;
        r0 = new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14);
        r14 = "HistoryStore:Callback";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0133, code lost:
        r11.f295806b.mo28212l("HistoryStore:Callback", new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0140, code lost:
        r13 = r11.f295806b;
        r0 = new com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105942aw(r14);
        r14 = "HistoryStore:Callback";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00f3 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95200n(java.util.List r12, java.lang.String r13, com.google.android.apps.gsa.staticplugins.opa.chatui.C108293dj r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x017f }
            android.database.sqlite.SQLiteDatabase r0 = r11.f295811g     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x001e
            com.google.common.f.e r12 = f295801a     // Catch:{ all -> 0x017f }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x017f }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore"
            r12.mo56378ag(r13, r14)     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "#createEntries: failed due to uninitialized database!"
            r14 = 24550(0x5fe6, float:3.4402E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56386p(r13)     // Catch:{ all -> 0x017f }
            monitor-exit(r11)
            return
        L_0x001e:
            java.lang.String r1 = r11.f295815k     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0169
            r1 = 0
            r2 = 0
        L_0x0024:
            r3 = 3
            if (r2 >= r3) goto L_0x014b
            r0.beginTransaction()     // Catch:{ all -> 0x017f }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteFullException -> 0x00f3 }
            r3.<init>()     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r4 = "event_id"
            r3.put(r4, r13)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r4 = "account_id"
            java.lang.String r5 = r11.f295815k     // Catch:{ SQLiteFullException -> 0x00f3 }
            r3.put(r4, r5)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r4 = "timestamp"
            com.google.android.libraries.f.a r5 = r11.f295809e     // Catch:{ SQLiteFullException -> 0x00f3 }
            long r5 = r5.mo26870b()     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteFullException -> 0x00f3 }
            r3.put(r4, r5)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r4 = "turns"
            r5 = 0
            long r3 = r0.insertOrThrow(r4, r5, r3)     // Catch:{ SQLiteFullException -> 0x00f3 }
            r6 = 0
        L_0x0052:
            int r7 = r12.size()     // Catch:{ SQLiteFullException -> 0x00f3 }
            if (r6 >= r7) goto L_0x00c1
            java.lang.Object r7 = r12.get(r6)     // Catch:{ SQLiteFullException -> 0x00f3 }
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r7     // Catch:{ SQLiteFullException -> 0x00f3 }
            int r8 = r7.f295757b     // Catch:{ SQLiteFullException -> 0x00f3 }
            r9 = 7
            if (r8 != r9) goto L_0x0095
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = r11.f295815k     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8[r1] = r9     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "suggests"
            java.lang.String r10 = "account_id = ?"
            r0.delete(r9, r10, r8)     // Catch:{ SQLiteFullException -> 0x00f3 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.<init>()     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "turn_id"
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.put(r9, r10)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "account_id"
            java.lang.String r10 = r11.f295815k     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.put(r9, r10)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "entry"
            byte[] r7 = r7.toByteArray()     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.put(r9, r7)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r7 = "suggests"
            r0.insertOrThrow(r7, r5, r8)     // Catch:{ SQLiteFullException -> 0x00f3 }
            goto L_0x00be
        L_0x0095:
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.<init>()     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "turn_id"
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.put(r9, r10)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r9 = "entry"
            byte[] r7 = r7.toByteArray()     // Catch:{ SQLiteFullException -> 0x00f3 }
            r8.put(r9, r7)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r7 = "entries"
            long r7 = r0.insertOrThrow(r7, r5, r8)     // Catch:{ SQLiteFullException -> 0x00f3 }
            com.google.android.libraries.gsa.k.g r9 = r11.f295806b     // Catch:{ SQLiteFullException -> 0x00f3 }
            com.google.android.apps.gsa.staticplugins.opa.aa.av r10 = new com.google.android.apps.gsa.staticplugins.opa.aa.av     // Catch:{ SQLiteFullException -> 0x00f3 }
            r10.<init>(r14, r6, r7)     // Catch:{ SQLiteFullException -> 0x00f3 }
            java.lang.String r7 = "HistoryStore:Callback"
            r9.mo28212l(r7, r10)     // Catch:{ SQLiteFullException -> 0x00f3 }
        L_0x00be:
            int r6 = r6 + 1
            goto L_0x0052
        L_0x00c1:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x00f3 }
            r0.endTransaction()     // Catch:{ Exception -> 0x00e3, all -> 0x00d5 }
            com.google.android.libraries.gsa.k.g r12 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r13 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r13.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            r12.mo28212l(r14, r13)     // Catch:{ all -> 0x017f }
            monitor-exit(r11)
            return
        L_0x00d5:
            r12 = move-exception
            com.google.android.libraries.gsa.k.g r13 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r0 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r0.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            r13.mo28212l(r14, r0)     // Catch:{ all -> 0x017f }
            throw r12     // Catch:{ all -> 0x017f }
        L_0x00e3:
            com.google.android.libraries.gsa.k.g r12 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r13 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r13.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            r12.mo28212l(r14, r13)     // Catch:{ all -> 0x017f }
            monitor-exit(r11)
            return
        L_0x00f1:
            r12 = move-exception
            goto L_0x0122
        L_0x00f3:
            r11.m176515u()     // Catch:{ all -> 0x00f1 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0114, all -> 0x0106 }
            com.google.android.libraries.gsa.k.g r3 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r4 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r4.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r5 = "HistoryStore:Callback"
        L_0x0102:
            r3.mo28212l(r5, r4)     // Catch:{ all -> 0x017f }
            goto L_0x011e
        L_0x0106:
            r12 = move-exception
            com.google.android.libraries.gsa.k.g r13 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r0 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r0.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            r13.mo28212l(r14, r0)     // Catch:{ all -> 0x017f }
            throw r12     // Catch:{ all -> 0x017f }
        L_0x0114:
            com.google.android.libraries.gsa.k.g r3 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r4 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r4.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r5 = "HistoryStore:Callback"
            goto L_0x0102
        L_0x011e:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0122:
            r0.endTransaction()     // Catch:{ Exception -> 0x0140, all -> 0x0132 }
            com.google.android.libraries.gsa.k.g r13 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r0 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r0.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
        L_0x012e:
            r13.mo28212l(r14, r0)     // Catch:{ all -> 0x017f }
            goto L_0x014a
        L_0x0132:
            r12 = move-exception
            com.google.android.libraries.gsa.k.g r13 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r0 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r0.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            r13.mo28212l(r14, r0)     // Catch:{ all -> 0x017f }
            throw r12     // Catch:{ all -> 0x017f }
        L_0x0140:
            com.google.android.libraries.gsa.k.g r13 = r11.f295806b     // Catch:{ all -> 0x017f }
            com.google.android.apps.gsa.staticplugins.opa.aa.aw r0 = new com.google.android.apps.gsa.staticplugins.opa.aa.aw     // Catch:{ all -> 0x017f }
            r0.<init>(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore:Callback"
            goto L_0x012e
        L_0x014a:
            throw r12     // Catch:{ all -> 0x017f }
        L_0x014b:
            com.google.common.f.e r12 = f295801a     // Catch:{ all -> 0x017f }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ all -> 0x017f }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "HistoryStore"
            r12.mo56378ag(r14, r0)     // Catch:{ all -> 0x017f }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x017f }
            r14 = 24548(0x5fe4, float:3.4399E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r14)     // Catch:{ all -> 0x017f }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "#createEntries: unable to save eventId=%s after %d tries."
            r12.mo56352E(r14, r13, r2)     // Catch:{ all -> 0x017f }
            monitor-exit(r11)
            return
        L_0x0169:
            com.google.common.f.e r12 = f295801a     // Catch:{ all -> 0x017f }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x017f }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "HistoryStore"
            r12.mo56378ag(r13, r14)     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "#createEntries: failed due to no account id."
            r14 = 24549(0x5fe5, float:3.44E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56386p(r13)     // Catch:{ all -> 0x017f }
            monitor-exit(r11)
            return
        L_0x017f:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0183
        L_0x0182:
            throw r12
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf.mo95200n(java.util.List, java.lang.String, com.google.android.apps.gsa.staticplugins.opa.chatui.dj):void");
    }
}
