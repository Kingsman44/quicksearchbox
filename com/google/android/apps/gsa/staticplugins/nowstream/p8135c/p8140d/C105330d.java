package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8140d;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91657f;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105228bw;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105229bx;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105263dd;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105691d;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105700m;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.d.d */
/* compiled from: PG */
public final class C105330d extends C105335i {
    public C105330d(C105329c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final boolean mo94730a(C105687ar arVar) {
        if (this.f293907a.mo94672D()) {
            return false;
        }
        if (!this.f293908b) {
            C105263dd ddVar = (C105263dd) this.f293907a;
            C105687ar arVar2 = ddVar.f293549H;
            if (arVar2 != null) {
                ddVar.mo94676H(arVar2);
            }
            return false;
        }
        C105263dd ddVar2 = (C105263dd) this.f293907a;
        C91657f fVar = ddVar2.f293633z;
        boolean z = ddVar2.f293563V;
        synchronized (fVar.f255627a) {
            if (fVar.mo86067j(z)) {
                fVar.mo86058a(C37182a.f98086g.mo40805c(C62722b.ABORTED), z);
            }
            fVar.mo86064g(z, 2);
            fVar.mo86065h(z, 1);
            fVar.mo86058a(C37182a.f98033f.mo40779c(), z);
        }
        ddVar2.f293561T = false;
        C105687ar arVar3 = ddVar2.f293549H;
        if (arVar3 != null) {
            C105700m mVar = arVar3.f294835F;
            if (mVar != null) {
                ((C105691d) mVar.f294955a).f294919a.mo28730f(false, false);
                mVar.mo95016h(true);
                ((C118831d) mVar.f294960f.mo6453a()).mo104025g(1);
                mVar.f294957c.mo86059b(C37182a.f98244n.mo40779c(), mVar.f294958d);
            }
            ddVar2.f293549H.f294846Q = true;
        }
        new C90873ag(ddVar2.f293614g.mo78676f((String) ddVar2.f293632y.mo94634s().f63720e, ddVar2.f293563V), ddVar2.f293612e, "NextPageRequestResultLogger", new C105228bw(ddVar2)).mo85223a(new C105229bx(ddVar2));
        return true;
    }
}
