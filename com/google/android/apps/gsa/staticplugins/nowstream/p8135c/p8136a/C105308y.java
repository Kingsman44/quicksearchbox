package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105433c;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.y */
/* compiled from: PG */
public final class C105308y implements C105433c, C23252b {

    /* renamed from: a */
    public final C23251a f293821a;

    /* renamed from: b */
    public final C23251a f293822b;

    /* renamed from: c */
    public final C23251a f293823c;

    /* renamed from: d */
    public final C23251a f293824d;

    /* renamed from: e */
    private final List f293825e;

    public C105308y(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "actionLabel", new C23272q(), true, false, false);
        this.f293821a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "message", new C23272q(), true, false, false);
        this.f293822b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "statusCode", new C23265j(), true, false, false);
        this.f293823c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "title", new C23272q(), true, false, false);
        this.f293824d = aVar5;
        aVar.mo28530a(aVar5);
        this.f293825e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293825e;
    }
}
