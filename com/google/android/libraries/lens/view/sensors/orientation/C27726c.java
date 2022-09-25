package com.google.android.libraries.lens.view.sensors.orientation;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.c */
/* compiled from: PG */
final class C27726c extends OrientationEventListener {

    /* renamed from: a */
    final /* synthetic */ C27727d f75696a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27726c(C27727d dVar, Context context) {
        super(context, 2);
        this.f75696a = dVar;
    }

    public final void onOrientationChanged(int i) {
        this.f75696a.f75702f = i;
    }
}
