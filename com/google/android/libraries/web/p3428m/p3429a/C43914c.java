package com.google.android.libraries.web.p3428m.p3429a;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.lifecycle.C43889d;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.lifecycle.internal.C43896d;
import com.google.android.libraries.web.lifecycle.p3426b.C43879a;
import com.google.android.libraries.web.p3418j.C43841f;
import com.google.android.libraries.web.p3418j.C43843h;
import com.google.android.libraries.web.p3418j.p3419a.C43832u;
import com.google.android.libraries.web.p3418j.p3419a.C43834w;
import com.google.android.libraries.web.p3418j.p3419a.C43835x;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43944u;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.C69747m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.m.a.c */
/* compiled from: PG */
public final class C43914c implements C43904a {

    /* renamed from: a */
    public final C43269t f114372a;

    /* renamed from: b */
    public final C69585o f114373b;

    /* renamed from: c */
    public final C43896d f114374c = new C43896d();

    /* renamed from: d */
    public final Map f114375d;

    /* renamed from: e */
    private final C43272a f114376e;

    /* renamed from: f */
    private final C44089a f114377f;

    /* renamed from: g */
    private final C43879a f114378g;

    /* renamed from: h */
    private final C43835x f114379h;

    /* renamed from: i */
    private final C43920i f114380i;

    public C43914c(C43272a aVar, C43269t tVar, C44089a aVar2, C69585o oVar) {
        C69664n.m101061g(aVar, "browser");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114376e = aVar;
        this.f114372a = tVar;
        this.f114377f = aVar2;
        this.f114373b = oVar;
        new C69747m(new C43913b(this));
        this.f114378g = new C43879a();
        this.f114375d = new LinkedHashMap();
        this.f114379h = new C43835x(3, C43834w.f114266a);
        C43891f d = aVar.mo46411d(C43920i.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        this.f114380i = (C43920i) ((C43314j) d);
    }

    /* renamed from: a */
    public final boolean mo46915a() {
        return this.f114380i.mo46939f(new C43905a(this)) == 0;
    }

    /* renamed from: b */
    public final C43945v mo46411d(Class cls) {
        C69664n.m101061g(cls, "pluginClass");
        Map map = this.f114375d;
        Object obj = map.get(cls);
        if (obj == null) {
            obj = ((C43944u) this.f114377f.mo47062b(cls)).mo46949a(this);
            map.put(cls, obj);
        }
        C69664n.m101059e(obj, "null cannot be cast to non-null type T of com.google.android.libraries.web.window.internal.WebWindowImpl.getPlugin");
        return (C43945v) obj;
    }

    /* renamed from: c */
    public final /* synthetic */ C43889d mo46410c() {
        return this.f114374c;
    }

    /* renamed from: e */
    public final C43879a mo46412e() {
        return this.f114378g;
    }

    /* renamed from: f */
    public final C43841f mo46413f(String str, C43843h hVar) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(hVar, "config");
        return this.f114379h.mo46846a(str, hVar, C43832u.f114265a);
    }
}
