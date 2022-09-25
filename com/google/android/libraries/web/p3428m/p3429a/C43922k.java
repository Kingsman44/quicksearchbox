package com.google.android.libraries.web.p3428m.p3429a;

import android.net.Uri;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43240e;
import com.google.android.libraries.web.base.p3348b.p3351c.C43250f;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43324a;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.m.a.k */
/* compiled from: PG */
public final class C43922k implements C43945v {

    /* renamed from: a */
    private final C43904a f114394a;

    /* renamed from: b */
    private final C43269t f114395b;

    /* renamed from: c */
    private final C43873a f114396c;

    /* renamed from: d */
    private final boolean f114397d;

    /* renamed from: e */
    private final C43250f f114398e;

    public C43922k(C43904a aVar, C43269t tVar, C43873a aVar2, WebModelProvider webModelProvider) {
        C69664n.m101061g(aVar, "window");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(aVar2, "urlChecker");
        C69664n.m101061g(webModelProvider, "coordinatedWebModelProvider");
        this.f114394a = aVar;
        this.f114395b = tVar;
        this.f114396c = aVar2;
        this.f114397d = tVar.mo46384b().f112975n;
        this.f114398e = (C43250f) webModelProvider.mo47072a(C43250f.class);
    }

    /* renamed from: c */
    private final void m77557c(C43367l lVar, Object obj) {
        if (lVar.f113298d) {
            if (this.f114397d) {
                C43891f d = this.f114394a.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                ((C43804r) ((C43945v) d)).mo46821e(obj);
            }
            C43891f d2 = this.f114394a.mo46411d(C43331ag.class);
            C69664n.m101060f(d2, "getPlugin(T::class.java)");
            C43331ag agVar = (C43331ag) ((C43945v) d2);
            C43375t tVar = (C43375t) agVar.mo46439a().toBuilder();
            tVar.copyOnWrite();
            C43376u uVar = (C43376u) tVar.instance;
            uVar.f113335h = null;
            uVar.f113328a &= -65;
            agVar.mo46452n((C43376u) tVar.build());
            C43324a c = agVar.f113186b.mo46464c();
            if (c != null) {
                c.mo46431j(lVar);
            }
        }
    }

    /* renamed from: d */
    private static final void m77558d(C43922k kVar, C43367l lVar, Object obj, C43240e eVar) {
        C43912g.m77530a(kVar.f114394a).mo46933j(false);
        kVar.m77557c(lVar, obj);
        eVar.mo46325b(lVar);
    }

    /* renamed from: a */
    public final boolean mo46946a(C43367l lVar, Object obj) {
        C69664n.m101061g(lVar, "request");
        C69664n.m101061g(obj, "navigationKey");
        if (!mo46947b(lVar, obj)) {
            C43873a aVar = this.f114396c;
            Uri parse = Uri.parse(lVar.f113296b);
            C69664n.m101060f(parse, "parse(request.currentUrl)");
            if (aVar.mo46765a(parse) && !this.f114398e.mo46331b()) {
                return false;
            }
            C43912g.m77530a(this.f114394a).mo46933j(true);
            m77557c(lVar, obj);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo46947b(C43367l lVar, Object obj) {
        C69664n.m101061g(lVar, "request");
        C69664n.m101061g(obj, "navigationKey");
        Set<C43240e> g = C43909d.m77519a(this.f114394a).mo46917g();
        for (C43240e eVar : g) {
            if (eVar.mo46328e(lVar)) {
                m77558d(this, lVar, obj, eVar);
                return true;
            }
        }
        for (C43240e c : g) {
            if (c.mo46326c(lVar)) {
                return false;
            }
        }
        for (C43240e eVar2 : g) {
            if (eVar2.mo46327d(lVar)) {
                m77558d(this, lVar, obj, eVar2);
                return true;
            }
        }
        return false;
    }
}
