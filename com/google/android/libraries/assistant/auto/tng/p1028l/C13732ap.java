package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15487m;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ap */
/* compiled from: PG */
final class C13732ap implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13829a f41867a;

    /* renamed from: b */
    final /* synthetic */ C13733aq f41868b;

    public C13732ap(C13733aq aqVar, C13829a aVar) {
        this.f41868b = aqVar;
        this.f41867a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            ((C59052c) ((C59052c) ((C59052c) C13733aq.f41869a.mo56224b()).mo56382g(th)).mo56372aa(44992)).mo56386p("Cancelled fulfillment.");
            C37215b bVar = this.f41868b.f41872d;
            C37252a c = C37179a.f97705z.mo40805c(C62722b.CANCELLED);
            C15480f.m32212a(c, this.f41867a.mo21273d());
            bVar.mo19974a(c);
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C13733aq.f41869a.mo56225c()).mo56382g(th)).mo56372aa(44991)).mo56386p("Error capturing fulfillment.");
        C37215b bVar2 = this.f41868b.f41872d;
        C37252a c2 = C37179a.f97705z.mo40805c(C62722b.INTERNAL);
        C15480f.m32212a(c2, this.f41867a.mo21273d());
        C15471a aVar = (C15471a) C15474b.f46404j.createBuilder();
        aVar.mo22359a(C15487m.m32219b(th));
        C15487m.m32220c(c2, (C15474b) aVar.build(), Optional.empty());
        bVar2.mo19974a(c2);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C37215b bVar = this.f41868b.f41872d;
        C37252a c = C37179a.f97705z.mo40805c(C62722b.OK);
        C15480f.m32212a(c, this.f41867a.mo21273d());
        bVar.mo19974a(c);
    }
}
