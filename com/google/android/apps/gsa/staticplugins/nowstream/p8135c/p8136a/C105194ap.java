package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105456z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ap */
/* compiled from: PG */
public final class C105194ap implements C105456z, C23252b {

    /* renamed from: a */
    private final C23251a f293389a;

    /* renamed from: b */
    private final C23251a f293390b;

    /* renamed from: c */
    private final C23251a f293391c;

    /* renamed from: d */
    private final C23251a f293392d;

    /* renamed from: e */
    private final C23251a f293393e;

    /* renamed from: f */
    private final List f293394f;

    public C105194ap(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "action", new C23268m(new C23272q()), true, false, false);
        this.f293389a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "displaySnackbar", new C23256a(), true, false, false);
        this.f293390b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "isBackgroundTranslucent", new C23256a(), true, false, false);
        this.f293391c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "message", new C23272q(), true, false, false);
        this.f293392d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar, "surfaceType", new C23268m(new C23259d(C90229e.values())), true, false, false);
        this.f293393e = aVar6;
        aVar.mo28530a(aVar6);
        this.f293394f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293394f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94652b() {
        return this.f293389a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94653c() {
        return this.f293390b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94654d() {
        return this.f293391c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94655e() {
        return this.f293392d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo94656f() {
        return this.f293393e;
    }
}
