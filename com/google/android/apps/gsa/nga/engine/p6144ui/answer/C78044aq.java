package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.aq */
/* compiled from: PG */
public final /* synthetic */ class C78044aq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ConfirmCancelCountDownLayout f214995a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f214996b;

    public /* synthetic */ C78044aq(ConfirmCancelCountDownLayout confirmCancelCountDownLayout, Runnable runnable) {
        this.f214995a = confirmCancelCountDownLayout;
        this.f214996b = runnable;
    }

    public final void onClick(View view) {
        ConfirmCancelCountDownLayout confirmCancelCountDownLayout = this.f214995a;
        Runnable runnable = this.f214996b;
        confirmCancelCountDownLayout.mo72980c();
        synchronized (confirmCancelCountDownLayout.f214911b) {
            confirmCancelCountDownLayout.f214913d = null;
            confirmCancelCountDownLayout.f214914e = null;
        }
        runnable.run();
    }
}
