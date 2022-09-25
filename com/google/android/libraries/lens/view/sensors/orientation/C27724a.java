package com.google.android.libraries.lens.view.sensors.orientation;

import android.view.OrientationEventListener;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.a */
/* compiled from: PG */
public final /* synthetic */ class C27724a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27727d f75694a;

    public /* synthetic */ C27724a(C27727d dVar) {
        this.f75694a = dVar;
    }

    public final Object call() {
        C27727d dVar = this.f75694a;
        OrientationEventListener orientationEventListener = dVar.f75701e;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            dVar.f75701e = null;
        }
        return null;
    }
}
