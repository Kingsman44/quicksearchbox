package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8140d;

import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105263dd;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7726hr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.d.f */
/* compiled from: PG */
public final class C105332f extends C105335i {

    /* renamed from: c */
    private final int f293902c;

    public C105332f(C105329c cVar, int i) {
        super(cVar);
        this.f293902c = i;
    }

    /* renamed from: a */
    public final boolean mo94730a(C105687ar arVar) {
        C105687ar arVar2;
        C58485gu guVar = (C58485gu) ((C105263dd) this.f293907a).f293632y.mo94633r().f63720e;
        if (guVar.isEmpty()) {
            return false;
        }
        C58480gp e = C58485gu.m89837e();
        int i = this.f293902c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < guVar.size() && i3 < i) {
            C7726hr hrVar = (C7726hr) guVar.get(i2);
            if (hrVar != null) {
                e.mo55395g(hrVar);
                i3++;
            }
            i2++;
        }
        C105329c cVar = this.f293907a;
        C58485gu f = e.mo55394f();
        guVar.size();
        cVar.mo94675G(arVar, f);
        C105329c cVar2 = this.f293907a;
        C58485gu c = guVar.subList(i2, guVar.size());
        C105263dd ddVar = (C105263dd) cVar2;
        ddVar.f293632y.mo94633r().mo28730f(c, false);
        if (c.isEmpty() && (arVar2 = ddVar.f293549H) != null) {
            ddVar.mo94676H(arVar2);
        }
        return false;
    }
}
