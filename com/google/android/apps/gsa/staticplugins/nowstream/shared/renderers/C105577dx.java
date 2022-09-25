package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105434d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dx */
/* compiled from: PG */
public final class C105577dx implements C105435e, C23252b {

    /* renamed from: a */
    public final C23219p f294537a;

    /* renamed from: b */
    public final C23251a f294538b;

    /* renamed from: c */
    public final C23219p f294539c;

    /* renamed from: d */
    public final C23251a f294540d;

    /* renamed from: e */
    private final List f294541e;

    public C105577dx(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f294537a = new C23219p("bottomSheetChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "doodleStatusBarIconColor", new C23268m(new C23259d(C105434d.values())), false, true, false);
        this.f294538b = aVar2;
        aVar.mo28530a(aVar2);
        this.f294539c = new C23219p("nowFeedChild", jVar, false);
        new C23219p("promotionsChild", jVar, false);
        C23251a aVar3 = new C23251a(jVar2, "tabActive", new C23256a(), false, true, false);
        this.f294540d = aVar3;
        aVar.mo28530a(aVar3);
        this.f294541e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294541e;
    }
}
