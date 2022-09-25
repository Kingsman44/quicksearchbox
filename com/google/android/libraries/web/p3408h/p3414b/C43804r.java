package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import com.google.android.apps.gsa.binaries.satin.app.aye;
import com.google.android.apps.gsa.binaries.satin.app.baf;
import com.google.android.apps.gsa.binaries.satin.app.bag;
import com.google.android.apps.gsa.binaries.satin.app.bai;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.lifecycle.C43882c;
import com.google.android.libraries.web.lifecycle.p3427c.C43885c;
import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import com.google.android.libraries.web.lifecycle.p3427c.C43887e;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3408h.C43774a;
import com.google.android.libraries.web.p3408h.C43786b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a.C43781f;
import com.google.android.libraries.web.p3408h.p3415c.C43805a;
import com.google.android.libraries.web.p3408h.p3415c.C43806b;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import dagger.hilt.C68286a;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.C69614a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.r */
/* compiled from: PG */
public final class C43804r implements C43945v {

    /* renamed from: e */
    private static final C59071e f114213e = C59071e.m91331h();

    /* renamed from: a */
    public final Map f114214a = new LinkedHashMap();

    /* renamed from: b */
    public final C71548cy f114215b;

    /* renamed from: c */
    public C43795i f114216c;

    /* renamed from: d */
    public C43795i f114217d;

    /* renamed from: f */
    private final C43904a f114218f;

    /* renamed from: g */
    private final AtomicReference f114219g;

    /* renamed from: h */
    private final C43269t f114220h;

    /* renamed from: i */
    private C43795i f114221i;

    /* renamed from: j */
    private Throwable f114222j;

    /* renamed from: k */
    private Throwable f114223k;

    /* renamed from: l */
    private final boolean f114224l;

    /* renamed from: m */
    private final baf f114225m;

    public C43804r(C43904a aVar, baf baf, aye aye, AtomicReference atomicReference, C43269t tVar) {
        C69664n.m101061g(aVar, "window");
        C69664n.m101061g(baf, "pageComponentBuilder");
        C69664n.m101061g(aye, "navigationFactory");
        C69664n.m101061g(atomicReference, "viewModelReference");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        this.f114218f = aVar;
        this.f114225m = baf;
        this.f114219g = atomicReference;
        this.f114220h = tVar;
        C71548cy b = C71574dx.m104480b(new C43885c(C69788q.f186170a));
        this.f114215b = b;
        this.f114224l = tVar.mo46384b().f112975n;
        C71521by.m104365c(b);
        aVar.mo46410c().mo46896b(new C43797k(this));
    }

    /* renamed from: a */
    public final C43788b mo46817a() {
        C43795i iVar = this.f114216c;
        if (iVar != null) {
            C43788b b = iVar.mo46814b();
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("The active page does not have a main document yet.");
        }
        throw new IllegalArgumentException("Expected an active page.");
    }

