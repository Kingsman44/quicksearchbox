package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99683h;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23198ac;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.t */
/* compiled from: PG */
public final class C99712t implements C99683h, C23252b {

    /* renamed from: a */
    public final C23251a f279034a;

    /* renamed from: b */
    public final C23251a f279035b;

    /* renamed from: c */
    public final C23198ac f279036c;

    /* renamed from: d */
    private final C23251a f279037d;

    /* renamed from: e */
    private final List f279038e;

    public C99712t(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "isPartnerContentEmpty", new C23256a(), false, true, false);
        this.f279034a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "isRefreshing", new C23256a(), false, true, false);
        this.f279035b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "partnerPackageName", new C23272q(), false, true, false);
        this.f279037d = aVar4;
        aVar.mo28530a(aVar4);
        this.f279036c = new C23198ac("partnerTabContentHostChildren", jVar);
        this.f279038e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279038e;
    }
}
