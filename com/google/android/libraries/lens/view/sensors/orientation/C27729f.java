package com.google.android.libraries.lens.view.sensors.orientation;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.f */
/* compiled from: PG */
public final class C27729f {

    /* renamed from: a */
    public final Context f75705a;

    public C27729f(Context context) {
        this.f75705a = context;
    }

    /* renamed from: a */
    public static C27730g m51583a(WindowManager windowManager) {
        return new C27730g(windowManager.getDefaultDisplay().getRotation());
    }
}
