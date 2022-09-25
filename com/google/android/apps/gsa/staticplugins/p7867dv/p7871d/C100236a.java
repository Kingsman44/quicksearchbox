package com.google.android.apps.gsa.staticplugins.p7867dv.p7871d;

import com.google.android.apps.gsa.shared.p6990an.C89215f;
import com.google.android.apps.gsa.shared.p6990an.C89227r;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7870c.C100235d;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.d.a */
/* compiled from: PG */
public final class C100236a implements C100235d, C23252b {

    /* renamed from: a */
    public final C23251a f280310a;

    /* renamed from: b */
    public final C23251a f280311b;

    /* renamed from: c */
    private final C23251a f280312c;

    /* renamed from: d */
    private final C23251a f280313d;

    /* renamed from: e */
    private final C23251a f280314e;

    /* renamed from: f */
    private final List f280315f;

    public C100236a(C23117m mVar) {
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(mVar, "bootstrappingResponse", new C23268m(new C23269n()), true, false, false);
        this.f280310a = aVar2;
        aVar.mo28530a(aVar2);
        C23117m mVar2 = mVar;
        C23251a aVar3 = new C23251a(mVar2, "genericSuggestCallbackEventData", new C23257b(), true, false, false);
        this.f280312c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(mVar, "response", new C23268m(new C23271p(C41658m.f108892i.getParserForType(), C62921ba.m95368a(), C41658m.f108892i)), true, false, false);
        this.f280313d = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(mVar2, "searchboxSuggestConfig", new C23268m(new C23271p(C89215f.f241841af.getParserForType(), C62921ba.m95368a(), C89215f.f241841af)), true, false, false);
        this.f280314e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(mVar, "suggestInitConfig", new C23268m(new C23271p(C89227r.f241923I.getParserForType(), C62921ba.m95368a(), C89227r.f241923I)), true, false, false);
        this.f280311b = aVar6;
        aVar.mo28530a(aVar6);
        this.f280315f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f280315f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91803b() {
        return this.f280310a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91804c() {
        return this.f280312c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91805d() {
        return this.f280313d;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91806e() {
        return this.f280314e;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91807f() {
        return this.f280311b;
    }
}
