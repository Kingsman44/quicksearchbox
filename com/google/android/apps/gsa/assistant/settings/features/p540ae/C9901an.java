package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.api.C74711bl;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.an */
/* compiled from: PG */
public final /* synthetic */ class C9901an implements C74711bl {

    /* renamed from: a */
    public final /* synthetic */ View f33960a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f33961b;

    public /* synthetic */ C9901an(View view, ViewGroup viewGroup) {
        this.f33960a = view;
        this.f33961b = viewGroup;
    }

    /* renamed from: a */
    public final void mo18102a() {
        View view = this.f33960a;
        ViewGroup viewGroup = this.f33961b;
        C59071e eVar = C9907at.f33970a;
        TransitionManager.beginDelayedTransition((ViewGroup) view.findViewById(R.id.app_bar));
        viewGroup.removeAllViews();
    }
}
