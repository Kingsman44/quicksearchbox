package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59896be;
import com.google.common.p4552o.p4563i.C59897bf;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64571at;
import com.google.protos.p4963bf.p4964a.p4965a.C64572au;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;
import com.google.protos.p4963bf.p4964a.p4965a.C64574aw;
import com.google.protos.p4963bf.p4964a.p4965a.C64575ax;
import com.google.protos.p4963bf.p4964a.p4965a.C64606k;
import com.google.protos.p4963bf.p4964a.p4965a.C64620y;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.an.z */
/* compiled from: PG */
public final class C25454z implements C27654a {

    /* renamed from: a */
    public static final C58974d f69365a = C58974d.m91135i("LensQueryController");

    /* renamed from: b */
    static final C64573av f69366b;

    /* renamed from: c */
    public final Executor f69367c;

    /* renamed from: d */
    public final C25364ab f69368d;

    /* renamed from: e */
    public C25453y f69369e;

    /* renamed from: f */
    public boolean f69370f;

    static {
        C64572au auVar = (C64572au) C64573av.f175078c.createBuilder();
        C64574aw awVar = (C64574aw) C64575ax.f175082b.createBuilder();
        C64606k kVar = (C64606k) C64571at.f175074c.createBuilder();
        C64620y yVar = C64620y.f175169a;
        kVar.copyOnWrite();
        C64571at atVar = (C64571at) kVar.instance;
        yVar.getClass();
        atVar.f175077b = yVar;
        atVar.f175076a = 12;
        awVar.copyOnWrite();
        C64575ax axVar = (C64575ax) awVar.instance;
        C64571at atVar2 = (C64571at) kVar.build();
        atVar2.getClass();
        C62971cq cqVar = axVar.f175084a;
        if (!cqVar.mo58948c()) {
            axVar.f175084a = C62942bv.mutableCopy(cqVar);
        }
        axVar.f175084a.add(atVar2);
        auVar.copyOnWrite();
        C64573av avVar = (C64573av) auVar.instance;
        C64575ax axVar2 = (C64575ax) awVar.build();
        axVar2.getClass();
        avVar.f175081b = axVar2;
        avVar.f175080a |= 1;
        f69366b = (C64573av) auVar.build();
    }

    public C25454z(Executor executor, C25364ab abVar, C27655b bVar) {
        this.f69367c = executor;
        this.f69368d = abVar;
        bVar.mo33143a(this);
    }

    /* renamed from: a */
    public static void m46893a(C37215b bVar, C62722b bVar2, C63088z zVar) {
        C59896be beVar = (C59896be) C59897bf.f161859f.createBuilder();
        beVar.copyOnWrite();
        C59897bf bfVar = (C59897bf) beVar.instance;
        zVar.getClass();
        bfVar.f161861a |= 1;
        bfVar.f161862b = zVar;
        C37252a c = C37194a.f98555cL.mo40779c();
        c.mo40781e(bVar2);
        C62940bt btVar = C59898bg.f161867w;
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        C59897bf bfVar2 = (C59897bf) beVar.build();
        bfVar2.getClass();
        bgVar.f161885q = bfVar2;
        bgVar.f161869a |= 32768;
        ((C37253b) c).mo40792p(btVar, (C59898bg) afVar.build());
        bVar.mo19974a(c);
    }

    /* renamed from: b */
    public final void mo30494b() {
        C19559g.m37304c();
        if (this.f69370f) {
            ((C58970a) ((C58970a) f69365a.mo56226d()).mo56372aa(49858)).mo56386p("start called when already started");
            return;
        }
        this.f69370f = true;
        this.f69367c.execute(C47810es.m84977q(new C25440l(this)));
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensQueryController");
        C25453y yVar = this.f69369e;
        if (yVar != null) {
            eVar.mo33146c(yVar);
        } else {
            eVar.mo33148e("LensQuerySession", "null");
        }
    }
}
