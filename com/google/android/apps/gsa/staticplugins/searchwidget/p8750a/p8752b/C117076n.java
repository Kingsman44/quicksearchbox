package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117097i;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.n */
/* compiled from: PG */
public final class C117076n implements C117097i, C23252b {

    /* renamed from: a */
    public final C23186f f325052a;

    /* renamed from: b */
    public final C23251a f325053b;

    /* renamed from: c */
    public final C23186f f325054c;

    /* renamed from: d */
    public final C23251a f325055d;

    /* renamed from: e */
    public final C23251a f325056e;

    /* renamed from: f */
    public final C23186f f325057f;

    /* renamed from: g */
    public final C23251a f325058g;

    /* renamed from: h */
    public final C23186f f325059h;

    /* renamed from: i */
    public final C23251a f325060i;

    /* renamed from: j */
    public final C23251a f325061j;

    /* renamed from: k */
    private final List f325062k;

    public C117076n(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f325052a = new C23186f("colorChild", cVar, false);
        C23251a aVar2 = new C23251a(cVar, "colorMenuVisibility", new C23265j(), true, false, false);
        this.f325053b = aVar2;
        aVar.mo28530a(aVar2);
        this.f325054c = new C23186f("logoChild", cVar, false);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "logoMenuVisibility", new C23265j(), true, false, false);
        this.f325055d = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "mainMenuVisibility", new C23265j(), true, false, false);
        this.f325056e = aVar4;
        aVar.mo28530a(aVar4);
        this.f325057f = new C23186f("opacityChild", cVar, false);
        C23251a aVar5 = new C23251a(cVar, "opacityMenuVisibility", new C23265j(), true, false, false);
        this.f325058g = aVar5;
        aVar.mo28530a(aVar5);
        this.f325059h = new C23186f("shapeChild", cVar, false);
        C23052c cVar3 = cVar;
        C23251a aVar6 = new C23251a(cVar3, "shapeMenuVisibility", new C23265j(), true, false, false);
        this.f325060i = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar3, "widgetCustomized", new C23256a(), true, false, false);
        this.f325061j = aVar7;
        aVar.mo28530a(aVar7);
        this.f325062k = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325062k;
    }
}
