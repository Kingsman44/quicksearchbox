package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105772j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.d */
/* compiled from: PG */
public final class C105691d implements C105772j, C23252b {

    /* renamed from: a */
    public final C23251a f294919a;

    /* renamed from: b */
    public final C23251a f294920b;

    /* renamed from: c */
    private final List f294921c;

    public C105691d(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "shouldAnnounceError", new C23256a(), true, false, false);
        this.f294919a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "spinnerShowing", new C23256a(), true, false, false);
        this.f294920b = aVar3;
        aVar.mo28530a(aVar3);
        this.f294921c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294921c;
    }
}
