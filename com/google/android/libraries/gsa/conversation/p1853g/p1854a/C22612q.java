package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1838b.C22348b;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.android.libraries.gsa.conversation.p1838b.C22352f;
import com.google.android.libraries.gsa.conversation.p1850d.C22556f;
import com.google.android.libraries.gsa.conversation.p1850d.C22559i;
import com.google.android.libraries.gsa.conversation.p1851e.C22568g;
import com.google.android.libraries.gsa.conversation.p1853g.C22641ba;
import com.google.android.libraries.gsa.conversation.p1853g.C22654bn;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51721bs;
import com.google.assistant.p3897e.p3921j.C51723bu;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52085er;
import com.google.assistant.p3897e.p3921j.C52089ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59449a;
import com.google.common.p4552o.p4553a.C59476b;
import com.google.common.p4552o.p4553a.C59503c;
import com.google.common.p4552o.p4553a.C59530d;
import com.google.common.p4552o.p4553a.C59550f;
import com.google.common.p4552o.p4553a.C59551g;
import com.google.common.p4552o.p4553a.C59553i;
import com.google.common.p4552o.p4553a.C59554j;
import com.google.common.p4552o.p4553a.C59555k;
import com.google.common.p4552o.p4553a.C59556l;
import com.google.common.p4552o.p4553a.C59557m;
import com.google.common.p4552o.p4553a.C59559o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.Map;
import java.util.Random;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.q */
/* compiled from: PG */
public final class C22612q implements C22348b {

    /* renamed from: a */
    public static final C59071e f62291a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.a.q");

    /* renamed from: b */
    public final C60887da f62292b;

    /* renamed from: c */
    public final Map f62293c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C22559i f62294d;

    /* renamed from: e */
    public final C21370a f62295e;

    /* renamed from: f */
    public C60870cx f62296f;

    /* renamed from: g */
    public final C22352f f62297g = new C22352f();

    /* renamed from: h */
    private final C22607l f62298h;

    /* renamed from: i */
    private int f62299i = 0;

    /* renamed from: j */
    private C60870cx f62300j;

    /* renamed from: k */
    private final C22568g f62301k;

    public C22612q(C22607l lVar, C60888db dbVar, C22559i iVar, C21370a aVar, C22568g gVar) {
        this.f62298h = lVar;
        this.f62292b = dbVar;
        this.f62294d = iVar;
        this.f62295e = aVar;
        this.f62301k = gVar;
    }

