package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91805l;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105434d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.z */
/* compiled from: PG */
public final class C105309z implements C105435e, C23252b {

    /* renamed from: a */
    public final C23186f f293826a;

    /* renamed from: b */
    public final C23251a f293827b;

    /* renamed from: c */
    public final C23251a f293828c;

    /* renamed from: d */
    public final C23251a f293829d;

    /* renamed from: e */
    public final C23186f f293830e;

    /* renamed from: f */
    public final C23186f f293831f;

    /* renamed from: g */
    public final C23251a f293832g;

    /* renamed from: h */
    private final List f293833h;

    public C105309z(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f293826a = new C23186f("bottomSheetChild", cVar, true);
        C23251a aVar2 = new C23251a(cVar, "doodleStatusBarIconColor", new C23268m(new C23259d(C105434d.values())), true, false, false);
        this.f293827b = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "initProto", new C23271p(C91805l.f256031h.getParserForType(), C62921ba.m95368a(), C91805l.f256031h), true, false, false);
        this.f293828c = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "isDarkModeEnabled", new C23256a(), true, false, false);
        this.f293829d = aVar4;
        aVar.mo28530a(aVar4);
        this.f293830e = new C23186f("nowFeedChild", cVar, false);
        this.f293831f = new C23186f("promotionsChild", cVar, true);
        C23251a aVar5 = new C23251a(cVar, "tabActive", new C23256a(), true, false, false);
        this.f293832g = aVar5;
        aVar.mo28530a(aVar5);
        this.f293833h = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293833h;
    }
}
