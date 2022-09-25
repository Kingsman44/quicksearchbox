package com.google.android.libraries.p10923ac.p10925b.p10946m;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146792e;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146793f;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147079b;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147081d;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147091n;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147114k;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147136ak;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.p4522b.C58490gz;
import com.google.protos.p4895aw.p4902b.C64091i;
import com.google.protos.p4895aw.p4902b.C64093k;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.m.e */
/* compiled from: PG */
public final class C147187e implements C147198p {

    /* renamed from: a */
    private final C68214a f397374a;

    /* renamed from: b */
    private final C68214a f397375b;

    /* renamed from: c */
    private final Map f397376c;

    /* renamed from: d */
    private final C68214a f397377d;

    /* renamed from: e */
    private final C68214a f397378e;

    /* renamed from: f */
    private final C68214a f397379f;

    /* renamed from: g */
    private final C147079b f397380g;

    /* renamed from: h */
    private final Object f397381h = new Object();

    /* renamed from: i */
    private Set f397382i;

    /* renamed from: j */
    private final C147091n f397383j;

    /* renamed from: k */
    private final C147081d f397384k;

    public C147187e(C68214a aVar, C68214a aVar2, C147091n nVar, Map map, C68214a aVar3, C68214a aVar4, C68214a aVar5, C147079b bVar, C147081d dVar) {
        this.f397374a = aVar;
        this.f397375b = aVar2;
        this.f397383j = nVar;
        this.f397376c = map;
        this.f397377d = aVar3;
        this.f397378e = aVar4;
        this.f397380g = bVar;
        this.f397384k = dVar;
        this.f397379f = aVar5;
    }

    /* renamed from: e */
    private final String m240025e(C64098p pVar) {
        return ((C146792e) this.f397376c.get(C64097o.m96355a(pVar.f173294a))).mo123637a(pVar);
    }

