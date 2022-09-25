package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105771i;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.c */
/* compiled from: PG */
public final class C105690c implements C105771i, C23252b {

    /* renamed from: a */
    public final C23251a f294917a;

    /* renamed from: b */
    private final List f294918b;

    public C105690c(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "height", new C23265j(), true, false, false);
        this.f294917a = aVar2;
        aVar.mo28530a(aVar2);
        this.f294918b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294918b;
    }
}
