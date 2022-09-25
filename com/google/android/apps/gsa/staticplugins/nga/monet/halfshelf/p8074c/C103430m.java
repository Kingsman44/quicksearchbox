package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103412a;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.m */
/* compiled from: PG */
public final class C103430m implements C103412a, C23252b {

    /* renamed from: a */
    public final C23251a f288283a;

    /* renamed from: b */
    public final C23251a f288284b;

    /* renamed from: c */
    private final List f288285c;

    public C103430m(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "imageUrl", new C23272q(), false, true, false);
        this.f288283a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "title", new C23272q(), false, true, false);
        this.f288284b = aVar3;
        aVar.mo28530a(aVar3);
        this.f288285c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f288285c;
    }
}
