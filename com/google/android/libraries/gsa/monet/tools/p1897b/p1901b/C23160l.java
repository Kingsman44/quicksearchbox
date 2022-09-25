package com.google.android.libraries.gsa.monet.tools.p1897b.p1901b;

import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23051b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23255e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23143c;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23144d;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23147g;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23148h;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23139b;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23141d;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1902c.p1903a.C23163b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.b.l */
/* compiled from: PG */
public final class C23160l implements C23255e {

    /* renamed from: a */
    public final C23148h f63518a;

    /* renamed from: b */
    public final C23186f f63519b;

    /* renamed from: c */
    public C23159k f63520c;

    /* renamed from: d */
    public C23156h f63521d;

    /* renamed from: e */
    public boolean f63522e = false;

    /* renamed from: f */
    private final C23052c f63523f;

    public C23160l(String str, C23052c cVar) {
        C23148h hVar = new C23148h(cVar, str);
        C23186f fVar = new C23186f(str, cVar, false);
        this.f63523f = cVar;
        this.f63518a = hVar;
        this.f63519b = fVar;
        C23246a.m43558d(cVar, hVar);
        cVar.mo28427o(new C23155g(this));
    }

    /* renamed from: a */
    public final void mo28602a() {
        C23067b.m43233f(!this.f63522e, "Cannot start or finish pages while a page is being started. Make sure you start or finish pages after a FeatureController is fully initialized.");
    }

    /* renamed from: b */
    public final void mo28603b(Runnable runnable) {
        Object obj;
        C23067b.m43232e(!this.f63519b.mo28631l());
        this.f63522e = true;
        C23148h hVar = this.f63518a;
        C23139b bVar = (C23139b) ((C23141d) hVar.f63498a.f63720e).f63491a.get(hVar.mo28590b() - 1);
        C62940bt r1 = C62942bv.checkIsLite(C23163b.f63525b);
        bVar.mo58887l(r1);
        if (bVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C23163b.f63525b);
            bVar.mo58887l(r12);
            Object l = bVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            C23163b bVar2 = (C23163b) obj;
            C23148h hVar2 = this.f63518a;
            C23143c.m43325a(hVar2.f63498a, new C23147g(hVar2.mo28590b() - 1, C23153e.f63508a));
        }
        C23159k kVar = new C23159k(this);
        this.f63520c = kVar;
        ((C23015k) this.f63523f).f63315j.mo28433w(C23149a.class, kVar);
        runnable.run();
        ((C23015k) this.f63523f).f63315j.mo28418A(C23149a.class);
        this.f63519b.mo28626g(new C23154f(this));
    }

    /* renamed from: c */
    public final void mo28604c() {
        C23067b.m43232e(this.f63519b.mo28631l());
        C23067b.m43232e(this.f63518a.mo28590b() == ((C23088b) this.f63518a.f63499b.f63720e).size() + 1);
        if (!((C23088b) this.f63518a.f63499b.f63720e).isEmpty()) {
            this.f63520c = null;
            this.f63519b.mo28627h();
            C23251a aVar = this.f63518a.f63499b;
            C23067b.m43232e(!((C23088b) aVar.f63720e).isEmpty());
            ArrayList arrayList = new ArrayList((Collection) aVar.f63720e);
            Object remove = arrayList.remove(((C23088b) aVar.f63720e).size() - 1);
            aVar.mo28730f(new C23088b(arrayList), false);
            this.f63518a.mo28591c();
            mo28603b(new C23150b(this, (FeatureSubtreeSnapshot) remove));
            return;
        }
        C23156h hVar = this.f63521d;
        if (hVar == null || hVar.mo28596a()) {
            this.f63520c = null;
            this.f63518a.mo28591c();
            this.f63519b.mo28627h();
        }
    }

    /* renamed from: d */
    public final void mo28605d(C23109a aVar) {
        C23067b.m43232e(mo28607f());
        this.f63519b.mo28626g(aVar);
    }

    /* renamed from: e */
    public final void mo28606e(C23129y yVar, ProtoParcelable protoParcelable) {
        mo28602a();
        C23067b.m43233f(this.f63520c == null, "Initial page has already been started.");
        mo28609h(yVar, protoParcelable);
    }

    /* renamed from: f */
    public final boolean mo28607f() {
        return this.f63518a.mo28590b() != 0;
    }

    /* renamed from: g */
    public final boolean mo28608g() {
        C23156h hVar;
        C23159k kVar = this.f63520c;
        if (kVar == null) {
            return false;
        }
        C23051b bVar = kVar.f63515a;
        if (bVar != null && bVar.mo28488iF()) {
            return true;
        }
        if (this.f63518a.mo28590b() == 1 && (hVar = this.f63521d) != null && !hVar.mo28596a()) {
            return false;
        }
        mo28604c();
        return true;
    }

    /* renamed from: h */
    public final void mo28609h(C23129y yVar, ProtoParcelable protoParcelable) {
        boolean z = true;
        C23067b.m43232e(!this.f63519b.mo28631l());
        if (this.f63518a.mo28590b() != ((C23088b) this.f63518a.f63499b.f63720e).size()) {
            z = false;
        }
        C23067b.m43232e(z);
        C23143c.m43325a(this.f63518a.f63498a, C23144d.f63493a);
        mo28603b(new C23152d(this, yVar, protoParcelable));
    }
}
