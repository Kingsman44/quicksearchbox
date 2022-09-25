package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C91931g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C91932h f256390a;

    public /* synthetic */ C91931g(C91932h hVar) {
        this.f256390a = hVar;
    }

    public final void run() {
        View view;
        C91932h hVar = this.f256390a;
        ViewGroup viewGroup = (ViewGroup) hVar.f256391b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(hVar.f256391b);
            if (hVar.f256391b.getTag(R.id.cluster_card_embedded_question) != null && (view = (View) hVar.f256391b.getTag(R.id.cluster_card_embedded_question)) != null) {
                viewGroup.removeView(view);
            }
        }
    }
}
