package com.google.android.libraries.assistant.auto.tng.p945f.p946a.p947a.p948a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13058d;
import com.google.android.libraries.assistant.auto.tng.p945f.p946a.p947a.C13353a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.tng.communication.call.fulfiller.impl.CallRequestFulfillerImpl$handleFulfillment$1", mo61344c = "CallRequestFulfillerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.auto.tng.f.a.a.a.a */
/* compiled from: PG */
final class C13354a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C13355b f41085a;

    /* renamed from: b */
    final /* synthetic */ C13058d f41086b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13354a(C13355b bVar, C13058d dVar, C69577g gVar) {
        super(2, gVar);
        this.f41085a = bVar;
        this.f41086b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C13354a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C13058d dVar = this.f41086b;
        C58976aa aaVar = C58975e.f156826a;
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        epVar.f136691a |= 1;
        epVar.f136694d = 0;
        C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
        C52289mf mfVar = dVar.f40535b;
        if (mfVar == null) {
            mfVar = C52289mf.f137258j;
        }
        C51809dy a = C12875h.m29133a("call.CALL", "call_client_op_args", "assistant.api.client_op.CallArgs", mfVar);
        ehVar.copyOnWrite();
        C52076ei eiVar = (C52076ei) ehVar.instance;
        a.getClass();
        eiVar.f136668c = a;
        eiVar.f136666a |= 32;
        eoVar.copyOnWrite();
        C52083ep epVar2 = (C52083ep) eoVar.instance;
        C52076ei eiVar2 = (C52076ei) ehVar.build();
        eiVar2.getClass();
        epVar2.f136693c = eiVar2;
        epVar2.f136692b = 4;
        elVar.mo53785b(eoVar);
        Optional of = Optional.m71637of(elVar.build());
        C69664n.m101060f(of, "of(\n      ConversationDe… )\n        .build()\n    )");
        return new C13353a(of);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C13354a(this.f41085a, this.f41086b, gVar);
    }
}
