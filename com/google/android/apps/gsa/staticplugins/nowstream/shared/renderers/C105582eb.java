package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105441k;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.eb */
/* compiled from: PG */
public final class C105582eb implements C105441k, C23252b {

    /* renamed from: a */
    public final C23251a f294572a;

    /* renamed from: b */
    public final C23251a f294573b;

    /* renamed from: c */
    public final C23251a f294574c;

    /* renamed from: d */
    public final C23251a f294575d;

    /* renamed from: e */
    private final List f294576e;

    public C105582eb(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "isGestaltDarkThemeUi", new C23256a(), false, true, false);
        this.f294572a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "isGestaltNoHeaders", new C23256a(), false, true, false);
        this.f294573b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "showCustomize", new C23256a(), false, true, false);
        this.f294574c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "showGreeting", new C23256a(), false, true, false);
        this.f294575d = aVar5;
        aVar.mo28530a(aVar5);
        this.f294576e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294576e;
    }
}
