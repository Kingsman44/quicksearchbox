package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124382b;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124512j;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.ah */
/* compiled from: PG */
final class C124437ah implements C70862aj {

    /* renamed from: a */
    public static final C59071e f343426a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.d.a.ah");

    /* renamed from: b */
    public final C70862aj f343427b;

    /* renamed from: c */
    public final C124382b f343428c;

    /* renamed from: d */
    public final C32904f f343429d;

    /* renamed from: e */
    public final C58528ij f343430e;

    /* renamed from: f */
    public C124436ag f343431f = null;

    /* renamed from: g */
    private final ExecutorService f343432g;

    /* renamed from: h */
    private final C47632e f343433h;

    public C124437ah(C70862aj ajVar, ExecutorService executorService, C124382b bVar, C124512j jVar, C32904f fVar, Set set) {
        this.f343427b = ajVar;
        this.f343432g = executorService;
        this.f343428c = bVar;
        this.f343429d = fVar;
        C47632e eVar = new C47632e();
        this.f343433h = eVar;
        this.f343430e = C58528ij.m90006F(set);
        jVar.f343570b.mo104264b(new C124491p(this));
        jVar.f343572d.mo104264b(new C124492q(this));
        jVar.f343571c.mo104264b(new C124493r(this));
        jVar.f343573e.mo104264b(new C124494s(this));
        jVar.f343574f.mo104264b(new C124495t(this));
        jVar.f343575g.mo104264b(new C124497v(this));
        m203920k(eVar.mo51511a(new C124498w(this, fVar, bVar), executorService));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124436ag m203919d(com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f r2, com.google.common.p4522b.C58528ij r3, com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124382b r4) {
        /*
            r0 = 0
            java.lang.String r1 = "NGA"
            com.google.android.libraries.search.assistant.f.a.e r2 = r2.mo38224a(r1, r3)     // Catch:{ all -> 0x0017 }
            com.google.android.libraries.search.assistant.f.a.d.cq r3 = r2.mo38265b()     // Catch:{ all -> 0x0015 }
            com.google.android.apps.search.assistant.surfaces.b.a.a r0 = r4.mo106407a(r3)     // Catch:{ all -> 0x0015 }
            com.google.android.apps.search.assistant.surfaces.b.d.a.ag r3 = new com.google.android.apps.search.assistant.surfaces.b.d.a.ag     // Catch:{ all -> 0x0015 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            r3 = move-exception
            goto L_0x001a
        L_0x0017:
            r2 = move-exception
            r3 = r2
            r2 = r0
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            if (r2 == 0) goto L_0x0024
            r2.close()
        L_0x0024:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124437ah.m203919d(com.google.android.libraries.search.assistant.f.a.f, com.google.common.b.ij, com.google.android.apps.search.assistant.surfaces.b.a.b):com.google.android.apps.search.assistant.surfaces.b.d.a.ag");
    }

    /* renamed from: k */
    private static void m203920k(C60870cx cxVar) {
        C47633f g = C47633f.m84733g(cxVar);
        C124435af afVar = new C124435af();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(afVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo20121a() {
        mo106423i(new C124489n(this));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x d = f343426a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RequestObserver");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37061)).mo56386p("[onError]");
        mo106423i(new C124490o(this));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C124484i iVar = (C124484i) obj;
        C58976aa aaVar = C58975e.f156826a;
        C124477bt a = C124477bt.m203948a(iVar.f343531b);
        if (a == null) {
            a = C124477bt.UNRECOGNIZED;
        }
        a.name();
        C124476bs bsVar = C124476bs.UNKNOWN_STATE;
        C124477bt a2 = C124477bt.m203948a(iVar.f343531b);
        if (a2 == null) {
            a2 = C124477bt.UNRECOGNIZED;
        }
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo106423i(new C124500y(this));
                return;
            } else if (ordinal == 2) {
                mo106423i(new C124501z(this));
                return;
            } else if (ordinal != 3) {
                return;
            }
        }
        mo106422h(new C124430aa(this));
    }

    /* renamed from: e */
    public final C60870cx mo106419e() {
        C124436ag agVar = this.f343431f;
        if (agVar == null) {
            return C60866ct.f164955a;
        }
        C60870cx b = agVar.f343425b.mo106405b();
        C124485j jVar = new C124485j(this);
        return C60922j.m93044g(b, C47810es.m84963c(jVar), this.f343432g);
    }

    /* renamed from: f */
    public final C60870cx mo106420f(C60870cx cxVar, C124477bt btVar) {
        return C47633f.m84733g(cxVar).mo51515h(new C124496u(this, btVar), C60826bg.f164896a).mo51513e(Throwable.class, new C124499x(this, btVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final void mo106421g() {
        C124436ag agVar = this.f343431f;
        if (agVar != null) {
            agVar.f343425b.close();
            agVar.f343424a.close();
            this.f343431f = null;
        }
    }

    /* renamed from: h */
    public final void mo106422h(Runnable runnable) {
        m203920k(this.f343433h.mo51511a(new C124431ab(runnable), this.f343432g));
    }

    /* renamed from: i */
    public final void mo106423i(C60930r rVar) {
        m203920k(this.f343433h.mo51512b(rVar, this.f343432g));
    }

    /* renamed from: j */
    public final void mo106424j(C124448as asVar) {
        mo106422h(new C124432ac(this, asVar));
    }
}
