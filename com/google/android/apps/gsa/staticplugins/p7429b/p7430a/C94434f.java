package com.google.android.apps.gsa.staticplugins.p7429b.p7430a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7083b.C90219d;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94438d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23160l;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.b.a.f */
/* compiled from: PG */
public final class C94434f implements C94438d, C23252b {

    /* renamed from: a */
    public final C23160l f264020a;

    /* renamed from: b */
    public final C23251a f264021b;

    /* renamed from: c */
    public final C23251a f264022c;

    /* renamed from: d */
    public final C23251a f264023d;

    /* renamed from: e */
    private final List f264024e;

    public C94434f(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f264020a = new C23160l("activityPages", cVar);
        C23251a aVar2 = new C23251a(cVar, "backgroundColor", new C23265j(), true, false, false);
        this.f264021b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "defaultPageAnimationData", new C23268m(new C23271p(C90219d.f252039h.getParserForType(), C62921ba.m95368a(), C90219d.f252039h)), true, false, false);
        this.f264022c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "initialPageAnimationData", new C23268m(new C23271p(C90219d.f252039h.getParserForType(), C62921ba.m95368a(), C90219d.f252039h)), true, false, false);
        this.f264023d = aVar4;
        aVar.mo28530a(aVar4);
        this.f264024e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f264024e;
    }
}
