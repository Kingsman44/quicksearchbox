package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.os.CountDownTimer;
import android.widget.ProgressBar;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.as */
/* compiled from: PG */
final class C78046as extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ long f214998a;

    /* renamed from: b */
    final /* synthetic */ ProgressBar f214999b;

    /* renamed from: c */
    final /* synthetic */ Runnable f215000c;

    /* renamed from: d */
    final /* synthetic */ ConfirmCancelCountDownLayout f215001d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78046as(ConfirmCancelCountDownLayout confirmCancelCountDownLayout, long j, long j2, long j3, ProgressBar progressBar, Runnable runnable) {
        super(j, j2);
        this.f215001d = confirmCancelCountDownLayout;
        this.f214998a = j3;
        this.f214999b = progressBar;
        this.f215000c = runnable;
    }

    public final void onFinish() {
        synchronized (this.f215001d.f214911b) {
            ConfirmCancelCountDownLayout confirmCancelCountDownLayout = this.f215001d;
            confirmCancelCountDownLayout.f214913d = null;
            confirmCancelCountDownLayout.f214914e = null;
        }
        this.f215000c.run();
    }

    public final void onTick(long j) {
        this.f214999b.setProgress(100 - ((((int) j) * 100) / ((int) this.f214998a)));
    }
}
