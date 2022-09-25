package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105455y;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.p375ai.p378b.C7684gc;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ao */
/* compiled from: PG */
public final class C105193ao implements C105455y, C23252b {

    /* renamed from: a */
    private final C23251a f293382a;

    /* renamed from: b */
    private final C23251a f293383b;

    /* renamed from: c */
    private final C23251a f293384c;

    /* renamed from: d */
    private final C23251a f293385d;

    /* renamed from: e */
    private final C23251a f293386e;

    /* renamed from: f */
    private final C23251a f293387f;

    /* renamed from: g */
    private final List f293388g;

    public C105193ao(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "negativeLabel", new C23272q(), true, false, false);
        this.f293382a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "nowClearcutAppData", new C23271p(C57057b.f152311e.getParserForType(), C62921ba.m95368a(), C57057b.f152311e), true, false, false);
        this.f293383b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "positiveLabel", new C23272q(), true, false, false);
        this.f293384c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "questionText", new C23272q(), true, false, false);
        this.f293385d = aVar5;
        aVar.mo28530a(aVar5);
        C23052c cVar3 = cVar;
        C23251a aVar6 = new C23251a(cVar3, "smileScaleSurveyProto", new C23271p(C7684gc.f26842l.getParserForType(), C62921ba.m95368a(), C7684gc.f26842l), true, false, false);
        this.f293386e = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar3, "useDarkTheme", new C23256a(), true, false, false);
        this.f293387f = aVar7;
        aVar.mo28530a(aVar7);
        this.f293388g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293388g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94646b() {
        return this.f293382a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94647c() {
        return this.f293384c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94648d() {
        return this.f293385d;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94649e() {
        return this.f293387f;
    }

    /* renamed from: f */
    public final /* synthetic */ C23251a mo94650f() {
        return this.f293383b;
    }

    /* renamed from: g */
    public final /* synthetic */ C23251a mo94651g() {
        return this.f293386e;
    }
}
