package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import android.util.Pair;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87834fh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87835fi;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94799t;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94800u;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3899b.p3901b.C50877d;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.f */
/* compiled from: PG */
public final class C94658f extends C22538o {

    /* renamed from: b */
    private static final C59071e f264744b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.a.f");

    /* renamed from: a */
    public final C94785f f264745a;

    /* renamed from: c */
    private final C22871g f264746c;

    /* renamed from: d */
    private final C94800u f264747d;

    /* renamed from: e */
    private final C90021c f264748e;

    public C94658f(C94785f fVar, C22871g gVar, C94800u uVar, C90021c cVar) {
        this.f264745a = fVar;
        this.f264746c = gVar;
        this.f264747d = uVar;
        this.f264748e = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        if (str.equals("gacs_accessory.EXECUTE")) {
            C59104x b = f264744b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsExecutePerf");
            ((C59052c) ((C59052c) b).mo56372aa(16823)).mo56389s("Received: %s", str);
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C50877d dVar = (C50877d) m41992m(dwVar, "gacs_execute_args", C50877d.f132472c.getParserForType());
                C87834fh fhVar = (C87834fh) C87835fi.f237649d.createBuilder();
                fhVar.copyOnWrite();
                C87835fi fiVar = (C87835fi) fhVar.instance;
                dVar.getClass();
                fiVar.f237652b = dVar;
                fiVar.f237651a |= 1;
                C87835fi fiVar2 = (C87835fi) fhVar.build();
                if (this.f264748e.mo79746e(C90122ft.f250869h)) {
                    C94800u uVar = this.f264747d;
                    Pair a = C94800u.m156368a(dyVar);
                    C87834fh fhVar2 = (C87834fh) fiVar2.toBuilder();
                    String str2 = (String) a.first;
                    fhVar2.copyOnWrite();
                    C87835fi fiVar3 = (C87835fi) fhVar2.instance;
                    str2.getClass();
                    fiVar3.f237651a |= 2;
                    fiVar3.f237653c = str2;
                    uVar.f265093d.mo28212l("gacs", new C94799t(uVar, (C87835fi) fhVar2.build()));
                    C59104x b2 = C94800u.f265090a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "GacsClientOpDispatcher");
                    ((C59052c) ((C59052c) b2).mo56372aa(16814)).mo56389s("Dispatched OP_GACS_EXECUTE ClientOp: (%s)", a.first);
                    return (C60870cx) a.second;
                }
                this.f264746c.mo28212l("gacs", new C94657e(this, fiVar2));
                return C22538o.f62144n;
            } catch (C22371a e) {
                C59104x c = f264744b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGacsExecutePerf");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(16824)).mo56386p("Could not find gacs execute argument");
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
