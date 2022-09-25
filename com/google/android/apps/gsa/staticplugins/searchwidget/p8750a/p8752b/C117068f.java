package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117089a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.f */
/* compiled from: PG */
public final class C117068f implements C117089a, C23252b {

    /* renamed from: a */
    public final C23251a f325027a;

    /* renamed from: b */
    public final C23251a f325028b;

    /* renamed from: c */
    private final List f325029c;

    public C117068f(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "showDrawerExitDialog", new C23256a(), true, false, false);
        this.f325027a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "text", new C23272q(), true, false, false);
        this.f325028b = aVar3;
        aVar.mo28530a(aVar3);
        this.f325029c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325029c;
    }
}
