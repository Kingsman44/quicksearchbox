package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125139dm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C126008h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126018r f347276a;

    /* renamed from: b */
    public final /* synthetic */ C126035k f347277b;

    public /* synthetic */ C126008h(C126018r rVar, C126035k kVar) {
        this.f347276a = rVar;
        this.f347277b = kVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        int i;
        int i2;
        C126018r rVar = this.f347276a;
        C126035k kVar = this.f347277b;
        C125139dm dmVar = (C125139dm) obj;
        if (dmVar.f345216a.isEmpty()) {
            return C58485gu.m89845m();
        }
        if (rVar.f347295g) {
            if (!dmVar.f345216a.isEmpty()) {
                C125141do doVar = ((C125143dq) dmVar.f345216a.get(0)).f345224b;
                if (doVar == null) {
                    doVar = C125141do.f345217c;
                }
                if (!doVar.f345219a.isEmpty()) {
                    C125141do doVar2 = ((C125143dq) dmVar.f345216a.get(0)).f345224b;
                    if (doVar2 == null) {
                        doVar2 = C125141do.f345217c;
                    }
                    if (!doVar2.f345220b.isEmpty()) {
                        optional = Optional.m71637of((C125143dq) dmVar.f345216a.get(0));
                    }
                }
            }
            optional = Optional.empty();
        } else {
            optional = Collection.EL.stream(dmVar.f345216a).filter(C126016p.f347287a).findFirst();
        }
        C58485gu guVar = (C58485gu) optional.map(new C126009i(dmVar)).orElseGet(new C126010j(dmVar));
        C58480gp e = C58485gu.m89837e();
        Optional optional2 = (Optional) optional.map(new C126011k(rVar, kVar)).orElseGet(new C126012l(rVar, kVar));
        if (optional2.isPresent()) {
            e.mo55395g((C126032h) optional2.get());
            i = ((C126032h) optional2.get()).mo107228e().length();
            if (((C126032h) optional2.get()).mo107230f() == 4) {
                i += ((C126032h) optional2.get()).mo107227d().length() + 1;
            }
            i2 = 1;
        } else {
            i2 = 0;
            i = 0;
        }
        int size = guVar.size();
        int i3 = 0;
        while (i3 < size) {
            C125143dq dqVar = (C125143dq) guVar.get(i3);
            if (((long) (dqVar.f345223a.length() + i)) <= rVar.f347294f) {
                e.mo55395g(rVar.f347289a.mo107345d(dqVar, false, ((C126029e) kVar).f347344e));
                i += dqVar.f345223a.length();
                i2++;
                i3++;
                if (((long) i2) == rVar.f347293e) {
                    break;
                }
            } else {
                return e.mo55394f();
            }
        }
        return e.mo55394f();
    }
}
