package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102299l;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.android.libraries.gsa.p1880l.C22884l;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bn */
/* compiled from: PG */
public final class C102341bn implements C102299l, C23252b {

    /* renamed from: a */
    public final C23251a f285616a;

    /* renamed from: b */
    public final C23251a f285617b;

    /* renamed from: c */
    public final C23251a f285618c;

    /* renamed from: d */
    public final C23251a f285619d;

    /* renamed from: e */
    public final C23251a f285620e;

    /* renamed from: f */
    public final C23219p f285621f;

    /* renamed from: g */
    public final C23251a f285622g;

    /* renamed from: h */
    public final C23219p f285623h;

    /* renamed from: i */
    private final List f285624i;

    public C102341bn(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "accountName", new C23272q(), false, true, false);
        this.f285616a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "initialArgs", new C23271p(C64631b.f175197n.getParserForType(), C62921ba.m95368a(), C64631b.f175197n), false, true, false);
        this.f285617b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "initialized", new C23256a(), false, true, false);
        this.f285618c = aVar4;
        aVar.mo28530a(aVar4);
        C22945j jVar3 = jVar;
        C23251a aVar5 = new C23251a(jVar3, "saveResponse", new C23271p(C22884l.f62985g.getParserForType(), C62921ba.m95368a(), C22884l.f62985g), false, true, false);
        this.f285619d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "viewerKillSignal", new C23256a(), false, true, false);
        this.f285620e = aVar6;
        aVar.mo28530a(aVar6);
        this.f285621f = new C23219p("viewerOne", jVar, false);
        C23251a aVar7 = new C23251a(jVar, "viewerOneIsFront", new C23256a(), false, true, false);
        this.f285622g = aVar7;
        aVar.mo28530a(aVar7);
        this.f285623h = new C23219p("viewerTwo", jVar, false);
        this.f285624i = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285624i;
    }
}
