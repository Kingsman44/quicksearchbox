package com.google.apps.tiktok.concurrent.futuresmixin;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.o */
/* compiled from: PG */
public final /* synthetic */ class C46449o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FuturesMixinViewModel f121549a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f121550b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f121551c;

    public /* synthetic */ C46449o(FuturesMixinViewModel futuresMixinViewModel, ParcelableFuture parcelableFuture, Throwable th) {
        this.f121549a = futuresMixinViewModel;
        this.f121550b = parcelableFuture;
        this.f121551c = th;
    }

    public final void run() {
        FuturesMixinViewModel futuresMixinViewModel = this.f121549a;
        ParcelableFuture parcelableFuture = this.f121550b;
        Throwable th = this.f121551c;
        if (futuresMixinViewModel.f121525e && futuresMixinViewModel.f121523c.remove(parcelableFuture)) {
            C46440f fVar = (C46440f) futuresMixinViewModel.f121522b.mo50439b(parcelableFuture.f121528a);
            C47558bi t = C47831fm.m85025t("onFailure FuturesMixin", C47562bm.f123426a, true);
            try {
                fVar.mo18066a(parcelableFuture.f121531d, th);
                t.close();
                return;
            } catch (Throwable th2) {
                C46447m.m82822a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
