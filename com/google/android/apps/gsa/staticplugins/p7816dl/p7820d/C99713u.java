package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99687l;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99688m;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99689n;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.u */
/* compiled from: PG */
public final class C99713u implements C99689n, C23252b {

    /* renamed from: a */
    public final C23251a f279039a;

    /* renamed from: b */
    public final C23251a f279040b;

    /* renamed from: c */
    public final C23219p f279041c;

    /* renamed from: d */
    public final C23219p f279042d;

    /* renamed from: e */
    public final C23251a f279043e;

    /* renamed from: f */
    public final C23251a f279044f;

    /* renamed from: g */
    private final C23251a f279045g;

    /* renamed from: h */
    private final List f279046h;

    public C99713u(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "childViewTopBound", new C23265j(), false, true, false);
        this.f279045g = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "iconStatus", new C23268m(new C23259d(C99687l.values())), false, true, false);
        this.f279039a = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "isPomoEnabled", new C23256a(), false, true, false);
        this.f279040b = aVar4;
        aVar.mo28530a(aVar4);
        this.f279041c = new C23219p("momoChild", jVar, false);
        this.f279042d = new C23219p("partnerChild", jVar, false);
        C23251a aVar5 = new C23251a(jVar, "partnerTabIcon", new C23268m(new C23269n()), false, true, false);
        this.f279043e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar, "selectedTab", new C23268m(new C23259d(C99688m.values())), false, true, false);
        this.f279044f = aVar6;
        aVar.mo28530a(aVar6);
        this.f279046h = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279046h;
    }
}
