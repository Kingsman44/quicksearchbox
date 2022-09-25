package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105446p;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.aj */
/* compiled from: PG */
public final class C105188aj implements C105446p, C23252b {

    /* renamed from: a */
    private final C23251a f293356a;

    /* renamed from: b */
    private final C23251a f293357b;

    /* renamed from: c */
    private final C23251a f293358c;

    /* renamed from: d */
    private final C23251a f293359d;

    /* renamed from: e */
    private final List f293360e;

    public C105188aj(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "bottomShowsThroughNavBar", new C23256a(), true, false, false);
        this.f293356a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "footerHeader", new C23272q(), true, false, false);
        this.f293357b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "footerLink", new C23272q(), true, false, false);
        this.f293358c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "hasBottomSpacer", new C23256a(), true, false, false);
        this.f293359d = aVar5;
        aVar.mo28530a(aVar5);
        this.f293360e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293360e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94638b() {
        return this.f293356a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94639c() {
        return this.f293357b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94640d() {
        return this.f293358c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94641e() {
        return this.f293359d;
    }
}