    /* renamed from: b */
    public final void mo46818b(Object obj, Object obj2) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(obj2, "newKey");
        Object remove = this.f114214a.remove(obj);
        if (remove != null) {
            C43795i iVar = (C43795i) remove;
            if (C69664n.m101066l(obj, 1)) {
                this.f114222j = new RuntimeException("Navigation destroyed");
            }
            this.f114214a.put(obj2, iVar);
            return;
        }
        throw new IllegalArgumentException("No page exists for " + obj + ".");
    }

    /* renamed from: c */
    public final void mo46819c() {
        Object obj;
        C59052c cVar = (C59052c) f114213e.mo56225c();
        cVar.mo56379ah(new C59094n(54147));
        cVar.mo56386p("Page was promised to always have page content but it redirected to unowned URL. This might hint at either an issue in the server-side code, or this URL was wrongfully promised by the client to always have content. Either way, this is  likely causing visual glitches to the user, stop displaying early during navigation.");
        C43795i iVar = this.f114217d;
        if (iVar != null) {
            iVar.f114197h = false;
        }
        this.f114217d = null;
        C71548cy cyVar = this.f114215b;
        C43795i iVar2 = this.f114221i;
        if (iVar2 != null) {
            obj = new C43886d(iVar2);
        } else {
            obj = new C43887e(C69788q.f186170a);
        }
        cyVar.mo62807f(obj);
    }

    /* renamed from: d */
    public final void mo46820d(Object obj, Uri uri, Object obj2, C43363h hVar) {
        C69664n.m101061g(obj, "navigationKey");
        C69664n.m101061g(uri, "url");
        C69664n.m101061g(obj2, "documentKey");
        if (C69664n.m101066l(obj2, 2)) {
            mo46822f(obj2);
        } else {
            C43795i iVar = this.f114216c;
            if (iVar != null) {
                C19559g.m37304c();
                C43788b b = iVar.mo46814b();
                if (b != null) {
                    b.f114174c.mo46903i(false);
                }
            }
        }
        C43795i iVar2 = (C43795i) this.f114214a.get(obj2);
        if (iVar2 == null) {
            iVar2 = (C43795i) this.f114214a.remove(obj);
            if (iVar2 == null && C69664n.m101066l(obj, 1) && this.f114222j != null) {
                new StringBuilder("No page exists for ").append(obj);
                throw new IllegalStateException("No page exists for ".concat(String.valueOf(obj)), this.f114222j);
            } else if (iVar2 != null) {
                if (C69664n.m101066l(obj, 1)) {
                    this.f114222j = new RuntimeException("Navigation destroyed");
                }
                Map map = this.f114214a;
                C69664n.m101061g(uri, "url");
                C19559g.m37304c();
                if (iVar2.mo46814b() == null) {
                    iVar2.f114195f.mo46904j();
                    C43790d d = iVar2.mo46815d();
                    if (d != null) {
                        d.mo46809d(uri, hVar);
                        bag bag = iVar2.f114198i;
                        C43791e a = C43805a.m77341a(d);
                        bai bai = bag.f204866a.b;
                        C43788b bVar = new C43788b(a, bai.f204867a, (C43774a) bai.f204870d.mo17428b(), (C43781f) bag.f204866a.b.f204871e.mo17428b(), (C69585o) bag.f204866a.a.b.f199934aA.mo17428b());
                        iVar2.f114195f.mo46905k(bVar.f114174c);
                        iVar2.f114194e.mo62807f(bVar);
                        for (Map.Entry value : iVar2.f114196g.entrySet()) {
                            C43786b bVar2 = (C43786b) value.getValue();
                            if (bVar.f114175d.f114185c != null) {
                                bVar2.mo46800b();
                            } else {
                                bVar2.mo46802d();
                            }
                        }
                        map.put(obj2, iVar2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IllegalArgumentException("No page exists for " + obj + ".");
            }
        } else {
            Object obj3 = this.f114214a.get(obj);
            if (obj3 != null) {
                C69664n.m101061g(uri, "url");
                ((C43795i) obj3).mo46816e(new C43793g(uri));
            } else {
                throw new IllegalArgumentException("Expected an active page.");
            }
        }
        this.f114216c = iVar2;
        C19559g.m37304c();
        C43788b b2 = iVar2.mo46814b();
        if (b2 != null) {
            b2.f114174c.mo46903i(true);
        }
    }

    /* renamed from: e */
    public final void mo46821e(Object obj) {
        C69664n.m101061g(obj, "key");
        Object remove = this.f114214a.remove(obj);
        if (remove != null) {
            C43795i iVar = (C43795i) remove;
            iVar.mo46816e(C43792f.f114187a);
            if (this.f114216c == iVar) {
                this.f114216c = null;
            }
            if (!this.f114224l) {
                return;
            }
            if (C69664n.m101066l(obj, 1)) {
                this.f114222j = new RuntimeException("Navigation destroyed");
            } else if (C69664n.m101066l(obj, 2)) {
                this.f114223k = new RuntimeException("Document destroyed", this.f114222j);
            }
        } else {
            throw new IllegalArgumentException("No page exists for " + obj + ".");
        }
    }

    /* renamed from: f */
    public final void mo46822f(Object obj) {
        C69664n.m101061g(obj, "key");
        if (this.f114214a.containsKey(obj)) {
            mo46821e(obj);
        }
    }

    /* renamed from: g */
    public final void mo46823g(Object obj, Uri uri) {
        Object e;
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(uri, "url");
        C43795i iVar = (C43795i) this.f114214a.get(obj);
        if (C69664n.m101066l(obj, 2) && iVar == null && this.f114223k != null) {
            new StringBuilder("No page exists for ").append(obj);
            throw new IllegalStateException("No page exists for ".concat(String.valueOf(obj)), this.f114223k);
        } else if (iVar != null) {
            C69664n.m101061g(uri, "url");
            C19559g.m37304c();
            C43788b b = iVar.mo46814b();
            if (b != null) {
                C69664n.m101061g(uri, "url");
                if (!C43882c.m77456a(b.f114174c)) {
                    C71548cy cyVar = b.f114173b;
                    do {
                        e = cyVar.mo62784e();
                        C43789c cVar = (C43789c) e;
                        C69664n.m101061g(uri, "url");
                    } while (!cyVar.mo62808g(e, new C43789c(uri)));
                    return;
                }
                throw new IllegalStateException("Cannot modify a document that is already destroyed.");
            }
            throw new IllegalArgumentException("Required value was null.");
        } else {
            throw new IllegalArgumentException("No page exists for " + obj + ".");
        }
    }

    /* renamed from: h */
    public final void mo46824h(Object obj, Uri uri, C43366k kVar, C69626l lVar) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(uri, "url");
        C69664n.m101061g(kVar, "triggerType");
        C69664n.m101061g(lVar, "onCreatedPage");
        mo46827k(obj, lVar, new C43802p(uri, kVar));
    }

    /* renamed from: i */
    public final void mo46825i(Object obj, Uri uri) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(uri, "url");
        C43795i iVar = (C43795i) this.f114214a.get(obj);
        if (C69664n.m101066l(obj, 1) && iVar == null && this.f114222j != null) {
            new StringBuilder("No page exists for ").append(obj);
            throw new IllegalStateException("No page exists for ".concat(String.valueOf(obj)), this.f114222j);
        } else if (iVar != null) {
            C69664n.m101061g(uri, "url");
            C19559g.m37304c();
            C43790d d = iVar.mo46815d();
            if (d != null) {
                C69664n.m101061g(uri, "url");
                d.mo46808b();
                C43791e eVar = (C43791e) d.f114178a.mo62784e();
                d.f114178a.mo62807f(C43791e.m77312b(eVar, C69540x.m100840V(C69540x.m100832N(C69540x.m100842X(eVar.f114183a), uri)), false, (C43363h) null, 14));
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        } else {
            throw new IllegalArgumentException("No page exists for " + obj + ".");
        }
    }

    /* renamed from: j */
    public final void mo46826j() {
        C43795i iVar = this.f114216c;
        if (iVar == null || iVar.mo46814b() == null) {
            iVar = null;
        }
        if (iVar != null) {
            C43795i iVar2 = this.f114221i;
            if (iVar2 == null || !iVar2.f114197h || iVar2 != iVar) {
                if (iVar2 != null) {
                    iVar2.f114197h = false;
                }
                this.f114221i = iVar;
                C43795i iVar3 = this.f114217d;
                if (iVar3 == null || iVar3 == iVar) {
                    this.f114217d = null;
                    C69664n.m101058d(iVar);
                    iVar.f114197h = true;
                    this.f114215b.mo62807f(new C43886d(iVar));
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo46827k(Object obj, C69626l lVar, C69615a aVar) {
        if (C69664n.m101066l(obj, 1)) {
            mo46822f(obj);
        }
        if (!this.f114214a.containsKey(obj)) {
            C43790d dVar = (C43790d) aVar.mo5672a();
            baf baf = this.f114225m;
            C43904a aVar2 = this.f114218f;
            aVar2.getClass();
            baf.f204863c = aVar2;
            dVar.getClass();
            baf.f204862b = dVar;
            AtomicReference atomicReference = this.f114219g;
            atomicReference.getClass();
            baf.f204864d = atomicReference;
            C43269t tVar = this.f114220h;
            tVar.getClass();
            baf.f204865e = tVar;
            C68225k.m98529a(baf.f204862b, C43806b.class);
            C68225k.m98529a(baf.f204863c, C43904a.class);
            C68225k.m98529a(baf.f204864d, AtomicReference.class);
            C68225k.m98529a(baf.f204865e, C43269t.class);
            C43795i a = ((C43787a) C68286a.m98629a(new bai(baf.f204861a, baf.f204862b, baf.f204863c, baf.f204865e), C43787a.class)).mo46803a();
            this.f114214a.put(obj, a);
            dVar.f114180c.mo46895a(new C43800n(a, this, dVar));
            C69664n.m101061g(lVar, "onCreatedPage");
            C19559g.m37304c();
            C43805a.m77341a(a.f114190a).mo46810a();
            C43806b bVar = a.f114190a;
            C69664n.m101059e(bVar, "null cannot be cast to non-null type com.google.android.libraries.web.page.internal.WebNavigationImpl");
            a.f114195f.mo46905k(((C43790d) bVar).f114180c);
            Set<C43786b> c = a.f114192c.mo47063c(a.f114191b.mo46387e(C43786b.class));
            Map map = a.f114196g;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(c, 10));
            for (C43786b bVar2 : c) {
                C69664n.m101061g(bVar2, "<this>");
                Class<?> cls = bVar2.getClass();
                int i = C69649af.f186028a;
                Class a2 = C69614a.m101026a(new C69657g(cls));
                C69664n.m101061g(a2, "<this>");
                String name = a2.getName();
                C69664n.m101060f(name, "name");
                arrayList.add(new C69685i(name, bVar2));
            }
            C69505av.m100877s(map, arrayList);
            lVar.mo5761a(a);
            for (Map.Entry value : a.f114196g.entrySet()) {
                ((C43786b) value.getValue()).mo46801c();
            }
            return;
        }
        throw new IllegalArgumentException("A page already exists for " + obj + ".");
    }
}
