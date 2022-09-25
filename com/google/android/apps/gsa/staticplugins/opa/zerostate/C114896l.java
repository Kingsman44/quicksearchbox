package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.l */
/* compiled from: PG */
final class C114896l implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ C114966q f318781a;

    public C114896l(C114966q qVar) {
        this.f318781a = qVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (!rVar.mo83040a()) {
            this.f318781a.mo101756A(false);
            return;
        }
        View view = this.f318781a.f319034B;
        if (view != null) {
            view.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f318781a.f319060y;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.mo8794l(true, false);
        }
        this.f318781a.f319057v = true;
    }
}
