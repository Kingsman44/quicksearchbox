package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.p7281b.C92305a;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.C142556ap;
import com.google.android.enterprise.connectedapps.C142570e;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.ae */
/* compiled from: PG */
public final class C92314ae implements C92302a {

    /* renamed from: a */
    private static final C59071e f257414a = C59071e.m91332i("com.google.android.apps.gsa.speech.helper.crossprofile.ae");

    /* renamed from: b */
    private final C39141kp f257415b;

    /* renamed from: c */
    private final C58889cz f257416c;

    /* renamed from: d */
    private final C90021c f257417d;

    /* renamed from: e */
    private final C60887da f257418e;

    /* renamed from: f */
    private final ScheduledExecutorService f257419f;

    /* renamed from: g */
    private final C92332q f257420g;

    /* renamed from: h */
    private final C142570e f257421h;

    /* renamed from: i */
    private final C92334s f257422i;

    public C92314ae(C92334s sVar, C92332q qVar, C39141kp kpVar, C58889cz czVar, C90021c cVar, C60887da daVar, ScheduledExecutorService scheduledExecutorService) {
        this.f257422i = sVar;
        this.f257420g = qVar;
        this.f257421h = sVar.mo117178i();
        this.f257415b = kpVar;
        this.f257416c = czVar;
        this.f257417d = cVar;
        this.f257418e = daVar;
        this.f257419f = scheduledExecutorService;
    }

