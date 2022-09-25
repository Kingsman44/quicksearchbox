package com.google.apps.tiktok.account.data.manager;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.C46164ap;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.C46214i;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.account.data.C46218m;
import com.google.apps.tiktok.account.data.C46319n;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46226g;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58819aj;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.manager.ae */
/* compiled from: PG */
public final class C46232ae implements C46302j {

    /* renamed from: a */
    public final C42876ab f121198a;

    /* renamed from: b */
    public final C60887da f121199b;

    /* renamed from: c */
    public final C69464a f121200c;

    /* renamed from: d */
    public final C69464a f121201d;

    /* renamed from: e */
    public final C69464a f121202e;

    /* renamed from: f */
    public final C69464a f121203f;

    /* renamed from: g */
    private final C60887da f121204g;

    /* renamed from: h */
    private final C69464a f121205h;

    public C46232ae(C42876ab abVar, C60887da daVar, C60887da daVar2, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5) {
        this.f121198a = abVar;
        this.f121204g = daVar;
        this.f121199b = daVar2;
        this.f121200c = aVar;
        this.f121201d = aVar2;
        this.f121203f = aVar5;
        this.f121205h = aVar3;
        this.f121202e = aVar4;
    }

    /* renamed from: g */
    public static int m82471g(C46221b bVar, C46226g gVar) {
        int i = ((C46222c) bVar.instance).f121176b;
        bVar.copyOnWrite();
        C46222c cVar = (C46222c) bVar.instance;
        cVar.f121175a |= 1;
        cVar.f121176b = i + 1;
        gVar.copyOnWrite();
        C46227h hVar = (C46227h) gVar.instance;
        C46227h hVar2 = C46227h.f121183e;
        hVar.f121185a |= 1;
        hVar.f121186b = i;
        bVar.mo50269a(i, (C46227h) gVar.build());
        return i;
    }

    /* renamed from: h */
    public static C46108a m82472h(C46227h hVar) {
        AccountId b = AccountId.m82057b(hVar.f121186b);
        C46215j jVar = hVar.f121187c;
        if (jVar == null) {
            jVar = C46215j.f121154k;
        }
        int a = C46161am.m82384a(hVar.f121188d);
        if (a == 0) {
            a = 1;
        }
        return new C46164ap(b, jVar, a);
    }

