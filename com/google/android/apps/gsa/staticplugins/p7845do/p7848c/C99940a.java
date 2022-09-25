package com.google.android.apps.gsa.staticplugins.p7845do.p7848c;

import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99938d;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99939e;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.c.a */
/* compiled from: PG */
public final class C99940a implements C99939e, C23252b {

    /* renamed from: a */
    public final C23251a f279574a;

    /* renamed from: b */
    public final C23251a f279575b;

    /* renamed from: c */
    public final C23251a f279576c;

    /* renamed from: d */
    public final C23251a f279577d;

    /* renamed from: e */
    private final C23251a f279578e;

    /* renamed from: f */
    private final C23251a f279579f;

    /* renamed from: g */
    private final List f279580g;

    public C99940a(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "canGoBack", new C23256a(), false, true, false);
        this.f279578e = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "error", new C23268m(new C23259d(C99938d.values())), false, true, false);
        this.f279574a = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "isProgressBarVisible", new C23256a(), false, true, false);
        this.f279575b = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "progress", new C23265j(), false, true, false);
        this.f279576c = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "url", new C23272q(), false, true, false);
        this.f279579f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar2, "webViewContainer", new C23268m(new C23269n()), false, true, false);
        this.f279577d = aVar7;
        aVar.mo28530a(aVar7);
        this.f279580g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279580g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91660b() {
        return this.f279578e;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91661c() {
        return this.f279574a;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91662d() {
        return this.f279575b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91663e() {
        return this.f279576c;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91664f() {
        return this.f279579f;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91665g() {
        return this.f279577d;
    }

    /* renamed from: h */
    public final C23251a mo91666h() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }

    /* renamed from: i */
    public final C23251a mo91667i() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
