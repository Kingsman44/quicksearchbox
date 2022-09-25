package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.C74725ce;
import com.google.android.apps.gsa.nga.engine.C74748a;
import com.google.android.apps.gsa.nga.engine.recognition.p6134n.C77867a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80640d;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81044b;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81058p;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81064e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4520a.C58206am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.ai */
/* compiled from: PG */
public final class C81392ai implements C74725ce {

    /* renamed from: a */
    private static final C59071e f222743a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.m.a.ai");

    /* renamed from: b */
    private final C81400aq f222744b;

    /* renamed from: c */
    private final C81064e f222745c;

    /* renamed from: d */
    private final C58881cr f222746d;

    public C81392ai(C81400aq aqVar, C81064e eVar, C81385ab abVar) {
        this.f222744b = aqVar;
        this.f222745c = eVar;
        Objects.requireNonNull(abVar);
        this.f222746d = C58886cw.m90973a(new C81391ah(abVar));
        C91084c.INTERACTOR.equals(C91081a.m148802a());
    }

    /* renamed from: a */
    public final void mo71100a(C37672hs hsVar, C81044b bVar) {
        ((C59052c) ((C59052c) f222743a.mo56224b()).mo56372aa(5905)).mo56389s("#onWatchSuggestionQuery %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        if (!((Optional) this.f222746d.mo6453a()).isEmpty() && !this.f222745c.mo74838a(hsVar)) {
            C81400aq aqVar = this.f222744b;
            C81401b bVar2 = aqVar.f222766e;
            C37500dg a = bVar2.f222778i.mo41135a();
            ((C58206am) bVar2.f222775f).f155647a.put(a, hsVar);
            C80640d a2 = aqVar.f222768g.mo74375a(C81400aq.m129479a(hsVar, bVar, a));
            C81058p pVar = bVar.f222123g;
            if (pVar == null) {
                pVar = C81058p.f222170c;
            }
            new C90873ag(((C77867a) ((C74748a) ((Optional) aqVar.f222765d.mo6453a()).get()).mo71134dT().mo27525b()).mo72847a(a2, pVar.f222173b), aqVar.f222763b, "[NGA] Watch suggestion query", new C81393aj(aqVar, hsVar)).mo85223a(new C81394ak(aqVar, hsVar));
        }
    }
}
