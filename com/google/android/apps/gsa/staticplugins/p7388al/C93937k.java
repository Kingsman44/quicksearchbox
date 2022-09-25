package com.google.android.apps.gsa.staticplugins.p7388al;

import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.b;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7006ax.C89328g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.k */
/* compiled from: PG */
public final /* synthetic */ class C93937k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93939m f262313a;

    /* renamed from: b */
    public final /* synthetic */ C89328g f262314b;

    public /* synthetic */ C93937k(C93939m mVar, C89328g gVar) {
        this.f262313a = mVar;
        this.f262314b = gVar;
    }

    public final void run() {
        C93939m mVar = this.f262313a;
        C89328g gVar = this.f262314b;
        C93943q qVar = mVar.f262317a;
        if (qVar.mo88224j(gVar.mo83270g())) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19344)).mo56389s("#addStandaloneLibassistantDevice: Device is already set up [name: %s]", gVar.mo83269f());
        } else if (!gVar.mo83273i()) {
            qVar.f262346r.put(gVar.mo83270g(), new C93940n(qVar, gVar.mo83269f(), 3, gVar.mo83271h()));
            qVar.mo88221g();
        } else if (((long) gVar.mo83263a()) >= qVar.f262333e.mo79743a(C90082eg.f250019cc)) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19342)).mo56386p("Too many linked users for this devices.");
            qVar.f262346r.put(gVar.mo83270g(), new C93940n(qVar, gVar.mo83269f(), 2, gVar.mo83271h()));
            qVar.mo88221g();
        } else {
            String h = gVar.mo83271h();
            String Z = qVar.f262339k.mo83863Z();
            C58495hd r = qVar.f262333e.mo79752r(C90014bt.f247482hw);
            C58485gu c = qVar.f262333e.mo79745c(C90014bt.f247476hq);
            String b = b.b(h, Z, r);
            C58976aa aaVar = C58975e.f156826a;
            if (!c.contains(b)) {
                ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19341)).mo56386p("Locale is not supported");
                qVar.f262346r.put(gVar.mo83270g(), new C93940n(qVar, gVar.mo83269f(), 3, gVar.mo83271h()));
                qVar.mo88221g();
                return;
            }
            C93942p pVar = new C93942p(qVar, new l(gVar));
            qVar.f262345q.put(gVar.mo83270g(), pVar);
            if (qVar.f262347s.containsKey(pVar.f262324a.b())) {
                qVar.f262347s.remove(pVar.f262324a.b());
            }
            qVar.mo88221g();
        }
    }
}