    /* renamed from: i */
    public static C58495hd m82473i(C46221b bVar, Collection collection) {
        int g;
        C46215j jVar;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C46215j jVar2 = (C46215j) it.next();
            Iterator it2 = Collections.unmodifiableMap(Collections.unmodifiableMap(((C46222c) bVar.instance).f121177c)).values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    C46226g gVar = (C46226g) C46227h.f121183e.createBuilder();
                    gVar.copyOnWrite();
                    C46227h hVar = (C46227h) gVar.instance;
                    jVar2.getClass();
                    hVar.f121187c = jVar2;
                    hVar.f121185a |= 2;
                    gVar.copyOnWrite();
                    C46227h hVar2 = (C46227h) gVar.instance;
                    hVar2.f121188d = 0;
                    hVar2.f121185a |= 4;
                    g = m82471g(bVar, gVar);
                    break;
                }
                C46227h hVar3 = (C46227h) it2.next();
                C46215j jVar3 = hVar3.f121187c;
                if (jVar3 == null) {
                    jVar3 = C46215j.f121154k;
                }
                if (jVar3.f121165j.equals(jVar2.f121165j) && jVar3.f121157b.equals(jVar2.f121157b)) {
                    C46226g gVar2 = (C46226g) hVar3.toBuilder();
                    gVar2.copyOnWrite();
                    C46227h hVar4 = (C46227h) gVar2.instance;
                    jVar2.getClass();
                    C46215j jVar4 = hVar4.f121187c;
                    if (jVar4 == null || jVar4 == (jVar = C46215j.f121154k)) {
                        hVar4.f121187c = jVar2;
                    } else {
                        C46214i iVar = (C46214i) jVar.createBuilder(jVar4);
                        iVar.mergeFrom(jVar2);
                        hVar4.f121187c = (C46215j) iVar.buildPartial();
                    }
                    hVar4.f121185a |= 2;
                    bVar.mo50269a(hVar3.f121186b, (C46227h) gVar2.build());
                    g = hVar3.f121186b;
                }
            }
            hashMap.put(AccountId.m82057b(g), jVar2);
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: j */
    public static C58495hd m82474j(Collection collection, C46221b bVar) {
        int a;
        C58490gz gzVar = new C58490gz(4);
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C46222c) bVar.instance).f121177c));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AccountId accountId = (AccountId) it.next();
            Integer valueOf = Integer.valueOf(accountId.mo50068a());
            if (unmodifiableMap.containsKey(valueOf) && (a = C46161am.m82384a(((C46227h) unmodifiableMap.get(valueOf)).f121188d)) != 0 && a == 2) {
                gzVar.mo55429h(accountId, (C46227h) unmodifiableMap.get(valueOf));
            }
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: k */
    public static C58495hd m82475k(Collection collection, C46221b bVar) {
        C46222c cVar = (C46222c) bVar.build();
        C58495hd i = m82473i(bVar, collection);
        C58838bb.m90884s(i.size() == collection.size(), "Provider had duplicate accounts.");
        C58526ih ihVar = new C58526ih();
        for (C46227h hVar : Collections.unmodifiableMap(cVar.f121177c).values()) {
            ihVar.mo55373c(AccountId.m82057b(hVar.f121186b));
        }
        C58528ij F = C58528ij.m90006F(C58758qx.m90645c(ihVar.mo55486f(), i.keySet()));
        C58495hd j = m82474j(F, bVar);
        m82477o(F, bVar);
        return j;
    }

    /* renamed from: l */
    public static C60852cf m82476l(C46217l lVar, Set set) {
        C60870cx cxVar;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                cxVar = ((C46319n) it.next()).mo22504a(lVar);
                arrayList.add(cxVar);
            } catch (Exception e) {
                cxVar = C60856cj.m92899h(e);
            }
            C46459k.m82829b(cxVar, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return C60856cj.m92892a(arrayList);
    }

    /* renamed from: o */
    public static void m82477o(Collection collection, C46221b bVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bVar.mo50270b(((AccountId) it.next()).mo50068a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if ((r3 & 1) != 0) goto L_0x0032;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m82478q(com.google.apps.tiktok.account.data.C46215j r3) {
        /*
            int r0 = r3.f121156a
            r0 = r0 & 256(0x100, float:3.59E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            com.google.common.base.C58838bb.m90868c(r0)
            int r0 = r3.f121156a
            r0 = r0 & r2
            if (r2 == r0) goto L_0x0015
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            com.google.common.base.C58838bb.m90868c(r0)
            int r0 = r3.f121156a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            com.google.common.base.C58838bb.m90868c(r0)
            boolean r0 = r3.f121163h
            if (r0 == 0) goto L_0x0032
            int r3 = r3.f121156a
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0033
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            com.google.common.base.C58838bb.m90868c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.data.manager.C46232ae.m82478q(com.google.apps.tiktok.account.data.j):void");
    }

    /* renamed from: a */
    public final C60870cx mo50272a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m82478q((C46215j) it.next());
        }
        C47558bi a = C47831fm.m85006a("Add Accounts");
        try {
            C60870cx g = C60922j.m93044g(mo50279n(this.f121198a, new C46313u(collection)), C47810es.m84963c(new C46315w(collection)), C60826bg.f164896a);
            a.mo51417a(g);
            a.close();
            return g;
        } catch (Throwable th) {
            C46303k.m82583a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo50273b(AccountId accountId) {
        return C60922j.m93045h(this.f121198a.mo46042d(), C47810es.m84966f(new C46308p(this, accountId)), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo50274c(AccountId accountId) {
        return C60922j.m93045h(this.f121198a.mo46042d(), C47810es.m84966f(new C46229ab(this, accountId)), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo50275d(Collection collection) {
        C47558bi a = C47831fm.m85006a("Remove Accounts");
        try {
            C47633f h = C47633f.m84733g(mo50279n(this.f121198a, new C46231ad(collection))).mo51516i(C47810es.m84966f(new C46316x(this)), this.f121199b).mo51515h(C46304l.f121288a, C60826bg.f164896a);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            C46303k.m82583a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final C60870cx mo50276e(Collection collection) {
        C47558bi a = C47831fm.m85006a("Sync Accounts");
        try {
            C47633f h = C47633f.m84733g(mo50279n(this.f121198a, new C46314v(collection))).mo51516i(new C46316x(this), this.f121199b).mo51515h(new C58819aj((Object) null), C60826bg.f164896a);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            C46303k.m82583a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final C60870cx mo50277f(Collection collection, C58528ij ijVar) {
        C58838bb.m90868c(!ijVar.isEmpty());
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            str.getClass();
            C58838bb.m90868c(!str.isEmpty());
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C46215j jVar = (C46215j) it.next();
            m82478q(jVar);
            C58838bb.m90879n(ijVar.contains(jVar.f121165j), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", ijVar, jVar.f121165j);
        }
        C47558bi a = C47831fm.m85006a("Sync Accounts for Types");
        try {
            C47633f h = C47633f.m84733g(mo50279n(this.f121198a, new C46312t(ijVar, collection))).mo51516i(new C46316x(this), this.f121199b).mo51515h(new C58819aj((Object) null), C60826bg.f164896a);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            C46303k.m82583a(th, th);
        }
        throw th;
    }

    /* renamed from: m */
    public final C60870cx mo50278m(AccountId accountId, C46227h hVar) {
        C46165aq aqVar = new C46165aq(accountId, ((C46164ap) m82472h(hVar)).f121087a);
        Set<C46218m> set = (Set) this.f121205h.mo17428b();
        ArrayList arrayList = new ArrayList(set.size());
        for (C46218m b : set) {
            try {
                arrayList.add(b.mo35387b(aqVar));
            } catch (Exception e) {
                arrayList.add(C60856cj.m92899h(e));
            }
        }
        return C60856cj.m92892a(arrayList).mo57335b(C47810es.m84965e(new C46228aa(this, arrayList, aqVar)), this.f121199b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C60870cx mo50279n(C42876ab abVar, C58817ah ahVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C60922j.m93044g(abVar.mo46039a(C47810es.m84963c(new C46310r(ahVar, atomicReference)), this.f121204g), C47810es.m84963c(new C46311s(atomicReference)), C60826bg.f164896a);
    }

    /* renamed from: p */
    public final C60870cx mo50280p(AccountId accountId, int i) {
        return this.f121198a.mo46039a(new C46230ac(accountId, i), C60826bg.f164896a);
    }
}
