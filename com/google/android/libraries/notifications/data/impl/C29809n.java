package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p11027an.p11028a.C147765a;
import com.google.android.libraries.p11027an.p11028a.C147766b;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58704ox;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.data.impl.n */
/* compiled from: PG */
public final class C29809n {

    /* renamed from: a */
    private final Context f80823a;

    /* renamed from: b */
    private final C29823n f80824b;

    /* renamed from: c */
    private final C68214a f80825c;

    /* renamed from: d */
    private final C21370a f80826d;

    /* renamed from: e */
    private final HashMap f80827e = new HashMap();

    public C29809n(Context context, C29823n nVar, C68214a aVar, C21370a aVar2) {
        this.f80823a = context;
        this.f80824b = nVar;
        this.f80825c = aVar;
        this.f80826d = aVar2;
    }

    /* renamed from: f */
    private final synchronized C29803h m55053f(C29820k kVar) {
        Long l;
        l = -1L;
        if (C68958v.m100020c()) {
            if (kVar != null) {
                l = kVar.mo35004d();
            }
        } else if (!(kVar == null || kVar.mo35009h() == null)) {
            l = this.f80824b.mo35088b(kVar.mo35009h()).mo35004d();
        }
        if (!this.f80827e.containsKey(l)) {
            this.f80827e.put(l, new C29803h(this.f80823a, l.longValue()));
        }
        return (C29803h) this.f80827e.get(l);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = ((com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a) r9.f80825c.mo27525b()).mo35160b(41);
        r0.mo35145j(r10);
        r0.mo35136a();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x016a */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized com.google.common.p4522b.C58495hd m55054g(com.google.android.libraries.notifications.data.C29820k r10, android.database.sqlite.SQLiteDatabase r11, com.google.android.libraries.p11027an.p11028a.C147766b r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r1 = "threads"
            r2 = 0
            java.lang.String r3 = r12.mo124439a()     // Catch:{ all -> 0x0196 }
            java.lang.String[] r4 = r12.mo124444c()     // Catch:{ all -> 0x0196 }
            r5 = 0
            r6 = 0
            java.lang.String r7 = "last_notification_version DESC"
            r8 = 0
            r0 = r11
            android.database.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0196 }
            com.google.common.b.gz r12 = new com.google.common.b.gz     // Catch:{ all -> 0x018a }
            r0 = 4
            r12.<init>(r0)     // Catch:{ all -> 0x018a }
        L_0x001c:
            boolean r0 = r11.moveToNext()     // Catch:{ p -> 0x016a }
            if (r0 == 0) goto L_0x017e
            com.google.android.libraries.notifications.data.g r0 = com.google.android.libraries.notifications.data.C29827r.m55149v()     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "thread_id"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ p -> 0x016a }
            r0.mo35045d(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "read_state"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            int r1 = r11.getInt(r1)     // Catch:{ p -> 0x016a }
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar.m87703a(r1)     // Catch:{ p -> 0x016a }
            r0.mo35049h(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "count_behavior"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            int r1 = r11.getInt(r1)     // Catch:{ p -> 0x016a }
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55588x.m87713a(r1)     // Catch:{ p -> 0x016a }
            r0.mo35047f(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "system_tray_behavior"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            int r1 = r11.getInt(r1)     // Catch:{ p -> 0x016a }
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm.m87708a(r1)     // Catch:{ p -> 0x016a }
            r0.mo35051j(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "last_updated__version"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r0.f80763a = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "last_notification_version"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r0.f80764b = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "payload_type"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ p -> 0x016a }
            r0.f80767e = r1     // Catch:{ p -> 0x016a }
            com.google.bf.b.a.a.ae r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55525ae.f146515a     // Catch:{ p -> 0x016a }
            java.lang.String r2 = "notification_metadata"
            java.util.List r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55072g(r11, r1, r2)     // Catch:{ p -> 0x016a }
            r0.f80765c = r1     // Catch:{ p -> 0x016a }
            com.google.bf.b.a.a.d r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55568d.f146611j     // Catch:{ p -> 0x016a }
            java.lang.String r2 = "actions"
            java.util.List r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55072g(r11, r1, r2)     // Catch:{ p -> 0x016a }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ p -> 0x016a }
            r2.<init>()     // Catch:{ p -> 0x016a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ p -> 0x016a }
        L_0x00ad:
            boolean r3 = r1.hasNext()     // Catch:{ p -> 0x016a }
            if (r3 == 0) goto L_0x00cd
            java.lang.Object r3 = r1.next()     // Catch:{ p -> 0x016a }
            com.google.bf.b.a.a.d r3 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55568d) r3     // Catch:{ p -> 0x016a }
            com.google.common.base.ax r3 = com.google.android.libraries.notifications.data.C29824o.m55128l(r3)     // Catch:{ p -> 0x016a }
            boolean r4 = r3.mo56113h()     // Catch:{ p -> 0x016a }
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ p -> 0x016a }
            com.google.android.libraries.notifications.data.o r3 = (com.google.android.libraries.notifications.data.C29824o) r3     // Catch:{ p -> 0x016a }
            r2.add(r3)     // Catch:{ p -> 0x016a }
            goto L_0x00ad
        L_0x00cd:
            r0.f80774l = r2     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "creation_id"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r0.f80766d = r1     // Catch:{ p -> 0x016a }
            com.google.bf.b.a.a.v r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55586v.f146658u     // Catch:{ p -> 0x016a }
            java.lang.String r2 = "rendered_message"
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55071f(r11, r1, r2)     // Catch:{ p -> 0x016a }
            com.google.bf.b.a.a.v r1 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55586v) r1     // Catch:{ p -> 0x016a }
            r0.mo35043b(r1)     // Catch:{ p -> 0x016a }
            com.google.protobuf.h r1 = com.google.protobuf.C63070h.f170215c     // Catch:{ p -> 0x016a }
            java.lang.String r2 = "payload"
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55071f(r11, r1, r2)     // Catch:{ p -> 0x016a }
            com.google.protobuf.h r1 = (com.google.protobuf.C63070h) r1     // Catch:{ p -> 0x016a }
            r0.f80768f = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "update_thread_state_token"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ p -> 0x016a }
            r0.f80769g = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "group_id"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ p -> 0x016a }
            r0.mo35044c(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "expiration_timestamp"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r0.f80771i = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "thread_stored_timestamp"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r0.f80772j = r1     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "storage_mode"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            int r1 = r11.getInt(r1)     // Catch:{ p -> 0x016a }
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55545ay.m87706a(r1)     // Catch:{ p -> 0x016a }
            r0.mo35050i(r1)     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "deletion_status"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            int r1 = r11.getInt(r1)     // Catch:{ p -> 0x016a }
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55590z.m87714a(r1)     // Catch:{ p -> 0x016a }
            r0.mo35048g(r1)     // Catch:{ p -> 0x016a }
            com.google.android.libraries.notifications.data.r r0 = r0.mo35042a()     // Catch:{ p -> 0x016a }
            java.lang.String r1 = "reference"
            int r1 = com.google.android.libraries.notifications.data.impl.C29812q.m55066a(r11, r1)     // Catch:{ p -> 0x016a }
            long r1 = r11.getLong(r1)     // Catch:{ p -> 0x016a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ p -> 0x016a }
            r12.mo55429h(r0, r1)     // Catch:{ p -> 0x016a }
            goto L_0x001c
        L_0x016a:
            dagger.a r0 = r9.f80825c     // Catch:{ all -> 0x018a }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x018a }
            com.google.android.libraries.notifications.e.b.a.a r0 = (com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a) r0     // Catch:{ all -> 0x018a }
            r1 = 41
            com.google.android.libraries.notifications.e.b.a r0 = r0.mo35160b(r1)     // Catch:{ all -> 0x018a }
            r0.mo35145j(r10)     // Catch:{ all -> 0x018a }
            r0.mo35136a()     // Catch:{ all -> 0x018a }
        L_0x017e:
            r10 = 1
            com.google.common.b.hd r10 = r12.mo55427f(r10)     // Catch:{ all -> 0x018a }
            if (r11 == 0) goto L_0x0188
            r11.close()     // Catch:{ all -> 0x0196 }
        L_0x0188:
            monitor-exit(r9)
            return r10
        L_0x018a:
            r10 = move-exception
            if (r11 == 0) goto L_0x0195
            r11.close()     // Catch:{ all -> 0x0191 }
            goto L_0x0195
        L_0x0191:
            r11 = move-exception
            com.google.android.libraries.notifications.data.impl.C29808m.m55052a(r10, r11)     // Catch:{ all -> 0x0196 }
        L_0x0195:
            throw r10     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x019a
        L_0x0199:
            throw r10
        L_0x019a:
            goto L_0x0199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29809n.m55054g(com.google.android.libraries.notifications.data.k, android.database.sqlite.SQLiteDatabase, com.google.android.libraries.an.a.b):com.google.common.b.hd");
    }

    /* renamed from: h */
    private final synchronized void m55055h(C29820k kVar, C147766b bVar, List list) {
        try {
            SQLiteDatabase writableDatabase = m55053f(kVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C147766b bVar2 = (C147766b) it.next();
                    C147767c cVar = new C147767c();
                    cVar.f398712a.append("UPDATE ");
                    cVar.f398712a.append("threads");
                    cVar.f398712a.append(" SET ");
                    cVar.f398712a.append(((C147765a) bVar).f398710a);
                    cVar.f398712a.append(" WHERE ");
                    cVar.f398712a.append(bVar2.mo124439a());
                    writableDatabase.execSQL(((C147765a) cVar.mo124445a()).f398710a, C58704ox.m90448a(bVar.mo124444c(), bVar2.mo124444c(), String.class));
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (C29822m | RuntimeException e) {
            C30058b.m55792d("ChimeThreadStorageHelper", e, "Error updating ChimeThread for account. Set: %s, Queries: %s", bVar, list);
        } catch (Throwable th2) {
            C29808m.m55052a(th, th2);
        }
    }

    /* renamed from: a */
    public final synchronized C58485gu mo35106a(C29820k kVar, List list) {
        C58485gu f;
        C58480gp e = C58485gu.m89837e();
        try {
            SQLiteDatabase writableDatabase = m55053f(kVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e.mo55396h(m55054g(kVar, writableDatabase, (C147766b) it.next()).keySet());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                f = e.mo55394f();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (C29822m | RuntimeException e2) {
            C30058b.m55792d("ChimeThreadStorageHelper", e2, "Error getting ChimeThreads for account. Queries: %s", list);
            return C58485gu.m89845m();
        } catch (Throwable th2) {
            C29808m.m55052a(th, th2);
        }
        return f;
    }

    /* renamed from: b */
    public final synchronized void mo35107b(C29820k kVar, List list) {
        C147767c cVar = new C147767c();
        cVar.f398712a.append("reference");
        cVar.f398712a.append(" = ");
        cVar.f398712a.append("reference");
        cVar.mo124446b(" & ~?", 1L);
        m55055h(kVar, cVar.mo124445a(), list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0247, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0288, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.util.Pair mo35108c(com.google.android.libraries.notifications.data.C29820k r17, com.google.android.libraries.notifications.data.C29827r r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            monitor-enter(r16)
            r3 = 1
            r4 = 0
            com.google.android.libraries.notifications.data.impl.h r0 = r16.m55053f(r17)     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
            android.database.sqlite.SQLiteDatabase r5 = r0.getWritableDatabase()     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
            r5.beginTransaction()     // Catch:{ all -> 0x0293 }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x028e }
            r6 = 16
            r0.<init>(r6)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "thread_id"
            java.lang.String r7 = r18.mo35063j()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "read_state"
            int r7 = r18.mo35070q()     // Catch:{ all -> 0x028e }
            int r8 = r7 + -1
            r9 = 0
            if (r7 == 0) goto L_0x028d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "count_behavior"
            int r7 = r18.mo35068o()     // Catch:{ all -> 0x028e }
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x028c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "system_tray_behavior"
            int r7 = r18.mo35072s()     // Catch:{ all -> 0x028e }
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x028b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "last_updated__version"
            java.lang.Long r7 = r18.mo35060h()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "last_notification_version"
            java.lang.Long r7 = r18.mo35059g()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "payload_type"
            java.lang.String r7 = r18.mo35064k()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "update_thread_state_token"
            java.lang.String r7 = r18.mo35065l()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "group_id"
            java.lang.String r7 = r18.mo35062i()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "expiration_timestamp"
            java.lang.Long r7 = r18.mo35056e()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "thread_stored_timestamp"
            com.google.android.libraries.f.a r7 = r1.f80826d     // Catch:{ all -> 0x028e }
            long r7 = r7.mo26870b()     // Catch:{ all -> 0x028e }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "locally_removed"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "storage_mode"
            int r7 = r18.mo35071r()     // Catch:{ all -> 0x028e }
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x028a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "creation_id"
            java.lang.Long r7 = r18.mo35055d()     // Catch:{ all -> 0x028e }
            r0.put(r6, r7)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "reference"
            r7 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x028e }
            r0.put(r6, r10)     // Catch:{ all -> 0x028e }
            java.lang.String r6 = "deletion_status"
            int r10 = r18.mo35069p()     // Catch:{ all -> 0x028e }
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x0289
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x028e }
            r0.put(r6, r10)     // Catch:{ all -> 0x028e }
            com.google.bf.b.a.a.v r6 = r18.mo35052a()     // Catch:{ all -> 0x028e }
            if (r6 == 0) goto L_0x00ed
            java.lang.String r6 = "rendered_message"
            com.google.bf.b.a.a.v r10 = r18.mo35052a()     // Catch:{ all -> 0x028e }
            byte[] r10 = r10.toByteArray()     // Catch:{ all -> 0x028e }
            r0.put(r6, r10)     // Catch:{ all -> 0x028e }
        L_0x00ed:
            java.util.List r6 = r18.mo35067n()     // Catch:{ all -> 0x028e }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x028e }
            if (r6 != 0) goto L_0x0144
            com.google.android.libraries.notifications.g.j r6 = com.google.android.libraries.notifications.p2292g.C30002j.f81213b     // Catch:{ all -> 0x028e }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.g.i r6 = (com.google.android.libraries.notifications.p2292g.C30001i) r6     // Catch:{ all -> 0x028e }
            java.util.List r10 = r18.mo35067n()     // Catch:{ all -> 0x028e }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x028e }
        L_0x0107:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x028e }
            if (r11 == 0) goto L_0x0135
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x028e }
            com.google.bf.b.a.a.ae r11 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55525ae) r11     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r12 = com.google.protobuf.C63070h.f170215c     // Catch:{ all -> 0x028e }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x028e }
            com.google.protobuf.g r12 = (com.google.protobuf.C63062g) r12     // Catch:{ all -> 0x028e }
            com.google.protobuf.z r11 = r11.toByteString()     // Catch:{ all -> 0x028e }
            r12.copyOnWrite()     // Catch:{ all -> 0x028e }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r13 = (com.google.protobuf.C63070h) r13     // Catch:{ all -> 0x028e }
            r11.getClass()     // Catch:{ all -> 0x028e }
            r13.f170218b = r11     // Catch:{ all -> 0x028e }
            com.google.protobuf.bv r11 = r12.build()     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r11 = (com.google.protobuf.C63070h) r11     // Catch:{ all -> 0x028e }
            r6.mo35306a(r11)     // Catch:{ all -> 0x028e }
            goto L_0x0107
        L_0x0135:
            java.lang.String r10 = "notification_metadata"
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.g.j r6 = (com.google.android.libraries.notifications.p2292g.C30002j) r6     // Catch:{ all -> 0x028e }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x028e }
            r0.put(r10, r6)     // Catch:{ all -> 0x028e }
        L_0x0144:
            java.util.List r6 = r18.mo35066m()     // Catch:{ all -> 0x028e }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x028e }
            if (r6 != 0) goto L_0x019f
            com.google.android.libraries.notifications.g.j r6 = com.google.android.libraries.notifications.p2292g.C30002j.f81213b     // Catch:{ all -> 0x028e }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.g.i r6 = (com.google.android.libraries.notifications.p2292g.C30001i) r6     // Catch:{ all -> 0x028e }
            java.util.List r10 = r18.mo35066m()     // Catch:{ all -> 0x028e }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x028e }
        L_0x015e:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x028e }
            if (r11 == 0) goto L_0x0190
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.data.o r11 = (com.google.android.libraries.notifications.data.C29824o) r11     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r12 = com.google.protobuf.C63070h.f170215c     // Catch:{ all -> 0x028e }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x028e }
            com.google.protobuf.g r12 = (com.google.protobuf.C63062g) r12     // Catch:{ all -> 0x028e }
            com.google.bf.b.a.a.d r11 = r11.mo35133m()     // Catch:{ all -> 0x028e }
            com.google.protobuf.z r11 = r11.toByteString()     // Catch:{ all -> 0x028e }
            r12.copyOnWrite()     // Catch:{ all -> 0x028e }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r13 = (com.google.protobuf.C63070h) r13     // Catch:{ all -> 0x028e }
            r11.getClass()     // Catch:{ all -> 0x028e }
            r13.f170218b = r11     // Catch:{ all -> 0x028e }
            com.google.protobuf.bv r11 = r12.build()     // Catch:{ all -> 0x028e }
            com.google.protobuf.h r11 = (com.google.protobuf.C63070h) r11     // Catch:{ all -> 0x028e }
            r6.mo35306a(r11)     // Catch:{ all -> 0x028e }
            goto L_0x015e
        L_0x0190:
            java.lang.String r10 = "actions"
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.g.j r6 = (com.google.android.libraries.notifications.p2292g.C30002j) r6     // Catch:{ all -> 0x028e }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x028e }
            r0.put(r10, r6)     // Catch:{ all -> 0x028e }
        L_0x019f:
            com.google.protobuf.h r6 = r18.mo35054c()     // Catch:{ all -> 0x028e }
            if (r6 == 0) goto L_0x01b2
            java.lang.String r6 = "payload"
            com.google.protobuf.h r10 = r18.mo35054c()     // Catch:{ all -> 0x028e }
            byte[] r10 = r10.toByteArray()     // Catch:{ all -> 0x028e }
            r0.put(r6, r10)     // Catch:{ all -> 0x028e }
        L_0x01b2:
            com.google.android.libraries.an.a.c r6 = new com.google.android.libraries.an.a.c     // Catch:{ all -> 0x028e }
            r6.<init>()     // Catch:{ all -> 0x028e }
            java.lang.String r10 = "thread_id"
            java.lang.StringBuilder r11 = r6.f398712a     // Catch:{ all -> 0x028e }
            r11.append(r10)     // Catch:{ all -> 0x028e }
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x028e }
            java.lang.String r11 = r18.mo35063j()     // Catch:{ all -> 0x028e }
            r10[r4] = r11     // Catch:{ all -> 0x028e }
            java.lang.String r11 = " = ?"
            r6.mo124446b(r11, r10)     // Catch:{ all -> 0x028e }
            com.google.android.libraries.an.a.b r6 = r6.mo124445a()     // Catch:{ all -> 0x028e }
            r10 = r17
            com.google.common.b.hd r10 = r1.m55054g(r10, r5, r6)     // Catch:{ all -> 0x028e }
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x028e }
            if (r11 == 0) goto L_0x01f7
            java.lang.String r6 = "threads"
            r7 = 4
            r5.insertWithOnConflict(r6, r9, r0, r7)     // Catch:{ all -> 0x028e }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x028e }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.data.t r6 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x028e }
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x028e }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x028e }
            r5.endTransaction()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x01f5
            r5.close()     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
        L_0x01f5:
            monitor-exit(r16)
            return r0
        L_0x01f7:
            com.google.common.b.ij r9 = r10.keySet()     // Catch:{ all -> 0x028e }
            com.google.common.b.gu r9 = r9.mo55229u()     // Catch:{ all -> 0x028e }
            java.lang.Object r9 = r9.get(r4)     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.data.r r9 = (com.google.android.libraries.notifications.data.C29827r) r9     // Catch:{ all -> 0x028e }
            java.lang.Long r11 = r9.mo35060h()     // Catch:{ all -> 0x028e }
            long r11 = r11.longValue()     // Catch:{ all -> 0x028e }
            java.lang.Long r13 = r18.mo35060h()     // Catch:{ all -> 0x028e }
            long r13 = r13.longValue()     // Catch:{ all -> 0x028e }
            java.lang.Long r15 = r9.mo35060h()     // Catch:{ all -> 0x028e }
            java.lang.Long r4 = r18.mo35060h()     // Catch:{ all -> 0x028e }
            boolean r4 = r15.equals(r4)     // Catch:{ all -> 0x028e }
            if (r4 == 0) goto L_0x022b
            boolean r4 = r9.equals(r2)     // Catch:{ all -> 0x028e }
            if (r4 != 0) goto L_0x022b
            r4 = 1
            goto L_0x022c
        L_0x022b:
            r4 = 0
        L_0x022c:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0248
            if (r19 == 0) goto L_0x0235
            if (r4 == 0) goto L_0x0235
            goto L_0x0248
        L_0x0235:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.data.t r4 = com.google.android.libraries.notifications.data.C29829t.REJECTED_SAME_VERSION     // Catch:{ all -> 0x028e }
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x028e }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x028e }
            r5.endTransaction()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x0246
            r5.close()     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
        L_0x0246:
            monitor-exit(r16)
            return r0
        L_0x0248:
            java.lang.String r4 = "threads"
            r11 = r6
            com.google.android.libraries.an.a.a r11 = (com.google.android.libraries.p11027an.p11028a.C147765a) r11     // Catch:{ all -> 0x028e }
            java.lang.String r11 = r11.f398710a     // Catch:{ all -> 0x028e }
            java.lang.String[] r6 = r6.mo124444c()     // Catch:{ all -> 0x028e }
            r5.update(r4, r0, r11, r6)     // Catch:{ all -> 0x028e }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x028e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x028e }
            long r10 = r0.longValue()     // Catch:{ all -> 0x028e }
            long r7 = r7 & r10
            r10 = 0
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x026d
            com.google.android.libraries.notifications.data.t r0 = com.google.android.libraries.notifications.data.C29829t.REPLACED     // Catch:{ all -> 0x028e }
            goto L_0x026f
        L_0x026d:
            com.google.android.libraries.notifications.data.t r0 = com.google.android.libraries.notifications.data.C29829t.INSERTED     // Catch:{ all -> 0x028e }
        L_0x026f:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x028e }
            com.google.android.libraries.notifications.data.t r6 = com.google.android.libraries.notifications.data.C29829t.REPLACED     // Catch:{ all -> 0x028e }
            if (r0 != r6) goto L_0x027a
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ all -> 0x028e }
            goto L_0x027c
        L_0x027a:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x028e }
        L_0x027c:
            r4.<init>(r0, r6)     // Catch:{ all -> 0x028e }
            r5.endTransaction()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x0287
            r5.close()     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
        L_0x0287:
            monitor-exit(r16)
            return r4
        L_0x0289:
            throw r9     // Catch:{ all -> 0x028e }
        L_0x028a:
            throw r9     // Catch:{ all -> 0x028e }
        L_0x028b:
            throw r9     // Catch:{ all -> 0x028e }
        L_0x028c:
            throw r9     // Catch:{ all -> 0x028e }
        L_0x028d:
            throw r9     // Catch:{ all -> 0x028e }
        L_0x028e:
            r0 = move-exception
            r5.endTransaction()     // Catch:{ all -> 0x0293 }
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x0293:
            r0 = move-exception
            r4 = r0
            if (r5 == 0) goto L_0x02a0
            r5.close()     // Catch:{ all -> 0x029b }
            goto L_0x02a0
        L_0x029b:
            r0 = move-exception
            r5 = r0
            com.google.android.libraries.notifications.data.impl.C29808m.m55052a(r4, r5)     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
        L_0x02a0:
            throw r4     // Catch:{ RuntimeException -> 0x02a5, m -> 0x02a3 }
        L_0x02a1:
            r0 = move-exception
            goto L_0x02bd
        L_0x02a3:
            r0 = move-exception
            goto L_0x02a6
        L_0x02a5:
            r0 = move-exception
        L_0x02a6:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a1 }
            r4 = 0
            r3[r4] = r2     // Catch:{ all -> 0x02a1 }
            java.lang.String r2 = "ChimeThreadStorageHelper"
            java.lang.String r4 = "Error inserting ChimeThread for account, %s"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r2, r0, r4, r3)     // Catch:{ all -> 0x02a1 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x02a1 }
            com.google.android.libraries.notifications.data.t r2 = com.google.android.libraries.notifications.data.C29829t.REJECTED_DB_ERROR     // Catch:{ all -> 0x02a1 }
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x02a1 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x02a1 }
            monitor-exit(r16)
            return r0
        L_0x02bd:
            monitor-exit(r16)
            goto L_0x02c0
        L_0x02bf:
            throw r0
        L_0x02c0:
            goto L_0x02bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29809n.mo35108c(com.google.android.libraries.notifications.data.k, com.google.android.libraries.notifications.data.r, boolean):android.util.Pair");
    }

    /* renamed from: d */
    public final synchronized void mo35109d(C29820k kVar) {
        try {
            this.f80823a.deleteDatabase(m55053f(kVar).getDatabaseName());
        } catch (C29822m | RuntimeException e) {
            C30058b.m55792d("ChimeThreadStorageHelper", e, "Error deleting database for account", new Object[0]);
        }
    }

    /* renamed from: e */
    public final synchronized void mo35110e(C29820k kVar, List list) {
        try {
            SQLiteDatabase writableDatabase = m55053f(kVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C147766b bVar = (C147766b) it.next();
                    writableDatabase.delete("threads", bVar.mo124439a(), bVar.mo124444c());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (C29822m | RuntimeException e) {
            C30058b.m55792d("ChimeThreadStorageHelper", e, "Error deleting ChimeThreads for account. Queries: %s", list);
        } catch (Throwable th2) {
            C29808m.m55052a(th, th2);
        }
    }
}
