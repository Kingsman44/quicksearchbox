package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.e */
/* compiled from: PG */
public final /* synthetic */ class C112138e implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112139f f311395a;

    /* renamed from: b */
    public final /* synthetic */ Map f311396b;

    /* renamed from: c */
    public final /* synthetic */ C21370a f311397c;

    /* renamed from: d */
    public final /* synthetic */ long f311398d;

    public /* synthetic */ C112138e(C112139f fVar, Map map, C21370a aVar, long j) {
        this.f311395a = fVar;
        this.f311396b = map;
        this.f311397c = aVar;
        this.f311398d = j;
    }

    public final Object get() {
        C112139f fVar = this.f311395a;
        Map map = this.f311396b;
        C21370a aVar = this.f311397c;
        long j = this.f311398d;
        if (j == 0) {
            j = aVar.mo26870b();
        }
        C112137d dVar = new C112137d(fVar);
        int i = 0;
        for (C113295bt btVar : map.values()) {
            for (int i2 = 0; i2 < btVar.f313760a.size(); i2++) {
                C113415ez ezVar = (C113415ez) dVar.apply((C113415ez) btVar.f313760a.get(i2));
                if (ezVar != btVar.f313760a.get(i2)) {
                    i++;
                    btVar.f313760a.set(i2, ezVar);
                }
            }
        }
        C121437c a = C121438d.m200684a();
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        brVar.copyOnWrite();
        C59496bt btVar2 = (C59496bt) brVar.instance;
        btVar2.f157862a |= 1;
        btVar2.f157863b = i;
        a.mo105147b((C59496bt) brVar.build());
        C121438d a2 = a.mo105146a();
        C121437c b = a2.mo105149b();
        C59494br brVar2 = (C59494br) a2.mo105150c().toBuilder();
        long b2 = aVar.mo26870b();
        brVar2.copyOnWrite();
        C59496bt btVar3 = (C59496bt) brVar2.instance;
        btVar3.f157862a |= 8;
        btVar3.f157867f = b2 - j;
        b.mo105148c(brVar2);
        return C60856cj.m92900i(b.mo105146a());
    }
}
