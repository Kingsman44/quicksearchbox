package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100300d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.d */
/* compiled from: PG */
public final class C100305d implements C100300d, C23252b {

    /* renamed from: a */
    private final C23251a f280493a;

    /* renamed from: b */
    private final C23251a f280494b;

    /* renamed from: c */
    private final C23219p f280495c;

    /* renamed from: d */
    private final C23251a f280496d;

    /* renamed from: e */
    private final C23251a f280497e;

    /* renamed from: f */
    private final C23251a f280498f;

    /* renamed from: g */
    private final C23251a f280499g;

    /* renamed from: h */
    private final List f280500h;

    public C100305d(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "activeDestination", new C23268m(new C23259d(C90208n.values())), false, true, false);
        this.f280493a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "bottomBarPromotionIndicatorTip", new C23268m(new C23271p(C69396ar.f185678d.getParserForType(), C62921ba.m95368a(), C69396ar.f185678d)), false, true, false);
        this.f280494b = aVar3;
        aVar.mo28530a(aVar3);
        this.f280495c = new C23219p("drawerChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar4 = new C23251a(jVar2, "heightMatchesOpa", new C23256a(), false, true, false);
        this.f280496d = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "showBadgedDrawer", new C23256a(), false, true, false);
        this.f280497e = aVar5;
        aVar.mo28530a(aVar5);
        C22945j jVar3 = jVar;
        C23251a aVar6 = new C23251a(jVar3, "tabsToShow", new ImmutableEnumListUtils(C100304c.f280492a, C90208n.values()), false, true, false);
        this.f280498f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "zeroStateIconV2Enabled", new C23256a(), false, true, false);
        this.f280499g = aVar7;
        aVar.mo28530a(aVar7);
        this.f280500h = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280500h;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo91857b() {
        return this.f280495c;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91858c() {
        return this.f280493a;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91859d() {
        return this.f280494b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91860e() {
        return this.f280496d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91861f() {
        return this.f280497e;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91862g() {
        return this.f280498f;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo91863h() {
        return this.f280499g;
    }

    /* renamed from: i */
    public final C23251a mo91864i() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: j */
    public final C23251a mo91865j() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
