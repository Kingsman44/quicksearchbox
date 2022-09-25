package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117096h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.m */
/* compiled from: PG */
public final class C117075m implements C117096h, C23252b {

    /* renamed from: a */
    public final C23251a f325050a;

    /* renamed from: b */
    private final List f325051b;

    public C117075m(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "currentBarRadius", new C23265j(), true, false, false);
        this.f325050a = aVar2;
        aVar.mo28530a(aVar2);
        this.f325051b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325051b;
    }
}
