package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105446p;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ef */
/* compiled from: PG */
public final class C105586ef implements C105446p, C23252b {

    /* renamed from: a */
    public final C23251a f294597a;

    /* renamed from: b */
    public final C23251a f294598b;

    /* renamed from: c */
    public final C23251a f294599c;

    /* renamed from: d */
    public final C23251a f294600d;

    /* renamed from: e */
    private final List f294601e;

    public C105586ef(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "bottomShowsThroughNavBar", new C23256a(), false, true, false);
        this.f294597a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "footerHeader", new C23272q(), false, true, false);
        this.f294598b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "footerLink", new C23272q(), false, true, false);
        this.f294599c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "hasBottomSpacer", new C23256a(), false, true, false);
        this.f294600d = aVar5;
        aVar.mo28530a(aVar5);
        this.f294601e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294601e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94638b() {
        return this.f294597a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94639c() {
        return this.f294598b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94640d() {
        return this.f294599c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94641e() {
        return this.f294600d;
    }
}
