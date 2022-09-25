package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8749c;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.p4440ca.p4442b.p4443a.C57928d;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c.b */
/* compiled from: PG */
final class C117014b extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C41642a f324843a;

    /* renamed from: b */
    final /* synthetic */ C117016d f324844b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117014b(C117016d dVar, C41642a aVar) {
        super("sb.v.u.LiteSuggestSourc", "fetching", 8);
        this.f324844b = dVar;
        this.f324843a = aVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String c = C58890d.m90988c(((C88616t) this.f324843a).f239556a.mo84352bk());
        if (!c.isEmpty()) {
            int i = 0;
            if (c.charAt(0) == '%') {
                while (i < c.length() && c.charAt(i) == '%') {
                    i++;
                }
                c = c.substring(i);
            }
        }
        List list = null;
        if (c.isEmpty()) {
            return C117016d.m194484a((List) null, C58485gu.m89845m());
        }
        if (((C88616t) this.f324843a).f239556a.mo84405cl()) {
            C117016d dVar = this.f324844b;
            C57928d dVar2 = dVar.f324849d;
            dVar2.getClass();
            dVar2.f154940a = Math.min(10, (int) dVar.f324847b.mo79743a(C90085ej.f250136aM));
            C57928d dVar3 = this.f324844b.f324849d;
            dVar3.getClass();
            list = dVar3.mo54539a("%apps|".concat(String.valueOf(c)));
            C57928d dVar4 = this.f324844b.f324849d;
            dVar4.getClass();
            dVar4.f154940a = 10;
        }
        C57928d dVar5 = this.f324844b.f324849d;
        dVar5.getClass();
        return C117016d.m194484a(list, dVar5.mo54539a(c));
    }
}
