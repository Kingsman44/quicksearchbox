package com.google.android.apps.gsa.staticplugins.p7877dx.p7880c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90206l;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.c.e */
/* compiled from: PG */
public final class C100301e {
    /* renamed from: a */
    public static C58833ax m166238a(ProtoParcelable protoParcelable) {
        if (ProtoParcelable.f63423a.equals(protoParcelable)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90833j((C90206l) C23245b.m43557b(protoParcelable, C90206l.f251980f.getParserForType(), C62921ba.m95368a(), true));
    }

    /* renamed from: b */
    public static void m166239b(C100300d dVar, C58833ax axVar) {
        C90208n nVar = C90208n.UNKNOWN_TAB;
        if (axVar.mo56113h()) {
            nVar = C90208n.m146767a(((C90206l) axVar.mo56107c()).f251983b);
            if (nVar == null) {
                nVar = C90208n.UNKNOWN_TAB;
            }
            ((C23251a) dVar.mo91862g()).mo28730f(C58485gu.m89842j(new C62963cj(((C90206l) axVar.mo56107c()).f251984c, C90206l.f251979d)), false);
        }
        ((C23251a) dVar.mo91858c()).mo28730f(C58833ax.m90834k(nVar), false);
    }
}