    /* renamed from: b */
    public static C58833ax m42119b(C52081en enVar) {
        if ((enVar.f136681a & 128) != 0) {
            return C58833ax.m90834k(enVar.f136688h);
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 3) {
                C52078ek ekVar = (C52078ek) epVar.f136693c;
                if ((ekVar.f136673a & 2) != 0) {
                    return C58833ax.m90834k(ekVar.f136676d);
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: n */
    private static String m42120n(C60870cx cxVar) {
        if (cxVar == null) {
            return "unknown";
        }
        if (cxVar.isDone()) {
            return cxVar.isCancelled() ? "Cancelled" : "Done";
        }
        return "Not done";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m42121o() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.common.util.concurrent.cx r0 = r3.f62300j     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0016
            com.google.android.libraries.gsa.conversation.d.i r0 = r3.f62294d     // Catch:{ all -> 0x0031 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f62185f     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            monitor-exit(r3)
            return
        L_0x0018:
            com.google.android.libraries.gsa.conversation.g.a.l r0 = r3.f62298h     // Catch:{ all -> 0x0031 }
            com.google.common.util.concurrent.cx r0 = r0.mo27715b()     // Catch:{ all -> 0x0031 }
            com.google.android.libraries.gsa.conversation.g.a.n r1 = new com.google.android.libraries.gsa.conversation.g.a.n     // Catch:{ all -> 0x0031 }
            r1.<init>(r3)     // Catch:{ all -> 0x0031 }
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)     // Catch:{ all -> 0x0031 }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x0031 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r2)     // Catch:{ all -> 0x0031 }
            r3.f62300j = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22612q.m42121o():void");
    }

    /* renamed from: a */
    public final synchronized void mo27576a(C22350d dVar) {
        dVar.mo27580c("WhatsNextProgramRunner");
        dVar.mo27579b("Initialization", m42120n(this.f62300j));
        dVar.mo27579b("ProcessingWNDelta", m42120n(this.f62296f));
        dVar.mo27579b("WhatsNextKeys", this.f62293c.keySet());
        dVar.mo27579b("Latency", this.f62297g.mo27582a().mo27581d());
        dVar.mo27578a(this.f62294d);
        dVar.mo27578a(this.f62298h);
    }

    /* renamed from: c */
    public final synchronized C58833ax mo27722c() {
        Map c = this.f62298h.mo27716c();
        if (c.isEmpty()) {
            return C58836b.f156633a;
        }
        C51721bs bsVar = (C51721bs) C51723bu.f135696d.createBuilder();
        bsVar.copyOnWrite();
        C51723bu buVar = (C51723bu) bsVar.instance;
        buVar.f135698a |= 1;
        buVar.f135699b = true;
        bsVar.copyOnWrite();
        ((C51723bu) bsVar.instance).mo53716a().putAll(c);
        return C58833ax.m90834k((C51723bu) bsVar.build());
    }

    /* renamed from: d */
    public final synchronized C59556l mo27723d(long j) {
        C59503c cVar;
        cVar = (C59503c) C59556l.f158032e.createBuilder();
        C59530d dVar = (C59530d) C59550f.f158019c.createBuilder();
        int i = this.f62299i != 0 ? 2 : 1;
        dVar.copyOnWrite();
        C59550f fVar = (C59550f) dVar.instance;
        fVar.f158022b = i - 1;
        fVar.f158021a |= 1;
        cVar.copyOnWrite();
        C59556l lVar = (C59556l) cVar.instance;
        C59550f fVar2 = (C59550f) dVar.build();
        fVar2.getClass();
        lVar.f158036c = fVar2;
        lVar.f158035b = 3;
        long b = this.f62295e.mo26870b();
        cVar.copyOnWrite();
        C59556l lVar2 = (C59556l) cVar.instance;
        lVar2.f158034a |= 8;
        lVar2.f158037d = b - j;
        return (C59556l) cVar.build();
    }

    /* renamed from: e */
    public final C59556l mo27724e(boolean z, long j) {
        C59503c cVar = (C59503c) C59556l.f158032e.createBuilder();
        C59554j jVar = (C59554j) C59555k.f158028c.createBuilder();
        jVar.copyOnWrite();
        C59555k kVar = (C59555k) jVar.instance;
        kVar.f158030a |= 1;
        kVar.f158031b = z;
        cVar.copyOnWrite();
        C59556l lVar = (C59556l) cVar.instance;
        C59555k kVar2 = (C59555k) jVar.build();
        kVar2.getClass();
        lVar.f158036c = kVar2;
        lVar.f158035b = 1;
        long b = this.f62295e.mo26870b();
        cVar.copyOnWrite();
        C59556l lVar2 = (C59556l) cVar.instance;
        lVar2.f158034a |= 8;
        lVar2.f158037d = b - j;
        return (C59556l) cVar.build();
    }

    /* renamed from: f */
    public final synchronized void mo27725f(C52085er erVar) {
        if (this.f62298h.mo27720g(erVar)) {
            if (this.f62300j != null) {
                if (this.f62294d.f62185f.get()) {
                    C22559i iVar = this.f62294d;
                    C58976aa aaVar = C58975e.f156826a;
                    iVar.f62185f.set(false);
                    iVar.f62184e.post(new C22556f(iVar));
                }
                C60870cx cxVar = this.f62300j;
                cxVar.getClass();
                if (!cxVar.isDone() && !this.f62300j.cancel(false)) {
                    ((C59052c) ((C59052c) f62291a.mo56225c()).mo56372aa(48415)).mo56386p("Failed to cancel initialization");
                }
                m42121o();
            }
        }
    }

    /* renamed from: g */
    public final void mo27726g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if ((((C52089ev) entry.getValue()).f136708a & 32) != 0) {
                this.f62293c.put((String) entry.getKey(), (C52089ev) entry.getValue());
            } else {
                ((C59052c) ((C59052c) f62291a.mo56225c()).mo56372aa(48416)).mo56389s("No JwnProgram provided for: %s", entry.getKey());
            }
        }
        m42121o();
    }

