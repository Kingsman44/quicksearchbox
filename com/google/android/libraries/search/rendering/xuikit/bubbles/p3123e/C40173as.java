package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40129aa;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40223f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40252f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.as */
/* compiled from: PG */
public final class C40173as {

    /* renamed from: d */
    private static final C147454r f105532d = new C147454r(400.0f, 0.75f);

    /* renamed from: e */
    private static final C147454r f105533e = new C147454r(250.0f, 0.75f);

    /* renamed from: a */
    public final WindowManager f105534a;

    /* renamed from: b */
    public final BubbleView f105535b;

    /* renamed from: c */
    public final C40129aa f105536c = new C40129aa();

    /* renamed from: f */
    private final Rect f105537f = new Rect();

    /* renamed from: g */
    private final View f105538g;

    /* renamed from: h */
    private final C147444h f105539h;

    /* renamed from: i */
    private final C147444h f105540i;

    /* renamed from: j */
    private final C147444h f105541j;

    /* renamed from: k */
    private final int f105542k;

    /* renamed from: l */
    private int f105543l = 2;

    public C40173as(Context context) {
        BubbleView bubbleView = (BubbleView) LayoutInflater.from(context).inflate(R.layout.xblend_bubble_trash_layout, (ViewGroup) null);
        this.f105535b = bubbleView;
        View findViewById = bubbleView.findViewById(R.id.dismiss_area);
        this.f105538g = findViewById;
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.f105534a = windowManager;
        C147444h hVar = new C147444h(findViewById, View.SCALE_X);
        C147454r rVar = f105532d;
        hVar.f397996b = rVar;
        this.f105540i = hVar;
        C147444h hVar2 = new C147444h(findViewById, View.SCALE_Y);
        hVar2.f397996b = rVar;
        this.f105539h = hVar2;
        C147444h hVar3 = new C147444h(findViewById, View.TRANSLATION_Y);
        hVar3.f397996b = f105533e;
        this.f105541j = hVar3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dismiss_area_diameter);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dismiss_area_bottom_margin);
        int i = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
        this.f105542k = i;
        hVar3.mo124186l((float) i);
        mo42293b(2, false);
        bubbleView.mo42363d(4, true);
        WindowManager.LayoutParams a = C40175au.m69773a(-1, -1, 536);
        a.gravity = 80;
        windowManager.addView(bubbleView, a);
    }

    /* renamed from: a */
    public final C40223f mo42292a(View view) {
        C40252f.m69869c(this.f105538g, this.f105537f);
        Rect rect = new Rect();
        C40252f.m69869c(view, rect);
        if (this.f105537f.intersect(rect) || this.f105537f.contains(rect) || rect.contains(this.f105537f)) {
            return C40223f.DROP;
        }
        return C40223f.NONE;
    }

    /* renamed from: b */
    public final void mo42293b(int i, boolean z) {
        if (i != this.f105543l) {
            int i2 = i - 1;
            if (i2 == 0) {
                this.f105535b.mo42363d(0, true);
            } else if (i2 == 1) {
                this.f105536c.mo42219c(new C40172ar(this), Duration.ofMillis(300));
            }
            float f = 0.0f;
            float f2 = i2 != 0 ? i2 != 1 ? 1.33f : 0.0f : 1.0f;
            if (i2 == 1) {
                f = (float) this.f105542k;
            }
            if (z) {
                this.f105540i.mo124179e(f2);
                this.f105539h.mo124179e(f2);
                this.f105541j.mo124179e(f);
            } else {
                this.f105539h.mo124186l(f2);
                this.f105540i.mo124186l(f2);
                this.f105541j.mo124186l(f);
            }
            this.f105543l = i;
        }
    }
}
