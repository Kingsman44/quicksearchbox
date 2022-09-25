package com.google.android.apps.gsa.search.core.p6809l;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7146u.C90616a;
import com.google.android.apps.gsa.shared.p7146u.C90619c;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.gms.appdatasearch.C142805b;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.common.api.C143848t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.l.p */
/* compiled from: PG */
final class C86167p extends C90619c {
    public C86167p(Context context, C90929bz bzVar) {
        super("UsageReportingWrapper", context, bzVar, 30000);
    }

    /* renamed from: a */
    public final C60870cx mo79808a(GetRecentContextCall$Request getRecentContextCall$Request) {
        C90616a aVar = new C90616a(this, new C86166o(this, getRecentContextCall$Request), this.f253316a);
        C58976aa aaVar = C58975e.f156826a;
        super.mo84772f();
        synchronized (this.f253321f) {
            this.f253323h.add(aVar);
            if (this.f253319d.mo119133h()) {
                super.mo84773g();
                this.f253318c.mo85139d(aVar);
            } else {
                this.f253322g.add(aVar);
                if (!this.f253319d.mo119133h() && !this.f253319d.mo119134i() && !this.f253320e.hasMessages(100)) {
                    this.f253320e.sendEmptyMessage(100);
                }
            }
        }
        C90476a aVar2 = C91018d.f254254a;
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79809b(C143848t tVar) {
        tVar.mo119296c(C142805b.f387602b);
    }
}
