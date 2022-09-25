package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105144e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.b */
/* compiled from: PG */
public final class C105095b implements C105144e, C23252b {

    /* renamed from: a */
    private final C23251a f292982a;

    /* renamed from: b */
    private final C23251a f292983b;

    /* renamed from: c */
    private final C23251a f292984c;

    /* renamed from: d */
    private final C23251a f292985d;

    /* renamed from: e */
    private final List f292986e;

    public C105095b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "foregroundEndAction", new C23268m(new C23271p(C7708h.f26894n.getParserForType(), C62921ba.m95368a(), C7708h.f26894n)), true, false, false);
        this.f292982a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar, "foregroundStartAction", new C23268m(new C23271p(C7708h.f26894n.getParserForType(), C62921ba.m95368a(), C7708h.f26894n)), true, false, false);
        this.f292983b = aVar3;
        aVar.mo28530a(aVar3);
        C23052c cVar2 = cVar;
        C23251a aVar4 = new C23251a(cVar2, "interest", new C23271p(C7799kj.f27263h.getParserForType(), C62921ba.m95368a(), C7799kj.f27263h), true, false, false);
        this.f292984c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "isBackgroundDark", new C23256a(), true, false, false);
        this.f292985d = aVar5;
        aVar.mo28530a(aVar5);
        this.f292986e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f292986e;
    }

    /* renamed from: b */
    public final /* synthetic */ C23251a mo94533b() {
        return this.f292982a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23251a mo94534c() {
        return this.f292983b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23251a mo94535d() {
        return this.f292984c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23251a mo94536e() {
        return this.f292985d;
    }
}
