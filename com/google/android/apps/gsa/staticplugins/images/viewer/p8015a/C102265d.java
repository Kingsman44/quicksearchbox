package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102299l;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.android.libraries.gsa.p1880l.C22884l;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.d */
/* compiled from: PG */
public final class C102265d implements C102299l, C23252b {

    /* renamed from: a */
    public final C23251a f285339a;

    /* renamed from: b */
    public final C23251a f285340b;

    /* renamed from: c */
    public final C23251a f285341c;

    /* renamed from: d */
    public final C23251a f285342d;

    /* renamed from: e */
    public final C23251a f285343e;

    /* renamed from: f */
    public final C23186f f285344f;

    /* renamed from: g */
    public final C23251a f285345g;

    /* renamed from: h */
    public final C23251a f285346h;

    /* renamed from: i */
    public final C23186f f285347i;

    /* renamed from: j */
    private final List f285348j;

    public C102265d(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "accountName", new C23272q(), true, false, false);
        this.f285339a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "initialArgs", new C23271p(C64631b.f175197n.getParserForType(), C62921ba.m95368a(), C64631b.f175197n), true, false, false);
        this.f285340b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "initialized", new C23256a(), true, false, false);
        this.f285341c = aVar4;
        aVar.mo28530a(aVar4);
        C23052c cVar3 = cVar;
        C23251a aVar5 = new C23251a(cVar3, "saveResponse", new C23271p(C22884l.f62985g.getParserForType(), C62921ba.m95368a(), C22884l.f62985g), true, false, false);
        this.f285342d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar3, "viewerKillSignal", new C23256a(), true, false, false);
        this.f285343e = aVar6;
        aVar.mo28530a(aVar6);
        this.f285344f = new C23186f("viewerOne", cVar, true);
        C23052c cVar4 = cVar;
        C23251a aVar7 = new C23251a(cVar4, "viewerOneIsFront", new C23256a(), true, false, false);
        this.f285345g = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(cVar4, "viewerStack", new ImmutableListUtils(C102264c.f285338a), true, false, false);
        this.f285346h = aVar8;
        aVar.mo28530a(aVar8);
        this.f285347i = new C23186f("viewerTwo", cVar, true);
        this.f285348j = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f285348j;
    }
}
