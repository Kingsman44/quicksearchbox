package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91437s;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104502as;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104503at;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8178yk;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C104541ai implements C91437s {

    /* renamed from: a */
    public final /* synthetic */ C104551as f290828a;

    /* renamed from: b */
    public final /* synthetic */ C7718hj f290829b;

    /* renamed from: c */
    public final /* synthetic */ List f290830c;

    public /* synthetic */ C104541ai(C104551as asVar, C7718hj hjVar, List list) {
        this.f290828a = asVar;
        this.f290829b = hjVar;
        this.f290830c = list;
    }

    /* renamed from: a */
    public final void mo85791a(C58833ax axVar) {
        C104551as asVar = this.f290828a;
        C7718hj hjVar = this.f290829b;
        List list = this.f290830c;
        asVar.mo94251l();
        C104502as asVar2 = (C104502as) asVar.mo94247h().toBuilder();
        asVar2.copyOnWrite();
        C104503at atVar = (C104503at) asVar2.instance;
        atVar.f290657a |= 1;
        atVar.f290658b = true;
        asVar.mo94254o((C104503at) asVar2.build());
        if (hjVar == null) {
            hjVar = (C7718hj) list.get(0);
        }
        int i = hjVar.f26961b;
        if ((i & 8) != 0) {
            C91405d dVar = asVar.f290890w;
            C7665fk fkVar = hjVar.f26942N;
            if (fkVar == null) {
                fkVar = C7665fk.f26611e;
            }
            C8178yk ykVar = fkVar.f26616d;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            dVar.mo85748h(ykVar);
        } else if ((i & 4) != 0) {
            C91405d dVar2 = asVar.f290890w;
            C8178yk ykVar2 = hjVar.f26941M;
            if (ykVar2 == null) {
                ykVar2 = C8178yk.f28736g;
            }
            dVar2.mo85748h(ykVar2);
        }
        if (axVar.mo56113h()) {
            C23052c cVar = asVar.f63405W;
            C87320c cVar2 = C87320c.PREEMPTIVE;
            C58836b bVar = C58836b.f156633a;
            C87316ao aoVar = new C87316ao(cVar, (String) axVar.mo56107c(), BuildConfig.FLAVOR, cVar2, bVar, bVar, bVar);
            aoVar.f235809b = C104539ag.f290826a;
            asVar.f290876i.mo80980c(aoVar);
        }
    }
}
