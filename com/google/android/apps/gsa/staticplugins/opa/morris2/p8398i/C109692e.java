package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.view.DisplayCutout;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15113ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.e */
/* compiled from: PG */
final class C109692e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C109693f f305528a;

    public C109692e(C109693f fVar) {
        this.f305528a = fVar;
    }

    public final void onGlobalLayout() {
        C109693f fVar = this.f305528a;
        if (fVar.f305546e != null) {
            ViewGroup viewGroup = fVar.f305545d;
            viewGroup.getClass();
            WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
            if (rootWindowInsets != null) {
                DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                if (!(displayCutout == null || displayCutout.getBoundingRectBottom() == null)) {
                    C109693f fVar2 = this.f305528a;
                    if (fVar2.f305547f == 0) {
                        fVar2.f305547f = displayCutout.getBoundingRectBottom().height();
                        C58976aa aaVar = C58975e.f156826a;
                    }
                }
                ((C15113ag) this.f305528a.f305543b.mo17428b()).mo21987g(this.f305528a.mo98012b());
                int c = C15352z.m31951c(this.f305528a.f305542a);
                if (this.f305528a.f305548g != c) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C109693f fVar3 = this.f305528a;
                    if (fVar3.f305546e.f43850a == 3) {
                        fVar3.f305544c.mo21875g(C14745o.m31066i());
                    } else {
                        C109693f fVar4 = this.f305528a;
                        ((C15113ag) fVar3.f305543b.mo17428b()).mo21986f(fVar4.mo98011a(fVar4.f305546e), false);
                    }
                    this.f305528a.f305548g = c;
                }
            }
        }
    }
}
