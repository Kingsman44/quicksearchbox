package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.contrib.debug.internal.C43476aa;
import com.google.android.libraries.web.contrib.debug.internal.C43479c;
import com.google.android.libraries.web.contrib.debug.internal.C43490n;
import com.google.android.libraries.web.contrib.debug.internal.C43491o;
import com.google.android.libraries.web.contrib.debug.internal.C43492p;
import com.google.android.libraries.web.contrib.debug.internal.C43501y;
import com.google.android.libraries.web.contrib.debug.internal.C43502z;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58425eo;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.c.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C43326ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43331ag f113180a;

    /* renamed from: b */
    public final /* synthetic */ C43376u f113181b;

    public /* synthetic */ C43326ab(C43331ag agVar, C43376u uVar) {
        this.f113180a = agVar;
        this.f113181b = uVar;
    }

    public final void accept(Object obj) {
        C43331ag agVar = this.f113180a;
        C43376u uVar = this.f113181b;
        C43490n nVar = (C43490n) obj;
        C43904a aVar = agVar.f113185a;
        nVar.f113591a.f113611c = nVar.f113592b.mo46936a();
        C43492p pVar = nVar.f113593c;
        C43476aa aaVar = pVar.f113596b;
        long j = pVar.f113595a;
        C43491o oVar = (C43491o) aVar.mo46411d(C43491o.class);
        C58893dc.m90996a(oVar);
        int i = oVar.f113594a;
        C58893dc.m90997b(aaVar.f113574c.containsKey(Long.valueOf(j)));
        if (!aaVar.f113572a.isEmpty()) {
            C58425eo eoVar = aaVar.f113572a;
            if (eoVar.f156037a - eoVar.size() == 0) {
                C43501y yVar = (C43501y) aaVar.f113572a.peek();
                C58893dc.m90996a(yVar);
                long b = yVar.mo46563b();
                Map map = aaVar.f113574c;
                Long valueOf = Long.valueOf(b);
                C43502z zVar = (C43502z) map.get(valueOf);
                C58893dc.m90996a(zVar);
                if (!zVar.f113610b && zVar.mo46575a().size() == 1) {
                    aaVar.f113574c.remove(valueOf);
                }
            }
        }
        aaVar.f113572a.add(new C43479c(aaVar.f113573b.mo57444a(), uVar, j, i));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
