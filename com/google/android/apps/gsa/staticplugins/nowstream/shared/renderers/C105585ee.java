package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105444n;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23266k;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ee */
/* compiled from: PG */
public final class C105585ee implements C105444n, C23252b {

    /* renamed from: a */
    public final C23251a f294593a;

    /* renamed from: b */
    public final C23251a f294594b;

    /* renamed from: c */
    public final C23251a f294595c;

    /* renamed from: d */
    private final List f294596d;

    public C105585ee(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "isGestaltDarkThemeUi", new C23256a(), false, true, false);
        this.f294593a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "isGestaltNoHeaders", new C23256a(), false, true, false);
        this.f294594b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "lastChangeTimeMillis", new C23266k(), false, true, false);
        this.f294595c = aVar4;
        aVar.mo28530a(aVar4);
        this.f294596d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294596d;
    }
}
