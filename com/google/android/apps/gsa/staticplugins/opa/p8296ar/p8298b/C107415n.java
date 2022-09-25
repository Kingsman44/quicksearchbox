package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.n */
/* compiled from: PG */
public final /* synthetic */ class C107415n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107419r f298933a;

    /* renamed from: b */
    public final /* synthetic */ C83683b f298934b;

    public /* synthetic */ C107415n(C107419r rVar, C83683b bVar) {
        this.f298933a = rVar;
        this.f298934b = bVar;
    }

    public final void accept(Object obj) {
        C107419r rVar = this.f298933a;
        C48864g gVar = (C48864g) obj;
        C48851br brVar = this.f298934b.f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        String a = C107431k.m178343a(gVar, brVar.toByteArray());
        C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
        C48918t tVar = (C48918t) C48919u.f126586g.createBuilder();
        C48900b bVar = C48900b.PROACTIVE_API_CLIENT_ACTION;
        tVar.copyOnWrite();
        C48919u uVar = (C48919u) tVar.instance;
        uVar.f126589b = bVar.f126548g;
        uVar.f126588a |= 1;
        tVar.copyOnWrite();
        C48919u uVar2 = (C48919u) tVar.instance;
        a.getClass();
        uVar2.f126588a |= 4;
        uVar2.f126591d = a;
        C39226b bVar2 = C39226b.TAG_CLASSIC_ASSISTANT_PROACTIVEAPI;
        tVar.copyOnWrite();
        C48919u uVar3 = (C48919u) tVar.instance;
        uVar3.f126592e = bVar2.getNumber();
        uVar3.f126588a |= 8;
        C48919u uVar4 = (C48919u) tVar.build();
        pVar.copyOnWrite();
        C48915q qVar = (C48915q) pVar.instance;
        uVar4.getClass();
        qVar.f126577b = uVar4;
        qVar.f126576a |= 1;
        C90875ai.m148465b(C107410i.f298926a, rVar.f298950g.mo28210j(rVar.f298949f.mo79697b(), "createTriggerRequest#accountId", new C107409h(rVar, (C48915q) pVar.build())), rVar.f298947d, "handleSyncResponseResult").mo85223a(new C107411j(a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
