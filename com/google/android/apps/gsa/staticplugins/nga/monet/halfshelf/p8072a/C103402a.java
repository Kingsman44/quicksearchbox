package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8072a;

import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103412a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.a.a */
/* compiled from: PG */
public final class C103402a implements C103412a, C23252b {

    /* renamed from: a */
    public final C23251a f288247a;

    /* renamed from: b */
    public final C23251a f288248b;

    /* renamed from: c */
    private final List f288249c;

    public C103402a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "imageUrl", new C23272q(), true, false, false);
        this.f288247a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "title", new C23272q(), true, false, false);
        this.f288248b = aVar3;
        aVar.mo28530a(aVar3);
        this.f288249c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f288249c;
    }
}
