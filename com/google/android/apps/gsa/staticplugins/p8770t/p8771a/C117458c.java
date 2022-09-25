package com.google.android.apps.gsa.staticplugins.p8770t.p8771a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.apps.gsa.staticplugins.p8770t.p8772b.C117459a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.t.a.c */
/* compiled from: PG */
public final class C117458c implements C117459a, C23252b {

    /* renamed from: a */
    private final C23251a f326015a;

    /* renamed from: b */
    private final List f326016b;

    public C117458c(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "tooltipData", new C23271p(C90224d.f252050l.getParserForType(), C62921ba.m95368a(), C90224d.f252050l), true, false, false);
        this.f326015a = aVar2;
        aVar.mo28530a(aVar2);
        this.f326016b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326016b;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo103311b() {
        return this.f326015a;
    }
}
