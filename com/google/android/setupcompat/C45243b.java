package com.google.android.setupcompat;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.C45263k;

/* renamed from: com.google.android.setupcompat.b */
/* compiled from: PG */
public final /* synthetic */ class C45243b implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C45251c f118176a;

    public /* synthetic */ C45243b(C45251c cVar) {
        this.f118176a = cVar;
    }

    public final void onWindowFocusChanged(boolean z) {
        C45251c cVar = this.f118176a;
        C45263k a = C45263k.m80635a(cVar.getContext());
        String shortString = cVar.f118185a.getComponentName().toShortString();
        Activity activity = cVar.f118185a;
        Bundle bundle = new Bundle();
        bundle.putString("packageName", activity.getComponentName().getPackageName());
        bundle.putString("screenName", activity.getComponentName().getShortClassName());
        bundle.putInt("hash", cVar.hashCode());
        bundle.putBoolean("focus", z);
        bundle.putLong("timeInMillis", System.currentTimeMillis());
        a.mo49147g(shortString, bundle);
    }
}
