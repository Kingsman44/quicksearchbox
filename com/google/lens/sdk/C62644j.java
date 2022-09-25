package com.google.lens.sdk;

import android.app.KeyguardManager;
import android.util.Log;
import com.google.lens.sdk.LensApi;

/* renamed from: com.google.lens.sdk.j */
/* compiled from: PG */
final class C62644j extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Runnable f169149a;

    /* renamed from: b */
    final /* synthetic */ LensApi.LensLaunchStatusCallback f169150b;

    public C62644j(Runnable runnable, LensApi.LensLaunchStatusCallback lensLaunchStatusCallback) {
        this.f169149a = runnable;
        this.f169150b = lensLaunchStatusCallback;
    }

    public final void onDismissCancelled() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f169150b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
        Log.d("LensApi", "Keyguard dismiss cancelled");
    }

    public final void onDismissError() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f169150b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
        Log.e("LensApi", "Error dismissing keyguard");
    }

    public final void onDismissSucceeded() {
        Log.d("LensApi", "Keyguard successfully dismissed");
        this.f169149a.run();
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f169150b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(0);
        }
    }
}
