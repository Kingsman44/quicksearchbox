package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105143d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105152f;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.l */
/* compiled from: PG */
public final class C105166l implements C105143d, C23252b {

    /* renamed from: a */
    public final C23251a f293176a;

    /* renamed from: b */
    public final C23251a f293177b;

    /* renamed from: c */
    public final C23251a f293178c;

    /* renamed from: d */
    public final C23251a f293179d;

    /* renamed from: e */
    private final List f293180e;

    public C105166l(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "backgroundColor", new C23265j(), false, true, false);
        this.f293176a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "headerText", new C23272q(), false, true, false);
        this.f293177b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "isBackgroundDark", new C23256a(), false, true, false);
        this.f293178c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar, "menuItems", new C23271p(C105152f.f293123b.getParserForType(), C62921ba.m95368a(), C105152f.f293123b), false, true, false);
        this.f293179d = aVar5;
        aVar.mo28530a(aVar5);
        this.f293180e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293180e;
    }
}
