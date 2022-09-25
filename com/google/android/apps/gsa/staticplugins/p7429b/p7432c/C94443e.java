package com.google.android.apps.gsa.staticplugins.p7429b.p7432c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7083b.C90219d;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94438d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23174k;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.b.c.e */
/* compiled from: PG */
public final class C94443e implements C94438d, C23252b {

    /* renamed from: a */
    public final C23174k f264034a;

    /* renamed from: b */
    public final C23251a f264035b;

    /* renamed from: c */
    public final C23251a f264036c;

    /* renamed from: d */
    public final C23251a f264037d;

    /* renamed from: e */
    private final List f264038e;

    public C94443e(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f264034a = new C23174k("activityPages", jVar);
        C23251a aVar2 = new C23251a(jVar, "backgroundColor", new C23265j(), false, true, false);
        this.f264035b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "defaultPageAnimationData", new C23268m(new C23271p(C90219d.f252039h.getParserForType(), C62921ba.m95368a(), C90219d.f252039h)), false, true, false);
        this.f264036c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "initialPageAnimationData", new C23268m(new C23271p(C90219d.f252039h.getParserForType(), C62921ba.m95368a(), C90219d.f252039h)), false, true, false);
        this.f264037d = aVar4;
        aVar.mo28530a(aVar4);
        this.f264038e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f264038e;
    }
}
