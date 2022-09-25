package com.google.android.apps.gsa.staticplugins.p7867dv.p7869b;

import com.google.android.apps.gsa.shared.p6990an.C89215f;
import com.google.android.apps.gsa.shared.p6990an.C89227r;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7870c.C100235d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.b.a */
/* compiled from: PG */
public final class C100205a implements C100235d, C23252b {

    /* renamed from: a */
    private final C23251a f280231a;

    /* renamed from: b */
    private final C23251a f280232b;

    /* renamed from: c */
    private final C23251a f280233c;

    /* renamed from: d */
    private final C23251a f280234d;

    /* renamed from: e */
    private final C23251a f280235e;

    /* renamed from: f */
    private final List f280236f;

    public C100205a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "bootstrappingResponse", new C23268m(new C23269n()), true, false, false);
        this.f280231a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "genericSuggestCallbackEventData", new C23257b(), true, false, false);
        this.f280232b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "response", new C23268m(new C23271p(C41658m.f108892i.getParserForType(), C62921ba.m95368a(), C41658m.f108892i)), true, false, false);
        this.f280233c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar, "searchboxSuggestConfig", new C23268m(new C23271p(C89215f.f241841af.getParserForType(), C62921ba.m95368a(), C89215f.f241841af)), true, false, false);
        this.f280234d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar, "suggestInitConfig", new C23268m(new C23271p(C89227r.f241923I.getParserForType(), C62921ba.m95368a(), C89227r.f241923I)), true, false, false);
        this.f280235e = aVar6;
        aVar.mo28530a(aVar6);
        this.f280236f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280236f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91803b() {
        return this.f280231a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91804c() {
        return this.f280232b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91805d() {
        return this.f280233c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91806e() {
        return this.f280234d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91807f() {
        return this.f280235e;
    }
}
