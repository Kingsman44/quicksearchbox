package com.google.android.apps.gsa.staticplugins.p7630bz.p7631a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97482d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.a.a */
/* compiled from: PG */
public final class C97476a implements C97482d, C23252b {

    /* renamed from: a */
    public final C23251a f272178a;

    /* renamed from: b */
    public final C23251a f272179b;

    /* renamed from: c */
    public final C23251a f272180c;

    /* renamed from: d */
    private final List f272181d;

    public C97476a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "elementsOutput", new C23271p(C57784p.f154382f.getParserForType(), C62921ba.m95368a(), C57784p.f154382f), true, false, false);
        this.f272178a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "parentGraftCgi", new C23271p(C60214n.f162914g.getParserForType(), C62921ba.m95368a(), C60214n.f162914g), true, false, false);
        this.f272179b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "postFirstDrawEvent", new C23268m(new C23259d(C89849ae.values())), true, false, false);
        this.f272180c = aVar4;
        aVar.mo28530a(aVar4);
        this.f272181d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f272181d;
    }
}
