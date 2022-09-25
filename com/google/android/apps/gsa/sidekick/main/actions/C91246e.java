package com.google.android.apps.gsa.sidekick.main.actions;

import android.view.View;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.e */
/* compiled from: PG */
final class C91246e implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditReminderView f254684a;

    public C91246e(EditReminderView editReminderView) {
        this.f254684a = editReminderView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            C90772bp.m148317y(this.f254684a.getContext(), this.f254684a.f254663a);
        }
    }
}
