package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import android.view.View;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.n */
/* compiled from: PG */
final class C126753n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C126752m f349068a;

    public C126753n(C126752m mVar) {
        this.f349068a = mVar;
    }

    public final void onClick(View view) {
        C126752m mVar = this.f349068a;
        mVar.f349063f.getActivity().finish();
        mVar.f349063f.getActivity().overridePendingTransition(0, 0);
    }
}
