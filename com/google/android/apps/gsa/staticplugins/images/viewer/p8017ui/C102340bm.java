package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102295h;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23198ac;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23253c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bm */
/* compiled from: PG */
public final class C102340bm implements C102295h, C23252b {

    /* renamed from: a */
    private final C23251a f285612a;

    /* renamed from: b */
    private final C23198ac f285613b;

    /* renamed from: c */
    private final C23251a f285614c;

    /* renamed from: d */
    private final List f285615d;

    public C102340bm(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "args", new C23271p(C64631b.f175197n.getParserForType(), C62921ba.m95368a(), C64631b.f175197n), false, true, false);
        this.f285612a = aVar2;
        aVar.mo28530a(aVar2);
        this.f285613b = new C23198ac("imagePages", jVar);
        C23251a aVar3 = new C23251a(jVar, "index", new C23265j(), false, true, false);
        this.f285614c = aVar3;
        aVar.mo28530a(aVar3);
        this.f285615d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285615d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo93045b() {
        return this.f285612a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo93046c() {
        return this.f285614c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23253c mo93047d() {
        return this.f285613b;
    }
}
