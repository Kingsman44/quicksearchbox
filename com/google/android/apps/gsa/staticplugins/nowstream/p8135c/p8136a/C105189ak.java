package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105451u;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7941pq;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ak */
/* compiled from: PG */
public final class C105189ak implements C105451u, C23252b {

    /* renamed from: a */
    public final C23251a f293361a;

    /* renamed from: b */
    public final C23251a f293362b;

    /* renamed from: c */
    public final C23251a f293363c;

    /* renamed from: d */
    private final List f293364d;

    public C105189ak(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "isGestaltDarkThemeUi", new C23256a(), true, false, false);
        this.f293361a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "reactAction", new C23271p(C7941pq.f27880i.getParserForType(), C62921ba.m95368a(), C7941pq.f27880i), true, false, false);
        this.f293362b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "state", new C23268m(new C23259d(C105450t.values())), true, false, false);
        this.f293363c = aVar4;
        aVar.mo28530a(aVar4);
        this.f293364d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293364d;
    }
}
