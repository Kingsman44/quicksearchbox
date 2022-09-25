package com.google.android.setupcompat.p3550b;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.google.android.setupcompat.b.f */
/* compiled from: PG */
public final class C45249f {

    /* renamed from: a */
    public static final C45245b f118183a = new C45245b("SystemBarHelper");

    @Deprecated
    /* renamed from: a */
    public static void m80603a(Window window, Context context) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        C45248e eVar = new C45248e();
        eVar.f118180b = window;
        eVar.f118181c = 3;
        eVar.f118182d.run();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843857, 16843858});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static void m80604b(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() & -5635);
    }
}
