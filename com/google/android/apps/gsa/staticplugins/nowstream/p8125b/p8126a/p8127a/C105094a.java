package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105143d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105152f;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.a */
/* compiled from: PG */
public final class C105094a implements C105143d, C23252b {

    /* renamed from: a */
    public final C23251a f292977a;

    /* renamed from: b */
    public final C23251a f292978b;

    /* renamed from: c */
    public final C23251a f292979c;

    /* renamed from: d */
    public final C23251a f292980d;

    /* renamed from: e */
    private final List f292981e;

    public C105094a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "backgroundColor", new C23265j(), true, false, false);
        this.f292977a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "headerText", new C23272q(), true, false, false);
        this.f292978b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "isBackgroundDark", new C23256a(), true, false, false);
        this.f292979c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar, "menuItems", new C23271p(C105152f.f293123b.getParserForType(), C62921ba.m95368a(), C105152f.f293123b), true, false, false);
        this.f292980d = aVar5;
        aVar.mo28530a(aVar5);
        this.f292981e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f292981e;
    }
}
