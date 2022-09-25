package com.google.android.apps.gsa.staticplugins.p7388al;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.b;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83921h;
import com.google.android.apps.gsa.shared.p7045k.C89807c;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.p7045k.C89825u;
import com.google.android.apps.gsa.shared.p7045k.C89827w;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.j */
/* compiled from: PG */
public final class C93936j implements C89825u {

    /* renamed from: a */
    public final /* synthetic */ C93943q f262312a;

    public C93936j(C93943q qVar) {
        this.f262312a = qVar;
    }

    /* renamed from: a */
    public final void mo83672a(String str, C89824t tVar) {
        C59071e eVar = C93943q.f262327b;
        if (!b.j(tVar)) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19332)).mo56389s("#onDeviceAdded: Not adding device [name: %s] as it is not AssistantDeviceReady", ((C89807c) tVar).f243094a.mo83649e());
            return;
        }
        C89807c cVar = (C89807c) tVar;
        if (cVar.f243094a.mo83655i()) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19331)).mo56389s("#onDeviceAdded: Not adding device [name: %s] as it supports multi-zone groups", cVar.f243094a.mo83649e());
            return;
        }
        C93943q qVar = this.f262312a;
        int a = C83921h.m133675a(qVar.f262353y.f228567c);
        if (a == 0 || a != 2) {
            boolean b = C89827w.m146247b(tVar);
            boolean c = C89827w.m146248c(tVar);
            JSONObject jSONObject = cVar.f243095b.f243043h;
            boolean z = false;
            if (jSONObject == null) {
                ((C59052c) ((C59052c) C93943q.f262327b.mo56226d()).mo56372aa(19355)).mo56386p("deviceInfo is null!");
            } else {
                z = jSONObject.optBoolean(qVar.f262333e.mo79758x(C90082eg.f249897aM), false);
            }
            boolean i = cVar.f243094a.mo83655i();
            if (!b || c || i || !z) {
                ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19330)).mo56389s("#onDeviceAdded: Not supported device [name: %s]", cVar.f243094a.mo83649e());
                return;
            }
        }
        if (this.f262312a.mo88224j(cVar.f243095b.f243046k)) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19328)).mo56389s("#onDeviceAdded: Device is already set up [name: %s]", cVar.f243094a.mo83649e());
            return;
        }
        String a2 = C89827w.m146246a(tVar);
        String Z = this.f262312a.f262339k.mo83863Z();
        C58495hd r = this.f262312a.f262333e.mo79752r(C90014bt.f247482hw);
        C58485gu c2 = this.f262312a.f262333e.mo79745c(C90014bt.f247476hq);
        String b2 = b.b(a2, Z, r);
        C58976aa aaVar = C58975e.f156826a;
        if (!c2.contains(b2)) {
            String e = cVar.f243094a.mo83649e();
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19327)).mo56389s("Adding speaker id locale unsupported device [name: %s]", e);
            C93943q qVar2 = this.f262312a;
            qVar2.f262346r.put(str, new C93940n(qVar2, e, 3, C89827w.m146246a(tVar)));
            this.f262312a.mo88221g();
            return;
        }
        C93943q qVar3 = this.f262312a;
        l lVar = new l(tVar);
        ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19351)).mo56389s("#runCanEnrollCheck start check [name: %s]", cVar.f243094a.mo83649e());
        C93945s sVar = qVar3.f262341m;
        new C90873ag(sVar.f262359a.mo28201a("check can enroll", new C93944r(sVar, lVar, ((Account) qVar3.f262340l.mo77278a().mo56107c()).name, (C92391o) qVar3.f262337i.f257558c.mo56111f())), qVar3.f262332d, "canEnrollCheckCallback", new C93922a(qVar3, lVar, str)).mo85223a(new C93928b(tVar));
    }
}
