package com.google.android.apps.gsa.assistant.settings.features.help;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.help.a */
/* compiled from: PG */
final class C73098a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DiscoverabilityTipPreference f193812a;

    public C73098a(DiscoverabilityTipPreference discoverabilityTipPreference) {
        this.f193812a = discoverabilityTipPreference;
    }

    public final void onClick(View view) {
        DiscoverabilityTipPreference discoverabilityTipPreference = this.f193812a;
        if (discoverabilityTipPreference.f193805c == 0) {
            discoverabilityTipPreference.f193805c = 8;
            discoverabilityTipPreference.mo64702j();
            return;
        }
        discoverabilityTipPreference.f193805c = 0;
        discoverabilityTipPreference.mo64702j();
    }
}
