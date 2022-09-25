package com.google.android.apps.gsa.sidekick.main.optin;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.n */
/* compiled from: PG */
final class C91569n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C91574s f255412a;

    public C91569n(C91574s sVar) {
        this.f255412a = sVar;
    }

    public final void onClick(View view) {
        OptInActivity optInActivity = this.f255412a.f255418a;
        C58976aa aaVar = C58975e.f156826a;
        optInActivity.mo85942z(12);
        C90476a aVar = C91018d.f254254a;
        try {
            optInActivity.f255360A.addAccount("com.google", (String) null, (String[]) null, (Bundle) null, optInActivity, new C91562g(optInActivity), (Handler) null);
        } catch (IllegalStateException unused) {
            optInActivity.mo85942z(14);
            optInActivity.mo85935C(1);
        }
        this.f255412a.dismiss();
        return;
    }
}