    /* renamed from: b */
    public static C92308d m151590b(C92308d dVar, int i) {
        C92305a aVar = (C92305a) dVar.toBuilder();
        aVar.copyOnWrite();
        C92308d dVar2 = (C92308d) aVar.instance;
        dVar2.f257407d = i - 1;
        dVar2.f257404a |= 4;
        return (C92308d) aVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.google.android.apps.gsa.speech.helper.crossprofile.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.enterprise.connectedapps.C142556ap m151591c() {
        /*
            r7 = this;
            java.lang.String r0 = "Finished attempting to connect to work profile, outcome: %s, elapsed time: %d ms."
            com.google.common.base.cz r1 = r7.f257416c
            com.google.common.base.ci r1 = com.google.common.base.C58872ci.m90947d(r1)
            com.google.common.f.e r2 = f257414a     // Catch:{ all -> 0x00e5 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x00e5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00e5 }
            r3 = 12444(0x309c, float:1.7438E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00e5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "Attempting to connect to work profile."
            r2.mo56386p(r3)     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.ac r2 = r2.mo117175b()     // Catch:{ all -> 0x00e5 }
            boolean r2 = r2.mo117165q()     // Catch:{ all -> 0x00e5 }
            if (r2 != 0) goto L_0x0038
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.ap r2 = r2.mo117179c(r7)     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = new com.google.android.apps.gsa.speech.helper.crossprofile.o     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "UNAVAILABLE"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b3
        L_0x0038:
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.an r2 = r2.mo117184j()     // Catch:{ all -> 0x00e5 }
            boolean r2 = r2.mo117170a()     // Catch:{ all -> 0x00e5 }
            if (r2 != 0) goto L_0x0052
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.ap r2 = r2.mo117179c(r7)     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = new com.google.android.apps.gsa.speech.helper.crossprofile.o     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "NO_PERMISSION"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b3
        L_0x0052:
            com.google.android.apps.gsa.shared.m.c r2 = r7.f257417d     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250082s     // Catch:{ all -> 0x00e5 }
            long r2 = r2.mo79743a(r3)     // Catch:{ all -> 0x00e5 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00af
            com.google.common.util.concurrent.da r4 = r7.f257418e     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            com.google.android.apps.gsa.speech.helper.crossprofile.x r5 = new com.google.android.apps.gsa.speech.helper.crossprofile.x     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            r5.<init>(r7)     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            com.google.common.util.concurrent.cx r4 = r4.mo19399b(r5)     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            java.util.concurrent.ScheduledExecutorService r6 = r7.f257419f     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92908q(r4, r2, r5, r6)     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r2)     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            r3 = r2
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = (com.google.android.apps.gsa.speech.helper.crossprofile.C92330o) r3     // Catch:{ InterruptedException -> 0x009a, ExecutionException -> 0x007b }
            goto L_0x00b3
        L_0x007b:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x00e5 }
            boolean r3 = r3 instanceof java.util.concurrent.TimeoutException     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x0092
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.ap r2 = r2.mo117179c(r7)     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = new com.google.android.apps.gsa.speech.helper.crossprofile.o     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "TIMEOUT"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b3
        L_0x0092:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Exception while trying to connect"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00e5 }
            throw r3     // Catch:{ all -> 0x00e5 }
        L_0x009a:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00e5 }
            r2.interrupt()     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.s r2 = r7.f257422i     // Catch:{ all -> 0x00e5 }
            com.google.android.enterprise.connectedapps.ap r2 = r2.mo117179c(r7)     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = new com.google.android.apps.gsa.speech.helper.crossprofile.o     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "INTERRUPTED"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b3
        L_0x00af:
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = r7.mo86976a()     // Catch:{ all -> 0x00e5 }
        L_0x00b3:
            com.google.android.enterprise.connectedapps.ap r2 = r3.f257432b     // Catch:{ all -> 0x00e3 }
            if (r3 != 0) goto L_0x00bb
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = com.google.android.apps.gsa.speech.helper.crossprofile.C92330o.m151626a()
        L_0x00bb:
            com.google.common.f.e r4 = f257414a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 12445(0x309d, float:1.7439E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r1.mo56158a(r5)
            r4.mo56353F(r0, r3, r5)
            com.google.android.libraries.search.logging.d.kp r0 = r7.f257415b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r1.mo56158a(r4)
            double r4 = (double) r4
            java.lang.String r1 = r3.f257431a
            r0.mo41680N(r4, r1)
            return r2
        L_0x00e3:
            r2 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r2 = move-exception
            r3 = 0
        L_0x00e7:
            if (r3 != 0) goto L_0x00ed
            com.google.android.apps.gsa.speech.helper.crossprofile.o r3 = com.google.android.apps.gsa.speech.helper.crossprofile.C92330o.m151626a()
        L_0x00ed:
            com.google.common.f.e r4 = f257414a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 12446(0x309e, float:1.744E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r1.mo56158a(r5)
            r4.mo56353F(r0, r3, r5)
            com.google.android.libraries.search.logging.d.kp r0 = r7.f257415b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r1.mo56158a(r4)
            double r4 = (double) r4
            java.lang.String r1 = r3.f257431a
            r0.mo41680N(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.helper.crossprofile.C92314ae.m151591c():com.google.android.enterprise.connectedapps.ap");
    }

    /* renamed from: D */
    public final String mo79657D(String str, long j) {
        return this.f257420g.mo86988b().f257425a.mo79657D(str, j);
    }

    /* renamed from: E */
    public final String mo79658E(Account account, String str, long j) {
        if (!C142574h.m231177a(this.f257421h.f386862c)) {
            return this.f257420g.mo86988b().f257425a.mo79658E(account, str, j);
        }
        C142556ap c = m151591c();
        try {
            C92327l a = this.f257420g.mo86987a();
            HashMap hashMap = new HashMap();
            for (C142555ao aoVar : a.f257429a.keySet()) {
                try {
                    hashMap.put(aoVar, ((C92329n) a.f257429a.get(aoVar)).mo86981c(account, str, j));
                } catch (C142562c unused) {
                }
            }
            String str2 = (String) hashMap.get(C142570e.f386860a);
            if (str2 != null) {
                if (c != null) {
                    c.close();
                }
                return str2;
            }
            String str3 = (String) hashMap.get(C142570e.f386861b);
            if (c != null) {
                c.close();
            }
            return str3;
        } catch (Throwable th) {
            C92339w.m151637a(th, th);
        }
        throw th;
    }

    /* renamed from: G */
    public final Set mo79660G(String str, long j) {
        if (!C142574h.m231177a(this.f257421h.f386862c)) {
            return (Set) Collection.EL.stream(this.f257420g.mo86988b().f257425a.mo79660G(str, j)).map(C92313ad.f257413a).collect(C58370cn.f155947b);
        }
        C142556ap c = m151591c();
        try {
            C92327l a = this.f257420g.mo86987a();
            HashMap hashMap = new HashMap();
            for (C142555ao aoVar : a.f257429a.keySet()) {
                try {
                    hashMap.put(aoVar, ((C92329n) a.f257429a.get(aoVar)).mo86982d(str, j));
                } catch (C142562c unused) {
                }
            }
            Set set = (Set) Collection.EL.stream(hashMap.entrySet()).flatMap(C92312ac.f257412a).collect(C58370cn.f155947b);
            if (c == null) {
                return set;
            }
            c.close();
            return set;
        } catch (Throwable th) {
            C92339w.m151637a(th, th);
        }
        throw th;
    }

    /* renamed from: H */
    public final Set mo79661H(String str, long j, boolean z) {
        throw null;
    }

    /* renamed from: L */
    public final void mo79665L(String str) {
        if (!C142574h.m231177a(this.f257421h.f386862c)) {
            this.f257420g.mo86988b().f257425a.mo79665L(str);
            return;
        }
        C142556ap c = m151591c();
        try {
            for (C92329n e : this.f257420g.mo86987a().f257429a.values()) {
                try {
                    e.mo86983e(str);
                } catch (C142562c unused) {
                }
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C92339w.m151637a(th, th);
        }
        throw th;
    }

    /* renamed from: N */
    public final boolean mo79667N(String str) {
        return this.f257420g.mo86988b().f257425a.mo79667N(str);
    }

    /* renamed from: a */
    public final C92330o mo86976a() {
        try {
            if (this.f257422i.mo117175b().mo117166r()) {
                return new C92330o("ALREADY_CONNECTED", this.f257422i.mo117180d(this));
            }
            ((C59052c) ((C59052c) f257414a.mo56224b()).mo56372aa(12443)).mo56386p("Waiting for connection to work profile.");
            return new C92330o("SUCCESS", this.f257422i.mo117180d(this));
        } catch (C142562c unused) {
            return new C92330o("UNAVAILABLE_EXCEPTION", this.f257422i.mo117179c(this));
        }
    }

    /* renamed from: w */
    public final Account mo79689w(String str) {
        if (!C142574h.m231177a(this.f257421h.f386862c)) {
            return this.f257420g.mo86988b().f257425a.mo79689w(str);
        }
        C142556ap c = m151591c();
        try {
            C92327l a = this.f257420g.mo86987a();
            HashMap hashMap = new HashMap();
            for (C142555ao aoVar : a.f257429a.keySet()) {
                try {
                    hashMap.put(aoVar, ((C92329n) a.f257429a.get(aoVar)).mo86979a(str));
                } catch (C142562c unused) {
                }
            }
            Account account = (Account) hashMap.get(C142570e.f386860a);
            if (account != null) {
                if (c != null) {
                    c.close();
                }
                return account;
            }
            Account account2 = (Account) hashMap.get(C142570e.f386861b);
            if (c != null) {
                c.close();
            }
            return account2;
        } catch (Throwable th) {
            C92339w.m151637a(th, th);
        }
        throw th;
    }

    /* renamed from: y */
    public final C60870cx mo79691y(String str, long j) {
        if (!C142574h.m231177a(this.f257421h.f386862c)) {
            return C60922j.m93044g(this.f257420g.mo86988b().f257425a.mo79691y(str, j), C92342z.f257442a, C60826bg.f164896a);
        }
        C92327l a = this.f257420g.mo86987a();
        HashMap hashMap = new HashMap();
        for (C142555ao aoVar : a.f257429a.keySet()) {
            hashMap.put(aoVar, ((C92329n) a.f257429a.get(aoVar)).mo86980b(str, j));
        }
        return C60922j.m93044g(C142568e.m231169e(hashMap), C92310aa.f257410a, C60826bg.f164896a);
    }
}