    /* renamed from: f */
    private final Map m240026f(C64093k kVar) {
        C58490gz gzVar = new C58490gz(4);
        for (C64091i iVar : kVar.f173282a) {
            C64098p pVar = iVar.f173275d;
            if (pVar == null) {
                pVar = C64098p.f173292c;
            }
            if (C64097o.m96355a(pVar.f173294a) == C64097o.CHANNELID_NOT_SET) {
                ((C147256m) this.f397374a.mo27525b()).mo124064g("Skipping wipeout for unknown channel", new Object[0]);
            } else if (!this.f397376c.containsKey(C64097o.m96355a(pVar.f173294a))) {
                ((C147256m) this.f397374a.mo27525b()).mo124067j("Skipping wipeout for unsupported channel: ", C64097o.m96355a(pVar.f173294a));
            } else {
                gzVar.mo55429h(m240025e(pVar), iVar);
            }
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: g */
    private final void m240027g() {
        if (C147266a.m240136g()) {
            this.f397384k.mo123906a();
            return;
        }
        try {
            this.f397380g.mo123886b();
        } catch (C147075at e) {
            ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to clear wipeout metadata", e, new Object[0]);
            m240029i();
        }
    }

    /* renamed from: h */
    private final boolean m240028h(Account account, C64098p pVar, boolean z) {
        try {
            ((C147136ak) this.f397378e.mo27525b()).mo123967c(pVar, account);
            ((C146793f) ((Map) this.f397379f.mo27525b()).get(C64097o.m96355a(pVar.f173294a))).mo123638a(account, pVar);
            if (z) {
                for (C147112i h : ((C147116m) this.f397377d.mo27525b()).mo123935c(account, pVar)) {
                    ((C147116m) this.f397377d.mo27525b()).mo123937e(h.mo123930h(), account, pVar, C147114k.WIPEOUT);
                }
            }
            return true;
        } catch (Exception e) {
            if (((C147256m) this.f397374a.mo27525b()).f397497a) {
                ((C147256m) this.f397374a.mo27525b()).mo124061d("Failed to wipe local state for channel=%s, account=%s", e, pVar, account);
            } else {
                ((C147256m) this.f397374a.mo27525b()).mo124060c("Failed to wipe local state", new Object[0]);
            }
            m240029i();
            return false;
        }
    }

    /* renamed from: i */
    private final void m240029i() {
        C147244a aVar = (C147244a) this.f397375b.mo27525b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r14.f397374a.mo27525b()).mo124061d("Failed to parse channel id proto.", r15, new java.lang.Object[0]);
        m240027g();
        m240029i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        throw r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x002d, B:15:0x0073] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124010a(com.google.protos.p4895aw.p4902b.C64093k r15) {
        /*
            r14 = this;
            java.lang.String r0 = "Failed to enforce wipeout policy"
            r1 = 0
            com.google.android.libraries.ac.b.i.n r2 = r14.f397383j     // Catch:{ at -> 0x00ec }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo123913a()     // Catch:{ at -> 0x00ec }
            java.lang.String r4 = "wipeout"
            r2 = 4
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r2 = "account"
            r5[r1] = r2     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r2 = "channel_key"
            r11 = 1
            r5[r11] = r2     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r2 = "last_sync_timestamp"
            r12 = 2
            r5[r12] = r2     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r2 = "channel_id"
            r13 = 3
            r5[r13] = r2     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "last_sync_timestamp IS NOT NULL"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00d0 }
            if (r2 != 0) goto L_0x0047
            dagger.a r15 = r14.f397374a     // Catch:{ all -> 0x00c4 }
            java.lang.Object r15 = r15.mo27525b()     // Catch:{ all -> 0x00c4 }
            com.google.android.libraries.ac.d.b.b.d.m r15 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r15     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "Query to %s returned null cursor."
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "wipeout"
            r4[r1] = r5     // Catch:{ all -> 0x00c4 }
            r15.mo124060c(r3, r4)     // Catch:{ all -> 0x00c4 }
            r14.m240027g()     // Catch:{ all -> 0x00c4 }
            r14.m240029i()     // Catch:{ all -> 0x00c4 }
            return
        L_0x0047:
            java.util.Map r15 = r14.m240026f(r15)     // Catch:{ all -> 0x00c4 }
            r2.moveToFirst()     // Catch:{ all -> 0x00c4 }
        L_0x004e:
            boolean r3 = r2.isAfterLast()     // Catch:{ all -> 0x00c4 }
            if (r3 != 0) goto L_0x00c0
            android.accounts.Account r3 = new android.accounts.Account     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r2.getString(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "com.google"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r2.getString(r11)     // Catch:{ all -> 0x00c4 }
            java.lang.Object r4 = r15.get(r4)     // Catch:{ all -> 0x00c4 }
            com.google.protos.aw.b.i r4 = (com.google.protos.p4895aw.p4902b.C64091i) r4     // Catch:{ all -> 0x00c4 }
            long r5 = r2.getLong(r12)     // Catch:{ all -> 0x00c4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00c4 }
            if (r4 != 0) goto L_0x009d
            byte[] r4 = r2.getBlob(r13)     // Catch:{ ct -> 0x0083 }
            com.google.protos.aw.b.p r5 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ ct -> 0x0083 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r4)     // Catch:{ ct -> 0x0083 }
            com.google.protos.aw.b.p r4 = (com.google.protos.p4895aw.p4902b.C64098p) r4     // Catch:{ ct -> 0x0083 }
            r14.m240028h(r3, r4, r11)     // Catch:{ ct -> 0x0083 }
            goto L_0x00bc
        L_0x0083:
            r15 = move-exception
            dagger.a r3 = r14.f397374a     // Catch:{ all -> 0x00c4 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x00c4 }
            com.google.android.libraries.ac.d.b.b.d.m r3 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r3     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "Failed to parse channel id proto."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c4 }
            r3.mo124061d(r4, r15, r5)     // Catch:{ all -> 0x00c4 }
            r14.m240027g()     // Catch:{ all -> 0x00c4 }
            r14.m240029i()     // Catch:{ all -> 0x00c4 }
            r2.close()     // Catch:{ SQLiteException -> 0x00d0 }
            return
        L_0x009d:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c4 }
            long r8 = r5.longValue()     // Catch:{ all -> 0x00c4 }
            long r6 = r6 - r8
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x00c4 }
            int r8 = r4.f173278g     // Catch:{ all -> 0x00c4 }
            long r8 = (long) r8     // Catch:{ all -> 0x00c4 }
            long r8 = r5.toMillis(r8)     // Catch:{ all -> 0x00c4 }
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00bc
            com.google.protos.aw.b.p r4 = r4.f173275d     // Catch:{ all -> 0x00c4 }
            if (r4 != 0) goto L_0x00b9
            com.google.protos.aw.b.p r4 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ all -> 0x00c4 }
        L_0x00b9:
            r14.m240028h(r3, r4, r1)     // Catch:{ all -> 0x00c4 }
        L_0x00bc:
            r2.moveToNext()     // Catch:{ all -> 0x00c4 }
            goto L_0x004e
        L_0x00c0:
            r2.close()     // Catch:{ SQLiteException -> 0x00d0 }
            return
        L_0x00c4:
            r15 = move-exception
            if (r2 == 0) goto L_0x00cf
            r2.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r2 = move-exception
            com.google.android.libraries.p10923ac.p10925b.p10946m.C147184b.m240018a(r15, r2)     // Catch:{ SQLiteException -> 0x00d0 }
        L_0x00cf:
            throw r15     // Catch:{ SQLiteException -> 0x00d0 }
        L_0x00d0:
            r15 = move-exception
            dagger.a r2 = r14.f397374a
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.mo124063f(r0, r15, r1)
            boolean r0 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240142m()
            if (r0 == 0) goto L_0x00eb
            r14.m240027g()
            r14.m240029i()
            return
        L_0x00eb:
            throw r15
        L_0x00ec:
            r15 = move-exception
            dagger.a r2 = r14.f397374a
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.mo124063f(r0, r15, r1)
            r14.m240027g()
            r14.m240029i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10946m.C147187e.mo124010a(com.google.protos.aw.b.k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r11.removeAll(r1.f397382i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r4 = r1.f397383j.mo123914b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r0 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x017a, code lost:
        if (r0.hasNext() == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x017c, code lost:
        r5 = (com.google.android.libraries.p10923ac.p10925b.p10946m.C147185c) r0.next();
        r4.delete("wipeout", "account = ? AND channel_key = ?", new java.lang.String[]{r5.mo124005a().name, r5.mo124006b()});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019a, code lost:
        r4.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1.f397374a.mo27525b()).mo124063f("Failed to remove wipeout entries", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b8, code lost:
        if (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240142m() != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ba, code lost:
        m240027g();
        m240029i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c7, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1.f397374a.mo27525b()).mo124061d("Failed to remove wipeout entries", r0, new java.lang.Object[0]);
        m240027g();
        m240029i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01f7, code lost:
        monitor-enter(r1.f397381h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r1.f397382i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1.f397374a.mo27525b()).mo124060c("Query to %s returned null cursor.", "wipeout");
        m240027g();
        m240029i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r2 = r1.f397381h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.f397382i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = m240026f(r18);
        r3.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r3.isAfterLast() != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        r4 = new android.accounts.Account(r3.getString(0), "com.google");
        r5 = r3.getString(1);
        r6 = (com.google.protos.p4895aw.p4902b.C64091i) r0.get(r5);
        r7 = java.lang.Long.valueOf(r3.getLong(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r6 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (m240028h(r4, (com.google.protos.p4895aw.p4902b.C64098p) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.protos.p4895aw.p4902b.C64098p.f173292c, r3.getBlob(3)), true) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        r11.add(new com.google.android.libraries.p10923ac.p10925b.p10946m.C147183a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1.f397374a.mo27525b()).mo124061d("Failed to parse channel id proto.", r0, new java.lang.Object[0]);
        m240027g();
        m240029i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        monitor-enter(r1.f397381h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f397382i = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis((long) r6.f173278g)) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r7 = r6.f173275d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r7 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
        r7 = com.google.protos.p4895aw.p4902b.C64098p.f173292c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fa, code lost:
        if (m240028h(r4, r7, false) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fc, code lost:
        r11.add(new com.google.android.libraries.p10923ac.p10925b.p10946m.C147183a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        if (r19.contains(r4) != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        r6 = r6.f173275d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        if (r6 != null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        r6 = com.google.protos.p4895aw.p4902b.C64098p.f173292c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0116, code lost:
        if (m240028h(r4, r6, true) == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        r11.add(new com.google.android.libraries.p10923ac.p10925b.p10946m.C147183a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        r3.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0123, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015e, code lost:
        if (r3 != null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r3 = r1.f397381h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0163, code lost:
        monitor-enter(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124011b(com.google.protos.p4895aw.p4902b.C64093k r18, java.util.Set r19) {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240141l()
            if (r0 == 0) goto L_0x0217
            r2 = 0
            com.google.android.libraries.ac.b.i.n r0 = r1.f397383j     // Catch:{ at -> 0x0200 }
            android.database.sqlite.SQLiteDatabase r3 = r0.mo123913a()     // Catch:{ at -> 0x0200 }
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r12 = 2
            r13 = 1
            r14 = 0
            java.lang.Object r15 = r1.f397381h     // Catch:{ SQLiteException -> 0x0141, all -> 0x013d }
            monitor-enter(r15)     // Catch:{ SQLiteException -> 0x0141, all -> 0x013d }
            java.util.Set r0 = r1.f397382i     // Catch:{ all -> 0x0139 }
            if (r0 != 0) goto L_0x0131
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0139 }
            r0.<init>()     // Catch:{ all -> 0x0139 }
            r1.f397382i = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r4 = "wipeout"
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "account"
            r5[r2] = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "channel_key"
            r5[r13] = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "last_sync_timestamp"
            r5[r12] = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "channel_id"
            r10 = 3
            r5[r10] = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "last_sync_timestamp IS NOT NULL"
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = 0
            r10 = r0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0139 }
            monitor-exit(r15)     // Catch:{ all -> 0x012f }
            if (r3 != 0) goto L_0x006c
            dagger.a r0 = r1.f397374a     // Catch:{ SQLiteException -> 0x012d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ SQLiteException -> 0x012d }
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r4 = "Query to %s returned null cursor."
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r6 = "wipeout"
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x012d }
            r0.mo124060c(r4, r5)     // Catch:{ SQLiteException -> 0x012d }
            r17.m240027g()     // Catch:{ SQLiteException -> 0x012d }
            r17.m240029i()     // Catch:{ SQLiteException -> 0x012d }
            java.lang.Object r2 = r1.f397381h
            monitor-enter(r2)
            r1.f397382i = r14     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x0069:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x006c:
            java.util.Map r0 = r17.m240026f(r18)     // Catch:{ SQLiteException -> 0x012d }
            r3.moveToFirst()     // Catch:{ SQLiteException -> 0x012d }
        L_0x0073:
            boolean r4 = r3.isAfterLast()     // Catch:{ SQLiteException -> 0x012d }
            if (r4 != 0) goto L_0x0126
            android.accounts.Account r4 = new android.accounts.Account     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r5 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r6 = "com.google"
            r4.<init>(r5, r6)     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r5 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x012d }
            java.lang.Object r6 = r0.get(r5)     // Catch:{ SQLiteException -> 0x012d }
            com.google.protos.aw.b.i r6 = (com.google.protos.p4895aw.p4902b.C64091i) r6     // Catch:{ SQLiteException -> 0x012d }
            long r7 = r3.getLong(r12)     // Catch:{ SQLiteException -> 0x012d }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x012d }
            if (r6 != 0) goto L_0x00d9
            r8 = 3
            byte[] r6 = r3.getBlob(r8)     // Catch:{ ct -> 0x00b6 }
            com.google.protos.aw.b.p r7 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ ct -> 0x00b6 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r6)     // Catch:{ ct -> 0x00b6 }
            com.google.protos.aw.b.p r6 = (com.google.protos.p4895aw.p4902b.C64098p) r6     // Catch:{ ct -> 0x00b6 }
            boolean r6 = r1.m240028h(r4, r6, r13)     // Catch:{ ct -> 0x00b6 }
            if (r6 == 0) goto L_0x00b3
            com.google.android.libraries.ac.b.m.a r6 = new com.google.android.libraries.ac.b.m.a     // Catch:{ ct -> 0x00b6 }
            r6.<init>(r4, r5)     // Catch:{ ct -> 0x00b6 }
            r11.add(r6)     // Catch:{ ct -> 0x00b6 }
        L_0x00b3:
            r7 = r19
            goto L_0x0120
        L_0x00b6:
            r0 = move-exception
            dagger.a r4 = r1.f397374a     // Catch:{ SQLiteException -> 0x012d }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ SQLiteException -> 0x012d }
            com.google.android.libraries.ac.d.b.b.d.m r4 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r4     // Catch:{ SQLiteException -> 0x012d }
            java.lang.String r5 = "Failed to parse channel id proto."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x012d }
            r4.mo124061d(r5, r0, r6)     // Catch:{ SQLiteException -> 0x012d }
            r17.m240027g()     // Catch:{ SQLiteException -> 0x012d }
            r17.m240029i()     // Catch:{ SQLiteException -> 0x012d }
            r3.close()     // Catch:{ all -> 0x01f4 }
            java.lang.Object r2 = r1.f397381h
            monitor-enter(r2)
            r1.f397382i = r14     // Catch:{ all -> 0x00d6 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            throw r0
        L_0x00d9:
            r8 = 3
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x012d }
            long r15 = r7.longValue()     // Catch:{ SQLiteException -> 0x012d }
            long r9 = r9 - r15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SQLiteException -> 0x012d }
            int r15 = r6.f173278g     // Catch:{ SQLiteException -> 0x012d }
            long r14 = (long) r15     // Catch:{ SQLiteException -> 0x012d }
            long r14 = r7.toMillis(r14)     // Catch:{ SQLiteException -> 0x012d }
            int r7 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0104
            com.google.protos.aw.b.p r7 = r6.f173275d     // Catch:{ SQLiteException -> 0x012d }
            if (r7 != 0) goto L_0x00f6
            com.google.protos.aw.b.p r7 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ SQLiteException -> 0x012d }
        L_0x00f6:
            boolean r7 = r1.m240028h(r4, r7, r2)     // Catch:{ SQLiteException -> 0x012d }
            if (r7 == 0) goto L_0x0104
            com.google.android.libraries.ac.b.m.a r7 = new com.google.android.libraries.ac.b.m.a     // Catch:{ SQLiteException -> 0x012d }
            r7.<init>(r4, r5)     // Catch:{ SQLiteException -> 0x012d }
            r11.add(r7)     // Catch:{ SQLiteException -> 0x012d }
        L_0x0104:
            r7 = r19
            boolean r9 = r7.contains(r4)     // Catch:{ SQLiteException -> 0x012d }
            if (r9 != 0) goto L_0x0120
            com.google.protos.aw.b.p r6 = r6.f173275d     // Catch:{ SQLiteException -> 0x012d }
            if (r6 != 0) goto L_0x0112
            com.google.protos.aw.b.p r6 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ SQLiteException -> 0x012d }
        L_0x0112:
            boolean r6 = r1.m240028h(r4, r6, r13)     // Catch:{ SQLiteException -> 0x012d }
            if (r6 == 0) goto L_0x0120
            com.google.android.libraries.ac.b.m.a r6 = new com.google.android.libraries.ac.b.m.a     // Catch:{ SQLiteException -> 0x012d }
            r6.<init>(r4, r5)     // Catch:{ SQLiteException -> 0x012d }
            r11.add(r6)     // Catch:{ SQLiteException -> 0x012d }
        L_0x0120:
            r3.moveToNext()     // Catch:{ SQLiteException -> 0x012d }
            r14 = 0
            goto L_0x0073
        L_0x0126:
            r3.close()     // Catch:{ all -> 0x01f4 }
            goto L_0x0161
        L_0x012a:
            r0 = move-exception
            goto L_0x01ee
        L_0x012d:
            r0 = move-exception
            goto L_0x0143
        L_0x012f:
            r0 = move-exception
            goto L_0x013b
        L_0x0131:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "Concurrent wipeout is not allowed."
            r0.<init>(r3)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            r3 = 0
        L_0x013b:
            monitor-exit(r15)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ SQLiteException -> 0x012d }
        L_0x013d:
            r0 = move-exception
            r3 = 0
            goto L_0x01ee
        L_0x0141:
            r0 = move-exception
            r3 = 0
        L_0x0143:
            dagger.a r4 = r1.f397374a     // Catch:{ all -> 0x012a }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x012a }
            com.google.android.libraries.ac.d.b.b.d.m r4 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r4     // Catch:{ all -> 0x012a }
            java.lang.String r5 = "Failed to enforce wipeout policy"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            r4.mo124063f(r5, r0, r6)     // Catch:{ all -> 0x012a }
            boolean r4 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240142m()     // Catch:{ all -> 0x012a }
            if (r4 == 0) goto L_0x01ed
            r17.m240027g()     // Catch:{ all -> 0x012a }
            r17.m240029i()     // Catch:{ all -> 0x012a }
            if (r3 == 0) goto L_0x0161
            goto L_0x0126
        L_0x0161:
            java.lang.Object r3 = r1.f397381h     // Catch:{ all -> 0x01f4 }
            monitor-enter(r3)     // Catch:{ all -> 0x01f4 }
            java.util.Set r0 = r1.f397382i     // Catch:{ all -> 0x01ea }
            r11.removeAll(r0)     // Catch:{ all -> 0x01ea }
            com.google.android.libraries.ac.b.i.n r0 = r1.f397383j     // Catch:{ at -> 0x01c6 }
            android.database.sqlite.SQLiteDatabase r4 = r0.mo123914b()     // Catch:{ at -> 0x01c6 }
            r4.beginTransaction()     // Catch:{ all -> 0x01ea }
            java.util.Iterator r0 = r11.iterator()     // Catch:{ SQLiteException -> 0x01a4 }
        L_0x0176:
            boolean r5 = r0.hasNext()     // Catch:{ SQLiteException -> 0x01a4 }
            if (r5 == 0) goto L_0x019a
            java.lang.Object r5 = r0.next()     // Catch:{ SQLiteException -> 0x01a4 }
            com.google.android.libraries.ac.b.m.c r5 = (com.google.android.libraries.p10923ac.p10925b.p10946m.C147185c) r5     // Catch:{ SQLiteException -> 0x01a4 }
            java.lang.String r6 = "wipeout"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01a4 }
            android.accounts.Account r8 = r5.mo124005a()     // Catch:{ SQLiteException -> 0x01a4 }
            java.lang.String r8 = r8.name     // Catch:{ SQLiteException -> 0x01a4 }
            r7[r2] = r8     // Catch:{ SQLiteException -> 0x01a4 }
            java.lang.String r5 = r5.mo124006b()     // Catch:{ SQLiteException -> 0x01a4 }
            r7[r13] = r5     // Catch:{ SQLiteException -> 0x01a4 }
            java.lang.String r5 = "account = ? AND channel_key = ?"
            r4.delete(r6, r5, r7)     // Catch:{ SQLiteException -> 0x01a4 }
            goto L_0x0176
        L_0x019a:
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x01a4 }
        L_0x019d:
            r4.endTransaction()     // Catch:{ all -> 0x01ea }
        L_0x01a0:
            r2 = 0
            goto L_0x01dd
        L_0x01a2:
            r0 = move-exception
            goto L_0x01c2
        L_0x01a4:
            r0 = move-exception
            dagger.a r5 = r1.f397374a     // Catch:{ all -> 0x01a2 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ all -> 0x01a2 }
            com.google.android.libraries.ac.d.b.b.d.m r5 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r5     // Catch:{ all -> 0x01a2 }
            java.lang.String r6 = "Failed to remove wipeout entries"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a2 }
            r5.mo124063f(r6, r0, r2)     // Catch:{ all -> 0x01a2 }
            boolean r2 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240142m()     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x01c1
            r17.m240027g()     // Catch:{ all -> 0x01a2 }
            r17.m240029i()     // Catch:{ all -> 0x01a2 }
            goto L_0x019d
        L_0x01c1:
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01c2:
            r4.endTransaction()     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01c6:
            r0 = move-exception
            dagger.a r4 = r1.f397374a     // Catch:{ all -> 0x01ea }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x01ea }
            com.google.android.libraries.ac.d.b.b.d.m r4 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r4     // Catch:{ all -> 0x01ea }
            java.lang.String r5 = "Failed to remove wipeout entries"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ea }
            r4.mo124061d(r5, r0, r2)     // Catch:{ all -> 0x01ea }
            r17.m240027g()     // Catch:{ all -> 0x01ea }
            r17.m240029i()     // Catch:{ all -> 0x01ea }
            goto L_0x01a0
        L_0x01dd:
            r1.f397382i = r2     // Catch:{ all -> 0x01ea }
            monitor-exit(r3)     // Catch:{ all -> 0x01ea }
            java.lang.Object r4 = r1.f397381h
            monitor-enter(r4)
            r1.f397382i = r2     // Catch:{ all -> 0x01e7 }
            monitor-exit(r4)     // Catch:{ all -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e7 }
            throw r0
        L_0x01ea:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01ed:
            throw r0     // Catch:{ all -> 0x012a }
        L_0x01ee:
            if (r3 == 0) goto L_0x01f3
            r3.close()     // Catch:{ all -> 0x01f4 }
        L_0x01f3:
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            java.lang.Object r3 = r1.f397381h
            monitor-enter(r3)
            r2 = 0
            r1.f397382i = r2     // Catch:{ all -> 0x01fd }
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            throw r0
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01fd }
            throw r0
        L_0x0200:
            r0 = move-exception
            dagger.a r3 = r1.f397374a
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r3 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r3
            java.lang.String r4 = "Failed to enforce wipeout policy"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3.mo124063f(r4, r0, r2)
            r17.m240027g()
            r17.m240029i()
            return
        L_0x0217:
            r17.mo124010a(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10946m.C147187e.mo124011b(com.google.protos.aw.b.k, java.util.Set):void");
    }

    /* renamed from: c */
    public final void mo124012c(Account account, C64098p pVar) {
        Cursor query;
        Throwable th;
        Object obj;
        Cursor query2;
        Throwable th2;
        Account account2 = account;
        C64098p pVar2 = pVar;
        if (C147266a.m240141l()) {
            String e = m240025e(pVar2);
            try {
                SQLiteDatabase b = this.f397383j.mo123914b();
                try {
                    Object obj2 = this.f397381h;
                    synchronized (obj2) {
                        try {
                            Set set = this.f397382i;
                            if (set != null) {
                                set.add(new C147183a(account2, e));
                            }
                            b.beginTransaction();
                            try {
                                obj = obj2;
                                try {
                                    query2 = b.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, e}, (String) null, (String) null, (String) null);
                                    if (query2 != null) {
                                        if (!query2.moveToFirst()) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("account", account2.name);
                                            contentValues.put("channel_key", e);
                                            contentValues.put("channel_id", pVar.toByteArray());
                                            contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            b.insert("wipeout", (String) null, contentValues);
                                        } else if (query2.isNull(0)) {
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            b.update("wipeout", contentValues2, "account = ? AND channel_key = ?", new String[]{account2.name, e});
                                        }
                                        b.setTransactionSuccessful();
                                        query2.close();
                                        b.endTransaction();
                                        return;
                                    }
                                    throw new SQLiteException("Cursor is null");
                                } catch (Throwable th3) {
                                    th = th3;
                                    b.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                                b.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                } catch (SQLiteException e2) {
                    ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to mark remote data persisted", e2, new Object[0]);
                    if (C147266a.m240142m()) {
                        m240027g();
                        m240029i();
                        return;
                    }
                    throw e2;
                }
            } catch (C147075at e3) {
                ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to mark remote data persisted", e3, new Object[0]);
                m240027g();
                m240029i();
                return;
            }
        } else {
            String e4 = m240025e(pVar2);
            try {
                SQLiteDatabase b2 = this.f397383j.mo123914b();
                b2.beginTransaction();
                try {
                    query = b2.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, e4}, (String) null, (String) null, (String) null);
                    if (query == null) {
                        ((C147256m) this.f397374a.mo27525b()).mo124060c("Query to %s returned null cursor.", "wipeout");
                        m240027g();
                        m240029i();
                        b2.endTransaction();
                        return;
                    }
                    if (!query.moveToFirst()) {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("account", account2.name);
                        contentValues3.put("channel_key", e4);
                        contentValues3.put("channel_id", pVar.toByteArray());
                        contentValues3.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        b2.insert("wipeout", (String) null, contentValues3);
                    } else if (query.isNull(0)) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        b2.update("wipeout", contentValues4, "account = ? AND channel_key = ?", new String[]{account2.name, e4});
                    }
                    b2.setTransactionSuccessful();
                    query.close();
                    b2.endTransaction();
                    return;
                } catch (SQLiteException e5) {
                    try {
                        ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to mark remote data persisted", e5, new Object[0]);
                        if (C147266a.m240142m()) {
                            m240027g();
                            m240029i();
                            return;
                        }
                        throw e5;
                    } finally {
                        b2.endTransaction();
                    }
                } catch (Throwable th6) {
                    C147184b.m240018a(th, th6);
                }
            } catch (C147075at e6) {
                ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to mark remote data persisted", e6, new Object[0]);
                m240027g();
                m240029i();
                return;
            }
        }
        throw th;
        throw th2;
    }

