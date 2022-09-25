package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3980n.p3981a.p3982a.C52998a;
import com.google.assistant.p3980n.p3981a.p3982a.C52999b;
import com.google.assistant.p3980n.p3981a.p3982a.C53000c;
import com.google.assistant.p3980n.p3981a.p3982a.C53001d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.aq */
/* compiled from: PG */
public final /* synthetic */ class C105936aq implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C105952bf f295774a;

    public /* synthetic */ C105936aq(C105952bf bfVar) {
        this.f295774a = bfVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C105952bf bfVar = this.f295774a;
        Void voidR = (Void) obj;
        List f = bfVar.mo95192f();
        String e = bfVar.mo95191e();
        C53000c cVar = (C53000c) C53001d.f138931d.createBuilder();
        if (e != null) {
            cVar.copyOnWrite();
            C53001d dVar = (C53001d) cVar.instance;
            dVar.f138933a |= 1;
            dVar.f138934b = e;
        }
        if (!f.isEmpty()) {
            for (int i = 0; i < f.size(); i++) {
                C52998a aVar = (C52998a) C52999b.f138927c.createBuilder();
                String str = (String) f.get(i);
                aVar.copyOnWrite();
                C52999b bVar = (C52999b) aVar.instance;
                str.getClass();
                bVar.f138929a |= 1;
                bVar.f138930b = str;
                cVar.mo53955a(aVar);
            }
        }
        return (e != null || !f.isEmpty()) ? C58833ax.m90834k((C53001d) cVar.build()) : C58836b.f156633a;
    }
}
