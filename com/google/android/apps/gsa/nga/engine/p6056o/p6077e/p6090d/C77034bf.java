package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bf */
/* compiled from: PG */
public final /* synthetic */ class C77034bf implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212619a;

    /* renamed from: b */
    public final /* synthetic */ long f212620b;

    /* renamed from: c */
    public final /* synthetic */ C77140u f212621c;

    public /* synthetic */ C77034bf(C77089dg dgVar, long j, C77140u uVar) {
        this.f212619a = dgVar;
        this.f212620b = j;
        this.f212621c = uVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212619a;
        long j = this.f212620b;
        C77140u uVar = this.f212621c;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) C77089dg.f212747a.mo56225c()).mo56372aa(3812)).mo56386p("No phone numbers for the contact");
            C77089dg.m123752h(uVar, C82835ce.CONTACT_WITH_NO_PHONE_NUMBER);
            return C80913i.m128773b(Optional.empty());
        }
        ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3811)).mo56387q("Need to disambiguate between %s candidates", guVar.size());
        return C80913i.m128774c(dgVar.f212749c.q(j, Optional.empty()));
    }
}
