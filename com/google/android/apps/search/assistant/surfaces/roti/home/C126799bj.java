package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.activity.C0800m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bj */
/* compiled from: PG */
final class C126799bj extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C126804bo f349189a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126799bj(C126804bo boVar) {
        super(true);
        this.f349189a = boVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C126804bo boVar = this.f349189a;
        C126795bf bfVar = boVar.f349216d;
        if (bfVar != null) {
            boVar.f349207K = 2;
            bfVar.getActivity().finish();
            this.f349189a.f349216d.getActivity().overridePendingTransition(0, 0);
        }
    }
}
