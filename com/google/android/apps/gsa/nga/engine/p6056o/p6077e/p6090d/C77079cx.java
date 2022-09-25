package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cx */
/* compiled from: PG */
public final /* synthetic */ class C77079cx implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212731a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f212732b;

    public /* synthetic */ C77079cx(C77140u uVar, C58485gu guVar) {
        this.f212731a = uVar;
        this.f212732b = guVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77140u uVar = this.f212731a;
        C58485gu guVar = this.f212732b;
        C58485gu guVar2 = (C58485gu) obj;
        if (guVar2.size() == 1) {
            return C80913i.m128774c(C80905at.m128759c(guVar, new C77074cs((Long) guVar2.get(0))));
        }
        ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3810)).mo56386p("AUM failed to resolve contact");
        C77089dg.m123752h(uVar, C82835ce.AUM_CONTACT_NOT_RESOLVED);
        return C80913i.m128773b(Optional.empty());
    }
}
