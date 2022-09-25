package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99597d;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99609d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.a */
/* compiled from: PG */
public final class C99610a implements C99609d, C23252b {

    /* renamed from: a */
    public final C23251a f278753a;

    /* renamed from: b */
    public final C23251a f278754b;

    /* renamed from: c */
    private final List f278755c;

    public C99610a(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "query", new C23272q(), false, true, false);
        this.f278753a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar, "searchResults", new C23271p(C99597d.f278723b.getParserForType(), C62921ba.m95368a(), C99597d.f278723b), false, true, false);
        this.f278754b = aVar3;
        aVar.mo28530a(aVar3);
        this.f278755c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f278755c;
    }
}
