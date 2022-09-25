package com.google.android.libraries.web.p3428m.p3429a;

import com.google.android.apps.gsa.binaries.satin.app.axv;
import com.google.android.apps.gsa.binaries.satin.app.ayw;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.lifecycle.C43876a;
import com.google.android.libraries.web.lifecycle.p3427c.C43885c;
import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import com.google.android.libraries.web.lifecycle.p3427c.C43888f;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.C43946w;
import com.google.android.libraries.web.p3428m.C43947x;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43906a;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43907b;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.m.a.i */
/* compiled from: PG */
public final class C43920i implements C43948y, C43314j {

    /* renamed from: a */
    public final C71548cy f114388a = C71574dx.m104480b(new C43885c(C69788q.f186170a));

    /* renamed from: b */
    public final Set f114389b = new LinkedHashSet();

    /* renamed from: c */
    private final C43272a f114390c;

    /* renamed from: d */
    private final List f114391d = new ArrayList();

    /* renamed from: e */
    private boolean f114392e;

    /* renamed from: f */
    private final axv f114393f;

    public C43920i(C43272a aVar, axv axv) {
        C69664n.m101061g(aVar, "webBrowser");
        C69664n.m101061g(axv, "windowFactory");
        this.f114390c = aVar;
        this.f114393f = axv;
        aVar.mo46410c().mo46896b(new C43915d(this));
    }

    /* renamed from: m */
    public static /* synthetic */ void m77543m(C43920i iVar, int i, boolean z, C69626l lVar, int i2) {
        boolean z2 = false;
        boolean z3 = z & ((i2 & 2) == 0);
        if ((i2 & 4) != 0) {
            lVar = C43916e.f114382a;
        }
        C69664n.m101061g(lVar, "onActiveWindowChanged");
        List j = iVar.mo46943j();
        C43914c cVar = (C43914c) j.get(i);
        int size = j.size();
        if (i == size - 1) {
            z2 = true;
        }
        if (z2 && size > 1) {
            lVar.mo5761a(j.get(size - 2));
        }
        cVar.f114374c.mo46902h();
        C71548cy cyVar = iVar.f114388a;
        List X = C69540x.m100842X(iVar.mo46943j());
        X.remove(i);
        cyVar.mo62807f(new C43886d(C69540x.m100840V(X)));
        for (C43949z d : iVar.f114389b) {
            d.mo46531d();
        }
        if (z2) {
            C43914c i3 = iVar.mo46769c();
            if (i3 != null) {
                i3.f114374c.mo46903i(true);
            }
            if (!z3) {
                for (C43949z b : iVar.f114389b) {
                    b.mo46529b(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo46936a() {
        return mo46943j().size();
    }

    /* renamed from: b */
    public final /* synthetic */ Optional mo46937b() {
        return C43946w.m77584a(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46770d(C43876a aVar) {
        mo46938e(new C43947x(aVar));
    }

    /* renamed from: e */
    public final void mo46938e(C43949z zVar) {
        C69664n.m101061g(zVar, "observer");
        if (this.f114392e) {
            for (C43914c c : mo46943j()) {
                zVar.mo46530c(c);
            }
            zVar.mo46529b(mo46769c());
        }
        if (!this.f114390c.mo46410c().mo46899e()) {
            this.f114389b.add(zVar);
        }
    }

    /* renamed from: f */
    public final int mo46939f(C69626l lVar) {
        int i = 0;
        for (Object a : mo46943j()) {
            if (((Boolean) lVar.mo5761a(a)).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public final C43904a mo46940g(C69626l lVar) {
        this.f114392e = true;
        C43914c i = mo46769c();
        if (i != null) {
            i.f114374c.mo46903i(false);
        }
        axv axv = this.f114393f;
        ayw ayw = axv.f204621a.d;
        C58490gz j = C58495hd.m89896j(9);
        j.mo55429h("com.google.android.libraries.web.contrib.debug.internal.o", ayw.f204710al);
        j.mo55429h("com.google.android.libraries.web.contrib.errorpage.r", ayw.f204711am);
        j.mo55429h("com.google.android.libraries.web.webview.contrib.geolocationpermission.f", ayw.f204712an);
        j.mo55429h("com.google.android.libraries.search.location.web.f", ayw.f204713ao);
        j.mo55429h("com.google.android.apps.search.googleapp.promomanager.srppromotion.c", ayw.f204714ap);
        j.mo55429h("com.google.android.libraries.web.webview.contrib.stuckjs.e", ayw.f204715aq);
        j.mo55429h("com.google.android.libraries.web.h.b.r", ayw.f204717as);
        j.mo55429h("com.google.android.libraries.web.c.b.ag", ayw.f204718at);
        j.mo55429h("com.google.android.libraries.web.m.a.k", ayw.f204719au);
        C43914c cVar = new C43914c(this.f114390c, (C43269t) axv.f204621a.d.f204773j.mo17428b(), new C44089a(j.mo55427f(true)), (C69585o) axv.f204621a.a.b.f199934aA.mo17428b());
        cVar.f114374c.mo46903i(true);
        C43906a aVar = (C43906a) lVar.mo5761a(cVar);
        C69664n.m101061g(aVar, "coreApi");
        cVar.f114375d.put(C43907b.class, aVar);
        cVar.f114375d.put(aVar.getClass(), aVar);
        for (Class cls : cVar.f114372a.mo46387e(C43945v.class)) {
            C69664n.m101059e(cls, "null cannot be cast to non-null type java.lang.Class<com.google.android.libraries.web.window.WebWindowPlugin>");
            cVar.mo46411d(cls);
        }
        C71548cy cyVar = this.f114388a;
        List X = C69540x.m100842X(mo46943j());
        X.add(cVar);
        cyVar.mo62807f(new C43886d(C69540x.m100840V(X)));
        Set<C43949z> ab = C69540x.m100846ab(this.f114389b);
        for (C43949z c : ab) {
            c.mo46530c(cVar);
        }
        for (C43949z b : ab) {
            b.mo46529b(cVar);
        }
        for (C69626l a : this.f114391d) {
            a.mo5761a(cVar);
        }
        this.f114391d.clear();
        return cVar;
    }

    /* renamed from: h */
    public final C43904a mo46941h(int i) {
        return (C43904a) mo46943j().get(i);
    }

    /* renamed from: i */
    public final C43914c mo46769c() {
        return (C43914c) C69540x.m100824F(mo46943j());
    }

    /* renamed from: j */
    public final List mo46943j() {
        List list = (List) ((C43888f) this.f114388a.mo62784e()).mo46880a();
        return list == null ? C69496am.f185918a : list;
    }

    /* renamed from: k */
    public final void mo46944k(C69626l lVar) {
        if (!this.f114390c.mo46410c().mo46899e()) {
            C43914c i = mo46769c();
            if (i == null) {
                this.f114391d.add(lVar);
            } else {
                lVar.mo5761a(i);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo46945l() {
        return !mo46943j().isEmpty();
    }
}
