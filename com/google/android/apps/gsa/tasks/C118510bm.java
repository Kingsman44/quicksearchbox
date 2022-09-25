package com.google.android.apps.gsa.tasks;

import android.os.Build;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.tasks.bm */
/* compiled from: PG */
final class C118510bm {

    /* renamed from: a */
    public byte[] f328919a;

    /* renamed from: b */
    final /* synthetic */ C118511bn f328920b;

    /* renamed from: c */
    private C118483ar f328921c;

    /* renamed from: d */
    private Map f328922d;

    /* renamed from: e */
    private Map f328923e;

    /* renamed from: f */
    private Set f328924f;

    /* renamed from: g */
    private Map f328925g;

    public C118510bm(C118511bn bnVar) {
        this.f328920b = bnVar;
    }

    /* renamed from: d */
    private final C118483ar m196735d() {
        if (this.f328921c == null) {
            this.f328921c = C118483ar.f328855e;
            byte[] e = this.f328920b.f328930e.mo80079e("com.google.android.apps.gsa.tasks.scheduled_tasks", (byte[]) null);
            if (e != null) {
                try {
                    this.f328921c = (C118483ar) C62942bv.parseFrom((C62942bv) C118483ar.f328855e, e);
                } catch (C62974ct e2) {
                    C59104x d = C118511bn.f328926a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "PeriodicTaskSync");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(33992)).mo56386p("Unable to parse scheduling status.");
                }
            }
        }
        return this.f328921c;
    }

    /* renamed from: e */
    private final Map m196736e() {
        C118522by byVar;
        if (this.f328922d == null) {
            this.f328922d = new EnumMap(C118522by.class);
            for (Map.Entry entry : Collections.unmodifiableMap(m196735d().f328858b).entrySet()) {
                try {
                    byVar = C118522by.m196757a((String) entry.getKey());
                } catch (IllegalArgumentException unused) {
                    byVar = null;
                }
                if (byVar != null) {
                    this.f328922d.put(byVar, (C118474ai) entry.getValue());
                }
            }
        }
        return this.f328922d;
    }

    /* renamed from: a */
    public final Map mo103728a() {
        if (this.f328923e == null) {
            this.f328923e = new EnumMap(C118522by.class);
            C118503bf bfVar = this.f328920b.f328927b;
            if (((Map) bfVar.f328910a.get()).isEmpty()) {
                bfVar.mo103726b();
            }
            for (Map.Entry entry : ((Map) bfVar.f328910a.get()).entrySet()) {
                C118522by byVar = (C118522by) entry.getKey();
                if (this.f328920b.f328928c.mo103757h(byVar)) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f328923e.put(byVar, (C118474ai) entry.getValue());
                }
            }
        }
        return this.f328923e;
    }

    /* renamed from: b */
    public final Map mo103729b() {
        if (this.f328925g == null) {
            if ((m196735d().f328857a & 1) != 0 && this.f328920b.f328931f == m196735d().f328859c && Build.VERSION.SDK_INT == m196735d().f328860d) {
                this.f328925g = new HashMap();
                for (Map.Entry entry : mo103728a().entrySet()) {
                    C118522by byVar = (C118522by) entry.getKey();
                    C118474ai aiVar = (C118474ai) entry.getValue();
                    if (!aiVar.equals(m196736e().get(byVar))) {
                        this.f328925g.put(byVar, aiVar);
                    }
                }
            } else {
                this.f328925g = mo103728a();
            }
        }
        return this.f328925g;
    }

    /* renamed from: c */
    public final Set mo103730c() {
        if (this.f328924f == null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C118522by.class);
            this.f328924f = noneOf;
            noneOf.addAll(m196736e().keySet());
            this.f328924f.removeAll(mo103728a().keySet());
        }
        return this.f328924f;
    }
}
