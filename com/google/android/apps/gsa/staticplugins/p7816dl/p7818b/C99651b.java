package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99683h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.b */
/* compiled from: PG */
public final class C99651b implements C99683h, C23252b {

    /* renamed from: a */
    public final C23251a f278874a;

    /* renamed from: b */
    public final C23251a f278875b;

    /* renamed from: c */
    public final C23251a f278876c;

    /* renamed from: d */
    public final C23251a f278877d;

    /* renamed from: e */
    public final C23193m f278878e;

    /* renamed from: f */
    public final C23251a f278879f;

    /* renamed from: g */
    private final List f278880g;

    public C99651b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "isPartnerContentEmpty", new C23256a(), true, false, false);
        this.f278874a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "isRefreshing", new C23256a(), true, false, false);
        this.f278875b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "isVideoSupported", new C23256a(), true, false, false);
        this.f278876c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "partnerPackageName", new C23272q(), true, false, false);
        this.f278877d = aVar5;
        aVar.mo28530a(aVar5);
        this.f278878e = new C23193m("partnerTabContentHostChildren", cVar, true);
        C23251a aVar6 = new C23251a(cVar, "partnerTabContentTopBound", new C23265j(), true, false, false);
        this.f278879f = aVar6;
        aVar.mo28530a(aVar6);
        this.f278880g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f278880g;
    }
}