    /* renamed from: d */
    public final void mo124013d(Account account, C64098p pVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
        if (C147266a.m240141l()) {
            String e = m240025e(pVar);
            try {
                SQLiteDatabase b = this.f397383j.mo123914b();
                try {
                    synchronized (this.f397381h) {
                        Set set = this.f397382i;
                        if (set != null) {
                            set.add(new C147183a(account, e));
                        }
                        try {
                            b.beginTransaction();
                            if (b.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, e}) == 0) {
                                ContentValues contentValues2 = new ContentValues(contentValues);
                                contentValues2.put("account", account.name);
                                contentValues2.put("channel_key", e);
                                contentValues2.put("channel_id", pVar.toByteArray());
                                b.insert("wipeout", (String) null, contentValues2);
                            }
                            b.setTransactionSuccessful();
                        } finally {
                            b.endTransaction();
                        }
                    }
                } catch (SQLiteException e2) {
                    ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to update wipeout data", e2, new Object[0]);
                    if (C147266a.m240142m()) {
                        m240027g();
                        m240029i();
                        return;
                    }
                    throw e2;
                }
            } catch (C147075at e3) {
                ((C147256m) this.f397374a.mo27525b()).mo124061d("Failed to update wipeout data", e3, new Object[0]);
                m240027g();
                m240029i();
            }
        } else {
            String e4 = m240025e(pVar);
            try {
                SQLiteDatabase b2 = this.f397383j.mo123914b();
                b2.beginTransaction();
                try {
                    if (b2.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, e4}) == 0) {
                        ContentValues contentValues3 = new ContentValues(contentValues);
                        contentValues3.put("account", account.name);
                        contentValues3.put("channel_key", e4);
                        contentValues3.put("channel_id", pVar.toByteArray());
                        b2.insert("wipeout", (String) null, contentValues3);
                    }
                    b2.setTransactionSuccessful();
                } catch (SQLiteException e5) {
                    ((C147256m) this.f397374a.mo27525b()).mo124063f("Failed to update wipeout data", e5, new Object[0]);
                    if (C147266a.m240142m()) {
                        m240027g();
                        m240029i();
                        return;
                    }
                    throw e5;
                } finally {
                    b2.endTransaction();
                }
            } catch (C147075at e6) {
                ((C147256m) this.f397374a.mo27525b()).mo124061d("Failed to update wipeout data", e6, new Object[0]);
                m240027g();
                m240029i();
            }
        }
    }
}
