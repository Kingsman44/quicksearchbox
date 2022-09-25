package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.util.C87493o;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55293n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.b */
/* compiled from: PG */
public final class C105946b {

    /* renamed from: a */
    public final Context f295789a;

    /* renamed from: b */
    public C91097g f295790b;

    public C105946b(Context context) {
        this.f295789a = context;
    }

    /* renamed from: a */
    public final void mo95184a(View view, C55293n nVar) {
        if (nVar != null) {
            Intent a = C87493o.m142019a(nVar);
            C58976aa aaVar = C58975e.f156826a;
            view.setOnClickListener(new C105919a(this, a));
        }
    }
}
