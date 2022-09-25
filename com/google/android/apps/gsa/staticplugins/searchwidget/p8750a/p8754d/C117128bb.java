package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117090b;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bb */
/* compiled from: PG */
public final class C117128bb implements C117090b, C23252b {

    /* renamed from: a */
    private final C23251a f325159a;

    /* renamed from: b */
    private final C23251a f325160b;

    /* renamed from: c */
    private final C23251a f325161c;

    /* renamed from: d */
    private final C23251a f325162d;

    /* renamed from: e */
    private final C23251a f325163e;

    /* renamed from: f */
    private final List f325164f;

    public C117128bb(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "activePanel", new C23265j(), false, true, false);
        this.f325159a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "customColor", new C23265j(), false, true, false);
        this.f325160b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "customHue", new C23265j(), false, true, false);
        this.f325161c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "customSaturationAndValue", new C23265j(), false, true, false);
        this.f325162d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "theme", new C23265j(), false, true, false);
        this.f325163e = aVar6;
        aVar.mo28530a(aVar6);
        this.f325164f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325164f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103129b() {
        return this.f325159a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo103130c() {
        return this.f325160b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo103131d() {
        return this.f325161c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo103132e() {
        return this.f325162d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo103133f() {
        return this.f325163e;
    }
}
