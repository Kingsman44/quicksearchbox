package com.google.android.apps.gsa.sidekick.main;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.sidekick.main.a */
/* compiled from: PG */
public final class C91238a implements C118549h {

    /* renamed from: a */
    private final C86054o f254655a;

    /* renamed from: b */
    private final C85651bb f254656b;

    /* renamed from: c */
    private final C85637av f254657c;

    public C91238a(C86054o oVar, C85651bb bbVar, C85637av avVar) {
        this.f254655a = oVar;
        this.f254656b = bbVar;
        this.f254657c = avVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Account a = this.f254655a.mo79668a();
        if (a == null) {
            return C118826c.f331423b;
        }
        this.f254656b.mo79143d(a.name);
        C58976aa aaVar = C58975e.f156826a;
        boolean z = !this.f254656b.mo79130C(a.name);
        if (this.f254656b.mo79137J(a.name) && z) {
            this.f254657c.mo79116b(a, C7891nu.AUTO_ACTIVATION_TASK);
        }
        return C118826c.f331423b;
    }
}
