package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105455y;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ek */
/* compiled from: PG */
public final class C105591ek implements C105455y, C23252b {

    /* renamed from: a */
    public final C23251a f294622a;

    /* renamed from: b */
    public final C23251a f294623b;

    /* renamed from: c */
    public final C23251a f294624c;

    /* renamed from: d */
    public final C23251a f294625d;

    /* renamed from: e */
    private final List f294626e;

    public C105591ek(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "negativeLabel", new C23272q(), false, true, false);
        this.f294622a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "positiveLabel", new C23272q(), false, true, false);
        this.f294623b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "questionText", new C23272q(), false, true, false);
        this.f294624c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "useDarkTheme", new C23256a(), false, true, false);
        this.f294625d = aVar5;
        aVar.mo28530a(aVar5);
        this.f294626e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294626e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94646b() {
        return this.f294622a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94647c() {
        return this.f294623b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94648d() {
        return this.f294624c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94649e() {
        return this.f294625d;
    }

    /* renamed from: f */
    public final C23251a mo94650f() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: g */
    public final C23251a mo94651g() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
