package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100463d;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100464e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.a */
/* compiled from: PG */
public final class C100433a implements C100464e, C23252b {

    /* renamed from: a */
    private final C23251a f280770a;

    /* renamed from: b */
    private final C23251a f280771b;

    /* renamed from: c */
    private final C23251a f280772c;

    /* renamed from: d */
    private final C23251a f280773d;

    /* renamed from: e */
    private final C23251a f280774e;

    /* renamed from: f */
    private final List f280775f;

    public C100433a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "canGoBack", new C23256a(), true, false, false);
        this.f280770a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "error", new C23268m(new C23259d(C100463d.values())), true, false, false);
        this.f280771b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "kansasVersionInfoFromWebview", new C23272q(), true, false, false);
        this.f280772c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "webViewContainer", new C23268m(new C23269n()), true, false, false);
        this.f280773d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar2, "webViewUrl", new C23272q(), true, false, false);
        this.f280774e = aVar6;
        aVar.mo28530a(aVar6);
        this.f280775f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280775f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91914b() {
        return this.f280771b;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91915c() {
        return this.f280773d;
    }

    /* renamed from: d */
    public final /* synthetic */ C23251a mo91916d() {
        return this.f280770a;
    }

    /* renamed from: e */
    public final /* synthetic */ C23251a mo91917e() {
        return this.f280772c;
    }

    /* renamed from: f */
    public final /* synthetic */ C23251a mo91918f() {
        return this.f280774e;
    }
}
