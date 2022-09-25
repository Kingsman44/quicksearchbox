package com.google.android.apps.gsa.staticplugins.p7796dh.p7797a;

import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99538d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.a.a */
/* compiled from: PG */
public final class C99530a implements C99538d, C23252b {

    /* renamed from: a */
    private final C23251a f278488a;

    /* renamed from: b */
    private final C23251a f278489b;

    /* renamed from: c */
    private final C23251a f278490c;

    /* renamed from: d */
    private final C23251a f278491d;

    /* renamed from: e */
    private final List f278492e;

    public C99530a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "show", new C23256a(), true, false, false);
        this.f278488a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "text", new C23271p(C69455t.f185861c.getParserForType(), C62921ba.m95368a(), C69455t.f185861c), true, false, false);
        this.f278489b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "timeout", new C23265j(), true, false, false);
        this.f278490c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "tipId", new C23265j(), true, false, false);
        this.f278491d = aVar5;
        aVar.mo28530a(aVar5);
        this.f278492e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f278492e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91482b() {
        return this.f278488a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91483c() {
        return this.f278489b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91484d() {
        return this.f278490c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23251a mo91485e() {
        return this.f278491d;
    }
}
