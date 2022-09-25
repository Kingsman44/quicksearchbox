package com.google.android.libraries.gsa.p1859d.p1861b;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.WindowInsets;
import com.google.android.libraries.gsa.p1859d.C22785g;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.o */
/* compiled from: PG */
public final class C22769o extends C22754ad {

    /* renamed from: E */
    private final C22768n f62679E;

    /* renamed from: a */
    public final C22785g f62680a = new C22785g("OverlayPanelLayout", 40);

    public C22769o(C22768n nVar) {
        super(nVar);
        this.f62679E = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27959a(MotionEvent motionEvent, float f) {
        if (motionEvent.findPointerIndex(this.f62623n) != -1) {
            float x = motionEvent.getX() - this.f62617h;
            float abs = Math.abs(x);
            float abs2 = Math.abs(motionEvent.getY() - this.f62618i);
            if (Float.compare(abs, 0.0f) != 0) {
                float atan = (float) Math.atan((double) (abs2 / abs));
                boolean z = true;
                if (!this.f62616g ? x <= 0.0f : x >= 0.0f) {
                    z = false;
                }
                if (this.f62628s && !this.f62629t) {
                    if (!z) {
                        C22752ab abVar = this.f62626q;
                        if (abVar != null && abVar.mo27949f()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (atan <= 1.0471976f) {
                    if (atan > 0.5235988f) {
                        super.mo27959a(motionEvent, (((float) Math.sqrt((double) ((atan - 7.8112097f) / 0.5235988f))) * 4.0f) + 1.0f);
                    } else {
                        super.mo27959a(motionEvent, 1.0f);
                    }
                }
            }
        }
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if ((C58890d.m90990e(Build.MANUFACTURER, "samsung") && C58890d.m90990e(Build.DEVICE, "q2q")) || !this.f62679E.mo28030O()) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets rootWindowInsets = getRootWindowInsets();
        Rect rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
        this.f62680a.mo28121a("windowInsets ".concat(String.valueOf(String.valueOf(rootWindowInsets))));
        return super.dispatchApplyWindowInsets(getRootWindowInsets().replaceSystemWindowInsets(rect));
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        if (this.f62679E.f62674av) {
            return super.fitSystemWindows(rect);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C22768n nVar = this.f62679E;
        C58976aa aaVar = C58975e.f156826a;
        if (!nVar.f62677ay) {
            nVar.mo28040Z(nVar.f62654aA);
        }
    }
}
