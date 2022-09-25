package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117097i;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bi */
/* compiled from: PG */
public final class C117135bi implements C117097i, C23252b {

    /* renamed from: a */
    public final C23219p f325180a;

    /* renamed from: b */
    public final C23251a f325181b;

    /* renamed from: c */
    public final C23219p f325182c;

    /* renamed from: d */
    public final C23251a f325183d;

    /* renamed from: e */
    public final C23251a f325184e;

    /* renamed from: f */
    public final C23219p f325185f;

    /* renamed from: g */
    public final C23251a f325186g;

    /* renamed from: h */
    public final C23219p f325187h;

    /* renamed from: i */
    public final C23251a f325188i;

    /* renamed from: j */
    public final C23251a f325189j;

    /* renamed from: k */
    private final List f325190k;

    public C117135bi(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f325180a = new C23219p("colorChild", jVar, false);
        C23251a aVar2 = new C23251a(jVar, "colorMenuVisibility", new C23265j(), false, true, false);
        this.f325181b = aVar2;
        aVar.mo28530a(aVar2);
        this.f325182c = new C23219p("logoChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "logoMenuVisibility", new C23265j(), false, true, false);
        this.f325183d = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "mainMenuVisibility", new C23265j(), false, true, false);
        this.f325184e = aVar4;
        aVar.mo28530a(aVar4);
        this.f325185f = new C23219p("opacityChild", jVar, false);
        C23251a aVar5 = new C23251a(jVar, "opacityMenuVisibility", new C23265j(), false, true, false);
        this.f325186g = aVar5;
        aVar.mo28530a(aVar5);
        this.f325187h = new C23219p("shapeChild", jVar, false);
        C22945j jVar3 = jVar;
        C23251a aVar6 = new C23251a(jVar3, "shapeMenuVisibility", new C23265j(), false, true, false);
        this.f325188i = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "widgetCustomized", new C23256a(), false, true, false);
        this.f325189j = aVar7;
        aVar.mo28530a(aVar7);
        this.f325190k = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325190k;
    }
}
