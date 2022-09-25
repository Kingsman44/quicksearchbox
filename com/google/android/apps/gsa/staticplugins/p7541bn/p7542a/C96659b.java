package com.google.android.apps.gsa.staticplugins.p7541bn.p7542a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6891b.C87298a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6892c.C87299a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87352c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7093l.p7094a.C90253b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91781ae;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91782af;
import com.google.android.apps.gsa.staticplugins.p7541bn.p7543b.C96661a;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.bn.a.b */
/* compiled from: PG */
public final class C96659b extends C23056g {

    /* renamed from: a */
    private final C96661a f270444a;

    public C96659b(C23052c cVar, C96661a aVar) {
        super(cVar);
        this.f270444a = aVar;
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28430t(C87348a.class);
        kVar.f63315j.mo28430t(C87298a.class);
        kVar.f63315j.mo28430t(C87352c.class);
        kVar.f63315j.mo28430t(C87299a.class);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90253b bVar = (C90253b) C23245b.m43557b(protoParcelable, C90253b.f252103g.getParserForType(), C62921ba.m95368a(), true);
        bVar.getClass();
        if (bVar.f252108d) {
            C91781ae aeVar = (C91781ae) C91782af.f255942f.createBuilder();
            boolean z = bVar.f252106b;
            aeVar.copyOnWrite();
            C91782af afVar = (C91782af) aeVar.instance;
            afVar.f255944a = 1 | afVar.f255944a;
            afVar.f255945b = z;
            String str = bVar.f252107c;
            aeVar.copyOnWrite();
            C91782af afVar2 = (C91782af) aeVar.instance;
            str.getClass();
            afVar2.f255944a |= 2;
            afVar2.f255946c = str;
            String str2 = bVar.f252109e;
            aeVar.copyOnWrite();
            C91782af afVar3 = (C91782af) aeVar.instance;
            str2.getClass();
            afVar3.f255944a |= 4;
            afVar3.f255947d = str2;
            boolean z2 = bVar.f252110f;
            aeVar.copyOnWrite();
            C91782af afVar4 = (C91782af) aeVar.instance;
            afVar4.f255944a |= 8;
            afVar4.f255948e = z2;
            ((C96658a) this.f270444a).f270441a.mo28623d(new C23129y("sharedminusone", "TYPE_SHARED_MINUS_ONE"), C23245b.m43556a((C91782af) aeVar.build()));
        }
        ((C96658a) this.f270444a).f270442b.mo28623d(new C23129y("suggest", "TYPE_SUGGEST"), ProtoParcelable.f63423a);
    }
}
