package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105451u;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7941pq;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.eg */
/* compiled from: PG */
public final class C105587eg implements C105451u, C23252b {

    /* renamed from: a */
    public final C23251a f294602a;

    /* renamed from: b */
    public final C23251a f294603b;

    /* renamed from: c */
    public final C23251a f294604c;

    /* renamed from: d */
    private final List f294605d;

    public C105587eg(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "isGestaltDarkThemeUi", new C23256a(), false, true, false);
        this.f294602a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "reactAction", new C23271p(C7941pq.f27880i.getParserForType(), C62921ba.m95368a(), C7941pq.f27880i), false, true, false);
        this.f294603b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "state", new C23268m(new C23259d(C105450t.values())), false, true, false);
        this.f294604c = aVar4;
        aVar.mo28530a(aVar4);
        this.f294605d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294605d;
    }
}
