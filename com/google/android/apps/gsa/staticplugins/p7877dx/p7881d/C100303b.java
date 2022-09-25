package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100300d;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23194a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.b */
/* compiled from: PG */
public final class C100303b implements C100300d, C23252b {

    /* renamed from: a */
    public final C23251a f280484a;

    /* renamed from: b */
    private final C23251a f280485b;

    /* renamed from: c */
    private final C23251a f280486c;

    /* renamed from: d */
    private final C23194a f280487d;

    /* renamed from: e */
    private final C23251a f280488e;

    /* renamed from: f */
    private final C23251a f280489f;

    /* renamed from: g */
    private final C23251a f280490g;

    /* renamed from: h */
    private final List f280491h;

    public C100303b(C23117m mVar, C23110f fVar) {
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(mVar, "activeDestination", new C23268m(new C23259d(C90208n.values())), true, false, false);
        this.f280485b = aVar2;
        aVar.mo28530a(aVar2);
        C23117m mVar2 = mVar;
        C23251a aVar3 = new C23251a(mVar2, "bottomBarPromotionIndicatorTip", new C23268m(new C23271p(C69396ar.f185678d.getParserForType(), C62921ba.m95368a(), C69396ar.f185678d)), true, false, false);
        this.f280486c = aVar3;
        aVar.mo28530a(aVar3);
        this.f280487d = new C23194a("drawerChild", mVar2, fVar);
        C23117m mVar3 = mVar;
        C23251a aVar4 = new C23251a(mVar3, "heightMatchesOpa", new C23256a(), true, false, false);
        this.f280484a = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(mVar3, "showBadgedDrawer", new C23256a(), true, false, false);
        this.f280488e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(mVar3, "tabsToShow", new ImmutableEnumListUtils(C100302a.f280483a, C90208n.values()), true, false, false);
        this.f280489f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(mVar3, "zeroStateIconV2Enabled", new C23256a(), true, false, false);
        this.f280490g = aVar7;
        aVar.mo28530a(aVar7);
        this.f280491h = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280491h;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo91857b() {
        return this.f280487d;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91858c() {
        return this.f280485b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91859d() {
        return this.f280486c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91860e() {
        return this.f280484a;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91861f() {
        return this.f280488e;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91862g() {
        return this.f280489f;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo91863h() {
        return this.f280490g;
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
