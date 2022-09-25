package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.p */
/* compiled from: PG */
public final /* synthetic */ class C131247p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131251t f358888a;

    /* renamed from: b */
    public final /* synthetic */ C50818do f358889b;

    public /* synthetic */ C131247p(C131251t tVar, C50818do doVar) {
        this.f358888a = tVar;
        this.f358889b = doVar;
    }

    public final C60870cx apply(Object obj) {
        C131251t tVar = this.f358888a;
        C50818do doVar = this.f358889b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(optional);
        }
        if ((doVar.f132304a & 512) != 0) {
            C50729n nVar = doVar.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            if ((nVar.f132009a & 16) != 0) {
                ((C58970a) ((C58970a) tVar.f358898d.mo56224b()).mo56372aa(39094)).mo56386p("load card icon from IconBytes");
                C50729n nVar2 = doVar.f132314k;
                if (nVar2 == null) {
                    nVar2 = C50729n.f132007g;
                }
                return C60856cj.m92900i(Optional.m71637of(nVar2.f132013e));
            }
            ((C58970a) ((C58970a) tVar.f358898d.mo56224b()).mo56372aa(39093)).mo56386p("load card icon from url");
            C131244m mVar = tVar.f358899e;
            C50729n nVar3 = doVar.f132314k;
            if (nVar3 == null) {
                nVar3 = C50729n.f132007g;
            }
            return mVar.mo110127a(nVar3.f132011c);
        }
        C58970a aVar = (C58970a) ((C58970a) tVar.f358898d.mo56226d()).mo56372aa(39092);
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        aVar.mo56389s("Card icon is missing, card type: %s", a.name());
        return C60856cj.m92900i(Optional.empty());
    }
}
