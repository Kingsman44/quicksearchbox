package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.q */
/* compiled from: PG */
public final class C40145q {

    /* renamed from: j */
    private static final C147454r f105453j = new C147454r(400.0f, 0.75f);

    /* renamed from: k */
    private static final C147454r f105454k = new C147454r(500.0f, 0.65f);

    /* renamed from: a */
    public final WindowManager f105455a;

    /* renamed from: b */
    public final DisplayManager f105456b;

    /* renamed from: c */
    public final View f105457c;

    /* renamed from: d */
    public final View f105458d;

    /* renamed from: e */
    public final C147444h f105459e;

    /* renamed from: f */
    public final C147444h f105460f;

    /* renamed from: g */
    public final C147444h f105461g;

    /* renamed from: h */
    public final C147444h f105462h;

    /* renamed from: i */
    public final C147444h f105463i;

    public C40145q(WindowManager windowManager, DisplayManager displayManager, View view, View view2) {
        this.f105455a = windowManager;
        this.f105456b = displayManager;
        this.f105457c = view;
        this.f105458d = view2;
        View findViewById = view.findViewById(R.id.bubble_extended_card);
        C147444h hVar = new C147444h(findViewById, View.SCALE_X);
        C147454r rVar = f105453j;
        hVar.f397996b = rVar;
        this.f105461g = hVar;
        C147444h hVar2 = new C147444h(findViewById, View.SCALE_Y);
        hVar2.f397996b = rVar;
        this.f105462h = hVar2;
        C147444h hVar3 = new C147444h(findViewById, View.TRANSLATION_X);
        C147454r rVar2 = f105454k;
        hVar3.f397996b = rVar2;
        this.f105459e = hVar3;
        C147444h hVar4 = new C147444h(findViewById, View.TRANSLATION_Y);
        hVar4.f397996b = rVar2;
        this.f105460f = hVar4;
        C147444h hVar5 = new C147444h(view.findViewById(R.id.bubble_extended_card_content), View.ALPHA);
        hVar5.mo124187m(0.0f, 1.0f);
        this.f105463i = hVar5;
    }
}
