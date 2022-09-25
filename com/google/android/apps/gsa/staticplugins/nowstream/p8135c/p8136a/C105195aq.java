package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105431ad;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.aq */
/* compiled from: PG */
public final class C105195aq implements C105431ad, C23252b {

    /* renamed from: a */
    private final C23251a f293395a;

    /* renamed from: b */
    private final C23251a f293396b;

    /* renamed from: c */
    private final C23251a f293397c;

    /* renamed from: d */
    private final List f293398d;

    public C105195aq(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "isGestaltDarkThemeUi", new C23256a(), true, false, false);
        this.f293395a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "tipShownThisSession", new C23271p(C9251ef.f31988f.getParserForType(), C62921ba.m95368a(), C9251ef.f31988f), true, false, false);
        this.f293396b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "tooltip", new C23271p(C9251ef.f31988f.getParserForType(), C62921ba.m95368a(), C9251ef.f31988f), true, false, false);
        this.f293397c = aVar4;
        aVar.mo28530a(aVar4);
        this.f293398d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293398d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94657b() {
        return this.f293395a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94658c() {
        return this.f293397c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23251a mo94659d() {
        return this.f293396b;
    }
}
