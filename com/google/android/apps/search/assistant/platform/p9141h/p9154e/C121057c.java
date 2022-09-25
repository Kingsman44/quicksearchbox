package com.google.android.apps.search.assistant.platform.p9141h.p9154e;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121054e;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121055f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.h.e.c */
/* compiled from: PG */
public final /* synthetic */ class C121057c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121055f f336459a;

    public /* synthetic */ C121057c(C121055f fVar) {
        this.f336459a = fVar;
    }

    public final Object apply(Object obj) {
        C121055f fVar = this.f336459a;
        C9857y yVar = (C9857y) obj;
        ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35688)).mo56386p("#migrate(): Lockscreen Setting data migration running now.");
        C121054e eVar = (C121054e) fVar.toBuilder();
        C9855w a = C9855w.m24617a(yVar.f33886b);
        if (a == null) {
            a = C9855w.STANDBY;
        }
        if (a == C9855w.ENABLED) {
            ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35693)).mo56386p("#migrate(): migrate AOL to ENABLED.");
            C121053d dVar = C121053d.ENABLED;
            eVar.copyOnWrite();
            C121055f fVar2 = (C121055f) eVar.instance;
            fVar2.f336455b = dVar.f336451d;
            fVar2.f336454a |= 1;
        } else {
            C9855w a2 = C9855w.m24617a(yVar.f33886b);
            if (a2 == null) {
                a2 = C9855w.STANDBY;
            }
            if (a2 == C9855w.DISABLED) {
                ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35692)).mo56386p("#migrate(): migrate AOL to DISABLED.");
                C121053d dVar2 = C121053d.DISABLED;
                eVar.copyOnWrite();
                C121055f fVar3 = (C121055f) eVar.instance;
                fVar3.f336455b = dVar2.f336451d;
                fVar3.f336454a |= 1;
            } else {
                ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35689)).mo56386p("#migrate(): migrate AOL to STANDBY_UNSPECIFIED.");
                C121053d dVar3 = C121053d.STANDBY_UNSPECIFIED;
                eVar.copyOnWrite();
                C121055f fVar4 = (C121055f) eVar.instance;
                fVar4.f336455b = dVar3.f336451d;
                fVar4.f336454a |= 1;
            }
        }
        C121055f fVar5 = (C121055f) eVar.instance;
        if ((fVar5.f336454a & 1) != 0) {
            C121053d a3 = C121053d.m200347a(fVar5.f336455b);
            if (a3 == null) {
                a3 = C121053d.STANDBY_UNSPECIFIED;
            }
            if (a3 != C121053d.STANDBY_UNSPECIFIED && yVar.f33887c) {
                ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35691)).mo56386p("#migrate(): migrate SVR to TRUE.");
                eVar.copyOnWrite();
                C121055f fVar6 = (C121055f) eVar.instance;
                fVar6.f336454a |= 2;
                fVar6.f336456c = true;
                return (C121055f) eVar.build();
            }
        }
        ((C59052c) ((C59052c) C121058d.f336460a.mo56224b()).mo56372aa(35690)).mo56386p("#migrate(): migrate SVR to False.");
        eVar.copyOnWrite();
        C121055f fVar7 = (C121055f) eVar.instance;
        fVar7.f336454a |= 2;
        fVar7.f336456c = false;
        return (C121055f) eVar.build();
    }
}
