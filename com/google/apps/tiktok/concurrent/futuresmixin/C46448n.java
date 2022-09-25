package com.google.apps.tiktok.concurrent.futuresmixin;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.n */
/* compiled from: PG */
public final /* synthetic */ class C46448n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FuturesMixinViewModel f121546a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f121547b;

    /* renamed from: c */
    public final /* synthetic */ Object f121548c;

    public /* synthetic */ C46448n(FuturesMixinViewModel futuresMixinViewModel, ParcelableFuture parcelableFuture, Object obj) {
        this.f121546a = futuresMixinViewModel;
        this.f121547b = parcelableFuture;
        this.f121548c = obj;
    }

    public final void run() {
        FuturesMixinViewModel futuresMixinViewModel = this.f121546a;
        ParcelableFuture parcelableFuture = this.f121547b;
        Object obj = this.f121548c;
        if (futuresMixinViewModel.f121525e && futuresMixinViewModel.f121523c.remove(parcelableFuture)) {
            C46440f fVar = (C46440f) futuresMixinViewModel.f121522b.mo50439b(parcelableFuture.f121528a);
            C47558bi t = C47831fm.m85025t("onSuccess FuturesMixin", C47562bm.f123426a, true);
            try {
                fVar.mo18067c(parcelableFuture.f121531d, obj);
                t.close();
                return;
            } catch (Throwable th) {
                C46447m.m82822a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
