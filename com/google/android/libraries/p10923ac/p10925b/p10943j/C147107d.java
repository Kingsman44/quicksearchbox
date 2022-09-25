package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.accounts.Account;
import android.database.Cursor;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146792e;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147091n;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147176j;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4895aw.p4902b.C64046db;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.j.d */
/* compiled from: PG */
public final class C147107d implements C147116m {

    /* renamed from: a */
    private static final String[] f397179a = {"app_id", "account", "channel", "value"};

    /* renamed from: b */
    private final Object f397180b = new Object();

    /* renamed from: c */
    private final C68214a f397181c;

    /* renamed from: d */
    private final C68214a f397182d;

    /* renamed from: e */
    private final C147179m f397183e;

    /* renamed from: f */
    private final Map f397184f;

    /* renamed from: g */
    private final C68214a f397185g;

    /* renamed from: h */
    private final C68214a f397186h;

    /* renamed from: i */
    private final C147091n f397187i;

    public C147107d(C68214a aVar, C68214a aVar2, C147179m mVar, C147091n nVar, Map map, C68214a aVar3, C68214a aVar4) {
        this.f397181c = aVar;
        this.f397182d = aVar2;
        this.f397183e = mVar;
        this.f397187i = nVar;
        this.f397184f = map;
        this.f397185g = aVar3;
        this.f397186h = aVar4;
    }

