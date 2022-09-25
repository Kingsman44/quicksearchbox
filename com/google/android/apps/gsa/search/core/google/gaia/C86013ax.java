package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountsException;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86036e;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7172j.C91044a;
import com.google.android.apps.gsa.speech.helper.p7281b.C92305a;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21493b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2476a.C32164c;
import com.google.android.libraries.search.p2476a.C32236j;
import com.google.android.libraries.search.p2476a.p2478b.C32163c;
import com.google.android.libraries.search.p2476a.p2479c.C32210k;
import com.google.android.p10905k.C146602a;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58839bc;
import com.google.common.base.C58844bh;
import com.google.common.base.C58872ci;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ax */
/* compiled from: PG */
public final class C86013ax implements C86054o, C86055p, C86036e, C90991b {

    /* renamed from: a */
    public static final C59071e f232544a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.gaia.ax");

    /* renamed from: A */
    private final C68214a f232545A;

    /* renamed from: B */
    private final Queue f232546B;

    /* renamed from: C */
    private final Queue f232547C;

    /* renamed from: D */
    private final Queue f232548D;

    /* renamed from: E */
    private final C60836bq f232549E = new C60836bq();

    /* renamed from: F */
    private C60870cx f232550F = null;

    /* renamed from: G */
    private Account f232551G;

    /* renamed from: H */
    private Account[] f232552H;

    /* renamed from: I */
    private final C32164c f232553I;

    /* renamed from: b */
    public final C91044a f232554b;

    /* renamed from: c */
    public final C86049j f232555c;

    /* renamed from: d */
    public final C22871g f232556d;

    /* renamed from: e */
    public final C22871g f232557e;

    /* renamed from: f */
    public final C22871g f232558f;

    /* renamed from: g */
    public final Context f232559g;

    /* renamed from: h */
    public final C68214a f232560h;

    /* renamed from: i */
    public final C32163c f232561i;

    /* renamed from: j */
    public final C68214a f232562j;

    /* renamed from: k */
    public final C68214a f232563k;

    /* renamed from: l */
    public final C68214a f232564l;

    /* renamed from: m */
    public final C68214a f232565m;

    /* renamed from: n */
    public final C39141kp f232566n;

    /* renamed from: o */
    public final Object f232567o = new Object();

    /* renamed from: p */
    private final C86106b f232568p;

    /* renamed from: q */
    private final AccountManager f232569q;

    /* renamed from: r */
    private final List f232570r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final C90931ca f232571s;

    /* renamed from: t */
    private final C22871g f232572t;

    /* renamed from: u */
    private final C68214a f232573u;

    /* renamed from: v */
    private final C68214a f232574v;

    /* renamed from: w */
    private final C68214a f232575w;

    /* renamed from: x */
    private final C68214a f232576x;

    /* renamed from: y */
    private final C68214a f232577y;

    /* renamed from: z */
    private final C58833ax f232578z;

