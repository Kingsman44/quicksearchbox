package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import androidx.activity.C0800m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.h */
/* compiled from: PG */
final class C127853h extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C127855j f351893a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127853h(C127855j jVar) {
        super(true);
        this.f351893a = jVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C127852g gVar = this.f351893a.f351904k;
        if (gVar != null) {
            gVar.getActivity().finish();
            this.f351893a.f351904k.getActivity().overridePendingTransition(0, 0);
        }
    }
}
