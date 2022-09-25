package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gp */
/* compiled from: PG */
public final class C112587gp extends C112145l {

    /* renamed from: a */
    public final C86124t f312185a;

    /* renamed from: b */
    private final C112698f f312186b;

    public C112587gp(C86124t tVar, C112698f fVar) {
        this.f312185a = tVar;
        this.f312186b = fVar;
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.TF_TRIGGERING_ADJUSTER;
    }

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, Map map) {
        Map map2 = map;
        boolean z = map2.get(C48670ae.SUGGESTION_GROUP_ICON_SHORTCUT) != null && !((C113295bt) map2.get(C48670ae.SUGGESTION_GROUP_ICON_SHORTCUT)).f313760a.isEmpty();
        C112698f fVar = this.f312186b;
        C112586go goVar = new C112586go(this, z);
        HashMap hashMap = new HashMap();
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C48670ae aeVar = (C48670ae) entry.getKey();
            C113295bt btVar = (C113295bt) entry.getValue();
            C113295bt btVar2 = new C113295bt(aeVar);
            for (int i3 = 0; i3 < btVar.f313760a.size(); i3++) {
                Optional optional = (Optional) goVar.apply((C113415ez) btVar.f313760a.get(i3));
                if (optional.isPresent()) {
                    btVar2.f313760a.add((C113415ez) optional.get());
                    if (optional.get() != btVar.f313760a.get(i3)) {
                        i++;
                    }
                } else {
                    brVar.mo56968a(fVar.mo99664a((C113415ez) btVar.f313760a.get(i3), i3));
                    i2++;
                }
            }
            if (!btVar2.f313760a.isEmpty()) {
                hashMap.put(aeVar, btVar2);
            }
        }
        map.clear();
        map2.putAll(hashMap);
        C121437c a = C121438d.m200684a();
        brVar.copyOnWrite();
        C59496bt btVar3 = (C59496bt) brVar.instance;
        btVar3.f157862a |= 1;
        btVar3.f157863b = i;
        brVar.copyOnWrite();
        C59496bt btVar4 = (C59496bt) brVar.instance;
        btVar4.f157862a |= 2;
        btVar4.f157864c = i2;
        a.mo105147b((C59496bt) brVar.build());
        return C60856cj.m92900i(a.mo105146a());
    }
}
