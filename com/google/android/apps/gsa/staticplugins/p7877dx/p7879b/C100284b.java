package com.google.android.apps.gsa.staticplugins.p7877dx.p7879b;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100300d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableEnumListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;
import p5451f.p5452a.p5453a.p5454a.C69396ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.b.b */
/* compiled from: PG */
public final class C100284b implements C100300d, C23252b {

    /* renamed from: a */
    private final C23251a f280436a;

    /* renamed from: b */
    private final C23251a f280437b;

    /* renamed from: c */
    private final C23186f f280438c;

    /* renamed from: d */
    private final C23251a f280439d;

    /* renamed from: e */
    private final C23251a f280440e;

    /* renamed from: f */
    private final C23251a f280441f;

    /* renamed from: g */
    private final C23251a f280442g;

    /* renamed from: h */
    private final C23251a f280443h;

    /* renamed from: i */
    private final C23251a f280444i;

    /* renamed from: j */
    private final List f280445j;

    public C100284b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "activeDestination", new C23268m(new C23259d(C90208n.values())), true, false, false);
        this.f280436a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "bottomBarPromotionIndicatorTip", new C23268m(new C23271p(C69396ar.f185678d.getParserForType(), C62921ba.m95368a(), C69396ar.f185678d)), true, false, false);
        this.f280437b = aVar3;
        aVar.mo28530a(aVar3);
        this.f280438c = new C23186f("drawerChild", cVar, true);
        C23251a aVar4 = new C23251a(cVar, "heightMatchesOpa", new C23256a(), true, false, false);
        this.f280439d = aVar4;
        aVar.mo28530a(aVar4);
        C23052c cVar2 = cVar;
        C23251a aVar5 = new C23251a(cVar2, "menuTip", new C23268m(new C23271p(C69396ar.f185678d.getParserForType(), C62921ba.m95368a(), C69396ar.f185678d)), true, false, false);
        this.f280440e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar2, "showBadgedDrawer", new C23256a(), true, false, false);
        this.f280441f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar, "tabsToShow", new ImmutableEnumListUtils(C100283a.f280435a, C90208n.values()), true, false, false);
        this.f280442g = aVar7;
        aVar.mo28530a(aVar7);
        C23052c cVar3 = cVar;
        C23251a aVar8 = new C23251a(cVar3, "visitedTabs", new ImmutableEnumListUtils(C100283a.f280435a, C90208n.values()), true, false, false);
        this.f280443h = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(cVar3, "zeroStateIconV2Enabled", new C23256a(), true, false, false);
        this.f280444i = aVar9;
        aVar.mo28530a(aVar9);
        this.f280445j = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280445j;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo91857b() {
        return this.f280438c;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91858c() {
        return this.f280436a;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91859d() {
        return this.f280437b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91860e() {
        return this.f280439d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91861f() {
        return this.f280441f;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91862g() {
        return this.f280442g;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo91863h() {
        return this.f280444i;
    }

    /* renamed from: i */
    public final /* synthetic */ C23251a mo91864i() {
        return this.f280440e;
    }

    /* renamed from: j */
    public final /* synthetic */ C23251a mo91865j() {
        return this.f280443h;
    }
}
