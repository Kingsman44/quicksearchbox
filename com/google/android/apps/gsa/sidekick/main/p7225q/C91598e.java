package com.google.android.apps.gsa.sidekick.main.p7225q;

import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.k.e;
import com.google.android.apps.gsa.k.f;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.training.QuestionKey;
import com.google.android.apps.p489g.p495e.C9285b;
import com.google.android.apps.p489g.p495e.C9287d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7660ff;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7897o;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7924p;
import com.google.p375ai.p378b.C7927pc;
import com.google.p375ai.p378b.C7929pe;
import com.google.p375ai.p378b.C7931pg;
import com.google.p375ai.p378b.C8032t;
import com.google.p375ai.p378b.C8098vl;
import com.google.p375ai.p378b.C8135wv;
import com.google.p375ai.p378b.C8138wy;
import com.google.p375ai.p378b.C8139wz;
import com.google.p375ai.p378b.C8164xx;
import com.google.p375ai.p378b.C8165xy;
import com.google.p375ai.p378b.C8166xz;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.q.e */
/* compiled from: PG */
public final class C91598e {

    /* renamed from: a */
    public static final C59071e f255463a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.q.e");

    /* renamed from: b */
    public final d f255464b;

    /* renamed from: c */
    public final d f255465c;

    /* renamed from: d */
    public final f f255466d;

    /* renamed from: e */
    public final C91376f f255467e;

    /* renamed from: f */
    public final C21370a f255468f;

    /* renamed from: g */
    public final Object f255469g = new Object();

    /* renamed from: h */
    public Map f255470h;

    /* renamed from: i */
    public Map f255471i;

    /* renamed from: j */
    public Map f255472j;

    /* renamed from: k */
    public Map f255473k;

    /* renamed from: l */
    public final Map f255474l;

    /* renamed from: m */
    public final C90929bz f255475m;

    /* renamed from: n */
    public final C68214a f255476n;

    /* renamed from: o */
    private final C85651bb f255477o;

    public C91598e(e eVar, f fVar, C91376f fVar2, C21370a aVar, C90929bz bzVar, C68214a aVar2, C85651bb bbVar) {
        this.f255464b = new d(C9287d.f32233f, "training_question_data", eVar, fVar, true);
        this.f255465c = new d(C9287d.f32233f, "client_training_question_data", eVar, fVar, true);
        this.f255466d = fVar;
        this.f255467e = fVar2;
        this.f255468f = aVar;
        this.f255474l = new HashMap();
        this.f255475m = bzVar;
        this.f255476n = aVar2;
        this.f255477o = bbVar;
    }

    /* renamed from: a */
    public final C8166xz mo85959a() {
        C90748e.m148224b();
        C9287d dVar = (C9287d) this.f255464b.a();
        C8165xy xyVar = (C8165xy) C8166xz.f28696e.createBuilder();
        C8139wz wzVar = dVar.f32236b;
        if (wzVar == null) {
            wzVar = C8139wz.f28614d;
        }
        if ((wzVar.f28616a & 1) != 0) {
            C8139wz wzVar2 = dVar.f32236b;
            if (wzVar2 == null) {
                wzVar2 = C8139wz.f28614d;
            }
            C8135wv wvVar = wzVar2.f28617b;
            if (wvVar == null) {
                wvVar = C8135wv.f28607a;
            }
            xyVar.copyOnWrite();
            C8166xz xzVar = (C8166xz) xyVar.instance;
            wvVar.getClass();
            xzVar.f28699b = wvVar;
            xzVar.f28698a |= 1;
        }
        C7931pg pgVar = dVar.f32237c;
        if (pgVar == null) {
            pgVar = C7931pg.f27864d;
        }
        if ((pgVar.f27866a & 1) != 0) {
            C7931pg pgVar2 = dVar.f32237c;
            if (pgVar2 == null) {
                pgVar2 = C7931pg.f27864d;
            }
            C7929pe peVar = pgVar2.f27867b;
            if (peVar == null) {
                peVar = C7929pe.f27862a;
            }
            xyVar.copyOnWrite();
            C8166xz xzVar2 = (C8166xz) xyVar.instance;
            peVar.getClass();
            xzVar2.f28700c = peVar;
            xzVar2.f28698a |= 2;
        }
        Long l = null;
        for (C7918ou ouVar : dVar.f32238d) {
            if ((ouVar.f27826a & 4) != 0) {
                long j = ouVar.f27830e;
                if (l == null || j > l.longValue()) {
                    l = Long.valueOf(j);
                }
            }
        }
        if (l != null) {
            C7897o oVar = (C7897o) C7924p.f27840c.createBuilder();
            long longValue = l.longValue();
            oVar.copyOnWrite();
            C7924p pVar = (C7924p) oVar.instance;
            pVar.f27842a |= 1;
            pVar.f27843b = longValue;
            xyVar.copyOnWrite();
            C8166xz xzVar3 = (C8166xz) xyVar.instance;
            C7924p pVar2 = (C7924p) oVar.build();
            pVar2.getClass();
            xzVar3.f28701d = pVar2;
            xzVar3.f28698a |= 4;
        }
        return (C8166xz) xyVar.build();
    }

