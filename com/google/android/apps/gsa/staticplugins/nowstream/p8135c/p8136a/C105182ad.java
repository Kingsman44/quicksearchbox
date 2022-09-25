package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105440j;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ad */
/* compiled from: PG */
public final class C105182ad implements C105440j, C23252b {

    /* renamed from: a */
    public final C23251a f293307a;

    /* renamed from: b */
    public final C23251a f293308b;

    /* renamed from: c */
    public final C23251a f293309c;

    /* renamed from: d */
    private final List f293310d;

    public C105182ad(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "isBackgroundDark", new C23256a(), true, false, false);
        this.f293307a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "newContentButtonText", new C23272q(), true, false, false);
        this.f293308b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "surfaceType", new C23268m(new C23259d(C90229e.values())), true, false, false);
        this.f293309c = aVar4;
        aVar.mo28530a(aVar4);
        this.f293310d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293310d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94603b() {
        return this.f293307a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94604c() {
        return this.f293308b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94605d() {
        return this.f293309c;
    }
}
