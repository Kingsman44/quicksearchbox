package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.activity.C0800m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cb */
/* compiled from: PG */
final class C126820cb extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C126824cf f349255a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126820cb(C126824cf cfVar) {
        super(true);
        this.f349255a = cfVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C126824cf cfVar = this.f349255a;
        C126817bz bzVar = cfVar.f349263d;
        if (bzVar != null) {
            cfVar.f349282w = 2;
            bzVar.getActivity().finish();
            this.f349255a.f349263d.getActivity().overridePendingTransition(0, 0);
        }
    }
}
