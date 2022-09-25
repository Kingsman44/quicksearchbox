package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43280i;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.browser.internal.p3352a.C43288g;
import com.google.android.libraries.web.browser.internal.p3352a.C43289h;
import com.google.android.libraries.web.coordinator.p3400b.p3401a.C43734c;
import com.google.android.libraries.web.coordinator.p3400b.p3401a.C43736e;
import com.google.android.libraries.web.lifecycle.C43876a;
import com.google.android.libraries.web.lifecycle.C43889d;
import com.google.android.libraries.web.lifecycle.internal.C43896d;
import com.google.android.libraries.web.lifecycle.p3426b.C43879a;
import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import com.google.android.libraries.web.lifecycle.p3427c.C43888f;
import com.google.android.libraries.web.p3418j.C43841f;
import com.google.android.libraries.web.p3418j.C43843h;
import com.google.android.libraries.web.p3418j.p3419a.C43835x;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.C69747m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.y */
/* compiled from: PG */
public final class C43313y implements C44107h, C43272a {

    /* renamed from: a */
    public final C69585o f113165a;

    /* renamed from: b */
    public final C43896d f113166b = new C43896d();

    /* renamed from: c */
    private final WebModelProvider f113167c;

    /* renamed from: d */
    private final C44089a f113168d;

    /* renamed from: e */
    private final C43879a f113169e;

    /* renamed from: f */
    private final C43736e f113170f;

    /* renamed from: g */
    private final C43835x f113171g;

    /* renamed from: h */
    private final Map f113172h;

    public C43313y(WebModelProvider webModelProvider, C44089a aVar, C69585o oVar) {
        C69664n.m101061g(webModelProvider, "coordinatorModelProvider");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f113167c = webModelProvider;
        this.f113168d = aVar;
        this.f113165a = oVar;
        new C69747m(new C43311w(this));
        this.f113169e = new C43879a();
        this.f113170f = (C43736e) webModelProvider.mo47072a(C43736e.class);
        this.f113171g = new C43835x(2, new C43312x(this));
        this.f113172h = new LinkedHashMap();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final C43314j mo46411d(Class cls) {
        Map map = this.f113172h;
        Object obj = map.get(cls);
        if (obj == null) {
            obj = ((C43280i) this.f113168d.mo47062b(cls)).mo46392a(this);
            map.put(cls, obj);
        }
        C69664n.m101059e(obj, "null cannot be cast to non-null type T of com.google.android.libraries.web.browser.internal.WebBrowserModel.getPlugin");
        return (C43314j) obj;
    }

    /* renamed from: c */
    public final /* synthetic */ C43889d mo46410c() {
        return this.f113166b;
    }

    /* renamed from: e */
    public final C43879a mo46412e() {
        return this.f113169e;
    }

    /* renamed from: f */
    public final C43841f mo46413f(String str, C43843h hVar) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(hVar, "config");
        return this.f113171g.mo46846a(str, hVar, new C43310v(hVar, this));
    }

    /* renamed from: g */
    public final void mo46414g(C43288g gVar) {
        if (!this.f113172h.containsKey(C43289h.class)) {
            this.f113172h.put(C43289h.class, gVar);
            C43736e eVar = this.f113170f;
            if (((C43888f) eVar.f114073c.mo62784e()).mo46880a() == null) {
                eVar.f114072b.mo62807f(new C43886d(this));
                this.f113166b.mo46896b(new C43734c(eVar));
                for (C43876a a : eVar.f114071a) {
                    a.mo46836a(this);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
