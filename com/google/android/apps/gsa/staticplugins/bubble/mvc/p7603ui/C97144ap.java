package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97207b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97208c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ap */
/* compiled from: PG */
public final class C97144ap implements C97208c {

    /* renamed from: b */
    private static final C147454r f271439b = new C147454r(400.0f, 0.75f);

    /* renamed from: c */
    private static final C147454r f271440c = new C147454r(250.0f, 0.75f);

    /* renamed from: a */
    public final BubbleView f271441a;

    /* renamed from: d */
    private final Rect f271442d = new Rect();

    /* renamed from: e */
    private final Rect f271443e = new Rect();

    /* renamed from: f */
    private final WindowManager f271444f;

    /* renamed from: g */
    private final View f271445g;

    /* renamed from: h */
    private final C147444h f271446h;

    /* renamed from: i */
    private final C147444h f271447i;

    /* renamed from: j */
    private final C147444h f271448j;

    /* renamed from: k */
    private final int f271449k;

    /* renamed from: l */
    private int f271450l = 2;

    public C97144ap(Context context) {
        BubbleView bubbleView = (BubbleView) LayoutInflater.from(context).inflate(R.layout.trash_layout, (ViewGroup) null);
        this.f271441a = bubbleView;
        View findViewById = bubbleView.findViewById(R.id.dismiss_area);
        this.f271445g = findViewById;
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.f271444f = windowManager;
        C147444h hVar = new C147444h(findViewById, View.SCALE_X);
        C147454r rVar = f271439b;
        hVar.f397996b = rVar;
        this.f271447i = hVar;
        C147444h hVar2 = new C147444h(findViewById, View.SCALE_Y);
        hVar2.f397996b = rVar;
        this.f271446h = hVar2;
        C147444h hVar3 = new C147444h(findViewById, View.TRANSLATION_Y);
        hVar3.f397996b = f271440c;
        this.f271448j = hVar3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dismiss_area_diameter);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dismiss_area_bottom_margin);
        int i = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
        this.f271449k = i;
        hVar3.mo124186l((float) i);
        m160819h(2, false);
        bubbleView.setVisibility(4);
        WindowManager.LayoutParams a = C97044g.m160631a(-1, -1, 536);
        a.gravity = 80;
        windowManager.addView(bubbleView, a);
    }

    /* renamed from: a */
    public final C97207b mo90536a(View view) {
        C97219g.m160927c(this.f271445g, this.f271442d);
        C97219g.m160927c(view, this.f271443e);
        if (this.f271442d.intersect(this.f271443e)) {
            return C97207b.DROP;
        }
        return C97207b.NONE;
    }

    /* renamed from: b */
    public final void mo90537b(C97207b bVar) {
        if (bVar == C97207b.DROP) {
            m160819h(3, true);
        }
    }

    /* renamed from: c */
    public final void mo90538c() {
        m160819h(2, true);
    }

    /* renamed from: d */
    public final void mo90539d() {
        this.f271441a.mo90609a((C1967b) null);
        BubbleView bubbleView = this.f271441a;
        bubbleView.f271645a = null;
        this.f271444f.removeView(bubbleView);
    }

    /* renamed from: e */
    public final void mo90540e() {
        m160819h(1, true);
    }

    /* renamed from: f */
    public final void mo90541f(C1967b bVar) {
        this.f271441a.mo90609a(bVar);
    }

    /* renamed from: g */
    public final void mo90542g(Runnable runnable) {
        this.f271441a.f271645a = runnable;
    }

    /* renamed from: h */
    private final void m160819h(int i, boolean z) {
        if (i != this.f271450l) {
            int i2 = i - 1;
            if (i2 == 0) {
                this.f271441a.setVisibility(0);
            } else if (i2 == 1) {
                this.f271441a.postDelayed(new C97143ao(this), 300);
            }
            float f = 0.0f;
            float f2 = i2 != 0 ? i2 != 1 ? 1.33f : 0.0f : 1.0f;
            if (i2 == 1) {
                f = (float) this.f271449k;
            }
            if (z) {
                this.f271447i.mo124179e(f2);
                this.f271446h.mo124179e(f2);
                this.f271448j.mo124179e(f);
            } else {
                this.f271446h.mo124186l(f2);
                this.f271447i.mo124186l(f2);
                this.f271448j.mo124186l(f);
            }
            this.f271450l = i;
        }
    }
}
