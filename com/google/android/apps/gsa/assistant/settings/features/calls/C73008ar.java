package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.ar */
/* compiled from: PG */
public final class C73008ar extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public aq f193649h;

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f12806a.mo8400a(new ColorDrawable(0));
        this.f12806a.mo8401b(0);
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        return this.f193649h;
    }
}
