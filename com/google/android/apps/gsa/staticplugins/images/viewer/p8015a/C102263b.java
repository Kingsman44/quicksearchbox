package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102295h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23253c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.b */
/* compiled from: PG */
public final class C102263b implements C102295h, C23252b {

    /* renamed from: a */
    public final C23251a f285334a;

    /* renamed from: b */
    public final C23193m f285335b;

    /* renamed from: c */
    public final C23251a f285336c;

    /* renamed from: d */
    private final List f285337d;

    public C102263b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "args", new C23271p(C64631b.f175197n.getParserForType(), C62921ba.m95368a(), C64631b.f175197n), true, false, false);
        this.f285334a = aVar2;
        aVar.mo28530a(aVar2);
        this.f285335b = new C23193m("imagePages", cVar, true);
        C23251a aVar3 = new C23251a(cVar, "index", new C23265j(), true, false, false);
        this.f285336c = aVar3;
        aVar.mo28530a(aVar3);
        this.f285337d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285337d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo93045b() {
        return this.f285334a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo93046c() {
        return this.f285336c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23253c mo93047d() {
        return this.f285335b;
    }
}
