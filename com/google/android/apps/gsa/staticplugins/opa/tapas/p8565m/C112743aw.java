package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.aw */
/* compiled from: PG */
public final /* synthetic */ class C112743aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C112744ax f312516a;

    public /* synthetic */ C112743aw(C112744ax axVar) {
        this.f312516a = axVar;
    }

    public final void onClick(View view) {
        C112744ax axVar = this.f312516a;
        C112748ba baVar = (C112748ba) axVar.mBindingAdapter;
        if (baVar != null && axVar.getAbsoluteAdapterPosition() == baVar.mo99723a().size() - 1 && !baVar.f312529c) {
            baVar.f312529c = true;
            baVar.mObservable.mo2879a();
        }
    }
}
