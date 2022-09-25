package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.p */
/* compiled from: PG */
public final class C97120p {

    /* renamed from: j */
    private static final C147454r f271365j = new C147454r(400.0f, 0.75f);

    /* renamed from: k */
    private static final C147454r f271366k = new C147454r(500.0f, 0.65f);

    /* renamed from: a */
    public final WindowManager f271367a;

    /* renamed from: b */
    public final DisplayManager f271368b;

    /* renamed from: c */
    public final View f271369c;

    /* renamed from: d */
    public final View f271370d;

    /* renamed from: e */
    public final C147444h f271371e;

    /* renamed from: f */
    public final C147444h f271372f;

    /* renamed from: g */
    public final C147444h f271373g;

    /* renamed from: h */
    public final C147444h f271374h;

    /* renamed from: i */
    public final C147444h f271375i;

    public C97120p(WindowManager windowManager, DisplayManager displayManager, View view, View view2) {
        this.f271367a = windowManager;
        this.f271368b = displayManager;
        this.f271369c = view;
        this.f271370d = view2;
        View findViewById = view.findViewById(R.id.bubble_extended_card);
        C147444h hVar = new C147444h(findViewById, View.SCALE_X);
        C147454r rVar = f271365j;
        hVar.f397996b = rVar;
        this.f271373g = hVar;
        C147444h hVar2 = new C147444h(findViewById, View.SCALE_Y);
        hVar2.f397996b = rVar;
        this.f271374h = hVar2;
        C147444h hVar3 = new C147444h(findViewById, View.TRANSLATION_X);
        C147454r rVar2 = f271366k;
        hVar3.f397996b = rVar2;
        this.f271371e = hVar3;
        C147444h hVar4 = new C147444h(findViewById, View.TRANSLATION_Y);
        hVar4.f397996b = rVar2;
        this.f271372f = hVar4;
        C147444h hVar5 = new C147444h(view.findViewById(R.id.bubble_extended_card_content), View.ALPHA);
        hVar5.mo124187m(0.0f, 1.0f);
        this.f271375i = hVar5;
    }
}
