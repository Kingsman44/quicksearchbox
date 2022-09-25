package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.view.View;
import com.google.android.libraries.p10982ad.C147445i;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.c */
/* compiled from: PG */
public final /* synthetic */ class C116211c implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C116214f f322251a;

    public /* synthetic */ C116211c(C116214f fVar) {
        this.f322251a = fVar;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C116214f fVar = this.f322251a;
        View view = fVar.f322258g;
        if (view != null) {
            float a = fVar.f322264m.mo124175a() * fVar.f322253b;
            view.setTranslationY(a);
            view.setTranslationZ(fVar.mo102604a(a));
            if (fVar.f322256e != -1) {
                view.setAlpha((float) Math.sqrt((double) Math.max((a * fVar.f322254c.mo102603a()) + 1.0f, 0.0f)));
            }
        }
    }
}
