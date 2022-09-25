package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105453w;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.am */
/* compiled from: PG */
public final class C105191am implements C105453w, C23252b {

    /* renamed from: a */
    public final C23251a f293377a;

    /* renamed from: b */
    private final List f293378b;

    public C105191am(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "displayScrim", new C23256a(), true, false, false);
        this.f293377a = aVar2;
        aVar.mo28530a(aVar2);
        this.f293378b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293378b;
    }
}
