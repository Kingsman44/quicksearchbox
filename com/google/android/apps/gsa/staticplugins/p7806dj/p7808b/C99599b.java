package com.google.android.apps.gsa.staticplugins.p7806dj.p7808b;

import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99597d;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99609d;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118642e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.b.b */
/* compiled from: PG */
public final class C99599b implements C99609d, C23252b {

    /* renamed from: a */
    public final C23251a f278727a;

    /* renamed from: b */
    public final C23251a f278728b;

    /* renamed from: c */
    public final C23251a f278729c;

    /* renamed from: d */
    private final List f278730d;

    public C99599b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "headerList", new ProtoListUtils(C99598a.f278726a, C118642e.f330984d.getParserForType(), C62921ba.m95368a()), true, false, false);
        this.f278727a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "query", new C23272q(), true, false, false);
        this.f278728b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "searchResults", new C23271p(C99597d.f278723b.getParserForType(), C62921ba.m95368a(), C99597d.f278723b), true, false, false);
        this.f278729c = aVar4;
        aVar.mo28530a(aVar4);
        this.f278730d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f278730d;
    }
}