    /* renamed from: h */
    public final synchronized void mo27727h() {
        this.f62299i = 0;
        C60870cx cxVar = this.f62296f;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: i */
    public final void mo27728i(C59556l lVar) {
        C22568g gVar = this.f62301k;
        C59449a aVar = (C59449a) C59476b.f157797e.createBuilder();
        aVar.copyOnWrite();
        C59476b bVar = (C59476b) aVar.instance;
        lVar.getClass();
        bVar.f157801c = lVar;
        bVar.f157800b = 3;
        gVar.mo27657a((C59476b) aVar.build());
    }

    /* renamed from: j */
    public final synchronized boolean mo27729j(int i) {
        return this.f62299i == i;
    }

    /* renamed from: k */
    public final synchronized void mo27730k(C52081en enVar, C22641ba baVar) {
        long b = this.f62295e.mo26870b();
        m42121o();
        C60870cx cxVar = this.f62296f;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        int i = (enVar.f136681a & 128) != 0 ? 3 : 2;
        C59557m mVar = (C59557m) C59559o.f158039c.createBuilder();
        mVar.copyOnWrite();
        C59559o oVar = (C59559o) mVar.instance;
        oVar.f158042b = i - 1;
        oVar.f158041a |= 1;
        C59559o oVar2 = (C59559o) mVar.build();
        C22568g gVar = this.f62301k;
        C59449a aVar = (C59449a) C59476b.f157797e.createBuilder();
        aVar.copyOnWrite();
        C59476b bVar = (C59476b) aVar.instance;
        oVar2.getClass();
        bVar.f157801c = oVar2;
        bVar.f157800b = 2;
        gVar.mo27657a((C59476b) aVar.build());
        int nextInt = new Random().nextInt(Integer.MAX_VALUE) + 1;
        this.f62299i = nextInt;
        C60870cx cxVar2 = this.f62300j;
        cxVar2.getClass();
        C60856cj.m92911t(cxVar2, C47810es.m84974n(new C22610o(this, nextInt, b, enVar, baVar)), this.f62292b);
    }

    /* renamed from: l */
    public final void mo27731l(C52081en enVar, C22641ba baVar, C59556l lVar) {
        mo27728i(lVar);
        C58976aa aaVar = C58975e.f156826a;
        C22654bn.m42175j(baVar.f62367a, enVar, baVar.f62368b);
    }

    /* renamed from: m */
    public final C59556l mo27732m(int i, long j) {
        C59503c cVar = (C59503c) C59556l.f158032e.createBuilder();
        C59551g gVar = (C59551g) C59553i.f158024c.createBuilder();
        gVar.copyOnWrite();
        C59553i iVar = (C59553i) gVar.instance;
        iVar.f158027b = i - 1;
        iVar.f158026a |= 1;
        cVar.copyOnWrite();
        C59556l lVar = (C59556l) cVar.instance;
        C59553i iVar2 = (C59553i) gVar.build();
        iVar2.getClass();
        lVar.f158036c = iVar2;
        lVar.f158035b = 2;
        long b = this.f62295e.mo26870b();
        cVar.copyOnWrite();
        C59556l lVar2 = (C59556l) cVar.instance;
        lVar2.f158034a |= 8;
        lVar2.f158037d = b - j;
        return (C59556l) cVar.build();
    }
}
