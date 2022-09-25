package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28288f;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.o */
/* compiled from: PG */
public final /* synthetic */ class C94578o implements C28288f {

    /* renamed from: a */
    public final /* synthetic */ C94580q f264547a;

    public /* synthetic */ C94578o(C94580q qVar) {
        this.f264547a = qVar;
    }

    /* renamed from: a */
    public final void mo33781a() {
        C94580q qVar = this.f264547a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) qVar.getView();
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        C28295m.m52919e(recyclerView, new C28292j(44483));
        C89949q.m146521e(C28285c.m52876c(C28293k.m52907d(C28295m.m52915a(recyclerView), C58485gu.m89846n(qVar.f264551e.mo88514b())), legacyOpaStandardPage), false);
        C94575l lVar = qVar.f264551e;
        int a = lVar.mo88513a(lVar.f264543c);
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146521e(C28285c.m52882i(recyclerView.findViewHolderForAdapterPosition(a).itemView, 5, (Integer) null), false);
    }
}
