package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.en */
/* compiled from: PG */
public final class C104654en implements C91418a {

    /* renamed from: a */
    final /* synthetic */ C7718hj f291434a;

    /* renamed from: b */
    final /* synthetic */ C104656ep f291435b;

    public C104654en(C104656ep epVar, C7718hj hjVar) {
        this.f291435b = epVar;
        this.f291434a = hjVar;
    }

    /* renamed from: a */
    public final void mo85764a() {
    }

    /* renamed from: b */
    public final void mo85765b() {
        this.f291435b.f291438b.mo85743c(C7681g.DISLIKE_CARD);
        this.f291435b.mo94289e(C7681g.DISLIKE_CARD, this.f291434a);
        C104656ep epVar = this.f291435b;
        C7718hj hjVar = this.f291434a;
        C7665fk fkVar = hjVar.f26942N;
        if (fkVar == null) {
            fkVar = C7665fk.f26611e;
        }
        if ((fkVar.f26613a & 4) != 0) {
            C91405d dVar = epVar.f291438b;
            C7665fk fkVar2 = hjVar.f26942N;
            if (fkVar2 == null) {
                fkVar2 = C7665fk.f26611e;
            }
            C8178yk ykVar = fkVar2.f26616d;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            dVar.mo85748h(ykVar);
        } else if ((hjVar.f26961b & 4) != 0) {
            C91405d dVar2 = epVar.f291438b;
            C8178yk ykVar2 = hjVar.f26941M;
            if (ykVar2 == null) {
                ykVar2 = C8178yk.f28736g;
            }
            dVar2.mo85748h(ykVar2);
        }
        C7718hj hjVar2 = this.f291434a;
        if ((hjVar2.f26955a & 128) != 0) {
            C91405d dVar3 = this.f291435b.f291438b;
            C8178yk ykVar3 = hjVar2.f26973n;
            if (ykVar3 == null) {
                ykVar3 = C8178yk.f28736g;
            }
            dVar3.mo85748h(ykVar3);
        }
    }
}
