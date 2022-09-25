package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97356h;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.am */
/* compiled from: PG */
public final class C97370am implements C97356h, C23252b {

    /* renamed from: a */
    public final C23251a f271941a;

    /* renamed from: b */
    public final C23251a f271942b;

    /* renamed from: c */
    private final List f271943c;

    public C97370am(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "anchorViewBounds", new C23268m(new C23269n()), false, true, false);
        this.f271941a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "text", new C23272q(), false, true, false);
        this.f271942b = aVar3;
        aVar.mo28530a(aVar3);
        this.f271943c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f271943c;
    }
}
