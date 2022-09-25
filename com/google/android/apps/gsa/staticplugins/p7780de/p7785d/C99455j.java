package com.google.android.apps.gsa.staticplugins.p7780de.p7785d;

import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90290f;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g;
import com.google.android.apps.gsa.shared.p6990an.C89229t;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99437f;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23194a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.j */
/* compiled from: PG */
public final /* synthetic */ class C99455j implements C23108e {

    /* renamed from: a */
    public static final /* synthetic */ C99455j f278299a = new C99455j();

    private /* synthetic */ C99455j() {
    }

    /* renamed from: a */
    public final void mo28558a(C23117m mVar, C23110f fVar, ProtoParcelable protoParcelable) {
        C58833ax a = C99437f.m164924a(protoParcelable);
        C99438a aVar = new C99438a(mVar, fVar);
        C99437f.m164925b(aVar, a);
        if (a.mo56113h()) {
            C90291g gVar = (C90291g) a.mo56107c();
            int a2 = C90290f.m146824a(gVar.f252188d);
            if (a2 != 0 && a2 == 3 && (gVar.f252185a & 64) != 0) {
                C23194a aVar2 = aVar.f278239a;
                C23129y yVar = new C23129y("suggest", "TYPE_SUGGEST");
                C89229t tVar = gVar.f252193i;
                if (tVar == null) {
                    tVar = C89229t.f241959d;
                }
                aVar2.mo28623d(yVar, C23245b.m43556a(tVar));
            }
        }
    }
}
