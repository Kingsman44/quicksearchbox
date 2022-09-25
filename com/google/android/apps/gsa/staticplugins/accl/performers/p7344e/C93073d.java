package com.google.android.apps.gsa.staticplugins.accl.performers.p7344e;

import com.google.android.apps.gsa.n.f.an;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.geller.C21756b;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3923b.C51702c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.e.d */
/* compiled from: PG */
public final class C93073d extends C22538o {

    /* renamed from: a */
    static final long f259618a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public static final C59071e f259619b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.e.d");

    /* renamed from: c */
    public final an f259620c;

    /* renamed from: d */
    private final C22871g f259621d;

    public C93073d(C22871g gVar, an anVar) {
        this.f259621d = gVar;
        this.f259620c = anVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("geller.UPDATE_ON_DEVICE_STORE")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51702c cVar = (C51702c) m41992m(dwVar, "update_on_device_store_args", C51702c.f135629e.getParserForType());
            C58976aa aaVar = C58975e.f156826a;
            String str = (cVar.f135631a & 2) != 0 ? cVar.f135633d : null;
            for (C65753ak ordinal : new C62963cj(cVar.f135632b, C51702c.f135628c)) {
                C65753ak akVar = C65753ak.UNKNOWN;
                if (ordinal.ordinal() != 111) {
                    C59104x c = f259619b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GellerUpdateStoreCO");
                    ((C59052c) ((C59052c) c).mo56372aa(13293)).mo56386p("Unsupported Corpus for ClientOp updates.");
                } else {
                    C90875ai.m148465b(new C93071b(), this.f259621d.mo28203c("PKG_ENTITIES background runner", f259618a, new C93070a(this, C21756b.PKG_ENTITIES, str)), this.f259621d, "PKG_ENTITIES background runner").mo85223a(new C93072c());
                }
            }
            return f62144n;
        }
        throw new C22428d(dyVar);
    }
}
