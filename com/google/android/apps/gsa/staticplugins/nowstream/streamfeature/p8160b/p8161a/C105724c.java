package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105772j;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.c */
/* compiled from: PG */
public final class C105724c implements C105772j, C23252b {

    /* renamed from: a */
    public final C23251a f295051a;

    /* renamed from: b */
    public final C23251a f295052b;

    /* renamed from: c */
    private final List f295053c;

    public C105724c(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "shouldAnnounceError", new C23256a(), false, true, false);
        this.f295051a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "spinnerShowing", new C23256a(), false, true, false);
        this.f295052b = aVar3;
        aVar.mo28530a(aVar3);
        this.f295053c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f295053c;
    }
}
