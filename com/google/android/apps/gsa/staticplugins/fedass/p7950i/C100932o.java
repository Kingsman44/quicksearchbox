package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19401e;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19413q;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19422z;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.o */
/* compiled from: PG */
public final /* synthetic */ class C100932o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100933p f281973a;

    public /* synthetic */ C100932o(C100933p pVar) {
        this.f281973a = pVar;
    }

    public final Object apply(Object obj) {
        C100933p pVar = this.f281973a;
        C19422z a = ((C100918bc) pVar.f281975b.mo17428b()).mo92093a((C132800h) obj);
        if (!a.mo24595j() || !a.mo24592h() || !a.mo24587d().isPresent() || !a.mo24586c().isPresent()) {
            ((C59052c) ((C59052c) C100933p.f281974a.mo56224b()).mo56372aa(19688)).mo56386p("Not eligible for LM FT training.");
            ((C100918bc) pVar.f281975b.mo17428b()).mo92094b(pVar.mo92100b(a, false, false), C100933p.m167163c(a));
            return Optional.empty();
        } else if (a.mo24587d().isEmpty() || a.mo24586c().isEmpty()) {
            ((C59052c) ((C59052c) C100933p.f281974a.mo56225c()).mo56372aa(19687)).mo56386p("Cannot schedule the task with empty SODA LP dir and LM plan.");
            return Optional.empty();
        } else {
            C19413q h = C19414r.m37052h();
            C19401e eVar = (C19401e) h;
            eVar.f54277a = "SheldonLmP13nTrainerSession";
            h.mo24564e(452451325);
            h.mo24561b((File) a.mo24587d().get());
            h.mo24562c((File) a.mo24586c().get());
            h.mo24563d(a.mo24590f());
            eVar.f54278b = a.mo24584a();
            eVar.f54279c = a;
            return Optional.m71637of(h.mo24560a());
        }
    }
}
