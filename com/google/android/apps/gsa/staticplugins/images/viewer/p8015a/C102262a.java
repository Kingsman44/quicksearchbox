package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102291d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.a */
/* compiled from: PG */
public final class C102262a implements C102291d, C23252b {

    /* renamed from: a */
    public final C23251a f285330a;

    /* renamed from: b */
    public final C23251a f285331b;

    /* renamed from: c */
    public final C23251a f285332c;

    /* renamed from: d */
    private final List f285333d;

    public C102262a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "pageArgs", new C23271p(C64629b.f175186i.getParserForType(), C62921ba.m95368a(), C64629b.f175186i), true, false, false);
        this.f285330a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "relatedContentFailedToLoad", new C23256a(), true, false, false);
        this.f285331b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "relatedImagesResponse", new C23271p(C65949b.f179368e.getParserForType(), C62921ba.m95368a(), C65949b.f179368e), true, false, false);
        this.f285332c = aVar4;
        aVar.mo28530a(aVar4);
        this.f285333d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285333d;
    }
}
