package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13533i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.C13469a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13518d;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13519e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13514g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62963cj;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.k */
/* compiled from: PG */
public final class C13496k implements C13533i {

    /* renamed from: a */
    public static final C59071e f41395a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.c.k");

    /* renamed from: b */
    public final Executor f41396b;

    /* renamed from: c */
    public final C15481g f41397c;

    /* renamed from: d */
    public final C69464a f41398d;

    /* renamed from: e */
    public final C69464a f41399e;

    /* renamed from: f */
    public final C69464a f41400f;

    /* renamed from: g */
    private final C13469a f41401g;

    /* renamed from: h */
    private final C16850a f41402h;

    /* renamed from: i */
    private final C13514g f41403i;

    /* renamed from: j */
    private final C69464a f41404j;

    public C13496k(C13469a aVar, C16850a aVar2, C13514g gVar, Executor executor, C15481g gVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f41401g = aVar;
        this.f41402h = aVar2;
        this.f41403i = gVar;
        this.f41396b = executor;
        this.f41397c = gVar2;
        this.f41404j = aVar3;
        this.f41398d = aVar4;
        this.f41399e = aVar5;
        this.f41400f = aVar6;
    }

    /* renamed from: b */
    public static C13495j m29755b(C15481g gVar, int i) {
        C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
        tVar.copyOnWrite();
        ((C13546v) tVar.instance).f41511b = C13545u.m29826a(i);
        C13546v vVar = (C13546v) tVar.build();
        gVar.mo22352b(C13519e.m29803a(3, vVar));
        C13494i e = C13495j.m29750e();
        C13462a aVar = (C13462a) e;
        aVar.f41314a = C58833ax.m90834k(vVar);
        aVar.f41317d = i;
        C58836b bVar = C58836b.f156633a;
        aVar.f41315b = bVar;
        aVar.f41316c = bVar;
        return e.mo21100a();
    }

    /* renamed from: a */
    public final C60870cx mo21092a(C13543s sVar) {
        C59071e eVar = f41395a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
        ((C59052c) ((C59052c) b).mo56372aa(44822)).mo56386p("#generate");
        if (!new C62963cj(sVar.f41506g, C13543s.f41499h).contains(C13461c.TC_LIB)) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
            ((C59052c) ((C59052c) d).mo56372aa(44823)).mo56386p("TcLibSmartActionGenerator is disabled.");
            C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
            tVar.copyOnWrite();
            ((C13546v) tVar.instance).f41511b = C13545u.m29826a(7);
            C13546v vVar = (C13546v) tVar.build();
            this.f41397c.mo22352b(C13519e.m29803a(3, vVar));
            return C60856cj.m92900i(vVar);
        }
        C60870cx a = C13518d.m29802a(this.f41402h, this.f41396b);
        C60870cx a2 = this.f41401g.mo21111a();
        C60870cx a3 = C47638k.m84751b(a, a2).mo51520a(new C13489d(this, a2, sVar, a), this.f41396b);
        C13492g gVar = new C13492g(this, sVar);
        C60870cx h = C60922j.m93045h(a3, C47810es.m84966f(gVar), this.f41396b);
        C60870cx i = C60856cj.m92900i(C13512e.m29782l().mo21131a());
        if (new C62963cj(sVar.f41503b, C13543s.f41497c).contains(C13529e.SHARE_LOCATION) || new C62963cj(sVar.f41503b, C13543s.f41497c).contains(C13529e.SHARE_ETA) || ((Boolean) this.f41404j.mo17428b()).booleanValue()) {
            i = this.f41403i.mo21138a();
        }
        C13493h hVar = new C13493h(this, sVar, i);
        return C60922j.m93045h(h, C47810es.m84966f(hVar), this.f41396b);
    }
}
