package com.google.android.libraries.material.featurehighlight;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.libraries.material.featurehighlight.g */
/* compiled from: PG */
public final /* synthetic */ class C28525g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28530l f77503a;

    public /* synthetic */ C28525g(C28530l lVar) {
        this.f77503a = lVar;
    }

    public final void run() {
        View view;
        C28530l lVar = this.f77503a;
        C28512ac acVar = lVar.f77538g;
        if (acVar != null) {
            acVar.bringToFront();
            if (!lVar.f77542k) {
                lVar.f77542k = true;
                lVar.mo34075b();
                C0167am activity = lVar.getActivity();
                if (activity == null) {
                    view = null;
                } else {
                    view = lVar.f77532a.mo33963a(activity, lVar.mo34074a());
                }
                if (view == null) {
                    lVar.mo34076c();
                    return;
                }
                lVar.f77538g.f77418k = lVar.mo34074a();
                lVar.f77538g.mo34006g(new C28529k(lVar));
                if (lVar.f77539h != 1) {
                    return;
                }
                if (lVar.f77541j) {
                    C28512ac acVar2 = lVar.f77538g;
                    acVar2.mo34012j(view);
                    acVar2.addOnLayoutChangeListener(new C28538t(acVar2));
                    acVar2.requestLayout();
                    return;
                }
                C28512ac acVar3 = lVar.f77538g;
                C28528j jVar = new C28528j(lVar);
                acVar3.mo34012j(view);
                acVar3.addOnLayoutChangeListener(new C28537s(acVar3, jVar));
                acVar3.requestLayout();
            }
        }
    }
}
