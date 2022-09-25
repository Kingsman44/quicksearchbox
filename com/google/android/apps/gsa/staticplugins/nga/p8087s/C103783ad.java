package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.apps.gsa.nga.shared.p6345h.C81278bi;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102909ar;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.aea;
import com.google.knowledge.p4671b.C61826s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.ad */
/* compiled from: PG */
public final /* synthetic */ class C103783ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C103787ah f288979a;

    /* renamed from: b */
    public final /* synthetic */ C9857y f288980b;

    public /* synthetic */ C103783ad(C103787ah ahVar, C9857y yVar) {
        this.f288979a = ahVar;
        this.f288980b = yVar;
    }

    public final Object apply(Object obj) {
        C61826s sVar;
        C103787ah ahVar = this.f288979a;
        C9857y yVar = this.f288980b;
        C81278bi biVar = (C81278bi) ((C81280bk) Objects.requireNonNull((C81280bk) obj)).toBuilder();
        boolean e = ((C9388a) ahVar.f288992j.mo27525b()).mo17583e();
        biVar.copyOnWrite();
        C81280bk bkVar = (C81280bk) biVar.instance;
        bkVar.f222498a |= 4;
        bkVar.f222501d = e;
        boolean l = ((C85664bo) ahVar.f288989g.mo27525b()).mo79197l(C85662bm.WEB_AND_APP_HISTORY);
        biVar.copyOnWrite();
        C81280bk bkVar2 = (C81280bk) biVar.instance;
        bkVar2.f222498a |= 1;
        bkVar2.f222499b = l;
        boolean l2 = ((C85664bo) ahVar.f288989g.mo27525b()).mo79197l(C85662bm.WEB_HISTORY);
        biVar.copyOnWrite();
        C81280bk bkVar3 = (C81280bk) biVar.instance;
        bkVar3.f222498a |= 2;
        bkVar3.f222500c = l2;
        boolean A = ((C89994f) ahVar.f288990h.mo27525b()).mo83835A();
        biVar.copyOnWrite();
        C81280bk bkVar4 = (C81280bk) biVar.instance;
        bkVar4.f222498a |= 16;
        bkVar4.f222503f = A;
        C9855w a = C9855w.m24617a(yVar.f33886b);
        if (a == null) {
            a = C9855w.STANDBY;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else if (ordinal == 1) {
            sVar = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        } else if (ordinal != 2) {
            sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        biVar.copyOnWrite();
        C81280bk bkVar5 = (C81280bk) biVar.instance;
        bkVar5.f222504g = sVar.f167079d;
        bkVar5.f222498a |= 32;
        boolean z = yVar.f33887c;
        biVar.copyOnWrite();
        C81280bk bkVar6 = (C81280bk) biVar.instance;
        bkVar6.f222498a |= 64;
        bkVar6.f222505h = z;
        boolean l3 = ((C85664bo) ahVar.f288989g.mo27525b()).mo79197l(C85662bm.AUDIO_HISTORY);
        biVar.copyOnWrite();
        C81280bk bkVar7 = (C81280bk) biVar.instance;
        bkVar7.f222498a |= 128;
        bkVar7.f222506i = l3;
        boolean equals = ((C102909ar) ahVar.f288991i.mo27525b()).mo93526f().equals(aea.NO_DASHER_ACCOUNT_PRESENT);
        biVar.copyOnWrite();
        C81280bk bkVar8 = (C81280bk) biVar.instance;
        bkVar8.f222498a |= 256;
        bkVar8.f222507j = !equals;
        return (C81280bk) biVar.build();
    }
}
