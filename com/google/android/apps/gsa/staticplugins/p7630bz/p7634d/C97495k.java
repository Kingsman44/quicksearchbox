package com.google.android.apps.gsa.staticplugins.p7630bz.p7634d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97482d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.d.k */
/* compiled from: PG */
public final class C97495k implements C97482d, C23252b {

    /* renamed from: a */
    public final C23251a f272290a;

    /* renamed from: b */
    public final C23251a f272291b;

    /* renamed from: c */
    public final C23251a f272292c;

    /* renamed from: d */
    private final List f272293d;

    public C97495k(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "elementsOutput", new C23271p(C57784p.f154382f.getParserForType(), C62921ba.m95368a(), C57784p.f154382f), false, true, false);
        this.f272290a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "parentGraftCgi", new C23271p(C60214n.f162914g.getParserForType(), C62921ba.m95368a(), C60214n.f162914g), false, true, false);
        this.f272291b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "postFirstDrawEvent", new C23268m(new C23259d(C89849ae.values())), false, true, false);
        this.f272292c = aVar4;
        aVar.mo28530a(aVar4);
        this.f272293d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f272293d;
    }
}
