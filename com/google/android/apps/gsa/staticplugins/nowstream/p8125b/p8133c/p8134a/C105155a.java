package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105143d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105152f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.a */
/* compiled from: PG */
public final class C105155a implements C105143d, C23252b {

    /* renamed from: a */
    public final C23251a f293129a;

    /* renamed from: b */
    public final C23251a f293130b;

    /* renamed from: c */
    public final C23251a f293131c;

    /* renamed from: d */
    private final C23251a f293132d;

    /* renamed from: e */
    private final List f293133e;

    public C105155a(C23117m mVar) {
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(mVar, "backgroundColor", new C23265j(), true, false, false);
        this.f293129a = aVar2;
        aVar.mo28530a(aVar2);
        C23117m mVar2 = mVar;
        C23251a aVar3 = new C23251a(mVar2, "headerText", new C23272q(), true, false, false);
        this.f293130b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(mVar, "isBackgroundDark", new C23256a(), true, false, false);
        this.f293131c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(mVar2, "menuItems", new C23271p(C105152f.f293123b.getParserForType(), C62921ba.m95368a(), C105152f.f293123b), true, false, false);
        this.f293132d = aVar5;
        aVar.mo28530a(aVar5);
        this.f293133e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293133e;
    }
}
