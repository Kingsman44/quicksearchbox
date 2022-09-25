package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.telecom.TelecomManager;
import com.google.android.apps.gsa.opa.p6435c.C83602n;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22412b;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3745ab.C48273ca;
import com.google.assistant.p3745ab.C48276cd;
import com.google.assistant.p3745ab.C48277ce;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.j */
/* compiled from: PG */
public final class C93038j extends C22538o {

    /* renamed from: a */
    public static final C59071e f259526a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.j");

    /* renamed from: b */
    final CallExecutor f259527b;

    /* renamed from: c */
    public C22434e f259528c;

    /* renamed from: d */
    public final List f259529d;

    /* renamed from: e */
    private final C86124t f259530e;

    public C93038j(Context context, C22871g gVar, C22695ah ahVar, C68214a aVar, C90851k kVar, C22412b bVar, C86124t tVar, C68214a aVar2, int i, Optional optional, C89143o oVar) {
        C86124t tVar2 = tVar;
        this.f259530e = tVar2;
        this.f259529d = C83602n.m133182b(tVar);
        Context context2 = context;
        C22695ah ahVar2 = ahVar;
        C68214a aVar3 = aVar;
        CallExecutor callExecutor = r8;
        CallExecutor callExecutor2 = new CallExecutor(context2, ahVar2, aVar3, kVar.mo85208a("CallPerformer"), (TelecomManager) C39239a.m68666a(context2, C39226b.TAG_CLASSIC_ASSISTANT).getSystemService("telecom"), bVar, new C93034f(this, tVar2, gVar, aVar2, i, optional), oVar, m153107c(this.f259528c));
        this.f259527b = callExecutor;
    }

    /* renamed from: b */
    public static void m153106b(C22871g gVar, C68214a aVar, C89849ae aeVar, C48273ca caVar, C22434e eVar, int i) {
        C48276cd cdVar = (C48276cd) C48277ce.f124864e.createBuilder();
        if (eVar != null) {
            C22407c cVar = (C22407c) eVar;
            if (cVar.f61901c.mo56113h()) {
                String str = (String) cVar.f61901c.mo56107c();
                cdVar.copyOnWrite();
                C48277ce ceVar = (C48277ce) cdVar.instance;
                str.getClass();
                ceVar.f124866a |= 1;
                ceVar.f124867b = str;
            }
        }
        if (caVar != null) {
            cdVar.copyOnWrite();
            C48277ce ceVar2 = (C48277ce) cdVar.instance;
            ceVar2.f124868c = caVar;
            ceVar2.f124866a |= 2;
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C48277ce ceVar3 = (C48277ce) cdVar.build();
        ceVar3.getClass();
        cbVar.f160046K = ceVar3;
        cbVar.f160115b |= 1024;
        Optional c = m153107c(eVar);
        Objects.requireNonNull(ajVar);
        c.ifPresent(new C93035g(ajVar));
        C59687cb cbVar2 = (C59687cb) ajVar.build();
        if (i <= 0) {
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = cbVar2;
            ((C89859i) aVar.mo27525b()).mo74236a(fVar.mo83699a());
            return;
        }
        gVar.mo28211k(gVar.mo28204d("log call duration event " + aeVar.f245884YW, (long) i, new C93036h(aVar, aeVar, cbVar2)), "#Listener.onStatusChange", new C93037i());
    }

    /* renamed from: c */
    private static Optional m153107c(C22434e eVar) {
        if (eVar != null) {
            C22407c cVar = (C22407c) eVar;
            if (cVar.f61902d.mo56113h()) {
                C58833ax axVar = ((C22585l) cVar.f61902d.mo56107c()).f62228b;
                if (axVar.mo56113h()) {
                    return Optional.m71637of(C39191a.m68623b(((C84349ah) axVar.mo56107c()).f229566a.f252749G));
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("call.CALL")) {
            ((C59052c) ((C59052c) f259526a.mo56224b()).mo56372aa(13155)).mo56386p("CallPerformer invoked.");
            this.f259528c = eVar;
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return this.f259527b.mo27607a((C52289mf) m41992m(dwVar, "call_client_op_args", C52289mf.f137258j.getParserForType()), this.f259530e.mo79746e(C90025cd.f248164v), this.f259530e.mo79746e(C90025cd.f248166x));
        }
        throw new C22428d(dyVar);
    }
}
