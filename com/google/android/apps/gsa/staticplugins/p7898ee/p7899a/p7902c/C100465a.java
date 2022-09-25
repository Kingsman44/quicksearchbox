package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7902c;

import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100463d;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100464e;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.c.a */
/* compiled from: PG */
public final class C100465a implements C100464e, C23252b {

    /* renamed from: a */
    public final C23251a f280853a;

    /* renamed from: b */
    public final C23251a f280854b;

    /* renamed from: c */
    private final List f280855c;

    public C100465a(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "error", new C23268m(new C23259d(C100463d.values())), false, true, false);
        this.f280853a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "webViewContainer", new C23268m(new C23269n()), false, true, false);
        this.f280854b = aVar3;
        aVar.mo28530a(aVar3);
        this.f280855c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280855c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91914b() {
        return this.f280853a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91915c() {
        return this.f280854b;
    }

    /* renamed from: d */
    public final C23251a mo91916d() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: e */
    public final C23251a mo91917e() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: f */
    public final C23251a mo91918f() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
