package com.google.android.libraries.gsa.monet.internal.p1887a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.nowoverlayservice.C83549u;
import com.google.android.libraries.gsa.monet.internal.shared.C23038c;
import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.C23047l;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22947l;
import com.google.android.libraries.gsa.monet.p1886a.C22953r;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23079aj;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23086b;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23116l;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23068c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23215l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.ac */
/* compiled from: PG */
public final class C22960ac implements C22945j {

    /* renamed from: a */
    public final C23047l f63139a;

    /* renamed from: b */
    public final C23084ao f63140b;

    /* renamed from: c */
    public final C23040e f63141c;

    /* renamed from: d */
    public final C22967aj f63142d;

    /* renamed from: e */
    public final C23129y f63143e;

    /* renamed from: f */
    public final C23128x f63144f;

    /* renamed from: g */
    public final List f63145g = new ArrayList();

    /* renamed from: h */
    public final Map f63146h = new HashMap();

    /* renamed from: i */
    public C22977at f63147i;

    /* renamed from: j */
    public C22939d f63148j;

    /* renamed from: k */
    public int f63149k = 1;

    /* renamed from: l */
    public final C22998v f63150l;

    /* renamed from: m */
    private final C22994r f63151m;

    /* renamed from: n */
    private final C22970am f63152n;

    /* renamed from: o */
    private final C23096b f63153o;

    /* renamed from: p */
    private final C23116l f63154p;

    public C22960ac(C22970am amVar, C22994r rVar, C23084ao aoVar, C23040e eVar, C22967aj ajVar, C23128x xVar, C23129y yVar, C23047l lVar, C23116l lVar2, C23096b bVar, C22998v vVar) {
        this.f63152n = amVar;
        this.f63151m = rVar;
        this.f63140b = aoVar;
        this.f63141c = eVar;
        this.f63142d = ajVar;
        this.f63144f = xVar;
        this.f63143e = yVar;
        this.f63139a = lVar;
        this.f63154p = lVar2;
        this.f63153o = bVar;
        this.f63150l = vVar;
    }

    /* renamed from: E */
    private final void m42967E() {
        this.f63153o.mo28559a("RendererApi", "Call can only be used when renderer is bound to a model. Renderer %s is currently not bound.", this.f63143e);
    }

    /* renamed from: A */
    public final boolean mo28309A(C22939d dVar) {
        return this.f63151m.mo28381c(dVar).mo28316z();
    }

    /* renamed from: B */
    public final void mo28332B(Bundle bundle) {
        this.f63140b.mo28328a();
        if (this.f63151m.mo28384f(this)) {
            if (!mo28316z()) {
                m42967E();
                return;
            }
            this.f63141c.mo28332B(bundle);
            this.f63152n.mo28353a(bundle, mo28334b().f63388a);
        }
    }

    /* renamed from: C */
    public final boolean mo28310C() {
        return this.f63149k == 4;
    }

    /* renamed from: D */
    public final boolean mo28333D(String str) {
        this.f63140b.mo28328a();
        C22967aj ajVar = this.f63142d;
        ajVar.mo28349b();
        return ajVar.mo28352e(str) == 3;
    }

    /* renamed from: a */
    public final Bundle mo28320a() {
        if (!mo28336e().f63472a.containsKey("MonetRendererSavedState")) {
            return new Bundle();
        }
        C23120p a = mo28336e().mo28564a("MonetRendererSavedState");
        a.getClass();
        return a.f63472a;
    }

    /* renamed from: b */
    public final C23042g mo28334b() {
        C22977at atVar = this.f63147i;
        C23129y yVar = this.f63143e;
        if (atVar != null) {
            return atVar.f63194b;
        }
        throw new NullPointerException(C23068c.m43237a("Call can only be used when renderer is bound to a model. Renderer %s is currently not bound.", yVar));
    }

    /* renamed from: c */
    public final C23129y mo28311c(C22939d dVar) {
        return this.f63151m.mo28381c(dVar).f63143e;
    }

    /* renamed from: d */
    public final C23115k mo28335d(C23129y yVar) {
        String str;
        C23038c cVar = (C23038c) this.f63154p;
        cVar.f63379a.mo28328a();
        if (yVar.mo28577c()) {
            str = yVar.f63476a;
        } else {
            str = cVar.f63380b.f63476a;
        }
        cVar.f63381c.mo28483a(str);
        C23086b a = cVar.f63382d.mo28395a(str);
        if (a != null) {
            return a.mo28322b(yVar.f63477b);
        }
        throw new C23079aj(str);
    }

    /* renamed from: e */
    public final C23120p mo28336e() {
        this.f63140b.mo28328a();
        return this.f63141c.mo28336e();
    }

    /* renamed from: f */
    public final C23129y mo28337f(String str) {
        this.f63140b.mo28328a();
        return this.f63142d.mo28337f("root");
    }

    /* renamed from: g */
    public final C23129y mo28338g() {
        return this.f63143e;
    }

    /* renamed from: h */
    public final C23078ai mo28339h(String str) {
        this.f63140b.mo28328a();
        C23067b.m43234g(!mo28310C(), "Unsupported API call for a renderer that has been destroyed; renderer type: %s", this.f63143e);
        return this.f63139a.mo28339h(str);
    }

