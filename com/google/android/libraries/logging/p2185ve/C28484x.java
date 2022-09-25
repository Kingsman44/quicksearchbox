package com.google.android.libraries.logging.p2185ve;

import android.view.ViewTreeObserver;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.logging.ve.x */
/* compiled from: PG */
public final /* synthetic */ class C28484x implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final /* synthetic */ C28485y f77297a;

    public /* synthetic */ C28484x(C28485y yVar) {
        this.f77297a = yVar;
    }

    public final void onDraw() {
        C28485y yVar = this.f77297a;
        if (!yVar.f77301c && yVar.f77300b.isDirty() && yVar.f77303e == null) {
            yVar.f77303e = new C28483w(yVar);
            C19559g.m37302a().postDelayed(yVar.f77303e, (long) yVar.f77302d.f77212b);
        }
    }
}
