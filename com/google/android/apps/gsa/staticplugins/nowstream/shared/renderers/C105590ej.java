package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105454x;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ej */
/* compiled from: PG */
public final class C105590ej implements C105454x, C23252b {

    /* renamed from: a */
    public final C23251a f294619a;

    /* renamed from: b */
    public final C23251a f294620b;

    /* renamed from: c */
    private final List f294621c;

    public C105590ej(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "isGestaltDarkThemeUi", new C23256a(), false, true, false);
        this.f294619a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "isGestaltNoHeaders", new C23256a(), false, true, false);
        this.f294620b = aVar3;
        aVar.mo28530a(aVar3);
        this.f294621c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294621c;
    }
}
