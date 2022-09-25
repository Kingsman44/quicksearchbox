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

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.b */
/* compiled from: PG */
public final /* synthetic */ class C100915b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100920c f281944a;

    public /* synthetic */ C100915b(C100920c cVar) {
        this.f281944a = cVar;
    }

    public final Object apply(Object obj) {
        C100920c cVar = this.f281944a;
        C19422z a = ((C100918bc) cVar.f281953b.mo17428b()).mo92093a((C132800h) obj);
        if (!a.mo24595j() || !a.mo24591g() || !a.mo24587d().isPresent() || !a.mo24585b().isPresent()) {
            ((C59052c) ((C59052c) C100920c.f281952a.mo56224b()).mo56372aa(19680)).mo56386p("Not eligible for ASR FT training.");
            ((C100918bc) cVar.f281953b.mo17428b()).mo92094b(cVar.mo92095b(a, false, false), C100920c.m167150c(a));
            return Optional.empty();
        } else if (a.mo24587d().isEmpty() || a.mo24585b().isEmpty()) {
            ((C59052c) ((C59052c) C100920c.f281952a.mo56225c()).mo56372aa(19679)).mo56386p("Cannot schedule the task with empty SODA LP dir and ASR plan.");
            return Optional.empty();
        } else {
            C19413q h = C19414r.m37052h();
            C19401e eVar = (C19401e) h;
            eVar.f54277a = "SheldonAsrP13nTrainerSession";
            h.mo24564e(444340172);
            h.mo24561b((File) a.mo24587d().get());
            h.mo24562c((File) a.mo24585b().get());
            h.mo24563d(a.mo24588e());
            eVar.f54278b = a.mo24584a();
            eVar.f54279c = a;
            return Optional.m71637of(h.mo24560a());
        }
    }
}
