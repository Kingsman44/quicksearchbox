package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.libraries.assistant.p1594s.p1595a.C19127a;
import com.google.android.libraries.assistant.p1594s.p1595a.C19130c;
import com.google.android.libraries.assistant.p1594s.p1599c.C19202d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.n */
/* compiled from: PG */
public final /* synthetic */ class C112128n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112130p f311372a;

    public /* synthetic */ C112128n(C112130p pVar) {
        this.f311372a = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C19202d dVar = (C19202d) obj;
        C19130c a = this.f311372a.f311374a.mo99400a();
        C62971cq cqVar = dVar.f53766c;
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = a.f53599b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                C59104x c = C19130c.f53598a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AIEngines");
                ((C59052c) ((C59052c) c).mo56372aa(47821)).mo56387q("#loadModel: engine for ID = %d not found.", 1200);
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() == 1200) {
                ((C19127a) entry.getValue()).mo24292f();
                break;
            }
        }
        return dVar;
    }
}
