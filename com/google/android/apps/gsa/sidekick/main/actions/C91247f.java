package com.google.android.apps.gsa.sidekick.main.actions;

import com.google.android.apps.gsa.shared.p7148ui.C90661bf;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.f */
/* compiled from: PG */
final class C91247f extends C90661bf {

    /* renamed from: a */
    final /* synthetic */ EditReminderView f254685a;

    public C91247f(EditReminderView editReminderView) {
        this.f254685a = editReminderView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo84957a() {
        if (!this.f254685a.f254663a.hasFocus()) {
            return false;
        }
        this.f254685a.f254663a.clearFocus();
        return false;
    }
}
