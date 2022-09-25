package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.n */
/* compiled from: PG */
public abstract class C112147n extends C112145l {

    /* renamed from: a */
    private static final C121537f f311421a;

    /* renamed from: b */
    private final C112698f f311422b;

    static {
        C121537f b = C121537f.m200840b("SuggestionsSuppressor", C112145l.f311417q);
        f311421a = b;
        C121511c cVar = b.f337270a;
    }

    protected C112147n(C112698f fVar) {
        this.f311422b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C60870cx mo99424b(C113405ep epVar, Map map) {
        C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
        Map l = mo99418l(epVar, map);
        if (!l.isEmpty()) {
            C58490gz gzVar = new C58490gz(4);
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Set set = (Set) Map.EL.getOrDefault(l, entry.getKey(), C58733pz.f156496a);
                    C113295bt btVar = (C113295bt) entry.getValue();
                    if (!set.isEmpty()) {
                        C113295bt btVar2 = new C113295bt(btVar.f313761b);
                        for (int i = 0; i < btVar.f313760a.size(); i++) {
                            C113415ez ezVar = (C113415ez) btVar.f313760a.get(i);
                            if (set.contains(Integer.valueOf(i))) {
                                brVar.mo56968a(this.f311422b.mo99664a(ezVar, i));
                            } else {
                                btVar2.f313760a.add(ezVar);
                            }
                        }
                        btVar = btVar2;
                    }
                    if (!btVar.f313760a.isEmpty()) {
                        gzVar.mo55429h((C48670ae) entry.getKey(), btVar);
                    }
                } else {
                    map.clear();
                    map.putAll(gzVar.mo55427f(false));
                    C121437c a = C121438d.m200684a();
                    a.mo105147b((C59496bt) brVar.build());
                    return C60856cj.m92900i(a.mo105146a());
                }
            }
        } else {
            C121437c a2 = C121438d.m200684a();
            a2.mo105147b((C59496bt) brVar.build());
            return C60856cj.m92900i(a2.mo105146a());
        }
    }

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, java.util.Map map) {
        C121537f fVar = f311421a;
        String s = epVar.mo100186s();
        return fVar.mo105234c("adjust".concat(s), new C112146m(this, epVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract java.util.Map mo99418l(C113405ep epVar, java.util.Map map);
}
