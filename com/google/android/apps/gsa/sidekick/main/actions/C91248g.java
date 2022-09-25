package com.google.android.apps.gsa.sidekick.main.actions;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.g */
/* compiled from: PG */
final class C91248g implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ EditReminderView f254686a;

    public C91248g(EditReminderView editReminderView) {
        this.f254686a = editReminderView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f254686a.f254663a.hasFocus()) {
            return false;
        }
        this.f254686a.f254663a.clearFocus();
        return false;
    }
}
