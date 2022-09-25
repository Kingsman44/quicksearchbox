package com.google.android.libraries.web.shared.lifecycle;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.e */
/* compiled from: PG */
public final /* synthetic */ class C44104e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C44105f f114800a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f114801b;

    public /* synthetic */ C44104e(C44105f fVar, Runnable runnable) {
        this.f114800a = fVar;
        this.f114801b = runnable;
    }

    public final void run() {
        C44105f fVar = this.f114800a;
        Runnable runnable = this.f114801b;
        Fragment fragment = fVar.f114803b;
        if (fragment != null && fragment.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            runnable.run();
        }
    }
}