    /* renamed from: i */
    private final C147112i m239855i(String str, Account account, C64098p pVar, C147105b bVar) {
        Account account2 = account;
        C64098p pVar2 = pVar;
        C147105b bVar2 = bVar;
        try {
            Cursor query = this.f397187i.mo123913a().query("subscription", new String[]{"value"}, "app_id = ? AND account = ? AND channel = ?", new String[]{str, account2.name, m239857k(pVar2)}, (String) null, (String) null, (String) null);
            C147104a aVar = null;
            if (query == null) {
                return null;
            }
            try {
                query.moveToFirst();
                if (!query.isAfterLast()) {
                    C64046db dbVar = (C64046db) C62942bv.parseFrom((C62942bv) C64046db.f173167h, query.getBlob(0));
                    C64054dj djVar = dbVar.f173170b;
                    if (djVar == null) {
                        djVar = C64054dj.f173187h;
                    }
                    C64054dj djVar2 = djVar;
                    C64095m mVar = dbVar.f173171c;
                    if (mVar == null) {
                        mVar = C64095m.f173283c;
                    }
                    aVar = new C147104a(str, account, pVar, djVar2, mVar, dbVar.f173173e, dbVar.f173174f, dbVar.f173175g);
                } else {
                    C147256m mVar2 = (C147256m) this.f397181c.mo27525b();
                    if (C147266a.m240140k()) {
                        if (bVar2 == C147105b.GET) {
                            ((C146822a) this.f397182d.mo27525b()).mo123718d(10021, C147176j.m240000a(pVar));
                        }
                        if (mVar2.f397497a) {
                            mVar2.mo124064g("No subscription found for (%s, %s, %s) from %s", str, account2, pVar2, bVar2);
                        } else {
                            mVar2.mo124064g("No subscription found for %s from %s", str, bVar2);
                        }
                    } else if (mVar2.f397497a) {
                        mVar2.mo124064g("No subscription found for (%s, %s, %s)", str, account2, pVar2);
                    } else {
                        mVar2.mo124064g("No subscription found for %s", str);
                    }
                }
                query.close();
                return aVar;
            } catch (C62974ct e) {
                throw new C147113j("Couldn't parse SubscriptionValue.", e);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (C147075at e2) {
            throw new C147113j("Error accessing subscription database", e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|(4:7|8|9|10)|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00ae */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i m239856j(java.lang.String r20, android.accounts.Account r21, com.google.protos.p4895aw.p4902b.C64098p r22, com.google.protos.p4895aw.p4902b.C64054dj r23, com.google.protos.p4895aw.p4902b.C64095m r24) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r4 = r21
            r5 = r22
            com.google.android.libraries.ac.b.i.n r2 = r1.f397187i     // Catch:{ at -> 0x011a }
            android.database.sqlite.SQLiteDatabase r2 = r2.mo123914b()     // Catch:{ at -> 0x011a }
            java.lang.String r3 = "INSERT OR REPLACE INTO subscription VALUES (?,?,?,?)"
            android.database.sqlite.SQLiteStatement r13 = r2.compileStatement(r3)     // Catch:{ at -> 0x011a }
            com.google.protos.aw.b.db r2 = com.google.protos.p4895aw.p4902b.C64046db.f173167h     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.da r2 = (com.google.protos.p4895aw.p4902b.C64045da) r2     // Catch:{ all -> 0x0115 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ all -> 0x0115 }
            r23.getClass()     // Catch:{ all -> 0x0115 }
            r6 = r23
            r3.f173170b = r6     // Catch:{ all -> 0x0115 }
            int r7 = r3.f173169a     // Catch:{ all -> 0x0115 }
            r8 = 1
            r7 = r7 | r8
            r3.f173169a = r7     // Catch:{ all -> 0x0115 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ all -> 0x0115 }
            r24.getClass()     // Catch:{ all -> 0x0115 }
            r7 = r24
            r3.f173171c = r7     // Catch:{ all -> 0x0115 }
            int r9 = r3.f173169a     // Catch:{ all -> 0x0115 }
            r10 = 2
            r9 = r9 | r10
            r3.f173169a = r9     // Catch:{ all -> 0x0115 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ all -> 0x0115 }
            r22.getClass()     // Catch:{ all -> 0x0115 }
            r3.f173172d = r5     // Catch:{ all -> 0x0115 }
            int r9 = r3.f173169a     // Catch:{ all -> 0x0115 }
            r11 = 4
            r9 = r9 | r11
            r3.f173169a = r9     // Catch:{ all -> 0x0115 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0115 }
            com.google.common.base.cv r9 = new com.google.common.base.cv     // Catch:{ all -> 0x0115 }
            r9.<init>(r3)     // Catch:{ all -> 0x0115 }
            java.lang.Object r3 = r9.f156729a     // Catch:{ all -> 0x0115 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0115 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0115 }
            r9 = -1
            if (r3 == 0) goto L_0x00b8
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0115 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ all -> 0x0115 }
            int r12 = r3.f173169a     // Catch:{ all -> 0x0115 }
            r12 = r12 | 32
            r3.f173169a = r12     // Catch:{ all -> 0x0115 }
            r3.f173175g = r14     // Catch:{ all -> 0x0115 }
            com.google.android.libraries.ac.b.l.m r3 = r1.f397183e     // Catch:{ IOException -> 0x00ac }
            java.lang.Object r3 = r3.mo124004a()     // Catch:{ IOException -> 0x00ac }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x00ac }
            int r9 = r3.intValue()     // Catch:{ IOException -> 0x00ac }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00ac }
            r2.copyOnWrite()     // Catch:{ IOException -> 0x00ae }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ IOException -> 0x00ae }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ IOException -> 0x00ae }
            int r10 = r3.f173169a     // Catch:{ IOException -> 0x00ae }
            r10 = r10 | 16
            r3.f173169a = r10     // Catch:{ IOException -> 0x00ae }
            r3.f173174f = r9     // Catch:{ IOException -> 0x00ae }
            r2.copyOnWrite()     // Catch:{ IOException -> 0x00ae }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ IOException -> 0x00ae }
            com.google.protos.aw.b.db r3 = (com.google.protos.p4895aw.p4902b.C64046db) r3     // Catch:{ IOException -> 0x00ae }
            int r10 = r3.f173169a     // Catch:{ IOException -> 0x00ae }
            r10 = r10 | 8
            r3.f173169a = r10     // Catch:{ IOException -> 0x00ae }
            r3.f173173e = r11     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b6
        L_0x00ac:
            r11 = -1
        L_0x00ae:
            dagger.a r3 = r1.f397185g     // Catch:{ all -> 0x0115 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0115 }
            com.google.android.libraries.ac.d.b.b.d.a r3 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a) r3     // Catch:{ all -> 0x0115 }
        L_0x00b6:
            r10 = r9
            goto L_0x00bd
        L_0x00b8:
            r10 = -1
            r11 = -1
            r14 = -1
        L_0x00bd:
            r13.bindString(r8, r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r4.name     // Catch:{ all -> 0x0115 }
            r9 = 2
            r13.bindString(r9, r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r1.m239857k(r5)     // Catch:{ all -> 0x0115 }
            r9 = 3
            r13.bindString(r9, r3)     // Catch:{ all -> 0x0115 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0115 }
            com.google.protos.aw.b.db r2 = (com.google.protos.p4895aw.p4902b.C64046db) r2     // Catch:{ all -> 0x0115 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x0115 }
            r3 = 4
            r13.bindBlob(r3, r2)     // Catch:{ all -> 0x0115 }
            long r2 = r13.executeInsert()     // Catch:{ all -> 0x0115 }
            r16 = -1
            int r18 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x00fd
            com.google.android.libraries.ac.b.j.a r16 = new com.google.android.libraries.ac.b.j.a     // Catch:{ all -> 0x0115 }
            r2 = r16
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r11
            r11 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0115 }
            r13.close()
            return r16
        L_0x00fd:
            com.google.android.libraries.ac.b.j.j r2 = new com.google.android.libraries.ac.b.j.j     // Catch:{ all -> 0x0115 }
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0115 }
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0115 }
            r7 = 0
            r6[r7] = r0     // Catch:{ all -> 0x0115 }
            r6[r8] = r4     // Catch:{ all -> 0x0115 }
            r0 = 2
            r6[r0] = r5     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "Failed to set subscription for app=%s, account=%s, channel=%s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r6)     // Catch:{ all -> 0x0115 }
            r2.<init>(r0)     // Catch:{ all -> 0x0115 }
            throw r2     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            r13.close()
            throw r0
        L_0x011a:
            r0 = move-exception
            com.google.android.libraries.ac.b.j.j r2 = new com.google.android.libraries.ac.b.j.j
            java.lang.String r3 = "Error accessing subscription database"
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10943j.C147107d.m239856j(java.lang.String, android.accounts.Account, com.google.protos.aw.b.p, com.google.protos.aw.b.dj, com.google.protos.aw.b.m):com.google.android.libraries.ac.b.j.i");
    }

    /* renamed from: k */
    private final String m239857k(C64098p pVar) {
        return ((C146792e) this.f397184f.get(C64097o.m96355a(pVar.f173294a))).mo123637a(pVar);
    }

    /* renamed from: a */
    public final C147112i mo123933a(String str, Account account, C64098p pVar) {
        return m239855i(str, account, pVar, C147105b.GET);
    }

    /* renamed from: b */
    public final List mo123934b() {
        try {
            Cursor query = this.f397187i.mo123913a().query("subscription", f397179a, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query == null) {
                return Collections.emptyList();
            }
            C58480gp e = C58485gu.m89837e();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    C64046db dbVar = (C64046db) C62942bv.parseFrom((C62942bv) C64046db.f173167h, query.getBlob(3));
                    Account account = new Account(string2, "com.google");
                    C64098p pVar = dbVar.f173172d;
                    if (pVar == null) {
                        pVar = C64098p.f173292c;
                    }
                    C64098p pVar2 = pVar;
                    C64054dj djVar = dbVar.f173170b;
                    if (djVar == null) {
                        djVar = C64054dj.f173187h;
                    }
                    C64054dj djVar2 = djVar;
                    C64095m mVar = dbVar.f173171c;
                    if (mVar == null) {
                        mVar = C64095m.f173283c;
                    }
                    e.mo55395g(new C147104a(string, account, pVar2, djVar2, mVar, dbVar.f173173e, dbVar.f173174f, dbVar.f173175g));
                    query.moveToNext();
                }
                query.close();
                return e.mo55394f();
            } catch (C62974ct e2) {
                throw new C147113j("Couldn't parse SubscriptionValue.", e2);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (C147075at e3) {
            throw new C147113j("Error accessing subscription database", e3);
        }
    }

    /* renamed from: c */
    public final List mo123935c(Account account, C64098p pVar) {
        try {
            Cursor query = this.f397187i.mo123913a().query("subscription", new String[]{"app_id", "value"}, "account = ? AND channel = ?", new String[]{account.name, m239857k(pVar)}, (String) null, (String) null, (String) null);
            if (query == null) {
                return Collections.emptyList();
            }
            C58480gp e = C58485gu.m89837e();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    C64046db dbVar = (C64046db) C62942bv.parseFrom((C62942bv) C64046db.f173167h, query.getBlob(1));
                    C64054dj djVar = dbVar.f173170b;
                    if (djVar == null) {
                        djVar = C64054dj.f173187h;
                    }
                    C64054dj djVar2 = djVar;
                    C64095m mVar = dbVar.f173171c;
                    if (mVar == null) {
                        mVar = C64095m.f173283c;
                    }
                    e.mo55395g(new C147104a(string, account, pVar, djVar2, mVar, dbVar.f173173e, dbVar.f173174f, dbVar.f173175g));
                    query.moveToNext();
                    C64098p pVar2 = pVar;
                }
                query.close();
                return e.mo55394f();
            } catch (C62974ct e2) {
                throw new C147113j("Couldn't parse SubscriptionValue.", e2);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (C147075at e3) {
            throw new C147113j("Error accessing subscription database", e3);
        }
    }

    /* renamed from: d */
    public final void mo123936d(String str, C147114k kVar) {
        if (C147266a.m240140k() && kVar != null) {
            ((C147256m) this.f397181c.mo27525b()).mo124064g("Deleting app subscriptions (app=%s, reason=%s)", str, kVar);
        }
        synchronized (this.f397180b) {
            try {
                this.f397187i.mo123914b().delete("subscription", "app_id = ?", new String[]{str});
            } catch (C147075at e) {
                throw new C147113j("Error accessing subscription database", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void mo123937e(String str, Account account, C64098p pVar, C147114k kVar) {
        C147112i i;
        if (C147266a.m240140k() && kVar != null) {
            if (((C147256m) this.f397181c.mo27525b()).f397497a) {
                ((C147256m) this.f397181c.mo27525b()).mo124064g("Deleting subscription (app=%s, account=%s, channel=%s, reason=%s)", str, account, pVar, kVar);
            } else {
                ((C147256m) this.f397181c.mo27525b()).mo124064g("Deleting subscription (app=%s, reason=%s)", str, kVar);
            }
        }
        synchronized (this.f397180b) {
            try {
                i = m239855i(str, account, pVar, C147105b.DELETE);
                this.f397187i.mo123914b().delete("subscription", "app_id = ? AND account = ? AND channel = ?", new String[]{str, account.name, m239857k(pVar)});
            } catch (C147075at e) {
                throw new C147113j("Error accessing subscription database", e);
            }
        }
        if (!((Boolean) new C58885cv(true).f156729a).booleanValue() || i != null) {
            for (C147115l e2 : (Set) this.f397186h.mo27525b()) {
                e2.mo123766e(i);
            }
        }
    }

    /* renamed from: f */
    public final void mo123938f(Account account, C147114k kVar) {
        if (C147266a.m240140k() && kVar != null) {
            if (((C147256m) this.f397181c.mo27525b()).f397497a) {
                ((C147256m) this.f397181c.mo27525b()).mo124064g("Deleting user subscriptions (account=%s, reason=%s)", account, kVar);
            } else {
                ((C147256m) this.f397181c.mo27525b()).mo124064g("Deleting user subscriptions (reason=%s)", kVar);
            }
        }
        synchronized (this.f397180b) {
            try {
                this.f397187i.mo123914b().delete("subscription", "account = ?", new String[]{account.name});
            } catch (C147075at e) {
                throw new C147113j("Error accessing subscription database", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void mo123939g(String str, Account account, C64098p pVar) {
        if ("com.google".equals(account.type)) {
            synchronized (this.f397180b) {
                C147112i i = m239855i(str, account, pVar, C147105b.REFRESH);
                if (i != null) {
                    m239856j(str, account, pVar, ((C147104a) i).f397168d, ((C147104a) i).f397169e);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }

    /* renamed from: h */
    public final void mo123940h(String str, Account account, C64098p pVar, C64054dj djVar, C64095m mVar) {
        C147112i i;
        C147112i j;
        if ("com.google".equals(account.type)) {
            synchronized (this.f397180b) {
                i = m239855i(str, account, pVar, C147105b.SUBSCRIBE);
                j = m239856j(str, account, pVar, djVar, mVar);
            }
            for (C147115l d : (Set) this.f397186h.mo27525b()) {
                d.mo123765d(i, j);
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }
}
