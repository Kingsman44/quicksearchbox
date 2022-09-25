package com.google.android.apps.gsa.staticplugins.p7796dh.p7799c;

import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99538d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.c.a */
/* compiled from: PG */
public final class C99539a implements C99538d, C23252b {

    /* renamed from: a */
    private final C23251a f278509a;

    /* renamed from: b */
    private final C23251a f278510b;

    /* renamed from: c */
    private final C23251a f278511c;

    /* renamed from: d */
    private final List f278512d;

    public C99539a(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "show", new C23256a(), false, true, false);
        this.f278509a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "text", new C23271p(C69455t.f185861c.getParserForType(), C62921ba.m95368a(), C69455t.f185861c), false, true, false);
        this.f278510b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "timeout", new C23265j(), false, true, false);
        this.f278511c = aVar4;
        aVar.mo28530a(aVar4);
        this.f278512d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f278512d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo91482b() {
        return this.f278509a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo91483c() {
        return this.f278510b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo91484d() {
        return this.f278511c;
    }

    /* renamed from: e */
    public final C23251a mo91485e() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
