package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.p10764h.C143316a;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.car.cq */
/* compiled from: PG */
public final /* synthetic */ class C143161cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143179df f388200a;

    /* renamed from: b */
    public final /* synthetic */ boolean f388201b;

    /* renamed from: c */
    public final /* synthetic */ int f388202c;

    /* renamed from: d */
    public final /* synthetic */ Rect f388203d;

    public /* synthetic */ C143161cq(C143179df dfVar, boolean z, int i, Rect rect) {
        this.f388200a = dfVar;
        this.f388201b = z;
        this.f388202c = i;
        this.f388203d = rect;
    }

    public final void run() {
        C143179df dfVar = this.f388200a;
        boolean z = this.f388201b;
        int i = this.f388202c;
        Rect rect = this.f388203d;
        if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s executeOnWindowFocusReached(hasFocus:%b, direction%d, focusedRect:%s)", dfVar.f388260h, Boolean.valueOf(z), Integer.valueOf(i), rect);
        }
        if (z) {
            dfVar.mo118156m(true);
            if (dfVar.f388273u) {
                if (rect != null) {
                    View decorView = dfVar.mo118143c().getDecorView();
                    if (decorView instanceof ViewGroup) {
                        decorView = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup) decorView, rect, i);
                    }
                    if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                        C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s safeRequestFocus(next:%s, direction:%s, focusedRect:%s)", dfVar.f388260h, decorView, C143200dq.m232322a(i), rect);
                    }
                    dfVar.mo118154k(decorView, i, rect);
                    dfVar.f388267o = true;
                    C143132bp bpVar = dfVar.f388243R;
                    View currentFocus = dfVar.getCurrentFocus();
                    int a = C143132bp.m232181a(i);
                    bpVar.f388190b.put(a, new C143130bn(currentFocus, a, SystemClock.elapsedRealtime()));
                    return;
                }
                dfVar.f388267o = false;
                dfVar.f388243R.f388190b.clear();
            }
            if (dfVar.f388261i) {
                dfVar.f388234I.f388223a.clear();
                dfVar.mo118154k((View) dfVar.f388234I.f388223a.get(), -1, (Rect) null);
                return;
            }
            dfVar.mo118153j();
            return;
        }
        if (dfVar.f388273u) {
            dfVar.f388267o = false;
        }
        if (dfVar.f388261i) {
            View currentFocus2 = dfVar.mo118143c().getCurrentFocus();
            dfVar.mo118160p(false);
            dfVar.f388234I.f388223a = new WeakReference(currentFocus2);
        }
    }
}
