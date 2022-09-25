package com.google.apps.tiktok.tracing;

import android.util.SparseArray;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.tracing.dv */
/* compiled from: PG */
final class C47786dv implements C47781dq, C47541b {

    /* renamed from: a */
    public static final C59071e f123772a = C59071e.m91332i("com.google.apps.tiktok.tracing.dv");

    /* renamed from: b */
    public final C21370a f123773b;

    /* renamed from: c */
    public final C60888db f123774c;

    /* renamed from: d */
    public final ConcurrentMap f123775d = new ConcurrentHashMap(2, 0.75f, 1);

    /* renamed from: e */
    public final C58833ax f123776e;

    /* renamed from: f */
    public final AtomicLong f123777f;

    /* renamed from: g */
    public final int f123778g;

    /* renamed from: h */
    public final int f123779h;

    /* renamed from: i */
    private final C47534at f123780i;

    /* renamed from: j */
    private final C69464a f123781j;

    /* renamed from: k */
    private final C47819fa f123782k;

    /* renamed from: l */
    private final C47517ac f123783l;

    public C47786dv(C47534at atVar, C21370a aVar, C60888db dbVar, C69464a aVar2, C47819fa faVar, C47517ac acVar, Map map, Map map2, C58833ax axVar) {
        boolean z = true;
        this.f123780i = atVar;
        this.f123773b = aVar;
        this.f123774c = dbVar;
        this.f123781j = aVar2;
        this.f123782k = faVar;
        this.f123783l = acVar;
        if (!map.isEmpty()) {
            C58838bb.m90869d(map.size() == 1, "Please only specify the max number of spans once.");
            this.f123778g = ((C47527am) C58557jl.m90133n(map.keySet())).mo51391a();
        } else {
            this.f123778g = 500;
        }
        this.f123776e = axVar;
        if (!map2.isEmpty()) {
            C58838bb.m90869d(map2.size() != 1 ? false : z, "Please only specify the trace deadline limit once.");
            this.f123779h = ((C47774dl) C58557jl.m90133n(map2.keySet())).mo51618a();
        } else {
            this.f123779h = 2100000;
        }
        this.f123777f = new AtomicLong((long) this.f123779h);
    }

    /* renamed from: f */
    private final C47572bw m84938f(String str, C47563bn bnVar, long j, long j2, int i, C47813ev evVar) {
        long j3;
        C47813ev evVar2 = evVar;
        UUID b = this.f123783l.mo51386b();
        float f = this.f123782k.f123843a;
        boolean a = C47817ez.m84993a(b.getLeastSignificantBits(), 0.0f);
        C47811et etVar = (C47811et) C47814ew.f123830i.createBuilder();
        long leastSignificantBits = b.getLeastSignificantBits();
        etVar.copyOnWrite();
        C47814ew ewVar = (C47814ew) etVar.instance;
        ewVar.f123832a |= 2;
        ewVar.f123834c = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        etVar.copyOnWrite();
        C47814ew ewVar2 = (C47814ew) etVar.instance;
        ewVar2.f123832a |= 1;
        ewVar2.f123833b = mostSignificantBits;
        etVar.copyOnWrite();
        C47814ew ewVar3 = (C47814ew) etVar.instance;
        ewVar3.f123832a |= 4;
        ewVar3.f123836e = j;
        etVar.copyOnWrite();
        C47814ew ewVar4 = (C47814ew) etVar.instance;
        ewVar4.f123832a |= 8;
        long j4 = j2;
        ewVar4.f123837f = j4;
        etVar.copyOnWrite();
        C47814ew ewVar5 = (C47814ew) etVar.instance;
        ewVar5.f123839h = evVar2.f123829d;
        ewVar5.f123832a |= 32;
        C47814ew ewVar6 = (C47814ew) etVar.build();
        if (evVar2 == C47813ev.REALTIME) {
            j3 = j4;
        } else {
            j3 = this.f123773b.mo26874f();
        }
        C47843fx fxVar = new C47843fx(str, bnVar, i);
        C47847ga gaVar = new C47847ga(this, b, ewVar6, fxVar, j3, a, evVar2 == C47813ev.UPTIME, this.f123773b);
        C47537aw awVar = new C47537aw(fxVar, gaVar);
        C47534at atVar = this.f123780i;
        if (atVar.f123376d.compareAndSet(false, true)) {
            atVar.f123375c.execute(new C47531aq(atVar));
        }
        C47533as asVar = new C47533as(awVar, atVar.f123374b);
        C47534at.f123373a.put(asVar, Boolean.TRUE);
        C47532ar arVar = asVar.f123372a;
        C60888db dbVar = this.f123774c;
        gaVar.f123896f = arVar;
        arVar.mo4106b(gaVar, dbVar);
        this.f123775d.put(b, gaVar);
        C47831fm.m85013h(awVar);
        return awVar;
    }

    /* renamed from: g */
    private static final void m84939g(C47572bw bwVar, String str) {
        C47861u uVar;
        if (bwVar != null) {
            if (bwVar instanceof C47864x) {
                String k = C47831fm.m85016k(bwVar);
                if (!BuildConfig.FLAVOR.equals(k)) {
                    k = ": ".concat(String.valueOf(k));
                }
                uVar = new C47861u(k, str, ((C47864x) bwVar).mo51393f());
                C47820fb.m84994a(uVar, C47822fd.m84997c());
            } else {
                uVar = new C47861u(str);
                C47820fb.m84994a(uVar, C47822fd.m84997c());
            }
            C59104x c = C47780dp.f123766a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TraceManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(uVar)).mo56372aa(54783)).mo56386p("Duplicate trace");
        }
    }

    /* renamed from: a */
    public final Map mo51404a() {
        C47845fz b;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : this.f123775d.entrySet()) {
            C47847ga gaVar = (C47847ga) entry.getValue();
            UUID uuid = (UUID) entry.getKey();
            synchronized (gaVar) {
                b = gaVar.mo51671b();
            }
            gzVar.mo55429h(uuid, b.f123887d);
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: b */
    public final C47538ax mo51621b(String str, C47563bn bnVar, C47813ev evVar) {
        return mo51622c(str, bnVar, this.f123773b.mo26870b(), this.f123773b.mo26871c(), evVar);
    }

    /* renamed from: c */
    public final C47538ax mo51622c(String str, C47563bn bnVar, long j, long j2, C47813ev evVar) {
        C47572bw d = C47831fm.m85009d();
        m84939g(d, str);
        C47572bw f = m84938f(str, bnVar, j, j2, 1, evVar);
        return d == ((C47537aw) f).f123378a ? f : new C47782dr(f, d);
    }

    /* renamed from: d */
    public final C47571bv mo51623d(String str, C47563bn bnVar, C47813ev evVar) {
        C47572bw d = C47831fm.m85009d();
        m84939g(d, str);
        return new C47785du(new C47558bi(m84938f(str, bnVar, this.f123773b.mo26870b(), this.f123773b.mo26871c(), 2, evVar)), d);
    }

    /* renamed from: e */
    public void mo51626e(C47814ew ewVar, SparseArray sparseArray, String str) {
        C47572bw d = C47831fm.m85009d();
        C47831fm.m85013h(new C47530ap(str, C47530ap.f123368a, C47562bm.f123426a));
        try {
            RuntimeException runtimeException = null;
            for (C47779do b : (Set) this.f123781j.mo17428b()) {
                try {
                    b.mo51372b(ewVar, sparseArray);
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(runtimeException, new Object[]{e});
                        } catch (Exception unused) {
                        }
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
        } finally {
            C47831fm.m85013h(d);
        }
    }
}
