package com.google.android.libraries.lens.view.sensors.orientation;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.h */
/* compiled from: PG */
public final class C27731h {

    /* renamed from: a */
    private final Context f75707a;

    /* renamed from: b */
    private WindowManager f75708b;

    public C27731h(Context context) {
        this.f75707a = context;
    }

    /* renamed from: a */
    public final C27730g mo33218a() {
        if (this.f75708b == null) {
            WindowManager windowManager = (WindowManager) this.f75707a.getSystemService("window");
            windowManager.getClass();
            this.f75708b = windowManager;
        }
        return new C27730g(this.f75708b.getDefaultDisplay().getRotation());
    }
}
