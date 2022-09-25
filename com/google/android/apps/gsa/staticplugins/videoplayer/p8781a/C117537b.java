package com.google.android.apps.gsa.staticplugins.videoplayer.p8781a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90215f;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117553g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.a.b */
/* compiled from: PG */
public final class C117537b implements C117553g, C23252b {

    /* renamed from: a */
    public final C23251a f326254a;

    /* renamed from: b */
    private final List f326255b;

    public C117537b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "videoPlayerInitModel", new C23271p(C90215f.f252021i.getParserForType(), C62921ba.m95368a(), C90215f.f252021i), true, false, false);
        this.f326254a = aVar2;
        aVar.mo28530a(aVar2);
        this.f326255b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f326255b;
    }
}
