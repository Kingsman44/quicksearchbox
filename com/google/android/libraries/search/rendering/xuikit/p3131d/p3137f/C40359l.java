package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64255d;
import com.google.protos.youtube.elements.C66260r;
import java.util.logging.Level;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.l */
/* compiled from: PG */
public final class C40359l extends C21259bb {

    /* renamed from: a */
    private static final C59071e f106007a = C59071e.m91331h();

    /* renamed from: b */
    private final C40364q f106008b;

    public C40359l(C40364q qVar) {
        C69664n.m101061g(qVar, "logMetadataFactory");
        this.f106008b = qVar;
    }

    /* renamed from: a */
    public final void mo25782a(C66260r rVar, String str, C21319z zVar, Throwable th) {
        C69664n.m101061g(rVar, "errorType");
        C69664n.m101061g(str, "message");
        C69664n.m101061g(zVar, "conversionContext");
        C40364q qVar = this.f106008b;
        C69664n.m101061g(rVar, "errorType");
        C64252a aVar = (C64252a) C64253b.f173731g.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C64255d a = C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(rVar, "value");
        C64252a aVar2 = a.f173739a;
        aVar2.copyOnWrite();
        C64253b bVar = (C64253b) aVar2.instance;
        bVar.f173734b = rVar.f180196C;
        bVar.f173733a |= 1;
        C57695ab abVar = (C57695ab) qVar.f106015b.mo56111f();
        if (abVar != null) {
            a.mo59265b(abVar);
        }
        C40354g gVar = (C40354g) qVar.f106016c.mo56111f();
        if (gVar != null) {
            int i = gVar.f105991a;
            C64252a aVar3 = a.f173739a;
            aVar3.copyOnWrite();
            C64253b bVar2 = (C64253b) aVar3.instance;
            bVar2.f173733a |= 4;
            bVar2.f173736d = i;
        }
        C64253b a2 = C40365r.m70032a(a.mo59264a(), zVar);
        C59071e eVar = f106007a;
        int ordinal = rVar.ordinal();
        C59052c cVar = (C59052c) eVar.mo56223a(ordinal != 11 ? ordinal != 12 ? Level.SEVERE : Level.WARNING : Level.INFO).mo56382g(th);
        cVar.mo56378ag(C40364q.f106014a, a2);
        C61301b bVar3 = new C61301b(C61284a.NO_USER_DATA, rVar.name());
        C61284a aVar4 = C61284a.SERVER_KNOWN_USER_DATA;
        C57695ab a3 = C57695ab.m88520a(a2.f173735c);
        if (a3 == null) {
            a3 = C57695ab.CLIENT_ID_UNSPECIFIED;
        }
        C61301b bVar4 = new C61301b(aVar4, Integer.valueOf(a3.f154136O));
        C61301b bVar5 = new C61301b(C61284a.SERVER_KNOWN_USER_DATA, Integer.valueOf(a2.f173736d));
        C61284a aVar5 = C61284a.NON_TEXTUAL_INTERACTION_USER_DATA;
        C61301b bVar6 = new C61301b(aVar5, Integer.valueOf(a2.f173738f));
        C61301b bVar7 = new C61301b(aVar5, a2.f173737e);
        cVar.mo56379ah(new C59094n(53330));
        cVar.mo56362O("[XUiKitFloggerElementsErrorLogger] %s: %s [clientId=%s, featureId=%s, veId=%s, conversionPath=%s]", bVar3, str, bVar4, bVar5, bVar6, bVar7);
    }
}
