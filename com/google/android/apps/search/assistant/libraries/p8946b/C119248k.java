package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protos.p5129p.p5130a.C65710ai;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.k */
/* compiled from: PG */
final class C119248k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60218r f332551a;

    /* renamed from: b */
    final /* synthetic */ C119249l f332552b;

    public C119248k(C119249l lVar, C60218r rVar) {
        this.f332552b = lVar;
        this.f332551a = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C119249l.f332553a.mo56225c()).mo56382g(th)).mo56372aa(34362)).mo56386p("Failed to write Assistant History.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C65710ai aiVar = (C65710ai) obj;
        C62724b bVar = aiVar.f178528a;
        if (bVar == null) {
            bVar = C62724b.f169416g;
        }
        if (bVar.f169419b != C62722b.OK.f169415s) {
            C58970a aVar = (C58970a) ((C58970a) C119249l.f332553a.mo56225c()).mo56372aa(34364);
            C62724b bVar2 = aiVar.f178528a;
            if (bVar2 == null) {
                bVar2 = C62724b.f169416g;
            }
            aVar.mo56387q("Failed to write Assistant History, getting code %s.", bVar2.f169419b);
            return;
        }
        ((C58970a) ((C58970a) C119249l.f332553a.mo56224b()).mo56372aa(34363)).mo56386p("Assistant History write was successful.");
        C46459k.m82829b(this.f332552b.f332554b.mo27171a(this.f332551a), "Failed to persist pending state writes", new Object[0]);
    }
}
