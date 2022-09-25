package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65477d;
import java.util.Locale;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.j */
/* compiled from: PG */
public final class C76267j extends C22538o {

    /* renamed from: a */
    public static final C58974d f211284a = C58974d.m91136j();

    /* renamed from: b */
    private final C69464a f211285b;

    /* renamed from: c */
    private final C69464a f211286c;

    /* renamed from: d */
    private final ac f211287d;

    /* renamed from: e */
    private final C79851ai f211288e;

    /* renamed from: f */
    private final C22871g f211289f;

    public C76267j(C69464a aVar, C69464a aVar2, ac acVar, C79851ai aiVar, C22871g gVar) {
        this.f211285b = aVar;
        this.f211286c = aVar2;
        this.f211287d = acVar;
        this.f211288e = aiVar;
        this.f211289f = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C76288a aVar;
        if (dyVar.f135936b.equals("nga.EXECUTE")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C65477d dVar = (C65477d) m41992m(dwVar, "nga_execute_params", C65477d.f177983c.getParserForType());
            C80295aq aqVar = dVar.f177985a;
            if (aqVar == null) {
                aqVar = C80295aq.f220357c;
            }
            C80294ap a = C80294ap.m128115a(aqVar.f220359a);
            if (C80294ap.CLOUD_HANDOVER_OP == a) {
                aVar = (C76288a) this.f211285b.mo17428b();
            } else {
                aVar = (C76288a) ((Map) this.f211286c.mo17428b()).get(a);
            }
            if (aVar == null) {
                ((C58970a) ((C58970a) f211284a.mo56225c()).mo56372aa(3482)).mo56389s("No executors bound for case %s", a);
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, String.format(Locale.US, "No executors bound for case %s", new Object[]{a})));
            }
            C65475b bVar = dVar.f177986b;
            if (bVar == null) {
                bVar = C65475b.f177978d;
            }
            C60870cx a2 = aVar.mo72159a(aqVar, bVar);
            this.f211288e.mo74253d(aVar.mo72160b(), this.f211287d.b(), a2);
            return this.f211289f.mo28205e(this.f211289f.mo28209i(a2, "[NGA] ExecuteNgaPerformer.perform", C76265h.f211282a), "[NGA] ExecuteNgaPerformer.perform", Throwable.class, C76266i.f211283a);
        }
        throw new C22428d(dyVar);
    }
}
