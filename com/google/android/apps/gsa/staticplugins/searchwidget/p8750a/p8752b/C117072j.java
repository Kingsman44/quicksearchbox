package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117093e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.j */
/* compiled from: PG */
public final class C117072j implements C117093e, C23252b {

    /* renamed from: a */
    public final C23251a f325041a;

    /* renamed from: b */
    public final C23251a f325042b;

    /* renamed from: c */
    private final List f325043c;

    public C117072j(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "widgedCustomized", new C23256a(), true, false, false);
        this.f325041a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "widgetStyle", new C23271p(C89283z.f242073n.getParserForType(), C62921ba.m95368a(), C89283z.f242073n), true, false, false);
        this.f325042b = aVar3;
        aVar.mo28530a(aVar3);
        this.f325043c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325043c;
    }
}
