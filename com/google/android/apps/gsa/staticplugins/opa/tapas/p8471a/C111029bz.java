package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import dagger.C68214a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bz */
/* compiled from: PG */
public final class C111029bz {

    /* renamed from: a */
    public final C86124t f309214a;

    /* renamed from: b */
    public final C110972aj f309215b;

    /* renamed from: c */
    public final C112471ap f309216c;

    /* renamed from: d */
    public final Executor f309217d;

    /* renamed from: e */
    public final C113251ad f309218e;

    /* renamed from: f */
    public final Map f309219f = new HashMap();

    /* renamed from: g */
    public final Map f309220g = new HashMap();

    /* renamed from: h */
    public final C113126ak f309221h;

    /* renamed from: i */
    private final Map f309222i;

    /* renamed from: j */
    private final Map f309223j = new HashMap();

    public C111029bz(C86124t tVar, C110972aj ajVar, Map map, C113126ak akVar, C112471ap apVar, C68214a aVar, C113251ad adVar) {
        C58485gu guVar;
        this.f309214a = tVar;
        this.f309215b = ajVar;
        this.f309222i = map;
        this.f309216c = apVar;
        this.f309218e = adVar;
        this.f309221h = akVar;
        if (tVar.mo79746e(C90063do.f249343bj)) {
            this.f309217d = ((C90851k) aVar.mo27525b()).mo85210c("TapasLightweightExecutor");
        } else {
            this.f309217d = C60826bg.f164896a;
        }
        for (C48670ae aeVar : ((C58495hd) map).keySet()) {
            C58976aa aaVar = C58975e.f156826a;
            C111062l lVar = (C111062l) ((C69464a) map.get(aeVar)).mo17428b();
            String f = lVar.mo99013f();
            if (lVar.mo99008b().mo99033b(lVar.mo99013f())) {
                this.f309223j.put(f, aeVar);
                m184807f(f, ajVar.mo98997b(lVar, true, true), this.f309220g);
                if (tVar.mo79746e(C90063do.f249279aY)) {
                    int h = lVar.mo99015h();
                    C58495hd a = C110972aj.f309145b.mo85085a(ajVar.f309146c.mo79758x(C90063do.f249636l));
                    int i = h - 1;
                    if (h != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        if (!a.containsKey(sb.toString())) {
                            guVar = C58485gu.m89845m();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i);
                            String str = (String) a.get(sb2.toString());
                            if (str == null) {
                                guVar = C58485gu.m89845m();
                            } else {
                                guVar = (C58485gu) Collection.EL.stream(C89988b.m146551d(str)).map(new C110965ac(ajVar)).collect(C58370cn.f155946a);
                            }
                        }
                        m184807f(f, (List) Collection.EL.stream((C58485gu) Stream.CC.concat(Collection.EL.stream(guVar), Collection.EL.stream(lVar.mo99010d())).distinct().collect(C58370cn.f155946a)).flatMap(new C111025bv(this)).collect(C58370cn.f155946a), this.f309219f);
                    } else {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: f */
    private static void m184807f(String str, List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (map.containsKey(str2)) {
                ((Set) map.get(str2)).add(str);
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                map.put(str2, hashSet);
            }
        }
    }

    /* renamed from: a */
    public final C48670ae mo99018a(String str) {
        if (this.f309223j.containsKey(str)) {
            return (C48670ae) this.f309223j.get(str);
        }
        return C48670ae.SUGGESTION_GROUP_APP_ACTION_UNKNOWN;
    }

    /* renamed from: b */
    public final C58485gu mo99019b(boolean z) {
        if (!this.f309214a.mo79746e(C90063do.f249336bc)) {
            return C58485gu.m89845m();
        }
        Optional c = this.f309216c.mo99532c(z);
        if (c.isEmpty()) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89842j(((C48645f) c.get()).f125728a);
    }

    /* renamed from: c */
    public final C58528ij mo99020c() {
        return C58528ij.m90006F(this.f309223j.values());
    }

    /* renamed from: d */
    public final Optional mo99021d(C48670ae aeVar) {
        if (!this.f309222i.containsKey(aeVar)) {
            C58976aa aaVar = C58975e.f156826a;
            return Optional.ofNullable((C69464a) this.f309222i.get(C48670ae.SUGGESTION_GROUP_APP_ACTION_UNKNOWN)).map(C110982at.f309163a);
        }
        C69464a aVar = (C69464a) this.f309222i.get(aeVar);
        if (aVar != null) {
            return Optional.m71637of((C111062l) aVar.mo17428b());
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return Optional.empty();
    }

    /* renamed from: e */
    public final boolean mo99022e(C54759g gVar, C48670ae aeVar) {
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        String str = uVar.f143706a;
        if (str.equals("actions.android.intent.PLACEHOLDER")) {
            return false;
        }
        if (str.equals("actions.intent.OPEN_APP_FEATURE")) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        Optional d = mo99021d(aeVar);
        if (d.isEmpty()) {
            return false;
        }
        if (((C111062l) d.get()).mo99007a().mo99032a(this.f309215b.mo98996a(str))) {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return false;
    }
}