    /* renamed from: i */
    public final C22939d mo28305i(C23129y yVar) {
        this.f63140b.mo28328a();
        this.f63139a.mo28483a(yVar.f63476a);
        C22994r rVar = this.f63151m;
        rVar.f63251d.mo28328a();
        return rVar.f63248a.mo28378a(yVar).mo28340j();
    }

    /* renamed from: j */
    public final C22939d mo28340j() {
        this.f63140b.mo28328a();
        C22939d dVar = this.f63148j;
        C23067b.m43236i(dVar, "Api must not be used before onInitialize is called");
        return dVar;
    }

    /* renamed from: k */
    public final String mo28341k(String str) {
        this.f63140b.mo28328a();
        C22967aj ajVar = this.f63142d;
        ajVar.mo28349b();
        return ajVar.mo28348a().mo28471g(str);
    }

    /* renamed from: l */
    public final String mo28342l() {
        this.f63140b.mo28328a();
        return mo28334b().f63388a;
    }

    /* renamed from: m */
    public final void mo28312m(C22947l lVar) {
        this.f63140b.mo28328a();
        this.f63145g.add(lVar);
    }

    /* renamed from: n */
    public final void mo28343n(C23118n nVar) {
        this.f63140b.mo28328a();
        this.f63141c.mo28343n(nVar);
    }

    /* renamed from: o */
    public final void mo28327o(String str, C22953r rVar) {
        this.f63140b.mo28328a();
        if (!this.f63146h.containsKey(str)) {
            this.f63146h.put(str, new ArrayList());
        }
        ((List) this.f63146h.get(str)).add(rVar);
    }

    /* renamed from: p */
    public final void mo28344p(C23078ai aiVar) {
        this.f63140b.mo28328a();
        this.f63139a.mo28344p(aiVar);
    }

    /* renamed from: q */
    public final void mo28306q(C22939d dVar, String str) {
        this.f63140b.mo28328a();
        this.f63151m.mo28385h(dVar, str);
    }

    /* renamed from: r */
    public final void mo28307r(C22939d dVar) {
        this.f63140b.mo28328a();
        this.f63151m.f63251d.mo28328a();
        C22994r.m43060g((C22960ac) dVar.f63126Q);
    }

    /* renamed from: s */
    public final void mo28345s(String str, String str2, Parcelable parcelable) {
        this.f63140b.mo28328a();
        if (!mo28316z()) {
            m42967E();
            return;
        }
        C22977at atVar = this.f63147i;
        atVar.getClass();
        if (atVar.f63195c) {
            this.f63152n.mo28355c(mo28334b().f63388a, str, str2, parcelable);
            return;
        }
        atVar.f63196d.add(new C22969al(str, str2, parcelable));
    }

    /* renamed from: t */
    public final void mo28313t(C22947l lVar) {
        this.f63140b.mo28328a();
        this.f63145g.remove(lVar);
    }

    /* renamed from: u */
    public final void mo28314u() {
        this.f63140b.mo28328a();
        if (mo28316z()) {
            this.f63141c.mo28462a(mo28334b().f63390c);
        }
    }

    /* renamed from: v */
    public final void mo28308v(C22939d dVar) {
        this.f63140b.mo28328a();
        this.f63151m.mo28382d(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo28346w() {
        C23067b.m43232e(this.f63149k == 3);
        C23128x xVar = this.f63144f;
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 8;
        dVar.f63449a = 1 | dVar.f63449a;
        String l = mo28342l();
        cVar.copyOnWrite();
        C23101d dVar2 = (C23101d) cVar.instance;
        l.getClass();
        dVar2.f63449a |= 2;
        dVar2.f63453e = l;
        String str = this.f63143e.f63478c;
        cVar.copyOnWrite();
        C23101d dVar3 = (C23101d) cVar.instance;
        str.getClass();
        dVar3.f63449a |= 4;
        dVar3.f63454f = str;
        C23101d dVar4 = (C23101d) cVar.build();
        xVar.mo28520c(new C22958aa(this));
        C23088b bVar = new C23088b(this.f63145g);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((C22947l) bVar.get(i)).mo28288b();
        }
        C22998v vVar = this.f63150l;
        mo28342l();
        for (C83549u uVar : vVar.f63262a) {
        }
        C22967aj ajVar = this.f63142d;
        for (Map.Entry value : ajVar.f63172a.entrySet()) {
            for (C23215l d : (List) value.getValue()) {
                d.mo28679d();
            }
        }
        ajVar.f63173b = null;
        this.f63147i = null;
        this.f63141c.mo28463b((C23042g) null);
        this.f63149k = 2;
    }

    /* renamed from: x */
    public final void mo28321x(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("MonetRendererSavedState", bundle);
        this.f63141c.mo28332B(bundle2);
    }

    /* renamed from: y */
    public final boolean mo28315y() {
        this.f63140b.mo28328a();
        if (!mo28316z()) {
            m42967E();
            return false;
        }
        C22977at atVar = this.f63147i;
        atVar.getClass();
        return atVar.f63195c;
    }

    /* renamed from: z */
    public final boolean mo28316z() {
        this.f63140b.mo28328a();
        return this.f63149k == 3;
    }
}
