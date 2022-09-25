package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1988h;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;
import com.google.android.material.snackbar.C44883n;

/* compiled from: PG */
public class SwipeDismissBehavior extends C1770c {

    /* renamed from: a */
    C2150h f115835a;

    /* renamed from: b */
    public int f115836b = 2;

    /* renamed from: c */
    float f115837c = 0.5f;

    /* renamed from: d */
    public float f115838d = 0.0f;

    /* renamed from: e */
    public float f115839e = 0.5f;

    /* renamed from: f */
    public C44883n f115840f;

    /* renamed from: g */
    private boolean f115841g;

    /* renamed from: h */
    private final C2149g f115842h = new C44542c(this);

    /* renamed from: t */
    public static float m78740t(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: f */
    public boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f115841g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo4928l(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f115841g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f115841g = false;
        }
        if (!z) {
            return false;
        }
        if (this.f115835a == null) {
            this.f115835a = C2150h.m5963b(coordinatorLayout, this.f115842h);
        }
        return this.f115835a.mo5412i(motionEvent);
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (C2043bi.m5575d(view) != 0) {
            return false;
        }
        C2043bi.m5551ae(view, 1);
        C2043bi.m5522P(view, 1048576);
        if (!mo47491s(view)) {
            return false;
        }
        C2043bi.m5523Q(view, C1988h.f5911i, (CharSequence) null, new C44543d(this));
        return false;
    }

    /* renamed from: k */
    public final boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C2150h hVar = this.f115835a;
        if (hVar == null) {
            return false;
        }
        hVar.mo5408e(motionEvent);
        return true;
    }

    /* renamed from: s */
    public boolean mo47491s(View view) {
        return true;
    }
}
