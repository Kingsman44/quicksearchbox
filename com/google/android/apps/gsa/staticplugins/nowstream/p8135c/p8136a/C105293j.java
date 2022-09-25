package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58832aw;
import p5451f.p5452a.p5453a.p5454a.C69399au;
import p5451f.p5452a.p5453a.p5454a.C69400av;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C105293j implements C23109a {

    /* renamed from: a */
    public final /* synthetic */ C69399au f293779a;

    public /* synthetic */ C105293j(C69399au auVar) {
        this.f293779a = auVar;
    }

    /* renamed from: a */
    public final void mo28347a(Object obj) {
        C9251ef efVar;
        C69399au auVar = this.f293779a;
        C105287ea eaVar = (C105287ea) obj;
        if (C58832aw.m90831a(((C23251a) eaVar.f293761b.mo94658c()).f63720e, C9251ef.f31988f)) {
            efVar = (C9251ef) eaVar.f293761b.mo94659d().f63720e;
        } else {
            efVar = (C9251ef) ((C23251a) eaVar.f293761b.mo94658c()).f63720e;
        }
        C69400av avVar = efVar.f31992c;
        if (avVar == null) {
            avVar = C69400av.f185693h;
        }
        C69399au a = C69399au.m100748a(avVar.f185696b);
        if (a == null) {
            a = C69399au.UNKNOWN_FEED_TIP;
        }
        if (auVar == a) {
            if ((efVar.f31990a & 1) != 0) {
                eaVar.f293763d.mo79051c(efVar.f31991b);
            }
            ((C23251a) eaVar.f293761b.mo94658c()).mo28730f(C9251ef.f31988f, false);
        }
    }
}
