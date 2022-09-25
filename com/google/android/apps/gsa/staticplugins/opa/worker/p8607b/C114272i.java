package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3861at.C49845bc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.i */
/* compiled from: PG */
public final /* synthetic */ class C114272i implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316866a;

    /* renamed from: b */
    public final /* synthetic */ C87693ab f316867b;

    public /* synthetic */ C114272i(C114274k kVar, C87693ab abVar) {
        this.f316866a = kVar;
        this.f316867b = abVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C114274k kVar = this.f316866a;
        C87693ab abVar = this.f316867b;
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49829an anVar = (C49829an) C49830ao.f129482j.createBuilder();
        C63088z zVar = akVar.f129473j;
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        zVar.getClass();
        aoVar.f129484a |= 64;
        aoVar.f129490g = zVar;
        anVar.mo53365a(akVar.f129471h);
        anVar.copyOnWrite();
        C49830ao aoVar2 = (C49830ao) anVar.instance;
        aoVar2.f129487d = C49255aa.m85392a(4);
        aoVar2.f129484a |= 1;
        C51058ev f = kVar.mo101291f(abVar.f237120d);
        anVar.copyOnWrite();
        C49830ao aoVar3 = (C49830ao) anVar.instance;
        f.getClass();
        aoVar3.f129488e = f;
        aoVar3.f129484a |= 4;
        C48384r rVar = abVar.f237124h;
        if (rVar == null) {
            rVar = C48384r.f125066b;
        }
        anVar.copyOnWrite();
        C49830ao aoVar4 = (C49830ao) anVar.instance;
        rVar.getClass();
        aoVar4.f129491h = rVar;
        aoVar4.f129484a |= 128;
        if ((abVar.f237117a & 128) != 0) {
            C49845bc bcVar = abVar.f237125i;
            if (bcVar == null) {
                bcVar = C49845bc.f129538c;
            }
            C114274k.m189539i(anVar, akVar, bcVar);
        }
        new C90873ag(kVar.mo101292g((C49830ao) anVar.build()), kVar.f316874g, "shortcut creation via panthera", new C114264a(kVar, cVar, abVar)).mo85223a(new C114265b(cVar));
        return "Save Shortcut";
    }
}
