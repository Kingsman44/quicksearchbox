package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91392d;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91413c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dj */
/* compiled from: PG */
final class C104623dj extends C91392d {

    /* renamed from: b */
    final /* synthetic */ C23056g f291257b;

    /* renamed from: c */
    final /* synthetic */ C104626dm f291258c;

    /* renamed from: d */
    final /* synthetic */ C104627dn f291259d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104623dj(C104627dn dnVar, C7718hj hjVar, C23056g gVar, C104626dm dmVar) {
        super(hjVar);
        this.f291259d = dnVar;
        this.f291257b = gVar;
        this.f291258c = dmVar;
    }

    /* renamed from: a */
    public final void mo85731a() {
        C91413c cVar;
        C104627dn dnVar = this.f291259d;
        if (!dnVar.f291277j) {
            ((C23193m) dnVar.f291269b.mo94217l()).mo28653g(this.f291257b);
            this.f291259d.f291271d.remove(this);
            this.f291259d.f291270c.mo77634d(this);
            int size = this.f291258c.mo94282c().f32075b.size();
            C104626dm dmVar = this.f291258c;
            int i = 1;
            if (dmVar.mo94281b() != null) {
                C1970e b = dmVar.mo94281b();
                b.getClass();
                if (b.f5889b != null) {
                    C1970e b2 = dmVar.mo94281b();
                    b2.getClass();
                    C7718hj[] hjVarArr = (C7718hj[]) b2.f5889b;
                    hjVarArr.getClass();
                    i = hjVarArr.length;
                }
            }
            if (((C23193m) this.f291259d.f291269b.mo94217l()).f63603b.size() <= size - i && (cVar = this.f291259d.f291274g) != null) {
                cVar.mo85760a();
            }
        }
    }
}
