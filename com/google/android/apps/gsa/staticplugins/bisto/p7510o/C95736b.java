package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import androidx.core.app.C1832s;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89632c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95579a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95602aw;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95606b;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b */
/* compiled from: PG */
public final class C95736b {

    /* renamed from: a */
    public final AtomicReference f268042a = new AtomicReference();

    /* renamed from: a */
    public final C142359ck mo89722a(List list) {
        C95606b bVar;
        C1832s a;
        if (!list.isEmpty() && (bVar = (C95606b) this.f268042a.get()) != null) {
            C58976aa aaVar = C58975e.f156826a;
            C95602aw awVar = bVar.f267565c;
            if (awVar.mo89555e() && (a = awVar.mo89552a()) != null) {
                C89632c.m145884b(bVar.f267563a, a, (String) null, new C95579a(bVar));
                return (C142359ck) list.get(0);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo89723b() {
        C95606b bVar = (C95606b) this.f268042a.get();
        return bVar != null && bVar.f267565c.mo89555e();
    }
}
