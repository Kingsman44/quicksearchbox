package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.p7012bb.p7015c.C89360b;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90087el;
import com.google.common.p4522b.C58495hd;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.p */
/* compiled from: PG */
public final class C89388p implements C68220f {

    /* renamed from: a */
    private final C69464a f242363a;

    /* renamed from: b */
    private final C69464a f242364b;

    public C89388p(C69464a aVar, C69464a aVar2) {
        this.f242363a = aVar;
        this.f242364b = aVar2;
    }

    /* renamed from: a */
    public final C89387o mo17428b() {
        C118575h a = ((C89360b) this.f242363a).mo17428b();
        C90021c cVar = (C90021c) ((C68221g) this.f242364b).f184583a;
        int a2 = (int) cVar.mo79743a(C90087el.f250530b);
        int a3 = (int) cVar.mo79743a(C90087el.f250531c);
        C58495hd b = C89988b.f246752a.mo85086b(cVar.mo79758x(C90087el.f250532d));
        int i = 3;
        if (b.containsKey(Integer.valueOf(a.f330812sk))) {
            i = 3 | ((Integer) b.get(Integer.valueOf(a.f330812sk))).intValue();
        }
        if (cVar.mo79749o(C90087el.f250529a).contains(Integer.valueOf(a.f330812sk))) {
            i &= -8;
        }
        return new C89387o(i, new C89386n(a2, a3));
    }
}
