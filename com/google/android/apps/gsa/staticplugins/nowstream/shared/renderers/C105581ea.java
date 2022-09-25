package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105440j;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ea */
/* compiled from: PG */
public final class C105581ea implements C105440j, C23252b {

    /* renamed from: a */
    private final C23251a f294568a;

    /* renamed from: b */
    private final C23251a f294569b;

    /* renamed from: c */
    private final C23251a f294570c;

    /* renamed from: d */
    private final List f294571d;

    public C105581ea(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "isBackgroundDark", new C23256a(), false, true, false);
        this.f294568a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "newContentButtonText", new C23272q(), false, true, false);
        this.f294569b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "surfaceType", new C23268m(new C23259d(C90229e.values())), false, true, false);
        this.f294570c = aVar4;
        aVar.mo28530a(aVar4);
        this.f294571d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294571d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94603b() {
        return this.f294568a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94604c() {
        return this.f294569b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94605d() {
        return this.f294570c;
    }
}
