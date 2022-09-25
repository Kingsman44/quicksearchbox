package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.assistant.p3897e.p3921j.C52087et;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.j */
/* compiled from: PG */
final class C22605j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22607l f62267a;

    public C22605j(C22607l lVar) {
        this.f62267a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C22607l.f62272a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "JwnLibraryManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48396)).mo56386p("Failed to read missing libraries");
        synchronized (this.f62267a) {
            this.f62267a.f62275d.mo57357o(th);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        List<C58833ax> list = (List) obj;
        synchronized (this.f62267a) {
            for (C58833ax axVar : list) {
                if (axVar != null && axVar.mo56113h()) {
                    C52087et etVar = (C52087et) axVar.mo56107c();
                    this.f62267a.f62276e.put(etVar.f136702a, etVar);
                    C58976aa aaVar = C58975e.f156826a;
                    String str = etVar.f136702a;
                }
            }
            this.f62267a.mo27719f();
        }
    }
}
