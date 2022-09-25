package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117090b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.g */
/* compiled from: PG */
public final class C117069g implements C117090b, C23252b {

    /* renamed from: a */
    public final C23251a f325030a;

    /* renamed from: b */
    public final C23251a f325031b;

    /* renamed from: c */
    public final C23251a f325032c;

    /* renamed from: d */
    public final C23251a f325033d;

    /* renamed from: e */
    public final C23251a f325034e;

    /* renamed from: f */
    private final List f325035f;

    public C117069g(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "activePanel", new C23265j(), true, false, false);
        this.f325030a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "customColor", new C23265j(), true, false, false);
        this.f325031b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "customHue", new C23265j(), true, false, false);
        this.f325032c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "customSaturationAndValue", new C23265j(), true, false, false);
        this.f325033d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar2, "theme", new C23265j(), true, false, false);
        this.f325034e = aVar6;
        aVar.mo28530a(aVar6);
        this.f325035f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325035f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103129b() {
        return this.f325030a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103130c() {
        return this.f325031b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103131d() {
        return this.f325032c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103132e() {
        return this.f325033d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo103133f() {
        return this.f325034e;
    }
}
