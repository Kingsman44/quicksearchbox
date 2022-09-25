package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.view.View;
import com.google.android.apps.gsa.shared.util.ViewReferenceParcelable;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.i */
/* compiled from: PG */
public final /* synthetic */ class C100066i implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100077t f279881a;

    public /* synthetic */ C100066i(C100077t tVar) {
        this.f279881a = tVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100077t tVar = this.f279881a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            tVar.f279898d.f279842m = new C100071n(tVar);
        }
        C100057ax axVar2 = tVar.f279898d;
        if (axVar.mo56113h()) {
            View view = ((ViewReferenceParcelable) axVar.mo56107c()).f253768a;
            View view2 = axVar2.f279840k;
            if (!(view2 == null || view2 == view)) {
                axVar2.mo91732a();
            }
            axVar2.f279840k = view;
            axVar2.mo91733b();
        }
    }
}
