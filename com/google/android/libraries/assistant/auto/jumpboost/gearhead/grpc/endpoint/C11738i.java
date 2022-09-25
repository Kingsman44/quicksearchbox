package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11683an;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11712i;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11716m;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11717n;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11719p;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11527f;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.i */
/* compiled from: PG */
final class C11738i implements C70862aj {

    /* renamed from: a */
    public C70862aj f37790a;

    /* renamed from: b */
    final /* synthetic */ C11741l f37791b;

    public C11738i(C11741l lVar) {
        this.f37791b = lVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f37790a = null;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C11741l.f37795a.mo56225c()).mo56382g(th)).mo56372aa(43408)).mo56386p("Connection error");
        this.f37791b.f37797c.mo20030g();
        this.f37791b.f37796b.mo20011a();
        this.f37790a = null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C11683an anVar;
        C11717n nVar = (C11717n) obj;
        this.f37790a.getClass();
        if (!this.f37791b.mo20125m()) {
            ((C59052c) ((C59052c) C11741l.f37795a.mo56225c()).mo56372aa(43412)).mo56386p("Connection request received when the feature is not enabled");
            C70862aj ajVar = this.f37790a;
            ajVar.getClass();
            ajVar.mo20122b(C11741l.m27401e());
            this.f37790a = null;
            return;
        }
        C11716m mVar = C11716m.REGISTER_ASSISTANT_CLIENT;
        int ordinal = C11716m.m27384a(nVar.f37759a).ordinal();
        if (ordinal == 0) {
            if (nVar.f37759a == 1) {
                anVar = (C11683an) nVar.f37760b;
            } else {
                anVar = C11683an.f37675c;
            }
            ((C59052c) ((C59052c) C11741l.f37795a.mo56224b()).mo56372aa(43410)).mo56386p("Register Assistant Client");
            this.f37791b.f37797c.mo20029f(anVar.f37678b);
            C11527f fVar = this.f37791b.f37796b;
            C11712i iVar = anVar.f37677a;
            if (iVar == null) {
                iVar = C11712i.f37744e;
            }
            fVar.mo20012b(iVar);
        } else if (ordinal != 1) {
            ((C59052c) ((C59052c) C11741l.f37795a.mo56225c()).mo56372aa(43409)).mo56389s("Invalid Connection Request type : %s", C11716m.m27384a(nVar.f37759a));
            C70862aj ajVar2 = this.f37790a;
            ajVar2.getClass();
            ajVar2.mo20122b(new C70761fa(Status.f186906d, (C70334de) null, true));
        } else {
            ((C59052c) ((C59052c) C11741l.f37795a.mo56224b()).mo56372aa(43411)).mo56386p("Connection closed");
            this.f37791b.f37796b.mo20011a();
            this.f37791b.f37797c.mo20030g();
            C70862aj ajVar3 = this.f37790a;
            ajVar3.getClass();
            ajVar3.mo20123c(C11719p.f37761a);
            C70862aj ajVar4 = this.f37790a;
            ajVar4.getClass();
            ajVar4.mo20121a();
        }
    }
}
