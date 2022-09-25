package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.apps.gsa.nowoverlayservice.C83549u;
import com.google.android.apps.gsa.nowoverlayservice.C83553y;
import com.google.android.apps.gsa.nowoverlayservice.p6426d.C83520c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7093l.C90251a;
import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23049n;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22947l;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.r */
/* compiled from: PG */
public final class C22994r {

    /* renamed from: a */
    public final C22993q f63248a;

    /* renamed from: b */
    public final Map f63249b = new HashMap();

    /* renamed from: c */
    public final C22992p f63250c;

    /* renamed from: d */
    public final C23084ao f63251d;

    public C22994r(C22992p pVar, C22993q qVar, C23084ao aoVar) {
        this.f63250c = pVar;
        this.f63248a = qVar;
        this.f63251d = aoVar;
    }

    /* renamed from: g */
    public static final void m43060g(C22960ac acVar) {
        String str = acVar.f63143e.f63478c;
        C23067b.m43230c(!acVar.mo28316z(), "Renderer %s must be unbound before destruction", str);
        C23067b.m43230c(!acVar.mo28310C(), "Renderer %s has already been destroyed", str);
        if (acVar.f63149k == 3) {
            acVar.mo28346w();
        }
        C23067b.m43232e(acVar.f63149k == 2);
        C23128x xVar = acVar.f63144f;
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 9;
        dVar.f63449a |= 1;
        String str2 = acVar.f63143e.f63478c;
        cVar.copyOnWrite();
        C23101d dVar2 = (C23101d) cVar.instance;
        str2.getClass();
        dVar2.f63449a |= 4;
        dVar2.f63454f = str2;
        C23101d dVar3 = (C23101d) cVar.build();
        xVar.mo28520c(new C22959ab(acVar));
        C23088b bVar = new C23088b(acVar.f63145g);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((C22947l) bVar.get(i)).mo28290h();
        }
        acVar.f63149k = 4;
        C22967aj ajVar = acVar.f63142d;
        ajVar.mo28349b();
        C23067b.m43233f(!ajVar.mo28351d(), "Handler is still bound to a feature");
        ajVar.f63172a.clear();
        ajVar.f63174c = true;
        acVar.f63139a.mo28484b();
    }

    /* renamed from: i */
    private final void m43061i(C22960ac acVar) {
        if (mo28384f(acVar)) {
            this.f63249b.remove(acVar.mo28342l());
        }
        if (acVar.mo28316z()) {
            acVar.mo28346w();
        }
    }

    /* renamed from: j */
    private final void m43062j(C22960ac acVar, C22977at atVar) {
        C23067b.m43230c(atVar.mo28362f(), "Feature state has not been initialized yet (feature ID: %s)", atVar.f63194b.f63388a);
        C23067b.m43232e(acVar.f63149k == 2);
        acVar.f63147i = atVar;
        acVar.f63149k = 3;
        C22967aj ajVar = acVar.f63142d;
        ajVar.mo28349b();
        C23067b.m43230c(atVar.mo28362f(), "Feature state has not been initialized yet (feature ID: %s)", atVar.f63194b.f63388a);
        ajVar.f63173b = atVar.f63194b;
        for (String c : ajVar.f63172a.keySet()) {
            ajVar.mo28350c(c);
        }
        acVar.f63141c.mo28463b(atVar.f63194b);
        C23088b bVar = new C23088b(acVar.f63145g);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((C22947l) bVar.get(i)).mo28289c();
        }
        C23128x xVar = acVar.f63144f;
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 2;
        dVar.f63449a = 1 | dVar.f63449a;
        String l = acVar.mo28342l();
        cVar.copyOnWrite();
        C23101d dVar2 = (C23101d) cVar.instance;
        l.getClass();
        dVar2.f63449a = 2 | dVar2.f63449a;
        dVar2.f63453e = l;
        String str = acVar.f63143e.f63478c;
        cVar.copyOnWrite();
        C23101d dVar3 = (C23101d) cVar.instance;
        str.getClass();
        dVar3.f63449a |= 4;
        dVar3.f63454f = str;
        C23101d dVar4 = (C23101d) cVar.build();
        xVar.mo28520c(new C23002z(acVar));
        C22998v vVar = acVar.f63150l;
        C23129y yVar = acVar.f63143e;
        String l2 = acVar.mo28342l();
        for (C83549u uVar : vVar.f63262a) {
            C59104x b = C83553y.f227783a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GLCOC");
            ((C59052c) ((C59052c) b).mo56372aa(6683)).mo56354G("#onRendererBound(%s, %s)", yVar, l2);
            if (C90251a.f252102a.equals(yVar)) {
                ((C83520c) uVar.f227779b.f227846q.mo27525b()).mo76842n(false);
                ((C22998v) uVar.f227778a.f252320n.mo27525b()).f63262a.remove(uVar);
            }
        }
        this.f63249b.put(atVar.f63194b.f63388a, acVar);
    }

    /* renamed from: a */
    public final C22960ac mo28379a(C22977at atVar) {
        this.f63251d.mo28328a();
        C22960ac a = this.f63248a.mo28378a(C23049n.f63404a);
        m43062j(a, atVar);
        return a;
    }

    /* renamed from: b */
    public final C22960ac mo28380b(String str) {
        this.f63251d.mo28328a();
        return (C22960ac) this.f63249b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C22960ac mo28381c(C22939d dVar) {
        this.f63251d.mo28328a();
        return (C22960ac) dVar.f63126Q;
    }

    /* renamed from: d */
    public final void mo28382d(C22939d dVar) {
        this.f63251d.mo28328a();
        m43061i((C22960ac) dVar.f63126Q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo28383e(String str) {
        this.f63251d.mo28328a();
        C22960ac acVar = (C22960ac) this.f63249b.get(str);
        if (acVar != null) {
            m43061i(acVar);
            m43060g(acVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo28384f(C22960ac acVar) {
        this.f63251d.mo28328a();
        return this.f63249b.containsValue(acVar);
    }

    /* renamed from: h */
    public final void mo28385h(C22939d dVar, String str) {
        this.f63251d.mo28328a();
        C22960ac acVar = (C22960ac) dVar.f63126Q;
        C23067b.m43230c(!acVar.mo28310C(), "Feature %s already destroyed", str);
        if (!acVar.equals(this.f63249b.get(str))) {
            C22977at a = this.f63250c.mo28377a(str);
            C22992p.m43057b(a, acVar);
            if (!a.mo28362f()) {
                C22992p pVar = this.f63250c;
                C23067b.m43230c(!a.mo28362f(), "Feature is already initialized; id: %s", a.f63194b.f63388a);
                C22992p.m43057b(a, acVar);
                C23108e n = acVar.mo28340j().mo28302n();
                C23067b.m43230c(n != null, "Feature type %s does not support bootstrapping", acVar.f63143e);
                C22978b bVar = new C22978b(pVar.f63241b, pVar.f63240a, a);
                C23040e eVar = new C23040e(pVar.f63241b);
                eVar.mo28463b(a.f63194b);
                C23128x xVar = pVar.f63242c;
                C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
                cVar.copyOnWrite();
                C23101d dVar2 = (C23101d) cVar.instance;
                dVar2.f63452d = 18;
                dVar2.f63449a = 1 | dVar2.f63449a;
                String str2 = acVar.f63143e.f63478c;
                cVar.copyOnWrite();
                C23101d dVar3 = (C23101d) cVar.instance;
                str2.getClass();
                dVar3.f63449a |= 4;
                dVar3.f63454f = str2;
                C23101d dVar4 = (C23101d) cVar.build();
                xVar.mo28520c(new C22991o(n, eVar, bVar, a));
                a.mo28361e();
            }
            m43061i(acVar);
            m43062j(acVar, a);
        }
    }
}
