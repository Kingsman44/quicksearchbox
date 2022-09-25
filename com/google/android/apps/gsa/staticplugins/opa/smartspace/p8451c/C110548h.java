package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7041h.C89777i;
import com.google.android.apps.gsa.shared.p7041h.C89778j;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58833ax;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.h */
/* compiled from: PG */
public final /* synthetic */ class C110548h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308201a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f308202b;

    public /* synthetic */ C110548h(C110559s sVar, C58833ax axVar) {
        this.f308201a = sVar;
        this.f308202b = axVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308201a;
        C58833ax axVar = this.f308202b;
        C89777i iVar = (C89777i) C89778j.f242996b.createBuilder();
        iVar.mo83622a((Collection) obj);
        if (!axVar.equals(sVar.mo98763d(C58833ax.m90834k((C89778j) iVar.build())))) {
            C95883aa.m158983d(sVar.f308227f.mo56226d(), "Next calendar event from OpaStore is different with next event from calendar content provider.", 26547, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_NEXT_CALENDAR_EVENT_OUT_OF_SYNC_VALUE));
        }
    }
}