    public C86013ax(Context context, C68214a aVar, C68214a aVar2, C86106b bVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C86049j jVar, AccountManager accountManager, C91044a aVar3, C68214a aVar4, C32163c cVar, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C58833ax axVar, C68214a aVar10, C68214a aVar11, C68214a aVar12, C91022f fVar, C32164c cVar2, C39141kp kpVar) {
        this.f232559g = context;
        this.f232568p = bVar;
        this.f232569q = accountManager;
        this.f232554b = aVar3;
        this.f232571s = caVar;
        this.f232572t = gVar;
        this.f232556d = gVar2;
        this.f232557e = gVar3;
        this.f232558f = gVar4;
        this.f232555c = jVar;
        this.f232573u = aVar;
        this.f232560h = aVar2;
        this.f232574v = aVar4;
        this.f232561i = cVar;
        this.f232575w = aVar5;
        this.f232562j = aVar6;
        this.f232576x = aVar7;
        this.f232563k = aVar8;
        this.f232577y = aVar9;
        this.f232578z = axVar;
        this.f232545A = aVar10;
        this.f232564l = aVar11;
        this.f232565m = aVar12;
        this.f232553I = cVar2;
        this.f232566n = kpVar;
        this.f232546B = new C58781rt(new C58425eo(20));
        this.f232547C = new C58781rt(new C58425eo(5));
        this.f232548D = new C58781rt(new C58425eo(5));
        fVar.mo85301a(this);
        m138271T(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return r0;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.accounts.Account m138266O(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L_0x002a
            android.accounts.Account r1 = r6.mo79689w(r7)     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0025
            android.accounts.Account[] r1 = r6.f232552H     // Catch:{ all -> 0x0027 }
            int r2 = r1.length     // Catch:{ all -> 0x0027 }
            r3 = 0
        L_0x000e:
            if (r3 >= r2) goto L_0x0023
            r4 = r1[r3]     // Catch:{ all -> 0x0027 }
            android.accounts.AccountManager r5 = r6.f232569q     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = r5.getPreviousName(r4)     // Catch:{ all -> 0x0027 }
            boolean r5 = r7.equalsIgnoreCase(r5)     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0020
            r0 = r4
            goto L_0x0023
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0023:
            monitor-exit(r6)
            return r0
        L_0x0025:
            r0 = r1
            goto L_0x002a
        L_0x0027:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x002a:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.C86013ax.m138266O(java.lang.String):android.accounts.Account");
    }

    /* renamed from: P */
    private final C60870cx m138267P() {
        if (!this.f232578z.mo56113h()) {
            if (this.f232550F == null) {
                this.f232550F = C60856cj.m92899h(new IllegalStateException("Attempting to enable TikTok account, but the enabler is absent."));
            }
            return this.f232550F;
        }
        C32210k kVar = (C32210k) this.f232578z.mo56107c();
        mo79662I("#enableTikTokAccount: start");
        C60870cx cxVar = this.f232550F;
        if (cxVar == null) {
            cxVar = C60866ct.f164955a;
        }
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        C60870cx b = C60856cj.m92893b(cxVar).mo57335b(new C86001al(this, kVar), new C86057r(this));
        this.f232550F = b;
        C60856cj.m92911t(b, new C86002am(this, d), C60826bg.f164896a);
        return this.f232550F;
    }

    /* renamed from: Q */
    private final List m138268Q(String str, C91032p pVar, boolean z) {
        C91032p pVar2;
        Account[] r = mo79684r();
        ArrayList arrayList = new ArrayList();
        for (Account account : r) {
            synchronized (pVar.f254275a) {
                if (pVar.f254276b == null) {
                    pVar.f254276b = C58597ky.m90213d(1);
                }
                pVar2 = new C91032p();
                pVar.f254276b.add(pVar2);
            }
            arrayList.add(mo79655B(str, account, pVar2, z));
        }
        return arrayList;
    }

    /* renamed from: R */
    private final void m138269R(Throwable th) {
        this.f232547C.add(new C86011av(th));
    }

    /* renamed from: S */
    private final void m138270S(Throwable th) {
        this.f232548D.add(new C86011av(th));
    }

    /* renamed from: T */
    private final void m138271T(boolean z) {
        int i;
        Account[] accountArr;
        C58839bc bcVar;
        mo79662I("#refreshInternal: Initializing = [" + z + "]");
        synchronized (this) {
            C59104x b = f232544a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) b).mo56372aa(8055)).mo56386p("Getting accounts.");
            boolean z2 = false;
            try {
                C90476a aVar = C91018d.f254254a;
                accountArr = this.f232553I.f86351a.getAccountsByType("com.google");
                if (accountArr == null) {
                    i = 3;
                } else {
                    i = accountArr.length == 0 ? 4 : 0;
                }
            } catch (C32236j e) {
                C59104x c = f232544a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8063)).mo56389s("%s", "Failed to get the list of all accounts!");
                mo79662I("Failed to get the list of all accounts!\n" + C58887cx.m90975b(e));
                throw e;
            } catch (C32236j unused) {
                i = 2;
                accountArr = null;
            }
            String string = ((C86338r) this.f232573u.mo27525b()).getString(C90507o.f253011a, (String) null);
            if (accountArr == null) {
                accountArr = new Account[0];
                if (string != null) {
                    C86337q b2 = ((C86338r) this.f232573u.mo27525b()).mo80076b();
                    b2.mo80073h(C90507o.f253012b, string);
                    b2.apply();
                }
            }
            int length = accountArr.length;
            mo79662I("#refreshInternal: fetched accounts. Accounts length = [" + length + "]");
            Set set = (Set) ((C58833ax) C60856cj.m92910s(this.f232561i.mo37977a())).mo56111f();
            List asList = Arrays.asList(accountArr);
            if (set == null) {
                bcVar = C58844bh.ALWAYS_TRUE;
            } else {
                bcVar = new C86030bk(set);
            }
            Account[] accountArr2 = (Account[]) C58557jl.m90142w(C58557jl.m90124e(C58557jl.m90124e(asList, bcVar), C85999aj.f232520a), Account.class);
            mo79662I("#refreshInternal: filtered accounts. Accounts length = [" + accountArr2.length + "]");
            if (set != null && !set.isEmpty()) {
                z2 = true;
            }
            if (length > 0 && set != null && string != null && !set.contains(string)) {
                i = 5;
            }
            m138274W(accountArr2, z2, i, z);
        }
        if (z) {
            this.f232559g.registerReceiver(new C86009at(this), new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"));
            mo79663J();
            if (((C86124t) this.f232545A.mo27525b()).mo79746e(C90109fg.f250572n)) {
                this.f232556d.mo28212l("Prewarming FacsCacheProvider.", new C86000ak(this));
            }
        }
    }

    /* renamed from: U */
    private final boolean m138272U(String str) {
        try {
            this.f232559g.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018e, code lost:
        return true;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m138273V(android.accounts.Account r8, boolean r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x018f }
            r7.f232551G = r8     // Catch:{ all -> 0x018f }
            if (r8 != 0) goto L_0x000a
            java.lang.String r0 = "signed out account"
            goto L_0x000c
        L_0x000a:
            java.lang.String r0 = "user account"
        L_0x000c:
            java.lang.String r1 = "#setAccount: Setting the account to "
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x018f }
            r7.mo79662I(r0)     // Catch:{ all -> 0x018f }
            dagger.a r0 = r7.f232573u     // Catch:{ all -> 0x018f }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "google_account"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x018f }
            if (r8 == 0) goto L_0x0029
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x018f }
            goto L_0x002a
        L_0x0029:
            r8 = r2
        L_0x002a:
            boolean r1 = com.google.common.base.C58832aw.m90831a(r0, r8)     // Catch:{ all -> 0x018f }
            r3 = 0
            if (r1 == 0) goto L_0x0038
            java.lang.String r8 = "#setAccount: The old account is equal to the new account. No change required"
            r7.mo79662I(r8)     // Catch:{ all -> 0x018f }
            monitor-exit(r7)
            return r3
        L_0x0038:
            java.lang.String r1 = "#setAccount: The old account is different than the new account. Updating to new account"
            r7.mo79662I(r1)     // Catch:{ all -> 0x018f }
            dagger.a r1 = r7.f232573u     // Catch:{ all -> 0x018f }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.preferences.r r1 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r1     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.preferences.q r4 = r1.mo80076b()     // Catch:{ all -> 0x018f }
            if (r8 != 0) goto L_0x0076
            java.lang.String r5 = "#setGoogleAccountToUse: Setting the account to null"
            r7.mo79662I(r5)     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "google_account"
            java.lang.String r1 = r1.getString(r5, r2)     // Catch:{ all -> 0x018f }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x018f }
            if (r5 != 0) goto L_0x006b
            if (r9 == 0) goto L_0x006b
            java.lang.String r5 = "client_instance_id_"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = r5.concat(r1)     // Catch:{ all -> 0x018f }
            r4.mo80075j(r1)     // Catch:{ all -> 0x018f }
        L_0x006b:
            java.lang.String r1 = "google_account"
            r4.mo80075j(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "signed_out"
            r4.mo80067b(r1, r9)     // Catch:{ all -> 0x018f }
            goto L_0x0085
        L_0x0076:
            java.lang.String r1 = "#setGoogleAccountToUse: Setting a non-null account"
            r7.mo79662I(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "google_account"
            r4.mo80073h(r1, r8)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "signed_out"
            r4.mo80067b(r1, r3)     // Catch:{ all -> 0x018f }
        L_0x0085:
            r4.apply()     // Catch:{ all -> 0x018f }
            com.google.android.libraries.search.a.b.c r1 = r7.f232561i     // Catch:{ all -> 0x018f }
            com.google.common.util.concurrent.cx r1 = r1.mo37978b(r8)     // Catch:{ all -> 0x018f }
            com.google.common.util.concurrent.C60856cj.m92910s(r1)     // Catch:{ all -> 0x018f }
            if (r9 != 0) goto L_0x0098
            com.google.android.apps.gsa.search.core.i.b r9 = r7.f232568p     // Catch:{ all -> 0x018f }
            r9.mo79727b()     // Catch:{ all -> 0x018f }
        L_0x0098:
            com.google.common.base.ax r9 = r7.f232578z     // Catch:{ all -> 0x018f }
            boolean r9 = r9.mo56113h()     // Catch:{ all -> 0x018f }
            if (r9 == 0) goto L_0x00ad
            com.google.common.util.concurrent.cx r2 = r7.m138267P()     // Catch:{ all -> 0x018f }
            android.content.Context r9 = r7.f232559g     // Catch:{ all -> 0x018f }
            android.content.Intent r1 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.m145193e()     // Catch:{ all -> 0x018f }
            r9.sendBroadcast(r1)     // Catch:{ all -> 0x018f }
        L_0x00ad:
            com.google.android.libraries.gsa.k.g r9 = r7.f232556d     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.u r1 = new com.google.android.apps.gsa.search.core.google.gaia.u     // Catch:{ all -> 0x018f }
            r1.<init>(r8)     // Catch:{ all -> 0x018f }
            java.lang.String r4 = "Asking EventLogger to record Metadata"
            r9.mo28212l(r4, r1)     // Catch:{ all -> 0x018f }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "com.google.android.apps.now.account_update_broadcast"
            r9.<init>(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "account_name"
            r9.putExtra(r1, r8)     // Catch:{ all -> 0x018f }
            java.lang.String r8 = "old_account_name"
            r9.putExtra(r8, r0)     // Catch:{ all -> 0x018f }
            java.lang.String r8 = "com.google.android.googlequicksearchbox"
            boolean r8 = r7.m138272U(r8)     // Catch:{ all -> 0x018f }
            if (r8 == 0) goto L_0x00f0
            if (r2 != 0) goto L_0x00e1
            java.lang.String r8 = "com.google.android.googlequicksearchbox"
            r9.setPackage(r8)     // Catch:{ all -> 0x018f }
            android.content.Context r8 = r7.f232559g     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS"
            r8.sendBroadcast(r9, r0)     // Catch:{ all -> 0x018f }
            goto L_0x00f0
        L_0x00e1:
            com.google.common.util.concurrent.bq r8 = r7.f232549E     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.v r0 = new com.google.android.apps.gsa.search.core.google.gaia.v     // Catch:{ all -> 0x018f }
            r0.<init>(r7, r2, r9)     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.w r1 = new com.google.android.apps.gsa.search.core.google.gaia.w     // Catch:{ all -> 0x018f }
            r1.<init>(r7)     // Catch:{ all -> 0x018f }
            r8.mo57305b(r0, r1)     // Catch:{ all -> 0x018f }
        L_0x00f0:
            com.google.common.b.gu r8 = com.google.android.apps.gsa.shared.util.C90721ae.f253792a     // Catch:{ all -> 0x018f }
            r0 = r8
            com.google.common.b.pq r0 = (com.google.common.p4522b.C58724pq) r0     // Catch:{ all -> 0x018f }
            int r0 = r0.f156474d     // Catch:{ all -> 0x018f }
            r1 = 0
        L_0x00f8:
            if (r1 >= r0) goto L_0x011b
            java.lang.Object r4 = r8.get(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "com.google.android.googlequicksearchbox"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x018f }
            if (r5 != 0) goto L_0x0118
            boolean r5 = r7.m138272U(r4)     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x0118
            r9.setPackage(r4)     // Catch:{ all -> 0x018f }
            android.content.Context r4 = r7.f232559g     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS"
            r4.sendBroadcast(r9, r5)     // Catch:{ all -> 0x018f }
        L_0x0118:
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x011b:
            com.google.common.b.gu r8 = com.google.android.apps.gsa.shared.util.C90721ae.f253800i     // Catch:{ all -> 0x018f }
            r0 = r8
            com.google.common.b.pq r0 = (com.google.common.p4522b.C58724pq) r0     // Catch:{ all -> 0x018f }
            int r0 = r0.f156474d     // Catch:{ all -> 0x018f }
            r1 = 0
        L_0x0123:
            if (r1 >= r0) goto L_0x0143
            java.lang.Object r4 = r8.get(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x018f }
            boolean r5 = r7.m138272U(r4)     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x0140
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x018f }
            r5.<init>(r9)     // Catch:{ all -> 0x018f }
            r5.setPackage(r4)     // Catch:{ all -> 0x018f }
            android.content.Context r4 = r7.f232559g     // Catch:{ all -> 0x018f }
            java.lang.String r6 = "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS"
            r4.sendBroadcast(r5, r6)     // Catch:{ all -> 0x018f }
        L_0x0140:
            int r1 = r1 + 1
            goto L_0x0123
        L_0x0143:
            android.accounts.Account r8 = r7.f232551G     // Catch:{ all -> 0x018f }
            com.google.android.libraries.gsa.k.g r9 = r7.f232572t     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.ae r0 = new com.google.android.apps.gsa.search.core.google.gaia.ae     // Catch:{ all -> 0x018f }
            r0.<init>(r7, r8)     // Catch:{ all -> 0x018f }
            java.lang.String r8 = "notifySignedInAccountChanged"
            r9.mo28212l(r8, r0)     // Catch:{ all -> 0x018f }
            r8 = 1
            if (r2 == 0) goto L_0x0171
            com.google.common.util.concurrent.cx[] r9 = new com.google.common.util.concurrent.C60870cx[r8]     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.af r0 = com.google.android.apps.gsa.search.core.google.gaia.C85995af.f232516a     // Catch:{ all -> 0x018f }
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x018f }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r2, r0, r1)     // Catch:{ all -> 0x018f }
            r9[r3] = r0     // Catch:{ all -> 0x018f }
            com.google.common.util.concurrent.cf r9 = com.google.common.util.concurrent.C60856cj.m92895d(r9)     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.ag r0 = new com.google.android.apps.gsa.search.core.google.gaia.ag     // Catch:{ all -> 0x018f }
            r0.<init>(r7)     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.ah r1 = new com.google.android.apps.gsa.search.core.google.gaia.ah     // Catch:{ all -> 0x018f }
            r1.<init>(r7)     // Catch:{ all -> 0x018f }
            r9.mo57336c(r0, r1)     // Catch:{ all -> 0x018f }
        L_0x0171:
            dagger.a r9 = r7.f232545A     // Catch:{ all -> 0x018f }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250572n     // Catch:{ all -> 0x018f }
            boolean r9 = r9.mo79746e(r0)     // Catch:{ all -> 0x018f }
            if (r9 == 0) goto L_0x018d
            com.google.android.libraries.gsa.k.g r9 = r7.f232556d     // Catch:{ all -> 0x018f }
            com.google.android.apps.gsa.search.core.google.gaia.ai r0 = new com.google.android.apps.gsa.search.core.google.gaia.ai     // Catch:{ all -> 0x018f }
            r0.<init>(r7)     // Catch:{ all -> 0x018f }
            java.lang.String r1 = "Prewarming FacsCacheProvider."
            r9.mo28212l(r1, r0)     // Catch:{ all -> 0x018f }
        L_0x018d:
            monitor-exit(r7)
            return r8
        L_0x018f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0193
        L_0x0192:
            throw r8
        L_0x0193:
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.C86013ax.m138273V(android.accounts.Account, boolean):boolean");
    }

    /* renamed from: W */
    private final synchronized void m138274W(Account[] accountArr, boolean z, int i, boolean z2) {
        Account account;
        Account[] accountArr2 = this.f232552H;
        boolean z3 = accountArr2 != null && !Arrays.equals(accountArr2, accountArr);
        this.f232552H = accountArr;
        if (z3) {
            this.f232572t.mo28212l("notifyAccountsChanged", new C85993ad(this, accountArr));
        }
        C86338r rVar = (C86338r) this.f232573u.mo27525b();
        Account account2 = null;
        if (accountArr.length > 0) {
            String string = rVar.getString(C90507o.f253012b, (String) null);
            if (string != null) {
                account = m138266O(string);
                if (account != null) {
                    mo79662I("#handleAccounts: Sign in to a restored account");
                }
                C86337q b = rVar.mo80076b();
                b.mo80075j(C90507o.f253012b);
                b.apply();
                C58976aa aaVar = C58975e.f156826a;
            } else {
                account = null;
            }
            if (account == null) {
                account = m138266O(rVar.getString(C90507o.f253011a, (String) null));
                if (account != null) {
                    mo79662I("#handleAccounts: Sign in to a previously selected primary search account");
                }
                C58976aa aaVar2 = C58975e.f156826a;
            }
            account2 = account;
            boolean z4 = rVar.getBoolean(C90507o.f253014d, false);
            if (account2 == null && (!z4 || z)) {
                account2 = accountArr[0];
                mo79662I("#handleAccounts: Auto sign in to the first account from the accounts list");
                C58976aa aaVar3 = C58975e.f156826a;
            }
        }
        if (m138273V(account2, false) && account2 == null) {
            if (i == 0) {
                i = 6;
            }
            this.f232566n.mo41685S(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "OTHER" : "ALLOWLIST_FILTERED" : "ACCOUNT_FETCH_EMPTY_ACCOUNTS" : "ACCOUNT_FETCH_NULL_ACCOUNTS" : "ACCOUNT_FETCH_EXCEPTION" : "EXPLICIT", z2);
        }
        C86337q b2 = rVar.mo80076b();
        b2.mo80067b(C90507o.f253013c, mo79682p());
        b2.apply();
    }

    /* renamed from: X */
    private static final Object m138275X(Future future, long j, boolean z, C91032p pVar, C68214a aVar) {
        try {
            return C90877ak.m148473g(future, j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C59104x d = f232544a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8045)).mo56386p("InterruptedException while waiting for token.");
            C86016b.m138319a(C60470rb.INTERRUPTED);
            if (z) {
                future.cancel(true);
            }
            return null;
        } catch (ExecutionException e2) {
            C59104x d2 = f232544a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(8046)).mo56386p("ExecutionException while waiting for token.");
            int i = C90755l.f253831a;
            ((C89911f) aVar.mo27525b()).mo83755a((Throwable) null, 10070063, 29).mo83721a();
            return null;
        } catch (TimeoutException e3) {
            C86016b.m138319a(C60470rb.TIMEOUT);
            C59071e eVar = f232544a;
            C59104x d3 = eVar.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(8047)).mo56386p("TimeoutException while waiting for token.");
            C91006f g = C91006f.m148646g(1);
            pVar.mo85309b(g, SystemClock.elapsedRealtime());
            C59104x d4 = eVar.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) d4).mo56372aa(8048)).mo56389s("%s", g);
            if (z) {
                future.cancel(true);
            }
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized C60870cx mo79654A() {
        if (this.f232550F == null) {
            m138267P();
        }
        return C60856cj.m92901j(C60922j.m93045h(this.f232550F, C85992ac.f232511a, C60826bg.f164896a));
    }

    /* renamed from: B */
    public final C60870cx mo79655B(String str, Account account, C91032p pVar, boolean z) {
        C60870cx g = C60922j.m93044g(mo79672f(str, account, z, pVar), new C86005ap(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: C */
    public final Iterable mo79656C() {
        return C58431eu.m89653c((Iterable) this.f232575w.mo27525b(), this.f232570r);
    }

    /* renamed from: D */
    public final String mo79657D(String str, long j) {
        return mo79658E(mo79668a(), str, j);
    }

    /* renamed from: E */
    public final String mo79658E(Account account, String str, long j) {
        C90748e.m148224b();
        if (account == null) {
            return null;
        }
        C91032p pVar = new C91032p();
        return (String) m138275X(mo79655B(str, account, pVar, true), j, true, pVar, this.f232574v);
    }

    /* renamed from: F */
    public final String mo79659F() {
        Account a = mo79668a();
        if (a != null) {
            return a.name;
        }
        return null;
    }

    /* renamed from: G */
    public final Set mo79660G(String str, long j) {
        return mo79661H(str, j, true);
    }

    /* renamed from: H */
    public final Set mo79661H(String str, long j, boolean z) {
        C58485gu l;
        List Q;
        C90748e.m148224b();
        C91032p pVar = new C91032p();
        synchronized (this) {
            l = C58485gu.m89844l(mo79684r());
            Q = m138268Q(str, pVar, z);
        }
        m138275X(C60856cj.m92906o(Q), j, false, pVar, this.f232574v);
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < Q.size(); i++) {
            C60870cx cxVar = (C60870cx) Q.get(i);
            String str2 = null;
            if (cxVar.isDone() && !cxVar.isCancelled()) {
                try {
                    str2 = (String) C60856cj.m92909r(cxVar);
                } catch (ExecutionException e) {
                    C59104x c = f232544a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8051)).mo56386p("Token future has unexpectedly thrown exception.");
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                C92305a aVar = (C92305a) C92308d.f257402e.createBuilder();
                String str3 = ((Account) l.get(i)).name;
                aVar.copyOnWrite();
                C92308d dVar = (C92308d) aVar.instance;
                str3.getClass();
                dVar.f257404a |= 1;
                dVar.f257405b = str3;
                aVar.copyOnWrite();
                C92308d dVar2 = (C92308d) aVar.instance;
                str2.getClass();
                dVar2.f257404a |= 2;
                dVar2.f257406c = str2;
                ihVar.mo55373c((C92308d) aVar.build());
            }
        }
        return ihVar.mo55486f();
    }

    /* renamed from: I */
    public final void mo79662I(String str) {
        this.f232546B.add(new C86010au(str));
    }

    /* renamed from: J */
    public final void mo79663J() {
        this.f232556d.mo28212l("Fetch application restrictions and cache in shared preferences", new C86058s(this));
    }

    /* renamed from: K */
    public final void mo79664K(C89784a aVar) {
        this.f232569q.getAccountsByTypeAndFeatures("com.google", new String[]{C146602a.m238836a("mail")}, new C86003an(this, aVar), (Handler) null);
    }

    /* renamed from: L */
    public final void mo79665L(String str) {
        this.f232555c.mo79642a(str);
    }

    /* renamed from: M */
    public final synchronized boolean mo79666M() {
        return mo79684r().length > 0;
    }

    /* renamed from: N */
    public final boolean mo79667N(String str) {
        C58976aa aaVar = C58975e.f156826a;
        return str.equals(mo79659F());
    }

    /* renamed from: a */
    public final synchronized Account mo79668a() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f232551G;
    }

    /* renamed from: b */
    public final Uri mo79669b(Uri uri, String str) {
        return mo79690x(mo79668a(), uri, str);
    }

    /* renamed from: c */
    public final C60870cx mo79670c(Account account, String str) {
        return this.f232556d.mo28210j(mo79692z(account, "gmscore_out_of_sync_fake_service"), "Check if GmsCore is initialized", new C85991ab(this, account, str));
    }

    /* renamed from: e */
    public final C60870cx mo79671e(String str, Account account, C91032p pVar) {
        return mo79655B(str, account, pVar, true);
    }

    /* renamed from: f */
    public final C60870cx mo79672f(String str, Account account, boolean z, C91032p pVar) {
        return this.f232571s.mo85138c(new C86006aq(this, str, account, z, pVar));
    }

    /* renamed from: g */
    public final String mo79673g() {
        return mo79674h(mo79659F());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("LoginHelper: recent activity");
        for (C90991b m : this.f232546B) {
            fVar.mo85286m(m);
        }
        fVar.mo85291r("LoginHelper: account change call stacks");
        for (C90991b m2 : this.f232547C) {
            fVar.mo85286m(m2);
        }
        fVar.mo85291r("LoginHelper: account logouts call stacks");
        for (C90991b m3 : this.f232548D) {
            fVar.mo85286m(m3);
        }
        fVar.mo85286m((C90991b) this.f232564l.mo27525b());
    }

    /* renamed from: h */
    public final String mo79674h(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (i <= 1) {
                try {
                    String a = ((C21493b) this.f232576x.mo27525b()).mo26965a(str);
                    if (a == null || !a.startsWith("accountId=")) {
                        return a;
                    }
                    ((C89911f) this.f232574v.mo27525b()).mo83755a((Throwable) null, 24866813, 29).mo83721a();
                    return a.substring(10);
                } catch (IOException e) {
                    C59104x d = f232544a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                    C90476a aVar = C90754k.f253829b;
                    C90476a aVar2 = C90754k.f253829b;
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8049)).mo56389s("IO exception for getAccountId(%s)", C90753j.m148241c(str));
                    i++;
                } catch (C21489a e2) {
                    C59104x d2 = f232544a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                    C90476a aVar3 = C90754k.f253829b;
                    C90476a aVar4 = C90754k.f253829b;
                    ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(8050)).mo56389s("Google Auth exception for getAccountId(%s)", C90753j.m148241c(str));
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public final void mo79675i(C86051l lVar) {
        this.f232570r.add(lVar);
    }

    /* renamed from: j */
    public final void mo79676j() {
        this.f232555c.mo79643b();
    }

    /* renamed from: k */
    public final void mo79677k(Account account, Uri uri, String str, C91043j jVar) {
        this.f232571s.mo85139d(new C86004ao(this, account, uri, str, jVar));
    }

    /* renamed from: l */
    public final void mo79678l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mo79665L(((C92308d) it.next()).f257406c);
        }
    }

    /* renamed from: m */
    public final void mo79679m() {
        C59104x b = f232544a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
        ((C59052c) ((C59052c) b).mo56372aa(8052)).mo56386p("#logOut()");
        m138270S(new Throwable());
        mo79662I("#logout: start");
        if (m138273V((Account) null, true)) {
            this.f232566n.mo41685S("EXPLICIT", false);
        }
    }

    /* renamed from: n */
    public final void mo79680n() {
        C59104x b = f232544a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
        ((C59052c) ((C59052c) b).mo56372aa(8054)).mo56386p("#refresh()");
        mo79662I("#refresh()");
        m138271T(false);
    }

    /* renamed from: o */
    public final void mo79681o(C86051l lVar) {
        this.f232570r.remove(lVar);
    }

    /* renamed from: p */
    public final boolean mo79682p() {
        for (Account account : mo79684r()) {
            if (account.name.endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo79683q() {
        for (String split : mo79685s()) {
            String[] split2 = split.split("@", -1);
            if (split2.length <= 1 || !split2[1].equals("gmail.com")) {
                C58976aa aaVar = C58975e.f156826a;
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final synchronized Account[] mo79684r() {
        return this.f232552H;
    }

    /* renamed from: s */
    public final synchronized String[] mo79685s() {
        Account[] accountArr = this.f232552H;
        int i = 0;
        if (accountArr == null) {
            return new String[0];
        }
        String[] strArr = new String[accountArr.length];
        while (true) {
            Account[] accountArr2 = this.f232552H;
            if (i >= accountArr2.length) {
                return strArr;
            }
            strArr[i] = accountArr2[i].name;
            i++;
        }
    }

    /* renamed from: t */
    public final void mo79686t(String str) {
        m138269R(new Throwable());
        mo79662I("#setAccountToUseByName: start");
        synchronized (this) {
            Account w = mo79689w(str);
            if (w != null) {
                m138273V(w, false);
            } else {
                throw new AccountsException("setAccountToUseByName: Account " + str + " not found.");
            }
        }
    }

    /* renamed from: u */
    public final C60870cx mo79687u() {
        boolean V;
        C60870cx cxVar;
        C59104x b = f232544a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
        ((C59052c) ((C59052c) b).mo56372aa(8044)).mo56386p("#logOut()");
        m138270S(new Throwable());
        mo79662I("#logout: start");
        synchronized (this) {
            V = m138273V((Account) null, true);
            C60870cx cxVar2 = this.f232550F;
            if (cxVar2 == null) {
                cxVar = C60856cj.m92899h(new IllegalStateException("Attempting to enable TikTok account, but the enabler is absent."));
            } else {
                cxVar = C60856cj.m92901j(C60922j.m93045h(cxVar2, C86056q.f232635a, C60826bg.f164896a));
            }
        }
        if (V) {
            this.f232566n.mo41685S("EXPLICIT", false);
        }
        return cxVar;
    }

    /* renamed from: v */
    public final C60870cx mo79688v(String str) {
        C60870cx cxVar;
        m138269R(new Throwable());
        mo79662I("#setAccountToUseByName: start");
        synchronized (this) {
            Account w = mo79689w(str);
            this.f232551G = w;
            if (w != null) {
                m138273V(w, false);
                C60870cx cxVar2 = this.f232550F;
                if (cxVar2 == null) {
                    cxVar = C60856cj.m92899h(new IllegalStateException("Attempting to enable TikTok account, but the enabler is absent."));
                } else {
                    cxVar = C60856cj.m92901j(C60922j.m93045h(cxVar2, C86056q.f232635a, C60826bg.f164896a));
                }
            } else {
                throw new AccountsException("setAccountToUseByName: Account " + str + " not found.");
            }
        }
        return cxVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        return null;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.accounts.Account mo79689w(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L_0x0021
            android.accounts.Account[] r1 = r6.f232552H     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x0009
            goto L_0x0021
        L_0x0009:
            int r2 = r1.length     // Catch:{ all -> 0x001e }
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x001c
            r4 = r1[r3]     // Catch:{ all -> 0x001e }
            java.lang.String r5 = r4.name     // Catch:{ all -> 0x001e }
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x0019
            monitor-exit(r6)
            return r4
        L_0x0019:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x001c:
            monitor-exit(r6)
            return r0
        L_0x001e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0021:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.C86013ax.mo79689w(java.lang.String):android.accounts.Account");
    }

    /* renamed from: x */
    public final Uri mo79690x(Account account, Uri uri, String str) {
        String str2;
        C90748e.m148224b();
        if (account == null) {
            C59104x d = f232544a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) d).mo56372aa(8038)).mo56386p("blockingGetGaiaWebLoginLink: account null, returning.");
            return null;
        }
        String encode = URLEncoder.encode(uri.toString());
        if (str == null) {
            str2 = "weblogin:" + URLEncoder.encode("continue=".concat(String.valueOf(encode))) + "&de=1";
        } else {
            String encode2 = URLEncoder.encode("service=" + str + "&continue=" + encode);
            StringBuilder sb = new StringBuilder("weblogin:");
            sb.append(encode2);
            sb.append("&de=1");
            str2 = sb.toString();
        }
        String E = mo79658E(account, str2, 30000);
        if (E == null) {
            return null;
        }
        return Uri.parse(E);
    }

    /* renamed from: y */
    public final C60870cx mo79691y(String str, long j) {
        C58485gu l;
        List Q;
        C91032p pVar = new C91032p();
        synchronized (this) {
            l = C58485gu.m89844l(mo79684r());
            Q = m138268Q(str, pVar, true);
        }
        return C60922j.m93044g(C90877ak.m148471e(C60856cj.m92906o(Q), j, TimeUnit.MILLISECONDS, this.f232558f), new C86065z(l), C60826bg.f164896a);
    }

    /* renamed from: z */
    public final C60870cx mo79692z(Account account, String str) {
        String a = C146602a.m238836a(str);
        C86007ar arVar = new C86007ar();
        arVar.f232538a = this.f232569q.hasFeatures(account, new String[]{a}, arVar, (Handler) this.f232577y.mo27525b());
        return arVar;
    }
}
