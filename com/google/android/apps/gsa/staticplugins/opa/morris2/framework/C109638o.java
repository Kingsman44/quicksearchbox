package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14658e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14668ah;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14701bn;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14157a;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15382j;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o */
/* compiled from: PG */
public final class C109638o {

    /* renamed from: a */
    public static final C59071e f305343a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o");

    /* renamed from: b */
    public C58528ij f305344b = C58733pz.f156496a;

    /* renamed from: c */
    private C58526ih f305345c;

    /* renamed from: d */
    private C69464a f305346d;

    /* renamed from: e */
    private final C69464a f305347e;

    public C109638o(C14157a aVar, C109613b bVar, Map map, C15382j jVar, C69464a aVar2, C14668ah ahVar, C69464a aVar3, C14658e eVar, C14701bn bnVar) {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c(aVar);
        ihVar.mo55373c(bVar);
        ihVar.mo55373c(jVar);
        ihVar.mo55489i(map.values());
        ihVar.mo55373c(ahVar);
        ihVar.mo55373c(eVar);
        ihVar.mo55373c(bnVar);
        this.f305345c = ihVar;
        this.f305347e = aVar3;
        this.f305346d = aVar2;
    }

    /* renamed from: a */
    public final void mo97932a() {
        if (this.f305344b.isEmpty()) {
            C58526ih ihVar = this.f305345c;
            ihVar.getClass();
            C69464a aVar = this.f305346d;
            aVar.getClass();
            ihVar.mo55489i(((Map) aVar.mo17428b()).values());
            ihVar.mo55373c((C14985g) this.f305347e.mo17428b());
            this.f305344b = ihVar.mo55486f();
            this.f305345c = null;
            this.f305346d = null;
        }
    }

    /* renamed from: b */
    public final void mo97933b() {
        C59104x b = f305343a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LifecycleMng");
        ((C59052c) ((C59052c) b).mo56372aa(24844)).mo56386p("#onMorrisStarted");
        mo97932a();
        C58800sl lA = this.f305344b.iterator();
        while (lA.hasNext()) {
            ((C14985g) lA.next()).mo21503c();
        }
    }

    /* renamed from: c */
    public final void mo97934c() {
        C59104x b = f305343a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LifecycleMng");
        ((C59052c) ((C59052c) b).mo56372aa(24845)).mo56386p("#onMorrisStopped");
        mo97932a();
        C58800sl lA = this.f305344b.iterator();
        while (lA.hasNext()) {
            ((C14985g) lA.next()).mo21504d();
        }
    }
}