    /* renamed from: b */
    public final Iterable mo85960b() {
        C90748e.m148224b();
        HashMap hashMap = new HashMap();
        mo85962d();
        for (C9285b bVar : ((C9287d) this.f255465c.a()).f32239e) {
            C7918ou ouVar = bVar.f32230b;
            if (ouVar == null) {
                ouVar = C7918ou.f27824h;
            }
            hashMap.put(new QuestionKey(ouVar), bVar);
        }
        synchronized (this.f255469g) {
            hashMap.putAll(this.f255474l);
        }
        return hashMap.values();
    }

    /* renamed from: c */
    public final void mo85961c() {
        C90748e.m148224b();
        this.f255464b.c();
        this.f255465c.c();
        mo85963e((C9287d) this.f255464b.a());
        synchronized (this.f255469g) {
            this.f255474l.clear();
        }
    }

    /* renamed from: d */
    public final void mo85962d() {
        C90748e.m148224b();
        synchronized (this.f255469g) {
            if (this.f255473k == null) {
                C9287d dVar = (C9287d) this.f255465c.a();
                this.f255473k = C58662ni.m90351j(dVar.f32239e.size());
                for (C9285b bVar : dVar.f32239e) {
                    Map map = this.f255473k;
                    C7918ou ouVar = bVar.f32230b;
                    if (ouVar == null) {
                        ouVar = C7918ou.f27824h;
                    }
                    map.put(new QuestionKey(ouVar), bVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo85963e(C9287d dVar) {
        synchronized (this.f255469g) {
            this.f255470h = new HashMap();
            if ((dVar.f32235a & 1) != 0) {
                C8139wz wzVar = dVar.f32236b;
                if (wzVar == null) {
                    wzVar = C8139wz.f28614d;
                }
                for (C8138wy wyVar : wzVar.f28618c) {
                    this.f255470h.put(wyVar.f28611a, wyVar.f28612b);
                }
            }
            this.f255471i = new HashMap();
            if ((dVar.f32235a & 2) != 0) {
                C7931pg pgVar = dVar.f32237c;
                if (pgVar == null) {
                    pgVar = C7931pg.f27864d;
                }
                for (C7927pc pcVar : pgVar.f27868c) {
                    this.f255471i.put(Long.valueOf(pcVar.f27852b), pcVar);
                }
            }
            this.f255472j = C58662ni.m90351j(dVar.f32238d.size());
            for (C7918ou ouVar : dVar.f32238d) {
                this.f255472j.put(new QuestionKey(ouVar), ouVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo85964f(C8164xx xxVar, Iterable iterable) {
        C7661fg j;
        C90748e.m148224b();
        if ((xxVar.f28690a & 8) != 0) {
            C85651bb bbVar = this.f255477o;
            C8098vl vlVar = xxVar.f28694e;
            if (vlVar == null) {
                vlVar = C8098vl.f28472k;
            }
            String F = ((C86054o) bbVar.f231495f.mo27525b()).mo79659F();
            if (!(F == null || (j = bbVar.mo79149j(F)) == null)) {
                C7660ff ffVar = (C7660ff) j.toBuilder();
                ffVar.copyOnWrite();
                C7661fg fgVar = (C7661fg) ffVar.instance;
                vlVar.getClass();
                fgVar.f26591e = vlVar;
                fgVar.f26587a |= 8;
                bbVar.mo79136I((C7661fg) ffVar.build(), F);
            }
        }
        int i = xxVar.f28690a;
        if ((i & 1) == 0 && (i & 2) == 0 && (i & 4) == 0 && !iterable.iterator().hasNext()) {
            ((C59052c) ((C59052c) f255463a.mo56224b()).mo56372aa(11774)).mo56386p("updateFromServerResponse: no new training mode data and no pending answered questions to clear");
            return;
        }
        int b = C58557jl.m90121b(iterable);
        C8032t tVar = xxVar.f28693d;
        if (tVar == null) {
            tVar = C8032t.f28216c;
        }
        int size = tVar.f28218a.size();
        if (b > 0 && size < b) {
            ((C59052c) ((C59052c) f255463a.mo56226d()).mo56372aa(11773)).mo56393w("Fewer answers received than sent: sent: %d, received: %d", b, size);
        }
        this.f255464b.d(new C91594a(xxVar));
        this.f255465c.d(new C91595b(this, iterable));
        mo85963e((C9287d) this.f255464b.a());
    }
}
