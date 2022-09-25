package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105431ad;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.em */
/* compiled from: PG */
public final class C105593em implements C105431ad, C23252b {

    /* renamed from: a */
    private final C23251a f294633a;

    /* renamed from: b */
    private final C23251a f294634b;

    /* renamed from: c */
    private final List f294635c;

    public C105593em(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "isGestaltDarkThemeUi", new C23256a(), false, true, false);
        this.f294633a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "tooltip", new C23271p(C9251ef.f31988f.getParserForType(), C62921ba.m95368a(), C9251ef.f31988f), false, true, false);
        this.f294634b = aVar3;
        aVar.mo28530a(aVar3);
        this.f294635c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294635c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94657b() {
        return this.f294633a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94658c() {
        return this.f294634b;
    }

    /* renamed from: d */
    public final C23251a mo94659d() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
