package com.google.android.apps.gsa.staticplugins.backup.p7438b.p7439a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p6986aj.C89185d;
import com.google.android.apps.gsa.shared.p7040g.C89768b;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.staticplugins.backup.C94481i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.backup.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C94469f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C89768b f264148a;

    /* renamed from: b */
    public final /* synthetic */ C86338r f264149b;

    /* renamed from: c */
    public final /* synthetic */ C86338r f264150c;

    /* renamed from: d */
    public final /* synthetic */ C86054o f264151d;

    public /* synthetic */ C94469f(C89768b bVar, C86338r rVar, C86338r rVar2, C86054o oVar) {
        this.f264148a = bVar;
        this.f264149b = rVar;
        this.f264150c = rVar2;
        this.f264151d = oVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C89768b bVar = this.f264148a;
        C86338r rVar = this.f264149b;
        C86338r rVar2 = this.f264150c;
        C86054o oVar = this.f264151d;
        C58976aa aaVar = C58975e.f156826a;
        int i = bVar.f242963b;
        C63088z zVar = bVar.f242964c;
        C63088z zVar2 = bVar.f242965d;
        String[] strArr = C94481i.f264170a;
        HashSet g = C58758qx.m90649g(30);
        Collections.addAll(g, strArr);
        C89185d a = C94470g.m155823a((C89185d) C62942bv.parseFrom((C62942bv) C89185d.f241801b, zVar), g);
        String[] strArr2 = C94481i.f264171b;
        HashSet g2 = C58758qx.m90649g(1);
        Collections.addAll(g2, strArr2);
        C89185d a2 = C94470g.m155823a((C89185d) C62942bv.parseFrom((C62942bv) C89185d.f241801b, zVar2), g2);
        C86341u uVar = new C86341u((C86346z) rVar);
        uVar.mo80087m(a);
        uVar.mo80086l(true);
        C86341u uVar2 = new C86341u((C86346z) rVar2);
        uVar2.mo80087m(a2);
        uVar2.mo80086l(true);
        if ((bVar.f242962a & 8) != 0) {
            C86337q b = rVar2.mo80076b();
            b.mo80073h(C90507o.f253012b, bVar.f242966e);
            b.apply();
            oVar.mo79680n();
        }
        return C118826c.f331422a;
    }
}
