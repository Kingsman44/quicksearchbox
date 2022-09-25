package com.google.android.apps.gsa.staticplugins.p7780de.p7783c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.c.f */
/* compiled from: PG */
public final class C99437f {

    /* renamed from: a */
    private static final C90208n f278238a = C90208n.INTERESTS_TAB;

    /* renamed from: a */
    public static C58833ax m164924a(ProtoParcelable protoParcelable) {
        if (ProtoParcelable.f63423a.equals(protoParcelable)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90833j((C90291g) C23245b.m43557b(protoParcelable, C90291g.f252163T.getParserForType(), C62921ba.m95368a(), true));
    }

    /* renamed from: b */
    public static void m164925b(C99436e eVar, C58833ax axVar) {
        C90208n nVar;
        if (!axVar.mo56113h() || (((C90291g) axVar.mo56107c()).f252185a & 1) == 0) {
            nVar = f278238a;
        } else {
            nVar = C90208n.m146767a(((C90291g) axVar.mo56107c()).f252187c);
            if (nVar == null) {
                nVar = C90208n.UNKNOWN_TAB;
            }
        }
        ((C23251a) eVar.mo91441g()).mo28730f(C58833ax.m90834k(nVar), false);
        ((C23251a) eVar.mo91443i()).mo28730f(C99430a.m164909b(nVar), false);
    }
}
