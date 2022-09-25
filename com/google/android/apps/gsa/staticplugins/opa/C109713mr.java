package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mr */
/* compiled from: PG */
public final /* synthetic */ class C109713mr implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109714ms f305671a;

    public /* synthetic */ C109713mr(C109714ms msVar) {
        this.f305671a = msVar;
    }

    public final void run() {
        Activity activity;
        WeakReference weakReference = this.f305671a.f305672a;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
            activity.finishAndRemoveTask();
        }
    }
}
