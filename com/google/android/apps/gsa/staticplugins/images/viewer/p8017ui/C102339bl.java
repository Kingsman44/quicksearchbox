package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102291d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bl */
/* compiled from: PG */
public final class C102339bl implements C102291d, C23252b {

    /* renamed from: a */
    public final C23251a f285608a;

    /* renamed from: b */
    public final C23251a f285609b;

    /* renamed from: c */
    public final C23251a f285610c;

    /* renamed from: d */
    private final List f285611d;

    public C102339bl(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "pageArgs", new C23271p(C64629b.f175186i.getParserForType(), C62921ba.m95368a(), C64629b.f175186i), false, true, false);
        this.f285608a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "relatedContentFailedToLoad", new C23256a(), false, true, false);
        this.f285609b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "relatedImagesResponse", new C23271p(C65949b.f179368e.getParserForType(), C62921ba.m95368a(), C65949b.f179368e), false, true, false);
        this.f285610c = aVar4;
        aVar.mo28530a(aVar4);
        this.f285611d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285611d;
    }
}
