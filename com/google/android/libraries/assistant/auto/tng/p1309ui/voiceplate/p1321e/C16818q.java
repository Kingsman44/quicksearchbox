package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.q */
/* compiled from: PG */
public final /* synthetic */ class C16818q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16820s f49250a;

    public /* synthetic */ C16818q(C16820s sVar) {
        this.f49250a = sVar;
    }

    public final void run() {
        ViewGroup viewGroup = (ViewGroup) this.f49250a.f49254c.findViewById(R.id.app_actions_view);
        if (viewGroup != null) {
            C16820s.m33853b(viewGroup);
            viewGroup.setVisibility(8);
        }
    }
}
