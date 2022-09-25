package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.b */
/* compiled from: PG */
public final /* synthetic */ class C112135b implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112136c f311389a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311390b;

    /* renamed from: c */
    public final /* synthetic */ Map f311391c;

    public /* synthetic */ C112135b(C112136c cVar, C113405ep epVar, Map map) {
        this.f311389a = cVar;
        this.f311390b = epVar;
        this.f311391c = map;
    }

    public final Object get() {
        C112136c cVar = this.f311389a;
        C113405ep epVar = this.f311390b;
        int i = 0;
        int i2 = 0;
        for (C113295bt btVar : this.f311391c.values()) {
            int size = btVar.f313760a.size();
            int intValue = ((Integer) C112136c.f311392b.mo105235d("adjustGroup", new C112134a(cVar, epVar, btVar))).intValue();
            if (btVar.f313760a.size() != size) {
                C59104x d = C112136c.f311393c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PerGrpSuggestAdjuster");
                ((C59052c) ((C59052c) d).mo56372aa(27630)).mo56386p("PerGroupSuggestionsAdjuster is not configured to properly log suppressed suggestions.");
                i += btVar.f313760a.size() - size;
            }
            i2 += intValue;
        }
        C121437c a = C121438d.m200684a();
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        brVar.copyOnWrite();
        C59496bt btVar2 = (C59496bt) brVar.instance;
        btVar2.f157862a |= 2;
        btVar2.f157864c = i;
        brVar.copyOnWrite();
        C59496bt btVar3 = (C59496bt) brVar.instance;
        btVar3.f157862a |= 1;
        btVar3.f157863b = i2;
        a.mo105147b((C59496bt) brVar.build());
        return C60856cj.m92900i(a.mo105146a());
    }
}
