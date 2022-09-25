package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.o */
/* compiled from: PG */
public final class C97119o {

    /* renamed from: a */
    public final C97112h f271360a;

    /* renamed from: b */
    public final View f271361b;

    /* renamed from: c */
    public final View f271362c;

    /* renamed from: d */
    public final View f271363d;

    /* renamed from: e */
    public final C97120p f271364e;

    public C97119o(WindowManager windowManager, DisplayManager displayManager, C97112h hVar, View view, View view2, View view3) {
        this.f271360a = hVar;
        this.f271361b = view;
        this.f271362c = view2.findViewById(R.id.bubble_extended_card);
        this.f271363d = view2;
        this.f271364e = new C97120p(windowManager, displayManager, view2, view3);
    }
}
